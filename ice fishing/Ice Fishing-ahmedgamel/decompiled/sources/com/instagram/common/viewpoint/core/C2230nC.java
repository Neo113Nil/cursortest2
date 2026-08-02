package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2230nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C0911Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2230nC(boolean z6, int i) {
        this(z6, i, 0);
    }

    public C2230nC(boolean z6, int i, int i4) {
        AbstractC06443y.A07(i > 0);
        AbstractC06443y.A07(i4 >= 0);
        this.A05 = z6;
        this.A04 = i;
        this.A01 = i4;
        this.A03 = new C0911Ey[i4 + 100];
        if (i4 > 0) {
            this.A06 = new byte[i4 * i];
            for (int i6 = 0; i6 < i4; i6++) {
                this.A03[i6] = new C0911Ey(this.A06, i6 * i);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized C0911Ey A49() {
        C0911Ey c0911Ey;
        this.A00++;
        if (this.A01 > 0) {
            C0911Ey[] c0911EyArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c0911Ey = (C0911Ey) AbstractC06443y.A01(c0911EyArr[i]);
            this.A03[this.A01] = null;
        } else {
            c0911Ey = new C0911Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C0911Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c0911Ey;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHd(C0911Ey c0911Ey) {
        C0911Ey[] c0911EyArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c0911EyArr[i] = c0911Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHe(InterfaceC0912Ez interfaceC0912Ez) {
        while (interfaceC0912Ez != null) {
            C0911Ey[] c0911EyArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c0911EyArr[i] = interfaceC0912Ez.A6u();
            this.A00--;
            interfaceC0912Ez = interfaceC0912Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AKT() {
        int A05 = C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C0911Ey highAllocation = (C0911Ey) AbstractC06443y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0911Ey lowAllocation = (C0911Ey) AbstractC06443y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C0911Ey[] c0911EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c0911EyArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
