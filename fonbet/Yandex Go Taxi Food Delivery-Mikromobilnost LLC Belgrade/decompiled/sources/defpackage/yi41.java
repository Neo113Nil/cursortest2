package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class yi41 implements KSerializer {
    public static final yi41 a = new yi41();
    public static final asq0 b = d6z.g("WebPaymentWidgetMessageV3", new SerialDescriptor[0]);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r5.equals("need-auth") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return defpackage.pi41.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r5.equals("need-auth-token") == false) goto L100;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.myi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(Decoder decoder) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        Boolean bool = null;
        r0 = null;
        r0 = null;
        String str = null;
        bool = null;
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            b bVar7 = (b) qcx.m(ncxVar.t()).get(DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
            c m = bVar7 != null ? qcx.m(bVar7) : null;
            String a2 = (m == null || (bVar6 = (b) m.get("name")) == null) ? null : qcx.n(bVar6).a();
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case -1867169789:
                        if (a2.equals("success")) {
                            return si41.a;
                        }
                        break;
                    case -959507675:
                        if (a2.equals("yb-open-card-success")) {
                            b bVar8 = (b) m.get(Constants.KEY_DATA);
                            String a3 = (bVar8 == null || (bVar = (b) qcx.m(bVar8).get("paymentMethodId")) == null) ? null : qcx.n(bVar).a();
                            if (a3 != null) {
                                return new ui41(a3);
                            }
                        }
                        break;
                    case -829804187:
                        if (a2.equals("init-start")) {
                            return ri41.a;
                        }
                        break;
                    case -505795735:
                        if (a2.equals("open-uri")) {
                            b bVar9 = (b) m.get(Constants.KEY_DATA);
                            String a4 = (bVar9 == null || (bVar3 = (b) qcx.m(bVar9).get(LaunchBrowserActivity.KEY_URI)) == null) ? null : qcx.n(bVar3).a();
                            b bVar10 = (b) m.get(Constants.KEY_DATA);
                            if (bVar10 != null && (bVar2 = (b) qcx.m(bVar10).get("requireAuthorization")) != null) {
                                bool = Boolean.valueOf(qcx.e(qcx.n(bVar2)));
                            }
                            return new qi41(a4 != null ? a4 : "", bool != null ? bool.booleanValue() : true);
                        }
                        break;
                    case 3327206:
                        if (a2.equals("load")) {
                            return oi41.a;
                        }
                        break;
                    case 94756344:
                        if (a2.equals("close")) {
                            return mi41.a;
                        }
                        break;
                    case 96784904:
                        if (a2.equals("error")) {
                            b bVar11 = (b) m.get(Constants.KEY_DATA);
                            if (bVar11 != null && (bVar4 = (b) qcx.m(bVar11).get("error")) != null && (bVar5 = (b) qcx.m(bVar4).get(AuthSdkActivity.RESPONSE_TYPE_CODE)) != null) {
                                str = qcx.n(bVar5).a();
                            }
                            return new ni41(str != null ? str : "");
                        }
                        break;
                    case 907908907:
                        break;
                    case 1029727359:
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
        throw new UnsupportedOperationException("WebPaymentWidgetMessageV3Deserializer does not support serialization");
    }
}
