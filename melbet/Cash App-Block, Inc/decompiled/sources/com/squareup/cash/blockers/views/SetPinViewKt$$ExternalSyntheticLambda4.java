package com.squareup.cash.blockers.views;

import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.ThemeSwitcherView;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.OverdraftCoverageSheetView;
import com.squareup.cash.banking.views.TransfersView$$ExternalSyntheticLambda0;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.benefits.views.BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.booklet.ui.BookletStyle;
import com.squareup.cash.booklet.ui.BookletStyleKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.StableHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class SetPinViewKt$$ExternalSyntheticLambda4 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda4(Function1 function1, SignatureView signatureView) {
        this.$r8$classId = 23;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$blockers$views$StatusResultViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4) {
        final StatusResultViewModel statusResultViewModel = (StatusResultViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        statusResultViewModel.getClass();
        final int i = 0;
        if (statusResultViewModel instanceof StatusResultViewModel.Ready) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1970388596);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            final int i2 = 1;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-794262917, new Function2() { // from class: com.squareup.cash.blockers.views.StatusResultViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    long j;
                    int i3 = i;
                    StatusResultViewModel statusResultViewModel2 = statusResultViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = ((StatusResultViewModel.Ready) statusResultViewModel2).text;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(-911705354);
                                } else {
                                    gapComposer2.startReplaceGroup(-911705353);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                StatusResult.Icon icon = ((StatusResultViewModel.Ready) statusResultViewModel2).icon;
                                if (icon == null) {
                                    gapComposer3.startReplaceGroup(1561531658);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1561531659);
                                    Icons icons = null;
                                    switch (icon) {
                                        case SUCCESS:
                                            icons = Icons.Check32;
                                            break;
                                        case INSTANT:
                                            icons = Icons.Instant32;
                                            break;
                                        case BANK:
                                        case ACTION_REQUIRED:
                                            icons = Icons.Alert32;
                                            break;
                                        case FAILURE:
                                            icons = Icons.Failed32;
                                            break;
                                        case PENDING:
                                            icons = Icons.Pending32;
                                            break;
                                        case VERIFICATION_REQUIRED:
                                            icons = Icons.SecurityCheckFill32;
                                            break;
                                        case PACKAGE:
                                            icons = Icons.Delivery32;
                                            break;
                                        case ACCOUNT_LOCKED:
                                            icons = Icons.LockLockedFill32;
                                            break;
                                        case NONE:
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                    if (icons == null) {
                                        gapComposer3.startReplaceGroup(-1922209773);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1922209772);
                                        AvatarSize avatarSize = AvatarSize.Size64;
                                        switch (icon) {
                                            case SUCCESS:
                                            case INSTANT:
                                            case PENDING:
                                            case VERIFICATION_REQUIRED:
                                            case PACKAGE:
                                            case ACCOUNT_LOCKED:
                                                gapComposer3.startReplaceGroup(1931420831);
                                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors.semantic.background.brand;
                                                gapComposer3.end(false);
                                                break;
                                            case BANK:
                                            case FAILURE:
                                            case ACTION_REQUIRED:
                                                gapComposer3.startReplaceGroup(1931425472);
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors2.semantic.background.danger;
                                                gapComposer3.end(false);
                                                break;
                                            case NONE:
                                                gapComposer3.startReplaceGroup(1931426853);
                                                gapComposer3.end(false);
                                                j = Color.Unspecified;
                                                break;
                                            default:
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1931412907, false);
                                        }
                                        TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                                        gapComposer3.end(false);
                                    }
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), (Modifier) null, Expect_jvmKt.rememberComposableLambda(1673865657, new Function2() { // from class: com.squareup.cash.blockers.views.StatusResultViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    long j;
                    int i3 = i2;
                    StatusResultViewModel statusResultViewModel2 = statusResultViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = ((StatusResultViewModel.Ready) statusResultViewModel2).text;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(-911705354);
                                } else {
                                    gapComposer2.startReplaceGroup(-911705353);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                StatusResult.Icon icon = ((StatusResultViewModel.Ready) statusResultViewModel2).icon;
                                if (icon == null) {
                                    gapComposer3.startReplaceGroup(1561531658);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1561531659);
                                    Icons icons = null;
                                    switch (icon) {
                                        case SUCCESS:
                                            icons = Icons.Check32;
                                            break;
                                        case INSTANT:
                                            icons = Icons.Instant32;
                                            break;
                                        case BANK:
                                        case ACTION_REQUIRED:
                                            icons = Icons.Alert32;
                                            break;
                                        case FAILURE:
                                            icons = Icons.Failed32;
                                            break;
                                        case PENDING:
                                            icons = Icons.Pending32;
                                            break;
                                        case VERIFICATION_REQUIRED:
                                            icons = Icons.SecurityCheckFill32;
                                            break;
                                        case PACKAGE:
                                            icons = Icons.Delivery32;
                                            break;
                                        case ACCOUNT_LOCKED:
                                            icons = Icons.LockLockedFill32;
                                            break;
                                        case NONE:
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                    if (icons == null) {
                                        gapComposer3.startReplaceGroup(-1922209773);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1922209772);
                                        AvatarSize avatarSize = AvatarSize.Size64;
                                        switch (icon) {
                                            case SUCCESS:
                                            case INSTANT:
                                            case PENDING:
                                            case VERIFICATION_REQUIRED:
                                            case PACKAGE:
                                            case ACCOUNT_LOCKED:
                                                gapComposer3.startReplaceGroup(1931420831);
                                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors.semantic.background.brand;
                                                gapComposer3.end(false);
                                                break;
                                            case BANK:
                                            case FAILURE:
                                            case ACTION_REQUIRED:
                                                gapComposer3.startReplaceGroup(1931425472);
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors2.semantic.background.danger;
                                                gapComposer3.end(false);
                                                break;
                                            case NONE:
                                                gapComposer3.startReplaceGroup(1931426853);
                                                gapComposer3.end(false);
                                                j = Color.Unspecified;
                                                break;
                                            default:
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1931412907, false);
                                        }
                                        TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                                        gapComposer3.end(false);
                                    }
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), (Function2) null, gapComposer, 390, 10);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            LayoutUpdate layoutUpdate = ((StatusResultViewModel.Ready) statusResultViewModel).layoutUpdate;
            Function1 function1 = this.f$0;
            if (layoutUpdate == null) {
                gapComposer.startReplaceGroup(-822850834);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-822850833);
                if (layoutUpdate instanceof LayoutUpdate.PromoText) {
                    gapComposer.startReplaceGroup(1963577864);
                    StatusResultViewKt.Render((LayoutUpdate.PromoText) layoutUpdate, null, gapComposer, 0);
                    gapComposer.end(false);
                } else if (layoutUpdate instanceof LayoutUpdate.Promotions) {
                    gapComposer.startReplaceGroup(1963579247);
                    StatusResultViewKt.Render((LayoutUpdate.Promotions) layoutUpdate, function1, null, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    if (!(layoutUpdate instanceof LayoutUpdate.Upsell)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1963576593, false);
                    }
                    gapComposer.startReplaceGroup(1963581508);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1082319838, new BorrowHomeKt$$ExternalSyntheticLambda0(24, statusResultViewModel, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1968727027);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$VerifyContactsViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        final VerifyContactsViewModel verifyContactsViewModel = (VerifyContactsViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        verifyContactsViewModel.getClass();
        final int i = 0;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, Modifier.Companion.$$INSTANCE);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        NavigationType navigationType = verifyContactsViewModel.retreatActionEnabled ? NavigationType.BACK : NavigationType.NONE;
        boolean changedInstance = gapComposer2.changedInstance(verifyContactsViewModel);
        final Function1 function1 = this.f$0;
        boolean changed = changedInstance | gapComposer2.changed(function1);
        Object rememberedValue = gapComposer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(25, (Object) verifyContactsViewModel, function1);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1157763418, new Function3() { // from class: com.squareup.cash.blockers.views.VerifyContactsViewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                int i2 = i;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Function1 function12 = function1;
                VerifyContactsViewModel verifyContactsViewModel2 = verifyContactsViewModel;
                switch (i2) {
                    case 0:
                        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj5;
                        Composer composer2 = (Composer) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        titleBarActionScope.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                        }
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (!gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            gapComposer3.skipToGroupEnd();
                        } else if (verifyContactsViewModel2.dismissButtonEnabled) {
                            gapComposer3.startReplaceGroup(1952428432);
                            Icons icons = Icons.NavigationClose;
                            String stringResource = Room.stringResource(gapComposer3, R.string.close);
                            boolean changed2 = gapComposer3.changed(function12);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(18, function12);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer3, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1952655228);
                            gapComposer3.end(false);
                        }
                        break;
                    default:
                        Composer composer3 = (Composer) obj6;
                        int intValue2 = ((Integer) obj7).intValue();
                        ((AdaptiveStackScope) obj5).getClass();
                        GapComposer gapComposer4 = (GapComposer) composer3;
                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                            boolean z = verifyContactsViewModel2.showHelp;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (z) {
                                gapComposer4.startReplaceGroup(-48505512);
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                boolean changed3 = gapComposer4.changed(function12);
                                Object rememberedValue3 = gapComposer4.rememberedValue();
                                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda14(19, function12);
                                    gapComposer4.updateRememberedValue(rememberedValue3);
                                }
                                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, null, false, false, null, AmountBlockerViewKt.lambda$475824451, gapComposer4, 1572912, 60);
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(-48240865);
                                gapComposer4.end(false);
                            }
                            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                            boolean z2 = !verifyContactsViewModel2.isLoading;
                            boolean changed4 = gapComposer4.changed(function12);
                            Object rememberedValue4 = gapComposer4.rememberedValue();
                            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new SsnViewKt$$ExternalSyntheticLambda14(20, function12);
                                gapComposer4.updateRememberedValue(rememberedValue4);
                            }
                            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, fillMaxWidth2, buttonProminence, false, z2, null, AmountBlockerViewKt.f293lambda$348468184, gapComposer4, 1573296, 40);
                        } else {
                            gapComposer4.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, composer), composer, 1572870, 44);
        final int i2 = 1;
        DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
        Countries.PageHeader(verifyContactsViewModel.title, (Modifier) null, AmountBlockerViewKt.f307lambda$908864422, verifyContactsViewModel.subtitle, composer, MLKEMEngine.KyberPolyBytes, 2);
        SpacerKt.Spacer(composer, new LayoutWeightElement(1.0f, true));
        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(75975939, new Function3() { // from class: com.squareup.cash.blockers.views.VerifyContactsViewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                int i22 = i2;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Function1 function12 = function1;
                VerifyContactsViewModel verifyContactsViewModel2 = verifyContactsViewModel;
                switch (i22) {
                    case 0:
                        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj5;
                        Composer composer2 = (Composer) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        titleBarActionScope.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                        }
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (!gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            gapComposer3.skipToGroupEnd();
                        } else if (verifyContactsViewModel2.dismissButtonEnabled) {
                            gapComposer3.startReplaceGroup(1952428432);
                            Icons icons = Icons.NavigationClose;
                            String stringResource = Room.stringResource(gapComposer3, R.string.close);
                            boolean changed2 = gapComposer3.changed(function12);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(18, function12);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer3, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1952655228);
                            gapComposer3.end(false);
                        }
                        break;
                    default:
                        Composer composer3 = (Composer) obj6;
                        int intValue2 = ((Integer) obj7).intValue();
                        ((AdaptiveStackScope) obj5).getClass();
                        GapComposer gapComposer4 = (GapComposer) composer3;
                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                            boolean z = verifyContactsViewModel2.showHelp;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (z) {
                                gapComposer4.startReplaceGroup(-48505512);
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                boolean changed3 = gapComposer4.changed(function12);
                                Object rememberedValue3 = gapComposer4.rememberedValue();
                                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda14(19, function12);
                                    gapComposer4.updateRememberedValue(rememberedValue3);
                                }
                                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, null, false, false, null, AmountBlockerViewKt.lambda$475824451, gapComposer4, 1572912, 60);
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(-48240865);
                                gapComposer4.end(false);
                            }
                            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                            boolean z2 = !verifyContactsViewModel2.isLoading;
                            boolean changed4 = gapComposer4.changed(function12);
                            Object rememberedValue4 = gapComposer4.rememberedValue();
                            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new SsnViewKt$$ExternalSyntheticLambda14(20, function12);
                                gapComposer4.updateRememberedValue(rememberedValue4);
                            }
                            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, fillMaxWidth2, buttonProminence, false, z2, null, AmountBlockerViewKt.f293lambda$348468184, gapComposer4, 1573296, 40);
                        } else {
                            gapComposer4.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, composer), composer, 24576, 15);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$spendinginsights$views$SpendingInsightsHomeViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        SpendingInsightsHomeViewModel spendingInsightsHomeViewModel = (SpendingInsightsHomeViewModel) obj2;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedVisibilityScope) obj).getClass();
        spendingInsightsHomeViewModel.getClass();
        RecipientMapper.ArcadeSpendingInsightsContent((SpendingInsightsHomeViewModel.Content) spendingInsightsHomeViewModel, this.f$0, null, (Composer) obj3, (intValue >> 3) & 14);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$crypto$common$views$BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4) {
        BitcoinP2pConversionPercentageViewModel bitcoinP2pConversionPercentageViewModel = (BitcoinP2pConversionPercentageViewModel) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        bitcoinP2pConversionPercentageViewModel.getClass();
        if (bitcoinP2pConversionPercentageViewModel instanceof BitcoinP2pConversionPercentageViewModel.Content) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-480703998);
            BitcoinP2pConversionPercentageViewKt.ContentScreen((BitcoinP2pConversionPercentageViewModel.Content) bitcoinP2pConversionPercentageViewModel, this.f$0, gapComposer, (intValue >> 3) & 14);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-480638650);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v10, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r8;
        AvatarEntry avatarEntry;
        AvatarEntry avatarEntry2;
        Composer composer;
        Function1 function1;
        Throwable th;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 19;
        int i3 = 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function12 = this.f$0;
        switch (i) {
            case 0:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                SetPinViewModel setPinViewModel = (SetPinViewModel) obj2;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl.getClass();
                setPinViewModel.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj3);
                boolean changed = gapComposer.changed(setPinViewModel.pinEntryId);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TextFieldState((String) null, 3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TextFieldState textFieldState = (TextFieldState) rememberedValue;
                boolean changed2 = gapComposer.changed(textFieldState);
                Function1 function13 = this.f$0;
                boolean changed3 = changed2 | gapComposer.changed(function13);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue2 == neverEqualPolicy) {
                    r8 = 0;
                    rememberedValue2 = new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function13, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    r8 = 0;
                }
                Updater.LaunchedEffect(gapComposer, textFieldState, (Function2) rememberedValue2);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.imePadding(companion), ImageKt.rememberScrollState(gapComposer), r8, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, r8);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                Countries.PageHeader(setPinViewModel.titleText, (Modifier) null, (Function2) null, setPinViewModel.labelText, gapComposer, 0, 6);
                SsnViewKt.PasscodeInput(textFieldState, 4, FocusTraversalKt.focusRequester(Request$Priority$EnumUnboxingLocalUtility.m(companion, 32.0f, gapComposer, companion, 1.0f), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer)), !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning(), gapComposer, 48);
                SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                String str = setPinViewModel.primaryButtonText;
                String str2 = setPinViewModel.helpButtonText;
                if (str == null && str2 == null) {
                    gapComposer.startReplaceGroup(1378545963);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1377726230);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(965626842, new ComposeDialogKt$$ExternalSyntheticLambda12(str2, animatedContentScopeImpl, function13, str, 21), gapComposer), gapComposer, 24576, 15);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                return Unit.INSTANCE;
            case 1:
                LocalPosBrandOnboardingViewModel.CallToAction callToAction = (LocalPosBrandOnboardingViewModel.CallToAction) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                callToAction.getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(-421025917, new BrandSheetViewKt$$ExternalSyntheticLambda1(i3, (Object) callToAction, (Object) function12), composer2), composer2, 24576, 14);
                return Unit.INSTANCE;
            case 2:
                ThemeSwitcherViewModel themeSwitcherViewModel = (ThemeSwitcherViewModel) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                int i4 = ThemeSwitcherView.$r8$clinit;
                ((AnimatedContentScopeImpl) obj).getClass();
                themeSwitcherViewModel.getClass();
                if (Intrinsics.areEqual(themeSwitcherViewModel, ThemeSwitcherViewModel.Loading.INSTANCE)) {
                    GapComposer gapComposer3 = (GapComposer) composer3;
                    gapComposer3.startReplaceGroup(-437905394);
                    gapComposer3.end(false);
                    a$$ExternalSyntheticBUOutline0.m$3("Loading should be handled by LoadableContent");
                    return null;
                }
                if (themeSwitcherViewModel instanceof ThemeSwitcherViewModel.Loaded) {
                    GapComposer gapComposer4 = (GapComposer) composer3;
                    gapComposer4.startReplaceGroup(-437902173);
                    ThemeSwitcherViewKt.ThemeSwitcher((ThemeSwitcherViewModel.Loaded) themeSwitcherViewModel, function12, gapComposer4, (intValue >> 3) & 14);
                    gapComposer4.end(false);
                } else {
                    if (!(themeSwitcherViewModel instanceof ThemeSwitcherViewModel.Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer3, -437906570, false);
                    }
                    GapComposer gapComposer5 = (GapComposer) composer3;
                    gapComposer5.startReplaceGroup(-437900318);
                    ThemeSwitcherViewKt.ErrorContent((ThemeSwitcherViewModel.Error) themeSwitcherViewModel, function12, gapComposer5, (intValue >> 3) & 14);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 3:
                AccountSwitcherViewModel accountSwitcherViewModel = (AccountSwitcherViewModel) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                accountSwitcherViewModel.getClass();
                BadgeTitleKt.AccountSwitcherLoaded((AccountSwitcherViewModel.Loaded) accountSwitcherViewModel, function12, (Composer) obj3, (intValue2 >> 3) & 14);
                return Unit.INSTANCE;
            case 4:
                AfterpayAppletUpsellSheetViewModel.AvatarItem avatarItem = (AfterpayAppletUpsellSheetViewModel.AvatarItem) obj;
                ((Integer) obj2).getClass();
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                avatarItem.getClass();
                UiAvatar uiAvatar = avatarItem.avatar;
                StackedAvatarViewModel.Avatar avatar = uiAvatar != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar).avatar : null;
                if (avatar == null) {
                    GapComposer gapComposer6 = (GapComposer) composer4;
                    gapComposer6.startReplaceGroup(-270920592);
                    gapComposer6.end(false);
                    avatarEntry = null;
                } else {
                    GapComposer gapComposer7 = (GapComposer) composer4;
                    gapComposer7.startReplaceGroup(-1117118031);
                    AvatarEntry avatarEntry3 = AvatarsKt.toAvatarEntry(avatar, null, null, gapComposer7, 8, 3);
                    gapComposer7.end(false);
                    avatarEntry = avatarEntry3;
                }
                if (avatarEntry != null) {
                    GapComposer gapComposer8 = (GapComposer) composer4;
                    gapComposer8.startReplaceGroup(-270854096);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    boolean changedInstance = gapComposer8.changedInstance(avatarItem) | gapComposer8.changed(function12);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda5(i2, avatarItem, function12);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    TextViewKt.Avatar(avatarSize, avatarEntry, ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue3, 15), false, gapComposer8, 6, 24);
                    gapComposer8.end(false);
                } else {
                    GapComposer gapComposer9 = (GapComposer) composer4;
                    gapComposer9.startReplaceGroup(-270469696);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader.AvatarCarousel.AvatarItem avatarItem2 = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader.AvatarCarousel.AvatarItem) obj;
                ((Integer) obj2).getClass();
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                avatarItem2.getClass();
                UiAvatar uiAvatar2 = avatarItem2.avatar;
                StackedAvatarViewModel.Avatar avatar2 = uiAvatar2 != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar2).avatar : null;
                if (avatar2 == null) {
                    GapComposer gapComposer10 = (GapComposer) composer5;
                    gapComposer10.startReplaceGroup(124690433);
                    gapComposer10.end(false);
                    avatarEntry2 = null;
                } else {
                    GapComposer gapComposer11 = (GapComposer) composer5;
                    gapComposer11.startReplaceGroup(4022272);
                    AvatarEntry avatarEntry4 = AvatarsKt.toAvatarEntry(avatar2, null, null, gapComposer11, 8, 3);
                    gapComposer11.end(false);
                    avatarEntry2 = avatarEntry4;
                }
                if (avatarEntry2 != null) {
                    GapComposer gapComposer12 = (GapComposer) composer5;
                    gapComposer12.startReplaceGroup(124751597);
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    boolean changedInstance2 = gapComposer12.changedInstance(avatarItem2) | gapComposer12.changed(function12);
                    Object rememberedValue4 = gapComposer12.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BalanceFeedKt$$ExternalSyntheticLambda5(26, avatarItem2, function12);
                        gapComposer12.updateRememberedValue(rememberedValue4);
                    }
                    TextViewKt.Avatar(avatarSize2, avatarEntry2, ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue4, 15), false, gapComposer12, 6, 24);
                    gapComposer12.end(false);
                } else {
                    GapComposer gapComposer13 = (GapComposer) composer5;
                    gapComposer13.startReplaceGroup(125093713);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
                Modifier modifier = (Modifier) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                actionableButtonDefault.getClass();
                modifier.getClass();
                ArcadeComponentButtonProtoBindingKt.RenderActionableButtonDefault(actionableButtonDefault, function12, modifier, (Composer) obj3, ((intValue3 << 3) & 896) | (intValue3 & 14));
                return Unit.INSTANCE;
            case 7:
                ButtonDefault buttonDefault = (ButtonDefault) obj;
                Modifier modifier2 = (Modifier) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                buttonDefault.getClass();
                modifier2.getClass();
                ArcadeComponentButtonProtoBindingKt.RenderButtonCta(buttonDefault, function12, modifier2, (Composer) obj3, ((intValue4 << 3) & 896) | (intValue4 & 14));
                return Unit.INSTANCE;
            case 8:
                BalanceHomeViewModel balanceHomeViewModel = (BalanceHomeViewModel) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                balanceHomeViewModel.getClass();
                BalanceHomeViewKt.BalanceHome((BalanceHomeViewModel.Loaded) balanceHomeViewModel, this.f$0, null, null, (Composer) obj3, (intValue5 >> 3) & 14, 12);
                return Unit.INSTANCE;
            case 9:
                OverdraftViewModel overdraftViewModel = (OverdraftViewModel) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                int i5 = OverdraftCoverageSheetView.$r8$clinit;
                ((AnimatedContentScopeImpl) obj).getClass();
                overdraftViewModel.getClass();
                BankingDialogKt.OverdraftCoverage((OverdraftViewModel.Loaded) overdraftViewModel, function12, null, (Composer) obj3, (intValue6 >> 3) & 14);
                return Unit.INSTANCE;
            case 10:
                BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj2;
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                bankingBenefitsBookletViewModel.getClass();
                if (!(bankingBenefitsBookletViewModel instanceof BankingBenefitsBookletViewModel.Loaded)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(composer6).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer6, 0);
                GapComposer gapComposer14 = (GapComposer) composer6;
                int hashCode2 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer14.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer6, navigationBarsPadding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer15 = (GapComposer) composer6;
                if (gapComposer15.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer15.startReusableNode();
                if (gapComposer15.inserting) {
                    gapComposer15.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer15.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer6, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer6, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer6, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                NavigationType navigationType = NavigationType.CLOSE;
                boolean changed4 = gapComposer15.changed(function12);
                Object rememberedValue5 = gapComposer15.rememberedValue();
                if (changed4 || rememberedValue5 == neverEqualPolicy) {
                    composer = composer6;
                    rememberedValue5 = new TransfersView$$ExternalSyntheticLambda0(28, function12);
                    gapComposer15.updateRememberedValue(rememberedValue5);
                } else {
                    composer = composer6;
                }
                DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, composer, 54, 108);
                Composer composer7 = composer;
                Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(composer7), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer7, 0);
                int hashCode3 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer15.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer7, verticalScroll$default2);
                gapComposer15.startReusableNode();
                if (gapComposer15.inserting) {
                    gapComposer15.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer15.useNode();
                }
                Updater.m576setimpl(composer7, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(composer7, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode3, composer7, composeUiNode$Companion$SetModifier$13, composer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(composer7, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer7, null);
                ImageKt.Image(Countries.painterResource(R.drawable.benefits_booklet_hero_image, 0, composer7), null, SizeKt.fillMaxWidth(companion, 1.0f), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, composer7, Painter.$stable | 25008, 104);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer7, null);
                Strings.getSizes(composer7).getClass();
                DefaultSizes.spacing.getClass();
                BankingBenefitsBookletViewModel.Loaded loaded = (BankingBenefitsBookletViewModel.Loaded) bankingBenefitsBookletViewModel;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, composer7, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(composer7).headlineLarge, (TextLineBalancing) null, loaded.title, (Map) null, (Function1) null, false);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer7, null);
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(571241733, new BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel, 0), composer7), composer7, 199680, 23);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer7, null);
                Strings.getSizes(composer7).getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer7, 0);
                int hashCode4 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer15.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer7, m298padding3ABfNKs);
                gapComposer15.startReusableNode();
                if (gapComposer15.inserting) {
                    gapComposer15.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer15.useNode();
                }
                Updater.m576setimpl(composer7, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(composer7, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer7, composeUiNode$Companion$SetModifier$13, composer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(composer7, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                zzadq.BenefitsComparisonTable(loaded.table, composer7, 0);
                Updater.CompositionLocalProvider(BookletStyleKt.LocalBookletStyle.defaultProvidedValue$runtime(BookletStyle.Evolution), Expect_jvmKt.rememberComposableLambda(-1602368791, new CashtagViewKt$$ExternalSyntheticLambda10(bankingBenefitsBookletViewModel, 9), composer7), composer7, 56);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer7, null);
                Strings.getSizes(composer7).getClass();
                ModalKt.HorizontalDivider(0, 0, composer7, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer7, null);
                String str3 = loaded.disclosure;
                TextStyle textStyle = Strings.getTypography(composer7).bodyXSmall;
                long j = Strings.getColors(composer7).semantic.text.subtle;
                boolean changed5 = gapComposer15.changed(function12);
                Object rememberedValue6 = gapComposer15.rememberedValue();
                if (changed5 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function12, false, 11);
                    gapComposer15.updateRememberedValue(rememberedValue6);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue6, null, textStyle, j, null, null, null, 0, 0, 0, composer7, 0, 2020);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, composer7, null);
                gapComposer15.end(true);
                gapComposer15.end(true);
                DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(composer7).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), true, null, null, Expect_jvmKt.rememberComposableLambda(-2097513005, new BankingDialogKt$$ExternalSyntheticLambda2(16, function12, bankingBenefitsBookletViewModel), composer7), composer7, 24624, 12);
                gapComposer15.end(true);
                return Unit.INSTANCE;
            case 11:
                BenefitsHubViewModel benefitsHubViewModel = (BenefitsHubViewModel) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                benefitsHubViewModel.getClass();
                if (benefitsHubViewModel instanceof BenefitsHubViewModel.Loaded) {
                    GapComposer gapComposer16 = (GapComposer) composer8;
                    gapComposer16.startReplaceGroup(9713531);
                    BenefitsHubViewKt.BenefitsHub((BenefitsHubViewModel.Loaded) benefitsHubViewModel, function12, gapComposer16, (intValue7 >> 3) & 14);
                    gapComposer16.end(false);
                } else {
                    if (!(benefitsHubViewModel instanceof BenefitsHubViewModel.Error)) {
                        if (!benefitsHubViewModel.equals(BenefitsHubViewModel.Loading.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer8, -692424328, false);
                        }
                        GapComposer gapComposer17 = (GapComposer) composer8;
                        gapComposer17.startReplaceGroup(-692414292);
                        gapComposer17.end(false);
                        a$$ExternalSyntheticBUOutline0.m$3("Loading should be handled by LoadableContent");
                        return null;
                    }
                    GapComposer gapComposer18 = (GapComposer) composer8;
                    gapComposer18.startReplaceGroup(9809724);
                    BenefitsHubViewModel.Error error = (BenefitsHubViewModel.Error) benefitsHubViewModel;
                    boolean changed6 = gapComposer18.changed(function12);
                    Object rememberedValue7 = gapComposer18.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(0, function12);
                        gapComposer18.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function0 = (Function0) rememberedValue7;
                    boolean changed7 = gapComposer18.changed(function12);
                    Object rememberedValue8 = gapComposer18.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(8, function12);
                        gapComposer18.updateRememberedValue(rememberedValue8);
                    }
                    BenefitsHomeViewKt.BenefitsHubError(error, function0, (Function0) rememberedValue8, gapComposer18, (intValue7 >> 3) & 14);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                final GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = (GreenEligibleTransactionsViewModel) obj2;
                Composer composer9 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                greenEligibleTransactionsViewModel.getClass();
                if (!(greenEligibleTransactionsViewModel instanceof GreenEligibleTransactionsViewModel.Loaded)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer9, 0);
                GapComposer gapComposer19 = (GapComposer) composer9;
                int hashCode5 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer19.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer9, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer20 = (GapComposer) composer9;
                if (gapComposer20.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer20.startReusableNode();
                if (gapComposer20.inserting) {
                    gapComposer20.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer20.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer9, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer9, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode5);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer9, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer9, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                NavigationType navigationType2 = NavigationType.BACK;
                boolean changed8 = gapComposer20.changed(function12);
                Object rememberedValue9 = gapComposer20.rememberedValue();
                if (changed8 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(10, function12);
                    gapComposer20.updateRememberedValue(rememberedValue9);
                }
                DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue9, (Modifier) null, (Function3) null, composer9, 54, 108);
                Modifier verticalScroll$default3 = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(composer9), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer9, 0);
                int hashCode6 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer20.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(composer9, verticalScroll$default3);
                gapComposer20.startReusableNode();
                if (gapComposer20.inserting) {
                    gapComposer20.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer20.useNode();
                }
                Updater.m576setimpl(composer9, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(composer9, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode6, composer9, composeUiNode$Companion$SetModifier$17, composer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(composer9, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                GreenEligibleTransactionsViewModel.Loaded loaded2 = (GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel;
                Countries.PageHeader(loaded2.headerTitle, (Modifier) null, (Function2) null, loaded2.headerBody, composer9, 0, 6);
                ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(composer9, SizeKt.m277height3ABfNKs(companion, 8.0f));
                boolean changed9 = gapComposer20.changed(function12);
                Object rememberedValue10 = gapComposer20.rememberedValue();
                if (changed9 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(11, function12);
                    gapComposer20.updateRememberedValue(rememberedValue10);
                }
                final int i6 = 0;
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue10, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-387964113, new Function3() { // from class: com.squareup.cash.benefits.views.GreenEligibleTransactionsViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i7 = i6;
                        GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel2 = greenEligibleTransactionsViewModel;
                        switch (i7) {
                            case 0:
                                Composer composer10 = (Composer) obj6;
                                int intValue8 = ((Integer) obj7).intValue();
                                ((RowScope) obj5).getClass();
                                GapComposer gapComposer21 = (GapComposer) composer10;
                                if (gapComposer21.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel2).learnMoreText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer21.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer11 = (Composer) obj6;
                                int intValue9 = ((Integer) obj7).intValue();
                                ((EmbeddedHeaderScope) obj5).getClass();
                                GapComposer gapComposer22 = (GapComposer) composer11;
                                if (gapComposer22.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                                    GreenEligibleTransactionsViewModel.Loaded loaded3 = (GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel2;
                                    BenefitsHomeViewKt.GreenEligibleTransactionsSectionHeader(loaded3.month, loaded3.monthTotal, gapComposer22, 0);
                                } else {
                                    gapComposer22.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer9), composer9, 1573248, 58);
                final int i7 = 1;
                DBUtil.SpacerWithinSectionMedium(0, 1, composer9, null);
                com.squareup.cash.activity.views.AvatarsKt.ActivityEmbeddedView(loaded2.activityEmbeddedModel, SizeKt.fillMaxSize(companion, 1.0f), Expect_jvmKt.rememberComposableLambda(-645924525, new Function3() { // from class: com.squareup.cash.benefits.views.GreenEligibleTransactionsViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i72 = i7;
                        GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel2 = greenEligibleTransactionsViewModel;
                        switch (i72) {
                            case 0:
                                Composer composer10 = (Composer) obj6;
                                int intValue8 = ((Integer) obj7).intValue();
                                ((RowScope) obj5).getClass();
                                GapComposer gapComposer21 = (GapComposer) composer10;
                                if (gapComposer21.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel2).learnMoreText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer21.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer11 = (Composer) obj6;
                                int intValue9 = ((Integer) obj7).intValue();
                                ((EmbeddedHeaderScope) obj5).getClass();
                                GapComposer gapComposer22 = (GapComposer) composer11;
                                if (gapComposer22.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                                    GreenEligibleTransactionsViewModel.Loaded loaded3 = (GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel2;
                                    BenefitsHomeViewKt.GreenEligibleTransactionsSectionHeader(loaded3.month, loaded3.monthTotal, gapComposer22, 0);
                                } else {
                                    gapComposer22.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer9), Expect_jvmKt.rememberComposableLambda(189825925, new CashtagViewKt$$ExternalSyntheticLambda10(greenEligibleTransactionsViewModel, 15), composer9), null, composer9, 3504, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                gapComposer20.end(true);
                gapComposer20.end(true);
                return Unit.INSTANCE;
            case 13:
                BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel = (BitcoinDisplayCurrencyViewModel) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                bitcoinDisplayCurrencyViewModel.getClass();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencySettings((BitcoinDisplayCurrencyViewModel.Loaded) bitcoinDisplayCurrencyViewModel, function12, null, (Composer) obj3, (intValue8 >> 3) & 14);
                return Unit.INSTANCE;
            case 14:
                BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                bitcoinDepositsViewModel.getClass();
                BitcoinDepositsViewKt.BitcoinDepositQrContent((BitcoinDepositsViewModel.Loaded) bitcoinDepositsViewModel, function12, null, (Composer) obj3, (intValue9 >> 3) & 14);
                return Unit.INSTANCE;
            case 15:
                StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                stablecoinDepositViewModel$Loaded.getClass();
                SendStablecoinViewKt.StablecoinDepositQrContent(stablecoinDepositViewModel$Loaded, function12, null, (Composer) obj3, (intValue10 >> 3) & 14);
                return Unit.INSTANCE;
            case 16:
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                filesetUploadViewModel.getClass();
                GapComposer gapComposer21 = (GapComposer) ((Composer) obj3);
                boolean changed10 = gapComposer21.changed(function12);
                Object rememberedValue11 = gapComposer21.rememberedValue();
                if (changed10 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(29, function12);
                    gapComposer21.updateRememberedValue(rememberedValue11);
                }
                AmountBlockerViewKt.FilesetUpload(filesetUploadViewModel, function12, (Function0) rememberedValue11, gapComposer21, (intValue11 >> 3) & 14);
                return Unit.INSTANCE;
            case 17:
                CalendarBlockerViewModel calendarBlockerViewModel = (CalendarBlockerViewModel) obj2;
                Composer composer10 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                calendarBlockerViewModel.getClass();
                CalendarBlockerViewModel.Loaded loaded3 = (CalendarBlockerViewModel.Loaded) calendarBlockerViewModel;
                String str4 = loaded3.title;
                String str5 = loaded3.buttonText;
                StableHolder stableHolder = new StableHolder(loaded3.today);
                StableHolder stableHolder2 = new StableHolder(loaded3.startDate);
                StableHolder stableHolder3 = new StableHolder(loaded3.endDate);
                boolean z = loaded3.calendarEnabled;
                CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton = loaded3.toolbarButton;
                boolean z2 = loaded3.buttonEnabled;
                CalendarBlockerViewModel.Loaded.Toggle toggle = loaded3.toggle;
                LocalDate localDate = loaded3.selectedDate;
                StableHolder stableHolder4 = localDate != null ? new StableHolder(localDate) : null;
                GapComposer gapComposer22 = (GapComposer) composer10;
                boolean changed11 = gapComposer22.changed(function12);
                Object rememberedValue12 = gapComposer22.rememberedValue();
                if (changed11 || rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new AvatarsKt$$ExternalSyntheticLambda1(25, function12);
                    gapComposer22.updateRememberedValue(rememberedValue12);
                }
                Function1 function14 = (Function1) rememberedValue12;
                boolean changed12 = gapComposer22.changed(function12);
                Object rememberedValue13 = gapComposer22.rememberedValue();
                if (changed12 || rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new AvatarsKt$$ExternalSyntheticLambda1(26, function12);
                    gapComposer22.updateRememberedValue(rememberedValue13);
                }
                Function1 function15 = (Function1) rememberedValue13;
                boolean changed13 = gapComposer22.changed(function12);
                Object rememberedValue14 = gapComposer22.rememberedValue();
                if (changed13 || rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = new CashtagViewKt$$ExternalSyntheticLambda6(1, function12);
                    gapComposer22.updateRememberedValue(rememberedValue14);
                }
                Function0 function02 = (Function0) rememberedValue14;
                boolean changed14 = gapComposer22.changed(function12);
                Object rememberedValue15 = gapComposer22.rememberedValue();
                if (changed14 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new CashtagViewKt$$ExternalSyntheticLambda6(2, function12);
                    gapComposer22.updateRememberedValue(rememberedValue15);
                }
                CalendarDatePickerKt.CalendarDatePicker(str4, str5, stableHolder, stableHolder2, stableHolder3, stableHolder4, z, toolbarButton, z2, toggle, function14, function15, function02, (Function0) rememberedValue15, gapComposer22, 0);
                return Unit.INSTANCE;
            case 18:
                GpsLocationConsentBlockerViewModel gpsLocationConsentBlockerViewModel = (GpsLocationConsentBlockerViewModel) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                int i8 = GpsLocationConsentBlockerView.$r8$clinit;
                ((AnimatedVisibilityScope) obj).getClass();
                gpsLocationConsentBlockerViewModel.getClass();
                SsnViewKt.GpsBlocker((GpsLocationConsentBlockerViewModel.Loaded) gpsLocationConsentBlockerViewModel, function12, (Composer) obj3, (intValue12 >> 3) & 14);
                return Unit.INSTANCE;
            case 19:
                OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                int i9 = OnboardingInternalRouteView.$r8$clinit;
                ((AnimatedVisibilityScope) obj).getClass();
                onboardingInternalRouteViewModel.getClass();
                SsnViewKt.ErrorMessage(function12, onboardingInternalRouteViewModel, null, (Composer) obj3, intValue13 & 112);
                return Unit.INSTANCE;
            case 20:
                AnimatedContentScopeImpl animatedContentScopeImpl2 = (AnimatedContentScopeImpl) obj;
                PasscodeViewModel passcodeViewModel = (PasscodeViewModel) obj2;
                Composer composer11 = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl2.getClass();
                passcodeViewModel.getClass();
                if (!(passcodeViewModel instanceof PasscodeViewModel.Content)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                PasscodeViewModel.Content content = (PasscodeViewModel.Content) passcodeViewModel;
                Object[] objArr = {Integer.valueOf(content.attempt)};
                GapComposer gapComposer23 = (GapComposer) composer11;
                Object rememberedValue16 = gapComposer23.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = new SsnViewKt$$ExternalSyntheticLambda0(19);
                    gapComposer23.updateRememberedValue(rememberedValue16);
                }
                TextFieldState textFieldState2 = (TextFieldState) SaverKt.m581rememberSaveable(objArr, (Saver) TextFieldState.Saver.INSTANCE, (Function0) rememberedValue16, (Composer) gapComposer23, MLKEMEngine.KyberPolyBytes);
                boolean changed15 = gapComposer23.changed(textFieldState2) | gapComposer23.changedInstance(passcodeViewModel);
                Function1 function16 = this.f$0;
                boolean changed16 = changed15 | gapComposer23.changed(function16);
                Object rememberedValue17 = gapComposer23.rememberedValue();
                Continuation continuation = null;
                if (changed16 || rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = new FileBlockerView$6$2$2(textFieldState2, passcodeViewModel, function16, continuation, 21);
                    function1 = function16;
                    th = null;
                    gapComposer23.updateRememberedValue(rememberedValue17);
                } else {
                    function1 = function16;
                    th = null;
                }
                Updater.LaunchedEffect(gapComposer23, textFieldState2, (Function2) rememberedValue17);
                Modifier verticalScroll$default4 = ImageKt.verticalScroll$default(SpacerKt.imePadding(companion), ImageKt.rememberScrollState(gapComposer23), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer23, 0);
                int hashCode7 = Long.hashCode(gapComposer23.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer23.currentCompositionLocalScope();
                Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer23, verticalScroll$default4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                if (gapComposer23.applier == null) {
                    Updater.invalidApplier();
                    throw th;
                }
                gapComposer23.startReusableNode();
                if (gapComposer23.inserting) {
                    gapComposer23.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer23.useNode();
                }
                Updater.m576setimpl(gapComposer23, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer23, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer23, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer23, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer23, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer23, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                SpacerKt.Spacer(gapComposer23, SizeKt.m277height3ABfNKs(companion, 16.0f));
                Countries.PageHeader(content.title, (Modifier) null, (Function2) null, content.subText, gapComposer23, 0, 6);
                SsnViewKt.PasscodeInput(textFieldState2, content.passcodeLength, FocusTraversalKt.focusRequester(Request$Priority$EnumUnboxingLocalUtility.m(companion, 32.0f, gapComposer23, companion, 1.0f), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer23)), !animatedContentScopeImpl2.$$delegate_0.getTransition().isRunning(), gapComposer23, 0);
                SpacerKt.Spacer(gapComposer23, new LayoutWeightElement(1.0f, true));
                String str6 = content.helpButtonText;
                if (str6 == null) {
                    gapComposer23.startReplaceGroup(164798769);
                    gapComposer23.end(false);
                } else {
                    gapComposer23.startReplaceGroup(164798770);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    DimensionKt.ButtonCtaGroup(null, false, null, ((Boolean) Arrangement$End$1.current(gapComposer23).ime.isVisible$delegate.getValue()).booleanValue() ? th : AmountBlockerViewKt.f284lambda$182588796, Expect_jvmKt.rememberComposableLambda(-1798515423, new SectionKt$$ExternalSyntheticLambda2(8, animatedContentScopeImpl2, function1, str6), gapComposer23), gapComposer23, 24576, 7);
                    gapComposer23.end(false);
                }
                gapComposer23.end(true);
                return Unit.INSTANCE;
            case 21:
                SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                savingsTransferOptionSelectionViewModel.getClass();
                SsnViewKt.Content((SavingsTransferOptionSelectionViewModel.Content) savingsTransferOptionSelectionViewModel, this.f$0, null, (Composer) obj3, (intValue14 >> 3) & 14, 4);
                return Unit.INSTANCE;
            case 22:
                SelectionViewModel selectionViewModel = (SelectionViewModel) obj2;
                Composer composer12 = (Composer) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                selectionViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer12, 0);
                GapComposer gapComposer24 = (GapComposer) composer12;
                int hashCode8 = Long.hashCode(gapComposer24.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer24.currentCompositionLocalScope();
                Modifier materializeModifier8 = PlatformKt.materializeModifier(composer12, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer25 = (GapComposer) composer12;
                if (gapComposer25.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer25.startReusableNode();
                if (gapComposer25.inserting) {
                    gapComposer25.createNode(layoutNode$Companion$Constructor$15);
                } else {
                    gapComposer25.useNode();
                }
                Updater.m576setimpl(composer12, columnMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer12, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer12, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer12, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                NavigationType navigationType3 = NavigationType.CLOSE;
                boolean changed17 = gapComposer25.changed(function12);
                Object rememberedValue18 = gapComposer25.rememberedValue();
                if (changed17 || rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = new SsnViewKt$$ExternalSyntheticLambda14(6, function12);
                    gapComposer25.updateRememberedValue(rememberedValue18);
                }
                DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue18, (Modifier) null, (Function3) null, composer12, 54, 108);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer12, null);
                int i10 = (intValue15 >> 3) & 14;
                SelectionViewKt.HeaderSection(selectionViewModel, SizeKt.fillMaxWidth(companion, 1.0f), composer12, i10 | 48);
                SelectionViewKt.OptionsSection(selectionViewModel.options, function12, composer12, 6);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                SpacerKt.Spacer(composer12, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                SelectionViewKt.FooterSection(selectionViewModel, function12, composer12, i10);
                gapComposer25.end(true);
                return Unit.INSTANCE;
            case 23:
                SignatureViewModel signatureViewModel = (SignatureViewModel) obj2;
                Composer composer13 = (Composer) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                int i11 = SignatureView.$r8$clinit;
                ((AnimatedVisibilityScope) obj).getClass();
                signatureViewModel.getClass();
                SsnViewKt.DrawSignature((SignatureViewModel.Content) signatureViewModel, function12, AspectRatio.rememberSignatureState(null, composer13, 1), composer13, ((intValue16 >> 3) & 14) | 512);
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$blockers$views$StatusResultViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3, obj4);
            case 25:
                return invoke$com$squareup$cash$blockers$views$VerifyContactsViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 26:
                SpendingInsightDetailViewModel spendingInsightDetailViewModel = (SpendingInsightDetailViewModel) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                spendingInsightDetailViewModel.getClass();
                zzaho.SpendingInsightDetailContent((SpendingInsightDetailViewModel.Content) spendingInsightDetailViewModel, function12, null, (Composer) obj3, (intValue17 >> 3) & 14);
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$card$spendinginsights$views$SpendingInsightsHomeViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 28:
                return invoke$com$squareup$cash$crypto$common$views$BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3, obj4);
            default:
                SelectContactMethodViewModel selectContactMethodViewModel = (SelectContactMethodViewModel) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                selectContactMethodViewModel.getClass();
                SponsorRowViewKt.SelectContactMethodContent((SelectContactMethodViewModel.Content) selectContactMethodViewModel, function12, (Composer) obj3, (intValue18 >> 3) & 14);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
