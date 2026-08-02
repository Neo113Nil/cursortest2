package coil3;

import coil3.Extras;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.OneShotDisposable;
import coil3.request.Options;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.target.ImageViewTarget;
import kotlinx.coroutines.DeferredCoroutine;

/* loaded from: classes.dex */
public abstract class ExtrasKt {
    public static final Extras.Key serviceLoaderEnabledKey = new Extras.Key(Boolean.TRUE);

    public static final Disposable getDisposable(ImageRequest imageRequest, DeferredCoroutine deferredCoroutine) {
        return imageRequest.getTarget() instanceof ImageViewTarget ? ViewTargetRequestManagerKt.getRequestManager(((ImageViewTarget) imageRequest.getTarget()).getView()).getDisposable(deferredCoroutine) : new OneShotDisposable(deferredCoroutine, 0);
    }

    public static final Object getExtra(ImageRequest imageRequest, Extras.Key key) {
        Object obj = imageRequest.getExtras().data.get(key);
        if (obj != null) {
            return obj;
        }
        Object obj2 = imageRequest.getDefaults().extras.data.get(key);
        return obj2 == null ? key.f61default : obj2;
    }

    public static final Object getExtra(Options options, Extras.Key key) {
        Object obj = options.getExtras().data.get(key);
        return obj == null ? key.f61default : obj;
    }
}
