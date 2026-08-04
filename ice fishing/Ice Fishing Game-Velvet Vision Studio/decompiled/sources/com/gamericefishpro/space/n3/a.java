package com.gamericefishpro.space.n3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public int A;
    public int B;
    public com.gamericefishpro.space.k3.a C;

    public boolean getAllowsGoneWidget() {
        return this.C.s0;
    }

    public int getMargin() {
        return this.C.t0;
    }

    public int getType() {
        return this.A;
    }

    @Override // com.gamericefishpro.space.n3.c
    public final void h(com.gamericefishpro.space.k3.d dVar, boolean z) {
        int i = this.A;
        this.B = i;
        if (z) {
            if (i == 5) {
                this.B = 1;
            } else if (i == 6) {
                this.B = 0;
            }
        } else if (i == 5) {
            this.B = 0;
        } else if (i == 6) {
            this.B = 1;
        }
        if (dVar instanceof com.gamericefishpro.space.k3.a) {
            ((com.gamericefishpro.space.k3.a) dVar).r0 = this.B;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.C.s0 = z;
    }

    public void setDpMargin(int i) {
        this.C.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.C.t0 = i;
    }

    public void setType(int i) {
        this.A = i;
    }
}
