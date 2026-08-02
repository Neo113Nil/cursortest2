package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2329oo, InterfaceC07397p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C07427s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2420qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1986ir A0B = EnumC1986ir.A09;
    public final C07236z A0D = new C07236z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j6, boolean z6) throws AD;

    public abstract void A1c(C2420qI[] c2420qIArr, long j6, long j9) throws AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j6, boolean z6) throws AD {
        this.A08 = false;
        this.A02 = j6;
        this.A03 = j6;
        A1a(j6, z6);
    }

    public final int A1Q(long j6) {
        return ((DT) AbstractC06443y.A01(this.A07)).AK2(j6 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C07236z c07236z, C2341p0 c2341p0, int i) {
        int AHP = ((DT) AbstractC06443y.A01(this.A07)).AHP(c07236z, c2341p0, i);
        if (AHP == -4) {
            if (c2341p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2341p0.A00 = c2341p0.A01;
            c2341p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2341p0.A01);
        } else if (AHP == -5) {
            C2420qI c2420qI = (C2420qI) AbstractC06443y.A01(c07236z.A00);
            if (c2420qI.A0M != Long.MAX_VALUE) {
                c07236z.A00 = c2420qI.A07().A0s(c2420qI.A0M + this.A04).A14();
            }
        }
        return AHP;
    }

    public final AD A1S(Throwable th, C2420qI c2420qI, int i) {
        return A1T(th, c2420qI, false, i);
    }

    public final AD A1T(Throwable th, C2420qI c2420qI, boolean z6, int i) {
        int i4 = 4;
        if (c2420qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2420qI);
                i4 = AbstractC07327i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c2420qI, i4, z6, i);
    }

    public final C07236z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C07427s A1V() {
        return (C07427s) AbstractC06443y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC06443y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z6, boolean z9) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC06443y.A01(this.A07)).AAe();
    }

    public final C2420qI[] A1e() {
        return (C2420qI[]) AbstractC06443y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void A5x() {
        AbstractC06443y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void A6L(C07427s c07427s, C2420qI[] c2420qIArr, DT dt, long j6, boolean z6, boolean z9, long j9, long j10) throws AD {
        AbstractC06443y.A08(this.A01 == 0);
        this.A05 = c07427s;
        this.A01 = 1;
        A1b(z6, z9);
        AIa(c2420qIArr, dt, j9, j10);
        A1P(j6, z6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final InterfaceC07397p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1986ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo, com.instagram.common.viewpoint.core.InterfaceC07397p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07267c
    public void A9i(int i, Object obj) throws AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void AA9(int i, C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void ACU() throws IOException {
        ((DT) AbstractC06443y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void AIa(C2420qI[] c2420qIArr, DT dt, long j6, long j9) throws AD {
        AbstractC06443y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j6;
        }
        this.A0A = c2420qIArr;
        this.A04 = j9;
        A1c(c2420qIArr, j6, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void AIm(long j6) throws AD {
        A1P(j6, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void start() throws AD {
        AbstractC06443y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2329oo
    public final void stop() {
        AbstractC06443y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
