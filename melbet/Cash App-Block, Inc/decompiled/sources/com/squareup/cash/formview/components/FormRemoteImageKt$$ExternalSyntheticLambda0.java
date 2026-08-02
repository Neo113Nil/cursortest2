package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.SizeKt;
import com.google.android.gms.maps.internal.zza;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.familyhub.views.FamilyUpsellElementKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.family.familyhub.views.SponsorLedInviteViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewModel;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.formview.components.arcade.ArcadeFormDetailRowKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormInstructionCardKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormLegalTextKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListOrderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListUnorderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormPaymentPlanSummaryKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTimelineCardListElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt$$ExternalSyntheticLambda2;
import com.squareup.cash.formview.components.arcade.ArcadeSelectableRow;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel$Item$Accessory$ButtonAccessory;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormRemoteImageKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, FormBlocker.Element.CallToActionElement callToActionElement, Function1 function1) {
        this.$r8$classId = 12;
        this.f$1 = realImageLoader;
        this.f$0 = callToActionElement;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FormBlocker.Element.AbstractC0072Element abstractC0072Element;
        int i;
        BiasAlignment biasAlignment;
        Color color;
        long j;
        int i2;
        BiasAlignment biasAlignment2;
        long j2;
        int i3 = this.$r8$classId;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        FormBlocker.Element.TextInputElement textInputElement = null;
        Color forThemeComposable = null;
        Color m = null;
        r7 = null;
        FormBlocker.Element.OptionPickerElement.Option.Unselectable unselectable = null;
        textInputElement = null;
        textInputElement = null;
        int i4 = 3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        final int i5 = 1;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                FormRemoteImageKt.FormRemoteImage((FormBlocker.Element.RemoteImageElement) obj5, (RealImageLoader) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                FamilyUpsellElementKt.FamilyUpsellElement((FormBlocker.Element.UpsellElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                SponsorDetailViewModel sponsorDetailViewModel = (SponsorDetailViewModel) obj5;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-539549212, new FormCashtag$8$$ExternalSyntheticLambda0(i5, sponsorDetailViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorDetail((Modifier) obj3, (SponsorDetailViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj4;
                SponsorLedInviteViewModel sponsorLedInviteViewModel = (SponsorLedInviteViewModel) obj5;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(452580743, new SponsorLedInviteViewKt$$ExternalSyntheticLambda2(sponsorLedInviteViewModel, function12), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.AddFavorites((AddFavoritesViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.FavoriteAdded((FavoriteAddedViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.FavoriteCardItem((Modifier) obj3, (Function0) obj5, (FavoriteAvatar) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.ListFavoritesView((ListFavoritesViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                FormBlocker.Element.DetailRowElement detailRowElement = (FormBlocker.Element.DetailRowElement) obj5;
                ListUnorderedState listUnorderedState = (ListUnorderedState) obj4;
                FormElementViewBuilder formElementViewBuilder = (FormElementViewBuilder) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow = formElementViewBuilder.viewEvents;
                    boolean changedInstance = gapComposer3.changedInstance(mutableSharedFlow);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        FormElementViewBuilder$toView$21$1$1$1 formElementViewBuilder$toView$21$1$1$1 = new FormElementViewBuilder$toView$21$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer3.updateRememberedValue(formElementViewBuilder$toView$21$1$1$1);
                        rememberedValue = formElementViewBuilder$toView$21$1$1$1;
                    }
                    ArcadeFormDetailRowKt.ArcadeFormDetailRow(detailRowElement, listUnorderedState, (Function1) ((KFunction) rememberedValue), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                FormElementViewBuilder formElementViewBuilder2 = (FormElementViewBuilder) obj5;
                FormBlocker.Element element = (FormBlocker.Element) obj4;
                FormBlocker.Element.TextElement textElement = (FormBlocker.Element.TextElement) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow2 = formElementViewBuilder2.viewEvents;
                    boolean changedInstance2 = gapComposer4.changedInstance(mutableSharedFlow2);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$9$1$1$1 formElementViewBuilder$toView$9$1$1$1 = new FormElementViewBuilder$toView$9$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow2, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer4.updateRememberedValue(formElementViewBuilder$toView$9$1$1$1);
                        rememberedValue2 = formElementViewBuilder$toView$9$1$1$1;
                    }
                    KFunction kFunction = (KFunction) rememberedValue2;
                    if (element != null && (abstractC0072Element = element.element) != null) {
                        FormBlocker.Element.AbstractC0072Element.TextInputElement textInputElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextInputElement ? (FormBlocker.Element.AbstractC0072Element.TextInputElement) abstractC0072Element : null;
                        if (textInputElement2 != null) {
                            textInputElement = textInputElement2.getValue();
                        }
                    }
                    ArcadeFormTextKt.ArcadeFormText(textElement, textInputElement != null, (Function1) kFunction, null, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i6 = FormViewCtaButtons.$r8$clinit;
                ((FormViewCtaButtons) obj5).CtaButton((FormViewCtaButtons.ButtonProps) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 12:
                RealImageLoader realImageLoader3 = (RealImageLoader) obj4;
                FormBlocker.Element.CallToActionElement callToActionElement = (FormBlocker.Element.CallToActionElement) obj5;
                Function1 function13 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader3), Expect_jvmKt.rememberComposableLambda(-1896085775, new FormCashtag$8$$ExternalSyntheticLambda0(callToActionElement, function13), gapComposer5), gapComposer5, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ArcadeFormDetailRowKt.ArcadeFormDetailRow((FormBlocker.Element.DetailRowElement) obj5, (ListUnorderedState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ArcadeFormInstructionCardKt.ArcadeFormInstructionCard((FormBlocker.Element.InstructionCardElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ArcadeFormLegalTextKt.ArcadeFormLegalText((FormBlocker.Element.LegalTextElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ArcadeFormListOrderedKt.ArcadeFormListOrdered((FormBlocker.Element.ListOrderedElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ArcadeFormListUnorderedKt.ArcadeFormListUnordered((FormBlocker.Element.ListUnorderedElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ArcadeFormMoneyKt.ArcadeFormMoney((FormBlocker.Element.MoneyElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ((ArcadeFormOptionPickerView) obj5).Content((Unit) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ArcadeFormOptionPickerView arcadeFormOptionPickerView = (ArcadeFormOptionPickerView) obj5;
                final FormBlocker.Element.OptionPickerElement.Option option = (FormBlocker.Element.OptionPickerElement.Option) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, arcadeFormOptionPickerView.horizontalPaddingPx, 8.0f);
                    FormBlocker.Element.OptionPickerElement.Option.Selectability selectability = option.selectability;
                    if (selectability != null) {
                        FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable unselectable2 = selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable ? (FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable) selectability : null;
                        if (unselectable2 != null) {
                            unselectable = unselectable2.getValue();
                        }
                    }
                    boolean z = unselectable == null;
                    boolean areEqual = Intrinsics.areEqual((String) arcadeFormOptionPickerView.selectedOptionId$delegate.getValue(), option.id);
                    final int i7 = r10 ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(601895505, new Function2() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Icons icons;
                            int i8 = i7;
                            Map map = null;
                            FormBlocker.Element.OptionPickerElement.Option option2 = option;
                            switch (i8) {
                                case 0:
                                    Composer composer7 = (Composer) obj6;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer7;
                                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                        String str = option2.value;
                                        if (str == null) {
                                            a$$ExternalSyntheticBUOutline0.m$1("Option's label can't be empty");
                                            break;
                                        } else {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        }
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer8 = (Composer) obj6;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer8 = (GapComposer) composer8;
                                    if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        gapComposer8.skipToGroupEnd();
                                    } else if (option2.subtitle == null && option2.subtitle_markdown == null) {
                                        gapComposer8.startReplaceGroup(-1449021968);
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.startReplaceGroup(-1450793091);
                                        Icon icon = option2.subtitle_trailing_icon;
                                        if (icon != null) {
                                            zzd zzdVar = Icons.Companion;
                                            String str2 = icon.arcade_id;
                                            str2.getClass();
                                            zzdVar.getClass();
                                            icons = zzd.get(str2);
                                        } else {
                                            icons = null;
                                        }
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                        String str3 = option2.subtitle_markdown;
                                        if (str3 != null) {
                                            Worker.DefaultImpls.appendMarkdown$default(builder, str3, null, 6);
                                        } else {
                                            String str4 = option2.subtitle;
                                            if (str4 != null) {
                                                builder.append(str4);
                                            }
                                        }
                                        if (icons != null) {
                                            KeyMappingKt.appendInlineContent(builder, "icon", "�");
                                        }
                                        AnnotatedString annotatedString = builder.toAnnotatedString();
                                        if (icons == null) {
                                            gapComposer8.startReplaceGroup(-1450303695);
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1450303694);
                                            map = MapsKt__MapsJVMKt.mapOf(new Pair("icon", new InlineTextContent(new Placeholder(7, Room.getSp(24), Room.getSp(24)), Expect_jvmKt.rememberComposableLambda(883146796, new PoolToastKt$$ExternalSyntheticLambda2(icons, 1), gapComposer8))));
                                            gapComposer8.end(false);
                                        }
                                        if (map == null) {
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                        }
                                        Map map2 = map;
                                        boolean changedInstance3 = gapComposer8.changedInstance(option2);
                                        Object rememberedValue3 = gapComposer8.rememberedValue();
                                        if (changedInstance3 || rememberedValue3 == Composer.Companion.Empty) {
                                            rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda2(option2, 7);
                                            gapComposer8.updateRememberedValue(rememberedValue3);
                                        }
                                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2044, 0L, (Composer) gapComposer8, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue3), annotatedString, (TextStyle) null, (TextLineBalancing) null, map2, (Function1) null, false);
                                        gapComposer8.end(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer6);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-408770542, new Function2() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Icons icons;
                            int i8 = i5;
                            Map map = null;
                            FormBlocker.Element.OptionPickerElement.Option option2 = option;
                            switch (i8) {
                                case 0:
                                    Composer composer7 = (Composer) obj6;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer7;
                                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                        String str = option2.value;
                                        if (str == null) {
                                            a$$ExternalSyntheticBUOutline0.m$1("Option's label can't be empty");
                                            break;
                                        } else {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        }
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer8 = (Composer) obj6;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer8 = (GapComposer) composer8;
                                    if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        gapComposer8.skipToGroupEnd();
                                    } else if (option2.subtitle == null && option2.subtitle_markdown == null) {
                                        gapComposer8.startReplaceGroup(-1449021968);
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.startReplaceGroup(-1450793091);
                                        Icon icon = option2.subtitle_trailing_icon;
                                        if (icon != null) {
                                            zzd zzdVar = Icons.Companion;
                                            String str2 = icon.arcade_id;
                                            str2.getClass();
                                            zzdVar.getClass();
                                            icons = zzd.get(str2);
                                        } else {
                                            icons = null;
                                        }
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                        String str3 = option2.subtitle_markdown;
                                        if (str3 != null) {
                                            Worker.DefaultImpls.appendMarkdown$default(builder, str3, null, 6);
                                        } else {
                                            String str4 = option2.subtitle;
                                            if (str4 != null) {
                                                builder.append(str4);
                                            }
                                        }
                                        if (icons != null) {
                                            KeyMappingKt.appendInlineContent(builder, "icon", "�");
                                        }
                                        AnnotatedString annotatedString = builder.toAnnotatedString();
                                        if (icons == null) {
                                            gapComposer8.startReplaceGroup(-1450303695);
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1450303694);
                                            map = MapsKt__MapsJVMKt.mapOf(new Pair("icon", new InlineTextContent(new Placeholder(7, Room.getSp(24), Room.getSp(24)), Expect_jvmKt.rememberComposableLambda(883146796, new PoolToastKt$$ExternalSyntheticLambda2(icons, 1), gapComposer8))));
                                            gapComposer8.end(false);
                                        }
                                        if (map == null) {
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                        }
                                        Map map2 = map;
                                        boolean changedInstance3 = gapComposer8.changedInstance(option2);
                                        Object rememberedValue3 = gapComposer8.rememberedValue();
                                        if (changedInstance3 || rememberedValue3 == Composer.Companion.Empty) {
                                            rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda2(option2, 7);
                                            gapComposer8.updateRememberedValue(rememberedValue3);
                                        }
                                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2044, 0L, (Composer) gapComposer8, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue3), annotatedString, (TextStyle) null, (TextLineBalancing) null, map2, (Function1) null, false);
                                        gapComposer8.end(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer6);
                    boolean changedInstance3 = gapComposer6.changedInstance(option) | gapComposer6.changed(function14) | gapComposer6.changedInstance(arcadeFormOptionPickerView);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda3(9, option, function14, arcadeFormOptionPickerView);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    InputChipKt.SelectionCard(rememberComposableLambda, rememberComposableLambda2, areEqual, m299paddingVpY3zN4, z, (Function1) rememberedValue3, gapComposer6, 3126, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ArcadeFormPaymentPlanSummaryKt.ArcadeFormPaymentPlanSummary((FormBlocker.Element.PaymentPlanSummaryElement) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                RealImageLoader realImageLoader4 = (RealImageLoader) obj4;
                FormBlocker.Element.TimelineCardListElement timelineCardListElement = (FormBlocker.Element.TimelineCardListElement) obj5;
                Function1 function15 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader4), Expect_jvmKt.rememberComposableLambda(-665684303, new ErrorView$$ExternalSyntheticLambda1(timelineCardListElement, function15), gapComposer7), gapComposer7, 56);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ArcadeFormTimelineCardListElementKt.TimelineCardRow((FormBlocker.Element.TimelineCardListElement.Item) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                RealImageLoader realImageLoader5 = (RealImageLoader) obj4;
                FormBlocker.Element.UpsellElement upsellElement = (FormBlocker.Element.UpsellElement) obj5;
                Function1 function16 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader5), Expect_jvmKt.rememberComposableLambda(-1648193773, new ArcadeFormUpsellKt$$ExternalSyntheticLambda2(upsellElement, function16), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ArcadeSelectableRow arcadeSelectableRow = (ArcadeSelectableRow) obj5;
                SelectableRowViewModel.LeadingIcon.Small small = (SelectableRowViewModel.LeadingIcon.Small) obj4;
                SelectableRowViewModel selectableRowViewModel = (SelectableRowViewModel) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    arcadeSelectableRow.LeadingIcon(small, selectableRowViewModel.isEnabled, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                GenericBaseViewModel.ArcadeTextViewModel arcadeTextViewModel = (GenericBaseViewModel.ArcadeTextViewModel) obj5;
                Modifier modifier = (Modifier) obj3;
                TextStyle textStyle = (TextStyle) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str = arcadeTextViewModel.text;
                    int ordinal = arcadeTextViewModel.alignment.ordinal();
                    if (ordinal == 0) {
                        i = 1;
                    } else if (ordinal == 1) {
                        i = 2;
                    } else if (ordinal == 2) {
                        i = 3;
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = 4;
                    }
                    int ordinal2 = arcadeTextViewModel.verticalAlignment.ordinal();
                    if (ordinal2 == 0) {
                        biasAlignment = Alignment.Companion.TopStart;
                    } else if (ordinal2 == 1) {
                        biasAlignment = Alignment.Companion.BottomStart;
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        biasAlignment = Alignment.Companion.CenterStart;
                    }
                    Modifier align = boxScopeInstance.align(modifier, biasAlignment);
                    Integer num = arcadeTextViewModel.maxLineNumber;
                    int intValue11 = num != null ? num.intValue() : Integer.MAX_VALUE;
                    ArcadeTextElement.SemanticTextColor semanticTextColor = arcadeTextViewModel.semanticColor;
                    if (semanticTextColor == null) {
                        gapComposer10.startReplaceGroup(15116837);
                        gapComposer10.end(false);
                        color = null;
                    } else {
                        gapComposer10.startReplaceGroup(139034972);
                        long arcadeColor = zza.toArcadeColor(semanticTextColor, gapComposer10);
                        gapComposer10.end(false);
                        color = new Color(arcadeColor);
                    }
                    if (color == null) {
                        gapComposer10.startReplaceGroup(15162315);
                        ColorModel colorModel = arcadeTextViewModel.color;
                        if (colorModel == null) {
                            gapComposer10.startReplaceGroup(15162314);
                            gapComposer10.end(false);
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer10, 139036439, colorModel, gapComposer10, false);
                        }
                        gapComposer10.end(false);
                        color = m;
                    } else {
                        gapComposer10.startReplaceGroup(139034362);
                        gapComposer10.end(false);
                    }
                    if (color == null) {
                        gapComposer10.startReplaceGroup(139037725);
                        gapComposer10.startReplaceGroup(1044898235);
                        j = ((Color) gapComposer10.consume(ArcadeThemeKt.LocalTextColor)).value;
                        if (j == 16) {
                            Colors colors = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            j = colors.semantic.text.standard;
                        }
                        gapComposer10.end(false);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(139034408);
                        gapComposer10.end(false);
                        j = color.value;
                    }
                    Room.m1165Text25TpFw(0, intValue11, 0, i, 0, 0, 3760, j, (Composer) gapComposer10, align, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                CameraFeedKt.AvatarBadge((Modifier) obj3, (AvatarElement.Badge) obj5, (Image) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                GenericBaseViewModel.TextViewModel textViewModel = (GenericBaseViewModel.TextViewModel) obj5;
                Modifier modifier2 = (Modifier) obj3;
                TextStyle textStyle2 = (TextStyle) obj4;
                Composer composer11 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    String str2 = textViewModel.text;
                    int ordinal3 = textViewModel.alignment.ordinal();
                    if (ordinal3 == 0) {
                        i2 = 1;
                    } else if (ordinal3 == 1) {
                        i2 = 2;
                    } else if (ordinal3 == 2) {
                        i2 = 3;
                    } else {
                        if (ordinal3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = 4;
                    }
                    int ordinal4 = textViewModel.verticalAlignment.ordinal();
                    if (ordinal4 == 0) {
                        biasAlignment2 = Alignment.Companion.TopStart;
                    } else if (ordinal4 == 1) {
                        biasAlignment2 = Alignment.Companion.BottomStart;
                    } else {
                        if (ordinal4 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        biasAlignment2 = Alignment.Companion.CenterStart;
                    }
                    Modifier align2 = boxScopeInstance.align(modifier2, biasAlignment2);
                    Integer num2 = textViewModel.maxLineNumber;
                    int intValue13 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                    ColorModel colorModel2 = textViewModel.color;
                    if (colorModel2 == null) {
                        gapComposer11.startReplaceGroup(-1796726776);
                    } else {
                        gapComposer11.startReplaceGroup(1327514393);
                        forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel2, ThemeHelpersKt.themeInfo((Context) gapComposer11.consume(AndroidCompositionLocals_androidKt.LocalContext)), gapComposer11);
                    }
                    gapComposer11.end(false);
                    if (forThemeComposable == null) {
                        gapComposer11.startReplaceGroup(1327517506);
                        j2 = MooncakeTheme.getColors(gapComposer11).label;
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(1327514034);
                        gapComposer11.end(false);
                        j2 = forThemeComposable.value;
                    }
                    KeypadKt.m3651TextPdH14aY(intValue13, 0, i2, 0, 0, 0, 3792, j2, (Composer) gapComposer11, align2, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory = (GlobalSearchViewModel$Item$Accessory$ButtonAccessory) obj5;
                GlobalSearchFeedKt$$ExternalSyntheticLambda5 globalSearchFeedKt$$ExternalSyntheticLambda5 = (GlobalSearchFeedKt$$ExternalSyntheticLambda5) obj4;
                GlobalSearchViewModel.Item item = (GlobalSearchViewModel.Item) obj3;
                Composer composer12 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                } else {
                    if (!(globalSearchViewModel$Item$Accessory$ButtonAccessory instanceof GlobalSearchViewModel$Item$Accessory$ButtonAccessory)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -1366015568, false);
                    }
                    gapComposer12.startReplaceGroup(-1366011860);
                    boolean changed = gapComposer12.changed(globalSearchFeedKt$$ExternalSyntheticLambda5) | gapComposer12.changedInstance(item) | gapComposer12.changedInstance(globalSearchViewModel$Item$Accessory$ButtonAccessory);
                    Object rememberedValue4 = gapComposer12.rememberedValue();
                    if (changed || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new GLSceneScope$$ExternalSyntheticLambda2(14, globalSearchFeedKt$$ExternalSyntheticLambda5, item, globalSearchViewModel$Item$Accessory$ButtonAccessory);
                        gapComposer12.updateRememberedValue(rememberedValue4);
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue4, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1418890805, new FormView$$ExternalSyntheticLambda0(globalSearchViewModel$Item$Accessory$ButtonAccessory, i4), gapComposer12), gapComposer12, 1572864, 62);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, FormBlocker.Element.TimelineCardListElement timelineCardListElement, Function1 function1) {
        this.$r8$classId = 22;
        this.f$1 = realImageLoader;
        this.f$0 = timelineCardListElement;
        this.f$2 = function1;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, FormBlocker.Element.UpsellElement upsellElement, Function1 function1) {
        this.$r8$classId = 24;
        this.f$1 = realImageLoader;
        this.f$0 = upsellElement;
        this.f$2 = function1;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, Object obj, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = realImageLoader;
        this.f$0 = obj;
        this.f$2 = function1;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(GenericBaseViewModel genericBaseViewModel, Modifier modifier, TextStyle textStyle, int i) {
        this.$r8$classId = i;
        this.f$0 = genericBaseViewModel;
        this.f$2 = modifier;
        this.f$1 = textStyle;
    }

    public /* synthetic */ FormRemoteImageKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
