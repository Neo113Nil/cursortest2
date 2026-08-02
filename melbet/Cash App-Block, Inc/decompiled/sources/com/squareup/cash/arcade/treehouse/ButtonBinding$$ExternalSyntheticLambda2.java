package com.squareup.cash.arcade.treehouse;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.arcade.values.BooleanState;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda50;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ToastBinding;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;

/* loaded from: classes5.dex */
public final /* synthetic */ class ButtonBinding$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ButtonBinding$$ExternalSyntheticLambda2(AfterpayAppletTileViewModel.Installed.V3Installed v3Installed, FamilyAppletTile familyAppletTile) {
        this.$r8$classId = 2;
        this.f$0 = v3Installed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.graphics.painter.Painter] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Icons icons;
        String str;
        int i = this.$r8$classId;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = ButtonBinding.$r8$clinit;
                ((ButtonBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ItemsGroupRow((ReceiptSection.ItemsGroup) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                AfterpayAppletTileViewModel.Installed.V3Installed v3Installed = (AfterpayAppletTileViewModel.Installed.V3Installed) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Icon icon = v3Installed.iconAvatar.localArcadeIcon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    Icon icon2 = v3Installed.iconAvatar.localArcadeIcon;
                    r5 = icon2 != null ? icon2.arcade_id : null;
                    zzd zzdVar = Icons.Companion;
                    if (Intrinsics.areEqual(r5, "tRJa1k") || Intrinsics.areEqual(r5, "ODO3AU")) {
                        gapComposer.startReplaceGroup(-1428897402);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.semantic.background.warning;
                        if (icons == null) {
                            icons = Icons.Alert24;
                        }
                        Icons icons2 = icons;
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons2, colors2.semantic.icon.inverse, 64.0f, gapComposer, 3072, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1428631267);
                        if (icons == null) {
                            icons = Icons.LogoAfterpay24;
                        }
                        Icons icons3 = icons;
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons3, colors3.semantic.background.brand, 64.0f, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 3:
                AfterpayAppletHomePresenter afterpayAppletHomePresenter = (AfterpayAppletHomePresenter) obj3;
                String str2 = (String) obj2;
                ((AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion) obj).getClass();
                AfterpayAppletHomeViewModel homeState = afterpayAppletHomePresenter.getHomeState();
                if (homeState instanceof AfterpayAppletHomeContentViewModel) {
                    afterpayAppletHomePresenter.setHomeState(AfterpayAppletHomeContentViewModel.copy$default((AfterpayAppletHomeContentViewModel) homeState, false, null, str2, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                }
                break;
            case 4:
                AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList.NumberedItem numberedItem = (AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList.NumberedItem) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, numberedItem.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 5:
                AfterpayAppletMerchantSheetViewModel.Loaded loaded = (AfterpayAppletMerchantSheetViewModel.Loaded) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(loaded.avatar, null, null, gapComposer3, 8, 3), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.PurchasesTotalOwedSection((AfterpayAppletPurchasesEmbeddedViewModel.TotalOwedSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel rowViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    StackedAvatarViewModel.Single single = rowViewModel.avatar;
                    if (single == null) {
                        gapComposer4.startReplaceGroup(1117185564);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(1117185565);
                        TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(single.avatar, null, new AfterpaySearchViewKt$$ExternalSyntheticLambda50(single, false ? 1 : 0), gapComposer4, 8, 1), null, false, gapComposer4, 6, 28);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 8:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText iconText = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str3 = iconText.titleText;
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors4 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.prominent, (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 9:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader standaloneHeader = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AfterpayAppletHomeContentViewModel.HomeSection.Header header = standaloneHeader.header;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, LegalSectionKt.toColor(header.displayEffect, gapComposer6), (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, header.titleText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 10:
                break;
            case 11:
                AfterpayAppletRetroOrderSelectionViewModel.Loaded loaded2 = (AfterpayAppletRetroOrderSelectionViewModel.Loaded) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                AnalyticsMappersKt.LogoStackContent((AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 13:
                HeroNumericsHeader heroNumericsHeader = (HeroNumericsHeader) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(heroNumericsHeader.title_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 14:
                AvatarOverlay avatarOverlay = (AvatarOverlay) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gapComposer9.skipToGroupEnd();
                } else if (!(avatarOverlay instanceof AvatarOverlay.RemoteImage)) {
                    break;
                } else {
                    AvatarOverlay.Local local = ((AvatarOverlay.RemoteImage) avatarOverlay).placeholder;
                    if (local == null) {
                        gapComposer9.startReplaceGroup(-2001193196);
                    } else {
                        gapComposer9.startReplaceGroup(212540045);
                        r5 = local.painter(null, gapComposer9);
                    }
                    gapComposer9.end(false);
                    ?? r8 = r5;
                    if (r8 != 0) {
                        gapComposer9.startReplaceGroup(-2001102830);
                        ImageKt.Image(r8, null, Modifier.Companion.$$INSTANCE, Alignment.Companion.Center, null, RecyclerView.DECELERATION_RATE, local.colorFilter(gapComposer9), gapComposer9, Painter.$stable | 3504, 48);
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(-2000893084);
                        gapComposer9.end(false);
                    }
                }
                break;
            case 15:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Function2 function2 = (Function2) realCellActivityAccessoryScope.accessoryContent$delegate.getValue();
                    if (function2 == null) {
                        gapComposer10.startReplaceGroup(-700217910);
                    } else {
                        gapComposer10.startReplaceGroup(1639980311);
                        function2.invoke(gapComposer10, 0);
                    }
                    gapComposer10.end(false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 16:
                CellDefaultAccessory.Label label = (CellDefaultAccessory.Label) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    label.content.invoke((Object) rowScopeInstance, (Object) gapComposer11, (Object) 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 17:
                CellDefaultAccessory.Label label2 = (CellDefaultAccessory.Label) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    label2.content.invoke((Object) rowScopeInstance, (Object) gapComposer12, (Object) 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                int i3 = ArcadeTimeline2Binding.$r8$clinit;
                ((ArcadeTimeline2Binding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                int i4 = ArcadeTimelineBinding.$r8$clinit;
                ((ArcadeTimelineBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                int i5 = KeypadScaffoldBinding.$r8$clinit;
                ((KeypadScaffoldBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                int i6 = ProgressBarBinding.$r8$clinit;
                ((ProgressBarBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 22:
                RadioBinding radioBinding = (RadioBinding) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean z = ((BooleanState) radioBinding.state$delegate.getValue()).value;
                    boolean booleanValue = ((Boolean) radioBinding.enabled$delegate.getValue()).booleanValue();
                    boolean changedInstance = gapComposer13.changedInstance(radioBinding);
                    Object rememberedValue = gapComposer13.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ErrorView$$ExternalSyntheticLambda0(radioBinding, 7);
                        gapComposer13.updateRememberedValue(rememberedValue);
                    }
                    ModalKt.Radio(z, null, null, booleanValue, (Function0) rememberedValue, gapComposer13, 0, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((RoundedRectBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                int i7 = SearchBarBinding.$r8$clinit;
                ((SearchBarBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                int i8 = ShimmerBinding.$r8$clinit;
                ((ShimmerBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                int i9 = SpinnerBinding.$r8$clinit;
                ((SpinnerBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((TitleBarCoreBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                int i10 = TitleBarSubBinding.$r8$clinit;
                ((TitleBarSubBinding) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ToastBinding.ToastView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ButtonBinding$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public /* synthetic */ ButtonBinding$$ExternalSyntheticLambda2(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
