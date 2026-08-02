package coil3;

import android.content.Context;
import coil3.Extras;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class SingletonImageLoaderKt$$ExternalSyntheticLambda0 {
    public static RealImageLoader newImageLoader(Context context) {
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context);
        ((Extras.Builder) imageLoader$Builder.extras).set(SingletonImageLoaderKt.DefaultSingletonImageLoaderKey, Unit.INSTANCE);
        return imageLoader$Builder.build();
    }
}
