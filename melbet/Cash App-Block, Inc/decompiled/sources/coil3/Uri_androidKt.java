package coil3;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class Uri_androidKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewGiftBitcoinDeprecated.deepLinkSpecs;
    }

    public static final Uri toCoilUri(android.net.Uri uri) {
        return UriKt.toUri$default(uri.toString());
    }
}
