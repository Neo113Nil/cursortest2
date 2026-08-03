package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001aB\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001aÄ\u0001\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a£\u0001\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0001¢\u0006\u0004\b \u0010!\u001a2\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b%\u0010&\u001a\f\u0010'\u001a\u00020(*\u00020(H\u0002\"\u0016\u0010)\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+\"\u0016\u0010-\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b.\u0010+\"\u0010\u0010/\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010,\"\u0010\u00100\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010,\"\u0010\u00101\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010,\"\u0010\u00102\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010,\"\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u00108\u001a\b\u0012\u0004\u0012\u00020:098\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"BasicAlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "AlertDialog", "AlertDialogImpl", "confirmButton", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "AlertDialogImpl-wrnwzgE", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "buttons", "buttonContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogFlowRow", "mainAxisSpacing", "crossAxisSpacing", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "flip", "Landroidx/compose/ui/unit/LayoutDirection;", "DialogMinWidth", "getDialogMinWidth", "()F", "F", "DialogMaxWidth", "getDialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "DialogPaddingValue", "TextPaddingValue", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TitlePadding", "TextPadding", "LocalBasicAlertDialogOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/BasicAlertDialogOverride;", "getLocalBasicAlertDialogOverride$annotations", "()V", "getLocalBasicAlertDialogOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final float ButtonsCrossAxisSpacing;
    private static final float ButtonsMainAxisSpacing;
    private static final PaddingValues DialogPadding;
    private static final float DialogPaddingValue;
    private static final PaddingValues IconPadding;
    private static final ProvidableCompositionLocal<BasicAlertDialogOverride> LocalBasicAlertDialogOverride;
    private static final PaddingValues TextPadding;
    private static final float TextPaddingValue;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = Dp.m9732constructorimpl(280);
    private static final float DialogMaxWidth = Dp.m9732constructorimpl(560);

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialog$lambda$0(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2, int i, int i2, Composer composer, int i3) {
        AlertDialog(function0, modifier, dialogProperties, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_4hvqGtA$lambda$1(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Shape shape, long j, float f, long j2, long j3, long j4, long j5, int i, int i2, int i3, Composer composer, int i4) {
        m2466AlertDialogContent4hvqGtA(function2, modifier, function22, function23, function24, shape, j, f, j2, j3, j4, j5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogFlowRow_ixp7dh8$lambda$1(float f, float f2, Function2 function2, int i, Composer composer, int i2) {
        m2467AlertDialogFlowRowixp7dh8(f, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogImpl_wrnwzgE$lambda$1(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, int i, int i2, Composer composer, int i3) {
        m2468AlertDialogImplwrnwzgE(function0, function2, modifier, function22, function23, function24, function25, shape, j, j2, j3, j4, f, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicAlertDialog$lambda$1(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2, int i, int i2, Composer composer, int i3) {
        BasicAlertDialog(function0, modifier, dialogProperties, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalBasicAlertDialogOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicAlertDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(24925658);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicAlertDialog)N(onDismissRequest,modifier,properties,content)145@6971L7,*152@7214L18:AlertDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(24925658, i3, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:144)");
                    }
                    ProvidableCompositionLocal<BasicAlertDialogOverride> providableCompositionLocal = LocalBasicAlertDialogOverride;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ((BasicAlertDialogOverride) consume).BasicAlertDialog(new BasicAlertDialogOverrideScope(function0, companion, dialogProperties2, function2), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final DialogProperties dialogProperties3 = dialogProperties2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BasicAlertDialog$lambda$1;
                            BasicAlertDialog$lambda$1 = AlertDialogKt.BasicAlertDialog$lambda$1(Function0.this, modifier3, dialogProperties3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BasicAlertDialog$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            dialogProperties2 = dialogProperties;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            final DialogProperties dialogProperties32 = dialogProperties2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        final DialogProperties dialogProperties322 = dialogProperties2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    @Deprecated(message = "Use BasicAlertDialog instead", replaceWith = @ReplaceWith(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        final DialogProperties dialogProperties2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(402506956);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)N(onDismissRequest,modifier,properties,content)217@9772L65:AlertDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(dialogProperties) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    dialogProperties2 = dialogProperties;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    DialogProperties dialogProperties3 = i4 != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(402506956, i3, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:217)");
                    }
                    BasicAlertDialog(function02, modifier4, dialogProperties3, function2, startRestartGroup, i3 & 8190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    dialogProperties2 = dialogProperties3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AlertDialog$lambda$0;
                            AlertDialog$lambda$0 = AlertDialogKt.AlertDialog$lambda$0(Function0.this, modifier3, dialogProperties2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return AlertDialog$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m2468AlertDialogImplwrnwzgE(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Shape shape, final long j, final long j2, final long j3, final long j4, final float f, final DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i4;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(-867616355);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogImpl)N(onDismissRequest,confirmButton,modifier,dismissButton,icon,title,text,shape,containerColor:c#ui.graphics.Color,iconContentColor:c#ui.graphics.Color,titleContentColor:c#ui.graphics.Color,textContentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,properties)271@11603L1463,267@11472L1594:AlertDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function26 = function2;
            i3 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
        } else {
            function26 = function2;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function27 = function22;
            i3 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
        } else {
            function27 = function22;
        }
        if ((i & 24576) == 0) {
            function28 = function23;
            i3 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
        } else {
            function28 = function23;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(j) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(j2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(dialogProperties) ? 2048 : 1024;
        }
        int i5 = i4;
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867616355, i3, i5, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:266)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final float f3 = f2;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function28;
            BasicAlertDialog(function0, modifier, dialogProperties, ComposableLambdaKt.rememberComposableLambda(527420759, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogImpl_wrnwzgE$lambda$0;
                    AlertDialogImpl_wrnwzgE$lambda$0 = AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0(Function2.this, function24, function25, shape, j, f3, j2, j3, j4, function29, function210, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogImpl_wrnwzgE$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogImpl_wrnwzgE$lambda$1;
                    AlertDialogImpl_wrnwzgE$lambda$1 = AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$1(Function0.this, function2, modifier, function22, function23, function24, function25, shape, j, j2, j3, j4, f, dialogProperties, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogImpl_wrnwzgE$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogImpl_wrnwzgE$lambda$0(Function2 function2, Function2 function22, Function2 function23, Shape shape, long j, float f, long j2, long j3, long j4, final Function2 function24, final Function2 function25, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C273@11655L648,299@12895L5,272@11613L1447:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(527420759, i, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:272)");
            }
            m2466AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1367541877, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogImpl_wrnwzgE$lambda$0$0;
                    AlertDialogImpl_wrnwzgE$lambda$0$0 = AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0$0(Function2.this, function25, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogImpl_wrnwzgE$lambda$0$0;
                }
            }, composer, 54), null, function2, function22, function23, shape, j, f, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6), j2, j3, j4, composer, 6, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogImpl_wrnwzgE$lambda$0$0(final Function2 function2, final Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C275@11758L7,284@12190L99,277@11853L436:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1367541877, i, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:274)");
            }
            ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localMinimumInteractiveComponentSize);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float m9746unboximpl = ((Dp) consume).m9746unboximpl();
            if (Float.isNaN(m9746unboximpl)) {
                m9746unboximpl = Dp.m9732constructorimpl(0);
            }
            float m9732constructorimpl = Dp.m9732constructorimpl(m9746unboximpl - ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM());
            float f = ButtonsMainAxisSpacing;
            float f2 = ButtonsCrossAxisSpacing;
            m2467AlertDialogFlowRowixp7dh8(f, ((Dp) RangesKt.coerceIn(Dp.m9730boximpl(Dp.m9732constructorimpl(f2 - m9732constructorimpl)), Dp.m9730boximpl(Dp.m9732constructorimpl(0)), Dp.m9730boximpl(f2))).m9746unboximpl(), ComposableLambdaKt.rememberComposableLambda(-459506658, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogImpl_wrnwzgE$lambda$0$0$1;
                    AlertDialogImpl_wrnwzgE$lambda$0$0$1 = AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0$0$1(Function2.this, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogImpl_wrnwzgE$lambda$0$0$1;
                }
            }, composer, 54), composer, 390);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogImpl_wrnwzgE$lambda$0$0$1(Function2 function2, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C285@12212L15:AlertDialog.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459506658, i, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:285)");
            }
            function2.invoke(composer, 0);
            if (function22 == null) {
                composer.startReplaceGroup(-1102003461);
            } else {
                composer.startReplaceGroup(795735494);
                ComposerKt.sourceInformation(composer, "286@12263L8");
                function22.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2466AlertDialogContent4hvqGtA(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final long j, final float f, final long j2, final long j3, final long j4, final long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        int i5;
        int i6;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1378716401);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogContent)N(buttons,modifier,icon,title,text,shape,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,buttonContentColor:c#ui.graphics.Color,iconContentColor:c#ui.graphics.Color,titleContentColor:c#ui.graphics.Color,textContentColor:c#ui.graphics.Color)327@13635L2445,322@13495L2585:AlertDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                function25 = function24;
                i4 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
            } else {
                function25 = function24;
            }
            if ((196608 & i) != 0) {
                shape2 = shape;
                i4 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) == 0) {
                i4 |= startRestartGroup.changed(j) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(j2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(j3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            }
            if ((i2 & 6) != 0) {
                i5 = i2 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= startRestartGroup.changed(j5) ? 32 : 16;
            }
            i6 = i5;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
            } else {
                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1378716401, i4, i6, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:321)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                int i8 = i4 >> 12;
                modifier2 = companion;
                SurfaceKt.m4112SurfaceT9BRK9s(modifier2, shape2, j, 0L, f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-652798794, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AlertDialogContent_4hvqGtA$lambda$0;
                        AlertDialogContent_4hvqGtA$lambda$0 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0(Function2.this, function23, function26, j3, j4, j5, j2, function2, (Composer) obj, ((Integer) obj2).intValue());
                        return AlertDialogContent_4hvqGtA$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 14) | 12582912 | (i8 & 112) | (i8 & 896) | ((i4 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AlertDialogContent_4hvqGtA$lambda$1;
                        AlertDialogContent_4hvqGtA$lambda$1 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$1(Function2.this, modifier2, function22, function23, function24, shape, j, f, j2, j3, j4, j5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return AlertDialogContent_4hvqGtA$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i6 = i5;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_4hvqGtA$lambda$0(final Function2 function2, final Function2 function22, final Function2 function23, long j, long j2, long j3, long j4, Function2 function24, Composer composer, int i) {
        TextStyle value;
        int i2;
        int i3;
        ComposerKt.sourceInformation(composer, "C328@13645L2429:AlertDialog.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652798794, i, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:328)");
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DialogPadding);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 346150949, "C380@15731L333:AlertDialog.kt#uh7d8r");
            if (function2 == null) {
                composer.startReplaceGroup(346092326);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(346092327);
                ComposerKt.sourceInformation(composer, "*330@13808L165,330@13738L235");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), ComposableLambdaKt.rememberComposableLambda(-1128150638, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AlertDialogContent_4hvqGtA$lambda$0$0$0$0;
                        AlertDialogContent_4hvqGtA$lambda$0$0$0$0 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$0$0(ColumnScope.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                        return AlertDialogContent_4hvqGtA$lambda$0$0$0$0;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            }
            if (function22 == null) {
                composer.startReplaceGroup(346408309);
                composer.endReplaceGroup();
                i2 = 54;
                i3 = 6;
            } else {
                composer.startReplaceGroup(346408310);
                ComposerKt.sourceInformation(composer, "*349@14576L569,346@14431L714");
                if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
                    composer.startReplaceGroup(1812109189);
                    ComposerKt.sourceInformation(composer, "339@14157L10");
                    value = TextStyle.m9154copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineSmall(), 0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(26), null, null, null, 0, 0, null, 16646141, null);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1812321322);
                    ComposerKt.sourceInformation(composer, "344@14387L5");
                    value = TypographyKt.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer, 6);
                    composer.endReplaceGroup();
                }
                i2 = 54;
                i3 = 6;
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, value, ComposableLambdaKt.rememberComposableLambda(71284337, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AlertDialogContent_4hvqGtA$lambda$0$0$1$0;
                        AlertDialogContent_4hvqGtA$lambda$0$0$1$0 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$1$0(ColumnScope.this, function2, function22, (Composer) obj, ((Integer) obj2).intValue());
                        return AlertDialogContent_4hvqGtA$lambda$0$0$1$0;
                    }
                }, composer, 54), composer, 384);
                composer.endReplaceGroup();
            }
            if (function23 == null) {
                composer.startReplaceGroup(347550969);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(347550970);
                ComposerKt.sourceInformation(composer, "*366@15248L5,370@15414L290,367@15270L434");
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer, i3), ComposableLambdaKt.rememberComposableLambda(705583346, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AlertDialogContent_4hvqGtA$lambda$0$0$2$0;
                        AlertDialogContent_4hvqGtA$lambda$0$0$2$0 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$2$0(ColumnScope.this, function23, (Composer) obj, ((Integer) obj2).intValue());
                        return AlertDialogContent_4hvqGtA$lambda$0$0$2$0;
                    }
                }, composer, i2), composer, 384);
                composer.endReplaceGroup();
            }
            Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, align);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 200047666, "C381@15844L5,382@15866L184:AlertDialog.kt#uh7d8r");
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j4, TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer, i3), function24, composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_4hvqGtA$lambda$0$0$0$0(ColumnScope columnScope, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C331@13830L125:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1128150638, i, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:331)");
            }
            Modifier align = columnScope.align(PaddingKt.padding(Modifier.INSTANCE, IconPadding), Alignment.INSTANCE.getCenterHorizontally());
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, align);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1288652187, "C332@13927L6:AlertDialog.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_4hvqGtA$lambda$0$0$1$0(ColumnScope columnScope, Function2 function2, Function2 function22, Composer composer, int i) {
        Alignment.Horizontal centerHorizontally;
        ComposerKt.sourceInformation(composer, "C350@14598L529:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(71284337, i, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:350)");
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, TitlePadding);
            if (function2 == null) {
                centerHorizontally = Alignment.INSTANCE.getStart();
            } else {
                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            }
            Modifier align = columnScope.align(padding, centerHorizontally);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, align);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1971616197, "C361@15098L7:AlertDialog.kt#uh7d8r");
            function22.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_4hvqGtA$lambda$0$0$2$0(ColumnScope columnScope, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C371@15436L250:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705583346, i, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:371)");
            }
            Modifier align = columnScope.align(PaddingKt.padding(columnScope.weight(Modifier.INSTANCE, 1.0f, false), TextPadding), Alignment.INSTANCE.getStart());
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, align);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 517290885, "C376@15658L6:AlertDialog.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m2467AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-917637668);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)N(mainAxisSpacing:c#ui.unit.Dp,crossAxisSpacing:c#ui.unit.Dp,content)401@16384L7,404@16629L353,404@16542L440:AlertDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917637668, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:400)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LayoutDirection layoutDirection = (LayoutDirection) consume;
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(flip(layoutDirection)), ComposableLambdaKt.rememberComposableLambda(-1986402020, true, new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogFlowRow_ixp7dh8$lambda$0;
                    AlertDialogFlowRow_ixp7dh8$lambda$0 = AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$0(f, f2, layoutDirection, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogFlowRow_ixp7dh8$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogFlowRow_ixp7dh8$lambda$1;
                    AlertDialogFlowRow_ixp7dh8$lambda$1 = AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$1(f, f2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogFlowRow_ixp7dh8$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogFlowRow_ixp7dh8$lambda$0(float f, float f2, final LayoutDirection layoutDirection, final Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C408@16807L169,405@16639L337:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986402020, i, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous> (AlertDialog.kt:405)");
            }
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.m868spacedBy0680j_4(f), Arrangement.INSTANCE.m868spacedBy0680j_4(f2), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(879927511, true, new Function3() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AlertDialogFlowRow_ixp7dh8$lambda$0$0;
                    AlertDialogFlowRow_ixp7dh8$lambda$0$0 = AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$0$0(LayoutDirection.this, function2, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AlertDialogFlowRow_ixp7dh8$lambda$0$0;
                }
            }, composer, 54), composer, 1572864, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogFlowRow_ixp7dh8$lambda$0$0(LayoutDirection layoutDirection, Function2 function2, FlowRowScope flowRowScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C409@16821L145:AlertDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(879927511, i, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous>.<anonymous> (AlertDialog.kt:409)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(layoutDirection), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final LayoutDirection flip(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            return LayoutDirection.Rtl;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return LayoutDirection.Ltr;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final ProvidableCompositionLocal<BasicAlertDialogOverride> getLocalBasicAlertDialogOverride() {
        return LocalBasicAlertDialogOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BasicAlertDialogOverride LocalBasicAlertDialogOverride$lambda$0() {
        return DefaultBasicAlertDialogOverride.INSTANCE;
    }

    static {
        float f = 8;
        ButtonsMainAxisSpacing = Dp.m9732constructorimpl(f);
        ButtonsCrossAxisSpacing = Dp.m9732constructorimpl(f);
        float m9732constructorimpl = Dp.m9732constructorimpl(PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 20 : 24);
        DialogPaddingValue = m9732constructorimpl;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 16 : 24);
        TextPaddingValue = m9732constructorimpl2;
        DialogPadding = PaddingKt.m1194PaddingValues0680j_4(m9732constructorimpl);
        float f2 = 16;
        IconPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m9732constructorimpl(f2), 7, null);
        TitlePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m9732constructorimpl(f2), 7, null);
        TextPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, m9732constructorimpl2, 7, null);
        LocalBasicAlertDialogOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BasicAlertDialogOverride LocalBasicAlertDialogOverride$lambda$0;
                LocalBasicAlertDialogOverride$lambda$0 = AlertDialogKt.LocalBasicAlertDialogOverride$lambda$0();
                return LocalBasicAlertDialogOverride$lambda$0;
            }
        }, 1, null);
    }
}
