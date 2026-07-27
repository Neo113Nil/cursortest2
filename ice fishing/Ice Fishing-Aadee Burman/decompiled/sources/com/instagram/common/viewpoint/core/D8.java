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
    public final C2248no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i, C2248no c2248no, long j6) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c2248no;
        this.A02 = j6;
    }

    private long A00(long j6) {
        long A0P = C5C.A0P(j6);
        if (A0P == b.f6382b) {
            return b.f6382b;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C0833Cs c0833Cs, final int i) {
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

    public final D8 A02(int i, C2248no c2248no, long j6) {
        return new D8(this.A03, i, c2248no, j6);
    }

    public final void A03(int i, C2400qI c2400qI, int i6, Object obj, long j6) {
        A0C(new C0833Cs(1, i, c2400qI, i6, obj, A00(j6), b.f6382b));
    }

    public final void A04(Handler handler, D9 d9) {
        AbstractC06243y.A01(handler);
        AbstractC06243y.A01(d9);
        this.A03.add(new D7(handler, d9));
    }

    public final void A05(Cq cq, int i, int i6, C2400qI c2400qI, int i9, Object obj, long j6, long j9) {
        A09(cq, new C0833Cs(i, i6, c2400qI, i9, obj, A00(j6), A00(j9)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i, int i6, C2400qI c2400qI, int i9, Object obj, long j6, long j9, int i10) {
        A01(cq, new C0833Cs(i, i6, c2400qI, i9, obj, A00(j6), A00(j9)), i10);
    }

    public final void A07(Cq cq, int i, int i6, C2400qI c2400qI, int i9, Object obj, long j6, long j9, IOException iOException, boolean z3) {
        A0A(cq, new C0833Cs(i, i6, c2400qI, i9, obj, A00(j6), A00(j9)), iOException, z3);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i, int i6, C2400qI c2400qI, int i9, Object obj, long j6, long j9, Object obj2, Object obj3) {
        A0B(cq, new C0833Cs(i, i6, c2400qI, i9, obj, A00(j6), A00(j9)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C0833Cs c0833Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0E(listener, cq, c0833Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C0833Cs c0833Cs, final IOException iOException, final boolean z3) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0F(d9, cq, c0833Cs, iOException, z3);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C0833Cs c0833Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0G(d9, cq, c0833Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C0833Cs c0833Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0H(listener, c0833Cs);
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

    public final /* synthetic */ void A0E(D9 d9, Cq cq, C0833Cs c0833Cs) {
        d9.AEb(this.A00, this.A01, cq, c0833Cs);
    }

    public final /* synthetic */ void A0F(D9 d9, Cq cq, C0833Cs c0833Cs, IOException iOException, boolean z3) {
        d9.AEg(this.A00, this.A01, cq, c0833Cs, iOException, z3);
    }

    public final /* synthetic */ void A0G(D9 d9, Cq cq, C0833Cs c0833Cs, Object obj, Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c0833Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d9, C0833Cs c0833Cs) {
        d9.ADk(this.A00, this.A01, c0833Cs);
    }
}
