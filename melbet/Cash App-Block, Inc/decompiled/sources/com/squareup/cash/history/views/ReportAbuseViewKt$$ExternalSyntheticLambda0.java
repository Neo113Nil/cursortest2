package com.squareup.cash.history.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ReportAbuseViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReportAbuseViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ReportAbuseViewKt$$ExternalSyntheticLambda0(ReportAbuseViewModel reportAbuseViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = reportAbuseViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        final int i2 = 3;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final int i3 = 2;
        final int i4 = 1;
        final ReportAbuseViewModel reportAbuseViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z = !reportAbuseViewModel.actionInProgress;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ErrorView$$ExternalSyntheticLambda4(24, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final int i5 = r7 ? 1 : 0;
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, z, null, Expect_jvmKt.rememberComposableLambda(-1684266255, new Function3() { // from class: com.squareup.cash.history.views.ReportAbuseViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            long j;
                            int i6 = i5;
                            ReportAbuseViewModel reportAbuseViewModel2 = reportAbuseViewModel;
                            switch (i6) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str = reportAbuseViewModel2.actionButtonText;
                                        int ordinal = reportAbuseViewModel2.action.ordinal();
                                        if (ordinal == 0) {
                                            gapComposer3.startReplaceGroup(-1960172685);
                                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            j = colors.semantic.text.danger;
                                            gapComposer3.end(false);
                                        } else {
                                            if (ordinal != 1) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1960175978, false);
                                            }
                                            gapComposer3.startReplaceGroup(-1960169579);
                                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            j = colors2.semantic.text.standard;
                                            gapComposer3.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 2:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    Composer composer5 = (Composer) obj5;
                                    int intValue5 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer6 = (Composer) obj5;
                                    int intValue6 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer), gapComposer, 1572912, 44);
                    int ordinal = reportAbuseViewModel.action.ordinal();
                    if (ordinal == 0) {
                        gapComposer.startReplaceGroup(-714060852);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ErrorView$$ExternalSyntheticLambda4(25, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, true, z, null, Expect_jvmKt.rememberComposableLambda(-1589673479, new Function3() { // from class: com.squareup.cash.history.views.ReportAbuseViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long j;
                                int i6 = i2;
                                ReportAbuseViewModel reportAbuseViewModel2 = reportAbuseViewModel;
                                switch (i6) {
                                    case 0:
                                        Composer composer2 = (Composer) obj5;
                                        int intValue2 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        Composer composer3 = (Composer) obj5;
                                        int intValue3 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            String str = reportAbuseViewModel2.actionButtonText;
                                            int ordinal2 = reportAbuseViewModel2.action.ordinal();
                                            if (ordinal2 == 0) {
                                                gapComposer3.startReplaceGroup(-1960172685);
                                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors.semantic.text.danger;
                                                gapComposer3.end(false);
                                            } else {
                                                if (ordinal2 != 1) {
                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1960175978, false);
                                                }
                                                gapComposer3.startReplaceGroup(-1960169579);
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors2.semantic.text.standard;
                                                gapComposer3.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        Composer composer4 = (Composer) obj5;
                                        int intValue4 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 3:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer), gapComposer, 1576368, 32);
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -992866810, false);
                        }
                        gapComposer.startReplaceGroup(-713733492);
                        ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed3 = gapComposer.changed(function1);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new ErrorView$$ExternalSyntheticLambda4(26, function1);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth3, buttonProminence2, false, z, null, Expect_jvmKt.rememberComposableLambda(-1182009488, new Function3() { // from class: com.squareup.cash.history.views.ReportAbuseViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long j;
                                int i6 = r2;
                                ReportAbuseViewModel reportAbuseViewModel2 = reportAbuseViewModel;
                                switch (i6) {
                                    case 0:
                                        Composer composer2 = (Composer) obj5;
                                        int intValue2 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        Composer composer3 = (Composer) obj5;
                                        int intValue3 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            String str = reportAbuseViewModel2.actionButtonText;
                                            int ordinal2 = reportAbuseViewModel2.action.ordinal();
                                            if (ordinal2 == 0) {
                                                gapComposer3.startReplaceGroup(-1960172685);
                                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors.semantic.text.danger;
                                                gapComposer3.end(false);
                                            } else {
                                                if (ordinal2 != 1) {
                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1960175978, false);
                                                }
                                                gapComposer3.startReplaceGroup(-1960169579);
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors2.semantic.text.standard;
                                                gapComposer3.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        Composer composer4 = (Composer) obj5;
                                        int intValue4 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 3:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        ((RowScope) obj4).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer), gapComposer, 1573296, 40);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str = reportAbuseViewModel.title;
                if (str == null) {
                    str = "";
                }
                ModalKt.Modal((Modifier) null, str, reportAbuseViewModel.subtitle, Expect_jvmKt.rememberComposableLambda(-1050065736, new ReportAbuseViewKt$$ExternalSyntheticLambda0(function1, reportAbuseViewModel, i3), composer2), Expect_jvmKt.rememberComposableLambda(-391682857, new ReportAbuseViewKt$$ExternalSyntheticLambda0(function1, reportAbuseViewModel, i2), composer2), (Function3) null, composer2, 27648, 33);
                return Unit.INSTANCE;
            case 2:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed4 = gapComposer2.changed(function1);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ErrorView$$ExternalSyntheticLambda4(22, function1);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue4, null, !reportAbuseViewModel.actionInProgress, Expect_jvmKt.rememberComposableLambda(2076170253, new Function3() { // from class: com.squareup.cash.history.views.ReportAbuseViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            long j;
                            int i6 = i4;
                            ReportAbuseViewModel reportAbuseViewModel2 = reportAbuseViewModel;
                            switch (i6) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer32;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str2 = reportAbuseViewModel2.actionButtonText;
                                        int ordinal2 = reportAbuseViewModel2.action.ordinal();
                                        if (ordinal2 == 0) {
                                            gapComposer3.startReplaceGroup(-1960172685);
                                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            j = colors.semantic.text.danger;
                                            gapComposer3.end(false);
                                        } else {
                                            if (ordinal2 != 1) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1960175978, false);
                                            }
                                            gapComposer3.startReplaceGroup(-1960169579);
                                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            j = colors2.semantic.text.standard;
                                            gapComposer3.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 2:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    Composer composer5 = (Composer) obj5;
                                    int intValue5 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer6 = (Composer) obj5;
                                    int intValue6 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer4).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean changed5 = gapComposer3.changed(function1);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ErrorView$$ExternalSyntheticLambda4(23, function1);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue5, null, false, Expect_jvmKt.rememberComposableLambda(-985244870, new Function3() { // from class: com.squareup.cash.history.views.ReportAbuseViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            long j;
                            int i6 = i3;
                            ReportAbuseViewModel reportAbuseViewModel2 = reportAbuseViewModel;
                            switch (i6) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue32 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                        String str2 = reportAbuseViewModel2.actionButtonText;
                                        int ordinal2 = reportAbuseViewModel2.action.ordinal();
                                        if (ordinal2 == 0) {
                                            gapComposer32.startReplaceGroup(-1960172685);
                                            Colors colors = (Colors) gapComposer32.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer32, -1762997026, gapComposer32, false);
                                            } else {
                                                gapComposer32.startReplaceGroup(-1762997739);
                                                gapComposer32.end(false);
                                            }
                                            j = colors.semantic.text.danger;
                                            gapComposer32.end(false);
                                        } else {
                                            if (ordinal2 != 1) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer32, -1960175978, false);
                                            }
                                            gapComposer32.startReplaceGroup(-1960169579);
                                            Colors colors2 = (Colors) gapComposer32.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer32, -1762997026, gapComposer32, false);
                                            } else {
                                                gapComposer32.startReplaceGroup(-1762997739);
                                                gapComposer32.end(false);
                                            }
                                            j = colors2.semantic.text.standard;
                                            gapComposer32.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer32.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 2:
                                    Composer composer42 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer42;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.cancelButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    Composer composer5 = (Composer) obj5;
                                    int intValue5 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer6 = (Composer) obj5;
                                    int intValue6 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reportAbuseViewModel2.actionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ReportAbuseViewKt$$ExternalSyntheticLambda0(Function1 function1, ReportAbuseViewModel reportAbuseViewModel, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = reportAbuseViewModel;
    }
}
