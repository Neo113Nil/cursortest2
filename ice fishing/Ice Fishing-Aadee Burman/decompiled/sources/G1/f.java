package G1;

import B1.D;
import L2.o;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import s1.h;
import u1.x;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: u, reason: collision with root package name */
    public static final f f1057u = new f(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1058n;

    public /* synthetic */ f(int i) {
        this.f1058n = i;
    }

    @Override // G1.c
    public final x g(x xVar, h hVar) {
        byte[] bArr;
        switch (this.f1058n) {
            case 0:
                return xVar;
            default:
                ByteBuffer asReadOnlyBuffer = ((F1.h) ((F1.c) xVar.get()).f914n.f664b).f931a.f40357d.asReadOnlyBuffer();
                AtomicReference atomicReference = N1.b.f1908a;
                o oVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new o(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                if (oVar != null && oVar.f1663a == 0) {
                    if (oVar.f1664b == ((byte[]) oVar.f1665c).length) {
                        bArr = asReadOnlyBuffer.array();
                        return new D(bArr);
                    }
                }
                ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                asReadOnlyBuffer2.get(bArr2);
                bArr = bArr2;
                return new D(bArr);
        }
    }
}
