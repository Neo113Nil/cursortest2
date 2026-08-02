package com.squareup.cash.payments.views.composer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda8;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.offers.views.home.OffersHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class SelectRecipientKt {
    public static final void SearchTextField(TextFieldState textFieldState, FocusRequester focusRequester, Function1 function1, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1333374777);
        int i2 = i | (gapComposer.changed(textFieldState) ? 4 : 2) | (gapComposer.changed(focusRequester) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).input), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).component.searchField.text, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).component.searchField.icon.f215default, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1381522439, new BasicShieetKt$$ExternalSyntheticLambda0(m340RoundedCornerShape0680j_4, (MutableInteractionSourceImpl) rememberedValue, focusRequester, textFieldState, Room.stringResource(gapComposer, R.string.search_bar_content_description), function0, function1), gapComposer), gapComposer, 56);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(textFieldState, focusRequester, function1, function0, modifier2, i);
        }
    }

    public static final void SelectRecipient(final Modifier modifier, final FocusRequester focusRequester, final Function1 function1, final Function1 function12, final Function1 function13, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function14, final Function0 function04, final List list, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, Composer composer, final int i) {
        GapComposer gapComposer;
        boolean z7;
        GapComposer gapComposer2;
        boolean z8;
        LazyListState lazyListState;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function0.getClass();
        function02.getClass();
        list.getClass();
        str.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-593888759);
        int i2 = i | (gapComposer3.changedInstance(function1) ? 256 : 128) | (gapComposer3.changedInstance(function12) ? 2048 : 1024);
        boolean changedInstance = gapComposer3.changedInstance(function13);
        int i3 = PKIFailureInfo.certRevoked;
        int i4 = i2 | (changedInstance ? 16384 : 8192) | (gapComposer3.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536);
        boolean changedInstance2 = gapComposer3.changedInstance(function02);
        int i5 = PKIFailureInfo.signerNotTrusted;
        int i6 = i4 | (changedInstance2 ? PKIFailureInfo.badCertTemplate : 524288) | (gapComposer3.changedInstance(function03) ? 8388608 : 4194304) | (gapComposer3.changedInstance(function14) ? 67108864 : 33554432) | (gapComposer3.changedInstance(function04) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i7 = 1024;
        int i8 = (gapComposer3.changedInstance(list) ? 4 : 2) | (gapComposer3.changed(str) ? 32 : 16) | (gapComposer3.changed(z) ? 256 : 128);
        if (gapComposer3.changed(z2)) {
            i7 = 2048;
        }
        int i9 = i8 | i7;
        if (gapComposer3.changed(z3)) {
            i3 = 16384;
        }
        int i10 = i9 | i3 | (gapComposer3.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer3.changed(z5)) {
            i5 = PKIFailureInfo.badCertTemplate;
        }
        int i11 = i10 | i5 | (gapComposer3.changed(z6) ? 8388608 : 4194304);
        if (gapComposer3.shouldExecute(i6 & 1, ((i6 & 306783379) == 306783378 && (4793491 & i11) == 4793490) ? false : true)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer3, (i11 >> 3) & 14, 2);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changed = ((i6 & 57344) == 16384) | gapComposer3.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function13, m382rememberTextFieldStateLepunE, (Continuation) null, 14);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer3, charSequence, (Function2) rememberedValue);
            final LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer3);
            TooltipState rememberTooltipState = CardUpsellKt.rememberTooltipState(gapComposer3);
            Boolean valueOf = Boolean.valueOf(z6);
            boolean changed2 = ((i11 & 29360128) == 8388608) | gapComposer3.changed(rememberTooltipState);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$scheduleBadgeClearingWork$3(z6, rememberTooltipState, (Continuation) null, 8);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer3, valueOf, (Function2) rememberedValue2);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            CardUpsellKt.m3598TooltipBoxiHT50w(null, Room.stringResource(gapComposer3, R.string.recipient_search_tooltip), rememberTooltipState, horizontal, 250.0f, function04, Expect_jvmKt.rememberComposableLambda(-165845407, new MoneyTabUIKt$$ExternalSyntheticLambda8(z5, m382rememberTextFieldStateLepunE, focusRequester, function13, function03, 2), gapComposer3), gapComposer3, ((i6 >> 12) & 458752) | 1600512, 1);
            if (z) {
                gapComposer3.startReplaceGroup(-1222381471);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 100.0f, 1));
                gapComposer3.end(false);
                gapComposer = gapComposer3;
                z8 = true;
            } else {
                gapComposer3.startReplaceGroup(-1222252108);
                boolean changedInstance3 = ((i11 & 112) == 32) | ((i11 & 57344) == 16384) | ((i6 & 458752) == 131072) | gapComposer3.changedInstance(list) | ((i6 & 7168) == 2048) | ((i6 & 896) == 256) | gapComposer3.changed(rememberLazyListState) | ((234881024 & i6) == 67108864) | ((i11 & 7168) == 2048) | ((3670016 & i6) == 1048576) | ((i11 & 458752) == 131072);
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    z7 = false;
                    gapComposer2 = gapComposer3;
                    z8 = true;
                    Function1 function15 = new Function1() { // from class: com.squareup.cash.payments.views.composer.SelectRecipientKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LazyListScope lazyListScope = (LazyListScope) obj;
                            lazyListScope.getClass();
                            boolean z9 = z3;
                            String str2 = str;
                            if (z9 && StringsKt.isBlank(str2)) {
                                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new DismissableToastKt$$ExternalSyntheticLambda3(28, function0), true, 1581359615), 3);
                            }
                            List<SectionViewModel> list2 = list;
                            if (list2.isEmpty() && str2.length() > 0) {
                                LazyListScope.item$default(lazyListScope, null, null, ErrorKt.lambda$1072286056, 3);
                            }
                            for (SectionViewModel sectionViewModel : list2) {
                                if (!StringsKt.isBlank(sectionViewModel.name)) {
                                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda2(sectionViewModel, 9), true, -1617381735), 3);
                                }
                                LazyListScope.items$default(lazyListScope, sectionViewModel.recipients.size(), new UtilsKt$$ExternalSyntheticLambda0(sectionViewModel, 12), new ComposableLambdaImpl(new OffersHomeViewKt$$ExternalSyntheticLambda2(sectionViewModel, function12, function1, rememberLazyListState, function14), true, -381534713), 4);
                            }
                            if (z2 && StringsKt.isBlank(str2)) {
                                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new DismissableToastKt$$ExternalSyntheticLambda3(29, function02), true, -139526654), 3);
                            } else if (z4 && StringsKt.isBlank(str2)) {
                                LazyListScope.item$default(lazyListScope, null, null, ErrorKt.f553lambda$1019768135, 3);
                                LazyListScope.item$default(lazyListScope, null, null, ErrorKt.f558lambda$2013492318, 3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    lazyListState = rememberLazyListState;
                    gapComposer2.updateRememberedValue(function15);
                    rememberedValue3 = function15;
                } else {
                    gapComposer2 = gapComposer3;
                    z7 = false;
                    lazyListState = rememberLazyListState;
                    z8 = true;
                }
                GapComposer gapComposer4 = gapComposer2;
                LazyDslKt.LazyColumn(null, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer4, 0, 509);
                gapComposer = gapComposer4;
                gapComposer.end(z7);
            }
            gapComposer.end(z8);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(focusRequester, function1, function12, function13, function0, function02, function03, function14, function04, list, str, z, z2, z3, z4, z5, z6, i) { // from class: com.squareup.cash.payments.views.composer.SelectRecipientKt$$ExternalSyntheticLambda2
                public final /* synthetic */ FocusRequester f$1;
                public final /* synthetic */ List f$10;
                public final /* synthetic */ String f$11;
                public final /* synthetic */ boolean f$12;
                public final /* synthetic */ boolean f$13;
                public final /* synthetic */ boolean f$14;
                public final /* synthetic */ boolean f$15;
                public final /* synthetic */ boolean f$16;
                public final /* synthetic */ boolean f$17;
                public final /* synthetic */ Function1 f$2;
                public final /* synthetic */ Function1 f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ Function0 f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ Function0 f$7;
                public final /* synthetic */ Function1 f$8;
                public final /* synthetic */ Function0 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(55);
                    SelectRecipientKt.SelectRecipient(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
