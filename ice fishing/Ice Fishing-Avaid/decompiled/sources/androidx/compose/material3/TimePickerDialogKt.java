package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a·\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"TimePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "title", "modifier", "Landroidx/compose/ui/Modifier;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "modeToggleButton", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "TimePickerDialog-FItCLgY", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TimePickerDialogLayout", "TimePickerDialogLayout-3csKH6Y", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TimePickerCustomLayout", "actions", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TimePickerDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerCustomLayout$lambda$2(Function2 function2, Function2 function22, Function3 function3, int i, Composer composer, int i2) {
        TimePickerCustomLayout(function2, function22, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerDialogLayout_3csKH6Y$lambda$1(Function2 function2, Function2 function22, Modifier modifier, Function2 function23, Function2 function24, Shape shape, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        m4324TimePickerDialogLayout3csKH6Y(function2, function22, modifier, function23, function24, shape, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerDialog_FItCLgY$lambda$1(Function0 function0, Function2 function2, Function2 function22, Modifier modifier, DialogProperties dialogProperties, Function2 function23, Function2 function24, Shape shape, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        m4323TimePickerDialogFItCLgY(function0, function2, function22, modifier, dialogProperties, function23, function24, shape, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: TimePickerDialog-FItCLgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4323TimePickerDialogFItCLgY(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, DialogProperties dialogProperties, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape2;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        final long j3;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        int i9;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(951250327);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerDialog)N(onDismissRequest,confirmButton,title,modifier,properties,modeToggleButton,dismissButton,shape,containerColor:c#ui.graphics.Color,content)79@3820L347,79@3751L416:TimePickerDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function25 = function22;
            i3 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
        } else {
            function25 = function22;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function26 = function23;
                    i3 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function27 = function24;
                        i3 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(shape)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        if ((i & 100663296) == 0) {
                            i7 = i3 | (((i2 & 256) == 0 && startRestartGroup.changed(j)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag);
                        } else {
                            i7 = i3;
                        }
                        int i12 = i7;
                        if ((i & 805306368) == 0) {
                            i8 = i12 | (startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag);
                        } else {
                            i8 = i12;
                        }
                        if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "75@3618L5,76@3678L14");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i8 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i8 &= -234881025;
                                }
                                shape4 = shape;
                                j3 = j;
                                function210 = function26;
                                function211 = function27;
                                i9 = i8;
                                modifier4 = modifier2;
                            } else {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                DialogProperties dialogProperties4 = i4 != 0 ? new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null) : dialogProperties2;
                                if (i5 != 0) {
                                    function26 = null;
                                }
                                if (i6 != 0) {
                                    function27 = null;
                                }
                                if ((i2 & 128) != 0) {
                                    shape3 = TimePickerDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i8 &= -29360129;
                                } else {
                                    shape3 = shape;
                                }
                                if ((i2 & 256) != 0) {
                                    i8 &= -234881025;
                                    shape4 = shape3;
                                    j3 = TimePickerDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                } else {
                                    j3 = j;
                                    shape4 = shape3;
                                }
                                function210 = function26;
                                i9 = i8;
                                dialogProperties2 = dialogProperties4;
                                modifier4 = modifier2;
                                function211 = function27;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(951250327, i9, -1, "androidx.compose.material3.TimePickerDialog (TimePickerDialog.kt:78)");
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function212 = function25;
                            AndroidDialog_androidKt.Dialog(function0, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(296331566, true, new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TimePickerDialog_FItCLgY$lambda$0;
                                    TimePickerDialog_FItCLgY$lambda$0 = TimePickerDialogKt.TimePickerDialog_FItCLgY$lambda$0(Function2.this, function212, modifier4, function210, function211, shape4, j3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                    return TimePickerDialog_FItCLgY$lambda$0;
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i9 >> 9) & 112) | (i9 & 14) | 384, 0);
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            dialogProperties3 = dialogProperties2;
                            modifier3 = modifier4;
                            function28 = function210;
                            function29 = function211;
                            shape2 = shape4;
                            j2 = j3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            dialogProperties3 = dialogProperties2;
                            function28 = function26;
                            function29 = function27;
                            shape2 = shape;
                            j2 = j;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TimePickerDialog_FItCLgY$lambda$1;
                                    TimePickerDialog_FItCLgY$lambda$1 = TimePickerDialogKt.TimePickerDialog_FItCLgY$lambda$1(Function0.this, function2, function22, modifier3, dialogProperties3, function28, function29, shape2, j2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TimePickerDialog_FItCLgY$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function27 = function24;
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    int i122 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function26 = function23;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function27 = function24;
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                int i1222 = i7;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            dialogProperties2 = dialogProperties;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function26 = function23;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function27 = function24;
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            int i12222 = i7;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function26 = function23;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function27 = function24;
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        int i122222 = i7;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerDialog_FItCLgY$lambda$0(Function2 function2, Function2 function22, Modifier modifier, Function2 function23, Function2 function24, Shape shape, long j, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C80@3830L331:TimePickerDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(296331566, i, -1, "androidx.compose.material3.TimePickerDialog.<anonymous> (TimePickerDialog.kt:80)");
            }
            m4324TimePickerDialogLayout3csKH6Y(function2, function22, modifier, function23, function24, shape, j, function3, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c3  */
    /* renamed from: TimePickerDialogLayout-3csKH6Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4324TimePickerDialogLayout3csKH6Y(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape2;
        long j2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-401873644);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerDialogLayout)N(confirmButton,title,modifier,modeToggleButton,dismissButton,shape,containerColor:c#ui.graphics.Color,content)109@4776L519,104@4619L676:TimePickerDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function25 = function22;
            i3 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        } else {
            function25 = function22;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function26 = function23;
                i3 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function27 = function24;
                    i3 |= startRestartGroup.changedInstance(function27) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j2 = j;
                            if (startRestartGroup.changed(j2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            j2 = j;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    if ((12582912 & i) != 0) {
                        function32 = function3;
                        i3 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                    } else {
                        function32 = function3;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "100@4486L5,101@4546L14");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function26 = null;
                            }
                            if (i5 != 0) {
                                function27 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i7 = i6 & (-458753);
                                shape2 = TimePickerDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if ((i2 & 64) != 0) {
                                j2 = TimePickerDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i8 = i7 & (-3670017);
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function29 = function27;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-401873644, i7, -1, "androidx.compose.material3.TimePickerDialogLayout (TimePickerDialog.kt:103)");
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function210 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            int i12 = i7 >> 12;
                            composer2 = startRestartGroup;
                            SurfaceKt.m4112SurfaceT9BRK9s(modifier4, shape2, j2, 0L, DialogTokens.INSTANCE.m5145getContainerElevationD9Ej5fM(), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1522143641, true, new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TimePickerDialogLayout_3csKH6Y$lambda$0;
                                    TimePickerDialogLayout_3csKH6Y$lambda$0 = TimePickerDialogKt.TimePickerDialogLayout_3csKH6Y$lambda$0(Function2.this, function33, function211, function29, function2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TimePickerDialogLayout_3csKH6Y$lambda$0;
                                }
                            }, startRestartGroup, 54), composer2, ((i7 >> 6) & 14) | 12607488 | (i12 & 112) | (i12 & 896), LocationRequestCompat.QUALITY_LOW_POWER);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function28 = function29;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i8 = (i2 & 32) != 0 ? i6 & (-458753) : i6;
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                        }
                        i7 = i8;
                        final Function2 function292 = function27;
                        Modifier modifier42 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function2 function2102 = function25;
                        final Function2 function2112 = function26;
                        final Function3 function332 = function32;
                        int i122 = i7 >> 12;
                        composer2 = startRestartGroup;
                        SurfaceKt.m4112SurfaceT9BRK9s(modifier42, shape2, j2, 0L, DialogTokens.INSTANCE.m5145getContainerElevationD9Ej5fM(), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1522143641, true, new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TimePickerDialogLayout_3csKH6Y$lambda$0;
                                TimePickerDialogLayout_3csKH6Y$lambda$0 = TimePickerDialogKt.TimePickerDialogLayout_3csKH6Y$lambda$0(Function2.this, function332, function2112, function292, function2, (Composer) obj, ((Integer) obj2).intValue());
                                return TimePickerDialogLayout_3csKH6Y$lambda$0;
                            }
                        }, startRestartGroup, 54), composer2, ((i7 >> 6) & 14) | 12607488 | (i122 & 112) | (i122 & 896), LocationRequestCompat.QUALITY_LOW_POWER);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function28 = function292;
                        modifier3 = modifier42;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        function28 = function27;
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function212 = function26;
                    final Shape shape3 = shape2;
                    final long j3 = j2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TimePickerDialogLayout_3csKH6Y$lambda$1;
                                TimePickerDialogLayout_3csKH6Y$lambda$1 = TimePickerDialogKt.TimePickerDialogLayout_3csKH6Y$lambda$1(Function2.this, function22, modifier3, function212, function28, shape3, j3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TimePickerDialogLayout_3csKH6Y$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function27 = function24;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) != 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                }
                final Function2 function2122 = function26;
                final Shape shape32 = shape2;
                final long j32 = j2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function26 = function23;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function27 = function24;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
            }
            final Function2 function21222 = function26;
            final Shape shape322 = shape2;
            final long j322 = j2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function26 = function23;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function27 = function24;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
        }
        final Function2 function212222 = function26;
        final Shape shape3222 = shape2;
        final long j3222 = j2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerDialogLayout_3csKH6Y$lambda$0(Function2 function2, Function3 function3, final Function2 function22, final Function2 function23, final Function2 function24, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C112@4859L388,110@4786L503:TimePickerDialog.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522143641, i, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous> (TimePickerDialog.kt:110)");
            }
            TimePickerCustomLayout(function2, ComposableLambdaKt.rememberComposableLambda(2122920701, true, new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimePickerDialogLayout_3csKH6Y$lambda$0$0;
                    TimePickerDialogLayout_3csKH6Y$lambda$0$0 = TimePickerDialogKt.TimePickerDialogLayout_3csKH6Y$lambda$0$0(Function2.this, function23, function24, (Composer) obj, ((Integer) obj2).intValue());
                    return TimePickerDialogLayout_3csKH6Y$lambda$0$0;
                }
            }, composer, 54), function3, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerDialogLayout_3csKH6Y$lambda$0$0(Function2 function2, Function2 function22, Function2 function23, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C113@4877L356:TimePickerDialog.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122920701, i, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous>.<anonymous> (TimePickerDialog.kt:113)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 675820093, "C118@5097L38,120@5200L15:TimePickerDialog.kt#uh7d8r");
            if (function2 == null) {
                composer.startReplaceGroup(675833080);
            } else {
                composer.startReplaceGroup(2100011049);
                ComposerKt.sourceInformation(composer, "117@5068L8");
                function2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
            if (function22 == null) {
                composer.startReplaceGroup(675935256);
            } else {
                composer.startReplaceGroup(2100014345);
                ComposerKt.sourceInformation(composer, "119@5171L8");
                function22.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            function23.invoke(composer, 0);
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

    public static final void TimePickerCustomLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-493479138);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerCustomLayout)N(title,actions,content)135@5511L238,141@5775L4285,237@10066L56:TimePickerDialog.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-493479138, i2, -1, "androidx.compose.material3.TimePickerCustomLayout (TimePickerDialog.kt:133)");
            }
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(468305759, true, new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimePickerCustomLayout$lambda$0;
                    TimePickerCustomLayout$lambda$0 = TimePickerDialogKt.TimePickerCustomLayout$lambda$0(Function3.this, function2, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return TimePickerCustomLayout$lambda$0;
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1787030213, "CC(remember):TimePickerDialog.kt#9igjgp");
            TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            rememberComposableLambda.invoke(startRestartGroup, 6);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimePickerCustomLayout$lambda$2;
                    TimePickerCustomLayout$lambda$2 = TimePickerDialogKt.TimePickerCustomLayout$lambda$2(Function2.this, function22, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TimePickerCustomLayout$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerCustomLayout$lambda$0(Function3 function3, Function2 function2, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C136@5525L54,137@5592L58,138@5663L76:TimePickerDialog.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468305759, i, -1, "androidx.compose.material3.TimePickerCustomLayout.<anonymous> (TimePickerDialog.kt:136)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "title");
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1033675543, "C136@5570L7:TimePickerDialog.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "actions");
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, layoutId2);
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
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1586475714, "C137@5639L9:TimePickerDialog.kt#uh7d8r");
            function22.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier layoutId3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "timePickerContent");
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, layoutId3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
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
}
