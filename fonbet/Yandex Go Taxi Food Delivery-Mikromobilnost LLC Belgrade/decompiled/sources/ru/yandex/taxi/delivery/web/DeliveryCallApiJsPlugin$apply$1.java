package ru.yandex.taxi.delivery.web;

import defpackage.di7;
import defpackage.qcx;
import defpackage.sbx;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwh;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.serialization.json.c;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryCallApiJsPlugin$apply$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        tls tlsVar = ((wwh) this.receiver).a;
        try {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((c) sbx.d.b(c.Companion.serializer(), str)).get(ACSPConstants.STATUS);
            tlsVar.invoke(bVar != null ? qcx.g(qcx.n(bVar)) : null);
            return new di7("{}", null);
        } catch (Exception e) {
            tlsVar.invoke(null);
            String message = e.getMessage();
            return new di7(null, message != null ? message : "{}");
        }
    }
}
