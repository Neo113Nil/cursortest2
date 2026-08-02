package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3375iO implements InterfaceC4022uQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final C3481kO f31813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G3.m f31814b;

    public C3375iO(G3.m mVar, C3481kO c3481kO) {
        Objects.requireNonNull(mVar);
        this.f31814b = mVar;
        this.f31813a = c3481kO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void a(int i, C3860rQ c3860rQ, C3699oQ c3699oQ) {
        Pair c9 = c(c3860rQ);
        if (c9 != null) {
            ((C3235ft) this.f31814b.f1142D).e(new RunnableC3888s0(14, this, c9, c3699oQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void b(int i, C3860rQ c3860rQ, final C3429jQ c3429jQ, final C3699oQ c3699oQ, final int i4) {
        final Pair c9 = c(c3860rQ);
        if (c9 != null) {
            ((C3235ft) this.f31814b.f1142D).e(new Runnable() { // from class: com.google.android.gms.internal.ads.hO
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = c9;
                    int intValue = ((Integer) pair.first).intValue();
                    C3860rQ c3860rQ2 = (C3860rQ) pair.second;
                    ((BO) C3375iO.this.f31814b.f1141C).b(intValue, c3860rQ2, c3429jQ, c3699oQ, i4);
                }
            });
        }
    }

    public final Pair c(C3860rQ c3860rQ) {
        C3860rQ c3860rQ2;
        C3481kO c3481kO = this.f31813a;
        C3860rQ c3860rQ3 = null;
        if (c3860rQ != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = c3481kO.f32200c;
                if (i >= arrayList.size()) {
                    c3860rQ2 = null;
                    break;
                }
                if (((C3860rQ) arrayList.get(i)).f34409d == c3860rQ.f34409d) {
                    Object obj = c3481kO.f32199b;
                    int i4 = C3858rO.f34349k;
                    c3860rQ2 = c3860rQ.a(Pair.create(obj, c3860rQ.f34406a));
                    break;
                }
                i++;
            }
            if (c3860rQ2 == null) {
                return null;
            }
            c3860rQ3 = c3860rQ2;
        }
        return Pair.create(Integer.valueOf(c3481kO.f32201d), c3860rQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void n(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ, IOException iOException, boolean z6) {
        Pair c9 = c(c3860rQ);
        if (c9 != null) {
            ((C3235ft) this.f31814b.f1142D).e(new RunnableC3670ny(this, c9, c3429jQ, c3699oQ, iOException, z6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void p(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        Pair c9 = c(c3860rQ);
        if (c9 != null) {
            ((C3235ft) this.f31814b.f1142D).e(new RunnableC3267gO(this, c9, c3429jQ, c3699oQ, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void q(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        Pair c9 = c(c3860rQ);
        if (c9 != null) {
            ((C3235ft) this.f31814b.f1142D).e(new RunnableC3267gO(this, c9, c3429jQ, c3699oQ, 1));
        }
    }
}
