package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class glc extends aur implements ryc {
    public int j;
    public /* synthetic */ Throwable k;
    public /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ aur n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public glc(long j, Function2 function2, Continuation continuation) {
        super(4, continuation);
        this.m = j;
        this.n = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        glc glcVar = new glc(this.m, this.n, (Continuation) obj4);
        glcVar.k = (Throwable) obj2;
        glcVar.l = longValue;
        return glcVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        boolean z = true;
        if (i == 0) {
            qgg.h0(obj);
            Throwable th = this.k;
            if (this.l < this.m) {
                this.j = 1;
                obj = this.n.invoke(th, this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
    }
}
