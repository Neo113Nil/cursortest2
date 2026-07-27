package G1;

import B1.C;
import F1.f;
import K2.o;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import s1.h;
import u1.x;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: u, reason: collision with root package name */
    public static final e f1200u = new e(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1201n;

    public /* synthetic */ e(int i) {
        this.f1201n = i;
    }

    @Override // G1.c
    public final x g(x xVar, h hVar) {
        byte[] bArr;
        switch (this.f1201n) {
            case 0:
                return xVar;
            default:
                ByteBuffer asReadOnlyBuffer = ((f) ((F1.b) xVar.get()).f961n.f744b).f976a.f40262d.asReadOnlyBuffer();
                AtomicReference atomicReference = N1.b.f1952a;
                o oVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new o(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                if (oVar != null && oVar.f1608a == 0) {
                    if (oVar.f1609b == ((byte[]) oVar.f1610c).length) {
                        bArr = asReadOnlyBuffer.array();
                        return new C(bArr);
                    }
                }
                ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                asReadOnlyBuffer2.get(bArr2);
                bArr = bArr2;
                return new C(bArr);
        }
    }
}
