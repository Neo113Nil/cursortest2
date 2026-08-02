package androidx.compose.ui.platform;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "getLocalSavedStateRegistryOwner$annotations", "LocalSavedStateRegistryOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final DynamicProvidableCompositionLocal LocalConfiguration = new DynamicProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$1);
    public static final StaticProvidableCompositionLocal LocalContext = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$2);
    public static final DynamicProvidableCompositionLocal LocalResources = new DynamicProvidableCompositionLocal(AndroidComposeView$getFocusedRect$1.INSTANCE$1);
    public static final StaticProvidableCompositionLocal LocalImageVectorCache = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$3);
    public static final StaticProvidableCompositionLocal LocalResourceIdCache = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$4);
    public static final StaticProvidableCompositionLocal LocalView = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$5);

    public static final void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.LocalLifecycleOwner;
    }

    public static final ProvidableCompositionLocal getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner;
    }
}
