package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3352iO implements InterfaceC3837rQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final C3458kO f31040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E3.m f31041b;

    public C3352iO(E3.m mVar, C3458kO c3458kO) {
        Objects.requireNonNull(mVar);
        this.f31041b = mVar;
        this.f31040a = c3458kO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void a(int i, C3676oQ c3676oQ, C3514lQ c3514lQ) {
        Pair c9 = c(c3676oQ);
        if (c9 != null) {
            ((C3212ft) this.f31041b.f800D).e(new RunnableC3865s0(14, this, c9, c3514lQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void b(int i, C3676oQ c3676oQ, final C3246gQ c3246gQ, final C3514lQ c3514lQ, final int i6) {
        final Pair c9 = c(c3676oQ);
        if (c9 != null) {
            ((C3212ft) this.f31041b.f800D).e(new Runnable() { // from class: com.google.android.gms.internal.ads.hO
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = c9;
                    int intValue = ((Integer) pair.first).intValue();
                    C3676oQ c3676oQ2 = (C3676oQ) pair.second;
                    ((BO) C3352iO.this.f31041b.f799C).b(intValue, c3676oQ2, c3246gQ, c3514lQ, i6);
                }
            });
        }
    }

    public final Pair c(C3676oQ c3676oQ) {
        C3676oQ c3676oQ2;
        C3458kO c3458kO = this.f31040a;
        C3676oQ c3676oQ3 = null;
        if (c3676oQ != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = c3458kO.f31421c;
                if (i >= arrayList.size()) {
                    c3676oQ2 = null;
                    break;
                }
                if (((C3676oQ) arrayList.get(i)).f32908d == c3676oQ.f32908d) {
                    Object obj = c3458kO.f31420b;
                    int i6 = C3835rO.f33581k;
                    c3676oQ2 = c3676oQ.a(Pair.create(obj, c3676oQ.f32905a));
                    break;
                }
                i++;
            }
            if (c3676oQ2 == null) {
                return null;
            }
            c3676oQ3 = c3676oQ2;
        }
        return Pair.create(Integer.valueOf(c3458kO.f31422d), c3676oQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void n(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ, IOException iOException, boolean z3) {
        Pair c9 = c(c3676oQ);
        if (c9 != null) {
            ((C3212ft) this.f31041b.f800D).e(new RunnableC3647ny(this, c9, c3246gQ, c3514lQ, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void p(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        Pair c9 = c(c3676oQ);
        if (c9 != null) {
            ((C3212ft) this.f31041b.f800D).e(new RunnableC3244gO(this, c9, c3246gQ, c3514lQ, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void q(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        Pair c9 = c(c3676oQ);
        if (c9 != null) {
            ((C3212ft) this.f31041b.f800D).e(new RunnableC3244gO(this, c9, c3246gQ, c3514lQ, 1));
        }
    }
}
