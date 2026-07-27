package a4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4349a;

    public h(Context context, String str) {
        this.f4349a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j6 = this.f4349a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f4349a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f4349a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f4349a.edit().putStringSet(str, hashSet).putLong("fire-count", j6 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f4349a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f4349a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d2 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f4349a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C0433a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f4349a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j6) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j6));
        }
        instant = new Date(j6).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f4349a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String e9 = e(str);
            if (e9 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f4349a.getStringSet(e9, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f4349a.edit().remove(e9).commit();
            } else {
                this.f4349a.edit().putStringSet(e9, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j6) {
        if (!this.f4349a.contains("fire-global")) {
            this.f4349a.edit().putLong("fire-global", j6).commit();
            return true;
        }
        long j9 = this.f4349a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j9).equals(d(j6))) {
                return false;
            }
            this.f4349a.edit().putLong("fire-global", j6).commit();
            return true;
        }
    }

    public final synchronized void h(String str, long j6) {
        String d2 = d(j6);
        if (this.f4349a.getString("last-used-date", "").equals(d2)) {
            String e9 = e(d2);
            if (e9 == null) {
                return;
            }
            if (e9.equals(str)) {
                return;
            }
            i(str, d2);
            return;
        }
        long j9 = this.f4349a.getLong("fire-count", 0L);
        if (j9 + 1 == 30) {
            a();
            j9 = this.f4349a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f4349a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.f4349a.edit().putStringSet(str, hashSet).putLong("fire-count", j9 + 1).putString("last-used-date", d2).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f4349a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f4349a.edit().putStringSet(str, hashSet).commit();
    }
}
