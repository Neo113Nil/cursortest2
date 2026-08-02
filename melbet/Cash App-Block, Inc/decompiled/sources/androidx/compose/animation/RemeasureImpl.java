package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes3.dex */
public final class RemeasureImpl implements SharedTransitionScope.ResizeMode {
    public static final RemeasureImpl INSTANCE = new RemeasureImpl();
    public static final /* synthetic */ RemeasureImpl $$INSTANCE = new RemeasureImpl();
    public static final /* synthetic */ RemeasureImpl $$INSTANCE$1 = new RemeasureImpl();

    public static ScaleToBoundsImpl scaleToBounds(ContentScale contentScale) {
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        SpringSpec springSpec = SharedTransitionScopeKt.DefaultSpring;
        if (contentScale != ContentScale.Companion.FillWidth && contentScale != ContentScale.Companion.FillHeight && contentScale != ContentScale.Companion.FillBounds && contentScale != ContentScale.Companion.Fit && contentScale != ContentScale.Companion.Crop && contentScale != ContentScale.Companion.None && contentScale != ContentScale.Companion.Inside) {
            return new ScaleToBoundsImpl(contentScale);
        }
        MutableScatterMap mutableScatterMap = SharedTransitionScopeKt.cachedScaleToBoundsImplMap;
        Object obj = mutableScatterMap.get(contentScale);
        if (obj == null) {
            obj = new MutableScatterMap();
            mutableScatterMap.set(contentScale, obj);
        }
        MutableScatterMap mutableScatterMap2 = (MutableScatterMap) obj;
        Object obj2 = mutableScatterMap2.get(biasAlignment);
        if (obj2 == null) {
            obj2 = new ScaleToBoundsImpl(contentScale);
            mutableScatterMap2.set(biasAlignment, obj2);
        }
        return (ScaleToBoundsImpl) obj2;
    }

    public static /* synthetic */ ScaleToBoundsImpl scaleToBounds$default(RemeasureImpl remeasureImpl, ContentScale contentScale) {
        remeasureImpl.getClass();
        return scaleToBounds(contentScale);
    }
}
