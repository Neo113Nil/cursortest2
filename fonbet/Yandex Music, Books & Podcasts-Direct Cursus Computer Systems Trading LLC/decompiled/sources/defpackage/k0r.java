package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.music.widget.WidgetActionCallback;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0r implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0r(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sdr sdrVar;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hyf.h((w5t) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                i5r i5rVar = (i5r) this.b;
                ve1 ve1Var = (ve1) this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f = oq5Var.f(i5rVar) | oq5Var.f(ve1Var);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new w4r(i5rVar, ve1Var);
                        oq5Var.k0(K);
                    }
                    a4g.k((w4r) K, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                a4g.k((w4r) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                w4r w4rVar = (w4r) this.b;
                a5r a5rVar = (a5r) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                w4rVar.getClass();
                a5rVar.getClass();
                str.getClass();
                w4rVar.a.d.h(new d70(a5rVar.a, c70.f, a5rVar.b, 0, str), booleanValue);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                p6g.j((o7r) this.b, (Function0) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                vov vovVar = (vov) this.b;
                g9r g9rVar = (g9r) this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    p1g.j(g9rVar.b(), nt0.u(o5g.z(skd.a), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), vovVar.f, false, ild.C(1296491820, new f5r(2, vovVar), oq5Var2), oq5Var2, 24576);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 6:
                uov uovVar = (uov) this.b;
                g9r g9rVar2 = (g9r) this.c;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    p1g.j(g9rVar2.b(), nt0.u(o5g.z(skd.a), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), uovVar.b, false, ksw.i, oq5Var3, 24576);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                szf.q((vnr) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                a0g.r((por) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                cb0.p((ior) this.b, (sor) this.c, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 10:
                xsq xsqVar = (xsq) this.b;
                Function0 function0 = (Function0) this.c;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                pvo.a(xsqVar.c.a(), function0, hq5Var4, 0);
                return Unit.a;
            case 11:
                jsr jsrVar = (jsr) this.b;
                hie hieVar = (hie) this.c;
                String[] strArr = (String[]) obj;
                Function1 function1 = (Function1) obj2;
                strArr.getClass();
                function1.getClass();
                jsrVar.e.post(new r8(strArr, jsrVar, hieVar, function1, 13));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                our.c((sur) this.b, (Function1) this.c, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 13:
                wn5 wn5Var = (wn5) this.b;
                x6k x6kVar = (x6k) this.c;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(x6kVar, hq5Var5, 0);
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                gdg.f((u9b) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                ezf.o((vki) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                szf.u((CharSequence) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                lls llsVar = (lls) this.b;
                nls nlsVar = (nls) this.c;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                wn5 wn5Var2 = llsVar.g;
                if (wn5Var2 != null) {
                    wn5Var2.invoke(nlsVar, hq5Var6, 0);
                    return Unit.a;
                }
                Intrinsics.j("toast");
                throw null;
            case 18:
                wn5 wn5Var3 = (wn5) this.b;
                nls nlsVar2 = (nls) this.c;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                wn5Var3.invoke(nlsVar2, hq5Var7, 0);
                return Unit.a;
            case 19:
                mqs mqsVar = (mqs) this.b;
                String str2 = (String) this.c;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                String N = xee.N(mqsVar.e, hq5Var8);
                ges i = nu0.i();
                oq5 oq5Var9 = (oq5) hq5Var8;
                long j = ((dq0) oq5Var9.j(eq0.a)).b.b;
                yci d = d.d(vci.a, 1.0f);
                boolean f2 = oq5Var9.f(N);
                Object K2 = oq5Var9.K();
                if (f2 || K2 == gq5.a) {
                    K2 = new srp(N, 10);
                    oq5Var9.k0(K2);
                }
                xv7.j(str2, a.a(nfp.b(d, false, (Function1) K2), "track_bottom_sheet_dialog_header_subtitle"), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, i, oq5Var9, 0, 3120, 55288);
                return Unit.a;
            case 20:
                xbb xbbVar = (xbb) this.b;
                mqs mqsVar2 = (mqs) this.c;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                bg3.a(null, null, false, ild.C(703018418, new f6p(13, xbbVar, mqsVar2), hq5Var9), hq5Var9, 3072, 7);
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                p1g.r((qo6) this.b, (wn5) this.c, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                p1g.t((qo6) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                bzf.r((d9g) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                y1g.r((x2u) this.b, (bci) this.c, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 25:
                a3u a3uVar = (a3u) this.b;
                Function0 function02 = (Function0) this.c;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var10;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                v3g.r(a3uVar, function02, null, hq5Var10, 8);
                return Unit.a;
            case 26:
                sdr sdrVar2 = (sdr) this.b;
                Function0 function03 = (Function0) this.c;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var11;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                yci o = androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 16, 0.0f, 2);
                oq5 oq5Var13 = (oq5) hq5Var11;
                boolean f3 = oq5Var13.f(sdrVar2);
                Object K3 = oq5Var13.K();
                if (f3 || K3 == gq5.a) {
                    K3 = new f6u(sdrVar2, 5);
                    oq5Var13.k0(K3);
                }
                hdg.n(384, 0, up6.j, oq5Var13, wyf.s(o, (Function0) K3), function03);
                return Unit.a;
            case 27:
                xpu xpuVar = (xpu) this.b;
                Function0 function04 = (Function0) this.c;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var12;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                boolean z = xpuVar.c;
                kjn kjnVar = gq5.a;
                if (z) {
                    oq5 oq5Var15 = (oq5) hq5Var12;
                    oq5Var15.Z(-1119329929);
                    sdrVar = pm0.f(oq5Var15);
                    oq5Var15.p(false);
                } else {
                    oq5 oq5Var16 = (oq5) hq5Var12;
                    oq5Var16.Z(-1119269014);
                    Object K4 = oq5Var16.K();
                    if (K4 == kjnVar) {
                        K4 = tlm.h(1.0f, oq5Var16);
                    }
                    sdrVar = (poi) K4;
                    oq5Var16.p(false);
                }
                yci o2 = androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 16, 0.0f, 2);
                oq5 oq5Var17 = (oq5) hq5Var12;
                boolean f4 = oq5Var17.f(sdrVar);
                Object K5 = oq5Var17.K();
                if (f4 || K5 == kjnVar) {
                    K5 = new f6u(sdrVar, 6);
                    oq5Var17.k0(K5);
                }
                hdg.n(384, 0, x97.g, oq5Var17, wyf.s(o2, (Function0) K5), function04);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                hag.i((nru) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ywf.i((ltu) this.b, (wn5) this.c, (hq5) obj, rvf.R(49));
                return Unit.a;
        }
    }

    public /* synthetic */ k0r(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
