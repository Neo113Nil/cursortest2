package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.music.widget.WidgetActionCallback;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class don implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ con b;
    public final /* synthetic */ vov c;

    public /* synthetic */ don(con conVar, vov vovVar) {
        this.a = 1;
        this.b = conVar;
        this.c = vovVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    vov vovVar = this.c;
                    plv plvVar = vovVar.f;
                    con conVar = this.b;
                    p1g.j(conVar.b(), nt0.u(o2g.j0(conVar.g), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), plvVar, false, ild.C(-1488603032, new don(vovVar, conVar, 3), oq5Var), oq5Var, 24576);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                vov vovVar2 = this.c;
                plv plvVar2 = vovVar2.f;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    con conVar2 = this.b;
                    boolean z = conVar2.r;
                    long j = conVar2.o;
                    skd skdVar = skd.a;
                    kjn kjnVar = gq5.a;
                    if (z || vovVar2.c.length() <= 0) {
                        oq5Var2.Z(391987985);
                        String str = vovVar2.b;
                        jzb jzbVar = vovVar2.d;
                        Object K = oq5Var2.K();
                        if (K == kjnVar) {
                            K = new kin(5);
                            oq5Var2.k0(K);
                        }
                        o2g.o(str, jzbVar, zdg.E(skdVar, (Function1) K), new kes(j), plvVar2, oq5Var2, 0);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(391573019);
                        String str2 = vovVar2.b;
                        String str3 = vovVar2.c;
                        jzb jzbVar2 = vovVar2.d;
                        Object K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                            K2 = new kin(4);
                            oq5Var2.k0(K2);
                        }
                        o2g.p(str2, str3, jzbVar2, zdg.E(skdVar, (Function1) K2), new kes(j), plvVar2, oq5Var2, 0);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    vov vovVar3 = this.c;
                    plv plvVar3 = vovVar3.f;
                    String str4 = vovVar3.c;
                    con conVar3 = this.b;
                    long j2 = conVar3.m;
                    ukd A = ngg.A(skd.a, 0.0f, fma.c(conVar3.t), 0.0f, 11);
                    Object K3 = oq5Var3.K();
                    if (K3 == gq5.a) {
                        K3 = new kin(6);
                        oq5Var3.k0(K3);
                    }
                    o2g.m(str4, zdg.E(A, (Function1) K3), new kes(j2), plvVar3, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vov vovVar4 = this.c;
                    Bitmap bitmap = vovVar4.a;
                    if (bitmap == null) {
                        oq5Var4.Z(-1435546131);
                    } else {
                        oq5Var4.Z(-1435546130);
                        Context context = (Context) oq5Var4.j(cs5.b);
                        n33 n33Var = new n33(bitmap);
                        ukd j0 = o2g.j0(this.b.g);
                        boolean h = oq5Var4.h(vovVar4) | oq5Var4.h(context);
                        Object K4 = oq5Var4.K();
                        if (h || K4 == gq5.a) {
                            K4 = new fon(vovVar4, context, 0);
                            oq5Var4.k0(K4);
                        }
                        saf.o(n33Var, zdg.E(j0, (Function1) K4), 0, null, oq5Var4, 48, 24);
                    }
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ don(vov vovVar, con conVar, int i) {
        this.a = i;
        this.c = vovVar;
        this.b = conVar;
    }
}
