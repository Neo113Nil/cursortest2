package z;

import w.C0363a;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379a extends AbstractC0381c {

    /* renamed from: h, reason: collision with root package name */
    public int f4770h;
    public int i;
    public C0363a j;

    public boolean getAllowsGoneWidget() {
        return this.j.f4498t0;
    }

    public int getMargin() {
        return this.j.f4499u0;
    }

    public int getType() {
        return this.f4770h;
    }

    @Override // z.AbstractC0381c
    public final void h(w.d dVar, boolean z2) {
        int i = this.f4770h;
        this.i = i;
        if (z2) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (dVar instanceof C0363a) {
            ((C0363a) dVar).s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.j.f4498t0 = z2;
    }

    public void setDpMargin(int i) {
        this.j.f4499u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.f4499u0 = i;
    }

    public void setType(int i) {
        this.f4770h = i;
    }
}
