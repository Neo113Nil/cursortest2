package ru.yandex.logistics.sdk.webview.impl.impl;

import defpackage.ei7;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryCallJsInterfaceFactory$applyPlugins$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        tls tlsVar = ((a) this.receiver).a;
        try {
            tlsVar.invoke(new JSONObject(str).optString(ACSPConstants.STATUS));
            return new ei7("{}", null);
        } catch (Exception e) {
            tlsVar.invoke(null);
            String message = e.getMessage();
            return new ei7(null, message != null ? message : "{}");
        }
    }
}
