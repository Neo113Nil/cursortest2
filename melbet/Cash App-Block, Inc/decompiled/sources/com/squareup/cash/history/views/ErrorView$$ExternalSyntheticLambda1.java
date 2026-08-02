package com.squareup.cash.history.views;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.local.views.map.BrandCollectionMapViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.instantapps.InstantApps;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormDetailRowKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPickerKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroHeaderKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroNumericsKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListOrderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListUnorderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormNoticeKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormSectionHeaderElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTimelineCardListElementKt;
import com.squareup.cash.formview.components.arcade.ComposableSingletons$ArcadeFormPaymentPlanScheduleKt;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.genericelements.components.components.arcade.ArcadeUtilKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.viewmodels.CancelPaymentViewModel;
import com.squareup.cash.history.viewmodels.ErrorViewModel;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.KTypesJvm;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.ListOrdered;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(GenericBaseViewModel genericBaseViewModel, Function1 function1) {
        this.$r8$classId = 25;
        this.f$0 = genericBaseViewModel;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$genericelements$components$components$arcade$CellDefaultWidgetKt$$ExternalSyntheticLambda16(Object obj, Object obj2) {
        GenericBaseViewModel genericBaseViewModel = (GenericBaseViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            InstantApps.GenericBaseElement(genericBaseViewModel, Modifier.Companion.$$INSTANCE, function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$growtools$views$manager$GrowToolsManagerViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2) {
        GrowToolsManagerViewModel.Loaded.Header header = (GrowToolsManagerViewModel.Loaded.Header) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            GrowToolsManagerViewModel.Loaded.Header.Target target = header.target;
            boolean z = header.isAvatarClickable;
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(1356219531);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ErrorView$$ExternalSyntheticLambda4(9, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier = ImageKt.m182clickableO2vRcR0$default(modifier, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1356471716);
                gapComposer.end(false);
            }
            KTypesJvm.GrowToolsAvatar(target, modifier, header.isToggleOn, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$CancelPaymentView$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        CancelPaymentViewModel cancelPaymentViewModel = (CancelPaymentViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = CancelPaymentView.$r8$clinit;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            String str = cancelPaymentViewModel.message;
            if (str == null) {
                str = "";
            }
            ModalKt.Modal((Modifier) null, "", str, Expect_jvmKt.rememberComposableLambda(-1585255263, new ErrorView$$ExternalSyntheticLambda3(21, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1669420194, new ErrorView$$ExternalSyntheticLambda3(22, function1), gapComposer), (Function3) null, gapComposer, 27696, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0c3d  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        UiAvatar uiAvatar;
        String str;
        Modifier wrapContentHeight;
        Function0 function0;
        FormBlocker.Element.OptionPickerElement.Option.Unselectable unselectable;
        boolean changed;
        Object rememberedValue;
        boolean z;
        Function0 function02;
        SnapshotStateMap snapshotStateMap;
        Function0 function03;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        int i3 = 3;
        int i4 = 7;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ErrorViewModel errorViewModel = (ErrorViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = ErrorView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, "", errorViewModel.message, Expect_jvmKt.rememberComposableLambda(850915325, new ErrorView$$ExternalSyntheticLambda3(0, function1), gapComposer), (Function3) null, (Function3) null, gapComposer, 3120, 49);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ArcadeFormCellDefaultElementKt.AccessoryLeadingImage((CellDefault.CellDefaultAccessoryLeadingImage) obj5, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                CellDefault.CellDefaultIcon cellDefaultIcon = (CellDefault.CellDefaultIcon) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = cellDefaultIcon.icon_style;
                    if (iconStyle != null) {
                        CellDefault.CellDefaultIcon.IconStyle.Avatar avatar = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar ? (CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle : null;
                        if (avatar != null) {
                            uiAvatar = avatar.getValue();
                            if (uiAvatar == null) {
                                gapComposer2.startReplaceGroup(844812485);
                                Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(199557484, new ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda8(cellDefaultIcon, 1), gapComposer2), gapComposer2, 56);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(845089098);
                                zzd zzdVar = Icons.Companion;
                                CellDefault.CellDefaultIcon.IconStyle iconStyle2 = cellDefaultIcon.icon_style;
                                if (iconStyle2 != null) {
                                    CellDefault.CellDefaultIcon.IconStyle.Icon icon = iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.Icon ? (CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle2 : null;
                                    Icon value = icon != null ? icon.getValue() : null;
                                    if (value != null) {
                                        str = value.arcade_id;
                                        str.getClass();
                                        zzdVar.getClass();
                                        Icons icons = zzd.get(str);
                                        icons.getClass();
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        gapComposer2.end(false);
                                    }
                                }
                                str = null;
                                str.getClass();
                                zzdVar.getClass();
                                Icons icons2 = zzd.get(str);
                                icons2.getClass();
                                Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                gapComposer2.end(false);
                            }
                        }
                    }
                    uiAvatar = null;
                    if (uiAvatar == null) {
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BlockerAction blockerAction = (BlockerAction) obj5;
                Function1 function12 = (Function1) obj4;
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                if (blockerAction == null) {
                    function12.invoke(new FormViewEvent.FormUrlClicked(str2));
                }
                return Unit.INSTANCE;
            case 4:
                ArcadeFormEmojiPicker arcadeFormEmojiPicker = (ArcadeFormEmojiPicker) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier selectableGroup = SelectableKt.selectableGroup(SpacerKt.m299paddingVpY3zN4(wrapContentHeight, 16.0f, 32.0f));
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(32.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    ArcadeFormEmojiPickerKt.Grid(selectableGroup, arcadeFormEmojiPicker.element.categories, arrangement$SpacedAligned, new Arrangement$SpacedAligned(32.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Expect_jvmKt.rememberComposableLambda(-2113482330, new BrandCollectionMapViewKt$$ExternalSyntheticLambda6(i3, arcadeFormEmojiPicker, mutableState), gapComposer3), gapComposer3, 196656);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ArcadeFormHeroHeaderKt.ArcadeFormHeroHeader((FormBlocker.Element.HeroHeaderElement) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ArcadeFormHeroKt.ArcadeFormHero((FormBlocker.Element.HeroElement) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ArcadeFormHeroKt.LottieAnimation((Animation) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ArcadeFormHeroNumericsKt.ArcadeFormHeroNumerics((FormBlocker.Element.HeroNumericsHeaderElement) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                FormBlocker.Element.InstructionCardElement instructionCardElement = (FormBlocker.Element.InstructionCardElement) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    MoneybotTheme.m3623Cardjb40ds(Modifier.Companion.$$INSTANCE, false, 0L, RecyclerView.DECELERATION_RATE, null, null, Expect_jvmKt.rememberComposableLambda(1149133828, new ArcadeModal2Kt$$ExternalSyntheticLambda0(27, instructionCardElement, function13), gapComposer4), gapComposer4, 1572864, 62);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                FormBlocker.Element.LegalTextElement legalTextElement = (FormBlocker.Element.LegalTextElement) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str3 = legalTextElement.text;
                    if (str3 == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m(legalTextElement, "Missing text in ");
                        return null;
                    }
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    long j = colors.semantic.text.subtle;
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                    boolean changed2 = gapComposer5.changed(function14);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        rememberedValue2 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(i2, function14);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue2, Modifier.Companion.$$INSTANCE, textStyle, j, null, null, null, 0, 0, 3, gapComposer5, 0, 992);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ListOrdered listOrdered = (ListOrdered) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ListOrdered.Variant variant = listOrdered.variant;
                    if ((variant != null ? ArcadeFormListOrderedKt.WhenMappings.$EnumSwitchMapping$0[variant.ordinal()] : -1) == 1) {
                        gapComposer6.startReplaceGroup(111522032);
                        boolean changedInstance = gapComposer6.changedInstance(arrayList);
                        Object rememberedValue3 = gapComposer6.rememberedValue();
                        if (changedInstance || rememberedValue3 == obj3) {
                            rememberedValue3 = new TextStreamsKt$$ExternalSyntheticLambda0(6, arrayList);
                            gapComposer6.updateRememberedValue(rememberedValue3);
                        }
                        ListOrderedKt.ListOrderedSubtle(0, 0, gapComposer6, companion, (Function1) rememberedValue3);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(111670677);
                        boolean changedInstance2 = gapComposer6.changedInstance(arrayList);
                        Object rememberedValue4 = gapComposer6.rememberedValue();
                        if (changedInstance2 || rememberedValue4 == obj3) {
                            rememberedValue4 = new TextStreamsKt$$ExternalSyntheticLambda0(7, arrayList);
                            gapComposer6.updateRememberedValue(rememberedValue4);
                        }
                        ListOrderedKt.ListOrderedStandard(0, 0, gapComposer6, companion, (Function1) rememberedValue4);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                FormBlocker.Element.ListUnorderedElement listUnorderedElement = (FormBlocker.Element.ListUnorderedElement) obj5;
                ImmutableList immutableList = (ImmutableList) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    FormBlocker.Element.ListUnorderedElement.Type type2 = listUnorderedElement.type;
                    int i6 = type2 == null ? -1 : ArcadeFormListUnorderedKt.WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (i6 == -1) {
                        gapComposer7.startReplaceGroup(646722285);
                        ListUnorderedKt.ListUnordered(immutableList, companion2, (ListUnorderedState) null, ListUnorderedProminence.Standard, ArcadeFormListUnorderedKt.toArcadeSize(listUnorderedElement.size), RecyclerView.DECELERATION_RATE, gapComposer7, 3072, 36);
                        gapComposer7.end(false);
                    } else if (i6 == 1) {
                        gapComposer7.startReplaceGroup(646332367);
                        ListUnorderedKt.ListUnordered(immutableList, companion2, (ListUnorderedState) null, ListUnorderedProminence.Subtle, ArcadeFormListUnorderedKt.toArcadeSize(listUnorderedElement.size), RecyclerView.DECELERATION_RATE, gapComposer7, 3072, 36);
                        gapComposer7.end(false);
                    } else {
                        if (i6 != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -117699732, false);
                        }
                        gapComposer7.startReplaceGroup(646541741);
                        ListUnorderedKt.ListUnordered(immutableList, companion2, (ListUnorderedState) null, ListUnorderedProminence.Standard, ArcadeFormListUnorderedKt.toArcadeSize(listUnorderedElement.size), RecyclerView.DECELERATION_RATE, gapComposer7, 3072, 36);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ArcadeFormMerchantTransactionPickerView arcadeFormMerchantTransactionPickerView = (ArcadeFormMerchantTransactionPickerView) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier selectableGroup2 = SelectableKt.selectableGroup(SizeKt.fillMaxWidth(companion, 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, selectableGroup2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer8.startReplaceGroup(1156144015);
                    List list = arcadeFormMerchantTransactionPickerView.options;
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) list.get(i7);
                        String str4 = merchantTransactionElement.transactionId;
                        str4.getClass();
                        LocalizedMoneyFormatter.Factory factory = arcadeFormMerchantTransactionPickerView.moneyFormatterFactory;
                        RealImageLoader realImageLoader2 = arcadeFormMerchantTransactionPickerView.imageLoader;
                        boolean contains = ((List) mutableState2.getValue()).contains(str4);
                        if (Intrinsics.areEqual(merchantTransactionElement.selectable, Boolean.TRUE)) {
                            gapComposer8.startReplaceGroup(505162143);
                            boolean changed3 = gapComposer8.changed(mutableState2) | gapComposer8.changed(str4);
                            Object rememberedValue5 = gapComposer8.rememberedValue();
                            if (changed3 || rememberedValue5 == obj3) {
                                rememberedValue5 = new GLSceneScope$$ExternalSyntheticLambda4(18, str4, mutableState2);
                                gapComposer8.updateRememberedValue(rememberedValue5);
                            }
                            gapComposer8.end(false);
                            function0 = (Function0) rememberedValue5;
                        } else {
                            gapComposer8.startReplaceGroup(505268256);
                            gapComposer8.end(false);
                            function0 = null;
                        }
                        ArcadeFormMerchantTransactionKt.ArcadeFormMerchantTransaction(factory, realImageLoader2, merchantTransactionElement, function0, contains, null, gapComposer8, 0, 32);
                    }
                    gapComposer8.end(false);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Function1 function15 = (Function1) obj4;
                FormBlocker.Element.MoneyElement moneyElement = (FormBlocker.Element.MoneyElement) obj5;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 180.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
                    int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, m302paddingqDBjuR0$default);
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
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    TextStyle textStyle2 = ((Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    long j2 = colors2.semantic.text.standard;
                    Money money = moneyElement.amount;
                    money.getClass();
                    String str5 = (String) function15.invoke(money);
                    Money money2 = moneyElement.amount;
                    money2.getClass();
                    Long l = money2.amount;
                    l.getClass();
                    VisibleKt.m3482AnimatedAmountTextJDMA8c0(null, textStyle2, j2, 3, new AnimatedAmountTextView.Amount(str5, l.longValue()), null, false, 0L, gapComposer9, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ArcadeFormNoticeKt.ArcadeFormNotice((FormBlocker.Element.NoticeElement) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ArcadeFormOptionPickerView arcadeFormOptionPickerView = (ArcadeFormOptionPickerView) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    gapComposer10.startReplaceGroup(1353041102);
                    List<FormBlocker.Element.OptionPickerElement.Option> list2 = arcadeFormOptionPickerView.element.options;
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        FormBlocker.Element.OptionPickerElement.Option option = list2.get(i8);
                        FormBlocker.Element.OptionPickerElement.Option.Selectability selectability = option.selectability;
                        if (selectability != null) {
                            FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable unselectable2 = selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable ? (FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable) selectability : null;
                            if (unselectable2 != null) {
                                unselectable = unselectable2.getValue();
                                boolean z2 = unselectable != null;
                                changed = gapComposer10.changed(function16) | gapComposer10.changedInstance(arcadeFormOptionPickerView) | gapComposer10.changedInstance(option);
                                rememberedValue = gapComposer10.rememberedValue();
                                if (!changed || rememberedValue == obj3) {
                                    rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(12, function16, arcadeFormOptionPickerView, option);
                                    gapComposer10.updateRememberedValue(rememberedValue);
                                }
                                ArcadeFormEmojiPickerKt.DisabledClickWrapper(z2, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1476544254, new FormRemoteImageKt$$ExternalSyntheticLambda0(20, arcadeFormOptionPickerView, option, function16), gapComposer10), gapComposer10, MLKEMEngine.KyberPolyBytes);
                            }
                        }
                        unselectable = null;
                        if (unselectable != null) {
                        }
                        changed = gapComposer10.changed(function16) | gapComposer10.changedInstance(arcadeFormOptionPickerView) | gapComposer10.changedInstance(option);
                        rememberedValue = gapComposer10.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(12, function16, arcadeFormOptionPickerView, option);
                        gapComposer10.updateRememberedValue(rememberedValue);
                        ArcadeFormEmojiPickerKt.DisabledClickWrapper(z2, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1476544254, new FormRemoteImageKt$$ExternalSyntheticLambda0(20, arcadeFormOptionPickerView, option, function16), gapComposer10), gapComposer10, MLKEMEngine.KyberPolyBytes);
                    }
                    gapComposer10.end(false);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement = (FormBlocker.Element.PaymentPlanScheduleElement) obj5;
                Function1 function17 = (Function1) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode4 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer11, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    Function0 function04 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(function04);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str6 = paymentPlanScheduleElement.header;
                    if (str6 == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m(paymentPlanScheduleElement, "Missing header in ");
                        return null;
                    }
                    ViewfinderDefaults.SectionHeader(str6, fillMaxWidth2, (String) null, (Function0) null, paymentPlanScheduleElement.body, gapComposer11, 48, 12);
                    if (paymentPlanScheduleElement.circle_progress_items.isEmpty()) {
                        z = false;
                        gapComposer11.startReplaceGroup(-1359770542);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(-1360244563);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        TimelineState rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer11, 1);
                        List<FormBlocker.Element.PaymentPlanScheduleElement.CircleProgressItem> list3 = paymentPlanScheduleElement.circle_progress_items;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (FormBlocker.Element.PaymentPlanScheduleElement.CircleProgressItem circleProgressItem : list3) {
                            TimelineItem.State state = TimelineItem.State.NotStarted;
                            String str7 = circleProgressItem.secondary_text;
                            if (str7 == null) {
                                str7 = "";
                            }
                            arrayList2.add(LazyListLayoutInfoKt.TimelineItem$default(state, str7, circleProgressItem.primary_text, null, null, null, 88));
                        }
                        LazyListLayoutInfoKt.Timeline(rememberTimelineState, Tags.toPersistentList(arrayList2), fillMaxWidth3, gapComposer11, MLKEMEngine.KyberPolyBytes, 0);
                        z = false;
                        gapComposer11.end(false);
                    }
                    String str8 = paymentPlanScheduleElement.source_text;
                    if (str8 == null) {
                        gapComposer11.startReplaceGroup(-1359725221);
                        gapComposer11.end(z);
                    } else {
                        gapComposer11.startReplaceGroup(-1359725220);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        BlockerAction blockerAction2 = paymentPlanScheduleElement.source_info_click_action;
                        if (blockerAction2 == null) {
                            gapComposer11.startReplaceGroup(1636537844);
                            gapComposer11.end(z);
                            function02 = null;
                        } else {
                            gapComposer11.startReplaceGroup(1636537845);
                            boolean changed4 = gapComposer11.changed(function17) | gapComposer11.changedInstance(blockerAction2);
                            Object rememberedValue6 = gapComposer11.rememberedValue();
                            if (changed4 || rememberedValue6 == obj3) {
                                rememberedValue6 = new GrantSheetKt$$ExternalSyntheticLambda11(function17, blockerAction2, i4);
                                gapComposer11.updateRememberedValue(rememberedValue6);
                            }
                            gapComposer11.end(false);
                            function02 = (Function0) rememberedValue6;
                        }
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(ComposableSingletons$ArcadeFormPaymentPlanScheduleKt.f424lambda$1607623876, Expect_jvmKt.rememberComposableLambda(-1983457347, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str8, 20), gapComposer11), fillMaxWidth4, function02, false, false, null, null, null, 0L, gapComposer11, 438, 4080);
                        gapComposer11.end(false);
                    }
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement = (FormBlocker.Element.PaymentPlanSummaryElement) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                boolean shouldExecute = gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2);
                Applier applier = gapComposer12.applier;
                if (shouldExecute) {
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer12, 0);
                    int hashCode5 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer12, fillMaxWidth5);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer12.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer12, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer12, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer12, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    String str9 = paymentPlanSummaryElement.header;
                    str9.getClass();
                    ViewfinderDefaults.SectionHeader(str9, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer12, 0, 30);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer12, 6);
                    int hashCode6 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer12, m300paddingVpY3zN4$default);
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer12, composeUiNode$Companion$SetModifier$13, gapComposer12, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer12, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                    ListUnorderedState rememberListUnorderedState = ListUnorderedKt.rememberListUnorderedState(gapComposer12);
                    gapComposer12.startReplaceGroup(951169182);
                    List<FormBlocker.Element.DetailRowElement> list4 = paymentPlanSummaryElement.items;
                    ArrayList arrayList3 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        ArcadeFormDetailRowKt.ArcadeFormDetailRow(list4.get(i9), rememberListUnorderedState, function18, gapComposer12, 0);
                        arrayList3.add(Unit.INSTANCE);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer12, false, true, true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ArcadeFormSectionHeaderElementKt.ArcadeFormSectionHeaderElement((FormBlocker.Element.SectionHeaderElement) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                FormBlocker.Element.TimelineCardListElement timelineCardListElement = (FormBlocker.Element.TimelineCardListElement) obj5;
                Function1 function19 = (Function1) obj4;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Object rememberedValue7 = gapComposer13.rememberedValue();
                    if (rememberedValue7 == obj3) {
                        rememberedValue7 = new SnapshotStateMap();
                        gapComposer13.updateRememberedValue(rememberedValue7);
                    }
                    SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) rememberedValue7;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer13.consume(staticProvidableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    long j3 = colors3.semantic.text.subtle;
                    Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer13.consume(staticProvidableCompositionLocal2);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth6, colors4.semantic.background.f1047app, ColorKt.RectangleShape);
                    boolean changedInstance3 = gapComposer13.changedInstance(timelineCardListElement) | gapComposer13.changed(j3);
                    Object rememberedValue8 = gapComposer13.rememberedValue();
                    if (changedInstance3 || rememberedValue8 == obj3) {
                        rememberedValue8 = new CaptureCheckFaceKt$$ExternalSyntheticLambda7(timelineCardListElement, snapshotStateMap2, j3, 6);
                        snapshotStateMap = snapshotStateMap2;
                        gapComposer13.updateRememberedValue(rememberedValue8);
                    } else {
                        snapshotStateMap = snapshotStateMap2;
                    }
                    Modifier drawBehind = ClipKt.drawBehind(m177backgroundbw27NRU, (Function1) rememberedValue8);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer13, 6);
                    int hashCode7 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer13, drawBehind);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    gapComposer13.startReplaceGroup(241208305);
                    int i10 = 0;
                    for (Object obj6 : timelineCardListElement.items) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        FormBlocker.Element.TimelineCardListElement.Item item = (FormBlocker.Element.TimelineCardListElement.Item) obj6;
                        boolean changed5 = gapComposer13.changed(i10);
                        Object rememberedValue9 = gapComposer13.rememberedValue();
                        if (changed5 || rememberedValue9 == obj3) {
                            rememberedValue9 = new TimelineKt$$ExternalSyntheticLambda11(snapshotStateMap, i10, 2);
                            gapComposer13.updateRememberedValue(rememberedValue9);
                        }
                        Modifier onPlaced = RulerKt.onPlaced(companion, (Function1) rememberedValue9);
                        if (item.status == FormBlocker.Element.TimelineCardListElement.Item.Status.COMPLETE) {
                            gapComposer13.startReplaceGroup(2142700305);
                            gapComposer13.end(false);
                            function03 = null;
                        } else {
                            gapComposer13.startReplaceGroup(2142775449);
                            BlockerAction blockerAction3 = item.action;
                            if (blockerAction3 == null) {
                                gapComposer13.startReplaceGroup(2142775448);
                                gapComposer13.end(false);
                                function03 = null;
                            } else {
                                gapComposer13.startReplaceGroup(2142775449);
                                boolean changed6 = gapComposer13.changed(function19) | gapComposer13.changedInstance(blockerAction3);
                                Object rememberedValue10 = gapComposer13.rememberedValue();
                                if (changed6 || rememberedValue10 == obj3) {
                                    rememberedValue10 = new GrantSheetKt$$ExternalSyntheticLambda11(function19, blockerAction3, 9);
                                    gapComposer13.updateRememberedValue(rememberedValue10);
                                }
                                function03 = (Function0) rememberedValue10;
                                gapComposer13.end(false);
                            }
                            gapComposer13.end(false);
                        }
                        ArcadeFormTimelineCardListElementKt.TimelineCardRow(item, function03, onPlaced, gapComposer13, 0);
                        i10 = i11;
                    }
                    gapComposer13.end(false);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AvatarElement.Badge badge = (AvatarElement.Badge) obj5;
                GenericBaseViewModel.AvatarViewModel avatarViewModel = (GenericBaseViewModel.AvatarViewModel) obj4;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    CameraFeedKt.AvatarBadge(null, badge, avatarViewModel.badgeImage, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                GenericBaseViewModel.IconButtonViewModel iconButtonViewModel = (GenericBaseViewModel.IconButtonViewModel) obj5;
                Modifier modifier = (Modifier) obj4;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ComposeUtilsKt.getThemedUrl(iconButtonViewModel.icon, gapComposer15), null, SizeKt.m285size3ABfNKs(modifier, iconButtonViewModel.size.value), null, null, null, gapComposer15, 48, 2040);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                LottieUtilsKt.TwoColumnRow((GenericComponentViewModel.TwoColumnCardViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ArcadeUtilKt.ToCellBodyText((String) obj5, (ArcadeTextElement.SemanticTextColor) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                return invoke$com$squareup$cash$genericelements$components$components$arcade$CellDefaultWidgetKt$$ExternalSyntheticLambda16(obj, obj2);
            case 26:
                ((Integer) obj2).getClass();
                ((PBRMaterial.PBRMaterialInstance) obj5).bindFloat3((MutableState) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$growtools$views$manager$GrowToolsManagerViewKt$$ExternalSyntheticLambda12(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$history$views$CancelPaymentView$$ExternalSyntheticLambda1(obj, obj2);
            default:
                PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) obj5;
                PaymentPasscodeDialogView paymentPasscodeDialogView = (PaymentPasscodeDialogView) obj4;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    boolean changedInstance4 = gapComposer16.changedInstance(paymentPasscodeDialogView);
                    Object rememberedValue11 = gapComposer16.rememberedValue();
                    if (changedInstance4 || rememberedValue11 == obj3) {
                        rememberedValue11 = new GpsConfigQueries$$ExternalSyntheticLambda2(paymentPasscodeDialogView, 13);
                        gapComposer16.updateRememberedValue(rememberedValue11);
                    }
                    ReportAbuseViewKt.PasscodeDialogContent(passcodeDialogViewModel, (Function1) rememberedValue11, null, gapComposer16, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.InstructionCardElement instructionCardElement, Function1 function1) {
        this.$r8$classId = 9;
        this.f$0 = instructionCardElement;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.LegalTextElement legalTextElement, Function1 function1) {
        this.$r8$classId = 10;
        this.f$0 = legalTextElement;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.ListUnorderedElement listUnorderedElement, ImmutableList immutableList) {
        this.$r8$classId = 12;
        this.f$0 = listUnorderedElement;
        this.f$1 = immutableList;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement, Function1 function1) {
        this.$r8$classId = 17;
        this.f$0 = paymentPlanScheduleElement;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement, Function1 function1) {
        this.$r8$classId = 18;
        this.f$0 = paymentPlanSummaryElement;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(FormBlocker.Element.TimelineCardListElement timelineCardListElement, Function1 function1) {
        this.$r8$classId = 20;
        this.f$0 = timelineCardListElement;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Function1 function1, FormBlocker.Element.MoneyElement moneyElement) {
        this.$r8$classId = 14;
        this.f$1 = function1;
        this.f$0 = moneyElement;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(ListOrdered listOrdered, ArrayList arrayList) {
        this.$r8$classId = 11;
        this.f$0 = listOrdered;
        this.f$1 = arrayList;
    }
}
