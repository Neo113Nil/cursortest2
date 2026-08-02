package com.squareup.cash.moneybot.views.home;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt;
import com.squareup.protos.franklin.api.FormBlocker;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotHomeViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda3(Transition transition, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, int i) {
        this.f$2 = transition;
        this.f$1 = z;
        this.f$5 = z2;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$6 = function03;
        this.f$7 = function04;
        this.f$8 = function05;
        this.f$9 = function06;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ToolbarConfig toolbarConfig;
        GapComposer gapComposer;
        Function0 function0;
        Function1 function1;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z = this.f$1;
        final int i2 = 0;
        Object obj3 = this.f$9;
        Object obj4 = this.f$8;
        Object obj5 = this.f$7;
        Object obj6 = this.f$6;
        Object obj7 = this.f$4;
        Object obj8 = this.f$3;
        Object obj9 = this.f$2;
        final int i3 = 2;
        final int i4 = 1;
        switch (i) {
            case 0:
                MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj9;
                ParticleGridRenderer particleGridRenderer = (ParticleGridRenderer) obj8;
                LazyListState lazyListState = (LazyListState) obj7;
                Density density = (Density) obj6;
                Animatable animatable = (Animatable) obj5;
                Set set = (Set) obj4;
                State state = (State) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Function1 function12 = this.f$0;
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(function12, gapComposer2);
                    if (z) {
                        gapComposer2.startReplaceGroup(-1276082417);
                        boolean changed = gapComposer2.changed(moneybotHomeViewModel.getTabToolbarViewModel());
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ToolbarConfig(null, null, null, moneybotHomeViewModel.getTabToolbarViewModel(), null, new MoneyTabUIKt$$ExternalSyntheticLambda9(14, rememberUpdatedState), false, false, null, new ToolbarConfig.MoneybotSharedElementKeys(), 407);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        gapComposer2.end(false);
                        toolbarConfig = (ToolbarConfig) rememberedValue;
                    } else {
                        gapComposer2.startReplaceGroup(-1275525006);
                        gapComposer2.end(false);
                        toolbarConfig = null;
                    }
                    if (z) {
                        gapComposer2.startReplaceGroup(-1275468183);
                        ChromeConfigKt.ChromeConfig(null, null, null, null, null, toolbarConfig, null, gapComposer2, PKIFailureInfo.transactionIdInUse, 95);
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer2;
                        gapComposer.startReplaceGroup(-1275403796);
                        gapComposer.end(false);
                    }
                    gapComposer.startReplaceGroup(-41136975);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
                    if (moneybotColors == null) {
                        gapComposer.startReplaceGroup(-973090538);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        moneybotColors = MoneybotColorsKt.fromArcade(colors);
                    } else {
                        gapComposer.startReplaceGroup(-973091964);
                    }
                    gapComposer.end(false);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, moneybotColors.canvas.background, ColorKt.RectangleShape);
                    if (particleGridRenderer != null) {
                        boolean changedInstance = gapComposer.changedInstance(particleGridRenderer);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SliderKt$sliderTapModifier$1(particleGridRenderer, 6);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        m177backgroundbw27NRU = m177backgroundbw27NRU.then(SuspendingPointerInputFilterKt.pointerInput(companion, particleGridRenderer, (PointerInputEventHandler) rememberedValue2));
                    }
                    Modifier modifier = m177backgroundbw27NRU;
                    gapComposer.end(false);
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-699428470, new TabContentViewKt$$ExternalSyntheticLambda26(z, moneybotHomeViewModel, function12, 24), gapComposer);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1723677097, new NfcNotAvailableKt$$ExternalSyntheticLambda0(19, function12), gapComposer);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(864346118, new MoneyTabUIKt$$ExternalSyntheticLambda11(6, particleGridRenderer, state), gapComposer);
                    boolean changedInstance2 = gapComposer.changedInstance(moneybotHomeViewModel) | gapComposer.changed(function12);
                    boolean z2 = this.f$5;
                    boolean changed2 = changedInstance2 | gapComposer.changed(z2) | gapComposer.changed(density) | gapComposer.changedInstance(animatable) | gapComposer.changedInstance(set);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda0 = new SessionQueries$$ExternalSyntheticLambda0(5, moneybotHomeViewModel, function12, density, animatable, set, z2);
                        gapComposer.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda0);
                        rememberedValue3 = sessionQueries$$ExternalSyntheticLambda0;
                    }
                    MoneybotHomeViewKt.MoneybotHomeScaffold(modifier, lazyListState, m297PaddingValuesa9UjIt4$default, rememberComposableLambda, rememberComposableLambda2, MoneybotHomeViewKt.f482lambda$148184632, rememberComposableLambda3, (Function1) rememberedValue3, gapComposer, 1797504);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Modifier modifier2 = (Modifier) obj9;
                final FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) obj8;
                Function0 function02 = (Function0) obj7;
                Modifier modifier3 = (Modifier) obj6;
                Icons icons = (Icons) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier2);
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
                    if (!z || (function1 = this.f$0) == null) {
                        gapComposer3.startReplaceGroup(-812897369);
                        gapComposer3.end(false);
                        function0 = function02;
                    } else {
                        gapComposer3.startReplaceGroup(-813013929);
                        boolean changedInstance3 = gapComposer3.changedInstance(merchantTransactionElement) | gapComposer3.changed(function1);
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new GLSceneScope$$ExternalSyntheticLambda4(17, merchantTransactionElement, function1);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        gapComposer3.end(false);
                        function0 = (Function0) rememberedValue4;
                    }
                    CellDefaultKt.m3388CellActivity6RhP_wg(Expect_jvmKt.rememberComposableLambda(-523749901, new PoolToastKt$$ExternalSyntheticLambda0(i3, (Serializable) merchantTransactionElement, (Object) icons, (Object) realImageLoader), gapComposer3), Expect_jvmKt.rememberComposableLambda(-1415342312, new Function2() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt$$ExternalSyntheticLambda4
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.String] */
                        /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.String] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj10, Object obj11) {
                            String str;
                            String str2;
                            int i5 = i2;
                            Color color = null;
                            FormBlocker.Element.MerchantTransactionElement merchantTransactionElement2 = merchantTransactionElement;
                            switch (i5) {
                                case 0:
                                    Composer composer3 = (Composer) obj10;
                                    int intValue3 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String str3 = merchantTransactionElement2.merchantName;
                                        str3.getClass();
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer4 = (Composer) obj10;
                                    int intValue4 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, Modifier.Companion.$$INSTANCE);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer5.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer5.startReusableNode();
                                        if (gapComposer5.inserting) {
                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer5.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        String str4 = merchantTransactionElement2.locationLineOne;
                                        if (str4 != null) {
                                            if (StringsKt.isBlank(str4)) {
                                                str4 = null;
                                            }
                                            str = str4;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            gapComposer5.startReplaceGroup(940310784);
                                        } else {
                                            gapComposer5.startReplaceGroup(940310785);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        String str5 = merchantTransactionElement2.date;
                                        str5.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                        ?? r0 = merchantTransactionElement2.locationLineTwo;
                                        if (r0 != 0 && !StringsKt.isBlank(r0)) {
                                            color = r0;
                                        }
                                        ?? r20 = color;
                                        if (r20 == 0) {
                                            gapComposer5.startReplaceGroup(940474464);
                                        } else {
                                            gapComposer5.startReplaceGroup(940474465);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) r20, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        gapComposer5.end(true);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer5 = (Composer) obj10;
                                    int intValue5 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer5;
                                    if (gapComposer6.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        String str6 = merchantTransactionElement2.transactionStatus;
                                        if (str6 != null) {
                                            if (StringsKt.isBlank(str6)) {
                                                str6 = null;
                                            }
                                            str2 = str6;
                                        } else {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            gapComposer6.startReplaceGroup(636521954);
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.startReplaceGroup(636521955);
                                            com.squareup.protos.cash.ui.Color color2 = merchantTransactionElement2.transactionStatusColor;
                                            if (color2 == null) {
                                                gapComposer6.startReplaceGroup(-1363789897);
                                                gapComposer6.end(false);
                                            } else {
                                                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer6, 510196106, color2, gapComposer6, false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            gapComposer6.end(false);
                                        }
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), Expect_jvmKt.rememberComposableLambda(-1244991110, new AccountUiViewKt$$ExternalSyntheticLambda14(merchantTransactionElement, moneyFormatter, function02, this.f$5, 4), gapComposer3), function0, modifier3, null, Expect_jvmKt.rememberComposableLambda(452370781, new Function2() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt$$ExternalSyntheticLambda4
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.String] */
                        /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.String] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj10, Object obj11) {
                            String str;
                            String str2;
                            int i5 = i4;
                            Color color = null;
                            FormBlocker.Element.MerchantTransactionElement merchantTransactionElement2 = merchantTransactionElement;
                            switch (i5) {
                                case 0:
                                    Composer composer3 = (Composer) obj10;
                                    int intValue3 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String str3 = merchantTransactionElement2.merchantName;
                                        str3.getClass();
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer4 = (Composer) obj10;
                                    int intValue4 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, Modifier.Companion.$$INSTANCE);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer5.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer5.startReusableNode();
                                        if (gapComposer5.inserting) {
                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer5.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        String str4 = merchantTransactionElement2.locationLineOne;
                                        if (str4 != null) {
                                            if (StringsKt.isBlank(str4)) {
                                                str4 = null;
                                            }
                                            str = str4;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            gapComposer5.startReplaceGroup(940310784);
                                        } else {
                                            gapComposer5.startReplaceGroup(940310785);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        String str5 = merchantTransactionElement2.date;
                                        str5.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                        ?? r0 = merchantTransactionElement2.locationLineTwo;
                                        if (r0 != 0 && !StringsKt.isBlank(r0)) {
                                            color = r0;
                                        }
                                        ?? r20 = color;
                                        if (r20 == 0) {
                                            gapComposer5.startReplaceGroup(940474464);
                                        } else {
                                            gapComposer5.startReplaceGroup(940474465);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) r20, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        gapComposer5.end(true);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer5 = (Composer) obj10;
                                    int intValue5 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer5;
                                    if (gapComposer6.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        String str6 = merchantTransactionElement2.transactionStatus;
                                        if (str6 != null) {
                                            if (StringsKt.isBlank(str6)) {
                                                str6 = null;
                                            }
                                            str2 = str6;
                                        } else {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            gapComposer6.startReplaceGroup(636521954);
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.startReplaceGroup(636521955);
                                            com.squareup.protos.cash.ui.Color color2 = merchantTransactionElement2.transactionStatusColor;
                                            if (color2 == null) {
                                                gapComposer6.startReplaceGroup(-1363789897);
                                                gapComposer6.end(false);
                                            } else {
                                                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer6, 510196106, color2, gapComposer6, false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            gapComposer6.end(false);
                                        }
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), Expect_jvmKt.rememberComposableLambda(-1751066978, new Function2() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt$$ExternalSyntheticLambda4
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.String] */
                        /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.String] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj10, Object obj11) {
                            String str;
                            String str2;
                            int i5 = i3;
                            Color color = null;
                            FormBlocker.Element.MerchantTransactionElement merchantTransactionElement2 = merchantTransactionElement;
                            switch (i5) {
                                case 0:
                                    Composer composer3 = (Composer) obj10;
                                    int intValue3 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String str3 = merchantTransactionElement2.merchantName;
                                        str3.getClass();
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer4 = (Composer) obj10;
                                    int intValue4 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, Modifier.Companion.$$INSTANCE);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer5.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer5.startReusableNode();
                                        if (gapComposer5.inserting) {
                                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer5.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        String str4 = merchantTransactionElement2.locationLineOne;
                                        if (str4 != null) {
                                            if (StringsKt.isBlank(str4)) {
                                                str4 = null;
                                            }
                                            str = str4;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            gapComposer5.startReplaceGroup(940310784);
                                        } else {
                                            gapComposer5.startReplaceGroup(940310785);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        String str5 = merchantTransactionElement2.date;
                                        str5.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                        ?? r0 = merchantTransactionElement2.locationLineTwo;
                                        if (r0 != 0 && !StringsKt.isBlank(r0)) {
                                            color = r0;
                                        }
                                        ?? r20 = color;
                                        if (r20 == 0) {
                                            gapComposer5.startReplaceGroup(940474464);
                                        } else {
                                            gapComposer5.startReplaceGroup(940474465);
                                            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) r20, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer5.end(false);
                                        gapComposer5.end(true);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer5 = (Composer) obj10;
                                    int intValue5 = ((Integer) obj11).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer5;
                                    if (gapComposer6.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        String str6 = merchantTransactionElement2.transactionStatus;
                                        if (str6 != null) {
                                            if (StringsKt.isBlank(str6)) {
                                                str6 = null;
                                            }
                                            str2 = str6;
                                        } else {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            gapComposer6.startReplaceGroup(636521954);
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.startReplaceGroup(636521955);
                                            com.squareup.protos.cash.ui.Color color2 = merchantTransactionElement2.transactionStatusColor;
                                            if (color2 == null) {
                                                gapComposer6.startReplaceGroup(-1363789897);
                                                gapComposer6.end(false);
                                            } else {
                                                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer6, 510196106, color2, gapComposer6, false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            gapComposer6.end(false);
                                        }
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), false, 0L, gapComposer3, 14156214, 800);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ClockInOverlayTransitionsKt.AnimatedClockInOverlayFooter((Transition) obj9, this.f$1, this.f$5, (Function0) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda3(Modifier modifier, boolean z, Function1 function1, FormBlocker.Element.MerchantTransactionElement merchantTransactionElement, Function0 function0, Modifier modifier2, Icons icons, RealImageLoader realImageLoader, MoneyFormatter moneyFormatter, boolean z2) {
        this.f$2 = modifier;
        this.f$1 = z;
        this.f$0 = function1;
        this.f$3 = merchantTransactionElement;
        this.f$4 = function0;
        this.f$6 = modifier2;
        this.f$7 = icons;
        this.f$8 = realImageLoader;
        this.f$9 = moneyFormatter;
        this.f$5 = z2;
    }

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda3(Function1 function1, boolean z, MoneybotHomeViewModel moneybotHomeViewModel, ParticleGridRenderer particleGridRenderer, LazyListState lazyListState, boolean z2, Density density, Animatable animatable, Set set, State state) {
        this.f$0 = function1;
        this.f$1 = z;
        this.f$2 = moneybotHomeViewModel;
        this.f$3 = particleGridRenderer;
        this.f$4 = lazyListState;
        this.f$5 = z2;
        this.f$6 = density;
        this.f$7 = animatable;
        this.f$8 = set;
        this.f$9 = state;
    }
}
