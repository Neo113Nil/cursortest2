package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ke2 {
    public final Object a;

    public ke2(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public synchronized void a() {
        try {
            long j = ((SharedPreferences) this.a).getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            ((SharedPreferences) this.a).edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        ((AutofillManager) this.a).commit();
    }

    public synchronized void c() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.a).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String e = e(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(e)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(e);
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

    public synchronized ArrayList d() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(e(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new hd2(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.a).edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String e(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public synchronized String f(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
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

    public void g(AndroidComposeView androidComposeView, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.a).notifyValueChanged(androidComposeView, i, autofillValue);
    }

    public void h(AndroidComposeView androidComposeView, int i, Rect rect) {
        ((AutofillManager) this.a).notifyViewEntered(androidComposeView, i, rect);
    }

    public void i(AndroidComposeView androidComposeView, int i) {
        ((AutofillManager) this.a).notifyViewExited(androidComposeView, i);
    }

    public void j(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            he2.a(view, (AutofillManager) this.a, i, z);
        }
    }

    public synchronized void k(String str) {
        try {
            String f = f(str);
            if (f == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(f, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = (SharedPreferences) this.a;
            if (isEmpty) {
                sharedPreferences.edit().remove(f).commit();
            } else {
                sharedPreferences.edit().putStringSet(f, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void l(AndroidComposeView androidComposeView, int i, Rect rect) {
        ((AutofillManager) this.a).requestAutofill(androidComposeView, i, rect);
    }

    public synchronized boolean m(long j) {
        boolean contains = ((SharedPreferences) this.a).contains("fire-global");
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        if (!contains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (e(j2).equals(e(j))) {
                return false;
            }
            ((SharedPreferences) this.a).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void n(long j, String str) {
        String e = e(j);
        if (((SharedPreferences) this.a).getString("last-used-date", "").equals(e)) {
            String f = f(e);
            if (f == null) {
                return;
            }
            if (f.equals(str)) {
                return;
            }
            p(str, e);
            return;
        }
        long j2 = ((SharedPreferences) this.a).getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            a();
            j2 = ((SharedPreferences) this.a).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(str, new HashSet()));
        hashSet.add(e);
        ((SharedPreferences) this.a).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", e).commit();
    }

    public AutofillId o() {
        return xq0.g(this.a);
    }

    public synchronized void p(String str, String str2) {
        k(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.a).edit().putStringSet(str, hashSet).commit();
    }

    public /* synthetic */ ke2(Object obj) {
        this.a = obj;
    }
}
