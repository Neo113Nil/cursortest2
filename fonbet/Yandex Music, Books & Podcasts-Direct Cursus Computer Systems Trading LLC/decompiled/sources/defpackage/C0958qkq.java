package defpackage;

import defpackage.okq;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lokq$a;", "msg", "", "ex", "", "<anonymous>", "(Lokq$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
/* renamed from: qkq, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
final class C0958qkq extends uif implements Function2<okq.a<Object>, Throwable, Unit> {
    public static final C0958qkq r = new C0958qkq(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        okq.a aVar = (okq.a) obj;
        Throwable th = (Throwable) obj2;
        aVar.getClass();
        if (aVar instanceof okq.a.b) {
            gm5 gm5Var = ((okq.a.b) aVar).b;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            gm5Var.m0(th);
        }
        return Unit.a;
    }
}
