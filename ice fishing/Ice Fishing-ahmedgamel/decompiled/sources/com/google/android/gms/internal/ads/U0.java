package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class U0 implements InterfaceC3606mo {

    /* renamed from: n, reason: collision with root package name */
    public long f28641n;

    @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        C3557lt c3557lt;
        C3590mP c3590mP = (C3590mP) obj;
        C3859rP c3859rP = c3590mP.f32747b;
        if (c3590mP.equals(c3859rP.f34388h) && (c3557lt = c3859rP.f34391l) != null) {
            C3967tP c3967tP = (C3967tP) c3557lt.f32643u;
            c3967tP.r1 = true;
            S0.l lVar = c3967tP.f35065g1;
            Handler handler = (Handler) lVar.f2926u;
            if (handler != null) {
                handler.post(new WO(lVar, this.f28641n));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.cN] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.cN] */
    public long b(ByteBuffer byteBuffer) {
        C4163x5 c4163x5;
        C4109w5 c4109w5;
        long j6 = this.f28641n;
        if (j6 > 0) {
            return j6;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            C4001u5 c4001u5 = new C4001u5(new C2676Lg(duplicate), C2693Mg.f27093c);
            C2676Lg c2676Lg = c4001u5.f29656u;
            ArrayList arrayList = c4001u5.f29660y;
            if (c2676Lg != null && c4001u5.f29657v != ZM.f29654z) {
                arrayList = new C3051cN(arrayList, c4001u5);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                c4163x5 = null;
                if (!it.hasNext()) {
                    c4109w5 = null;
                    break;
                }
                InterfaceC4055v5 interfaceC4055v5 = (InterfaceC4055v5) it.next();
                if (interfaceC4055v5 instanceof C4109w5) {
                    c4109w5 = (C4109w5) interfaceC4055v5;
                    break;
                }
            }
            C2676Lg c2676Lg2 = c4109w5.f29656u;
            ArrayList arrayList2 = c4109w5.f29660y;
            if (c2676Lg2 != null && c4109w5.f29657v != ZM.f29654z) {
                arrayList2 = new C3051cN(arrayList2, c4109w5);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC4055v5 interfaceC4055v52 = (InterfaceC4055v5) it2.next();
                if (interfaceC4055v52 instanceof C4163x5) {
                    c4163x5 = (C4163x5) interfaceC4055v52;
                    break;
                }
            }
            long j9 = (c4163x5.f35735F * 1000) / c4163x5.f35734E;
            this.f28641n = j9;
            return j9;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
