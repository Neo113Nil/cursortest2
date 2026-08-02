package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.AutoTopupReplenishNotificationConfig;

/* loaded from: classes9.dex */
public abstract class ry3 {
    public static final dfr a;

    static {
        byte[] bArr = tje.p1;
        byte[] bArr2 = new byte[37];
        for (int i = 0; i < 37; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, AutoTopupReplenishNotificationConfig.class), new CommonExperiment(new AutoTopupReplenishNotificationConfig(false, unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_replenish_notification_title), new Text.Resource(dzh0.ybsdk_auto_topup_replenish_notification_subtitle), new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6146621/magic_ball.png", "https://avatars.mds.yandex.net/get-fintech/6146621/magic_ball.png"), "ybapp://screen.open/auto_topup", new ThemedParameter("FFC46031", "FFEDA77E"), new ThemedParameter("FFFFEDD1", "FF572F24")), ExperimentApplyType.LATEST));
    }
}
