package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class g37 extends aur implements Function2 {
    public h37 j;
    public int k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ h37 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g37(h37 h37Var, Continuation continuation) {
        super(2, continuation);
        this.p = h37Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        g37 g37Var = new g37(this.p, continuation);
        g37Var.o = obj;
        return g37Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g37) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x011c, code lost:
    
        if (r13.emit(r0, r12) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        if (kotlin.Unit.a == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r13 != r2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        if (kotlin.Unit.a == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a5 -> B:20:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        tqn tqnVar;
        h37 h37Var;
        int i3;
        int i4;
        h37 h37Var2;
        tqn tqnVar2;
        h37 h37Var3 = this.p;
        xdr xdrVar = h37Var3.z;
        nm6 nm6Var = nm6.a;
        switch (this.n) {
            case 0:
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.o;
                q5m q5mVar = q5m.b;
                this.o = mm6Var;
                this.n = 1;
                xdrVar.getClass();
                xdrVar.m(null, q5mVar);
                break;
            case 1:
                qgg.h0(obj);
                i = 10;
                i2 = 0;
                tqnVar = new tqn();
                h37Var = h37Var3;
                if (i2 < i) {
                    this.o = tqnVar;
                    this.j = h37Var;
                    this.k = i;
                    this.l = i2;
                    this.m = i2;
                    this.n = 2;
                    if (y2x.o(1000L, this) != nm6Var) {
                        h37Var2 = h37Var;
                        i4 = i;
                        i3 = i2;
                        e8w e8wVar = e8w.a;
                        this.o = tqnVar;
                        this.j = h37Var2;
                        this.k = i4;
                        this.l = i2;
                        this.m = i3;
                        this.n = 3;
                        obj = e8wVar.b(this);
                        break;
                    }
                    return nm6Var;
                }
                if (!tqnVar.a) {
                    g0c g0cVar = h37Var3.l;
                    qne D0 = gut.D0();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(D0);
                    q5m q5mVar2 = q5m.c;
                    this.o = null;
                    this.j = null;
                    this.n = 5;
                    xdrVar.getClass();
                    xdrVar.m(null, q5mVar2);
                    break;
                }
                return Unit.a;
            case 2:
                i3 = this.m;
                i2 = this.l;
                i4 = this.k;
                h37Var2 = this.j;
                tqnVar = (tqn) this.o;
                qgg.h0(obj);
                e8w e8wVar2 = e8w.a;
                this.o = tqnVar;
                this.j = h37Var2;
                this.k = i4;
                this.l = i2;
                this.m = i3;
                this.n = 3;
                obj = e8wVar2.b(this);
                break;
            case 3:
                i3 = this.m;
                i2 = this.l;
                i4 = this.k;
                h37Var2 = this.j;
                tqnVar = (tqn) this.o;
                qgg.h0(obj);
                int i5 = i2;
                int i6 = i3;
                i = i4;
                z7o z7oVar = (z7o) obj;
                if (z7oVar != null) {
                    Object obj2 = z7oVar.a;
                    if (!(obj2 instanceof t7o)) {
                        g0c g0cVar2 = h37Var2.l;
                        qne E0 = gut.E0(i6 + 1);
                        x60 x60Var2 = (x60) g0cVar2;
                        x60Var2.getClass();
                        x60Var2.a(E0);
                        tqnVar.a = true;
                        xdr xdrVar2 = h37Var2.z;
                        q5m q5mVar3 = q5m.c;
                        this.o = tqnVar;
                        this.j = null;
                        this.n = 4;
                        xdrVar2.getClass();
                        xdrVar2.m(null, q5mVar3);
                        if (Unit.a != nm6Var) {
                            tqnVar2 = tqnVar;
                            tqnVar = tqnVar2;
                            if (!tqnVar.a) {
                            }
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    r7o r7oVar = z7o.b;
                }
                i2 = i5 + 1;
                h37Var = h37Var2;
                if (i2 < i) {
                }
                if (!tqnVar.a) {
                }
                return Unit.a;
            case 4:
                tqnVar2 = (tqn) this.o;
                qgg.h0(obj);
                tqnVar = tqnVar2;
                if (!tqnVar.a) {
                }
                return Unit.a;
            case 5:
                qgg.h0(obj);
                x0q x0qVar = h37Var3.v;
                opm opmVar = new opm(R.string.paymentsdk_error_create_card);
                this.n = 6;
                break;
            case 6:
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
