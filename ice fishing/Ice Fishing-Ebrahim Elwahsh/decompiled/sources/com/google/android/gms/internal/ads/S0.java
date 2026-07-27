package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class S0 implements InterfaceC3865ro {

    /* renamed from: n, reason: collision with root package name */
    public long f27467n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.qN] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.qN] */
    public long a(ByteBuffer byteBuffer) {
        C3991u5 c3991u5;
        C3937t5 c3937t5;
        long j9 = this.f27467n;
        if (j9 > 0) {
            return j9;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            C3829r5 c3829r5 = new C3829r5(new C2587Hg(duplicate), C2604Ig.f25582c);
            C2587Hg c2587Hg = c3829r5.f32854u;
            ArrayList arrayList = c3829r5.f32858y;
            if (c2587Hg != null && c3829r5.f32855v != AbstractC3632nN.f32852z) {
                arrayList = new C3794qN(arrayList, c3829r5);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                c3991u5 = null;
                if (!it.hasNext()) {
                    c3937t5 = null;
                    break;
                }
                InterfaceC3883s5 interfaceC3883s5 = (InterfaceC3883s5) it.next();
                if (interfaceC3883s5 instanceof C3937t5) {
                    c3937t5 = (C3937t5) interfaceC3883s5;
                    break;
                }
            }
            C2587Hg c2587Hg2 = c3937t5.f32854u;
            ArrayList arrayList2 = c3937t5.f32858y;
            if (c2587Hg2 != null && c3937t5.f32855v != AbstractC3632nN.f32852z) {
                arrayList2 = new C3794qN(arrayList2, c3937t5);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC3883s5 interfaceC3883s52 = (InterfaceC3883s5) it2.next();
                if (interfaceC3883s52 instanceof C3991u5) {
                    c3991u5 = (C3991u5) interfaceC3883s52;
                    break;
                }
            }
            long j10 = (c3991u5.f34538F * 1000) / c3991u5.f34537E;
            this.f27467n = j10;
            return j10;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        Mt mt;
        C4281zP c4281zP = (C4281zP) obj;
        EP ep = c4281zP.f35549b;
        if (c4281zP.equals(ep.f24749h) && (mt = ep.f24752l) != null) {
            GP gp = (GP) mt.f26393u;
            gp.f25165x1 = true;
            C3932t0 c3932t0 = gp.f25156m1;
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new RunnableC3418jP(c3932t0, this.f27467n));
            }
        }
    }
}
