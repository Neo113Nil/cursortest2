package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class xi41 implements KSerializer {
    public static final xi41 a = new xi41();
    public static final asq0 b = d6z.g("WebPaymentWidgetMessageV2", new SerialDescriptor[0]);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        b bVar;
        b bVar2;
        b bVar3;
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            c m = qcx.m(ncxVar.t());
            b bVar4 = (b) m.get("type");
            String a2 = bVar4 != null ? qcx.n(bVar4).a() : null;
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case -1149187101:
                        if (a2.equals("SUCCESS")) {
                            return si41.a;
                        }
                        break;
                    case -402916431:
                        if (a2.equals("NEED_AUTH")) {
                            return pi41.a;
                        }
                        break;
                    case 66247144:
                        if (a2.equals("ERROR")) {
                            b bVar5 = (b) m.get(Constants.KEY_DATA);
                            String a3 = (bVar5 == null || (bVar = (b) qcx.m(bVar5).get("error")) == null || (bVar2 = (b) qcx.m(bVar).get(AuthSdkActivity.RESPONSE_TYPE_CODE)) == null) ? null : qcx.n(bVar2).a();
                            if (a3 != null) {
                                return new ni41(a3);
                            }
                        }
                        break;
                    case 79219825:
                        if (a2.equals("STATE")) {
                            b bVar6 = (b) m.get(Constants.KEY_DATA);
                            String a4 = (bVar6 == null || (bVar3 = (b) qcx.m(bVar6).get(ACSPConstants.STATUS)) == null) ? null : qcx.n(bVar3).a();
                            if (a4 != null) {
                                int hashCode = a4.hashCode();
                                if (hashCode != -1097519099) {
                                    if (hashCode != 94756344) {
                                        if (hashCode == 1422096580 && a4.equals("init-started")) {
                                            return ri41.a;
                                        }
                                    } else if (a4.equals("close")) {
                                        return mi41.a;
                                    }
                                } else if (a4.equals("loaded")) {
                                    return oi41.a;
                                }
                            }
                        }
                        break;
                }
            }
        }
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new UnsupportedOperationException("WebPaymentWidgetMessageV2Deserializer does not support serialization");
    }
}
