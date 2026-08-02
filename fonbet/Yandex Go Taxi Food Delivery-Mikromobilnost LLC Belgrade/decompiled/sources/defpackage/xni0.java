package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import com.yandex.go.promocodes.referral.impl.data.c;
import com.yandex.mapkit.ScreenRect;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes13.dex */
public final class xni0 extends ad5 {
    public final nni0 A;
    public boolean B;
    public ReferralService C;
    public String D;
    public ScreenRect E;
    public boolean F;
    public final r0 G;
    public final gci0 H;
    public final loi0 x;
    public final jni0 y;
    public final c z;

    public xni0(loi0 loi0Var, jni0 jni0Var, c cVar, nni0 nni0Var) {
        super(tni0.class);
        this.x = loi0Var;
        this.y = jni0Var;
        this.z = cVar;
        this.A = nni0Var;
        this.C = ReferralService.UNKNOWN;
        r0 c = bvf0.c(aoi0.c);
        this.G = c;
        this.H = e.d(c);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.F = false;
        if (this.B) {
            this.y.b(this.C);
        }
    }

    public final void Kg() {
        Screen b = this.z.a.b();
        Screen screen = Screen.SUMMARY;
        ReferralService referralService = this.C;
        jni0 jni0Var = this.y;
        if (b == screen) {
            xcv0 xcv0Var = jni0Var.b;
            String a = jni0.a(referralService);
            String str = ((a7t0) jni0Var.c).a().b;
            HashMap q = tse0.q(xcv0Var);
            if (a != null) {
                q.put(Constants.KEY_SERVICE, a);
            }
            if (str != null) {
                q.put("summary_state", str);
            }
            xcv0Var.a.a("Summary.DiscountButtonTapped", q, 1, new HashMap());
        } else {
            u8w u8wVar = jni0Var.a;
            String a2 = jni0.a(referralService);
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            if (a2 != null) {
                hashMap.put(Constants.KEY_SERVICE, a2);
            }
            u8wVar.a.a("Main.DiscountButtonTapped", hashMap, 1, new HashMap());
        }
        loi0 loi0Var = this.x;
        loi0Var.getClass();
        loi0Var.a.b(MainMenuProcessor$MenuEntry.REFERRAL, new w770());
    }

    public final void Lg(boolean z, Screen screen) {
        if (this.B != z) {
            ReferralService referralService = this.C;
            jni0 jni0Var = this.y;
            if (z) {
                u8w u8wVar = jni0Var.a;
                String a = jni0.a(referralService);
                u8wVar.getClass();
                HashMap hashMap = new HashMap();
                if (a != null) {
                    hashMap.put(Constants.KEY_SERVICE, a);
                }
                u8wVar.a.a("Main.DiscountButtonShown", hashMap, 1, new HashMap());
            } else {
                jni0Var.b(referralService);
            }
        }
        this.B = z;
        boolean z2 = this.F;
        Object obj = aoi0.c;
        if (!z2) {
            int i = vni0.a[screen.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && ((tni0) Dg()).Ag()) {
                            obj = new eoi0(z, this.E, this.D);
                        }
                    } else if (((tni0) Dg()).pf()) {
                        obj = new doi0(z, this.E, this.D);
                    }
                } else if (((tni0) Dg()).pf()) {
                    obj = new foi0(z, this.E, this.D);
                }
            } else if (((tni0) Dg()).fe()) {
                obj = new boi0(z, this.D);
            } else if (((tni0) Dg()).pf()) {
                obj = new coi0(z, this.E, this.D);
            }
        }
        r0 r0Var = this.G;
        r0Var.getClass();
        r0Var.m(null, obj);
    }
}
