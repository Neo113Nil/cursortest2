package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.anythink.basead.exoplayer.b;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C2268no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i, C2268no c2268no, long j6) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c2268no;
        this.A02 = j6;
    }

    private long A00(long j6) {
        long A0P = C5C.A0P(j6);
        if (A0P == b.f7168b) {
            return b.f7168b;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C0853Cs c0853Cs, final int i) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final D8 A02(int i, C2268no c2268no, long j6) {
        return new D8(this.A03, i, c2268no, j6);
    }

    public final void A03(int i, C2420qI c2420qI, int i4, Object obj, long j6) {
        A0C(new C0853Cs(1, i, c2420qI, i4, obj, A00(j6), b.f7168b));
    }

    public final void A04(Handler handler, D9 d9) {
        AbstractC06443y.A01(handler);
        AbstractC06443y.A01(d9);
        this.A03.add(new D7(handler, d9));
    }

    public final void A05(Cq cq, int i, int i4, C2420qI c2420qI, int i6, Object obj, long j6, long j9) {
        A09(cq, new C0853Cs(i, i4, c2420qI, i6, obj, A00(j6), A00(j9)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i, int i4, C2420qI c2420qI, int i6, Object obj, long j6, long j9, int i9) {
        A01(cq, new C0853Cs(i, i4, c2420qI, i6, obj, A00(j6), A00(j9)), i9);
    }

    public final void A07(Cq cq, int i, int i4, C2420qI c2420qI, int i6, Object obj, long j6, long j9, IOException iOException, boolean z6) {
        A0A(cq, new C0853Cs(i, i4, c2420qI, i6, obj, A00(j6), A00(j9)), iOException, z6);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i, int i4, C2420qI c2420qI, int i6, Object obj, long j6, long j9, Object obj2, Object obj3) {
        A0B(cq, new C0853Cs(i, i4, c2420qI, i6, obj, A00(j6), A00(j9)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C0853Cs c0853Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0E(listener, cq, c0853Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C0853Cs c0853Cs, final IOException iOException, final boolean z6) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0F(d9, cq, c0853Cs, iOException, z6);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C0853Cs c0853Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0G(d9, cq, c0853Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C0853Cs c0853Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0H(listener, c0853Cs);
                }
            });
        }
    }

    public final void A0D(D9 d9) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == d9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(D9 d9, Cq cq, C0853Cs c0853Cs) {
        d9.AEb(this.A00, this.A01, cq, c0853Cs);
    }

    public final /* synthetic */ void A0F(D9 d9, Cq cq, C0853Cs c0853Cs, IOException iOException, boolean z6) {
        d9.AEg(this.A00, this.A01, cq, c0853Cs, iOException, z6);
    }

    public final /* synthetic */ void A0G(D9 d9, Cq cq, C0853Cs c0853Cs, Object obj, Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c0853Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d9, C0853Cs c0853Cs) {
        d9.ADk(this.A00, this.A01, c0853Cs);
    }
}
