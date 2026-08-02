package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o5s extends aur implements Function2 {
    public int j;
    public int k;
    public final /* synthetic */ t5s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5s(t5s t5sVar, Continuation continuation) {
        super(2, continuation);
        this.l = t5sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new o5s(this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o5s) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r8 == r2) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        t5s t5sVar = this.l;
        wb7 wb7Var = t5sVar.f;
        nm6 nm6Var = nm6.a;
        int i2 = this.k;
        if (i2 == 0) {
            qgg.h0(obj);
            pjc data = wb7Var.getData();
            this.k = 1;
            obj = zsd.g0(data, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.j;
                qgg.h0(obj);
                return Boolean.valueOf(i != 0);
            }
            qgg.h0(obj);
        }
        Boolean bool = (Boolean) ((hmm) obj).a(t5sVar.e);
        ?? booleanValue = bool != null ? bool.booleanValue() : 1;
        n5s n5sVar = new n5s(t5sVar, null);
        this.j = booleanValue;
        this.k = 2;
        if (lmm.a(wb7Var, n5sVar, this) != nm6Var) {
            i = booleanValue;
            return Boolean.valueOf(i != 0);
        }
        return nm6Var;
    }
}
