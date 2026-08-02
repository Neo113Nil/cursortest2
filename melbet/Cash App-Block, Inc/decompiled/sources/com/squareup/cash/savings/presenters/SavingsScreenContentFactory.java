package com.squareup.cash.savings.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.screen.Screen;
import com.fillr.e;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.ActivityItemEventHandlerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.cdf.savingsgoal.SavingsGoalRemoveRemove;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.data.ActiveGoal;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.viewmodels.CelebrationViewModel;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.HeroNumericsBodyTextViewModel;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$InformationClicked;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$RouteClicked;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import papa.InputEventTrigger;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes7.dex */
public final class SavingsScreenContentFactory {
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final RealDisclosureProvider disclosureProvider;
    public final ErrorReporter errorReporter;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Lazy percentFormatter$delegate;
    public final SavingsActivityItemEventDecorator savingsActivityItemEventDecorator;
    public final SavingsUpsellCardPresenter$Factory$Impl savingsUpsellCardFactory;
    public final SavingsScreen.ScreenType screenType;
    public final AndroidStringManager stringManager;

    public SavingsScreenContentFactory(AndroidStringManager androidStringManager, ErrorReporter errorReporter, RealDisclosureProvider realDisclosureProvider, SavingsUpsellCardPresenter$Factory$Impl savingsUpsellCardPresenter$Factory$Impl, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, SavingsActivityItemEventDecorator savingsActivityItemEventDecorator, BetterNavigator.ScreenNavigator screenNavigator, SavingsScreen.ScreenType screenType, LocalizedMoneyFormatter.Factory factory) {
        screenType.getClass();
        this.stringManager = androidStringManager;
        this.errorReporter = errorReporter;
        this.disclosureProvider = realDisclosureProvider;
        this.savingsUpsellCardFactory = savingsUpsellCardPresenter$Factory$Impl;
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.savingsActivityItemEventDecorator = savingsActivityItemEventDecorator;
        this.navigator = screenNavigator;
        this.screenType = screenType;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.percentFormatter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new DateScrubber$$ExternalSyntheticLambda0(22));
    }

    public static float calculateProgress(SavingsFolder.GoalFolder goalFolder) {
        Long l = goalFolder.goalAmount.amount;
        float f = RecyclerView.DECELERATION_RATE;
        float longValue = l != null ? l.longValue() : 0.0f;
        if (longValue <= RecyclerView.DECELERATION_RATE) {
            return RecyclerView.DECELERATION_RATE;
        }
        Long l2 = goalFolder.balance.amount;
        if (l2 != null) {
            f = l2.longValue();
        }
        return Math.min(f / longValue, 1.0f);
    }

    public static SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button toButton(SavingsScreen.Element.ButtonGroup.Button button) {
        String str = button.text;
        Icon icon = button.icon;
        ButtonProminence.Id id = button.prominence;
        String str2 = button.clientRoute;
        return new SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button(str, icon, id, str2 != null ? new SavingsScreenViewEvent.Clicked(str2, button.cdfEvent, null) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SavingsScreenViewModel.Content content(SavingsScreen savingsScreen, Money money, List list, ActiveGoal activeGoal, Animation animation, Flow flow, boolean z, SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent, SavingsActivitySectionParams savingsActivitySectionParams, GapComposer gapComposer, int i, int i2, int i3) {
        Iterator it;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        ArrayList arrayList2;
        AndroidStringManager androidStringManager;
        Resources resources;
        Object sectionHeader;
        SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection buttonGroupDirection;
        String str4;
        CellDefaultViewModel.Icon icon;
        CellDefaultViewModel.Accessory accessory;
        CellDefaultViewModel.Accessory accessory2;
        String str5;
        SavingsScreenViewEvent.Clicked clicked;
        SavingsScreenViewEvent.Clicked clicked2;
        CellDefaultViewModel.Icon tintedIcon;
        boolean z2;
        Object obj;
        Iterator it2;
        CdfEvent cdfEvent;
        SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon progressIcon;
        boolean z3;
        String str6;
        String format2;
        String format3;
        String str7;
        Map<String, String> map;
        SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection buttonGroupDirection2;
        float f;
        float f2;
        String str8;
        boolean z4;
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer goalAmountRemaining;
        Money money2;
        Float f3;
        Money money3 = money;
        SavingsActivitySectionParams savingsActivitySectionParams2 = savingsActivitySectionParams;
        AndroidStringManager androidStringManager2 = this.stringManager;
        Resources resources2 = androidStringManager2.resources;
        flow.getClass();
        String str9 = savingsScreen.title;
        String str10 = "";
        if (str9 == null) {
            SavingsScreen.ScreenType screenType = savingsScreen.f1196type;
            if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.Home.INSTANCE)) {
                str9 = androidStringManager2.get(R.string.savings_home_title);
            } else if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
                str9 = androidStringManager2.get(R.string.savings_general_savings_title);
            } else {
                if (!(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str9 = activeGoal != null ? activeGoal.label : "";
            }
        }
        boolean z5 = false;
        boolean z6 = (i3 & 1024) == 0;
        gapComposer.startReplaceGroup(-1106205017);
        ArrayList arrayList3 = savingsScreen.elements;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            SavingsScreen.Element element = (SavingsScreen.Element) it3.next();
            if (element instanceof SavingsScreen.Element.NoGoalHeader) {
                gapComposer.startReplaceGroup(1039287314);
                gapComposer.end(z5);
                SavingsScreen.Element.NoGoalHeader noGoalHeader = (SavingsScreen.Element.NoGoalHeader) element;
                sectionHeader = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader(toBalance(money3, noGoalHeader.body, noGoalHeader.additionalBody, noGoalHeader.sectionTitleText), balanceSeenEvent);
                it = it3;
                arrayList2 = arrayList4;
                androidStringManager = androidStringManager2;
                resources = resources2;
                str2 = str10;
                str3 = str9;
            } else {
                boolean z7 = element instanceof SavingsScreen.Element.GoalHeader;
                Lazy lazy = this.percentFormatter$delegate;
                it = it3;
                MoneyFormatter moneyFormatter = this.moneyFormatter;
                if (z7) {
                    gapComposer.startReplaceGroup(-2141738167);
                    gapComposer.end(false);
                    if (activeGoal != null) {
                        ActiveGoal.LastSeenStatus lastSeenStatus = activeGoal.lastSeenStatus;
                        SavingsScreen.Element.GoalHeader goalHeader = (SavingsScreen.Element.GoalHeader) element;
                        str = str9;
                        String str11 = activeGoal.token;
                        arrayList = arrayList4;
                        Money money4 = activeGoal.amountRemaining;
                        float f4 = activeGoal.progress;
                        if (lastSeenStatus == null || (f3 = lastSeenStatus.progress) == null) {
                            f = RecyclerView.DECELERATION_RATE;
                        } else {
                            f = f3.floatValue();
                            if (f >= f4) {
                                f = f4;
                            }
                        }
                        float f5 = f;
                        if (lastSeenStatus == null || (money2 = lastSeenStatus.amountRemaining) == null) {
                            CurrencyCode currencyCode = money3.currency_code;
                            if (currencyCode != null) {
                                money4 = Moneys.zero(currencyCode);
                            } else {
                                str2 = str10;
                                money4 = new Money((Long) 0L, (CurrencyCode) null, 6);
                                if (goalHeader.showPageHeader) {
                                    f2 = f4;
                                    str8 = null;
                                } else {
                                    str8 = activeGoal.label;
                                    f2 = f4;
                                }
                                SavingsScreen.Element.BetweenSection betweenSection = goalHeader.pageHeaderBottomSpacing;
                                SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection2 = betweenSection == null ? new SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection(betweenSection.variant) : null;
                                SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance balance = toBalance(money3, goalHeader.goalFolderBalanceBody, null, null);
                                String str12 = activeGoal.iconId;
                                z4 = activeGoal.isMet;
                                float f6 = f2;
                                String str13 = !z4 ? goalHeader.goalMetText : null;
                                if (!z4 && z6) {
                                    goalAmountRemaining = null;
                                } else if (z4) {
                                    String format4 = moneyFormatter.format(money4);
                                    Long l = money4.amount;
                                    l.getClass();
                                    goalAmountRemaining = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining(new SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount(format4, l.longValue()), goalHeader.remainingGoalAmountSubtitle);
                                } else {
                                    String str14 = goalHeader.removeGoalButtonText;
                                    String str15 = goalHeader.removeGoalClientRouteTemplate;
                                    goalAmountRemaining = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet(new SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet.Button(str14, str15 != null ? new SavingsScreenViewEvent.Clicked(String.format(str15, Arrays.copyOf(new Object[]{activeGoal.goalFlowParameters}, 1)), null, new SavingsGoalRemoveRemove(str11)) : new SavingsScreenViewEvent.RemoveActiveGoal(str11), !z));
                                }
                                String format5 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(f6));
                                format5.getClass();
                                resources2.getClass();
                                String format6 = new MessageFormat(resources2.getString(R.string.savings_goal_progress_accessibility_label)).format(new Object[]{format5});
                                format6.getClass();
                                sectionHeader = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader(str8, betweenSection2, f5, balance, str12, str13, goalAmountRemaining, format6, balanceSeenEvent);
                                androidStringManager = androidStringManager2;
                                resources = resources2;
                                str3 = str;
                                arrayList2 = arrayList;
                            }
                        } else if (Moneys.compareTo(money2, money4) > 0) {
                            money4 = money2;
                        }
                        str2 = str10;
                        if (goalHeader.showPageHeader) {
                        }
                        SavingsScreen.Element.BetweenSection betweenSection3 = goalHeader.pageHeaderBottomSpacing;
                        if (betweenSection3 == null) {
                        }
                        SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance balance2 = toBalance(money3, goalHeader.goalFolderBalanceBody, null, null);
                        String str122 = activeGoal.iconId;
                        z4 = activeGoal.isMet;
                        float f62 = f2;
                        if (!z4) {
                        }
                        if (!z4) {
                        }
                        if (z4) {
                        }
                        String format52 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(f62));
                        format52.getClass();
                        resources2.getClass();
                        String format62 = new MessageFormat(resources2.getString(R.string.savings_goal_progress_accessibility_label)).format(new Object[]{format52});
                        format62.getClass();
                        sectionHeader = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader(str8, betweenSection2, f5, balance2, str122, str13, goalAmountRemaining, format62, balanceSeenEvent);
                        androidStringManager = androidStringManager2;
                        resources = resources2;
                        str3 = str;
                        arrayList2 = arrayList;
                    } else {
                        str = str9;
                        arrayList = arrayList4;
                        str2 = str10;
                        sectionHeader = null;
                        androidStringManager = androidStringManager2;
                        resources = resources2;
                        str3 = str;
                        arrayList2 = arrayList;
                    }
                } else {
                    str = str9;
                    arrayList = arrayList4;
                    str2 = str10;
                    if (element instanceof SavingsScreen.Element.TransferButtons) {
                        gapComposer.startReplaceGroup(1039294205);
                        gapComposer.end(false);
                        SavingsScreen.Element.TransferButtons transferButtons = (SavingsScreen.Element.TransferButtons) element;
                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton = toTransferButton(transferButtons.transferInButton, money3);
                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton2 = toTransferButton(transferButtons.transferOutButton, money3);
                        int ordinal = transferButtons.direction.ordinal();
                        if (ordinal == 0) {
                            buttonGroupDirection2 = SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.HORIZONTAL;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            buttonGroupDirection2 = SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.VERTICAL;
                        }
                        sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons(transferButton, transferButton2, buttonGroupDirection2);
                    } else if (element instanceof SavingsScreen.Element.FolderList) {
                        gapComposer.startReplaceGroup(-2141551609);
                        gapComposer.end(false);
                        if (list != null) {
                            SavingsScreen.Element.FolderList folderList = (SavingsScreen.Element.FolderList) element;
                            List list2 = list;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                SavingsFolder savingsFolder = (SavingsFolder) it4.next();
                                CdfEvent cdfEvent2 = folderList.tapCdfEvent;
                                if (cdfEvent2 != null) {
                                    MapBuilder mapBuilder = new MapBuilder();
                                    CdfEvent.Parameters parameters = cdfEvent2.parameters;
                                    if (parameters != null && (map = parameters.values) != null) {
                                        mapBuilder.putAll(map);
                                    }
                                    if (savingsFolder instanceof SavingsFolder.GeneralFolder) {
                                        str7 = "GENERAL_SAVINGS_FOLDER";
                                    } else {
                                        if (!(savingsFolder instanceof SavingsFolder.GoalFolder)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str7 = "GOAL_FOLDER";
                                    }
                                    mapBuilder.put("folder_type", str7);
                                    if (savingsFolder instanceof SavingsFolder.GoalFolder) {
                                        mapBuilder.put("goal_token", ((SavingsFolder.GoalFolder) savingsFolder).token);
                                    }
                                    it2 = it4;
                                    cdfEvent = CdfEvent.copy$default(cdfEvent2, new CdfEvent.Parameters(mapBuilder.build(), null, 2, null), null, 5);
                                } else {
                                    it2 = it4;
                                    cdfEvent = null;
                                }
                                boolean z8 = savingsFolder instanceof SavingsFolder.GeneralFolder;
                                if (z8) {
                                    e eVar = Emojis.Companion;
                                    progressIcon = new SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.Default();
                                    z3 = z8;
                                } else {
                                    if (!(savingsFolder instanceof SavingsFolder.GoalFolder)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    SavingsFolder.GoalFolder goalFolder = (SavingsFolder.GoalFolder) savingsFolder;
                                    String str16 = goalFolder.iconId;
                                    z3 = z8;
                                    Float f7 = goalFolder.progress;
                                    progressIcon = new SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.ProgressIcon(str16, f7 != null ? f7.floatValue() : calculateProgress(goalFolder));
                                }
                                if (z3) {
                                    str6 = folderList.generalSavingsLabel;
                                    if (str6 == null) {
                                        str6 = androidStringManager2.get(R.string.savings_general_savings_folder_title);
                                    }
                                } else {
                                    if (!(savingsFolder instanceof SavingsFolder.GoalFolder)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str6 = ((SavingsFolder.GoalFolder) savingsFolder).label;
                                }
                                String str17 = str6;
                                if (z3) {
                                    format2 = folderList.generalSavingsBody;
                                } else {
                                    if (!(savingsFolder instanceof SavingsFolder.GoalFolder)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    SavingsFolder.GoalFolder goalFolder2 = (SavingsFolder.GoalFolder) savingsFolder;
                                    Float f8 = goalFolder2.progress;
                                    float floatValue = f8 != null ? f8.floatValue() : calculateProgress(goalFolder2);
                                    format2 = floatValue >= 1.0f ? folderList.goalFolderCompletedBody : String.format(folderList.goalFolderBodyTemplate, Arrays.copyOf(new Object[]{((NumberFormat) lazy.getValue()).format(Float.valueOf(floatValue))}, 1));
                                }
                                String str18 = format2;
                                String format7 = moneyFormatter.format(savingsFolder.getBalance());
                                if (savingsFolder instanceof SavingsFolder.GeneralFolder) {
                                    format3 = folderList.generalSavingsClientRoute;
                                } else {
                                    if (!(savingsFolder instanceof SavingsFolder.GoalFolder)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    format3 = String.format(folderList.goalFolderClientRouteTemplate, Arrays.copyOf(new Object[]{((SavingsFolder.GoalFolder) savingsFolder).token}, 1));
                                }
                                arrayList5.add(new SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder(progressIcon, str17, str18, format7, new SavingsScreenViewEvent.Clicked(format3, cdfEvent, null)));
                                it4 = it2;
                            }
                            sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList(arrayList5);
                        } else {
                            sectionHeader = null;
                        }
                    } else {
                        boolean z9 = element instanceof SavingsScreen.Element.ActivitySection;
                        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (z9) {
                            gapComposer.startReplaceGroup(1039298308);
                            SavingsScreen.Element.ActivitySection activitySection = (SavingsScreen.Element.ActivitySection) element;
                            gapComposer.startReplaceGroup(1233116912);
                            if ((savingsActivitySectionParams2 != null ? savingsActivitySectionParams2.activityContext : null) == null || savingsActivitySectionParams2.activityCache == null) {
                                z2 = false;
                                gapComposer.end(false);
                                obj = null;
                            } else {
                                boolean changed = gapComposer.changed(savingsActivitySectionParams2);
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    ActivitiesManager.ActivityContext activityContext = savingsActivitySectionParams2.activityContext;
                                    ActivitiesCache activitiesCache = savingsActivitySectionParams2.activityCache;
                                    ActivityItemEventHandlerKt$$ExternalSyntheticLambda0 decoratedWith = InputEventTrigger.Companion.decoratedWith(this.defaultActivityItemEventHandlerFactory, this.savingsActivityItemEventDecorator);
                                    Screen screen = savingsActivitySectionParams2.screenContext;
                                    String str19 = activitySection.noActivitySubtitle;
                                    if (str19 == null) {
                                        str19 = androidStringManager2.get(R.string.recent_activities_empty_text);
                                    }
                                    String str20 = str19;
                                    String str21 = activitySection.errorSubtitle;
                                    if (str21 == null) {
                                        str21 = androidStringManager2.get(R.string.recent_activities_error_text);
                                    }
                                    rememberedValue = this.activityEmbeddedPresenterFactory.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, activitiesCache, screen, new ShareSheetViewKt$$ExternalSyntheticLambda5(7, this, savingsActivitySectionParams2), 3, str20, str21, decoratedWith, null, null, 7240));
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                z2 = false;
                                obj = new SavingsScreenViewModel.Content.SavingsScreenElement.ActivitySection(((RealActivityEmbeddedPresenter) rememberedValue).models(gapComposer, 0), activitySection.header.title);
                                gapComposer.end(false);
                            }
                            gapComposer.end(z2);
                            sectionHeader = obj;
                            androidStringManager = androidStringManager2;
                            resources = resources2;
                            str3 = str;
                            arrayList2 = arrayList;
                        } else {
                            if (element instanceof SavingsScreen.Element.Disclosure) {
                                gapComposer.startReplaceGroup(1039300369);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    DisclosureForScreen disclosureForScreen = DisclosureForScreen.SAVINGS_HOME;
                                    String str22 = LegalUrl.TermsOfService;
                                    String str23 = LegalUrl.Savings;
                                    str22.getClass();
                                    str23.getClass();
                                    ArrayMap arrayMap = new ArrayMap(2);
                                    arrayMap.put("tos_url", str22);
                                    arrayMap.put("savings_url", str23);
                                    resources2.getClass();
                                    String format8 = new MessageFormat(resources2.getString(R.string.savings_home_fdic_disclaimer)).format(arrayMap);
                                    format8.getClass();
                                    rememberedValue2 = this.disclosureProvider.disclosure(disclosureForScreen, format8);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                Flow flow2 = (Flow) rememberedValue2;
                                str3 = str;
                                arrayList2 = arrayList;
                                Disclosure disclosure = (Disclosure) Updater.collectAsState(flow2, null, null, gapComposer, 48, 2).getValue();
                                if (disclosure != null) {
                                    boolean z10 = disclosure.showIcon;
                                    String str24 = disclosure.text;
                                    if (str24 == null) {
                                        str24 = str2;
                                    }
                                    sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.Disclosure(z10, str24);
                                } else {
                                    sectionHeader = null;
                                }
                                gapComposer.end(false);
                                androidStringManager = androidStringManager2;
                            } else {
                                str3 = str;
                                arrayList2 = arrayList;
                                if (element instanceof SavingsScreen.Element.CellDefault) {
                                    gapComposer.startReplaceGroup(1039301898);
                                    SavingsScreen.Element.CellDefault cellDefault = (SavingsScreen.Element.CellDefault) element;
                                    String str25 = activeGoal != null ? activeGoal.goalFlowParameters : null;
                                    String str26 = cellDefault.label;
                                    String str27 = cellDefault.body;
                                    SavingsScreen.Element.CellDefault.Icon icon2 = cellDefault.icon;
                                    String str28 = str25;
                                    if (icon2 != null) {
                                        if (icon2 instanceof SavingsScreen.Element.CellDefault.Icon.DefaultIcon) {
                                            tintedIcon = new CellDefaultViewModel.Icon.DefaultIcon(((SavingsScreen.Element.CellDefault.Icon.DefaultIcon) icon2).icon);
                                            str4 = str26;
                                            androidStringManager = androidStringManager2;
                                        } else {
                                            if (!(icon2 instanceof SavingsScreen.Element.CellDefault.Icon.TintedIcon)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            SavingsScreen.Element.CellDefault.Icon.TintedIcon tintedIcon2 = (SavingsScreen.Element.CellDefault.Icon.TintedIcon) icon2;
                                            Icon icon3 = tintedIcon2.icon;
                                            str4 = str26;
                                            androidStringManager = androidStringManager2;
                                            ColorModel.Accented accented = new ColorModel.Accented(tintedIcon2.backgroundTint);
                                            Color color = tintedIcon2.tint;
                                            tintedIcon = new CellDefaultViewModel.Icon.TintedIcon(icon3, accented, color != null ? new ColorModel.Accented(color) : null);
                                        }
                                        icon = tintedIcon;
                                    } else {
                                        str4 = str26;
                                        androidStringManager = androidStringManager2;
                                        icon = null;
                                    }
                                    SavingsScreen.Element.CellDefault.Accessory accessory3 = cellDefault.accessory;
                                    if (accessory3 == null) {
                                        gapComposer.startReplaceGroup(355406362);
                                        gapComposer.end(false);
                                        accessory2 = null;
                                    } else {
                                        boolean z11 = false;
                                        gapComposer.startReplaceGroup(1812580039);
                                        if (accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.Push) {
                                            gapComposer.startReplaceGroup(1141411299);
                                            gapComposer.end(false);
                                            accessory = CellDefaultViewModel.Accessory.Push.INSTANCE;
                                        } else {
                                            if (accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.LabeledPush) {
                                                gapComposer.startReplaceGroup(1141415431);
                                                gapComposer.end(false);
                                                SavingsScreen.Element.CellDefault.Accessory.LabeledPush labeledPush = (SavingsScreen.Element.CellDefault.Accessory.LabeledPush) accessory3;
                                                String str29 = labeledPush.text;
                                                Color color2 = labeledPush.textColor;
                                                accessory = new CellDefaultViewModel.Accessory.LabeledPush(str29, color2 != null ? new ColorModel.Accented(color2) : null);
                                            } else if (accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.CompactButton) {
                                                gapComposer.startReplaceGroup(1141419743);
                                                z11 = false;
                                                gapComposer.end(false);
                                                SavingsScreen.Element.CellDefault.Accessory.CompactButton compactButton = (SavingsScreen.Element.CellDefault.Accessory.CompactButton) accessory3;
                                                accessory = new CellDefaultViewModel.Accessory.CompactButton(compactButton.text, compactButton.prominence);
                                            } else if (accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.Label) {
                                                gapComposer.startReplaceGroup(1141423275);
                                                gapComposer.end(false);
                                                accessory = new CellDefaultViewModel.Accessory.Label(((SavingsScreen.Element.CellDefault.Accessory.Label) accessory3).text);
                                            } else {
                                                if (!(accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.Checkbox) && !(accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.Radio) && !(accessory3 instanceof SavingsScreen.Element.CellDefault.Accessory.Toggle)) {
                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1141410114, false);
                                                }
                                                gapComposer.startReplaceGroup(1024543894);
                                                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(accessory3);
                                                Object rememberedValue3 = gapComposer.rememberedValue();
                                                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                                                    rememberedValue3 = new ProfileCropView.AnonymousClass3(this, accessory3, null, 8);
                                                    gapComposer.updateRememberedValue(rememberedValue3);
                                                }
                                                Updater.LaunchedEffect(gapComposer, accessory3, (Function2) rememberedValue3);
                                                z11 = false;
                                                gapComposer.end(false);
                                                accessory = null;
                                            }
                                            z11 = false;
                                        }
                                        gapComposer.end(z11);
                                        accessory2 = accessory;
                                    }
                                    SavingsScreen.Element.CellDefault.TemplateClientRoute templateClientRoute = cellDefault.templateClientRoute;
                                    if (templateClientRoute != null) {
                                        String str30 = templateClientRoute.clientRouteTemplate;
                                        if (str28 == null) {
                                            str28 = str2;
                                        }
                                        clicked2 = new SavingsScreenViewEvent.Clicked(String.format(str30, Arrays.copyOf(new Object[]{str28}, 1)), templateClientRoute.cdfEvent, null);
                                    } else {
                                        SavingsAction savingsAction = cellDefault.action;
                                        if (savingsAction == null) {
                                            str5 = str4;
                                            clicked = null;
                                            Object cellDefaultElement = new SavingsScreenViewModel.Content.CellDefaultElement(new CellDefaultViewModel(str5, str27, icon, accessory2, clicked));
                                            gapComposer.end(false);
                                            sectionHeader = cellDefaultElement;
                                        } else if (savingsAction instanceof SavingsAction.ClientRoute) {
                                            SavingsAction.ClientRoute clientRoute = (SavingsAction.ClientRoute) savingsAction;
                                            String str31 = clientRoute.route;
                                            CdfEvent cdfEvent3 = clientRoute.cdfEvent;
                                            str31.getClass();
                                            clicked2 = new SavingsScreenViewEvent.Clicked(str31, cdfEvent3, null);
                                        } else {
                                            if (!(savingsAction instanceof SavingsAction.PresentCard)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            clicked = null;
                                            str5 = str4;
                                            Object cellDefaultElement2 = new SavingsScreenViewModel.Content.CellDefaultElement(new CellDefaultViewModel(str5, str27, icon, accessory2, clicked));
                                            gapComposer.end(false);
                                            sectionHeader = cellDefaultElement2;
                                        }
                                    }
                                    clicked = clicked2;
                                    str5 = str4;
                                    Object cellDefaultElement22 = new SavingsScreenViewModel.Content.CellDefaultElement(new CellDefaultViewModel(str5, str27, icon, accessory2, clicked));
                                    gapComposer.end(false);
                                    sectionHeader = cellDefaultElement22;
                                } else {
                                    androidStringManager = androidStringManager2;
                                    if (element instanceof SavingsScreen.Element.ButtonGroup) {
                                        gapComposer.startReplaceGroup(1039304178);
                                        gapComposer.end(false);
                                        SavingsScreen.Element.ButtonGroup buttonGroup = (SavingsScreen.Element.ButtonGroup) element;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button = toButton(buttonGroup.primaryButton);
                                        SavingsScreen.Element.ButtonGroup.Button button2 = buttonGroup.secondaryButton;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button3 = button2 != null ? toButton(button2) : null;
                                        SavingsScreen.Element.ButtonGroup.Button button4 = buttonGroup.tertiaryButton;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button5 = button4 != null ? toButton(button4) : null;
                                        int ordinal2 = buttonGroup.direction.ordinal();
                                        if (ordinal2 == 0) {
                                            buttonGroupDirection = SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.HORIZONTAL;
                                        } else {
                                            if (ordinal2 != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            buttonGroupDirection = SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.VERTICAL;
                                        }
                                        sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup(button, button3, button5, buttonGroupDirection);
                                    } else if (element instanceof SavingsScreen.Element.CompactCard) {
                                        gapComposer.startReplaceGroup(1039305714);
                                        gapComposer.end(false);
                                        SavingsScreen.Element.CompactCard compactCard = (SavingsScreen.Element.CompactCard) element;
                                        String str32 = compactCard.body;
                                        CardImage cardImage = compactCard.image;
                                        SavingsScreen.Element.CompactCard.Button button6 = compactCard.button;
                                        resources = resources2;
                                        sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard(str32, cardImage, new SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard.Button(button6.text, button6.icon, button6.prominence, new UpsellCardEvent.RouterClicked(button6.clientRoute, button6.cdfEvent)));
                                    } else {
                                        resources = resources2;
                                        if (element instanceof SavingsScreen.Element.CardElement) {
                                            gapComposer.startReplaceGroup(1039307253);
                                            SavingsScreen.Element.CardElement cardElement = (SavingsScreen.Element.CardElement) element;
                                            Object rememberedValue4 = gapComposer.rememberedValue();
                                            if (rememberedValue4 == neverEqualPolicy) {
                                                rememberedValue4 = this.savingsUpsellCardFactory.create(new SavingsCardSheet(cardElement.card, new GeneralSavingsScreen(this.screenType)), screenNavigator);
                                                gapComposer.updateRememberedValue(rememberedValue4);
                                            }
                                            sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.Card(((SavingsUpsellCardPresenter) rememberedValue4).models(flow, (Composer) gapComposer, 0));
                                            gapComposer.end(false);
                                        } else if (element instanceof SavingsScreen.Element.WithinSection) {
                                            gapComposer.startReplaceGroup(1039308948);
                                            gapComposer.end(false);
                                            sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection(((SavingsScreen.Element.WithinSection) element).variant);
                                        } else if (element instanceof SavingsScreen.Element.BetweenSection) {
                                            gapComposer.startReplaceGroup(1039310645);
                                            gapComposer.end(false);
                                            sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection(((SavingsScreen.Element.BetweenSection) element).variant);
                                        } else {
                                            if (!(element instanceof SavingsScreen.Element.SectionHeader)) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1039286616, false);
                                            }
                                            gapComposer.startReplaceGroup(1039312340);
                                            gapComposer.end(false);
                                            sectionHeader = new SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader(((SavingsScreen.Element.SectionHeader) element).title);
                                        }
                                    }
                                }
                            }
                            resources = resources2;
                        }
                    }
                    androidStringManager = androidStringManager2;
                    resources = resources2;
                    str3 = str;
                    arrayList2 = arrayList;
                }
            }
            if (sectionHeader != null) {
                arrayList2.add(sectionHeader);
            }
            money3 = money;
            savingsActivitySectionParams2 = savingsActivitySectionParams;
            arrayList4 = arrayList2;
            str9 = str3;
            resources2 = resources;
            androidStringManager2 = androidStringManager;
            str10 = str2;
            z5 = false;
            it3 = it;
        }
        String str33 = str9;
        ArrayList arrayList6 = arrayList4;
        gapComposer.end(z5);
        return new SavingsScreenViewModel.Content(str33, arrayList6, (activeGoal == null || animation == null || !activeGoal.isMet || activeGoal.hasBeenCelebrated) ? null : new CelebrationViewModel(animation, new SavingsScreenViewEvent.GoalCelebrationSeen(activeGoal.token, activeGoal.completionToken)));
    }

    public final SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance toBalance(Money money, SavingsScreen.Element.BodyText bodyText, String str, String str2) {
        HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel;
        SavingsAction savingsAction;
        String format2 = this.moneyFormatter.format(money);
        Long l = money.amount;
        l.getClass();
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount amount = new SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount(format2, l.longValue());
        ViewGroupKt viewGroupKt = null;
        if (bodyText != null) {
            String str3 = bodyText.text;
            String str4 = bodyText.markdownText;
            Icon icon = bodyText.icon;
            Color color = bodyText.color;
            heroNumericsBodyTextViewModel = new HeroNumericsBodyTextViewModel(str3, str4, icon, color != null ? new ColorModel.Accented(color) : null, bodyText.accessibilityText);
        } else {
            heroNumericsBodyTextViewModel = null;
        }
        if (bodyText != null && (savingsAction = bodyText.action) != null) {
            if (savingsAction instanceof SavingsAction.ClientRoute) {
                SavingsAction.ClientRoute clientRoute = (SavingsAction.ClientRoute) savingsAction;
                viewGroupKt = new SavingsHeaderEvent$RouteClicked(clientRoute.route, clientRoute.cdfEvent);
            } else {
                if (!(savingsAction instanceof SavingsAction.PresentCard)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SavingsAction.PresentCard presentCard = (SavingsAction.PresentCard) savingsAction;
                viewGroupKt = new SavingsHeaderEvent$InformationClicked(presentCard.card, presentCard.cdfEvent);
            }
        }
        return new SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance(amount, heroNumericsBodyTextViewModel, str, viewGroupKt, str2);
    }

    public final SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton toTransferButton(SavingsScreen.Element.TransferButtons.TransferButton transferButton, Money money) {
        TransferConfig.AlternativeButtonBehavior alternativeButtonBehavior;
        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior sendEvent;
        SavingsScreenViewEvent transferOutClicked;
        TransferConfig transferConfig = transferButton.config;
        boolean z = transferConfig instanceof TransferConfig.TransferInConfig;
        if (z) {
            alternativeButtonBehavior = TransferConfig.AlternativeButtonBehavior.NONE;
        } else {
            if (!(transferConfig instanceof TransferConfig.TransferOutConfig)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            alternativeButtonBehavior = ((TransferConfig.TransferOutConfig) transferConfig).zeroBalanceBehavior;
        }
        boolean z2 = true;
        if (!z) {
            if (!(transferConfig instanceof TransferConfig.TransferOutConfig)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Long l = money.amount;
            if (l == null || l.longValue() <= 0) {
                z2 = false;
            }
        }
        String str = transferButton.text;
        ButtonProminence.Id id = transferButton.prominence;
        Long l2 = money.amount;
        if (l2 != null && l2.longValue() == 0 && alternativeButtonBehavior == TransferConfig.AlternativeButtonBehavior.SHAKE) {
            sendEvent = new SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.Shake(this.stringManager.get(R.string.savings_home_transfer_button_shake_announcement));
        } else {
            if (transferConfig instanceof TransferConfig.TransferInConfig) {
                transferOutClicked = new SavingsScreenViewEvent.TransferInClicked((TransferConfig.TransferInConfig) transferConfig);
            } else {
                if (!(transferConfig instanceof TransferConfig.TransferOutConfig)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                transferOutClicked = new SavingsScreenViewEvent.TransferOutClicked((TransferConfig.TransferOutConfig) transferConfig);
            }
            sendEvent = new SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.SendEvent(transferOutClicked);
        }
        return new SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton(str, id, z2, sendEvent);
    }
}
