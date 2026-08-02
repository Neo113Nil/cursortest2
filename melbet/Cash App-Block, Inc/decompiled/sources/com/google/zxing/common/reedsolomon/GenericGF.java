package com.google.zxing.common.reedsolomon;

import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class GenericGF {
    public static final GenericGF QR_CODE_FIELD_256;
    public final int[] expTable;
    public final int generatorBase;
    public final int[] logTable;
    public final GenericGFPoly one;
    public final int primitive;
    public final int size;
    public final GenericGFPoly zero;

    static {
        new GenericGF(4201, 4096, 1);
        new GenericGF(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL, 1024, 1);
        new GenericGF(67, 64, 1);
        new GenericGF(19, 16, 1);
        QR_CODE_FIELD_256 = new GenericGF(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 256, 0);
        new GenericGF(EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 256, 1);
    }

    public GenericGF(int i, int i2, int i3) {
        this.primitive = i;
        this.size = i2;
        this.generatorBase = i3;
        this.expTable = new int[i2];
        this.logTable = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.expTable[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.logTable[this.expTable[i6]] = i6;
        }
        this.zero = new GenericGFPoly(this, new int[]{0});
        this.one = new GenericGFPoly(this, new int[]{1});
    }

    public final GenericGFPoly buildMonomial(int i, int i2) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        if (i2 == 0) {
            return this.zero;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new GenericGFPoly(this, iArr);
    }

    public final int inverse(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.expTable[(this.size - this.logTable[i]) - 1];
    }

    public final int multiply(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.logTable;
        return this.expTable[(iArr[i] + iArr[i2]) % (this.size - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.primitive));
        sb.append(',');
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.size, ')');
    }
}
