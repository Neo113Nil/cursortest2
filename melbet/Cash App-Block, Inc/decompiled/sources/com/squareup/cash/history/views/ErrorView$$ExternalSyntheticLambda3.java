package com.squareup.cash.history.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountUiViewKt$QrCode$1$1$1$1$1;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$history$views$InvestingRoundUpsFailedDialog$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = InvestingRoundUpsFailedDialog.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.f434lambda$789913472, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$InvestingRoundUpsSkippedDialog$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = InvestingRoundUpsSkippedDialog.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.f433lambda$1494252010, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$RefundPaymentView$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = RefundPaymentView.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.f430lambda$1229099602, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$RefundPaymentView$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = RefundPaymentView.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.lambda$472279265, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$SkipPaymentView$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = SkipPaymentView.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.f432lambda$1404649753, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$history$views$SkipPaymentView$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = SkipPaymentView.$r8$clinit;
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
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.lambda$638377050, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 24;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i3 = ErrorView.$r8$clinit;
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new ErrorView$$ExternalSyntheticLambda4(0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, ReportAbuseViewKt.lambda$1528735496, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(17, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight, buttonProminence, false, false, null, DirectDepositFormErrorKt.lambda$1215072167, gapComposer2, 1573248, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new EarningsHeaderKt$$ExternalSyntheticLambda2(25, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer4, R.string.earnings_home_title);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == obj4) {
                        rememberedValue4 = new EarningsHomeKt$$ExternalSyntheticLambda7(0, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer4, 48, 108);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = new EarningsHomeKt$$ExternalSyntheticLambda7(5, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue5, null, false, AddPayerCustomersViewKt.lambda$2127158916, gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, AddPayerCustomersViewKt.lambda$1636140023, AddPayerCustomersViewKt.lambda$2120776854, Expect_jvmKt.rememberComposableLambda(1355520834, new ErrorView$$ExternalSyntheticLambda3(6, function1), gapComposer6), Expect_jvmKt.rememberComposableLambda(1840157665, new ErrorView$$ExternalSyntheticLambda3(7, function1), gapComposer6), (Function3) null, gapComposer6, 28080, 33);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean changed6 = gapComposer7.changed(function1);
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = new EarningsHomeKt$$ExternalSyntheticLambda7(6, function1);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue6, null, false, AddPayerCustomersViewKt.lambda$206470167, gapComposer7, ((intValue7 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changed7 = gapComposer8.changed(function1);
                    Object rememberedValue7 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new EarningsHomeKt$$ExternalSyntheticLambda7(7, function1);
                        gapComposer8.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope4.SecondaryModalButton((Function0) rememberedValue7, null, false, AddPayerCustomersViewKt.lambda$1532338372, gapComposer8, ((intValue8 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, AddPayerCustomersViewKt.f391lambda$1322848668, AddPayerCustomersViewKt.f392lambda$269811901, Expect_jvmKt.rememberComposableLambda(-374902033, new ErrorView$$ExternalSyntheticLambda3(4, function1), gapComposer9), (Function3) null, (Function3) null, gapComposer9, 3504, 49);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed8 = gapComposer10.changed(function1);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new EarningsHomeKt$$ExternalSyntheticLambda7(15, function1);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth, buttonProminence2, false, false, null, NetEarningsInfoSheetViewKt.f396lambda$197679060, gapComposer10, 1573296, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    int i4 = intValue11;
                    Icons icons = Icons.NavigationFilter;
                    String stringResource2 = Room.stringResource(gapComposer11, R.string.earnings_tracker_navigation_action_timeframe_selector_label);
                    boolean changed9 = gapComposer11.changed(function1);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new EarningsHomeKt$$ExternalSyntheticLambda7(20, function1);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource2, (Function0) rememberedValue9, null, null, null, null, null, null, false, gapComposer11, (i4 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    NetEarningsInfoSheetViewKt.NetEarningsInfoSheet(0, gapComposer12, SpacerKt.padding(companion, paddingValues), function1);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed10 = gapComposer13.changed(function1);
                    Object rememberedValue10 = gapComposer13.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new EarningsHomeKt$$ExternalSyntheticLambda7(24, function1);
                        gapComposer13.updateRememberedValue(rememberedValue10);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth2, buttonProminence3, false, false, null, NetEarningsInfoSheetViewKt.f394lambda$1091704745, gapComposer13, 1573296, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer14.consume(providableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app);
                    Colors colors2 = (Colors) gapComposer14.consume(providableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(colors2.semantic.icon.brand);
                    int mo236toPx0680j_4 = (int) ((Density) gapComposer14.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
                    Unit unit = Unit.INSTANCE;
                    Function1 function12 = this.f$0;
                    boolean changed11 = gapComposer14.changed(function12) | gapComposer14.changed(m694toArgb8_81llA) | gapComposer14.changed(m694toArgb8_81llA2) | gapComposer14.changed(mo236toPx0680j_4);
                    Object rememberedValue11 = gapComposer14.rememberedValue();
                    if (changed11 || rememberedValue11 == obj4) {
                        rememberedValue11 = new AccountUiViewKt$QrCode$1$1$1$1$1(function12, m694toArgb8_81llA, m694toArgb8_81llA2, mo236toPx0680j_4, null, 1);
                        gapComposer14.updateRememberedValue(rememberedValue11);
                    }
                    Updater.LaunchedEffect(gapComposer14, unit, (Function2) rememberedValue11);
                    Object rememberedValue12 = gapComposer14.rememberedValue();
                    if (rememberedValue12 == obj4) {
                        rememberedValue12 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(8);
                        gapComposer14.updateRememberedValue(rememberedValue12);
                    }
                    Strings.LoadableFullScreenContent(null, true, null, (Function1) rememberedValue12, null, AllowanceViewKt.f408lambda$1608173300, gapComposer14, 199680, 20);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    boolean changed12 = gapComposer15.changed(function1);
                    Object rememberedValue13 = gapComposer15.rememberedValue();
                    if (changed12 || rememberedValue13 == obj4) {
                        rememberedValue13 = new SafetyHubViewKt$$ExternalSyntheticLambda9(12, function1);
                        gapComposer15.updateRememberedValue(rememberedValue13);
                    }
                    modalButtonScope5.PrimaryModalButton((Function0) rememberedValue13, null, false, SponsorRowViewKt.lambda$821008033, gapComposer15, ((intValue15 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed13 = gapComposer16.changed(function1);
                    Object rememberedValue14 = gapComposer16.rememberedValue();
                    if (changed13 || rememberedValue14 == obj4) {
                        rememberedValue14 = new SafetyHubViewKt$$ExternalSyntheticLambda9(17, function1);
                        gapComposer16.updateRememberedValue(rememberedValue14);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue14, (Modifier) null, (Function3) null, gapComposer16, 54, 108);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer17, null);
                    boolean changed14 = gapComposer17.changed(function1);
                    Object rememberedValue15 = gapComposer17.rememberedValue();
                    if (changed14 || rememberedValue15 == obj4) {
                        rememberedValue15 = new SafetyHubViewKt$$ExternalSyntheticLambda9(19, function1);
                        gapComposer17.updateRememberedValue(rememberedValue15);
                    }
                    SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer17, null, null, null, (Function0) rememberedValue15);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changed15 = gapComposer18.changed(function1);
                    Object rememberedValue16 = gapComposer18.rememberedValue();
                    if (changed15 || rememberedValue16 == obj4) {
                        rememberedValue16 = new SafetyHubViewKt$$ExternalSyntheticLambda9(20, function1);
                        gapComposer18.updateRememberedValue(rememberedValue16);
                    }
                    modalButtonScope6.SecondaryModalButton((Function0) rememberedValue16, null, false, AddFavoritesViewKt.f421lambda$411493287, gapComposer18, ((intValue18 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ModalButtonScope modalButtonScope7 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                modalButtonScope7.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer19).changed(modalButtonScope7) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    boolean changed16 = gapComposer19.changed(function1);
                    Object rememberedValue17 = gapComposer19.rememberedValue();
                    if (changed16 || rememberedValue17 == obj4) {
                        rememberedValue17 = new SafetyHubViewKt$$ExternalSyntheticLambda9(21, function1);
                        gapComposer19.updateRememberedValue(rememberedValue17);
                    }
                    modalButtonScope7.PrimaryModalButton((Function0) rememberedValue17, null, false, AddFavoritesViewKt.lambda$171959064, gapComposer19, ((intValue19 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
                    Object rememberedValue18 = gapComposer20.rememberedValue();
                    if (rememberedValue18 == obj4) {
                        rememberedValue18 = new GpsConfigQueries$$ExternalSyntheticLambda1(i2);
                        gapComposer20.updateRememberedValue(rememberedValue18);
                    }
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue18));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer20, 48);
                    int hashCode = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer20, animateItem$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer20, null);
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    String stringResource3 = Room.stringResource(gapComposer20, R.string.search_error_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer20, fillMaxWidth3, ((Typography) gapComposer20.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                    Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    String stringResource4 = Room.stringResource(gapComposer20, R.string.search_error_subtitle);
                    Colors colors3 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors3.semantic.text.subtle, (Composer) gapComposer20, fillMaxWidth4, ((Typography) gapComposer20.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, stringResource4, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer20, null);
                    boolean changed17 = gapComposer20.changed(function1);
                    Object rememberedValue19 = gapComposer20.rememberedValue();
                    if (changed17 || rememberedValue19 == obj4) {
                        rememberedValue19 = new ErrorView$$ExternalSyntheticLambda4(4, function1);
                        gapComposer20.updateRememberedValue(rememberedValue19);
                    }
                    SizeKt.Button((Function0) rememberedValue19, null, null, false, false, null, QuickAccessBarKt.lambda$767857238, gapComposer20, 1572864, 62);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    String stringResource5 = Room.stringResource(gapComposer21, R.string.activity_title);
                    boolean changed18 = gapComposer21.changed(function1);
                    Object rememberedValue20 = gapComposer21.rememberedValue();
                    if (changed18 || rememberedValue20 == obj4) {
                        rememberedValue20 = new ErrorView$$ExternalSyntheticLambda4(8, function1);
                        gapComposer21.updateRememberedValue(rememberedValue20);
                    }
                    embeddedHeaderScope.DefaultHeader((intValue21 << 9) & 7168, 2, gapComposer21, stringResource5, null, (Function0) rememberedValue20);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ModalButtonScope modalButtonScope8 = (ModalButtonScope) obj;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                int i5 = CancelPaymentView.$r8$clinit;
                modalButtonScope8.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer22).changed(modalButtonScope8) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    boolean changed19 = gapComposer22.changed(function1);
                    Object rememberedValue21 = gapComposer22.rememberedValue();
                    if (changed19 || rememberedValue21 == obj4) {
                        rememberedValue21 = new ErrorView$$ExternalSyntheticLambda4(13, function1);
                        gapComposer22.updateRememberedValue(rememberedValue21);
                    }
                    modalButtonScope8.PrimaryModalButton((Function0) rememberedValue21, null, false, ReportAbuseViewKt.f431lambda$1391988052, gapComposer22, ((intValue22 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ModalButtonScope modalButtonScope9 = (ModalButtonScope) obj;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                int i6 = CancelPaymentView.$r8$clinit;
                modalButtonScope9.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer23).changed(modalButtonScope9) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    boolean changed20 = gapComposer23.changed(function1);
                    Object rememberedValue22 = gapComposer23.rememberedValue();
                    if (changed20 || rememberedValue22 == obj4) {
                        rememberedValue22 = new ErrorView$$ExternalSyntheticLambda4(12, function1);
                        gapComposer23.updateRememberedValue(rememberedValue22);
                    }
                    modalButtonScope9.SecondaryModalButton((Function0) rememberedValue22, null, false, ReportAbuseViewKt.lambda$309390815, gapComposer23, ((intValue23 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$history$views$InvestingRoundUpsFailedDialog$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$history$views$InvestingRoundUpsSkippedDialog$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$history$views$RefundPaymentView$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$history$views$RefundPaymentView$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$history$views$SkipPaymentView$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$history$views$SkipPaymentView$$ExternalSyntheticLambda4(obj, obj2, obj3);
            default:
                ModalButtonScope modalButtonScope10 = (ModalButtonScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                modalButtonScope10.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(modalButtonScope10) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    boolean changed21 = gapComposer24.changed(function1);
                    Object rememberedValue23 = gapComposer24.rememberedValue();
                    if (changed21 || rememberedValue23 == obj4) {
                        rememberedValue23 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(5, function1);
                        gapComposer24.updateRememberedValue(rememberedValue23);
                    }
                    modalButtonScope10.PrimaryModalButton((Function0) rememberedValue23, null, false, AppUpgradeViewKt.f435lambda$1351300441, gapComposer24, ((intValue24 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
