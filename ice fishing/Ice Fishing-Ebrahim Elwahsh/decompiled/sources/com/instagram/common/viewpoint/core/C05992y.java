package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05992y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C05992y(C05982x c05982x) {
        boolean z8;
        boolean z9;
        UUID uuid;
        Uri uri;
        Map<String, String> map;
        Map<String, String> map2;
        boolean z10;
        boolean z11;
        boolean z12;
        List<Integer> list;
        List<Integer> list2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Uri uri2;
        z8 = c05982x.A04;
        if (z8) {
            uri2 = c05982x.A00;
            if (uri2 == null) {
                z9 = false;
                AbstractC06233y.A08(z9);
                uuid = c05982x.A03;
                this.A05 = (UUID) AbstractC06233y.A01(uuid);
                this.A06 = this.A05;
                uri = c05982x.A00;
                this.A00 = uri;
                map = c05982x.A02;
                this.A04 = map;
                map2 = c05982x.A02;
                this.A03 = map2;
                z10 = c05982x.A05;
                this.A08 = z10;
                z11 = c05982x.A04;
                this.A07 = z11;
                z12 = c05982x.A06;
                this.A09 = z12;
                list = c05982x.A01;
                this.A02 = list;
                list2 = c05982x.A01;
                this.A01 = list2;
                bArr = c05982x.A07;
                if (bArr == null) {
                    bArr3 = c05982x.A07;
                    bArr4 = c05982x.A07;
                    bArr2 = Arrays.copyOf(bArr3, bArr4.length);
                } else {
                    bArr2 = null;
                }
                this.A0A = bArr2;
            }
        }
        z9 = true;
        AbstractC06233y.A08(z9);
        uuid = c05982x.A03;
        this.A05 = (UUID) AbstractC06233y.A01(uuid);
        this.A06 = this.A05;
        uri = c05982x.A00;
        this.A00 = uri;
        map = c05982x.A02;
        this.A04 = map;
        map2 = c05982x.A02;
        this.A03 = map2;
        z10 = c05982x.A05;
        this.A08 = z10;
        z11 = c05982x.A04;
        this.A07 = z11;
        z12 = c05982x.A06;
        this.A09 = z12;
        list = c05982x.A01;
        this.A02 = list;
        list2 = c05982x.A01;
        this.A01 = list2;
        bArr = c05982x.A07;
        if (bArr == null) {
        }
        this.A0A = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05992y)) {
            return false;
        }
        C05992y c05992y = (C05992y) obj;
        if (this.A05.equals(c05992y.A05) && C5C.A1E(this.A00, c05992y.A00) && C5C.A1E(this.A03, c05992y.A03) && this.A08 == c05992y.A08 && this.A07 == c05992y.A07 && this.A09 == c05992y.A09 && this.A01.equals(c05992y.A01) && Arrays.equals(this.A0A, c05992y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
