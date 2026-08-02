package androidx.media3.extractor.text.ttml;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.cashvoice.inappcallback.app.v1.StartOutboundPhoneSupportFlowParameters;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class TtmlRenderUtil {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayAppletSearch.deepLinkSpecs;
    }

    public static final ClientRoute.Flow getPhoneSupportRoute(String str, String str2) {
        return (str == null && str2 == null) ? new ClientRoute.Flow("INITIATE_OUTBOUND_PHONE_SUPPORT") : new ClientRoute.Flow(Recorder$$ExternalSyntheticOutline2.m("INITIATE_OUTBOUND_PHONE_SUPPORT?params=", new StartOutboundPhoneSupportFlowParameters(str, str2, ByteString.EMPTY).encodeByteString().base64Url()));
    }

    public static TtmlStyle resolveStyle(TtmlStyle ttmlStyle, String[] strArr, Map map) {
        int i = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (TtmlStyle) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    ttmlStyle2.chain((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ttmlStyle.chain((TtmlStyle) map.get(strArr[0]));
                return ttmlStyle;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ttmlStyle.chain((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ttmlStyle;
    }
}
