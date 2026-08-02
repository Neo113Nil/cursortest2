package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Category$CategoryListHeader$ToggleHeader;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.NotificationPageHeaderViewModel;
import com.squareup.cash.profile.views.notifications.CATEGORIES;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.profile.views.notifications.ProfileNotificationsUiMapperKt;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.personal.RatePlanSectionKt;
import com.squareup.cash.profile.views.trustedcontact.InvestingContactViewKt;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyUnavailableView;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxesPasswordViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ TaxesPasswordViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$shopping$views$CashAppPayIncentivePromptSheetViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, ShopErrorKt.f667lambda$453156434, gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$views$RestrictedItemWarningSheetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, ShopErrorKt.lambda$603932591, gapComposer, 1572912, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$ChatErrorDialogView$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ChatErrorDialogView.$r8$clinit;
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ChatExitPromptViewKt.f672lambda$2126454335, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$ChatExitPromptViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ChatExitPromptViewKt.lambda$1317894292, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$ChatExitPromptViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ChatExitPromptViewKt.f671lambda$1927203789, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ChatSurveyUnavailableView.$r8$clinit;
        ((Unit) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_survey_unavailable_title);
            String stringResource2 = Room.stringResource(gapComposer, R.string.support_chat_survey_unavailable_message);
            Function1 function1 = this.f$0;
            ModalKt.Modal((Modifier) null, stringResource, stringResource2, Expect_jvmKt.rememberComposableLambda(-1720960918, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(26, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1606045449, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(27, function1), gapComposer), (Function3) null, gapComposer, 27648, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ChatSurveyUnavailableView.$r8$clinit;
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ChatSurveyKt.f679lambda$80911553, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ChatSurveyUnavailableView.$r8$clinit;
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, ChatSurveyKt.lambda$1332052460, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$views$ScreenshotConfirmViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((Unit) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ModalKt.Modal((Modifier) null, ScreenshotReviewViewKt.lambda$877963016, ScreenshotReviewViewKt.lambda$1927832231, Expect_jvmKt.rememberComposableLambda(-719585965, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(29, this.f$0), gapComposer), (Function3) null, (Function3) null, gapComposer, 3504, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x09df, code lost:
    
        if (r3 == r2) goto L380;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Category category;
        NeverEqualPolicy neverEqualPolicy;
        int i = this.$r8$classId;
        int i2 = 23;
        int i3 = 24;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        float f = 1.0f;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(21, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, BadgeNameKt.f591lambda$219794344, gapComposer, 1573296, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda0(18, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue2, null, false, BadgeNameKt.f593lambda$302814757, gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda0(24, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue3, fillMaxWidth2, buttonProminence2, false, false, null, BadgeNameKt.f587lambda$1625547461, gapComposer3, 1573296, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                CategoryListViewModel categoryListViewModel = (CategoryListViewModel) obj;
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                categoryListViewModel.getClass();
                boolean z = categoryListViewModel instanceof CategoryListViewModel.Loading;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                if (z) {
                    GapComposer gapComposer4 = (GapComposer) composer4;
                    gapComposer4.startReplaceGroup(78869403);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer4, SpacerKt.m298padding3ABfNKs(companion2, 24.0f));
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                } else {
                    if (!(categoryListViewModel instanceof CategoryListViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer4, 833829142, false);
                    }
                    GapComposer gapComposer5 = (GapComposer) composer4;
                    gapComposer5.startReplaceGroup(79279936);
                    Applier applier = gapComposer5.applier;
                    CategoryListViewModel.Loaded loaded = (CategoryListViewModel.Loaded) categoryListViewModel;
                    Category category2 = loaded.category;
                    Category.CategoryType categoryType = category2.categoryType;
                    if (!(categoryType instanceof Category.CategoryType.CategoryList)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    Category.CategoryType.CategoryList categoryList = (Category.CategoryType.CategoryList) categoryType;
                    List list = ProfileNotificationsUiMapperKt.ORDERED_CATEGORY_TYPES;
                    HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(new Pair(CATEGORIES.STOCK_I_OWN, new ArrayList()), new Pair(CATEGORIES.STOCK_I_FOLLOW, new ArrayList()), new Pair(CATEGORIES.OTHER, new ArrayList()));
                    for (Category category3 : categoryList.children) {
                        category3.getClass();
                        Category.CategoryType categoryType2 = category3.categoryType;
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES});
                        boolean z2 = categoryType2 instanceof Category.CategoryType.ChannelList;
                        Category.CategoryType.ChannelList channelList = z2 ? (Category.CategoryType.ChannelList) categoryType2 : null;
                        if (CollectionsKt.contains(listOf, channelList != null ? channelList.notificationCategory : null)) {
                            List list2 = (List) hashMapOf.get(CATEGORIES.STOCK_I_OWN);
                            if (list2 != null) {
                                list2.add(category3);
                            }
                        } else {
                            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES});
                            Category.CategoryType.ChannelList channelList2 = z2 ? (Category.CategoryType.ChannelList) categoryType2 : null;
                            if (CollectionsKt.contains(listOf2, channelList2 != null ? channelList2.notificationCategory : null)) {
                                List list3 = (List) hashMapOf.get(CATEGORIES.STOCK_I_FOLLOW);
                                if (list3 != null) {
                                    list3.add(category3);
                                }
                            } else {
                                List list4 = (List) hashMapOf.get(CATEGORIES.OTHER);
                                if (list4 != null) {
                                    list4.add(category3);
                                }
                            }
                        }
                        f = 1.0f;
                    }
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, f);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier systemBarsPadding2 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, systemBarsPadding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    HashMap hashMap = hashMapOf;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String str = loaded.titleBarText;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed4 = gapComposer5.changed(function1);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy2) {
                        category = category2;
                        rememberedValue4 = new ProfileKt$$ExternalSyntheticLambda0(29, function1);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    } else {
                        category = category2;
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer5, 48, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion2, 1.0f), ImageKt.rememberScrollState(gapComposer5), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, verticalScroll$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    NotificationPageHeaderViewModel notificationPageHeaderViewModel = loaded.pageHeader;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    ChannelListViewKt.NotificationPageHeader(notificationPageHeaderViewModel, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 32.0f, 5), gapComposer5, 0);
                    Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader = categoryList.categoryListHeader;
                    if (category$CategoryListHeader$ToggleHeader != null) {
                        gapComposer5.startReplaceGroup(-584854166);
                        boolean changed5 = gapComposer5.changed(function1);
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        if (!changed5) {
                            neverEqualPolicy = neverEqualPolicy2;
                            break;
                        } else {
                            neverEqualPolicy = neverEqualPolicy2;
                        }
                        rememberedValue5 = new ProfileKt$$ExternalSyntheticLambda3(21, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                        ChannelListViewKt.CategoryListHeader((Function1) rememberedValue5, category$CategoryListHeader$ToggleHeader, category.title, null, gapComposer5, 0);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                        gapComposer5.end(false);
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        gapComposer5.startReplaceGroup(-584404418);
                        gapComposer5.end(false);
                    }
                    gapComposer5.startReplaceGroup(-573039441);
                    for (CATEGORIES categories : ProfileNotificationsUiMapperKt.ORDERED_CATEGORY_TYPES) {
                        HashMap hashMap2 = hashMap;
                        if (((List) hashMap2.get(categories)) == null || !(!r6.isEmpty())) {
                            gapComposer5.startReplaceGroup(-2087354941);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(-2087623060);
                            boolean changed6 = gapComposer5.changed(function1);
                            Object rememberedValue6 = gapComposer5.rememberedValue();
                            if (changed6 || rememberedValue6 == neverEqualPolicy) {
                                rememberedValue6 = new ProfileKt$$ExternalSyntheticLambda3(22, function1);
                                gapComposer5.updateRememberedValue(rememberedValue6);
                            }
                            Object obj4 = hashMap2.get(categories);
                            obj4.getClass();
                            ChannelListViewKt.CategorySection((Function1) rememberedValue6, categories, (List) obj4, gapComposer5, 0);
                            gapComposer5.end(false);
                        }
                        hashMap = hashMap2;
                    }
                    gapComposer5.end(false);
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj3).getClass();
                ((CategoryListViewModel.Loaded) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj2);
                boolean changed7 = gapComposer6.changed(function1);
                Object rememberedValue7 = gapComposer6.rememberedValue();
                if (changed7 || rememberedValue7 == neverEqualPolicy2) {
                    rememberedValue7 = new ProfileKt$$ExternalSyntheticLambda0(27, function1);
                    gapComposer6.updateRememberedValue(rememberedValue7);
                }
                Function0 function0 = (Function0) rememberedValue7;
                boolean changed8 = gapComposer6.changed(function1);
                Object rememberedValue8 = gapComposer6.rememberedValue();
                if (changed8 || rememberedValue8 == neverEqualPolicy2) {
                    rememberedValue8 = new ProfileKt$$ExternalSyntheticLambda0(28, function1);
                    gapComposer6.updateRememberedValue(rememberedValue8);
                }
                ChannelListViewKt.EnablePushDialog(function0, (Function0) rememberedValue8, gapComposer6, 0);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj3).getClass();
                ((ChannelListViewModel.Loaded) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj2);
                boolean changed9 = gapComposer7.changed(function1);
                Object rememberedValue9 = gapComposer7.rememberedValue();
                if (changed9 || rememberedValue9 == neverEqualPolicy2) {
                    rememberedValue9 = new PersonalInfoView$$ExternalSyntheticLambda0(3, function1);
                    gapComposer7.updateRememberedValue(rememberedValue9);
                }
                Function0 function02 = (Function0) rememberedValue9;
                boolean changed10 = gapComposer7.changed(function1);
                Object rememberedValue10 = gapComposer7.rememberedValue();
                if (changed10 || rememberedValue10 == neverEqualPolicy2) {
                    rememberedValue10 = new PersonalInfoView$$ExternalSyntheticLambda0(4, function1);
                    gapComposer7.updateRememberedValue(rememberedValue10);
                }
                ChannelListViewKt.EnablePushDialog(function02, (Function0) rememberedValue10, gapComposer7, 0);
                return Unit.INSTANCE;
            case 6:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer5;
                if (gapComposer8.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed11 = gapComposer8.changed(function1);
                    Object rememberedValue11 = gapComposer8.rememberedValue();
                    if (changed11 || rememberedValue11 == neverEqualPolicy2) {
                        rememberedValue11 = new PersonalInfoView$$ExternalSyntheticLambda0(16, function1);
                        gapComposer8.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue11, horizontalWeight, null, false, false, null, RatePlanSectionKt.lambda$1254838493, gapComposer8, 1572864, 60);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed12 = gapComposer8.changed(function1);
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (changed12 || rememberedValue12 == neverEqualPolicy2) {
                        rememberedValue12 = new PersonalInfoView$$ExternalSyntheticLambda0(17, function1);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue12, horizontalWeight2, null, false, false, null, RatePlanSectionKt.f614lambda$452439020, gapComposer8, 1572864, 60);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer6;
                if (gapComposer9.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed13 = gapComposer9.changed(function1);
                    Object rememberedValue13 = gapComposer9.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy2) {
                        rememberedValue13 = new PersonalInfoView$$ExternalSyntheticLambda0(18, function1);
                        gapComposer9.updateRememberedValue(rememberedValue13);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue13, null, false, RatePlanSectionKt.lambda$714663957, gapComposer9, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer7;
                if (gapComposer10.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean changed14 = gapComposer10.changed(function1);
                    Object rememberedValue14 = gapComposer10.rememberedValue();
                    if (changed14 || rememberedValue14 == neverEqualPolicy2) {
                        rememberedValue14 = new PersonalInfoView$$ExternalSyntheticLambda0(19, function1);
                        gapComposer10.updateRememberedValue(rememberedValue14);
                    }
                    modalButtonScope3.SecondaryModalButton((Function0) rememberedValue14, null, false, RatePlanSectionKt.lambda$1917801282, gapComposer10, ((intValue6 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer8;
                if (gapComposer11.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed15 = gapComposer11.changed(function1);
                    Object rememberedValue15 = gapComposer11.rememberedValue();
                    if (changed15 || rememberedValue15 == neverEqualPolicy2) {
                        rememberedValue15 = new CashtagQrScanView$$ExternalSyntheticLambda0(11, function1);
                        gapComposer11.updateRememberedValue(rememberedValue15);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue15, fillMaxWidth3, null, false, false, null, InvestingContactViewKt.f634lambda$2063634026, gapComposer11, 1572912, 60);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed16 = gapComposer11.changed(function1);
                    Object rememberedValue16 = gapComposer11.rememberedValue();
                    if (changed16 || rememberedValue16 == neverEqualPolicy2) {
                        rememberedValue16 = new CashtagQrScanView$$ExternalSyntheticLambda0(12, function1);
                        gapComposer11.updateRememberedValue(rememberedValue16);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue16, fillMaxWidth4, null, true, false, null, InvestingContactViewKt.f633lambda$1628280577, gapComposer11, 1575984, 52);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer9;
                if (gapComposer12.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer12, R.string.promotions_invites_title);
                    boolean changed17 = gapComposer12.changed(function1);
                    Object rememberedValue17 = gapComposer12.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy2) {
                        rememberedValue17 = new CashtagQrScanView$$ExternalSyntheticLambda0(13, function1);
                        gapComposer12.updateRememberedValue(rememberedValue17);
                    }
                    PromotionsTitleBarKt.PromotionsTitleBar(0, gapComposer12, null, stringResource, (Function0) rememberedValue17);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer10;
                if (gapComposer13.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth5, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed18 = gapComposer13.changed(function1);
                    Object rememberedValue18 = gapComposer13.rememberedValue();
                    if (changed18 || rememberedValue18 == neverEqualPolicy2) {
                        rememberedValue18 = new CashtagQrScanView$$ExternalSyntheticLambda0(27, function1);
                        gapComposer13.updateRememberedValue(rememberedValue18);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue18, m300paddingVpY3zN4$default, buttonProminence3, false, false, null, CameraXPreviewKt.lambda$1386461553, gapComposer13, 1573248, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer11).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer11;
                if (gapComposer14.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    Icons icons = Icons.NavigationHelp;
                    String stringResource2 = Room.stringResource(gapComposer14, R.string.blockers_help);
                    boolean changed19 = gapComposer14.changed(function1);
                    Object rememberedValue19 = gapComposer14.rememberedValue();
                    if (changed19 || rememberedValue19 == neverEqualPolicy2) {
                        rememberedValue19 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(23, function1);
                        gapComposer14.updateRememberedValue(rememberedValue19);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource2, (Function0) rememberedValue19, null, null, null, null, null, null, false, gapComposer14, (intValue10 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer12).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer12;
                if (gapComposer15.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    Icons icons2 = Icons.NavigationHelp;
                    int i4 = intValue11;
                    String stringResource3 = Room.stringResource(gapComposer15, R.string.blockers_help);
                    boolean changed20 = gapComposer15.changed(function1);
                    Object rememberedValue20 = gapComposer15.rememberedValue();
                    if (changed20 || rememberedValue20 == neverEqualPolicy2) {
                        rememberedValue20 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(24, function1);
                        gapComposer15.updateRememberedValue(rememberedValue20);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource3, (Function0) rememberedValue20, null, null, null, null, null, null, false, gapComposer15, (i4 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer13).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer13;
                if (gapComposer16.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    boolean changed21 = gapComposer16.changed(function1);
                    Object rememberedValue21 = gapComposer16.rememberedValue();
                    if (changed21 || rememberedValue21 == neverEqualPolicy2) {
                        rememberedValue21 = new ScoreHomeKt$$ExternalSyntheticLambda0(23, function1);
                        gapComposer16.updateRememberedValue(rememberedValue21);
                    }
                    modalButtonScope4.PrimaryModalButton((Function0) rememberedValue21, null, false, ErrorDialogKt.f663lambda$260209585, gapComposer16, ((intValue12 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer14;
                if (gapComposer17.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ButtonProminence buttonProminence4 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed22 = gapComposer17.changed(function1);
                    Object rememberedValue22 = gapComposer17.rememberedValue();
                    if (changed22 || rememberedValue22 == neverEqualPolicy2) {
                        rememberedValue22 = new ScoreHomeKt$$ExternalSyntheticLambda0(24, function1);
                        gapComposer17.updateRememberedValue(rememberedValue22);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue22, fillMaxWidth6, buttonProminence4, false, false, null, ErrorDialogKt.lambda$646275853, gapComposer17, 1573296, 56);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer15).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer15;
                if (gapComposer18.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    boolean changed23 = gapComposer18.changed(function1);
                    Object rememberedValue23 = gapComposer18.rememberedValue();
                    if (changed23 || rememberedValue23 == neverEqualPolicy2) {
                        rememberedValue23 = new BrandsSearchView$$ExternalSyntheticLambda6(2, function1);
                        gapComposer18.updateRememberedValue(rememberedValue23);
                    }
                    modalButtonScope5.SecondaryModalButton((Function0) rememberedValue23, null, false, SingleUsePaymentAddCardSheetKt.lambda$1296955179, gapComposer18, ((intValue14 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer16;
                if (gapComposer19.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Modifier fillMaxWidth7 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed24 = gapComposer19.changed(function1);
                    Object rememberedValue24 = gapComposer19.rememberedValue();
                    if (changed24 || rememberedValue24 == neverEqualPolicy2) {
                        rememberedValue24 = new BrandsSearchView$$ExternalSyntheticLambda6(4, function1);
                        gapComposer19.updateRememberedValue(rememberedValue24);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue24, fillMaxWidth7, null, false, false, null, SingleUsePaymentAddCardSheetKt.lambda$927144684, gapComposer19, 1572912, 60);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer17;
                if (gapComposer20.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Modifier fillMaxWidth8 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed25 = gapComposer20.changed(function1);
                    Object rememberedValue25 = gapComposer20.rememberedValue();
                    if (changed25 || rememberedValue25 == neverEqualPolicy2) {
                        rememberedValue25 = new BrandsSearchView$$ExternalSyntheticLambda6(5, function1);
                        gapComposer20.updateRememberedValue(rememberedValue25);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue25, fillMaxWidth8, null, false, false, null, SingleUsePaymentAddCardSheetKt.f664lambda$1703605454, gapComposer20, 1572912, 60);
                    Modifier fillMaxWidth9 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed26 = gapComposer20.changed(function1);
                    Object rememberedValue26 = gapComposer20.rememberedValue();
                    if (changed26 || rememberedValue26 == neverEqualPolicy2) {
                        rememberedValue26 = new BrandsSearchView$$ExternalSyntheticLambda6(6, function1);
                        gapComposer20.updateRememberedValue(rememberedValue26);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue26, fillMaxWidth9, null, true, false, null, SingleUsePaymentAddCardSheetKt.f665lambda$1852398181, gapComposer20, 1575984, 52);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$shopping$views$CashAppPayIncentivePromptSheetViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$shopping$views$RestrictedItemWarningSheetViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$support$chat$views$ChatErrorDialogView$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 22:
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((Function0) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer18;
                if (gapComposer21.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, ChatExitPromptViewKt.lambda$1098965108, ChatExitPromptViewKt.f673lambda$2146132973, Expect_jvmKt.rememberComposableLambda(-498583873, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i2, function1), gapComposer21), Expect_jvmKt.rememberComposableLambda(551285342, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i3, function1), gapComposer21), (Function3) null, gapComposer21, 28080, 33);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$support$chat$views$ChatExitPromptViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$support$chat$views$ChatExitPromptViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$support$chat$views$survey$ChatSurveyUnavailableView$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$support$views$ScreenshotConfirmViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer19).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer19;
                if (gapComposer22.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changed27 = gapComposer22.changed(function1);
                    Object rememberedValue27 = gapComposer22.rememberedValue();
                    if (changed27 || rememberedValue27 == neverEqualPolicy2) {
                        rememberedValue27 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer22.updateRememberedValue(rememberedValue27);
                    }
                    modalButtonScope6.PrimaryModalButton((Function0) rememberedValue27, null, false, ScreenshotReviewViewKt.lambda$1096892200, gapComposer22, ((intValue18 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
