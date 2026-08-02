package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class of6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uif s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public of6(int i, Function0 function0) {
        super(0);
        this.r = i;
        switch (i) {
            case 1:
                this.s = (uif) function0;
                super(0);
                break;
            default:
                this.s = (uif) function0;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.invoke();
                return Unit.a;
            default:
                try {
                    return (List) this.s.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return c5b.a;
                }
        }
    }
}
