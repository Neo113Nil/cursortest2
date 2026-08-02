package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x27 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ h37 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x27(h37 h37Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = h37Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x27(this.l, continuation, 0);
            default:
                return new x27(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (((defpackage.pjc) r9).collect(r2, r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r9 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (kotlin.Unit.a == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L35;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        h37 h37Var = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    w7o e = ((tdk) h37Var.n).e();
                    if (!(e instanceof s7o)) {
                        if (e instanceof u7o) {
                            List p = o8g.p((List) ((u7o) e).a);
                            x0q x0qVar = h37Var.B;
                            this.k = 2;
                            break;
                        }
                    } else {
                        xdr xdrVar = h37Var.t;
                        qpm qpmVar = new qpm(((s7o) e).a);
                        this.k = 1;
                        xdrVar.getClass();
                        xdrVar.m(null, qpmVar);
                        break;
                    }
                } else if (i2 != 1 && i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    this.k = 1;
                    e8w.c();
                    obj = y0q.b(0, 0, null, 7);
                    break;
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                y27 y27Var = new y27(h37Var, 0);
                this.k = 2;
                break;
        }
        return Unit.a;
    }
}
