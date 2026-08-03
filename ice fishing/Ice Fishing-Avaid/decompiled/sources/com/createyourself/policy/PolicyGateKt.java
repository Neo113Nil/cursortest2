package com.createyourself.policy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PolicyGate.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a|\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001aK\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a\"\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002\u001a#\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0003¢\u0006\u0002\u0010!\u001a\f\u0010\"\u001a\u00020\u0010*\u00020\u0003H\u0002\u001a\u000e\u0010#\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0002\u001a\u0006\u0010%\u001a\u00020\u000b¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"rememberPolicyController", "Lcom/createyourself/policy/PolicyController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;II)Lcom/createyourself/policy/PolicyController;", "PolicyGate", "", "controller", "modifier", "Landroidx/compose/ui/Modifier;", "html", "", "url", "webViewConfig", "Lcom/createyourself/policy/PolicyWebViewConfig;", "showUnavailablePreview", "", "onAccepted", "Lkotlin/Function0;", "onDeclined", "acceptedContent", "Landroidx/compose/runtime/Composable;", "(Lcom/createyourself/policy/PolicyController;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/createyourself/policy/PolicyWebViewConfig;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PolicyWebView", "config", "retryKey", "", "onMessage", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/createyourself/policy/PolicyWebViewConfig;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "policyLoadKey", "PolicyUnavailableScreen", "onRetry", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "hasInternetConnection", "findActivity", "Landroid/app/Activity;", "defaultPolicyHtml", "policy_release", "loadFailed"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class PolicyGateKt {

    /* compiled from: PolicyGate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyGate$lambda$17(PolicyController policyController, Modifier modifier, String str, String str2, PolicyWebViewConfig policyWebViewConfig, boolean z, Function0 function0, Function0 function02, Function2 function2, int i, int i2, Composer composer, int i3) {
        PolicyGate(policyController, modifier, str, str2, policyWebViewConfig, z, function0, function02, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyUnavailableScreen$lambda$32(Modifier modifier, Function0 function0, int i, Composer composer, int i2) {
        PolicyUnavailableScreen(modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyWebView$lambda$29(String str, String str2, Modifier modifier, PolicyWebViewConfig policyWebViewConfig, int i, Function1 function1, int i2, Composer composer, int i3) {
        PolicyWebView(str, str2, modifier, policyWebViewConfig, i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final PolicyController rememberPolicyController(Context context, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-666550903);
        ComposerKt.sourceInformation(composer, "C(rememberPolicyController)61@2456L7,62@2486L51:PolicyGate.kt#o805rc");
        if ((i2 & 1) != 0) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            context = (Context) consume;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-666550903, i, -1, "com.createyourself.policy.rememberPolicyController (PolicyGate.kt:62)");
        }
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):PolicyGate.kt#9igjgp");
        boolean changed = composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new PolicyController(context);
            composer.updateRememberedValue(rememberedValue);
        }
        PolicyController policyController = (PolicyController) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return policyController;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PolicyGate(final PolicyController controller, Modifier modifier, String str, String str2, PolicyWebViewConfig policyWebViewConfig, boolean z, Function0<Unit> function0, Function0<Unit> function02, final Function2<? super Composer, ? super Integer, Unit> acceptedContent, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str3;
        int i4;
        String str4;
        PolicyWebViewConfig policyWebViewConfig2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        boolean z3;
        Object rememberedValue;
        int i9;
        Object rememberedValue2;
        final Function0<Unit> function05;
        final String str5;
        final PolicyWebViewConfig policyWebViewConfig3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(acceptedContent, "acceptedContent");
        Composer startRestartGroup = composer.startRestartGroup(1515250187);
        ComposerKt.sourceInformation(startRestartGroup, "C(PolicyGate)P(1,3,2,7,8,6,4,5)78@2969L7,79@2999L61,80@3081L33:PolicyGate.kt#o805rc");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    str3 = str;
                    if (startRestartGroup.changed(str3)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    str3 = str;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                str3 = str;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str4 = str2;
                i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        policyWebViewConfig2 = policyWebViewConfig;
                        if (startRestartGroup.changed(policyWebViewConfig2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        policyWebViewConfig2 = policyWebViewConfig;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    policyWebViewConfig2 = policyWebViewConfig;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 = i7;
                    i3 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(acceptedContent) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "74@2853L2,75@2886L2");
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                str3 = defaultPolicyHtml();
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                policyWebViewConfig2 = PolicyWebViewConfig.INSTANCE.compatibility();
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                            if (i6 == 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function0() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function03 = (Function0) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function03 = function0;
                            }
                            if (i8 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function0() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function04 = (Function0) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                                String str6 = str3;
                                PolicyWebViewConfig policyWebViewConfig4 = policyWebViewConfig2;
                                Modifier modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    z3 = z2;
                                    ComposerKt.traceEventStart(1515250187, i3, -1, "com.createyourself.policy.PolicyGate (PolicyGate.kt:77)");
                                } else {
                                    z3 = z2;
                                }
                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContext);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Context context = (Context) consume;
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    i9 = i3;
                                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!hasInternetConnection(context)), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                } else {
                                    i9 = i3;
                                }
                                final MutableState mutableState = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                if (z3) {
                                    startRestartGroup.startReplaceGroup(712647435);
                                    ComposerKt.sourceInformation(startRestartGroup, "85@3238L2,83@3158L92");
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    PolicyUnavailableScreen(modifier3, (Function0) rememberedValue5, startRestartGroup, ((i9 >> 3) & 14) | 48);
                                    startRestartGroup.endReplaceGroup();
                                } else if ((context.getApplicationInfo().flags & 2) != 0 || controller.isAccepted()) {
                                    startRestartGroup.startReplaceGroup(712879222);
                                    ComposerKt.sourceInformation(startRestartGroup, "88@3394L17");
                                    acceptedContent.invoke(startRestartGroup, Integer.valueOf((i9 >> 24) & 14));
                                    startRestartGroup.endReplaceGroup();
                                } else if (PolicyGate$lambda$6(mutableState)) {
                                    startRestartGroup.startReplaceGroup(712941129);
                                    ComposerKt.sourceInformation(startRestartGroup, "92@3529L164,90@3449L254");
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                    boolean changedInstance = startRestartGroup.changedInstance(context);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function0() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit PolicyGate$lambda$14$lambda$13;
                                                PolicyGate$lambda$14$lambda$13 = PolicyGateKt.PolicyGate$lambda$14$lambda$13(context, mutableState, mutableIntState);
                                                return PolicyGate$lambda$14$lambda$13;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    PolicyUnavailableScreen(modifier3, (Function0) rememberedValue6, startRestartGroup, (i9 >> 3) & 14);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(713224748);
                                    ComposerKt.sourceInformation(startRestartGroup, "106@3914L372,100@3725L571");
                                    int PolicyGate$lambda$9 = PolicyGate$lambda$9(mutableIntState);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                                    boolean z5 = ((i9 & 14) == 4) | ((i9 & 3670016) == 1048576) | ((i9 & 29360128) == 8388608);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (z5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function1() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit PolicyGate$lambda$16$lambda$15;
                                                PolicyGate$lambda$16$lambda$15 = PolicyGateKt.PolicyGate$lambda$16$lambda$15(PolicyController.this, function03, function04, (String) obj);
                                                return PolicyGate$lambda$16$lambda$15;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    PolicyWebView(str6, str4, modifier3, policyWebViewConfig4, PolicyGate$lambda$9, (Function1) rememberedValue7, startRestartGroup, ((i9 >> 6) & 126) | ((i9 << 3) & 896) | ((i9 >> 3) & 7168));
                                    startRestartGroup.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function05 = function04;
                                str5 = str6;
                                modifier2 = modifier3;
                                policyWebViewConfig3 = policyWebViewConfig4;
                                z4 = z3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            function03 = function0;
                        }
                        function04 = function02;
                        String str62 = str3;
                        PolicyWebViewConfig policyWebViewConfig42 = policyWebViewConfig2;
                        Modifier modifier32 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localContext2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context2 = (Context) consume2;
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState2 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        if (z3) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function05 = function04;
                        str5 = str62;
                        modifier2 = modifier32;
                        policyWebViewConfig3 = policyWebViewConfig42;
                        z4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function03 = function0;
                        z4 = z2;
                        str5 = str3;
                        policyWebViewConfig3 = policyWebViewConfig2;
                        function05 = function02;
                    }
                    final String str7 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final Function0<Unit> function06 = function03;
                        endRestartGroup.updateScope(new Function2() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PolicyGate$lambda$17;
                                PolicyGate$lambda$17 = PolicyGateKt.PolicyGate$lambda$17(PolicyController.this, modifier4, str5, str7, policyWebViewConfig3, z4, function06, function05, acceptedContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return PolicyGate$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 256) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "74@2853L2,75@2886L2");
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                }
                function04 = function02;
                String str622 = str3;
                PolicyWebViewConfig policyWebViewConfig422 = policyWebViewConfig2;
                Modifier modifier322 = modifier2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context22 = (Context) consume22;
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableIntState mutableIntState22 = (MutableIntState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                if (z3) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                function05 = function04;
                str5 = str622;
                modifier2 = modifier322;
                policyWebViewConfig3 = policyWebViewConfig422;
                z4 = z3;
                final String str72 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str4 = str2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 256) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "74@2853L2,75@2886L2");
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i8 != 0) {
            }
            function04 = function02;
            String str6222 = str3;
            PolicyWebViewConfig policyWebViewConfig4222 = policyWebViewConfig2;
            Modifier modifier3222 = modifier2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context222 = (Context) consume222;
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableIntState mutableIntState222 = (MutableIntState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            if (z3) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            function05 = function04;
            str5 = str6222;
            modifier2 = modifier3222;
            policyWebViewConfig3 = policyWebViewConfig4222;
            z4 = z3;
            final String str722 = str4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposerKt.sourceInformation(startRestartGroup, "74@2853L2,75@2886L2");
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i8 != 0) {
        }
        function04 = function02;
        String str62222 = str3;
        PolicyWebViewConfig policyWebViewConfig42222 = policyWebViewConfig2;
        Modifier modifier32222 = modifier2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2222 = (Context) consume2222;
        startRestartGroup.startReplaceGroup(1849434622);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableIntState mutableIntState2222 = (MutableIntState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        if (z3) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        function05 = function04;
        str5 = str62222;
        modifier2 = modifier32222;
        policyWebViewConfig3 = policyWebViewConfig42222;
        z4 = z3;
        final String str7222 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean PolicyGate$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PolicyGate$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int PolicyGate$lambda$9(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyGate$lambda$14$lambda$13(Context context, MutableState mutableState, MutableIntState mutableIntState) {
        PolicyGate$lambda$7(mutableState, !hasInternetConnection(context));
        if (!PolicyGate$lambda$6(mutableState)) {
            mutableIntState.setIntValue(PolicyGate$lambda$9(mutableIntState) + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyGate$lambda$16$lambda$15(PolicyController policyController, Function0 function0, Function0 function02, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String lowerCase = StringsKt.trim((CharSequence) message).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, PolicyController.VALUE_ACCEPTED)) {
            policyController.accept();
            function0.invoke();
        } else if (Intrinsics.areEqual(lowerCase, PolicyController.VALUE_DECLINED)) {
            policyController.decline();
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void PolicyWebView(final String str, final String str2, final Modifier modifier, final PolicyWebViewConfig policyWebViewConfig, final int i, final Function1<? super String, Unit> function1, Composer composer, final int i2) {
        int i3;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(489263094);
        ComposerKt.sourceInformation(startRestartGroup, "C(PolicyWebView)P(1,5,2!1,4)132@4548L61,135@4641L7,136@4694L7,137@4717L58,141@4820L824,141@4781L863,166@5710L199,172@5928L239,164@5650L523:PolicyGate.kt#o805rc");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(policyWebViewConfig) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489263094, i3, -1, "com.createyourself.policy.PolicyWebView (PolicyGate.kt:131)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            boolean z = (458752 & i3) == 131072;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new PolicyJsBridge(function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PolicyJsBridge policyJsBridge = (PolicyJsBridge) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume2;
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new PolicyWebViewHost(policyJsBridge, policyWebViewConfig);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final PolicyWebViewHost policyWebViewHost = (PolicyWebViewHost) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1746271574);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(policyWebViewHost) | startRestartGroup.changedInstance(lifecycleOwner);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult PolicyWebView$lambda$23$lambda$22;
                        PolicyWebView$lambda$23$lambda$22 = PolicyGateKt.PolicyWebView$lambda$23$lambda$22(context, lifecycleOwner, policyWebViewHost, (DisposableEffectScope) obj);
                        return PolicyWebView$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, policyWebViewHost, (Function1) rememberedValue3, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1224400529);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            int i4 = 57344 & i3;
            int i5 = i3 & 14;
            int i6 = i3 & 112;
            boolean changedInstance2 = (i6 == 32) | startRestartGroup.changedInstance(policyWebViewHost) | (i4 == 16384) | (i5 == 4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        FrameLayout PolicyWebView$lambda$26$lambda$25;
                        PolicyWebView$lambda$26$lambda$25 = PolicyGateKt.PolicyWebView$lambda$26$lambda$25(PolicyWebViewHost.this, i, str, str2, (Context) obj);
                        return PolicyWebView$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function1 function12 = (Function1) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1224400529);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):PolicyGate.kt#9igjgp");
            boolean changedInstance3 = (i4 == 16384) | (i5 == 4) | (i6 == 32) | startRestartGroup.changedInstance(policyWebViewHost);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PolicyWebView$lambda$28$lambda$27;
                        PolicyWebView$lambda$28$lambda$27 = PolicyGateKt.PolicyWebView$lambda$28$lambda$27(i, str, str2, policyWebViewHost, (FrameLayout) obj);
                        return PolicyWebView$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function12, modifier2, (Function1) rememberedValue5, startRestartGroup, (i3 >> 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PolicyWebView$lambda$29;
                    PolicyWebView$lambda$29 = PolicyGateKt.PolicyWebView$lambda$29(str, str2, modifier, policyWebViewConfig, i, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PolicyWebView$lambda$29;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PolicyWebView$lambda$23$lambda$22(Context context, final LifecycleOwner lifecycleOwner, final PolicyWebViewHost policyWebViewHost, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Activity findActivity = findActivity(context);
        final Integer valueOf = findActivity != null ? Integer.valueOf(findActivity.getRequestedOrientation()) : null;
        if (findActivity != null) {
            findActivity.setRequestedOrientation(10);
        }
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda9
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                PolicyGateKt.PolicyWebView$lambda$23$lambda$22$lambda$20(PolicyWebViewHost.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.createyourself.policy.PolicyGateKt$PolicyWebView$lambda$23$lambda$22$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                Integer num = valueOf;
                if (num != null) {
                    findActivity.setRequestedOrientation(num.intValue());
                }
                policyWebViewHost.destroy();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PolicyWebView$lambda$23$lambda$22$lambda$20(PolicyWebViewHost policyWebViewHost, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            policyWebViewHost.resume();
        } else if (i == 2) {
            policyWebViewHost.pause();
        } else {
            if (i != 3) {
                return;
            }
            policyWebViewHost.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout PolicyWebView$lambda$26$lambda$25(PolicyWebViewHost policyWebViewHost, int i, String str, String str2, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout createContainer = policyWebViewHost.createContainer(context);
        createContainer.setTag(policyLoadKey(i, str, str2));
        policyWebViewHost.loadPolicy(str, str2);
        return createContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolicyWebView$lambda$28$lambda$27(int i, String str, String str2, PolicyWebViewHost policyWebViewHost, FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        String policyLoadKey = policyLoadKey(i, str, str2);
        if (!Intrinsics.areEqual(container.getTag(), policyLoadKey)) {
            container.setTag(policyLoadKey);
            policyWebViewHost.loadPolicy(str, str2);
        }
        return Unit.INSTANCE;
    }

    private static final String policyLoadKey(int i, String str, String str2) {
        if (str2 != null) {
            str = str2;
        }
        return i + ":" + str;
    }

    private static final void PolicyUnavailableScreen(final Modifier modifier, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1339868302);
        ComposerKt.sourceInformation(startRestartGroup, "C(PolicyUnavailableScreen)371@12570L2316:PolicyGate.kt#o805rc");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1339868302, i2, -1, "com.createyourself.policy.PolicyUnavailableScreen (PolicyGate.kt:370)");
            }
            Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), Brush.Companion.m6735linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6776boximpl(ColorKt.Color(4294966002L)), Color.m6776boximpl(ColorKt.Color(4294245366L)), Color.m6776boximpl(ColorKt.Color(4294963431L))}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null)), Dp.m9732constructorimpl(22));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1201padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -404226389, "C386@12980L1900:PolicyGate.kt#o805rc");
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1435369105, "C392@13207L60,393@13310L38,394@13363L1507,390@13112L1758:PolicyGate.kt#o805rc");
            RoundedCornerShape m1582RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(28));
            CardColors m2643cardColorsro_MJ88 = CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.m6785copywmQWz5c$default(Color.INSTANCE.m6823getWhite0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14);
            CardElevation m2644cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2644cardElevationaqJV_2Y(Dp.m9732constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62);
            startRestartGroup = startRestartGroup;
            CardKt.Card(null, m1582RoundedCornerShape0680j_4, m2643cardColorsro_MJ88, m2644cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1235741636, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.createyourself.policy.PolicyGateKt$PolicyUnavailableScreen$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    ComposerKt.sourceInformation(composer2, "C395@13381L1475:PolicyGate.kt#o805rc");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1235741636, i3, -1, "com.createyourself.policy.PolicyUnavailableScreen.<anonymous>.<anonymous>.<anonymous> (PolicyGate.kt:395)");
                    }
                    Modifier m1201padding3ABfNKs2 = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(22));
                    Function0<Unit> function02 = function0;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m3 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1201padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer2);
                    Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1378130138, "C396@13435L273,403@13729L30,404@13780L412,411@14213L30,415@14422L158,412@14264L574:PolicyGate.kt#o805rc");
                    TextKt.m4292TextNvy7gAk("Policy unavailable", null, ColorKt.Color(4280295716L), null, TextUnitKt.getSp(30), null, FontWeight.INSTANCE.getBlack(), null, TextUnitKt.getSp(0), null, null, 0L, 0, false, 0, 0, null, null, composer2, 102261126, 0, 261802);
                    SpacerKt.Spacer(SizeKt.m1257height3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(12)), composer2, 6);
                    TextKt.m4292TextNvy7gAk("You need to review and accept the policy before using Create Yourself. Connect to the internet, open the policy, and accept it. After that, you can use the app offline.", null, ColorKt.Color(4285034604L), null, TextUnitKt.getSp(16), null, null, null, TextUnitKt.getSp(0), null, null, TextUnitKt.getSp(23), 0, false, 0, 0, null, null, composer2, 100688262, 48, 259818);
                    SpacerKt.Spacer(SizeKt.m1257height3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(20)), composer2, 6);
                    ButtonKt.Button(function02, (Modifier) null, false, (Shape) RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(18)), ButtonDefaults.INSTANCE.m2589buttonColorsro_MJ88(ColorKt.Color(4284003979L), Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$PolicyGateKt.INSTANCE.m10369getLambda$588274274$policy_release(), composer2, 805306368, 486);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 17);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.createyourself.policy.PolicyGateKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PolicyUnavailableScreen$lambda$32;
                    PolicyUnavailableScreen$lambda$32 = PolicyGateKt.PolicyUnavailableScreen$lambda$32(Modifier.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PolicyUnavailableScreen$lambda$32;
                }
            });
        }
    }

    private static final boolean hasInternetConnection(Context context) {
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    private static final Activity findActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return null;
    }

    public static final String defaultPolicyHtml() {
        return "<!doctype html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, viewport-fit=cover\">\n  <style>\n    :root {\n      color-scheme: light;\n      --ink: #202124;\n      --muted: #68706c;\n      --paper: #fffaf2;\n      --mint: #78c6a3;\n      --coral: #ff8a6b;\n      --cream: #fff3df;\n      --line: rgba(32, 33, 36, 0.12);\n    }\n    * { box-sizing: border-box; }\n    body {\n      margin: 0;\n      min-height: 100vh;\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", sans-serif;\n      color: var(--ink);\n      background:\n        radial-gradient(circle at 22% 12%, rgba(120, 198, 163, 0.30), transparent 28%),\n        radial-gradient(circle at 85% 4%, rgba(255, 138, 107, 0.22), transparent 25%),\n        linear-gradient(145deg, #fffaf2 0%, #f4fbf6 54%, #fff2e9 100%);\n      padding: max(28px, env(safe-area-inset-top)) 22px max(24px, env(safe-area-inset-bottom));\n    }\n    main {\n      min-height: calc(100vh - 52px);\n      display: flex;\n      flex-direction: column;\n      justify-content: space-between;\n      gap: 28px;\n    }\n    .brand {\n      display: inline-flex;\n      align-items: center;\n      gap: 10px;\n      font-weight: 800;\n      letter-spacing: 0;\n      font-size: 18px;\n    }\n    .mark {\n      width: 34px;\n      height: 34px;\n      border-radius: 12px;\n      background: linear-gradient(135deg, var(--mint), var(--coral));\n      box-shadow: 0 10px 22px rgba(68, 112, 92, 0.22);\n    }\n    h1 {\n      margin: 34px 0 14px;\n      font-size: clamp(34px, 10vw, 54px);\n      line-height: 0.98;\n      letter-spacing: 0;\n    }\n    p {\n      margin: 0;\n      color: var(--muted);\n      font-size: 16px;\n      line-height: 1.55;\n    }\n    .policy {\n      margin-top: 26px;\n      border: 1px solid var(--line);\n      border-radius: 24px;\n      background: rgba(255, 255, 255, 0.56);\n      padding: 18px;\n      backdrop-filter: blur(18px);\n    }\n    .policy h2 {\n      margin: 0 0 12px;\n      font-size: 18px;\n      letter-spacing: 0;\n    }\n    ul {\n      margin: 0;\n      padding-left: 19px;\n      color: var(--muted);\n      line-height: 1.55;\n      font-size: 14px;\n    }\n    .actions {\n      display: grid;\n      grid-template-columns: 1fr 1fr;\n      gap: 12px;\n    }\n    button {\n      appearance: none;\n      border: 0;\n      border-radius: 18px;\n      min-height: 56px;\n      font-size: 16px;\n      font-weight: 800;\n      letter-spacing: 0;\n    }\n    .accept {\n      color: white;\n      background: linear-gradient(135deg, #2d9c74, #ff8a6b);\n      box-shadow: 0 16px 30px rgba(60, 132, 103, 0.28);\n    }\n    .decline {\n      color: var(--ink);\n      background: rgba(255,255,255,0.74);\n      border: 1px solid var(--line);\n    }\n  </style>\n  <script>\n    function sendMessage(value) {\n      CreateYourselfPolicy.recieve(value);\n    }\n  </script>\n</head>\n<body>\n  <main>\n    <section>\n      <div class=\"brand\"><div class=\"mark\"></div><span>Create Yourself</span></div>\n      <h1>Build your days with intention.</h1>\n      <p>Before you enter, please review the lightweight policy for this habit tracker.</p>\n      <div class=\"policy\">\n        <h2>Policy</h2>\n        <ul>\n          <li>Your habit choices stay on this device unless the app later adds a cloud sync feature.</li>\n          <li>The app is a self-improvement tool, not medical or professional advice.</li>\n          <li>You can stop using the app at any time.</li>\n        </ul>\n      </div>\n    </section>\n    <section class=\"actions\">\n      <button class=\"decline\" onclick=\"sendMessage('decline')\">Decline</button>\n      <button class=\"accept\" onclick=\"sendMessage('accept')\">Accept</button>\n    </section>\n  </main>\n</body>\n</html>";
    }
}
