package coil3.gif;

import coil3.Extras;

/* loaded from: classes3.dex */
public abstract class ImageRequestsKt {
    public static final Extras.Key animatedTransformationKey;
    public static final Extras.Key animationEndCallbackKey;
    public static final Extras.Key animationStartCallbackKey;
    public static final Extras.Key repeatCountKey = new Extras.Key((Object) (-1));

    static {
        Object obj = null;
        animatedTransformationKey = new Extras.Key(obj);
        animationStartCallbackKey = new Extras.Key(obj);
        animationEndCallbackKey = new Extras.Key(obj);
    }
}
