package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class lbp {
    public static final xap a = new xap(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(xap xapVar) {
        xapVar.getClass();
        if (xapVar.f != null || xapVar.g != null) {
            xq0.x("Failed requirement.");
            return;
        }
        if (xapVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        xap xapVar2 = a;
        xap xapVar3 = (xap) atomicReference.getAndSet(xapVar2);
        if (xapVar3 == xapVar2) {
            return;
        }
        int i = xapVar3 != null ? xapVar3.c : 0;
        if (i >= 65536) {
            atomicReference.set(xapVar3);
            return;
        }
        xapVar.f = xapVar3;
        xapVar.b = 0;
        xapVar.c = i + RemoteCameraConfig.Notification.ID;
        atomicReference.set(xapVar);
    }

    public static final xap b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        xap xapVar = a;
        xap xapVar2 = (xap) atomicReference.getAndSet(xapVar);
        if (xapVar2 == xapVar) {
            return new xap();
        }
        if (xapVar2 == null) {
            atomicReference.set(null);
            return new xap();
        }
        atomicReference.set(xapVar2.f);
        xapVar2.f = null;
        xapVar2.c = 0;
        return xapVar2;
    }
}
