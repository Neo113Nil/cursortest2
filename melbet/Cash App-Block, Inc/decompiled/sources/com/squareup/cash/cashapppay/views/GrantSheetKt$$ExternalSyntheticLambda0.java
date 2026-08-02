package com.squareup.cash.cashapppay.views;

import android.content.Context;
import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealImageLoader f$0;
    public final /* synthetic */ GrantViewModel f$1;
    public final /* synthetic */ MoneyFormatter f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, GrantViewModel grantViewModel, MoneyFormatter moneyFormatter, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = realImageLoader;
        this.f$1 = grantViewModel;
        this.f$2 = moneyFormatter;
        this.f$3 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        final Function1 function1 = this.f$3;
        final MoneyFormatter moneyFormatter = this.f$2;
        final GrantViewModel grantViewModel = this.f$1;
        RealImageLoader realImageLoader = this.f$0;
        Object[] objArr = 0;
        final int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ProvidedValue defaultProvidedValue$runtime = LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(-1420817569, new Function2() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Modifier wrapContentHeight;
                            Modifier wrapContentHeight2;
                            int i3 = objArr2;
                            GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            final Function1 function12 = function1;
                            final MoneyFormatter moneyFormatter2 = moneyFormatter;
                            final int i4 = 0;
                            final int i5 = 1;
                            switch (i3) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        GrantViewModel grantViewModel2 = grantViewModel;
                                        if (Intrinsics.areEqual(grantViewModel2, inTransactionTopUpInfo)) {
                                            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer2, -673429037, false, "Presenter should not emit InTransactionTopUpInfo in Arcade");
                                        }
                                        gapComposer2.startReplaceGroup(-673035585);
                                        wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                        CrossfadeKt.Crossfade(grantViewModel2, wrapContentHeight, (FiniteAnimationSpec) null, "GrantSheet Crossfade", Expect_jvmKt.rememberComposableLambda(2010122261, new Function3() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i6 = i4;
                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo2 = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                                                Function1 function13 = function12;
                                                MoneyFormatter moneyFormatter3 = moneyFormatter2;
                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                switch (i6) {
                                                    case 0:
                                                        GrantViewModel grantViewModel3 = (GrantViewModel) obj5;
                                                        Composer composer3 = (Composer) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        grantViewModel3.getClass();
                                                        if (grantViewModel3.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                                            gapComposer3.startReplaceGroup(-1007787495);
                                                            gapComposer3.end(false);
                                                        } else if (grantViewModel3 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                                            gapComposer4.startReplaceGroup(-1007785953);
                                                            GrantSheetKt.Main((GrantViewModel.Main) grantViewModel3, moneyFormatter3, function13, gapComposer4, intValue3 & 14);
                                                            gapComposer4.end(false);
                                                        } else if (grantViewModel3 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                                            gapComposer5.startReplaceGroup(-1176493742);
                                                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                                                            Context context = (Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str = ((GrantViewModel.OnDisplayInterstitial) grantViewModel3).statusText;
                                                            boolean changed = gapComposer5.changed(function13);
                                                            Object rememberedValue = gapComposer5.rememberedValue();
                                                            if (changed || rememberedValue == neverEqualPolicy) {
                                                                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(0, function13);
                                                                gapComposer5.updateRememberedValue(rememberedValue);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, str, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer5, 0, 376);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            if (!(grantViewModel3 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer3, -1007788329, false);
                                                            }
                                                            GapComposer gapComposer6 = (GapComposer) composer3;
                                                            gapComposer6.startReplaceGroup(-1175924706);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer6.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer6, 48, 0);
                                                            gapComposer6.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        GrantViewModel grantViewModel4 = (GrantViewModel) obj5;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                                        grantViewModel4.getClass();
                                                        if (grantViewModel4.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer7 = (GapComposer) composer4;
                                                            gapComposer7.startReplaceGroup(1926128133);
                                                            gapComposer7.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer8 = (GapComposer) composer4;
                                                            gapComposer8.startReplaceGroup(1926129739);
                                                            GrantScreenKt.Main((GrantViewModel.Main) grantViewModel4, moneyFormatter3, function13, gapComposer8, intValue4 & 14);
                                                            gapComposer8.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer9 = (GapComposer) composer4;
                                                            gapComposer9.startReplaceGroup(-419415453);
                                                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode = Long.hashCode(gapComposer9.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer9.currentCompositionLocalScope();
                                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer9, fillMaxSize);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer9.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer9.startReusableNode();
                                                            if (gapComposer9.inserting) {
                                                                gapComposer9.createNode(layoutNode$Companion$Constructor$1);
                                                            } else {
                                                                gapComposer9.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer9, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                                            Context context2 = (Context) gapComposer9.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str2 = ((GrantViewModel.OnDisplayInterstitial) grantViewModel4).statusText;
                                                            boolean changed2 = gapComposer9.changed(function13);
                                                            Object rememberedValue2 = gapComposer9.rememberedValue();
                                                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                                                rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(23, function13);
                                                                gapComposer9.updateRememberedValue(rememberedValue2);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context2, str2, 0, 0L, 0L, false, (Function0) rememberedValue2, false, gapComposer9, 6, 376);
                                                            gapComposer9.end(true);
                                                            gapComposer9.end(false);
                                                        } else {
                                                            if (!(grantViewModel4 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, 1926127385, false);
                                                            }
                                                            GapComposer gapComposer10 = (GapComposer) composer4;
                                                            gapComposer10.startReplaceGroup(-418748023);
                                                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode2 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer10.currentCompositionLocalScope();
                                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer10, fillMaxSize2);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer10.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer10.startReusableNode();
                                                            if (gapComposer10.inserting) {
                                                                gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer10.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer10, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer10, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion2, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer10, 54, 0);
                                                            gapComposer10.end(true);
                                                            gapComposer10.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, gapComposer2), gapComposer2, 27696, 4);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        GrantViewModel grantViewModel3 = grantViewModel;
                                        if (Intrinsics.areEqual(grantViewModel3, inTransactionTopUpInfo)) {
                                            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer3, -840349695, false, "Presenter should not emit InTransactionTopUpInfo in Arcade");
                                        }
                                        gapComposer3.startReplaceGroup(-839910735);
                                        wrapContentHeight2 = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                        CrossfadeKt.Crossfade(grantViewModel3, wrapContentHeight2, (FiniteAnimationSpec) null, "GrantSheet Crossfade", Expect_jvmKt.rememberComposableLambda(1061220993, new Function3() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i6 = i5;
                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo2 = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                                                Function1 function13 = function12;
                                                MoneyFormatter moneyFormatter3 = moneyFormatter2;
                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                switch (i6) {
                                                    case 0:
                                                        GrantViewModel grantViewModel32 = (GrantViewModel) obj5;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue32 = ((Integer) obj7).intValue();
                                                        grantViewModel32.getClass();
                                                        if (grantViewModel32.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                                            gapComposer32.startReplaceGroup(-1007787495);
                                                            gapComposer32.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer4 = (GapComposer) composer32;
                                                            gapComposer4.startReplaceGroup(-1007785953);
                                                            GrantSheetKt.Main((GrantViewModel.Main) grantViewModel32, moneyFormatter3, function13, gapComposer4, intValue32 & 14);
                                                            gapComposer4.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer5 = (GapComposer) composer32;
                                                            gapComposer5.startReplaceGroup(-1176493742);
                                                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                                                            Context context = (Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str = ((GrantViewModel.OnDisplayInterstitial) grantViewModel32).statusText;
                                                            boolean changed = gapComposer5.changed(function13);
                                                            Object rememberedValue = gapComposer5.rememberedValue();
                                                            if (changed || rememberedValue == neverEqualPolicy) {
                                                                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(0, function13);
                                                                gapComposer5.updateRememberedValue(rememberedValue);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, str, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer5, 0, 376);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            if (!(grantViewModel32 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer32, -1007788329, false);
                                                            }
                                                            GapComposer gapComposer6 = (GapComposer) composer32;
                                                            gapComposer6.startReplaceGroup(-1175924706);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer6.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer6, 48, 0);
                                                            gapComposer6.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        GrantViewModel grantViewModel4 = (GrantViewModel) obj5;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                                        grantViewModel4.getClass();
                                                        if (grantViewModel4.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer7 = (GapComposer) composer4;
                                                            gapComposer7.startReplaceGroup(1926128133);
                                                            gapComposer7.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer8 = (GapComposer) composer4;
                                                            gapComposer8.startReplaceGroup(1926129739);
                                                            GrantScreenKt.Main((GrantViewModel.Main) grantViewModel4, moneyFormatter3, function13, gapComposer8, intValue4 & 14);
                                                            gapComposer8.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer9 = (GapComposer) composer4;
                                                            gapComposer9.startReplaceGroup(-419415453);
                                                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, fillMaxSize2);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer9.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer9.startReusableNode();
                                                            if (gapComposer9.inserting) {
                                                                gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer9.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer9, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                                            Context context2 = (Context) gapComposer9.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str2 = ((GrantViewModel.OnDisplayInterstitial) grantViewModel4).statusText;
                                                            boolean changed2 = gapComposer9.changed(function13);
                                                            Object rememberedValue2 = gapComposer9.rememberedValue();
                                                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                                                rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(23, function13);
                                                                gapComposer9.updateRememberedValue(rememberedValue2);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context2, str2, 0, 0L, 0L, false, (Function0) rememberedValue2, false, gapComposer9, 6, 376);
                                                            gapComposer9.end(true);
                                                            gapComposer9.end(false);
                                                        } else {
                                                            if (!(grantViewModel4 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, 1926127385, false);
                                                            }
                                                            GapComposer gapComposer10 = (GapComposer) composer4;
                                                            gapComposer10.startReplaceGroup(-418748023);
                                                            Modifier fillMaxSize22 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode22 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer10.currentCompositionLocalScope();
                                                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer10, fillMaxSize22);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer10.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer10.startReusableNode();
                                                            if (gapComposer10.inserting) {
                                                                gapComposer10.createNode(layoutNode$Companion$Constructor$122);
                                                            } else {
                                                                gapComposer10.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy22, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer10, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer10, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion2, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer10, 54, 0);
                                                            gapComposer10.end(true);
                                                            gapComposer10.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, gapComposer3), gapComposer3, 27696, 4);
                                        gapComposer3.end(false);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1869778629, new Function2() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Modifier wrapContentHeight;
                            Modifier wrapContentHeight2;
                            int i3 = i2;
                            GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            final Function1 function12 = function1;
                            final MoneyFormatter moneyFormatter2 = moneyFormatter;
                            final int i4 = 0;
                            final int i5 = 1;
                            switch (i3) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer22 = (GapComposer) composer2;
                                    if (gapComposer22.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        GrantViewModel grantViewModel2 = grantViewModel;
                                        if (Intrinsics.areEqual(grantViewModel2, inTransactionTopUpInfo)) {
                                            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer22, -673429037, false, "Presenter should not emit InTransactionTopUpInfo in Arcade");
                                        }
                                        gapComposer22.startReplaceGroup(-673035585);
                                        wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                        CrossfadeKt.Crossfade(grantViewModel2, wrapContentHeight, (FiniteAnimationSpec) null, "GrantSheet Crossfade", Expect_jvmKt.rememberComposableLambda(2010122261, new Function3() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i6 = i4;
                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo2 = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                                                Function1 function13 = function12;
                                                MoneyFormatter moneyFormatter3 = moneyFormatter2;
                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                switch (i6) {
                                                    case 0:
                                                        GrantViewModel grantViewModel32 = (GrantViewModel) obj5;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue32 = ((Integer) obj7).intValue();
                                                        grantViewModel32.getClass();
                                                        if (grantViewModel32.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                                            gapComposer32.startReplaceGroup(-1007787495);
                                                            gapComposer32.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer4 = (GapComposer) composer32;
                                                            gapComposer4.startReplaceGroup(-1007785953);
                                                            GrantSheetKt.Main((GrantViewModel.Main) grantViewModel32, moneyFormatter3, function13, gapComposer4, intValue32 & 14);
                                                            gapComposer4.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer5 = (GapComposer) composer32;
                                                            gapComposer5.startReplaceGroup(-1176493742);
                                                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                                                            Context context = (Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str = ((GrantViewModel.OnDisplayInterstitial) grantViewModel32).statusText;
                                                            boolean changed = gapComposer5.changed(function13);
                                                            Object rememberedValue = gapComposer5.rememberedValue();
                                                            if (changed || rememberedValue == neverEqualPolicy) {
                                                                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(0, function13);
                                                                gapComposer5.updateRememberedValue(rememberedValue);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, str, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer5, 0, 376);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            if (!(grantViewModel32 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer32, -1007788329, false);
                                                            }
                                                            GapComposer gapComposer6 = (GapComposer) composer32;
                                                            gapComposer6.startReplaceGroup(-1175924706);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer6.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer6, 48, 0);
                                                            gapComposer6.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        GrantViewModel grantViewModel4 = (GrantViewModel) obj5;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                                        grantViewModel4.getClass();
                                                        if (grantViewModel4.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer7 = (GapComposer) composer4;
                                                            gapComposer7.startReplaceGroup(1926128133);
                                                            gapComposer7.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer8 = (GapComposer) composer4;
                                                            gapComposer8.startReplaceGroup(1926129739);
                                                            GrantScreenKt.Main((GrantViewModel.Main) grantViewModel4, moneyFormatter3, function13, gapComposer8, intValue4 & 14);
                                                            gapComposer8.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer9 = (GapComposer) composer4;
                                                            gapComposer9.startReplaceGroup(-419415453);
                                                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, fillMaxSize2);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer9.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer9.startReusableNode();
                                                            if (gapComposer9.inserting) {
                                                                gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer9.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer9, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                                            Context context2 = (Context) gapComposer9.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str2 = ((GrantViewModel.OnDisplayInterstitial) grantViewModel4).statusText;
                                                            boolean changed2 = gapComposer9.changed(function13);
                                                            Object rememberedValue2 = gapComposer9.rememberedValue();
                                                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                                                rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(23, function13);
                                                                gapComposer9.updateRememberedValue(rememberedValue2);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context2, str2, 0, 0L, 0L, false, (Function0) rememberedValue2, false, gapComposer9, 6, 376);
                                                            gapComposer9.end(true);
                                                            gapComposer9.end(false);
                                                        } else {
                                                            if (!(grantViewModel4 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, 1926127385, false);
                                                            }
                                                            GapComposer gapComposer10 = (GapComposer) composer4;
                                                            gapComposer10.startReplaceGroup(-418748023);
                                                            Modifier fillMaxSize22 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode22 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer10.currentCompositionLocalScope();
                                                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer10, fillMaxSize22);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer10.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer10.startReusableNode();
                                                            if (gapComposer10.inserting) {
                                                                gapComposer10.createNode(layoutNode$Companion$Constructor$122);
                                                            } else {
                                                                gapComposer10.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy22, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer10, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer10, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion2, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer10, 54, 0);
                                                            gapComposer10.end(true);
                                                            gapComposer10.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, gapComposer22), gapComposer22, 27696, 4);
                                        gapComposer22.end(false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        GrantViewModel grantViewModel3 = grantViewModel;
                                        if (Intrinsics.areEqual(grantViewModel3, inTransactionTopUpInfo)) {
                                            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer3, -840349695, false, "Presenter should not emit InTransactionTopUpInfo in Arcade");
                                        }
                                        gapComposer3.startReplaceGroup(-839910735);
                                        wrapContentHeight2 = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                        CrossfadeKt.Crossfade(grantViewModel3, wrapContentHeight2, (FiniteAnimationSpec) null, "GrantSheet Crossfade", Expect_jvmKt.rememberComposableLambda(1061220993, new Function3() { // from class: com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i6 = i5;
                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                GrantViewModel.InTransactionTopUpInfo inTransactionTopUpInfo2 = GrantViewModel.InTransactionTopUpInfo.INSTANCE;
                                                Function1 function13 = function12;
                                                MoneyFormatter moneyFormatter3 = moneyFormatter2;
                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                switch (i6) {
                                                    case 0:
                                                        GrantViewModel grantViewModel32 = (GrantViewModel) obj5;
                                                        Composer composer32 = (Composer) obj6;
                                                        int intValue32 = ((Integer) obj7).intValue();
                                                        grantViewModel32.getClass();
                                                        if (grantViewModel32.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                                            gapComposer32.startReplaceGroup(-1007787495);
                                                            gapComposer32.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer4 = (GapComposer) composer32;
                                                            gapComposer4.startReplaceGroup(-1007785953);
                                                            GrantSheetKt.Main((GrantViewModel.Main) grantViewModel32, moneyFormatter3, function13, gapComposer4, intValue32 & 14);
                                                            gapComposer4.end(false);
                                                        } else if (grantViewModel32 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer5 = (GapComposer) composer32;
                                                            gapComposer5.startReplaceGroup(-1176493742);
                                                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                                                            Context context = (Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str = ((GrantViewModel.OnDisplayInterstitial) grantViewModel32).statusText;
                                                            boolean changed = gapComposer5.changed(function13);
                                                            Object rememberedValue = gapComposer5.rememberedValue();
                                                            if (changed || rememberedValue == neverEqualPolicy) {
                                                                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(0, function13);
                                                                gapComposer5.updateRememberedValue(rememberedValue);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, str, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer5, 0, 376);
                                                            gapComposer5.end(false);
                                                        } else {
                                                            if (!(grantViewModel32 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer32, -1007788329, false);
                                                            }
                                                            GapComposer gapComposer6 = (GapComposer) composer32;
                                                            gapComposer6.startReplaceGroup(-1175924706);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion2, ((Configuration) gapComposer6.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer6, 48, 0);
                                                            gapComposer6.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        GrantViewModel grantViewModel4 = (GrantViewModel) obj5;
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                                        grantViewModel4.getClass();
                                                        if (grantViewModel4.equals(inTransactionTopUpInfo2)) {
                                                            GapComposer gapComposer7 = (GapComposer) composer4;
                                                            gapComposer7.startReplaceGroup(1926128133);
                                                            gapComposer7.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.Main) {
                                                            GapComposer gapComposer8 = (GapComposer) composer4;
                                                            gapComposer8.startReplaceGroup(1926129739);
                                                            GrantScreenKt.Main((GrantViewModel.Main) grantViewModel4, moneyFormatter3, function13, gapComposer8, intValue4 & 14);
                                                            gapComposer8.end(false);
                                                        } else if (grantViewModel4 instanceof GrantViewModel.OnDisplayInterstitial) {
                                                            GapComposer gapComposer9 = (GapComposer) composer4;
                                                            gapComposer9.startReplaceGroup(-419415453);
                                                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, fillMaxSize2);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer9.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer9.startReusableNode();
                                                            if (gapComposer9.inserting) {
                                                                gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer9.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer9, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                                            Context context2 = (Context) gapComposer9.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                                            String str2 = ((GrantViewModel.OnDisplayInterstitial) grantViewModel4).statusText;
                                                            boolean changed2 = gapComposer9.changed(function13);
                                                            Object rememberedValue2 = gapComposer9.rememberedValue();
                                                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                                                rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(23, function13);
                                                                gapComposer9.updateRememberedValue(rememberedValue2);
                                                            }
                                                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context2, str2, 0, 0L, 0L, false, (Function0) rememberedValue2, false, gapComposer9, 6, 376);
                                                            gapComposer9.end(true);
                                                            gapComposer9.end(false);
                                                        } else {
                                                            if (!(grantViewModel4 instanceof GrantViewModel.SubmissionInFlight)) {
                                                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, 1926127385, false);
                                                            }
                                                            GapComposer gapComposer10 = (GapComposer) composer4;
                                                            gapComposer10.startReplaceGroup(-418748023);
                                                            Modifier fillMaxSize22 = SizeKt.fillMaxSize(companion2, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                                            int hashCode22 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer10.currentCompositionLocalScope();
                                                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer10, fillMaxSize22);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer10.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer10.startReusableNode();
                                                            if (gapComposer10.inserting) {
                                                                gapComposer10.createNode(layoutNode$Companion$Constructor$122);
                                                            } else {
                                                                gapComposer10.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy22, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer10, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer10, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                                            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion2, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer10, 54, 0);
                                                            gapComposer10.end(true);
                                                            gapComposer10.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, gapComposer3), gapComposer3, 27696, 4);
                                        gapComposer3.end(false);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
