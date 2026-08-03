package d8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1825a;

    public v(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f1825a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public synchronized void a() {
        try {
            long j3 = this.f1825a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f1825a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f1825a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f1825a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f1825a.edit();
            int i10 = 0;
            for (Map.Entry<String, ?> entry : this.f1825a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d10 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d10)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d10);
                        i10++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i10 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i10);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f1825a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new u7.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f1825a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String d(long j3) {
        return new Date(j3).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f1825a.getAll().entrySet()) {
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

    public synchronized void f(String str) {
        try {
            String e10 = e(str);
            if (e10 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f1825a.getStringSet(e10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f1825a.edit().remove(e10).commit();
            } else {
                this.f1825a.edit().putStringSet(e10, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean g(long j3) {
        if (!this.f1825a.contains("fire-global")) {
            this.f1825a.edit().putLong("fire-global", j3).commit();
            return true;
        }
        long j6 = this.f1825a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j6).equals(d(j3))) {
                return false;
            }
            this.f1825a.edit().putLong("fire-global", j3).commit();
            return true;
        }
    }

    public synchronized void h(long j3, String str) {
        String d10 = d(j3);
        if (this.f1825a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            i(str, d10);
            return;
        }
        long j6 = this.f1825a.getLong("fire-count", 0L);
        if (j6 + 1 == 30) {
            a();
            j6 = this.f1825a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f1825a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f1825a.edit().putStringSet(str, hashSet).putLong("fire-count", j6 + 1).putString("last-used-date", d10).commit();
    }

    public synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f1825a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f1825a.edit().putStringSet(str, hashSet).commit();
    }

    public v(Context context, String str) {
        this.f1825a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
