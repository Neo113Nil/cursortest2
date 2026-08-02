package w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import r2.C4906k;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41706a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41707b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f41708c;

    public w(Context context) {
        this.f41708c = context;
    }

    public final void a() {
        C3324ha c3324ha = AbstractC3592ma.Ob;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            D d9 = C4906k.f40186C.f40191c;
            HashMap P8 = D.P((String) rVar.f40509c.a(AbstractC3592ma.Tb));
            for (String str : P8.keySet()) {
                synchronized (this) {
                    try {
                        HashMap hashMap = this.f41706a;
                        if (!hashMap.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f41708c) : this.f41708c.getSharedPreferences(str, 0);
                            SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(this, str);
                            hashMap.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v vVar = new v(P8);
            synchronized (this) {
                this.f41707b.add(vVar);
            }
        }
    }
}
