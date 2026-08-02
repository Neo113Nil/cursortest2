package coil3.request;

import androidx.core.os.BundleKt;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.Extras;
import coil3.ImageLoader$Builder;
import coil3.request.ImageRequest;
import coil3.size.SizeKt;
import coil3.transition.CrossfadeTransition;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public abstract class ImageRequestsKt {
    public static final Extras.Key transformationsKey = new Extras.Key(EmptyList.INSTANCE);
    public static final Extras.Key maxBitmapSizeKey = new Extras.Key(SizeKt.Size(4096, 4096));
    public static final Extras.Key addLastModifiedToFileCacheKeyKey = new Extras.Key(Boolean.FALSE);
    public static final Extras.Key allowConversionToBitmapKey = new Extras.Key(Boolean.TRUE);

    public static final void crossfade(ImageLoader$Builder imageLoader$Builder) {
        Extras.Key key = ImageRequests_androidKt.transitionFactoryKey;
        ((Extras.Builder) imageLoader$Builder.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(200));
    }

    public static final void transformations(ImageRequest.Builder builder, List list) {
        builder.getExtras().set(transformationsKey, BundleKt.toImmutableList(list));
        builder.memoryCacheKeyExtra(CollectionsKt.joinToString$default(list, null, null, null, 0, null, new xg$$ExternalSyntheticLambda9(new Ref$IntRef(), 14), 31));
    }
}
