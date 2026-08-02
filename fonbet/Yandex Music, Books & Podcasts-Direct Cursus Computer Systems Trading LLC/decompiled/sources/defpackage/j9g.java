package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.Size;

/* loaded from: classes6.dex */
public final class j9g extends aur implements ryc {
    public final /* synthetic */ int j;
    public /* synthetic */ ue7 k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9g(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.j) {
            case 0:
                ((Boolean) obj3).getClass();
                j9g j9gVar = new j9g(4, 0, (Continuation) obj4);
                j9gVar.l = (paw) obj;
                j9gVar.k = (ue7) obj2;
                return j9gVar.invokeSuspend(Unit.a);
            case 1:
                ((Boolean) obj3).getClass();
                j9g j9gVar2 = new j9g(4, 1, (Continuation) obj4);
                j9gVar2.l = (imh) obj;
                j9gVar2.k = (ue7) obj2;
                return j9gVar2.invokeSuspend(Unit.a);
            default:
                ((Boolean) obj3).getClass();
                j9g j9gVar3 = new j9g(4, 2, (Continuation) obj4);
                j9gVar3.l = (mmq) obj;
                j9gVar3.k = (ue7) obj2;
                return j9gVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                paw pawVar = (paw) this.l;
                ue7 ue7Var = this.k;
                tf6 tf6Var = ue7Var.a;
                pawVar.getClass();
                ue7Var.n = pawVar;
                pawVar.w(ue7Var.g);
                iz7 iz7Var = ue7Var.e;
                if (iz7Var != null) {
                    iz7Var.n();
                }
                rar rarVar = ue7Var.f;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                iz7 iz7Var2 = new iz7();
                iz7Var2.a = tf6Var;
                yjj yjjVar = new yjj();
                iz7Var2.b = yjjVar;
                qi3 qi3Var = new qi3(yjjVar);
                ed6 ed6Var = new ed6(yjjVar);
                g4t g4tVar = new g4t(yjjVar);
                rk2 rk2Var = new rk2(yjjVar);
                lg7 lg7Var = new lg7(yjjVar);
                rqa rqaVar = new rqa(yjjVar);
                xra xraVar = new xra(yjjVar);
                fgg fggVar = new fgg(yjjVar);
                sgu sguVar = new sgu(yjjVar);
                ggb ggbVar = new ggb(yjjVar);
                xdr a = ydr.a(new qe7());
                iz7Var2.c = a;
                iz7Var2.d = new fkn(a);
                iz7Var2.j = new kr5(qi3Var, g4tVar, ggbVar);
                iz7Var2.k = new jr5(ed6Var, rk2Var, lg7Var, rqaVar, xraVar, fggVar, sguVar);
                Context context = ue7Var.b;
                iz7Var2.n();
                iz7Var2.e = pawVar;
                taw tawVar = new taw(iz7Var2);
                ((yjj) iz7Var2.b).a(tawVar);
                iz7Var2.g = tawVar;
                if (context != null) {
                    l2j s = l2j.d.s(context);
                    iz7Var2.h = s;
                    taw tawVar2 = (taw) iz7Var2.g;
                    if (tawVar2 != null) {
                        s.a(tawVar2);
                    }
                }
                zkp zkpVar = new zkp(pawVar);
                iz7Var2.i = zkpVar;
                pawVar.I((kr5) iz7Var2.j);
                pawVar.w((jr5) iz7Var2.k);
                pawVar.I(zkpVar);
                pawVar.w(zkpVar);
                ue7Var.e = iz7Var2;
                fkn fknVar = (fkn) iz7Var2.d;
                rar r0 = fknVar != null ? zsd.r0(tf6Var, new ub7(12, fknVar, new bv6(ue7Var, (Continuation) null, 19))) : null;
                ue7Var.f = r0;
                if (r0 != null) {
                    r0.R(new sv4(10, pawVar, ue7Var));
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                imh imhVar = (imh) this.l;
                ue7 ue7Var2 = this.k;
                ue7Var2.getClass();
                imhVar.getClass();
                ue7Var2.m = imhVar;
                xdr xdrVar = ue7Var2.d.c;
                LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).l);
                q.put(imhVar, Boolean.valueOf(true ^ ((eag) xdrVar.getValue()).a.contains(imhVar)));
                while (true) {
                    Object value = xdrVar.getValue();
                    LinkedHashMap linkedHashMap = q;
                    if (xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, 129023))) {
                        break;
                    } else {
                        q = linkedHashMap;
                    }
                }
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                mmq mmqVar = (mmq) this.l;
                ue7 ue7Var3 = this.k;
                int i = mmqVar.a;
                int i2 = mmqVar.b;
                xdr xdrVar2 = ue7Var3.h;
                Size size = ue7.p;
                if (i >= size.getWidth() && i2 >= size.getHeight()) {
                    z = false;
                }
                v3w.n(z, xdrVar2, null);
                break;
        }
        return Unit.a;
    }
}
