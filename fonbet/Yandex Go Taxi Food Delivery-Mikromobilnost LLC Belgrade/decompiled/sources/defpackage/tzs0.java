package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.b;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.WebViewContainer;
import java.util.Collections;
import java.util.List;
import kotlin.a;

/* loaded from: classes2.dex */
public final class tzs0 extends d35 {
    public final i3y u;

    public tzs0(boolean z, boolean z2, WebViewContainer webViewContainer, p3d0 p3d0Var, j2n j2nVar, sls slsVar, so41 so41Var, tls tlsVar, wls wlsVar, k7d0 k7d0Var, tls tlsVar2, wls wlsVar2, ul60 ul60Var, b bVar, long j, zqc zqcVar, szs0 szs0Var, WebViewType webViewType, jse jseVar) {
        super(z, z2, webViewContainer, p3d0Var, j2nVar, slsVar, null, so41Var, tlsVar, wlsVar, k7d0Var, tlsVar2, wlsVar2, ul60Var, bVar, true, j, jseVar, 64);
        this.u = a.a(new xlp0(10, szs0Var, zqcVar, webViewType));
    }

    @Override // defpackage.d35
    public final List j() {
        return Collections.singletonList((com.yandex.plus.home.feature.webviews.internal.smart.contract.a) this.u.getValue());
    }
}
