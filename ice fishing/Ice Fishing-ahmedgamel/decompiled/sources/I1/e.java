package I1;

import D1.C;
import N2.p;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import u1.h;
import w1.w;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: u, reason: collision with root package name */
    public static final e f1309u = new e(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1310n;

    public /* synthetic */ e(int i) {
        this.f1310n = i;
    }

    @Override // I1.b
    public final w e(w wVar, h hVar) {
        byte[] bArr;
        switch (this.f1310n) {
            case 0:
                return wVar;
            default:
                ByteBuffer asReadOnlyBuffer = ((H1.h) ((H1.c) wVar.get()).f1199n.f644b).f1216a.f40864d.asReadOnlyBuffer();
                AtomicReference atomicReference = P1.b.f2352a;
                p pVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new p(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                if (pVar != null && pVar.f1953a == 0) {
                    if (pVar.f1954b == ((byte[]) pVar.f1955c).length) {
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
