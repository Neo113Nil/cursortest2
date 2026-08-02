package com.squareup.cash.cashapppay.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class StatusInterstitialScreen extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInterstitialScreen(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final StatusInterstitialViewModel statusInterstitialViewModel, final Function1 function1, Composer composer, final int i) {
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        long j;
        long j2;
        int i2;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1725972614);
        int i3 = i | (gapComposer2.changedInstance(statusInterstitialViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (!gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (statusInterstitialViewModel == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    function2 = new Function2(this, statusInterstitialViewModel, function1, i, i4) { // from class: com.squareup.cash.cashapppay.views.StatusInterstitialScreen$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ StatusInterstitialScreen f$0;
                        public final /* synthetic */ StatusInterstitialViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            StatusInterstitialViewModel statusInterstitialViewModel2 = this.f$1;
                            StatusInterstitialScreen statusInterstitialScreen = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = StatusInterstitialScreen.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    statusInterstitialScreen.Content(statusInterstitialViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    statusInterstitialScreen.Content(statusInterstitialViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            int i5 = iArr[statusIcon.ordinal()];
            if (i5 == 1) {
                gapComposer2.startReplaceGroup(802314219);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.background.brand;
                gapComposer2.end(false);
            } else {
                if (i5 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 802311719, false);
                }
                gapComposer2.startReplaceGroup(802316074);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.icon.info;
                gapComposer2.end(false);
            }
            int i6 = iArr[statusIcon.ordinal()];
            if (i6 == 1) {
                gapComposer2.startReplaceGroup(802321069);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors3.semantic.icon.inverse;
                gapComposer2.end(false);
            } else {
                if (i6 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 802318796, false);
                }
                gapComposer2.startReplaceGroup(802323725);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors4.semantic.icon.inverse;
                gapComposer2.end(false);
            }
            int i7 = iArr[statusIcon.ordinal()];
            if (i7 == 1) {
                i2 = R.drawable.ic_checkmark;
            } else {
                if (i7 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.drawable.ic_ellipsis;
            }
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1074083601, new StatusInterstitialScreen$$ExternalSyntheticLambda1(statusInterstitialViewModel, i2, j2, j, function1, 0), gapComposer2), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i8 = 1;
            function2 = new Function2(this, statusInterstitialViewModel, function1, i, i8) { // from class: com.squareup.cash.cashapppay.views.StatusInterstitialScreen$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ StatusInterstitialScreen f$0;
                public final /* synthetic */ StatusInterstitialViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i8;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    StatusInterstitialViewModel statusInterstitialViewModel2 = this.f$1;
                    StatusInterstitialScreen statusInterstitialScreen = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = StatusInterstitialScreen.$r8$clinit;
                    switch (i52) {
                        case 0:
                            statusInterstitialScreen.Content(statusInterstitialViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            statusInterstitialScreen.Content(statusInterstitialViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((StatusInterstitialViewModel) obj, function1, gapComposer, 0);
    }
}
