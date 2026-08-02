package androidx.glance;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;

/* loaded from: classes3.dex */
public abstract class CompositionLocalsKt {
    public static final StaticProvidableCompositionLocal LocalSize = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalSize$1.INSTANCE);
    public static final StaticProvidableCompositionLocal LocalContext = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalSize$1.INSTANCE$2);
    public static final DynamicProvidableCompositionLocal LocalState = new DynamicProvidableCompositionLocal(CompositionLocalsKt$LocalSize$1.INSTANCE$4);
    public static final StaticProvidableCompositionLocal LocalGlanceId = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalSize$1.INSTANCE$3);

    static {
        Updater.staticCompositionLocalOf(CompositionLocalsKt$LocalSize$1.INSTANCE$1);
    }
}
