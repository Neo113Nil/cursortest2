package com.squareup.cash.investing.presenters.metrics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.squareup.cash.R;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingGraphDetailsModel;
import com.squareup.cash.investing.viewmodels.metrics.MetricsColorType;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class InvestingEarningsPresenter implements MoleculePresenter {
    public final ColorModel.Accented accentColor;
    public final InvestmentEntityToken entityToken;
    public final RealInvestingMetrics metrics;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public InvestingEarningsPresenter(AndroidStringManager androidStringManager, RealInvestingMetrics realInvestingMetrics, LocalizedMoneyFormatter.Factory factory, ColorModel.Accented accented, BetterNavigator.ScreenNavigator screenNavigator, InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
        this.stringManager = androidStringManager;
        this.metrics = realInvestingMetrics;
        this.accentColor = accented;
        this.navigator = screenNavigator;
        this.entityToken = investmentEntityToken;
        this.moneyFormatter = LocalizedMoneyFormatter.Factory.createAbbreviatedBalancedFractionDigits$default(factory);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestingEarningsViewModel models(Flow flow, Composer composer, int i) {
        Long valueOf;
        Long valueOf2;
        InvestingEarningsViewModel content;
        MetricsColorType metricsColorType;
        String str;
        Money access$getActual_eps;
        Money access$getActual_eps2;
        Long l;
        Long l2;
        Money access$getActual_eps3;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(565565341);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(this.metrics.getMetrics(this.entityToken), 14);
            gapComposer.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            rememberedValue = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, (Continuation) null, this, collectAsState, 26));
        if (((InvestmentEarnings) collectAsState.getValue()) == null) {
            content = InvestingEarningsViewModel.Loading.INSTANCE;
        } else {
            AndroidStringManager androidStringManager = this.stringManager;
            String str2 = androidStringManager.get(R.string.investing_metrics_earnings_title);
            InvestmentEarnings investmentEarnings = (InvestmentEarnings) collectAsState.getValue();
            investmentEarnings.getClass();
            List<InvestmentEarnings.Earning> list = investmentEarnings.earnings;
            ArrayList arrayList = new ArrayList();
            for (InvestmentEarnings.Earning earning : list) {
                Money money = earning.expected_eps;
                Long l3 = money != null ? money.amount : null;
                zzjk zzjkVar = earning.upcoming_eps;
                CollectionsKt__MutableCollectionsKt.addAll(ArraysKt___ArraysKt.filterNotNull(new Long[]{l3, (zzjkVar == null || (access$getActual_eps3 = TextUtil.access$getActual_eps(zzjkVar)) == null) ? null : access$getActual_eps3.amount}), arrayList);
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                valueOf = Long.valueOf(((Number) it.next()).longValue());
                while (it.hasNext()) {
                    Long valueOf3 = Long.valueOf(((Number) it.next()).longValue());
                    if (valueOf.compareTo(valueOf3) < 0) {
                        valueOf = valueOf3;
                    }
                }
            } else {
                valueOf = null;
            }
            Float valueOf4 = valueOf != null ? Float.valueOf(valueOf.longValue()) : null;
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                valueOf2 = Long.valueOf(((Number) it2.next()).longValue());
                while (it2.hasNext()) {
                    Long valueOf5 = Long.valueOf(((Number) it2.next()).longValue());
                    if (valueOf2.compareTo(valueOf5) > 0) {
                        valueOf2 = valueOf5;
                    }
                }
            } else {
                valueOf2 = null;
            }
            Float valueOf6 = valueOf2 != null ? Float.valueOf(valueOf2.longValue()) : null;
            Float f = valueOf4;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (InvestmentEarnings.Earning earning2 : list) {
                Money money2 = earning2.expected_eps;
                zzjk zzjkVar2 = earning2.upcoming_eps;
                boolean z = money2 != null;
                boolean z2 = (zzjkVar2 != null ? TextUtil.access$getActual_eps(zzjkVar2) : null) != null;
                Money money3 = earning2.expected_eps;
                long j = 0;
                long longValue = (money3 == null || (l2 = money3.amount) == null) ? 0L : l2.longValue();
                if (zzjkVar2 != null && (access$getActual_eps2 = TextUtil.access$getActual_eps(zzjkVar2)) != null && (l = access$getActual_eps2.amount) != null) {
                    j = l.longValue();
                }
                float f2 = RecyclerView.DECELERATION_RATE;
                float floatValue = (f == null || valueOf6 == null) ? 0.0f : f.floatValue() - valueOf6.floatValue();
                if (valueOf6 != null) {
                    f2 = valueOf6.floatValue();
                }
                arrayList2.add(new InvestingEarningsViewModel.Content.InvestingEarningsGraphModel(z, z2, longValue, j, floatValue, f2));
            }
            InvestmentEarnings investmentEarnings2 = (InvestmentEarnings) collectAsState.getValue();
            investmentEarnings2.getClass();
            List<InvestmentEarnings.Earning> list2 = investmentEarnings2.earnings;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (InvestmentEarnings.Earning earning3 : list2) {
                String str3 = earning3.quarter;
                Money money4 = earning3.expected_eps;
                zzjk zzjkVar3 = earning3.upcoming_eps;
                str3.getClass();
                String str4 = earning3.year;
                str4.getClass();
                if (money4 != null) {
                    if ((zzjkVar3 != null ? TextUtil.access$getActual_eps(zzjkVar3) : null) != null) {
                        metricsColorType = MetricsColorType.NUMERIC;
                        MetricsColorType metricsColorType2 = metricsColorType;
                        MoneyFormatter moneyFormatter = this.moneyFormatter;
                        if (money4 != null || (r4 = moneyFormatter.format(money4)) == null) {
                            String str5 = androidStringManager.get(R.string.investing_metrics_unknown_data);
                        }
                        String str6 = str5;
                        if (zzjkVar3 != null || (access$getActual_eps = TextUtil.access$getActual_eps(zzjkVar3)) == null || (str = moneyFormatter.format(access$getActual_eps)) == null) {
                            if (zzjkVar3 != null) {
                                InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate = zzjkVar3 instanceof InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate ? (InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) zzjkVar3 : null;
                                if (investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate != null) {
                                    str = investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate.value;
                                    if (str == null) {
                                        str = androidStringManager.get(R.string.investing_metrics_unknown_data);
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        arrayList3.add(new InvestingGraphDetailsModel(true, str3, str4, metricsColorType2, str6, str));
                    }
                }
                metricsColorType = MetricsColorType.UNKNOWN;
                MetricsColorType metricsColorType22 = metricsColorType;
                MoneyFormatter moneyFormatter2 = this.moneyFormatter;
                if (money4 != null) {
                }
                String str52 = androidStringManager.get(R.string.investing_metrics_unknown_data);
                String str62 = str52;
                if (zzjkVar3 != null) {
                }
                if (zzjkVar3 != null) {
                }
                str = null;
                if (str == null) {
                }
                arrayList3.add(new InvestingGraphDetailsModel(true, str3, str4, metricsColorType22, str62, str));
            }
            content = new InvestingEarningsViewModel.Content(str2, arrayList2, arrayList3, androidStringManager.get(R.string.investing_metrics_earnings_actual), androidStringManager.get(R.string.investing_metrics_earnings_expected), this.accentColor);
        }
        gapComposer.end(false);
        return content;
    }
}
