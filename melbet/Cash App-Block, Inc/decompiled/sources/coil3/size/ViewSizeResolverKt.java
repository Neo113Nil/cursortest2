package coil3.size;

import android.widget.ImageView;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class ViewSizeResolverKt {
    public static RealViewSizeResolver ViewSizeResolver$default(ImageView imageView) {
        return new RealViewSizeResolver(imageView);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingRoundupsFailedConfirmation.deepLinkSpecs;
    }
}
