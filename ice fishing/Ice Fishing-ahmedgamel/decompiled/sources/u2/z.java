package u2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2752Ra;
import com.google.android.gms.internal.ads.AbstractC3070dB;
import com.google.android.gms.internal.ads.InterfaceC3123eB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class z extends v2.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41322b = 0;

    public static void k(String str) {
        if (!m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        com.bumptech.glide.manager.p pVar = v2.i.f41417a;
        Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
        boolean z3 = true;
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3070dB.next();
            if (z3) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return v2.i.j(2) && ((Boolean) AbstractC2752Ra.f27286a.r()).booleanValue();
    }
}
