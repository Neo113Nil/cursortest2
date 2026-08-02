package com.squareup.cash.earnings.views.streamdetail;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsStreamDetailKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarningsStreamDetailViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarningsStreamDetailKt$$ExternalSyntheticLambda0(EarningsStreamDetailViewModel earningsStreamDetailViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = earningsStreamDetailViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        final Function1 function1 = this.f$1;
        final EarningsStreamDetailViewModel earningsStreamDetailViewModel = this.f$0;
        final byte b = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1432879576, new EarningsStreamDetailKt$$ExternalSyntheticLambda0(earningsStreamDetailViewModel, function1, i2, b), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape)), null, null, Expect_jvmKt.rememberComposableLambda(1237758976, new Function3() { // from class: com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = b;
                            Function1 function12 = function1;
                            EarningsStreamDetailViewModel earningsStreamDetailViewModel2 = earningsStreamDetailViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((ColumnScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String streamName = earningsStreamDetailViewModel2.getStreamName();
                                        NavigationType navigationType = NavigationType.BACK;
                                        boolean changed = gapComposer3.changed(function12);
                                        Object rememberedValue = gapComposer3.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(13, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue);
                                        }
                                        DBUtil.TitleBarSub(streamName, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer3, 48, 108);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    ((ScrollingScaffoldContentScope) obj3).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        EarningsStreamDetailKt.Content(earningsStreamDetailViewModel2, function12, gapComposer4, 0);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), null, Expect_jvmKt.rememberComposableLambda(248351338, new Function3() { // from class: com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = i2;
                            Function1 function12 = function1;
                            EarningsStreamDetailViewModel earningsStreamDetailViewModel2 = earningsStreamDetailViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((ColumnScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String streamName = earningsStreamDetailViewModel2.getStreamName();
                                        NavigationType navigationType = NavigationType.BACK;
                                        boolean changed = gapComposer3.changed(function12);
                                        Object rememberedValue = gapComposer3.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(13, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue);
                                        }
                                        DBUtil.TitleBarSub(streamName, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer3, 48, 108);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    ((ScrollingScaffoldContentScope) obj3).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        EarningsStreamDetailKt.Content(earningsStreamDetailViewModel2, function12, gapComposer4, 0);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 199680, 22);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                EarningsStreamDetailKt.Content(earningsStreamDetailViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarningsStreamDetailKt$$ExternalSyntheticLambda0(EarningsStreamDetailViewModel earningsStreamDetailViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = earningsStreamDetailViewModel;
        this.f$1 = function1;
    }
}
