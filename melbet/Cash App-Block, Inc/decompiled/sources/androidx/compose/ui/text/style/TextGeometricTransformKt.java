package androidx.compose.ui.text.style;

import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TextGeometricTransformKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewActivityThread.deepLinkSpecs;
    }

    public static final TextGeometricTransform lerp(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f) {
        return new TextGeometricTransform(TransactorKt.lerp(textGeometricTransform.scaleX, textGeometricTransform2.scaleX, f), TransactorKt.lerp(textGeometricTransform.skewX, textGeometricTransform2.skewX, f));
    }
}
