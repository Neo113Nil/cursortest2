package defpackage;

import android.net.Uri;
import com.ybsdk.feature.pdf.api.PdfType;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class tqa0 {
    public final b a;

    public tqa0(b bVar) {
        this.a = bVar;
    }

    public static DeeplinkAction.PdfLoad a(Uri uri) {
        Object obj;
        String o = bzk0.o(uri, SdkUri$QueryParam.TYPE);
        Iterator<E> it = PdfType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((PdfType) obj).getValue(), o)) {
                break;
            }
        }
        PdfType pdfType = (PdfType) obj;
        if (pdfType == null) {
            x4c.g("Incorrect parameters for pdf load parser", null, "type = null", null, 10);
            return null;
        }
        int i = sqa0.a[pdfType.ordinal()];
        if (i == 1) {
            String o2 = bzk0.o(uri, SdkUri$QueryParam.FILE_NAME);
            boolean i2 = bzk0.i(uri, SdkUri$QueryParam.IS_SHARING_ENABLED, false);
            String o3 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
            String o4 = bzk0.o(uri, SdkUri$QueryParam.REPORT_TYPE);
            if (o4 == null) {
                x4c.g("Incorrect parameters for pdf load parser", null, "reportType = null", null, 10);
                return null;
            }
            String o5 = bzk0.o(uri, SdkUri$QueryParam.REPORT_VERSION);
            if (o5 != null) {
                return new DeeplinkAction.PdfLoad.Report(o2, i2, o3, o4, o5, bzk0.o(uri, SdkUri$QueryParam.OPERATION_ID), bzk0.o(uri, SdkUri$QueryParam.OPERATION_TIMESTAMP));
            }
            x4c.g("Incorrect parameters for pdf load parser", null, "reportVersion = null", null, 10);
            return null;
        }
        if (i == 2) {
            PdfType pdfType2 = PdfType.DEPOSIT_TERMS;
            String o6 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
            if (o6 == null) {
                x4c.g("Incorrect parameters for pdf load parser", null, g8e.o("agreementId = null with type = ", pdfType2.getValue()), null, 10);
                return null;
            }
            return new DeeplinkAction.PdfLoad.DepositTariff(o6, bzk0.o(uri, SdkUri$QueryParam.FILE_NAME), bzk0.i(uri, SdkUri$QueryParam.IS_SHARING_ENABLED, false));
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        PdfType pdfType3 = PdfType.CREDIT_TERMS;
        String o7 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
        if (o7 == null) {
            x4c.g("Incorrect parameters for pdf load parser", null, g8e.o("agreementId = null with type = ", pdfType3.getValue()), null, 10);
            return null;
        }
        return new DeeplinkAction.PdfLoad.CreditTerms(o7, bzk0.o(uri, SdkUri$QueryParam.FILE_NAME), bzk0.i(uri, SdkUri$QueryParam.IS_SHARING_ENABLED, false));
    }

    public final DeeplinkAction.PdfPreview b(Uri uri, boolean z) {
        Uri b;
        String uri2;
        b = e6b1.b(uri, this.a, z, SdkUri$QueryParam.URL);
        if (b != null && (uri2 = b.toString()) != null) {
            return new DeeplinkAction.PdfPreview(uri2, bzk0.o(uri, SdkUri$QueryParam.FILE_NAME), bzk0.i(uri, SdkUri$QueryParam.IS_SHARING_ENABLED, false));
        }
        x4c.g("Incorrect parameters for pdf preview parser", null, "url = null", null, 10);
        return null;
    }
}
