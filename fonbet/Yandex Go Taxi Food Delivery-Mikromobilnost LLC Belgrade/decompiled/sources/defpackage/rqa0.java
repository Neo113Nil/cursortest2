package defpackage;

import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;

/* loaded from: classes3.dex */
public abstract class rqa0 {
    public static final boolean a(PdfLoaderScreenParams pdfLoaderScreenParams) {
        if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.Base) {
            return ((PdfLoaderScreenParams.Base) pdfLoaderScreenParams).isSharingEnabled();
        }
        if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.DepositTerms) {
            return ((PdfLoaderScreenParams.DepositTerms) pdfLoaderScreenParams).isSharingEnabled();
        }
        if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadFromUrl) {
            return ((PdfLoaderScreenParams.LoadFromUrl) pdfLoaderScreenParams).isSharingEnabled();
        }
        if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.CreditTerms) {
            return ((PdfLoaderScreenParams.CreditTerms) pdfLoaderScreenParams).isSharingEnabled();
        }
        if (!(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.SplitContractDraft) && !(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadById)) {
            w511.b();
        }
        return false;
    }
}
