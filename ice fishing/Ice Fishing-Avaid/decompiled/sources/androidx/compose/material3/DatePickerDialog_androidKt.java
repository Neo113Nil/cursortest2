package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
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
import kotlin.ranges.RangesKt;

/* compiled from: DatePickerDialog.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0019\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001c"}, d2 = {"DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "colors", "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogButtonsMainAxisSpacing", "F", "DialogButtonsCrossAxisSpacing", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DatePickerDialog_androidKt {
    private static final float DialogButtonsCrossAxisSpacing;
    private static final float DialogButtonsMainAxisSpacing;
    private static final PaddingValues DialogButtonsPadding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$1(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2890DatePickerDialogGmEhDVc(function0, function2, modifier, function22, shape, f, datePickerColors, dialogProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108  */
    /* renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2890DatePickerDialogGmEhDVc(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        int i5;
        float f2;
        final DatePickerColors datePickerColors2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape3;
        final float f3;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        DialogProperties dialogProperties3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final float f4;
        int i10;
        Modifier modifier4;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(219718641);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerDialog)N(onDismissRequest,confirmButton,modifier,dismissButton,shape,tonalElevation:c#ui.unit.Dp,colors,properties,content)80@3789L2032,76@3638L2183:DatePickerDialog.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (startRestartGroup.changed(datePickerColors2)) {
                                i11 = 1048576;
                                i3 |= i11;
                            }
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i11 = 524288;
                        i3 |= i11;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(dialogProperties) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "56@2765L5,57@2882L8");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i8 = i7 & (-57345);
                                shape2 = DatePickerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                i8 = i7;
                            }
                            if (i5 != 0) {
                                f2 = DatePickerDefaults.INSTANCE.m2887getTonalElevationD9Ej5fM();
                            }
                            if ((i2 & 64) != 0) {
                                datePickerColors2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i9 = i8 & (-3670017);
                            } else {
                                i9 = i8;
                            }
                            if (i6 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                                function25 = function23;
                                f4 = f2;
                                i10 = i9;
                                modifier4 = modifier2;
                                final Shape shape4 = shape2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(219718641, i10, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:75)");
                                }
                                AlertDialogKt.BasicAlertDialog(function0, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DatePickerDialog_GmEhDVc$lambda$0;
                                        DatePickerDialog_GmEhDVc$lambda$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0(Shape.this, datePickerColors2, f4, function3, function2, function25, (Composer) obj, ((Integer) obj2).intValue());
                                        return DatePickerDialog_GmEhDVc$lambda$0;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i10 & 14) | 3072 | ((i10 >> 15) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                dialogProperties2 = dialogProperties3;
                                f3 = f4;
                                function24 = function25;
                                modifier3 = modifier4;
                                composer2 = startRestartGroup;
                                shape3 = shape4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i9 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                        }
                        dialogProperties3 = dialogProperties;
                        i10 = i9;
                        modifier4 = modifier2;
                        function25 = function23;
                        f4 = f2;
                        final Shape shape42 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        AlertDialogKt.BasicAlertDialog(function0, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DatePickerDialog_GmEhDVc$lambda$0;
                                DatePickerDialog_GmEhDVc$lambda$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0(Shape.this, datePickerColors2, f4, function3, function2, function25, (Composer) obj, ((Integer) obj2).intValue());
                                return DatePickerDialog_GmEhDVc$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i10 & 14) | 3072 | ((i10 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        dialogProperties2 = dialogProperties3;
                        f3 = f4;
                        function24 = function25;
                        modifier3 = modifier4;
                        composer2 = startRestartGroup;
                        shape3 = shape42;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        function24 = function23;
                        shape3 = shape2;
                        f3 = f2;
                        dialogProperties2 = dialogProperties;
                    }
                    final DatePickerColors datePickerColors3 = datePickerColors2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DatePickerDialog_GmEhDVc$lambda$1;
                                DatePickerDialog_GmEhDVc$lambda$1 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$1(Function0.this, function2, modifier3, function24, shape3, f3, datePickerColors3, dialogProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DatePickerDialog_GmEhDVc$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                }
                final DatePickerColors datePickerColors32 = datePickerColors2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
            }
            final DatePickerColors datePickerColors322 = datePickerColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function22;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
        }
        final DatePickerColors datePickerColors3222 = datePickerColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$0(Shape shape, DatePickerColors datePickerColors, float f, final Function3 function3, final Function2 function2, final Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C88@4109L1706,81@3799L2016:DatePickerDialog.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1108953335, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:81)");
            }
            SurfaceKt.m4112SurfaceT9BRK9s(SizeKt.m1259heightInVpY3zN4$default(SizeKt.m1268requiredWidth3ABfNKs(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m5130getContainerWidthD9Ej5fM()), 0.0f, DatePickerModalTokens.INSTANCE.m5129getContainerHeightD9Ej5fM(), 1, null), shape, datePickerColors.getContainerColor(), 0L, f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1782015378, true, new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePickerDialog_GmEhDVc$lambda$0$0;
                    DatePickerDialog_GmEhDVc$lambda$0$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0$0(Function3.this, function2, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePickerDialog_GmEhDVc$lambda$0$0;
                }
            }, composer, 54), composer, 12582918, LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$0$0(Function3 function3, final Function2 function2, final Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C89@4123L1682:DatePickerDialog.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1782015378, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:89)");
            }
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1407361339, "C95@4573L64,97@4681L1110:DatePickerDialog.android.kt#uh7d8r");
            Modifier weight = columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight);
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
            ComposerKt.sourceInformationMarkerStart(composer, -114868488, "C95@4626L9:DatePickerDialog.android.kt#uh7d8r");
            function3.invoke(columnScopeInstance, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier padding = PaddingKt.padding(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), DialogButtonsPadding);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, padding);
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
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 775974658, "C99@4882L5,100@4958L5,101@4987L786,98@4779L994:DatePickerDialog.android.kt#uh7d8r");
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6), TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer, 6), ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0;
                    DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0(Function2.this, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0;
                }
            }, composer, 54), composer, 384);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0(final Function2 function2, final Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C103@5106L7,112@5628L123,105@5217L534:DatePickerDialog.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1103927529, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:102)");
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
            float f = DialogButtonsMainAxisSpacing;
            float f2 = DialogButtonsCrossAxisSpacing;
            AlertDialogKt.m2467AlertDialogFlowRowixp7dh8(f, ((Dp) RangesKt.coerceIn(Dp.m9730boximpl(Dp.m9732constructorimpl(f2 - m9732constructorimpl)), Dp.m9730boximpl(Dp.m9732constructorimpl(0)), Dp.m9730boximpl(f2))).m9746unboximpl(), ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0$1;
                    DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0$1 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0$1(Function2.this, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0$1;
                }
            }, composer, 54), composer, 390);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$0$0$0$1$0$1(Function2 function2, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C113@5658L15:DatePickerDialog.android.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980163584, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:113)");
            }
            function2.invoke(composer, 0);
            if (function22 == null) {
                composer.startReplaceGroup(322568153);
            } else {
                composer.startReplaceGroup(-266689240);
                ComposerKt.sourceInformation(composer, "114@5717L8");
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

    static {
        float f = 8;
        DialogButtonsPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m9732constructorimpl(6), Dp.m9732constructorimpl(f), 3, null);
        DialogButtonsMainAxisSpacing = Dp.m9732constructorimpl(f);
        DialogButtonsCrossAxisSpacing = Dp.m9732constructorimpl(f);
    }
}
