package defpackage;

import com.ybsdk.feature.pdf.api.PdfType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class sqa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PdfType.values().length];
        try {
            iArr[PdfType.REPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PdfType.DEPOSIT_TERMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PdfType.CREDIT_TERMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
