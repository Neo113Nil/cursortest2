package defpackage;

import com.yandex.go.platform.web_api.data.Payload$Deeplink;
import com.yandex.go.platform.web_api.data.Payload$RawObject;
import com.yandex.go.platform.web_api.data.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.json.b;

/* loaded from: classes13.dex */
public final class xu90 extends dcx {
    public static final xu90 d = new xu90(qoi0.a(c.class));

    @Override // defpackage.dcx
    public final myi c(b bVar) {
        return qcx.m(bVar).a.keySet().contains(Constants.KEY_DATA) ? Payload$RawObject.Companion.serializer() : Payload$Deeplink.Companion.serializer();
    }
}
