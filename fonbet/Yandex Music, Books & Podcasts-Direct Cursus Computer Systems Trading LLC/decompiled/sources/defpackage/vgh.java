package defpackage;

import com.yandex.music.shared.media.session.common.state.source_info.Media3RatingScopedCache$Media3RatingCancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vgh extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kpm m;
    public final /* synthetic */ ime n;
    public final /* synthetic */ rn5 o;
    public rjc p;
    public d6l q;
    public n7q r;
    public pjc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgh(Continuation continuation, kpm kpmVar, ime imeVar, rn5 rn5Var) {
        super(3, continuation);
        this.m = kpmVar;
        this.n = imeVar;
        this.o = rn5Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vgh vghVar = new vgh((Continuation) obj3, this.m, this.n, this.o);
        vghVar.k = (rjc) obj;
        vghVar.l = obj2;
        return vghVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
    
        if (defpackage.zsd.e0(r14, r3, r13) != r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Type inference failed for: r9v4, types: [pjc] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        pjc pjcVar;
        vdr vdrVar;
        vdr q;
        rn5 rn5Var;
        mu7 mu7Var;
        Object H;
        rjc rjcVar2;
        e6l e6lVar;
        n7q n7qVar;
        pjc pjcVar2;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            rjcVar = this.k;
            e6l e6lVar2 = (e6l) this.l;
            if (!Intrinsics.d(e6lVar2, b6l.a) && !(e6lVar2 instanceof c6l)) {
                if (!(e6lVar2 instanceof d6l)) {
                    b6e.s();
                    return null;
                }
                d6l d6lVar = (d6l) e6lVar2;
                n7q n7qVar2 = d6lVar.a;
                n7qVar2.getClass();
                mwk b = n7qVar2.b();
                ime imeVar = this.n;
                if (Intrinsics.d((n7q) imeVar.d, n7qVar2)) {
                    ?? r9 = (pjc) imeVar.c;
                    if (r9 != 0) {
                        vdrVar = r9;
                        imeVar.c = vdrVar;
                        imeVar.d = n7qVar2;
                        rn5Var = this.o;
                        mm6 mm6Var = (mm6) rn5Var.b;
                        this.k = null;
                        this.l = null;
                        this.p = rjcVar;
                        this.q = d6lVar;
                        this.r = n7qVar2;
                        this.s = vdrVar;
                        this.j = 1;
                        if (Intrinsics.d((n7q) rn5Var.h, n7qVar2)) {
                            wqr wqrVar = (wqr) rn5Var.g;
                            if (wqrVar != null) {
                                wqrVar.g((Media3RatingScopedCache$Media3RatingCancellationException) rn5Var.e);
                            }
                            rn5Var.h = n7qVar2;
                            mu7Var = x97.p(mm6Var, null, pm6.d, new rlg(rn5Var, n7qVar2, n7qVar2.b(), continuation, 3), 1);
                        } else {
                            mu7 mu7Var2 = (mu7) rn5Var.f;
                            if (mu7Var2 == null) {
                                mu7Var = x97.p(mm6Var, null, pm6.d, new rlg(rn5Var, n7qVar2, n7qVar2.b(), continuation, 3), 1);
                            } else {
                                mu7Var = mu7Var2;
                            }
                        }
                        rn5Var.f = mu7Var;
                        rn5Var.h = n7qVar2;
                        H = mu7Var.H(this);
                        if (H != nm6Var) {
                            rjcVar2 = rjcVar;
                            e6lVar = e6lVar2;
                            obj = H;
                            n7qVar = n7qVar2;
                            pjcVar2 = vdrVar;
                        }
                        return nm6Var;
                    }
                    q = imeVar.q(b, n7qVar2);
                } else {
                    q = imeVar.q(b, n7qVar2);
                }
                vdrVar = q;
                imeVar.c = vdrVar;
                imeVar.d = n7qVar2;
                rn5Var = this.o;
                mm6 mm6Var2 = (mm6) rn5Var.b;
                this.k = null;
                this.l = null;
                this.p = rjcVar;
                this.q = d6lVar;
                this.r = n7qVar2;
                this.s = vdrVar;
                this.j = 1;
                if (Intrinsics.d((n7q) rn5Var.h, n7qVar2)) {
                }
                rn5Var.f = mu7Var;
                rn5Var.h = n7qVar2;
                H = mu7Var.H(this);
                if (H != nm6Var) {
                }
                return nm6Var;
            }
            this.m.K();
            pjcVar = wgh.g;
            this.k = null;
            this.l = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.j = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pjcVar2 = this.s;
            n7qVar = this.r;
            e6lVar = this.q;
            rjcVar2 = this.p;
            qgg.h0(obj);
        }
        pjcVar = new u21(10, pjcVar2, (pjc) obj, new a37(n7qVar, e6lVar, continuation, 2));
        rjcVar = rjcVar2;
        this.k = null;
        this.l = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.j = 2;
    }
}
