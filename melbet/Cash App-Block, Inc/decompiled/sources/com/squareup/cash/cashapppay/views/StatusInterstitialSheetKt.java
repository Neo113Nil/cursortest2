package com.squareup.cash.cashapppay.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.R;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class StatusInterstitialSheetKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusInterstitialBlocker.StatusIcon.values().length];
            try {
                iArr[StatusInterstitialBlocker.StatusIcon.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusInterstitialBlocker.StatusIcon.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void StatusInterstitialSheetContent(final StatusInterstitialViewModel statusInterstitialViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        long j;
        long Color;
        int i3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1760651144);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(statusInterstitialViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (statusInterstitialViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.cashapppay.views.StatusInterstitialSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    StatusInterstitialSheetKt.StatusInterstitialSheetContent(statusInterstitialViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    StatusInterstitialSheetKt.StatusInterstitialSheetContent(statusInterstitialViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            StatusInterstitialBlocker.StatusIcon statusIcon = statusInterstitialViewModel.statusIcon;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i6 = iArr[statusIcon.ordinal()];
            if (i6 == 1) {
                gapComposer.startReplaceGroup(231373373);
                j = MooncakeTheme.getColors(gapComposer).green;
                gapComposer.end(false);
            } else {
                if (i6 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 231371438, false);
                }
                gapComposer.startReplaceGroup(231374780);
                j = MooncakeTheme.getColors(gapComposer).icon;
                gapComposer.end(false);
            }
            int i7 = iArr[statusIcon.ordinal()];
            if (i7 == 1) {
                gapComposer.startReplaceGroup(231377235);
                gapComposer.end(false);
                Color = ColorKt.Color(-1);
            } else {
                if (i7 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 231375962, false);
                }
                gapComposer.startReplaceGroup(231379335);
                Color = MooncakeTheme.getColors(gapComposer).placeholderIcon;
                gapComposer.end(false);
            }
            int i8 = iArr[statusIcon.ordinal()];
            if (i8 == 1) {
                i3 = R.drawable.ic_checkmark;
            } else {
                if (i8 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.drawable.ic_ellipsis;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1258316595, new StatusInterstitialScreen$$ExternalSyntheticLambda1(statusInterstitialViewModel, i3, Color, j, function1, 1), gapComposer), gapComposer, 6);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: com.squareup.cash.cashapppay.views.StatusInterstitialSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            StatusInterstitialSheetKt.StatusInterstitialSheetContent(statusInterstitialViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            StatusInterstitialSheetKt.StatusInterstitialSheetContent(statusInterstitialViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }
}
