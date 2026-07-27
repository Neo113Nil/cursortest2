package kotlin.text;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes.dex */
public abstract class CatchingFishCameraXMVI {
    public static <T, V> ObjectAnimator CatchingFishParcelableFAB(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
