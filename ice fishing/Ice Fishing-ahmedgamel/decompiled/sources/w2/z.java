package w2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2772Ra;
import com.google.android.gms.internal.ads.AbstractC3093dB;
import com.google.android.gms.internal.ads.InterfaceC3146eB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class z extends x2.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41712b = 0;

    public static void k(String str) {
        if (!m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        com.bumptech.glide.manager.o oVar = x2.i.f41871a;
        Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
        boolean z6 = true;
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3093dB.next();
            if (z6) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return x2.i.j(2) && ((Boolean) AbstractC2772Ra.f27970a.r()).booleanValue();
    }
}
