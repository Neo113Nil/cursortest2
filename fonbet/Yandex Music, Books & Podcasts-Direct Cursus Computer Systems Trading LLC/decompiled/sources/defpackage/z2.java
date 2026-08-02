package defpackage;

import android.content.Context;
import com.yandex.music.widget.WidgetActionCallback;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z2(sd3 sd3Var, Function0 function0, int i) {
        this.a = 9;
        this.d = sd3Var;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                q6k.a((l3) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x97.a((am) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pm0.a((Function2) this.d, (Function2) this.b, (hq5) obj, rvf.R(49), this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                pm0.d((yci) this.b, (ges) this.d, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xv.u((ma5) this.d, (wn5) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                men.f((b91) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                yd5.c((ug1) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                saf.f((sp1) this.d, (nii) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 8:
                wnv wnvVar = (wnv) this.d;
                plv plvVar = (plv) this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    if (wnvVar != null) {
                        oq5Var.Z(-544372865);
                        Context context = (Context) oq5Var.j(cs5.b);
                        ukd u = nt0.u(o5g.z(skd.a), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.a), new lg(WidgetActionCallback.c, wnvVar.b), new lg(WidgetActionCallback.d, Integer.valueOf(this.c))}, 3))));
                        boolean h = oq5Var.h(wnvVar) | oq5Var.h(context);
                        Object K = oq5Var.K();
                        if (h || K == gq5.a) {
                            K = new ny2(1, wnvVar, context);
                            oq5Var.k0(K);
                        }
                        vq2.c(zdg.E(u, (Function1) K), null, ild.C(1620390853, new m32(6, wnvVar, plvVar), oq5Var), oq5Var, 384, 2);
                    } else {
                        oq5Var.Z(-550491676);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                pd.a((sd3) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                pd.r((wd3) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 11:
                b04 b04Var = (b04) this.d;
                so1 so1Var = (so1) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                b04Var.c(so1Var.a, this.c, booleanValue, str);
                break;
            case 12:
                ((Integer) obj2).intValue();
                x97.d((List) this.d, (u44) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 13:
                eg4 eg4Var = (eg4) this.d;
                hg4 hg4Var = (hg4) this.b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                mqs mqsVar = hg4Var.a;
                mqsVar.getClass();
                eg4Var.a.e.h(new d70(mqsVar.d().e(), c70.g, mqsVar.c, this.c, str2), booleanValue2);
                break;
            case 14:
                ip4 ip4Var = (ip4) this.d;
                z9u z9uVar = (z9u) this.b;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                ip4Var.getClass();
                z9uVar.getClass();
                rmb rmbVar = ip4Var.c;
                pkb pkbVar = pkb.Video;
                String str4 = z9uVar.b;
                str4.getClass();
                weo.H(rmbVar, new thj(pkbVar, str4, this.c + 1, 1, ""), booleanValue3, str3, null);
                break;
            case 15:
                ((Integer) obj2).getClass();
                qt4.b((p9) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                vwb.x((yci) this.b, (xxk) this.d, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                wdp.M((v25) this.d, (tmb) this.b, this.c, (hq5) obj, rvf.R(65));
                break;
            case 18:
                ((Integer) obj2).getClass();
                u2x.b((pw5) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                zsd.k((qy5) this.d, (gy5) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                xv.s((wv5) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                up6.l((y26) this.d, (d36) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 22:
                e36 e36Var = (e36) this.d;
                y26 y26Var = (y26) this.b;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str5 = (String) obj2;
                str5.getClass();
                y26Var.g(booleanValue4, this.c, str5, ((c36) e36Var).a.a);
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((ik6) this.d).b(this.c, this.b, (hq5) obj, rvf.R(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                h4a.h((ace) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                cxb.f((s48) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 26:
                a8a a8aVar = (a8a) this.d;
                m7a m7aVar = (m7a) this.b;
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                String str6 = (String) obj2;
                str6.getClass();
                a8aVar.getClass();
                m7aVar.getClass();
                weo.H(a8aVar.a, vnj.j(m7aVar, this.c, 0), booleanValue5, str6, null);
                break;
            case 27:
                ((Integer) obj2).getClass();
                zsd.m((uja) this.d, (rja) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                zsd.q((tja) this.d, (rja) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tua.a((zwa) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z2(int i, int i2, yci yciVar, Object obj) {
        this.a = i2;
        this.b = yciVar;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ z2(wd3 wd3Var, Function0 function0, int i) {
        this.a = 10;
        this.d = wd3Var;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ z2(v25 v25Var, tmb tmbVar, int i, int i2) {
        this.a = 17;
        this.d = v25Var;
        this.b = tmbVar;
        this.c = i;
    }

    public /* synthetic */ z2(qy5 qy5Var, gy5 gy5Var, int i) {
        this.a = 19;
        this.d = qy5Var;
        this.b = gy5Var;
        this.c = i;
    }

    public /* synthetic */ z2(ik6 ik6Var, int i, Object obj, int i2) {
        this.a = 23;
        this.d = ik6Var;
        this.c = i;
        this.b = obj;
    }

    public /* synthetic */ z2(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.b = obj2;
    }

    public /* synthetic */ z2(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    public /* synthetic */ z2(Function2 function2, Function2 function22, int i, int i2) {
        this.a = 2;
        this.d = function2;
        this.b = function22;
        this.c = i2;
    }
}
