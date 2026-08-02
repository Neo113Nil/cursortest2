package com.knotapi.knot.utilities;

import android.webkit.ValueCallback;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.utilities.SsoCookieHelper;
import com.knotapi.knot.utilities.WebViewDataProcessor;

/* loaded from: classes4.dex */
public final /* synthetic */ class SsoCookieHelper$1$$ExternalSyntheticLambda0 implements ValueCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SsoCookieHelper$1$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((SsoCookieHelper.AnonymousClass1) obj3).lambda$onJSCodeFetched$0((String) obj2, (String) obj);
                break;
            default:
                WebViewDataProcessor.lambda$processStorageDataAsync$0((MerchantWebViewData.Builder) obj3, (WebViewDataProcessor.DataProcessingCallback) obj2, (String) obj);
                break;
        }
    }
}
