package com.squareup.cash.benefits.components.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes5.dex */
public final class BenefitsComparisonTablePresenter implements MoleculePresenter {
    public final IssuedCardManager issuedCardManager;
    public final MoneyFormatter moneyFormatter;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final String title;

    public BenefitsComparisonTablePresenter(AndroidStringManager androidStringManager, SyncValueReader syncValueReader, IssuedCardManager issuedCardManager, LocalizedMoneyFormatter.Factory factory, String str) {
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.issuedCardManager = issuedCardManager;
        this.title = str;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public final BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell createCheckOrXCell(boolean z) {
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            zzd zzdVar = Icons.Companion;
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell(new Icon("cfdYYz"), androidStringManager.get(R.string.benefits_table_enabled_description));
        }
        zzd zzdVar2 = Icons.Companion;
        return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell(new Icon("FirlgD"), androidStringManager.get(R.string.benefits_table_disabled_description));
    }

    public final BenefitsComparisonTableViewModel.BenefitsComparisonTableCell getTableCell(GreenBenefitsV1.Benefit benefit) {
        GreenBenefitsV1.Benefit.OverdraftBenefit access$getOverdraft;
        Resources resources = this.stringManager.resources;
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        if ((disclosureSectionKt != null ? PullRefreshKt.access$getBorrow(disclosureSectionKt) : null) != null) {
            GreenBenefitsV1.Benefit.BorrowBenefit access$getBorrow = disclosureSectionKt != null ? PullRefreshKt.access$getBorrow(disclosureSectionKt) : null;
            access$getBorrow.getClass();
            return createCheckOrXCell(Intrinsics.areEqual(access$getBorrow.higher_borrow_limit_enabled, Boolean.TRUE));
        }
        GreenBenefitsV1.Benefit.OverdraftBenefit access$getOverdraft2 = disclosureSectionKt != null ? PullRefreshKt.access$getOverdraft(disclosureSectionKt) : null;
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (access$getOverdraft2 != null) {
            GreenBenefitsV1.Benefit.OverdraftBenefit access$getOverdraft3 = disclosureSectionKt != null ? PullRefreshKt.access$getOverdraft(disclosureSectionKt) : null;
            access$getOverdraft3.getClass();
            Money money = access$getOverdraft3.limit;
            money.getClass();
            if (!((disclosureSectionKt == null || (access$getOverdraft = PullRefreshKt.access$getOverdraft(disclosureSectionKt)) == null) ? false : Intrinsics.areEqual(access$getOverdraft.requires_disclosure, Boolean.TRUE))) {
                return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(moneyFormatter.format(money));
            }
            String format2 = moneyFormatter.format(money);
            format2.getClass();
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("amount", format2);
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.benefits_table_free_overdraft_value)).format(arrayMap);
            format3.getClass();
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(format3);
        }
        if ((disclosureSectionKt != null ? PullRefreshKt.access$getSavings(disclosureSectionKt) : null) != null) {
            GreenBenefitsV1.Benefit.SavingsBenefit access$getSavings = disclosureSectionKt != null ? PullRefreshKt.access$getSavings(disclosureSectionKt) : null;
            access$getSavings.getClass();
            access$getSavings.apy_bips.getClass();
            String format4 = new DecimalFormat("##.##").format(r10.intValue() / 100.0d);
            format4.getClass();
            ArrayMap arrayMap2 = new ArrayMap(1);
            arrayMap2.put("apy", format4);
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.benefits_table_apy_value)).format(arrayMap2);
            format5.getClass();
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(format5);
        }
        if ((disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null) == null) {
            if ((disclosureSectionKt != null ? PullRefreshKt.access$getWeekly_offers(disclosureSectionKt) : null) != null) {
                GreenBenefitsV1.Benefit.WeeklyOffersBenefit access$getWeekly_offers = disclosureSectionKt != null ? PullRefreshKt.access$getWeekly_offers(disclosureSectionKt) : null;
                access$getWeekly_offers.getClass();
                Integer num = access$getWeekly_offers.limit;
                num.getClass();
                return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(String.valueOf(num.intValue()));
            }
            if ((disclosureSectionKt != null ? PullRefreshKt.access$getPriority_support(disclosureSectionKt) : null) != null) {
                GreenBenefitsV1.Benefit.PrioritySupportBenefit access$getPriority_support = disclosureSectionKt != null ? PullRefreshKt.access$getPriority_support(disclosureSectionKt) : null;
                access$getPriority_support.getClass();
                return createCheckOrXCell(Intrinsics.areEqual(access$getPriority_support.enabled, Boolean.TRUE));
            }
            if ((disclosureSectionKt != null ? PullRefreshKt.access$getPaper_money_deposit(disclosureSectionKt) : null) == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "Unknown benefit: ");
                return null;
            }
            GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit access$getPaper_money_deposit = disclosureSectionKt != null ? PullRefreshKt.access$getPaper_money_deposit(disclosureSectionKt) : null;
            access$getPaper_money_deposit.getClass();
            Money money2 = access$getPaper_money_deposit.fees;
            money2.getClass();
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(moneyFormatter.format(money2));
        }
        GreenBenefitsV1.Benefit.ATMBenefit access$getAtm = disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null;
        access$getAtm.getClass();
        Money money3 = access$getAtm.fees;
        money3.getClass();
        Long l = money3.amount;
        l.getClass();
        if (l.longValue() <= 0) {
            GreenBenefitsV1.Benefit.ATMBenefit access$getAtm2 = disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null;
            access$getAtm2.getClass();
            Money money4 = access$getAtm2.fees;
            money4.getClass();
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(moneyFormatter.format(money4));
        }
        GreenBenefitsV1.Benefit.ATMBenefit access$getAtm3 = disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null;
        access$getAtm3.getClass();
        Money money5 = access$getAtm3.fees;
        money5.getClass();
        String format6 = moneyFormatter.format(money5);
        format6.getClass();
        ArrayMap arrayMap3 = new ArrayMap(1);
        arrayMap3.put("fees", format6);
        resources.getClass();
        String format7 = new MessageFormat(resources.getString(R.string.benefits_table_atm_fees_value_plus)).format(arrayMap3);
        format7.getClass();
        return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(format7);
    }

    public final BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell getTableLabel(GreenBenefitsV1.Benefit benefit) {
        String str;
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        GreenBenefitsV1.Benefit.BorrowBenefit access$getBorrow = disclosureSectionKt != null ? PullRefreshKt.access$getBorrow(disclosureSectionKt) : null;
        AndroidStringManager androidStringManager = this.stringManager;
        if (access$getBorrow != null) {
            str = androidStringManager.get(R.string.benefits_table_borrow_limit_label);
        } else {
            if ((disclosureSectionKt != null ? PullRefreshKt.access$getOverdraft(disclosureSectionKt) : null) != null) {
                str = androidStringManager.get(R.string.benefits_table_overdraft_label);
            } else {
                if ((disclosureSectionKt != null ? PullRefreshKt.access$getSavings(disclosureSectionKt) : null) != null) {
                    str = androidStringManager.get(R.string.benefits_table_savings_interest_label);
                } else {
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null) != null) {
                        str = androidStringManager.get(R.string.benefits_table_atm_fees_label);
                    } else {
                        if ((disclosureSectionKt != null ? PullRefreshKt.access$getWeekly_offers(disclosureSectionKt) : null) != null) {
                            str = androidStringManager.get(R.string.benefits_table_custom_weekly_offers_label);
                        } else {
                            if ((disclosureSectionKt != null ? PullRefreshKt.access$getPriority_support(disclosureSectionKt) : null) != null) {
                                str = androidStringManager.get(R.string.benefits_table_priority_support_label);
                            } else {
                                if ((disclosureSectionKt != null ? PullRefreshKt.access$getPaper_money_deposit(disclosureSectionKt) : null) == null) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "Unknown benefit: ");
                                    return null;
                                }
                                str = androidStringManager.get(R.string.benefits_table_paper_money_deposit_label);
                            }
                        }
                    }
                }
            }
        }
        return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(str);
    }

    public final BenefitsComparisonTableViewModel models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(731247744);
        Object rememberedValue = gapComposer.rememberedValue();
        SyncValueReader syncValueReader = this.syncValueReader;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(6));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.GreenBenefits, new BenefitsHubViewKt$$ExternalSyntheticLambda2(7));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(((RealIssuedCardManager) this.issuedCardManager).getIssuedCardState(), 14);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, Boolean.FALSE, null, gapComposer, 48, 2);
        CashGreenV1 cashGreenV1 = (CashGreenV1) collectAsState.getValue();
        BenefitsComparisonTableViewModel benefitsComparisonTableViewModel = BenefitsComparisonTableViewModel.Loading.INSTANCE;
        if (cashGreenV1 == null || ((GreenBenefitsV1) collectAsState2.getValue()) == null) {
            gapComposer.end(false);
            return benefitsComparisonTableViewModel;
        }
        CashGreenV1 cashGreenV12 = (CashGreenV1) collectAsState.getValue();
        cashGreenV12.getClass();
        CashGreenV1.Status status = cashGreenV12.status;
        CashGreenV1.Status status2 = CashGreenV1.Status.ACTIVE;
        String str = this.title;
        AndroidStringManager androidStringManager = this.stringManager;
        if (status == status2) {
            GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) collectAsState2.getValue();
            greenBenefitsV1.getClass();
            List list = greenBenefitsV1.green_status_benefits;
            if (str == null) {
                str = androidStringManager.get(R.string.benefits_table_active_title);
            }
            if (!list.isEmpty()) {
                List<GreenBenefitsV1.Benefit> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (GreenBenefitsV1.Benefit benefit : list2) {
                    arrayList.add(new BenefitsComparisonTableViewModel.BenefitsComparisonTableRow(CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell[]{getTableLabel(benefit), getTableCell(benefit)}), false));
                }
                benefitsComparisonTableViewModel = new BenefitsComparisonTableViewModel.Loaded(str, arrayList);
            }
        } else {
            GreenBenefitsV1 greenBenefitsV12 = (GreenBenefitsV1) collectAsState2.getValue();
            greenBenefitsV12.getClass();
            List list3 = greenBenefitsV12.card_holder_benefits;
            if (str == null) {
                str = androidStringManager.get(R.string.benefits_table_inactive_title);
            }
            boolean booleanValue = ((Boolean) collectAsState3.getValue()).booleanValue();
            if (!list3.isEmpty()) {
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new BenefitsComparisonTableViewModel.BenefitsComparisonTableRow(CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell[]{new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(androidStringManager.get(R.string.benefits_table_header_label)), new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(androidStringManager.get(booleanValue ? R.string.benefits_table_header_cardholder : R.string.benefits_table_header_non_cardholder)), new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(androidStringManager.get(R.string.benefits_table_header_green))}), true));
                List<GreenBenefitsV1.Benefit> list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (GreenBenefitsV1.Benefit benefit2 : list4) {
                    List<GreenBenefitsV1.Benefit> list5 = greenBenefitsV12.green_status_benefits;
                    DisclosureSectionKt disclosureSectionKt = benefit2.element;
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getBorrow(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit3 : list5) {
                            DisclosureSectionKt disclosureSectionKt2 = benefit3.element;
                            if ((disclosureSectionKt2 != null ? PullRefreshKt.access$getBorrow(disclosureSectionKt2) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getOverdraft(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit32 : list5) {
                            DisclosureSectionKt disclosureSectionKt3 = benefit32.element;
                            if ((disclosureSectionKt3 != null ? PullRefreshKt.access$getOverdraft(disclosureSectionKt3) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getSavings(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit322 : list5) {
                            DisclosureSectionKt disclosureSectionKt4 = benefit322.element;
                            if ((disclosureSectionKt4 != null ? PullRefreshKt.access$getSavings(disclosureSectionKt4) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getAtm(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit3222 : list5) {
                            DisclosureSectionKt disclosureSectionKt5 = benefit3222.element;
                            if ((disclosureSectionKt5 != null ? PullRefreshKt.access$getAtm(disclosureSectionKt5) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getWeekly_offers(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit32222 : list5) {
                            DisclosureSectionKt disclosureSectionKt6 = benefit32222.element;
                            if ((disclosureSectionKt6 != null ? PullRefreshKt.access$getWeekly_offers(disclosureSectionKt6) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getPriority_support(disclosureSectionKt) : null) != null) {
                        for (GreenBenefitsV1.Benefit benefit322222 : list5) {
                            DisclosureSectionKt disclosureSectionKt7 = benefit322222.element;
                            if ((disclosureSectionKt7 != null ? PullRefreshKt.access$getPriority_support(disclosureSectionKt7) : null) != null) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if ((disclosureSectionKt != null ? PullRefreshKt.access$getPaper_money_deposit(disclosureSectionKt) : null) == null) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "Unknown benefit: ");
                        return null;
                    }
                    for (GreenBenefitsV1.Benefit benefit3222222 : list5) {
                        DisclosureSectionKt disclosureSectionKt8 = benefit3222222.element;
                        if ((disclosureSectionKt8 != null ? PullRefreshKt.access$getPaper_money_deposit(disclosureSectionKt8) : null) != null) {
                            break;
                        }
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    return null;
                    arrayList2.add(new BenefitsComparisonTableViewModel.BenefitsComparisonTableRow(CollectionsKt__CollectionsKt.listOf((Object[]) new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell[]{getTableLabel(benefit2), getTableCell(benefit2), getTableCell(benefit3222222)}), false));
                }
                benefitsComparisonTableViewModel = new BenefitsComparisonTableViewModel.Loaded(str, CollectionsKt.plus((Iterable) arrayList2, (Collection) listOf));
            }
        }
        gapComposer.end(false);
        return benefitsComparisonTableViewModel;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        return models(flow, composer);
    }
}
