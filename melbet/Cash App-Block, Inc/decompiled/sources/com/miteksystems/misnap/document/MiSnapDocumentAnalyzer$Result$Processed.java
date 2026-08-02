package com.miteksystems.misnap.document;

import android.graphics.Point;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.miteksystems.misnap.core.DocumentExtraction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.SchemaFactory;

/* loaded from: classes4.dex */
public final class MiSnapDocumentAnalyzer$Result$Processed extends SchemaFactory {
    public final DocumentIqasResult a;
    public final ArrayList b;
    public final ArrayList c;
    public final int[][] d;
    public final int[][] e;
    public final DocumentExtraction f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DocumentCheck {
        public static final DocumentCheck IS_CORRECT_DOCUMENT;
        public static final DocumentCheck IS_WITHIN_MAX_BRIGHTNESS;
        public static final DocumentCheck IS_WITHIN_MAX_BUSY_BACKGROUND;
        public static final DocumentCheck IS_WITHIN_MAX_GLARE;
        public static final DocumentCheck IS_WITHIN_MAX_ROTATION_ANGLE;
        public static final DocumentCheck IS_WITHIN_MAX_SKEW_ANGLE;
        public static final DocumentCheck IS_WITHIN_MIN_BRIGHTNESS;
        public static final DocumentCheck IS_WITHIN_MIN_CONTRAST;
        public static final DocumentCheck IS_WITHIN_MIN_EXTRACTION_CONFIDENCE;
        public static final DocumentCheck IS_WITHIN_MIN_FOUR_CORNER_CONFIDENCE;
        public static final DocumentCheck IS_WITHIN_MIN_HORIZONTAL_FILL;
        public static final DocumentCheck IS_WITHIN_MIN_PADDING;
        public static final DocumentCheck IS_WITHIN_MIN_SHARPNESS;
        public static final /* synthetic */ DocumentCheck[] a;

        static {
            DocumentCheck documentCheck = new DocumentCheck("IS_WITHIN_MIN_FOUR_CORNER_CONFIDENCE", 0);
            IS_WITHIN_MIN_FOUR_CORNER_CONFIDENCE = documentCheck;
            DocumentCheck documentCheck2 = new DocumentCheck("IS_WITHIN_MIN_HORIZONTAL_FILL", 1);
            IS_WITHIN_MIN_HORIZONTAL_FILL = documentCheck2;
            DocumentCheck documentCheck3 = new DocumentCheck("IS_WITHIN_MIN_BRIGHTNESS", 2);
            IS_WITHIN_MIN_BRIGHTNESS = documentCheck3;
            DocumentCheck documentCheck4 = new DocumentCheck("IS_WITHIN_MAX_BRIGHTNESS", 3);
            IS_WITHIN_MAX_BRIGHTNESS = documentCheck4;
            DocumentCheck documentCheck5 = new DocumentCheck("IS_WITHIN_MAX_SKEW_ANGLE", 4);
            IS_WITHIN_MAX_SKEW_ANGLE = documentCheck5;
            DocumentCheck documentCheck6 = new DocumentCheck("IS_WITHIN_MIN_SHARPNESS", 5);
            IS_WITHIN_MIN_SHARPNESS = documentCheck6;
            DocumentCheck documentCheck7 = new DocumentCheck("IS_WITHIN_MIN_PADDING", 6);
            IS_WITHIN_MIN_PADDING = documentCheck7;
            DocumentCheck documentCheck8 = new DocumentCheck("IS_WITHIN_MAX_ROTATION_ANGLE", 7);
            IS_WITHIN_MAX_ROTATION_ANGLE = documentCheck8;
            DocumentCheck documentCheck9 = new DocumentCheck("IS_WITHIN_MIN_CONTRAST", 8);
            IS_WITHIN_MIN_CONTRAST = documentCheck9;
            DocumentCheck documentCheck10 = new DocumentCheck("IS_WITHIN_MAX_BUSY_BACKGROUND", 9);
            IS_WITHIN_MAX_BUSY_BACKGROUND = documentCheck10;
            DocumentCheck documentCheck11 = new DocumentCheck("IS_WITHIN_MAX_GLARE", 10);
            IS_WITHIN_MAX_GLARE = documentCheck11;
            DocumentCheck documentCheck12 = new DocumentCheck("IS_CORRECT_DOCUMENT", 11);
            IS_CORRECT_DOCUMENT = documentCheck12;
            DocumentCheck documentCheck13 = new DocumentCheck("IS_WITHIN_MIN_EXTRACTION_CONFIDENCE", 12);
            IS_WITHIN_MIN_EXTRACTION_CONFIDENCE = documentCheck13;
            a = new DocumentCheck[]{documentCheck, documentCheck2, documentCheck3, documentCheck4, documentCheck5, documentCheck6, documentCheck7, documentCheck8, documentCheck9, documentCheck10, documentCheck11, documentCheck12, documentCheck13};
        }

        public static DocumentCheck valueOf(String str) {
            return (DocumentCheck) Enum.valueOf(DocumentCheck.class, str);
        }

        public static DocumentCheck[] values() {
            return (DocumentCheck[]) a.clone();
        }
    }

    public final class DocumentIqasResult {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final Point[] l;
        public final Point[] m;
        public final Point[] n;

        public DocumentIqasResult(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Point[] pointArr, Point[] pointArr2, Point[] pointArr3) {
            pointArr.getClass();
            pointArr2.getClass();
            pointArr3.getClass();
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
            this.l = pointArr;
            this.m = pointArr2;
            this.n = pointArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentIqasResult)) {
                return false;
            }
            DocumentIqasResult documentIqasResult = (DocumentIqasResult) obj;
            return this.a == documentIqasResult.a && this.b == documentIqasResult.b && this.c == documentIqasResult.c && this.d == documentIqasResult.d && this.e == documentIqasResult.e && this.f == documentIqasResult.f && this.g == documentIqasResult.g && this.h == documentIqasResult.h && this.i == documentIqasResult.i && this.j == documentIqasResult.j && this.k == documentIqasResult.k && Intrinsics.areEqual(this.l, documentIqasResult.l) && Intrinsics.areEqual(this.m, documentIqasResult.m) && Intrinsics.areEqual(this.n, documentIqasResult.n);
        }

        public final int hashCode() {
            return ((((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.k, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.j, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.i, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.h, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.g, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.e, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.d, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.c, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31) + Arrays.hashCode(this.l)) * 31) + Arrays.hashCode(this.m)) * 31) + Arrays.hashCode(this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DocumentIqasResult(brightness=");
            sb.append(this.a);
            sb.append(", sharpness=");
            sb.append(this.b);
            sb.append(", fourCornerConfidence=");
            sb.append(this.c);
            sb.append(", skewAngle=");
            sb.append(this.d);
            sb.append(", rotationAngle=");
            sb.append(this.e);
            sb.append(", horizontalFill=");
            sb.append(this.f);
            sb.append(", padding=");
            sb.append(this.g);
            sb.append(", noGlareConfidence=");
            sb.append(this.h);
            sb.append(", solidBackgroundConfidence=");
            sb.append(this.i);
            sb.append(", contrastConfidence=");
            sb.append(this.j);
            sb.append(", mrzConfidence=");
            sb.append(this.k);
            sb.append(", fourCorners=");
            sb.append(Arrays.toString(this.l));
            sb.append(", documentBoundingBox=");
            sb.append(Arrays.toString(this.m));
            sb.append(", glareBoundingBox=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, Arrays.toString(this.n), ')');
        }
    }

    public MiSnapDocumentAnalyzer$Result$Processed(DocumentIqasResult documentIqasResult, ArrayList arrayList, ArrayList arrayList2, int[][] iArr, int[][] iArr2, DocumentExtraction documentExtraction, boolean z) {
        this.a = documentIqasResult;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = iArr;
        this.e = iArr2;
        this.f = documentExtraction;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiSnapDocumentAnalyzer$Result$Processed)) {
            return false;
        }
        MiSnapDocumentAnalyzer$Result$Processed miSnapDocumentAnalyzer$Result$Processed = (MiSnapDocumentAnalyzer$Result$Processed) obj;
        return this.a.equals(miSnapDocumentAnalyzer$Result$Processed.a) && this.b.equals(miSnapDocumentAnalyzer$Result$Processed.b) && this.c.equals(miSnapDocumentAnalyzer$Result$Processed.c) && this.d.equals(miSnapDocumentAnalyzer$Result$Processed.d) && this.e.equals(miSnapDocumentAnalyzer$Result$Processed.e) && this.f.equals(miSnapDocumentAnalyzer$Result$Processed.f) && this.g == miSnapDocumentAnalyzer$Result$Processed.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + CameraState$Type$EnumUnboxingLocalUtility.m(this.c, CameraState$Type$EnumUnboxingLocalUtility.m(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Processed(documentIqasResult=");
        sb.append(this.a);
        sb.append(", passedDocumentChecks=");
        sb.append(this.b);
        sb.append(", skippedDocumentChecks=");
        sb.append(this.c);
        sb.append(", fourCorners=");
        sb.append(Arrays.toString(this.d));
        sb.append(", glareCorners=");
        sb.append(Arrays.toString(this.e));
        sb.append(", extraction=");
        sb.append(this.f);
        sb.append(", licenseExpired=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.g, ')');
    }
}
