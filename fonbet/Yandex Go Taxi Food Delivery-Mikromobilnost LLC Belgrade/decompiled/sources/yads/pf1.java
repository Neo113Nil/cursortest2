package yads;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.bk81;
import defpackage.hx71;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oq81;
import defpackage.xt71;
import defpackage.zq71;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.a;

/* loaded from: classes7.dex */
public final class pf1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final oq81 b;
    public final Context c;
    public final i3y d;
    public final LinkedHashSet e;

    public pf1(Context context, String str) {
        oq81 oq81Var = new oq81();
        this.a = str;
        this.b = oq81Var;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.d = a.a(new of1(this));
        this.e = new LinkedHashSet();
    }

    public final int a(int i, String str) {
        ((SharedPreferences) this.d.getValue()).contains(str);
        return ((SharedPreferences) this.d.getValue()).getInt(str, i);
    }

    public final void b(String str, boolean z) {
        ((SharedPreferences) this.d.getValue()).edit().putBoolean(str, z).apply();
    }

    public final String c(String str) {
        return ((SharedPreferences) this.d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        fw fwVar;
        fw fwVar2;
        if (str != null) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                zq71 zq71Var = (zq71) ((WeakReference) it.next()).get();
                if (zq71Var != null) {
                    synchronized (zq71.g) {
                        try {
                            bk81 bk81Var = null;
                            String str2 = a(str) ? str : null;
                            if (str2 != null) {
                                fw.d.getClass();
                                fw[] values = fw.values();
                                int length = values.length;
                                for (int i = 0; i < length; i++) {
                                    fwVar = values[i];
                                    if (jl40.l(fwVar.c, str2)) {
                                        break;
                                    }
                                }
                            }
                            fwVar = null;
                            bk81 a = fwVar != null ? hx71.a(this, fwVar) : null;
                            if (a == null) {
                                String str3 = a(str) ? str : null;
                                if (str3 != null) {
                                    fw.d.getClass();
                                    fw[] values2 = fw.values();
                                    int length2 = values2.length;
                                    for (int i2 = 0; i2 < length2; i2++) {
                                        fwVar2 = values2[i2];
                                        if (jl40.l(fwVar2.b, str3)) {
                                            break;
                                        }
                                    }
                                }
                                fwVar2 = null;
                                if (fwVar2 != null) {
                                    bk81Var = xt71.a(this, fwVar2);
                                }
                            } else {
                                bk81Var = a;
                            }
                            if (bk81Var != null) {
                                zq71Var.a(bk81Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final long b(String str) {
        return ((SharedPreferences) this.d.getValue()).getLong(str, 0L);
    }

    public final void b(int i, String str) {
        ((SharedPreferences) this.d.getValue()).edit().putInt(str, i).apply();
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.d.getValue()).contains(str);
    }

    public final boolean a(String str, boolean z) {
        return ((SharedPreferences) this.d.getValue()).getBoolean(str, z);
    }

    public final void a() {
        ((SharedPreferences) this.d.getValue()).edit().clear().apply();
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j) {
        ((SharedPreferences) this.d.getValue()).edit().putLong(str, j).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.d.getValue()).edit().putStringSet(str, hashSet).apply();
    }
}
