package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f40943a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f40944b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f40945c;

    public z(Context context) {
        this.f40945c = context;
    }

    public final void a() {
        C3151ea c3151ea = AbstractC3368ia.Ob;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            G g9 = p2.j.f39798C.f39803c;
            HashMap P8 = G.P((String) rVar.f40119c.a(AbstractC3368ia.Tb));
            for (String str : P8.keySet()) {
                synchronized (this) {
                    try {
                        HashMap hashMap = this.f40943a;
                        if (!hashMap.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f40945c) : this.f40945c.getSharedPreferences(str, 0);
                            x xVar = new x(this, str);
                            hashMap.put(str, xVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(xVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            y yVar = new y(P8);
            synchronized (this) {
                this.f40944b.add(yVar);
            }
        }
    }
}
