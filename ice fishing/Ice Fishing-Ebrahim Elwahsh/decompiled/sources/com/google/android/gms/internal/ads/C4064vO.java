package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4064vO implements EQ, OP {

    /* renamed from: a, reason: collision with root package name */
    public final C4172xO f34758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3.m f34759b;

    public C4064vO(C3.m mVar, C4172xO c4172xO) {
        Objects.requireNonNull(mVar);
        this.f34759b = mVar;
        this.f34758a = c4172xO;
    }

    public final Pair a(BQ bq) {
        BQ bq2;
        C4172xO c4172xO = this.f34758a;
        BQ bq3 = null;
        if (bq != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = c4172xO.f35146c;
                if (i >= arrayList.size()) {
                    bq2 = null;
                    break;
                }
                if (((BQ) arrayList.get(i)).f24046d == bq.f24046d) {
                    Object obj = c4172xO.f35145b;
                    int i4 = EO.f24710k;
                    bq2 = bq.a(Pair.create(obj, bq.f24043a));
                    break;
                }
                i++;
            }
            if (bq2 == null) {
                return null;
            }
            bq3 = bq2;
        }
        return Pair.create(Integer.valueOf(c4172xO.f35147d), bq3);
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void b(int i, BQ bq, C4228yQ c4228yQ) {
        Pair a9 = a(bq);
        if (a9 != null) {
            ((C3709ot) this.f34759b.f447D).e(new RunnableC3771q0(this, a9, c4228yQ, 14));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void l(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        Pair a9 = a(bq);
        if (a9 != null) {
            ((C3709ot) this.f34759b.f447D).e(new RunnableC3956tO(this, a9, c3958tQ, c4228yQ, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void m(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        Pair a9 = a(bq);
        if (a9 != null) {
            ((C3709ot) this.f34759b.f447D).e(new RunnableC3956tO(this, a9, c3958tQ, c4228yQ, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void p(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ, IOException iOException, boolean z8) {
        Pair a9 = a(bq);
        if (a9 != null) {
            ((C3709ot) this.f34759b.f447D).e(new RunnableC3768py(this, a9, c3958tQ, c4228yQ, iOException, z8));
        }
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void q(int i, BQ bq, final C3958tQ c3958tQ, final C4228yQ c4228yQ, final int i4) {
        final Pair a9 = a(bq);
        if (a9 != null) {
            ((C3709ot) this.f34759b.f447D).e(new Runnable() { // from class: com.google.android.gms.internal.ads.uO
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = a9;
                    int intValue = ((Integer) pair.first).intValue();
                    BQ bq2 = (BQ) pair.second;
                    ((OO) C4064vO.this.f34759b.f446C).q(intValue, bq2, c3958tQ, c4228yQ, i4);
                }
            });
        }
    }
}
