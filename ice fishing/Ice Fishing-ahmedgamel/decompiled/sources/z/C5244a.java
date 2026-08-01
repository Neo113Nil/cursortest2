package z;

import w.C5136a;
import w.C5139d;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5244a extends c {

    /* renamed from: A, reason: collision with root package name */
    public int f42003A;

    /* renamed from: B, reason: collision with root package name */
    public int f42004B;

    /* renamed from: C, reason: collision with root package name */
    public C5136a f42005C;

    public boolean getAllowsGoneWidget() {
        return this.f42005C.f41452t0;
    }

    public int getMargin() {
        return this.f42005C.f41453u0;
    }

    public int getType() {
        return this.f42003A;
    }

    @Override // z.c
    public final void h(C5139d c5139d, boolean z3) {
        int i = this.f42003A;
        this.f42004B = i;
        if (z3) {
            if (i == 5) {
                this.f42004B = 1;
            } else if (i == 6) {
                this.f42004B = 0;
            }
        } else if (i == 5) {
            this.f42004B = 0;
        } else if (i == 6) {
            this.f42004B = 1;
        }
        if (c5139d instanceof C5136a) {
            ((C5136a) c5139d).f41451s0 = this.f42004B;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f42005C.f41452t0 = z3;
    }

    public void setDpMargin(int i) {
        this.f42005C.f41453u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f42005C.f41453u0 = i;
    }

    public void setType(int i) {
        this.f42003A = i;
    }
}
