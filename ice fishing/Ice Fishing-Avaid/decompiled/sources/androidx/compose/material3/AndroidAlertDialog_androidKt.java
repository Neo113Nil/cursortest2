package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÜ\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialog_Oix01E0$lambda$0(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, int i, int i2, int i3, Composer composer, int i4) {
        m2473AlertDialogOix01E0(function0, function2, modifier, function22, function23, function24, function25, shape, j, j2, j3, j4, f, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2473AlertDialogOix01E0(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape2;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final float f2;
        final DialogProperties dialogProperties2;
        final Shape shape3;
        final Modifier modifier3;
        final long j6;
        final long j7;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        long j10;
        long j11;
        long j12;
        long j13;
        DialogProperties dialogProperties3;
        float f3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Shape shape4;
        Modifier modifier4;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        long j14;
        long j15;
        int i14;
        int i15;
        long j16;
        long j17;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(94478519);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)N(onDismissRequest,confirmButton,modifier,dismissButton,icon,title,text,shape,containerColor:c#ui.graphics.Color,iconContentColor:c#ui.graphics.Color,titleContentColor:c#ui.graphics.Color,textContentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,properties)46@1649L514:AndroidAlertDialog.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function26 = function23;
                    i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function27 = function24;
                    } else {
                        function27 = function24;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function28 = function25;
                    } else {
                        function28 = function25;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i16 = 8388608;
                                i4 |= i16;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i16 = 4194304;
                        i4 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && startRestartGroup.changed(j)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((805306368 & i) == 0) {
                        i4 |= ((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j3)) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if ((i2 & 48) != 0) {
                        j5 = j4;
                        i9 |= ((i3 & 2048) == 0 && startRestartGroup.changed(j5)) ? 32 : 16;
                    } else {
                        j5 = j4;
                    }
                    i10 = i3 & 4096;
                    if (i10 == 0) {
                        i9 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i9 |= startRestartGroup.changed(f) ? 256 : 128;
                        i11 = i3 & 8192;
                        if (i11 != 0) {
                            i9 |= 3072;
                            i12 = i11;
                        } else {
                            i12 = i11;
                            if ((i2 & 3072) == 0) {
                                i9 |= startRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "62@5007L5,62@5062L14,62@5128L16,62@5197L17,62@5266L16");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i17 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function217 = i5 != 0 ? null : function22;
                                        if (i6 != 0) {
                                            function26 = null;
                                        }
                                        if (i7 != 0) {
                                            function27 = null;
                                        }
                                        if (i8 != 0) {
                                            function28 = null;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                            shape2 = AlertDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        }
                                        if ((i3 & 256) != 0) {
                                            j10 = AlertDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            j10 = j;
                                        }
                                        if ((i3 & 512) != 0) {
                                            j11 = AlertDialogDefaults.INSTANCE.getIconContentColor(startRestartGroup, 6);
                                            i4 = (-1879048193) & i4;
                                        } else {
                                            j11 = j2;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            j12 = AlertDialogDefaults.INSTANCE.getTitleContentColor(startRestartGroup, 6);
                                            i9 &= -15;
                                        } else {
                                            j12 = j3;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            j13 = AlertDialogDefaults.INSTANCE.getTextContentColor(startRestartGroup, 6);
                                            i9 &= -113;
                                        } else {
                                            j13 = j5;
                                        }
                                        float m2459getTonalElevationD9Ej5fM = i10 != 0 ? AlertDialogDefaults.INSTANCE.m2459getTonalElevationD9Ej5fM() : f;
                                        if (i12 != 0) {
                                            f3 = m2459getTonalElevationD9Ej5fM;
                                            dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                                        } else {
                                            dialogProperties3 = dialogProperties;
                                            f3 = m2459getTonalElevationD9Ej5fM;
                                        }
                                        function213 = function27;
                                        function214 = function28;
                                        shape4 = shape2;
                                        modifier4 = modifier2;
                                        i13 = 94478519;
                                        int i18 = i4;
                                        function215 = function26;
                                        function216 = function217;
                                        j14 = j10;
                                        j15 = j12;
                                        long j18 = j13;
                                        i14 = i18;
                                        i15 = i9;
                                        j16 = j11;
                                        j17 = j18;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 512) != 0) {
                                            i4 &= -1879048193;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            i9 &= -15;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i9 &= -113;
                                        }
                                        j15 = j3;
                                        f3 = f;
                                        dialogProperties3 = dialogProperties;
                                        j17 = j5;
                                        i14 = i4;
                                        function213 = function27;
                                        function214 = function28;
                                        shape4 = shape2;
                                        i15 = i9;
                                        modifier4 = modifier2;
                                        i13 = 94478519;
                                        j14 = j;
                                        j16 = j2;
                                        function215 = function26;
                                        function216 = function22;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i13, i14, i15, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
                                    }
                                    composer2 = startRestartGroup;
                                    AlertDialogKt.m2468AlertDialogImplwrnwzgE(function0, function2, modifier4, function216, function215, function213, function214, shape4, j14, j16, j15, j17, f3, dialogProperties3, composer2, i14 & 2147483646, i15 & 8190);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function29 = function216;
                                    function210 = function215;
                                    function211 = function213;
                                    function212 = function214;
                                    shape3 = shape4;
                                    j8 = j14;
                                    j9 = j16;
                                    j6 = j15;
                                    j7 = j17;
                                    f2 = f3;
                                    dialogProperties2 = dialogProperties3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function29 = function22;
                                    f2 = f;
                                    dialogProperties2 = dialogProperties;
                                    shape3 = shape2;
                                    modifier3 = modifier2;
                                    j6 = j3;
                                    j7 = j5;
                                    function210 = function26;
                                    function211 = function27;
                                    function212 = function28;
                                    j8 = j;
                                    j9 = j2;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit AlertDialog_Oix01E0$lambda$0;
                                            AlertDialog_Oix01E0$lambda$0 = AndroidAlertDialog_androidKt.AlertDialog_Oix01E0$lambda$0(Function0.this, function2, modifier3, function29, function210, function211, function212, shape3, j8, j9, j6, j7, f2, dialogProperties2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return AlertDialog_Oix01E0$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i3 & 8192;
                    if (i11 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function23;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((805306368 & i) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) != 0) {
                }
                i10 = i3 & 4096;
                if (i10 == 0) {
                }
                i11 = i3 & 8192;
                if (i11 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function26 = function23;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) != 0) {
            }
            i10 = i3 & 4096;
            if (i10 == 0) {
            }
            i11 = i3 & 8192;
            if (i11 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function26 = function23;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) != 0) {
        }
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        i11 = i3 & 8192;
        if (i11 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
