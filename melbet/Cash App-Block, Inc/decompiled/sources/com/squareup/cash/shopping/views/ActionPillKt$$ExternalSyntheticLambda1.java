package com.squareup.cash.shopping.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.fragment.app.FragmentContainerView;
import androidx.glance.ImageKt;
import androidx.glance.appwidget.protobuf.TextFormatEscaper;
import androidx.glance.appwidget.protobuf.Utf8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewModel;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.viewmodels.CashAppPayIncentiveSheetViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeBalanceWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinWelcomeWidgetViewModel;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatErrorViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatFailedDeliveryViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$3$2;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda52;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.views.input.InputTextFieldKt$InputTextField$1;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.survey.ChatSurveyUnavailableView;
import com.squareup.cash.support.chat.views.transcript.DisclaimerViewKt;
import com.squareup.cash.support.chat.views.transcript.FileAttachmentView;
import com.squareup.cash.support.chat.views.transcript.TimestampDividerView;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyView;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import com.squareup.cash.support.chat.views.transcript.message.StatusTimestampView;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActionComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActivityComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageFileComposeView;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.StableHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class ActionPillKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ActionPillKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        FormattedResource formattedResource;
        TextStyle textStyle;
        long j;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 19;
        int i3 = 27;
        int i4 = 25;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 2;
        int i6 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ShopErrorKt.ActionPill((Function0) obj4, (Pair) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                SingleUsePaymentAddCardSheetKt.AddCardContent((SingleUsePaymentAddCardViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                FragmentContainerView.Api20Impl.CreditLimitExceededContent((CheckoutScreenType.CreditLimitExceededWarning) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ImageKt.MinimumSpendRestrictionContent((CheckoutScreenType.MinimumSpendRestrictedWarning) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = (SquareLoyaltyDetailsView) obj4;
                Image image = (Image) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    squareLoyaltyDetailsView.AvatarBadge(new StableHolder(image), null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                CashAppPayIncentiveSheetViewModel cashAppPayIncentiveSheetViewModel = (CashAppPayIncentiveSheetViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier m177backgroundbw27NRU = androidx.compose.foundation.ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).header, (TextLineBalancing) null, cashAppPayIncentiveSheetViewModel.title, (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer2), companion, 4.0f, gapComposer2);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, cashAppPayIncentiveSheetViewModel.message, (Map) null, (Function1) null, false);
                    gapComposer2.end(true);
                    Strings.getSizes(gapComposer2).getClass();
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1117567689, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(19, function1), gapComposer2), gapComposer2, 24576, 15);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                RestrictedItemWarningSheetViewModel restrictedItemWarningSheetViewModel = (RestrictedItemWarningSheetViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i7 = RestrictedItemWarningSheetView.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ShopErrorKt.WarningSheetContent(restrictedItemWarningSheetViewModel, function12, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ShoppingWebContainerViewKt.PaykitInfoToast((ShoppingViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                TextFormatEscaper.StablecoinBalanceWidget((StablecoinHomeBalanceWidgetViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                ((Function1) obj4).invoke(new StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked(((StablecoinHomeDisclosuresWidgetViewModel) obj3).url));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                Utf8.SafeProcessor.StablecoinWelcomeWidget((StablecoinWelcomeWidgetViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ChatErrorViewModel chatErrorViewModel = (ChatErrorViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i8 = ChatErrorDialogView.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed = gapComposer4.changed(function13);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(i6, function13);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer4.changed(function13);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(i5, function13);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    ArcadeModal2Kt.Modal(null, chatErrorViewModel, function0, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-214421038, new TabToolbarsKt$$ExternalSyntheticLambda3(4, chatErrorViewModel, function13), gapComposer4), gapComposer4, 1572864, 49);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Function1 function14 = (Function1) obj4;
                ChatFailedDeliveryViewModel chatFailedDeliveryViewModel = (ChatFailedDeliveryViewModel) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i9 = ChatFailedDeliverySheetView.$r8$clinit;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean changed3 = gapComposer5.changed(function14);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(8, function14);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-600446464, new ChatFailedDeliverySheetView$$ExternalSyntheticLambda3(chatFailedDeliveryViewModel, function14, r2 ? 1 : 0), gapComposer5), gapComposer5, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((ChatInputView$Content$1$3$2) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 14:
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                ChatView chatView = (ChatView) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1876051895, new ChatView$$ExternalSyntheticLambda52(chatView, r2 ? 1 : 0), gapComposer6), gapComposer6, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((InputTextFieldKt$InputTextField$1) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 16:
                Function1 function15 = (Function1) obj4;
                ChatSurveyViewModel chatSurveyViewModel = (ChatSurveyViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = androidx.compose.foundation.ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(m177backgroundbw27NRU2, Arrangement$End$1.current(gapComposer7).systemBars);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode3 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer7, windowInsetsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed4 = gapComposer7.changed(function15);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(14, function15);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer7, 54, 108);
                    if (Intrinsics.areEqual(chatSurveyViewModel, ChatSurveyViewModel.Loading.INSTANCE)) {
                        gapComposer7.startReplaceGroup(253253944);
                        ChatSurveyKt.LoadingSurvey(gapComposer7, 0);
                        gapComposer7.end(false);
                    } else if (chatSurveyViewModel instanceof ChatSurveyViewModel.Loaded) {
                        gapComposer7.startReplaceGroup(253255141);
                        ChatSurveyKt.Satisfaction((ChatSurveyViewModel.Loaded) chatSurveyViewModel, function15, gapComposer7, 0);
                        gapComposer7.end(false);
                    } else {
                        if (!Intrinsics.areEqual(chatSurveyViewModel, ChatSurveyViewModel.Complete.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 253252987, false);
                        }
                        gapComposer7.startReplaceGroup(253256699);
                        ChatSurveyKt.Completed(function15, gapComposer7, 0);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Unit unit = (Unit) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i10 = ChatSurveyUnavailableView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean changed5 = gapComposer8.changed(function16);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(16, function16);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    boolean changed6 = gapComposer8.changed(function16);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(17, function16);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    ArcadeModal2Kt.Modal(null, unit, function02, (Function0) rememberedValue6, false, false, Expect_jvmKt.rememberComposableLambda(1699056654, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i4, function16), gapComposer8), gapComposer8, 1572864, 49);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ChatAttachmentViewModel.FileAttachmentViewModel fileAttachmentViewModel = (ChatAttachmentViewModel.FileAttachmentViewModel) obj4;
                FileAttachmentView fileAttachmentView = (FileAttachmentView) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean changedInstance = gapComposer9.changedInstance(fileAttachmentView);
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new BottomSheet$$ExternalSyntheticLambda2(fileAttachmentView, i3);
                        gapComposer9.updateRememberedValue(rememberedValue7);
                    }
                    DisclaimerViewKt.ArcadeFileAttachment(fileAttachmentViewModel, (Function0) rememberedValue7, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                DisclaimerViewKt.ArcadeFileAttachment((ChatAttachmentViewModel.FileAttachmentViewModel) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                AndroidStringManager androidStringManager = ((TimestampDividerView) obj4).stringManager;
                ChatContentViewModel.TimestampDividerViewModel timestampDividerViewModel = (ChatContentViewModel.TimestampDividerViewModel) obj3;
                String str = timestampDividerViewModel.date;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str2 = timestampDividerViewModel.time;
                    boolean z = timestampDividerViewModel.chatUiUpliftEnabled;
                    str.getClass();
                    str2.getClass();
                    androidStringManager.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.support_chat_timestamp_date_time_format_plain)).format(new Object[]{str, str2});
                    format2.getClass();
                    int ordinal = timestampDividerViewModel.styling.ordinal();
                    if (ordinal == 0) {
                        f = z ? 28.0f : 16.0f;
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        f = RecyclerView.DECELERATION_RATE;
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, f, 16.0f, RecyclerView.DECELERATION_RATE, 8), 1.0f);
                    boolean changed7 = gapComposer10.changed(format2);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    Object obj5 = rememberedValue8;
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        RealSandboxer$$ExternalSyntheticLambda1 realSandboxer$$ExternalSyntheticLambda1 = new RealSandboxer$$ExternalSyntheticLambda1(format2, i2);
                        gapComposer10.updateRememberedValue(realSandboxer$$ExternalSyntheticLambda1);
                        obj5 = realSandboxer$$ExternalSyntheticLambda1;
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth, (Function1) obj5);
                    if (z) {
                        str.getClass();
                        formattedResource = new FormattedResource(R.string.support_chat_timestamp_date_time_format_plain, new Object[]{str, str2});
                    } else {
                        str.getClass();
                        formattedResource = new FormattedResource(R.string.support_chat_timestamp_date_time_format, new Object[]{str, str2});
                    }
                    androidStringManager.getClass();
                    String string2 = Countries.getString(androidStringManager.resources, formattedResource);
                    if (z) {
                        gapComposer10.startReplaceGroup(448405019);
                        textStyle = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(448406586);
                        textStyle = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        gapComposer10.end(false);
                    }
                    TextStyle textStyle2 = textStyle;
                    if (z) {
                        gapComposer10.startReplaceGroup(448409820);
                        Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j = colors2.semantic.text.placeholder;
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(448411737);
                        Colors colors3 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j = colors3.semantic.text.disabled;
                        gapComposer10.end(false);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(string2, null, clearAndSetSemantics, textStyle2, j, null, null, null, 0, 0, 3, gapComposer10, 48, 992);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                BodyViewModel$ActionBodyViewModel bodyViewModel$ActionBodyViewModel = (BodyViewModel$ActionBodyViewModel) obj4;
                ActionBodyView actionBodyView = (ActionBodyView) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                int i11 = ActionBodyView.$r8$clinit;
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    String str3 = bodyViewModel$ActionBodyViewModel.title;
                    String str4 = bodyViewModel$ActionBodyViewModel.subtitle;
                    boolean changedInstance2 = gapComposer11.changedInstance(actionBodyView) | gapComposer11.changedInstance(bodyViewModel$ActionBodyViewModel);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new ShareSheetViewKt$$ExternalSyntheticLambda5(i3, actionBodyView, bodyViewModel$ActionBodyViewModel);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    ActionBodyViewKt.ActionBody(str3, str4, (Function0) rememberedValue9, gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.EnhancedSuggestedReplies((ArrayList) obj4, (ChatView$$ExternalSyntheticLambda6) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.ImagePlaceholder((ImagePlaceholderView.State) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                int i12 = StatusTimestampView.$r8$clinit;
                ((StatusTimestampView) obj4).StatusTimestampContent((ChatContentViewModel.StatusTimestampViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(65));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                MessageFileKt.ActivityLoadedContent((ActivityItemViewModel) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                MutableState mutableState = (MutableState) obj4;
                BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(androidx.compose.foundation.ImageKt.m177backgroundbw27NRU(SizeKt.m292widthInVpY3zN4$default(companion, 96.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer12).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Object rememberedValue10 = gapComposer12.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new OverlayKt$$ExternalSyntheticLambda1(i4, mutableState);
                        gapComposer12.updateRememberedValue(rememberedValue10);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(androidx.compose.foundation.ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue10, 15), 16.0f, 12.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer12, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    String str5 = bodyViewModel$TextBodyViewModel.text;
                    long j2 = Strings.getColors(gapComposer12).semantic.text.standard;
                    TextStyle textStyle3 = Strings.getTypography(gapComposer12).bodyMedium;
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center);
                    Object rememberedValue11 = gapComposer12.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new ChatSurveyKt$$ExternalSyntheticLambda11(20);
                        gapComposer12.updateRememberedValue(rememberedValue11);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, j2, (Composer) gapComposer12, SemanticsModifierKt.clearAndSetSemantics(align, (Function1) rememberedValue11), textStyle3, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) obj4;
                MessageActionComposeView messageActionComposeView = (MessageActionComposeView) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                int i13 = MessageActionComposeView.$r8$clinit;
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    MessageFileKt.MessageAction(messageViewModel, messageActionComposeView.onActionClick, null, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ChatContentViewModel.MessageViewModel messageViewModel2 = (ChatContentViewModel.MessageViewModel) obj4;
                MessageActivityComposeView messageActivityComposeView = (MessageActivityComposeView) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    MessageFileKt.MessageActivity(messageViewModel2, messageActivityComposeView.activityItemLoader, messageActivityComposeView.imageLoader, messageActivityComposeView.onActivityClick, null, messageActivityComposeView.onResendMessage, messageActivityComposeView.onDeleteMessage, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ChatContentViewModel.MessageViewModel messageViewModel3 = (ChatContentViewModel.MessageViewModel) obj4;
                MessageFileComposeView messageFileComposeView = (MessageFileComposeView) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                int i14 = MessageFileComposeView.$r8$clinit;
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    MessageFileKt.MessageFile(messageViewModel3, null, messageFileComposeView.onResendMessage, messageFileComposeView.onDeleteMessage, gapComposer15, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ActionPillKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ActionPillKt$$ExternalSyntheticLambda1(Object obj, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = function0;
    }
}
