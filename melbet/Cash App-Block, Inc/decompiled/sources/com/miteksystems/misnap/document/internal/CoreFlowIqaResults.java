package com.miteksystems.misnap.document.internal;

import android.graphics.Point;
import com.miteksystems.misnap.document.internal.BaseDocument;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CoreFlowIqaResults {
    private int brightness;
    private int contrastConfidence;
    private Point[] documentBoundingBox;
    private BaseDocument documentOcr;
    private int fourCornerConfidence;
    private Point[] fourCorners;
    private Point[] glareBoundingBox;
    private int horizontalFill;
    private int mrzConfidence;
    private int noGlareConfidence;
    private int padding;
    private int rotationAngle;
    private int sharpness;
    private int skewAngle;
    private int solidBackgroundConfidence;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CoreFlowIqaResults(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Point[] pointArr, Point[] pointArr2, Point[] pointArr3, BaseDocument baseDocument, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(r33, r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r12, r15, r13, (i12 & 16384) != 0 ? BaseDocument.Default.INSTANCE : baseDocument);
        Point[] pointArr4;
        Point[] pointArr5;
        Point[] pointArr6;
        int i13 = i12 & 1;
        int i14 = PKIFailureInfo.systemUnavail;
        int i15 = i13 != 0 ? Integer.MIN_VALUE : i;
        int i16 = (i12 & 2) != 0 ? Integer.MIN_VALUE : i2;
        int i17 = (i12 & 4) != 0 ? Integer.MIN_VALUE : i3;
        int i18 = (i12 & 8) != 0 ? Integer.MIN_VALUE : i4;
        int i19 = (i12 & 16) != 0 ? Integer.MIN_VALUE : i5;
        int i20 = (i12 & 32) != 0 ? Integer.MIN_VALUE : i6;
        int i21 = (i12 & 64) != 0 ? Integer.MIN_VALUE : i7;
        int i22 = (i12 & 128) != 0 ? Integer.MIN_VALUE : i8;
        int i23 = (i12 & 256) != 0 ? Integer.MIN_VALUE : i9;
        int i24 = (i12 & 512) != 0 ? Integer.MIN_VALUE : i10;
        i14 = (i12 & 1024) == 0 ? i11 : i14;
        int i25 = 0;
        if ((i12 & 2048) != 0) {
            pointArr4 = new Point[4];
            int i26 = 0;
            for (int i27 = 4; i26 < i27; i27 = 4) {
                pointArr4[i26] = new Point(0, 0);
                i26++;
            }
        } else {
            pointArr4 = pointArr;
        }
        if ((i12 & 4096) != 0) {
            pointArr5 = new Point[2];
            for (int i28 = 2; i25 < i28; i28 = 2) {
                pointArr5[i25] = new Point(0, 0);
                i25++;
                i15 = i15;
            }
        } else {
            pointArr5 = pointArr2;
        }
        int i29 = i15;
        if ((i12 & PKIFailureInfo.certRevoked) != 0) {
            pointArr6 = new Point[4];
            int i30 = 0;
            for (int i31 = 4; i30 < i31; i31 = 4) {
                pointArr6[i30] = new Point(0, 0);
                i30++;
                i14 = i14;
            }
        } else {
            pointArr6 = pointArr3;
        }
    }

    public final int component1() {
        return this.brightness;
    }

    public final int component10() {
        return this.contrastConfidence;
    }

    public final int component11() {
        return this.mrzConfidence;
    }

    public final Point[] component12() {
        return this.fourCorners;
    }

    public final Point[] component13() {
        return this.documentBoundingBox;
    }

    public final Point[] component14() {
        return this.glareBoundingBox;
    }

    public final BaseDocument component15() {
        return this.documentOcr;
    }

    public final int component2() {
        return this.sharpness;
    }

    public final int component3() {
        return this.fourCornerConfidence;
    }

    public final int component4() {
        return this.skewAngle;
    }

    public final int component5() {
        return this.rotationAngle;
    }

    public final int component6() {
        return this.horizontalFill;
    }

    public final int component7() {
        return this.padding;
    }

    public final int component8() {
        return this.noGlareConfidence;
    }

    public final int component9() {
        return this.solidBackgroundConfidence;
    }

    public final CoreFlowIqaResults copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Point[] pointArr, Point[] pointArr2, Point[] pointArr3, BaseDocument baseDocument) {
        pointArr.getClass();
        pointArr2.getClass();
        pointArr3.getClass();
        baseDocument.getClass();
        return new CoreFlowIqaResults(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, pointArr, pointArr2, pointArr3, baseDocument);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreFlowIqaResults)) {
            return false;
        }
        CoreFlowIqaResults coreFlowIqaResults = (CoreFlowIqaResults) obj;
        return this.brightness == coreFlowIqaResults.brightness && this.sharpness == coreFlowIqaResults.sharpness && this.fourCornerConfidence == coreFlowIqaResults.fourCornerConfidence && this.skewAngle == coreFlowIqaResults.skewAngle && this.rotationAngle == coreFlowIqaResults.rotationAngle && this.horizontalFill == coreFlowIqaResults.horizontalFill && this.padding == coreFlowIqaResults.padding && this.noGlareConfidence == coreFlowIqaResults.noGlareConfidence && this.solidBackgroundConfidence == coreFlowIqaResults.solidBackgroundConfidence && this.contrastConfidence == coreFlowIqaResults.contrastConfidence && this.mrzConfidence == coreFlowIqaResults.mrzConfidence && Intrinsics.areEqual(this.fourCorners, coreFlowIqaResults.fourCorners) && Intrinsics.areEqual(this.documentBoundingBox, coreFlowIqaResults.documentBoundingBox) && Intrinsics.areEqual(this.glareBoundingBox, coreFlowIqaResults.glareBoundingBox) && Intrinsics.areEqual(this.documentOcr, coreFlowIqaResults.documentOcr);
    }

    public final int getBrightness() {
        return this.brightness;
    }

    public final int getContrastConfidence() {
        return this.contrastConfidence;
    }

    public final Point[] getDocumentBoundingBox() {
        return this.documentBoundingBox;
    }

    public final BaseDocument getDocumentOcr() {
        return this.documentOcr;
    }

    public final int getFourCornerConfidence() {
        return this.fourCornerConfidence;
    }

    public final Point[] getFourCorners() {
        return this.fourCorners;
    }

    public final Point[] getGlareBoundingBox() {
        return this.glareBoundingBox;
    }

    public final int getHorizontalFill() {
        return this.horizontalFill;
    }

    public final int getMrzConfidence() {
        return this.mrzConfidence;
    }

    public final int getNoGlareConfidence() {
        return this.noGlareConfidence;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final int getRotationAngle() {
        return this.rotationAngle;
    }

    public final int getSharpness() {
        return this.sharpness;
    }

    public final int getSkewAngle() {
        return this.skewAngle;
    }

    public final int getSolidBackgroundConfidence() {
        return this.solidBackgroundConfidence;
    }

    public int hashCode() {
        return this.documentOcr.hashCode() + ((((((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mrzConfidence, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.contrastConfidence, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.solidBackgroundConfidence, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.noGlareConfidence, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.padding, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.horizontalFill, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rotationAngle, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.skewAngle, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fourCornerConfidence, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sharpness, Integer.hashCode(this.brightness) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31) + Arrays.hashCode(this.fourCorners)) * 31) + Arrays.hashCode(this.documentBoundingBox)) * 31) + Arrays.hashCode(this.glareBoundingBox)) * 31);
    }

    public final void setBrightness(int i) {
        this.brightness = i;
    }

    public final void setContrastConfidence(int i) {
        this.contrastConfidence = i;
    }

    public final void setDocumentBoundingBox(Point[] pointArr) {
        pointArr.getClass();
        this.documentBoundingBox = pointArr;
    }

    public final void setDocumentOcr(BaseDocument baseDocument) {
        baseDocument.getClass();
        this.documentOcr = baseDocument;
    }

    public final void setFourCornerConfidence(int i) {
        this.fourCornerConfidence = i;
    }

    public final void setFourCorners(Point[] pointArr) {
        pointArr.getClass();
        this.fourCorners = pointArr;
    }

    public final void setGlareBoundingBox(Point[] pointArr) {
        pointArr.getClass();
        this.glareBoundingBox = pointArr;
    }

    public final void setHorizontalFill(int i) {
        this.horizontalFill = i;
    }

    public final void setMrzConfidence(int i) {
        this.mrzConfidence = i;
    }

    public final void setNoGlareConfidence(int i) {
        this.noGlareConfidence = i;
    }

    public final void setPadding(int i) {
        this.padding = i;
    }

    public final void setRotationAngle(int i) {
        this.rotationAngle = i;
    }

    public final void setSharpness(int i) {
        this.sharpness = i;
    }

    public final void setSkewAngle(int i) {
        this.skewAngle = i;
    }

    public final void setSolidBackgroundConfidence(int i) {
        this.solidBackgroundConfidence = i;
    }

    public String toString() {
        return "CoreFlowIqaResults(brightness=" + this.brightness + ", sharpness=" + this.sharpness + ", fourCornerConfidence=" + this.fourCornerConfidence + ", skewAngle=" + this.skewAngle + ", rotationAngle=" + this.rotationAngle + ", horizontalFill=" + this.horizontalFill + ", padding=" + this.padding + ", noGlareConfidence=" + this.noGlareConfidence + ", solidBackgroundConfidence=" + this.solidBackgroundConfidence + ", contrastConfidence=" + this.contrastConfidence + ", mrzConfidence=" + this.mrzConfidence + ", fourCorners=" + Arrays.toString(this.fourCorners) + ", documentBoundingBox=" + Arrays.toString(this.documentBoundingBox) + ", glareBoundingBox=" + Arrays.toString(this.glareBoundingBox) + ", documentOcr=" + this.documentOcr + ')';
    }

    public CoreFlowIqaResults(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Point[] pointArr, Point[] pointArr2, Point[] pointArr3, BaseDocument baseDocument) {
        pointArr.getClass();
        pointArr2.getClass();
        pointArr3.getClass();
        baseDocument.getClass();
        this.brightness = i;
        this.sharpness = i2;
        this.fourCornerConfidence = i3;
        this.skewAngle = i4;
        this.rotationAngle = i5;
        this.horizontalFill = i6;
        this.padding = i7;
        this.noGlareConfidence = i8;
        this.solidBackgroundConfidence = i9;
        this.contrastConfidence = i10;
        this.mrzConfidence = i11;
        this.fourCorners = pointArr;
        this.documentBoundingBox = pointArr2;
        this.glareBoundingBox = pointArr3;
        this.documentOcr = baseDocument;
    }

    public CoreFlowIqaResults() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
    }
}
