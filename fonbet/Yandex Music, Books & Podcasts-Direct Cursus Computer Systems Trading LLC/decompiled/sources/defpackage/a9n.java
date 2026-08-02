package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class a9n extends aur implements Function2 {
    public String j;
    public fkg k;
    public int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ b9n o;
    public final /* synthetic */ gxc p;
    public final /* synthetic */ o4q q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9n(boolean z, String str, b9n b9nVar, gxc gxcVar, o4q o4qVar, Continuation continuation) {
        super(2, continuation);
        this.m = z;
        this.n = str;
        this.o = b9nVar;
        this.p = gxcVar;
        this.q = o4qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a9n(this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a9n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r15 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0042, code lost:
    
        if (r15 == r0) goto L20;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        fkg fkgVar;
        p4q p4qVar;
        bou bouVar;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        b9n b9nVar = this.o;
        String str2 = this.n;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            str = this.m ? str2 : null;
            fkgVar = b9nVar.d;
            pjc g = b9nVar.c.g();
            this.j = str;
            this.k = fkgVar;
            this.l = 1;
            obj = zsd.g0(g, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yku ykuVar = (yku) obj;
                if (ykuVar == null) {
                    b9nVar.e.a.a().getClass();
                    jyr jyrVar = dvu.e;
                    ykuVar = (kwl.d() && c.v(str2, "offline_wave", false) && (bouVar = (bou) b9nVar.b.getValue()) != null) ? bouVar.a() : null;
                    if (ykuVar == null) {
                        return null;
                    }
                }
                unu unuVar = new unu(ykuVar.a, str2);
                v4q v4qVar = new v4q(new q3r("default"), ykuVar.b, this.p);
                s4v s4vVar = new s4v(ykuVar.c, ykuVar.d);
                int ordinal = ykuVar.e.ordinal();
                if (ordinal == 0) {
                    p4qVar = p4q.a;
                } else if (ordinal == 1) {
                    p4qVar = p4q.b;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    p4qVar = p4q.c;
                }
                return new w4q(unuVar, v4qVar, s4vVar, this.q, p4qVar, null);
            }
            fkgVar = this.k;
            str = this.j;
            qgg.h0(obj);
        }
        fkg fkgVar2 = fkgVar;
        String str3 = str;
        String str4 = ((xxq) obj).a;
        this.j = null;
        this.k = null;
        this.l = 2;
        fkgVar2.getClass();
        obj = x97.V(dm6.b, new y7b(fkgVar2, str4, str3, continuation, 4), this);
    }
}
