package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC07589j implements InterfaceC2211nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2399qI[] A04;
    public final int A05;
    public final C2362pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC07589j(C2362pg c2362pg, int[] iArr, int i) {
        AbstractC06233y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C2362pg) AbstractC06233y.A01(c2362pg);
        this.A05 = iArr.length;
        this.A04 = new C2399qI[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            C2399qI[] c2399qIArr = this.A04;
            int i9 = iArr[i4];
            c2399qIArr[i4] = c2362pg.A08(i9);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC07589j.A07((C2399qI) obj, (C2399qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i10 = 0; i10 < i; i10++) {
            int[] iArr2 = this.A07;
            int i11 = c2362pg.A07(this.A04[i10]);
            iArr2[i10] = i11;
        }
        int i12 = this.A05;
        this.A03 = new long[i12];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2399qI c2399qI, C2399qI c2399qI2) {
        return c2399qI2.A05 - c2399qI.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2211nE
    public void A5x() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2211nE
    public void A6K() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Eq
    public final C2399qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2211nE
    public final C2399qI A92() {
        return this.A04[A93()];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Eq
    public final C2362pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i4 = 0; i4 < i; i4++) {
            int i9 = this.A07[i4];
            if (i9 == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2211nE
    public void AFJ(float f6) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC07589j abstractC07589j = (AbstractC07589j) obj;
        return this.A06 == abstractC07589j.A06 && Arrays.equals(this.A07, abstractC07589j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Eq
    public final int length() {
        return this.A07.length;
    }
}
