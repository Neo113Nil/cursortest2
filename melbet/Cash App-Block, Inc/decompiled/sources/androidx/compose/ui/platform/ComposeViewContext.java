package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.ComponentActivity$$ExternalSyntheticLambda5;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.R;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.util.cash.Countries;
import curtains.WindowsKt$onNextDraw$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: classes.dex */
public final class ComposeViewContext {
    public final AndroidAccessibilityManager accessibilityManager;
    public final ContourLayout$geometry$1 calculateWindowSizeLambda;
    public final ComposeViewContext$callback$1 callback;
    public final MemoryCacheService canvasHolder;
    public final AndroidClipboard clipboard;
    public final AndroidClipboardManager clipboardManager;
    public final CompositionContext compositionContext;
    public final MutableState configuration;
    public final Configuration currentConfiguration;
    public final MutableState fontFamilyResolver;
    public final AndroidFontResourceLoader fontLoader;
    public final PlatformHapticFeedback hapticFeedback;
    public final ImageVectorCache imageVectorCache;
    public final LifecycleOwner lifecycleOwner;
    public final ResourceIdCache resourceIdCache;
    public final SavedStateRegistryOwner savedStateRegistryOwner;
    public final LayoutNodeDrawScope sharedDrawScope;
    public final AndroidUriHandler uriHandler;
    public final View view;
    public final AndroidViewConfiguration viewConfiguration;
    public int viewCount;
    public final ViewModelStoreOwner viewModelStoreOwner;
    public final LazyWindowInfo windowInfo;

    public ComposeViewContext(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner) {
        ImageVectorCache imageVectorCache;
        Configuration configuration;
        MutableState mutableStateOf$default;
        AndroidAccessibilityManager androidAccessibilityManager;
        AndroidUriHandler androidUriHandler;
        AndroidClipboardManager androidClipboardManager;
        AndroidClipboard androidClipboard;
        AndroidFontResourceLoader androidFontResourceLoader;
        MutableState parcelableSnapshotMutableState;
        AndroidViewConfiguration androidViewConfiguration;
        MemoryCacheService memoryCacheService;
        LayoutNodeDrawScope layoutNodeDrawScope;
        ResourceIdCache resourceIdCache;
        View view2;
        boolean areEqual = Intrinsics.areEqual((composeViewContext == null || (view2 = composeViewContext.view) == null) ? null : view2.getContext(), view.getContext());
        this.view = view;
        this.compositionContext = compositionContext;
        this.lifecycleOwner = lifecycleOwner;
        this.savedStateRegistryOwner = savedStateRegistryOwner;
        this.viewModelStoreOwner = viewModelStoreOwner;
        if (areEqual) {
            composeViewContext.getClass();
            imageVectorCache = composeViewContext.imageVectorCache;
        } else {
            imageVectorCache = new ImageVectorCache();
        }
        this.imageVectorCache = imageVectorCache;
        this.resourceIdCache = (composeViewContext == null || (resourceIdCache = composeViewContext.resourceIdCache) == null) ? new ResourceIdCache() : resourceIdCache;
        if (areEqual) {
            composeViewContext.getClass();
            configuration = composeViewContext.currentConfiguration;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.currentConfiguration = configuration;
        if (areEqual) {
            composeViewContext.getClass();
            mutableStateOf$default = composeViewContext.configuration;
        } else {
            mutableStateOf$default = Updater.mutableStateOf$default(new Configuration(configuration));
        }
        this.configuration = mutableStateOf$default;
        if (areEqual) {
            composeViewContext.getClass();
            androidAccessibilityManager = composeViewContext.accessibilityManager;
        } else {
            Context context = view.getContext();
            androidAccessibilityManager = new AndroidAccessibilityManager();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.accessibilityManager = androidAccessibilityManager;
        if (areEqual) {
            composeViewContext.getClass();
            androidUriHandler = composeViewContext.uriHandler;
        } else {
            androidUriHandler = new AndroidUriHandler(view.getContext());
        }
        this.uriHandler = androidUriHandler;
        if (areEqual) {
            composeViewContext.getClass();
            androidClipboardManager = composeViewContext.clipboardManager;
        } else {
            androidClipboardManager = new AndroidClipboardManager(view.getContext());
        }
        this.clipboardManager = androidClipboardManager;
        if (areEqual) {
            composeViewContext.getClass();
            androidClipboard = composeViewContext.clipboard;
        } else {
            androidClipboard = new AndroidClipboard(androidClipboardManager);
        }
        this.clipboard = androidClipboard;
        if (areEqual) {
            composeViewContext.getClass();
            androidFontResourceLoader = composeViewContext.fontLoader;
        } else {
            view.getContext();
            androidFontResourceLoader = new AndroidFontResourceLoader();
        }
        this.fontLoader = androidFontResourceLoader;
        if (areEqual) {
            composeViewContext.getClass();
            parcelableSnapshotMutableState = composeViewContext.fontFamilyResolver;
        } else {
            parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Countries.createFontFamilyResolver(view.getContext()), NeverEqualPolicy.INSTANCE$1);
        }
        this.fontFamilyResolver = parcelableSnapshotMutableState;
        this.hapticFeedback = view == (composeViewContext != null ? composeViewContext.view : null) ? composeViewContext.hapticFeedback : new PlatformHapticFeedback(view);
        if (areEqual) {
            composeViewContext.getClass();
            androidViewConfiguration = composeViewContext.viewConfiguration;
        } else {
            androidViewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.viewConfiguration = androidViewConfiguration;
        this.sharedDrawScope = (composeViewContext == null || (layoutNodeDrawScope = composeViewContext.sharedDrawScope) == null) ? new LayoutNodeDrawScope() : layoutNodeDrawScope;
        this.windowInfo = new LazyWindowInfo();
        this.canvasHolder = (composeViewContext == null || (memoryCacheService = composeViewContext.canvasHolder) == null) ? new MemoryCacheService(9) : memoryCacheService;
        this.calculateWindowSizeLambda = new ContourLayout$geometry$1(this, 8);
        this.callback = new ComposeViewContext$callback$1(this);
    }

    public final void ProvideCompositionLocals$ui(AndroidComposeView androidComposeView, Function2 function2, Composer composer, int i) {
        ScrollCapture scrollCapture;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(123858079);
        int i2 = (gapComposer.changedInstance(androidComposeView) ? 4 : 2) | i | (gapComposer.changedInstance(function2) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        boolean z = true;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof KMappedMarker) && !(tag instanceof KMutableSet))) ? null : (Set) tag;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof KMappedMarker) && !(tag2 instanceof KMutableSet))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(gapComposer.getCompositionData());
                gapComposer.forceRecomposeScopes = true;
                gapComposer.sourceMarkersEnabled = true;
                gapComposer.slotTable.collectSourceInformation();
                gapComposer.insertTable.collectSourceInformation();
                SlotWriter slotWriter = gapComposer.writer;
                SlotTable slotTable = slotWriter.table;
                slotWriter.sourceInformationMap = slotTable.sourceInformationMap;
                slotWriter.calledByMap = slotTable.calledByMap;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            SavedStateRegistryOwner savedStateRegistryOwner = this.savedStateRegistryOwner;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                Object parent2 = androidComposeView.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String m = Recorder$$ExternalSyntheticOutline2.m("SaveableStateRegistry:", str);
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(m);
                if (consumeRestoredStateForKey != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : consumeRestoredStateForKey.keySet()) {
                        ArrayList parcelableArrayList = consumeRestoredStateForKey.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                AndroidComposeView$getFocusedRect$1 androidComposeView$getFocusedRect$1 = AndroidComposeView$getFocusedRect$1.INSTANCE$2;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
                SaveableStateRegistryImpl saveableStateRegistryImpl = new SaveableStateRegistryImpl(linkedHashMap, androidComposeView$getFocusedRect$1);
                if (savedStateRegistry.getSavedStateProvider(m) == null) {
                    try {
                        savedStateRegistry.registerSavedStateProvider(m, new ComponentActivity$$ExternalSyntheticLambda5(saveableStateRegistryImpl, z2 ? 1 : 0));
                    } catch (IllegalArgumentException unused) {
                    }
                    DisposableSaveableStateRegistry disposableSaveableStateRegistry = new DisposableSaveableStateRegistry(saveableStateRegistryImpl, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z, savedStateRegistry, m));
                    gapComposer.updateRememberedValue(disposableSaveableStateRegistry);
                    rememberedValue = disposableSaveableStateRegistry;
                }
                z = false;
                DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = new DisposableSaveableStateRegistry(saveableStateRegistryImpl, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z, savedStateRegistry, m));
                gapComposer.updateRememberedValue(disposableSaveableStateRegistry2);
                rememberedValue = disposableSaveableStateRegistry2;
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry3 = (DisposableSaveableStateRegistry) rememberedValue;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(disposableSaveableStateRegistry3);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new WindowsKt$onNextDraw$1(disposableSaveableStateRegistry3, 8);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = CompositionLocalsKt.LocalProvidableScrollCaptureInProgress;
            boolean booleanValue = ((Boolean) gapComposer.consume(dynamicProvidableCompositionLocal)).booleanValue() | ((Build.VERSION.SDK_INT < 31 || (scrollCapture = androidComposeView.scrollCapture) == null) ? false : ((Boolean) scrollCapture.scrollCaptureInProgress$delegate.getValue()).booleanValue());
            boolean changed = gapComposer.changed(androidComposeView);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ViewTreeHostDefaultProvider();
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalLifecycleOwnerKt.LocalLifecycleOwner.defaultProvidedValue$runtime(this.lifecycleOwner), LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner.defaultProvidedValue$runtime(savedStateRegistryOwner), AndroidCompositionLocals_androidKt.LocalImageVectorCache.defaultProvidedValue$runtime(this.imageVectorCache), AndroidCompositionLocals_androidKt.LocalResourceIdCache.defaultProvidedValue$runtime(this.resourceIdCache), AndroidCompositionLocals_androidKt.LocalContext.defaultProvidedValue$runtime(androidComposeView.getContext()), InspectionTablesKt.LocalInspectionTables.defaultProvidedValue$runtime(set), AndroidCompositionLocals_androidKt.LocalConfiguration.defaultProvidedValue$runtime((Configuration) androidComposeView.configuration$delegate.getValue()), SaveableStateRegistryKt.LocalSaveableStateRegistry.defaultProvidedValue$runtime(disposableSaveableStateRegistry3), AndroidCompositionLocals_androidKt.LocalView.defaultProvidedValue$runtime(androidComposeView), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Boolean.valueOf(booleanValue)), CompositionLocalsKt.LocalViewConfiguration.defaultProvidedValue$runtime(androidComposeView.viewConfiguration), HostDefaultProviderKt.LocalHostDefaultProvider.defaultProvidedValue$runtime((ViewTreeHostDefaultProvider) rememberedValue3)}, Expect_jvmKt.rememberComposableLambda(1317454175, new ComposeViewContext$ProvideCompositionLocals$2(androidComposeView, this, function2), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposeViewContext$ProvideCompositionLocals$2(this, androidComposeView, function2, i);
        }
    }

    public final void decrementViewCount$ui() {
        int i = this.viewCount - 1;
        this.viewCount = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.viewCount = 0;
        }
        if (this.viewCount == 0) {
            View view = this.view;
            Context context = view.getContext();
            ComposeViewContext$callback$1 composeViewContext$callback$1 = this.callback;
            context.unregisterComponentCallbacks(composeViewContext$callback$1);
            LazyWindowInfo lazyWindowInfo = this.windowInfo;
            if (lazyWindowInfo._containerSize == null) {
                lazyWindowInfo.onInitializeContainerSize = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(composeViewContext$callback$1);
        }
    }

    public final void incrementViewCount$ui() {
        int i = this.viewCount + 1;
        this.viewCount = i;
        if (i == 1) {
            View view = this.view;
            Context context = view.getContext();
            ComposeViewContext$callback$1 composeViewContext$callback$1 = this.callback;
            context.registerComponentCallbacks(composeViewContext$callback$1);
            onConfigurationChanged$ui(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            LazyWindowInfo lazyWindowInfo = this.windowInfo;
            lazyWindowInfo.isWindowFocused$delegate.setValue(Boolean.valueOf(hasWindowFocus));
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = lazyWindowInfo._containerSize;
            ContourLayout$geometry$1 contourLayout$geometry$1 = this.calculateWindowSizeLambda;
            if (parcelableSnapshotMutableState == null) {
                lazyWindowInfo.onInitializeContainerSize = contourLayout$geometry$1;
            }
            if (parcelableSnapshotMutableState != null) {
                parcelableSnapshotMutableState.setValue(contourLayout$geometry$1.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(composeViewContext$callback$1);
        }
    }

    public final void onConfigurationChanged$ui(Configuration configuration) {
        int updateFrom = this.currentConfiguration.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.imageVectorCache.map.entrySet().iterator();
            while (it.hasNext()) {
                ImageVectorCache.ImageVectorEntry imageVectorEntry = (ImageVectorCache.ImageVectorEntry) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (imageVectorEntry == null || Configuration.needNewResources(updateFrom, imageVectorEntry.configFlags)) {
                    it.remove();
                }
            }
            this.configuration.setValue(new Configuration(configuration));
            ResourceIdCache resourceIdCache = this.resourceIdCache;
            synchronized (resourceIdCache) {
                resourceIdCache.resIdPathMap.clear();
            }
            if ((268435456 & updateFrom) != 0) {
                this.fontFamilyResolver.setValue(Countries.createFontFamilyResolver(this.view.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                LazyWindowInfo lazyWindowInfo = this.windowInfo;
                ContourLayout$geometry$1 contourLayout$geometry$1 = this.calculateWindowSizeLambda;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = lazyWindowInfo._containerSize;
                if (parcelableSnapshotMutableState != null) {
                    parcelableSnapshotMutableState.setValue(contourLayout$geometry$1.invoke());
                }
            }
        }
    }
}
