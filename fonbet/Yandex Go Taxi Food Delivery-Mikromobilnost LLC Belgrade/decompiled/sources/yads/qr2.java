package yads;

import android.content.Context;
import defpackage.a271;
import defpackage.bg81;
import defpackage.c171;
import defpackage.df71;
import defpackage.e971;
import defpackage.ecq0;
import defpackage.fc71;
import defpackage.fw81;
import defpackage.g6u;
import defpackage.ge71;
import defpackage.hn71;
import defpackage.ij81;
import defpackage.in61;
import defpackage.j73;
import defpackage.jd81;
import defpackage.k171;
import defpackage.mj31;
import defpackage.no61;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ou71;
import defpackage.oy61;
import defpackage.p671;
import defpackage.rzo;
import defpackage.sjh;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tl7;
import defpackage.tse;
import defpackage.u981;
import defpackage.uyj;
import defpackage.v771;
import defpackage.vi71;
import defpackage.wls;
import defpackage.wt71;
import defpackage.y381;
import defpackage.yc81;
import defpackage.z271;
import defpackage.zj71;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.c;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes7.dex */
public final class qr2 extends SuspendLambda implements wls {
    public f5 b;
    public u981 c;
    public ij81 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u981 g;
    public final /* synthetic */ ij81 h;
    public final /* synthetic */ k171 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(u981 u981Var, ij81 ij81Var, k171 k171Var, Continuation continuation) {
        super(2, continuation);
        this.g = u981Var;
        this.h = ij81Var;
        this.i = k171Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        qr2 qr2Var = new qr2(this.g, this.h, this.i, continuation);
        qr2Var.f = obj;
        return qr2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((qr2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01da, code lost:
    
        if (defpackage.tje.k0(r2, r3, r23) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0252, code lost:
    
        if (defpackage.tje.k0(r2, r3, r23) == r1) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e971 e971Var;
        ij81 ij81Var;
        Object e;
        u981 u981Var;
        f5 f5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.f;
            u981 u981Var2 = this.g;
            u981Var2.g.b(kc1.b, u981Var2);
            u981 u981Var3 = this.g;
            e971Var = u981Var3.c;
            f5 f5Var2 = f5.C;
            ij81Var = this.h;
            e971Var.b(f5Var2, null);
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            tig0 K = tje.N(tseVar, null, null, new mr2(2, null), 3).K();
            bVar.j(new ecq0(bVar, (c) K.a, (zls) K.b, tl7.c, rzo.k, new nr2(1, null), null), false);
            bVar.h(tje.h(tseVar, null, null, new or2(u981Var3, null), 3).H(), new pr2(2, null));
            this.f = e971Var;
            this.b = f5Var2;
            this.c = u981Var3;
            this.d = ij81Var;
            this.e = 1;
            e = bVar.e(this);
            if (e != coroutineSingletons) {
                u981Var = u981Var3;
                f5Var = f5Var2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            u981 u981Var4 = this.g;
            u981Var4.g.a(kc1.b, u981Var4);
            return zy11.a;
        }
        ij81 ij81Var2 = this.d;
        u981Var = this.c;
        f5Var = this.b;
        e971Var = (e971) this.f;
        b.b(obj);
        ij81Var = ij81Var2;
        e = obj;
        sr2 sr2Var = (sr2) e;
        vi71 vi71Var = u981Var.h;
        Context context = u981Var.b;
        p671 p671Var = u981Var.e;
        c171 c171Var = u981Var.d.a;
        e971 e971Var2 = (e971) vi71Var.b;
        f5 f5Var3 = f5.D;
        e971Var2.b(f5Var3, null);
        mj31 mj31Var = new mj31(p671Var, c171Var);
        String c = wt71.a(context).a.c("SessionData");
        new ou71();
        String a = ou71.a();
        fw81 fw81Var = (fw81) vi71Var.c;
        new yc81();
        in61 b = oy61.b(context, fw81Var, mj31Var, new y381(context));
        xz xzVar = ij81Var != null ? ij81Var.a : null;
        if (xzVar != null) {
            b.v = xzVar.b;
        }
        a271 a271Var = ij81Var != null ? ij81Var.b : null;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            b.y = jd81Var.a.b;
            b.w = Integer.valueOf(jd81Var.b(context));
            b.x = Integer.valueOf(jd81Var.a(context));
        }
        b.E0 = c;
        b.D0 = a;
        b.H0 = sr2Var != null ? sr2Var.b : null;
        Map map = ij81Var != null ? ij81Var.c : null;
        if (map != null) {
            b.h.putAll(map);
        }
        String v771Var = new v771(b).toString();
        ((df71) vi71Var.w).getClass();
        String a2 = df71.a(context, v771Var);
        e971Var2.a(f5Var3);
        z271 z271Var = new z271(a2, sr2Var);
        e971Var.a(f5Var);
        u981 u981Var5 = this.g;
        if (a2 != null) {
            vi71 vi71Var2 = u981Var5.i;
            ij81 ij81Var3 = this.h;
            ((bg81) vi71Var2.c).getClass();
            hn71 a3 = bg81.a(ij81Var3);
            a3.r("success", ACSPConstants.STATUS);
            a3.r(((fc71) vi71Var2.w).a.a(j73.f0(new f5[]{f5.i, f5.k, f5.j, f5.l, f5.m, f5.C, f5Var3, f5.E})), "durations");
            a3.j(sr2Var != null ? sr2Var.b : null, "stub_reason");
            ((ge71) vi71Var2.b).c(new zj71("open_bidding_token_generation_result", new LinkedHashMap((Map) a3.b), (no61) a3.c));
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            kr2 kr2Var = new kr2(this.i, z271Var, null);
            this.f = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
        } else {
            vi71 vi71Var3 = u981Var5.i;
            ij81 ij81Var4 = this.h;
            ((bg81) vi71Var3.c).getClass();
            hn71 a4 = bg81.a(ij81Var4);
            a4.r("error", ACSPConstants.STATUS);
            a4.r("Cannot load bidder token. Token generation failed", "failure_reason");
            a4.r(((fc71) vi71Var3.w).a.a(j73.f0(new f5[]{f5.i, f5.k, f5.j, f5.l, f5.m, f5.C, f5Var3, f5.E})), "durations");
            ((ge71) vi71Var3.b).c(new zj71("open_bidding_token_generation_result", new LinkedHashMap((Map) a4.b), (no61) a4.c));
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a.x;
            lr2 lr2Var = new lr2(this.i, null);
            this.f = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 3;
        }
    }
}
