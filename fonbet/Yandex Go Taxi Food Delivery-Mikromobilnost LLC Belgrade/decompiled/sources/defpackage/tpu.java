package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.b;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.WebViewContainer;
import java.util.Collections;
import java.util.List;
import kotlin.a;

/* loaded from: classes2.dex */
public final class tpu extends d35 {
    public final i3y u;

    public tpu(boolean z, boolean z2, WebViewContainer webViewContainer, p3d0 p3d0Var, j2n j2nVar, sls slsVar, so41 so41Var, tls tlsVar, wls wlsVar, i4b0 i4b0Var, wls wlsVar2, ul60 ul60Var, b bVar, long j, zqc zqcVar, y4d0 y4d0Var, spu spuVar, WebViewType webViewType, jse jseVar) {
        super(z, z2, webViewContainer, p3d0Var, j2nVar, slsVar, null, so41Var, tlsVar, wlsVar, i4b0Var, null, wlsVar2, ul60Var, bVar, false, j, jseVar, 2112);
        this.u = a.a(new jo0(spuVar, zqcVar, y4d0Var, webViewType, 14));
    }

    @Override // defpackage.d35
    public final List j() {
        return Collections.singletonList((com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.u.getValue());
    }
}
