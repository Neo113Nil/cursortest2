package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC07799j implements InterfaceC2232nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2420qI[] A04;
    public final int A05;
    public final C2383pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC07799j(C2383pg c2383pg, int[] iArr, int i) {
        AbstractC06443y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C2383pg) AbstractC06443y.A01(c2383pg);
        this.A05 = iArr.length;
        this.A04 = new C2420qI[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            C2420qI[] c2420qIArr = this.A04;
            int i6 = iArr[i4];
            c2420qIArr[i4] = c2383pg.A08(i6);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC07799j.A07((C2420qI) obj, (C2420qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i9 = 0; i9 < i; i9++) {
            int[] iArr2 = this.A07;
            int i10 = c2383pg.A07(this.A04[i9]);
            iArr2[i9] = i10;
        }
        int i11 = this.A05;
        this.A03 = new long[i11];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2420qI c2420qI, C2420qI c2420qI2) {
        return c2420qI2.A05 - c2420qI.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2232nE
    public void A5x() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2232nE
    public void A6K() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0903Eq
    public final C2420qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0903Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2232nE
    public final C2420qI A92() {
        return this.A04[A93()];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0903Eq
    public final C2383pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0903Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = this.A07[i4];
            if (i6 == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2232nE
    public void AFJ(float f2) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC07799j abstractC07799j = (AbstractC07799j) obj;
        return this.A06 == abstractC07799j.A06 && Arrays.equals(this.A07, abstractC07799j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0903Eq
    public final int length() {
        return this.A07.length;
    }
}
