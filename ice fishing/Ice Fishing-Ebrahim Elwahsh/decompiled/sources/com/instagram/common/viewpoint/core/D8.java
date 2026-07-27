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
    public final C2247no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i, C2247no c2247no, long j9) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c2247no;
        this.A02 = j9;
    }

    private long A00(long j9) {
        long A0P = C5C.A0P(j9);
        if (A0P == b.f6539b) {
            return b.f6539b;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C0832Cs c0832Cs, final int i) {
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

    public final D8 A02(int i, C2247no c2247no, long j9) {
        return new D8(this.A03, i, c2247no, j9);
    }

    public final void A03(int i, C2399qI c2399qI, int i4, Object obj, long j9) {
        A0C(new C0832Cs(1, i, c2399qI, i4, obj, A00(j9), b.f6539b));
    }

    public final void A04(Handler handler, D9 d9) {
        AbstractC06233y.A01(handler);
        AbstractC06233y.A01(d9);
        this.A03.add(new D7(handler, d9));
    }

    public final void A05(Cq cq, int i, int i4, C2399qI c2399qI, int i9, Object obj, long j9, long j10) {
        A09(cq, new C0832Cs(i, i4, c2399qI, i9, obj, A00(j9), A00(j10)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i, int i4, C2399qI c2399qI, int i9, Object obj, long j9, long j10, int i10) {
        A01(cq, new C0832Cs(i, i4, c2399qI, i9, obj, A00(j9), A00(j10)), i10);
    }

    public final void A07(Cq cq, int i, int i4, C2399qI c2399qI, int i9, Object obj, long j9, long j10, IOException iOException, boolean z8) {
        A0A(cq, new C0832Cs(i, i4, c2399qI, i9, obj, A00(j9), A00(j10)), iOException, z8);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i, int i4, C2399qI c2399qI, int i9, Object obj, long j9, long j10, Object obj2, Object obj3) {
        A0B(cq, new C0832Cs(i, i4, c2399qI, i9, obj, A00(j9), A00(j10)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C0832Cs c0832Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0E(listener, cq, c0832Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C0832Cs c0832Cs, final IOException iOException, final boolean z8) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0F(d9, cq, c0832Cs, iOException, z8);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C0832Cs c0832Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0G(d9, cq, c0832Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C0832Cs c0832Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0H(listener, c0832Cs);
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

    public final /* synthetic */ void A0E(D9 d9, Cq cq, C0832Cs c0832Cs) {
        d9.AEb(this.A00, this.A01, cq, c0832Cs);
    }

    public final /* synthetic */ void A0F(D9 d9, Cq cq, C0832Cs c0832Cs, IOException iOException, boolean z8) {
        d9.AEg(this.A00, this.A01, cq, c0832Cs, iOException, z8);
    }

    public final /* synthetic */ void A0G(D9 d9, Cq cq, C0832Cs c0832Cs, Object obj, Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c0832Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d9, C0832Cs c0832Cs) {
        d9.ADk(this.A00, this.A01, c0832Cs);
    }
}
