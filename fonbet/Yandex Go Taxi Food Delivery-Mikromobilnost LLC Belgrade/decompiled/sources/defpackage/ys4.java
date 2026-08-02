package defpackage;

import com.yandex.go.logistics.cargo_flow.form.a;
import java.util.ArrayList;
import ru.yandex.logistics.sdk.webview.impl.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class ys4 implements zni {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ czh b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ys4(yvi yviVar, svi sviVar, yzh yzhVar, czh czhVar, vvi vviVar) {
        this.c = yviVar;
        this.w = sviVar;
        this.x = yzhVar;
        this.b = czhVar;
        this.y = vviVar;
    }

    @Override // defpackage.zni
    public final xni create() {
        int i = this.a;
        Object obj = this.y;
        czh czhVar = this.b;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                h0w h0wVar = (h0w) obj4;
                qcp0 qcp0Var = (qcp0) h0wVar.b;
                ss4 ss4Var = (ss4) h0wVar.c;
                rs4 rs4Var = new rs4((ArrayList) obj3);
                zs4 zs4Var = new zs4((vr4) obj2, (vr4) obj, czhVar);
                qcp0Var.getClass();
                return new aoi(ss4Var, rs4Var, zs4Var);
            default:
                svi sviVar = (svi) obj3;
                qnh qnhVar = ((yvi) obj4).b;
                xvi xviVar = new xvi(czhVar, (vvi) obj);
                v920 v920Var = (v920) qnhVar.a;
                v920Var.getClass();
                n3w a = n3w.a(new et41(gt41.a));
                ywf ywfVar = new ywf(3, v920Var);
                q5z.h((qcp0) v920Var.a);
                y30 y30Var = (y30) v920Var.y;
                q5z.h(y30Var);
                ofg ofgVar = (ofg) v920Var.b;
                q5z.h(ofgVar);
                st2 st2Var = (st2) v920Var.c;
                q5z.h(st2Var);
                eg01 eg01Var = new eg01(ofgVar, st2Var);
                ku41 ku41Var = new ku41();
                hdu hduVar = new hdu(new dj3(i5m.a(ywfVar)), ofgVar);
                a aVar = (a) ((yzh) obj2).a;
                et41 et41Var = (et41) a.a;
                yuj0 yuj0Var = (yuj0) v920Var.x;
                q5z.h(yuj0Var);
                return new aoi(new xjg(y30Var, new b(sviVar, xviVar, eg01Var, ku41Var, hduVar, aVar, et41Var, yuj0Var), false, 16), sviVar, xviVar);
        }
    }

    public /* synthetic */ ys4(h0w h0wVar, ArrayList arrayList, vr4 vr4Var, vr4 vr4Var2, czh czhVar) {
        this.c = h0wVar;
        this.w = arrayList;
        this.x = vr4Var;
        this.y = vr4Var2;
        this.b = czhVar;
    }
}
