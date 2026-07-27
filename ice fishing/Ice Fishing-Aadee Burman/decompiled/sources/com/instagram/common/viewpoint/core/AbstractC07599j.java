package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC07599j implements InterfaceC2212nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2400qI[] A04;
    public final int A05;
    public final C2363pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC07599j(C2363pg c2363pg, int[] iArr, int i) {
        AbstractC06243y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C2363pg) AbstractC06243y.A01(c2363pg);
        this.A05 = iArr.length;
        this.A04 = new C2400qI[this.A05];
        for (int i6 = 0; i6 < i; i6++) {
            C2400qI[] c2400qIArr = this.A04;
            int i9 = iArr[i6];
            c2400qIArr[i6] = c2363pg.A08(i9);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC07599j.A07((C2400qI) obj, (C2400qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i10 = 0; i10 < i; i10++) {
            int[] iArr2 = this.A07;
            int i11 = c2363pg.A07(this.A04[i10]);
            iArr2[i10] = i11;
        }
        int i12 = this.A05;
        this.A03 = new long[i12];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2400qI c2400qI, C2400qI c2400qI2) {
        return c2400qI2.A05 - c2400qI.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2212nE
    public void A5x() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2212nE
    public void A6K() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0883Eq
    public final C2400qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0883Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2212nE
    public final C2400qI A92() {
        return this.A04[A93()];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0883Eq
    public final C2363pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0883Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i6 = 0; i6 < i; i6++) {
            int i9 = this.A07[i6];
            if (i9 == i) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2212nE
    public void AFJ(float f3) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC07599j abstractC07599j = (AbstractC07599j) obj;
        return this.A06 == abstractC07599j.A06 && Arrays.equals(this.A07, abstractC07599j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0883Eq
    public final int length() {
        return this.A07.length;
    }
}
