package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2309oo, InterfaceC07197p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C07227s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2400qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1966ir A0B = EnumC1966ir.A09;
    public final C07036z A0D = new C07036z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j6, boolean z3) throws AD;

    public abstract void A1c(C2400qI[] c2400qIArr, long j6, long j9) throws AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j6, boolean z3) throws AD {
        this.A08 = false;
        this.A02 = j6;
        this.A03 = j6;
        A1a(j6, z3);
    }

    public final int A1Q(long j6) {
        return ((DT) AbstractC06243y.A01(this.A07)).AK2(j6 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C07036z c07036z, C2321p0 c2321p0, int i) {
        int AHP = ((DT) AbstractC06243y.A01(this.A07)).AHP(c07036z, c2321p0, i);
        if (AHP == -4) {
            if (c2321p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2321p0.A00 = c2321p0.A01;
            c2321p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2321p0.A01);
        } else if (AHP == -5) {
            C2400qI c2400qI = (C2400qI) AbstractC06243y.A01(c07036z.A00);
            if (c2400qI.A0M != Long.MAX_VALUE) {
                c07036z.A00 = c2400qI.A07().A0s(c2400qI.A0M + this.A04).A14();
            }
        }
        return AHP;
    }

    public final AD A1S(Throwable th, C2400qI c2400qI, int i) {
        return A1T(th, c2400qI, false, i);
    }

    public final AD A1T(Throwable th, C2400qI c2400qI, boolean z3, int i) {
        int i6 = 4;
        if (c2400qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2400qI);
                i6 = AbstractC07127i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c2400qI, i6, z3, i);
    }

    public final C07036z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C07227s A1V() {
        return (C07227s) AbstractC06243y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC06243y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z3, boolean z6) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC06243y.A01(this.A07)).AAe();
    }

    public final C2400qI[] A1e() {
        return (C2400qI[]) AbstractC06243y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void A5x() {
        AbstractC06243y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void A6L(C07227s c07227s, C2400qI[] c2400qIArr, DT dt, long j6, boolean z3, boolean z6, long j9, long j10) throws AD {
        AbstractC06243y.A08(this.A01 == 0);
        this.A05 = c07227s;
        this.A01 = 1;
        A1b(z3, z6);
        AIa(c2400qIArr, dt, j9, j10);
        A1P(j6, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final InterfaceC07197p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1966ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo, com.instagram.common.viewpoint.core.InterfaceC07197p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07067c
    public void A9i(int i, Object obj) throws AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void AA9(int i, C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void ACU() throws IOException {
        ((DT) AbstractC06243y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void AIa(C2400qI[] c2400qIArr, DT dt, long j6, long j9) throws AD {
        AbstractC06243y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j6;
        }
        this.A0A = c2400qIArr;
        this.A04 = j9;
        A1c(c2400qIArr, j6, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void AIm(long j6) throws AD {
        A1P(j6, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void start() throws AD {
        AbstractC06243y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2309oo
    public final void stop() {
        AbstractC06243y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
