package com.squareup.cash.sharesheet;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.glance.session.TimerScopeKt;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionCallbacks;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.Session;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.securityhub.views.BookletViewKt;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.securityhub.views.SecurityHubViewKt;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShareSheetPresenter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ShareSheetPresenter$$ExternalSyntheticLambda0(ShareSheetPresenter shareSheetPresenter) {
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        r13 = 0;
        int i2 = 0;
        switch (i) {
            case 0:
                ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) obj;
                ShareSheetPresenter.StateUpdate stateUpdate = (ShareSheetPresenter.StateUpdate) obj2;
                shareSheetViewModel.getClass();
                List list = shareSheetViewModel.sharingOptions;
                stateUpdate.getClass();
                if (stateUpdate instanceof ShareSheetPresenter.StateUpdate.DataUpdated) {
                    ShareSheetPresenter.StateUpdate.DataUpdated dataUpdated = (ShareSheetPresenter.StateUpdate.DataUpdated) stateUpdate;
                    List<ShareTarget> list2 = dataUpdated.shareTargets;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (ShareTarget shareTarget : list2) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (Intrinsics.areEqual(((ShareSheetViewModel.SharingOption) obj3).title, shareTarget.getTitle())) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        ShareSheetViewModel.SharingOption sharingOption = (ShareSheetViewModel.SharingOption) obj3;
                        arrayList.add(new ShareSheetViewModel.SharingOption(shareTarget.getTitle(), ShareSheetViewKt.toIcon(shareTarget.getId()), sharingOption != null ? sharingOption.loading : false, shareTarget));
                    }
                    return new ShareSheetViewModel(dataUpdated.headerText, arrayList);
                }
                if (!(stateUpdate instanceof ShareSheetPresenter.StateUpdate.SharingCompleted)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShareTargetsManager$ShareResult shareTargetsManager$ShareResult = ((ShareSheetPresenter.StateUpdate.SharingCompleted) stateUpdate).result;
                String str = shareSheetViewModel.headerText;
                List<ShareSheetViewModel.SharingOption> list3 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (ShareSheetViewModel.SharingOption sharingOption2 : list3) {
                    if (Intrinsics.areEqual(sharingOption2.title, shareTargetsManager$ShareResult.getTitle())) {
                        sharingOption2 = ShareSheetViewModel.SharingOption.copy$default(sharingOption2, shareTargetsManager$ShareResult instanceof ShareTargetsManager$ShareResult.Loading);
                    }
                    arrayList2.add(sharingOption2);
                }
                ShareTargetsManager$ShareResult.Failure failure = shareTargetsManager$ShareResult instanceof ShareTargetsManager$ShareResult.Failure ? (ShareTargetsManager$ShareResult.Failure) shareTargetsManager$ShareResult : null;
                String str2 = failure != null ? failure.failureMessage : null;
                boolean z = shareTargetsManager$ShareResult instanceof ShareTargetsManager$ShareResult.Success;
                ShareTargetsManager$ShareResult.Success success = z ? (ShareTargetsManager$ShareResult.Success) shareTargetsManager$ShareResult : null;
                return new ShareSheetViewModel(str, str2, success != null ? success.successMessage : null, arrayList2, (z ? (ShareTargetsManager$ShareResult.Success) shareTargetsManager$ShareResult : null) != null);
            case 1:
                ((Integer) obj2).getClass();
                ButtonGroupKt.SavingsRouteInterstitial((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(-1069343068);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                gapComposer.end(false);
                return textStyle;
            case 3:
                ((Integer) obj2).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj);
                gapComposer2.startReplaceGroup(-1690395923);
                TextStyle textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer2.end(false);
                return textStyle2;
            case 4:
                ((Integer) obj2).getClass();
                ViewPropertyAnimatorListenerAdapter.ScoreAppletLemon((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BookletViewModel bookletViewModel = BookletViewKt.PREVIEW_MODEL;
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(21);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    BookletViewKt.BookletView(bookletViewModel, (Function1) rememberedValue, null, gapComposer3, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    BookletViewModel bookletViewModel2 = BookletViewKt.COMMON_SCAMS_PREVIEW_MODEL;
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CalloutKt$$ExternalSyntheticLambda1(19);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    BookletViewKt.BookletView(bookletViewModel2, (Function1) rememberedValue2, null, gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    BookletViewModel bookletViewModel3 = BookletViewKt.SPOT_SCAMS_PREVIEW_MODEL;
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CalloutKt$$ExternalSyntheticLambda1(22);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    BookletViewKt.BookletView(bookletViewModel3, (Function1) rememberedValue3, null, gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    BookletViewModel bookletViewModel4 = BookletViewKt.PREVENT_FRAUD_PREVIEW_MODEL;
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CalloutKt$$ExternalSyntheticLambda1(20);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    BookletViewKt.BookletView(bookletViewModel4, (Function1) rememberedValue4, null, gapComposer6, 48);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    BookletViewModel bookletViewModel5 = BookletViewKt.SECURITY_FEATURES_PREVIEW_MODEL;
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CalloutKt$$ExternalSyntheticLambda1(18);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    BookletViewKt.BookletView(bookletViewModel5, (Function1) rememberedValue5, null, gapComposer7, 48);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    RecoveryGuideViewModel recoveryGuideViewModel = RecoveryGuideViewKt.SCAMMED_PREVIEW_MODEL;
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CalloutKt$$ExternalSyntheticLambda1(23);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    RecoveryGuideViewKt.RecoveryGuideView(recoveryGuideViewModel, (Function1) rememberedValue6, null, gapComposer8, 48);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    RecoveryGuideViewModel recoveryGuideViewModel2 = RecoveryGuideViewKt.HACKED_PREVIEW_MODEL;
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CalloutKt$$ExternalSyntheticLambda1(24);
                        gapComposer9.updateRememberedValue(rememberedValue7);
                    }
                    RecoveryGuideViewKt.RecoveryGuideView(recoveryGuideViewModel2, (Function1) rememberedValue7, null, gapComposer9, 48);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    SecurityHubUiModel securityHubUiModel = new SecurityHubUiModel(SecurityHubViewKt.PREVIEW_PROTECTIONS);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new CalloutKt$$ExternalSyntheticLambda1(25);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    SecurityHubViewKt.SecurityHubView(securityHubUiModel, (Function1) rememberedValue8, null, gapComposer10, 48);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Session session = (Session) obj2;
                ((TransactionCallbacks) obj).getClass();
                session.getClass();
                String str3 = session.target_account_token;
                if (str3 == null) {
                    str3 = session.account_token;
                }
                return Session.copy$default(session, null, str3, null, null, null, false, 121);
            case 14:
                RealSheetState realSheetState = (RealSheetState) obj2;
                ((SaveableHolder) obj).getClass();
                realSheetState.getClass();
                return (SheetPosition) realSheetState.draggableState.currentValue$delegate.getValue();
            case 15:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors.semantic.icon.danger, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer11, 6, 28);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    Colors colors2 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors2.component.button.destructive.prominent.background.f151default, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer12, 6, 28);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer13.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    long j = colors3.semantic.background.brand;
                    Icons icons = Icons.LogoUsd32;
                    Colors colors4 = (Colors) gapComposer13.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize3, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, colors4.semantic.icon.inverse, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer13, 3126, 0, 2000);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.shopping_settings_autofill_toggle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Location24, (String) null, (Modifier) null, 0L, gapComposer15, 54, 12);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Location24, (String) null, (Modifier) null, 0L, gapComposer16, 54, 12);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.shopping_settings_autofill_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ShopErrorKt.CashAppPayInfoToast(null, new PaykitInfoToastViewModel(0, "Get your 10% off with Cash App Pay", "Choose Cash App Pay as your payment method to save."), gapComposer18, 0, 1);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors5 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer19, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer19.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer19, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer19, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer19, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    RestrictedItemWarningSheetViewModel restrictedItemWarningSheetViewModel = new RestrictedItemWarningSheetViewModel("Air Jordan 1: $225.00");
                    Object rememberedValue9 = gapComposer19.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new RealSheetState$$ExternalSyntheticLambda0(26);
                        gapComposer19.updateRememberedValue(rememberedValue9);
                    }
                    ShopErrorKt.WarningSheetContent(restrictedItemWarningSheetViewModel, (Function1) rememberedValue9, gapComposer19, 48);
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer18;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer20, companion);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                RealPendingMessagesStore.PendingRequest pendingRequest = (RealPendingMessagesStore.PendingRequest) obj;
                RealPendingMessagesStore.PendingRequest pendingRequest2 = (RealPendingMessagesStore.PendingRequest) obj2;
                TimerScopeKt timerScopeKt = pendingRequest.message.status;
                MessageStatus$Recorded messageStatus$Recorded = MessageStatus$Recorded.INSTANCE;
                if (timerScopeKt.equals(messageStatus$Recorded) && !pendingRequest2.message.status.equals(messageStatus$Recorded)) {
                    i2 = -1;
                } else if (!pendingRequest.message.status.equals(messageStatus$Recorded) && pendingRequest2.message.status.equals(messageStatus$Recorded)) {
                    i2 = 1;
                }
                return Integer.valueOf(i2);
            case 26:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors6 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer21, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer21, SizeKt.m285size3ABfNKs(companion, 60.0f));
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer20;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer22, null);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer21;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, ChatExitPromptViewKt.lambda$1622549188, gapComposer23, 3072, 7);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zzpc.PlaceholderText((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShareSheetPresenter$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
    }

    public /* synthetic */ ShareSheetPresenter$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
