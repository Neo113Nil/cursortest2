package u2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p2.C4835j;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41316a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41317b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f41318c;

    public w(Context context) {
        this.f41318c = context;
    }

    public final void a() {
        C3301ha c3301ha = AbstractC3569ma.Ob;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            D d2 = C4835j.f39733C.f39738c;
            HashMap P8 = D.P((String) rVar.f40210c.a(AbstractC3569ma.Tb));
            for (String str : P8.keySet()) {
                synchronized (this) {
                    try {
                        HashMap hashMap = this.f41316a;
                        if (!hashMap.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f41318c) : this.f41318c.getSharedPreferences(str, 0);
                            SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(this, str);
                            hashMap.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v vVar = new v(P8);
            synchronized (this) {
                this.f41317b.add(vVar);
            }
        }
    }
}
