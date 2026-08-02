package app.cash.local.viewmodels;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalText;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class LocalTextsKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDirectDepositNuxDeprecated.deepLinkSpecs;
    }

    public static final LocalText toLocalText(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        if (str != null) {
            return new LocalText(str);
        }
        return null;
    }
}
