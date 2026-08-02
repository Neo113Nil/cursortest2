package io.scer.pdfx;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/scer/pdfx/PdfRendererException;", "Ljava/lang/RuntimeException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "", "details", "Ljava/lang/Object;", "pdfx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PdfRendererException extends RuntimeException {
    private final String code;
    private Object details;

    public PdfRendererException(String str, Object obj) {
        super(str);
        this.code = "pdf_renderer";
        if (obj != null) {
            this.details = obj;
        }
    }
}
