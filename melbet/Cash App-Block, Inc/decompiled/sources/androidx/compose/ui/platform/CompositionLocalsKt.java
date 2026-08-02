package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.WrappedComposition$setContent$1;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class CompositionLocalsKt {
    public static final StaticProvidableCompositionLocal LocalCursorBlinkEnabled;
    public static final StaticProvidableCompositionLocal LocalPointerIconService;
    public static final DynamicProvidableCompositionLocal LocalProvidableScrollCaptureInProgress;
    public static final StaticProvidableCompositionLocal LocalSoftwareKeyboardController;
    public static final StaticProvidableCompositionLocal LocalTextInputService;
    public static final StaticProvidableCompositionLocal LocalTextToolbar;
    public static final StaticProvidableCompositionLocal LocalUriHandler;
    public static final StaticProvidableCompositionLocal LocalViewConfiguration;
    public static final StaticProvidableCompositionLocal LocalWindowInfo;
    public static final StaticProvidableCompositionLocal LocalAccessibilityManager = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$7);
    public static final StaticProvidableCompositionLocal LocalAutofill = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$8);
    public static final StaticProvidableCompositionLocal LocalAutofillTree = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$10);
    public static final StaticProvidableCompositionLocal LocalAutofillManager = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$9);
    public static final StaticProvidableCompositionLocal LocalClipboardManager = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$12);
    public static final StaticProvidableCompositionLocal LocalClipboard = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$11);
    public static final StaticProvidableCompositionLocal LocalGraphicsContext = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$17);
    public static final StaticProvidableCompositionLocal LocalDensity = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE);
    public static final StaticProvidableCompositionLocal LocalFocusManager = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$14);
    public static final StaticProvidableCompositionLocal LocalFontLoader = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$16);
    public static final StaticProvidableCompositionLocal LocalFontFamilyResolver = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$15);
    public static final StaticProvidableCompositionLocal LocalHapticFeedback = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$18);
    public static final StaticProvidableCompositionLocal LocalInputModeManager = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$19);
    public static final StaticProvidableCompositionLocal LocalLayoutDirection = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$20);
    public static final StaticProvidableCompositionLocal LocalProvidableLocaleList = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$22);

    static {
        LazyKt.lazy(new InvalidationTracker$$ExternalSyntheticLambda0(14));
        LocalTextInputService = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$25);
        LocalSoftwareKeyboardController = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$24);
        LocalTextToolbar = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$26);
        LocalUriHandler = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$27);
        LocalViewConfiguration = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$28);
        LocalWindowInfo = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$29);
        LocalPointerIconService = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$21);
        LocalProvidableScrollCaptureInProgress = new DynamicProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$23);
        LocalCursorBlinkEnabled = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.INSTANCE$13);
    }

    public static final void ProvideCommonCompositionLocals(Owner owner, UriHandler uriHandler, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1925803616);
        int i2 = (gapComposer.changed(owner) ? 4 : 2) | i | (gapComposer.changed(uriHandler) ? 32 : 16) | (gapComposer.changedInstance(function2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner;
            ProvidedValue defaultProvidedValue$runtime = LocalAccessibilityManager.defaultProvidedValue$runtime(androidComposeView.accessibilityManager);
            ProvidedValue defaultProvidedValue$runtime2 = LocalAutofill.defaultProvidedValue$runtime(androidComposeView._autofill);
            ProvidedValue defaultProvidedValue$runtime3 = LocalAutofillManager.defaultProvidedValue$runtime(androidComposeView._autofillManager);
            ProvidedValue defaultProvidedValue$runtime4 = LocalAutofillTree.defaultProvidedValue$runtime(androidComposeView.autofillTree);
            ProvidedValue defaultProvidedValue$runtime5 = LocalClipboardManager.defaultProvidedValue$runtime(androidComposeView.clipboardManager);
            ProvidedValue defaultProvidedValue$runtime6 = LocalClipboard.defaultProvidedValue$runtime(androidComposeView.clipboard);
            ProvidedValue defaultProvidedValue$runtime7 = LocalDensity.defaultProvidedValue$runtime(androidComposeView.getDensity());
            ProvidedValue defaultProvidedValue$runtime8 = LocalFocusManager.defaultProvidedValue$runtime(androidComposeView.focusOwner);
            ProvidedValue defaultProvidedValue$runtime9 = LocalFontLoader.defaultProvidedValue$runtime(androidComposeView.fontLoader);
            defaultProvidedValue$runtime9.canOverride = false;
            ProvidedValue defaultProvidedValue$runtime10 = LocalFontFamilyResolver.defaultProvidedValue$runtime((FontFamilyResolverImpl) androidComposeView.fontFamilyResolver$delegate.getValue());
            defaultProvidedValue$runtime10.canOverride = false;
            ProvidedValue defaultProvidedValue$runtime11 = LocalHapticFeedback.defaultProvidedValue$runtime(androidComposeView.hapticFeedBack);
            ProvidedValue defaultProvidedValue$runtime12 = LocalInputModeManager.defaultProvidedValue$runtime(androidComposeView._inputModeManager);
            ProvidedValue defaultProvidedValue$runtime13 = LocalLayoutDirection.defaultProvidedValue$runtime((LayoutDirection) androidComposeView.layoutDirection$delegate.getValue());
            ProvidedValue defaultProvidedValue$runtime14 = LocalTextInputService.defaultProvidedValue$runtime(androidComposeView.getTextInputService());
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = androidComposeView._softwareKeyboardController;
            if (delegatingSoftwareKeyboardController == null) {
                delegatingSoftwareKeyboardController = new DelegatingSoftwareKeyboardController(androidComposeView.getTextInputService());
                androidComposeView._softwareKeyboardController = delegatingSoftwareKeyboardController;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, defaultProvidedValue$runtime3, defaultProvidedValue$runtime4, defaultProvidedValue$runtime5, defaultProvidedValue$runtime6, defaultProvidedValue$runtime7, defaultProvidedValue$runtime8, defaultProvidedValue$runtime9, defaultProvidedValue$runtime10, defaultProvidedValue$runtime11, defaultProvidedValue$runtime12, defaultProvidedValue$runtime13, defaultProvidedValue$runtime14, LocalSoftwareKeyboardController.defaultProvidedValue$runtime(delegatingSoftwareKeyboardController), LocalTextToolbar.defaultProvidedValue$runtime(androidComposeView.textToolbar), LocalUriHandler.defaultProvidedValue$runtime(uriHandler), LocalViewConfiguration.defaultProvidedValue$runtime(androidComposeView.viewConfiguration), LocalWindowInfo.defaultProvidedValue$runtime(androidComposeView.get_composeViewContext().windowInfo), LocalPointerIconService.defaultProvidedValue$runtime(androidComposeView.pointerIconService), LocalGraphicsContext.defaultProvidedValue$runtime(androidComposeView.graphicsContext), LocalRetainedValuesStoreKt.LocalRetainedValuesStore.defaultProvidedValue$runtime(androidComposeView.retainedValuesStore), LocalProvidableLocaleList.defaultProvidedValue$runtime((LocaleList) androidComposeView.localeList$delegate.getValue())}, function2, gapComposer, ((i2 >> 3) & 112) | 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WrappedComposition$setContent$1.AnonymousClass2(owner, uriHandler, function2, i);
        }
    }

    public static final void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
