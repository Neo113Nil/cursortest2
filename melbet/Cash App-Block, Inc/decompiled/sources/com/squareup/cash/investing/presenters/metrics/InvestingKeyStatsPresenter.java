package com.squareup.cash.investing.presenters.metrics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.investing.backend.api.keystats.InvestingKeyStats$Page;
import com.squareup.cash.investing.backend.real.InvestingParsingErrorFactory;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.InvestingDetailRowContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.invest.ui.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes6.dex */
public final class InvestingKeyStatsPresenter implements MoleculePresenter, HasObservability {
    public final InvestmentEntityToken entityToken;
    public final ErrorReporter errorReporter;
    public final RealInvestingMetrics metrics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    public InvestingKeyStatsPresenter(RealInvestingMetrics realInvestingMetrics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, BetterNavigator.ScreenNavigator screenNavigator, InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
        this.metrics = realInvestingMetrics;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.navigator = screenNavigator;
        this.entityToken = investmentEntityToken;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final InvestingDetailTileViewModel models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(608465843);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(this.metrics.getMetrics(this.entityToken), 16);
            gapComposer.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            rememberedValue = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        if (((InvestmentEntityStats) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingDetailTileViewModel.Loading.INSTANCE;
        }
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, (Continuation) null, this, collectAsState, 27));
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) collectAsState.getValue();
        investmentEntityStats.getClass();
        try {
            InvestmentEntityStats.InvestmentEntityStatsDetails investmentEntityStatsDetails = investmentEntityStats.details;
            if (investmentEntityStatsDetails == null) {
                throw new IllegalArgumentException("details");
            }
            Long l = investmentEntityStats.num_equity_screen_stats;
            if (l == null) {
                throw new IllegalArgumentException("num_equity_screen_stats");
            }
            List<Section.KeyStatsDetailsRow> take = CollectionsKt.take(investmentEntityStatsDetails.rows, (int) l.longValue());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
            for (Section.KeyStatsDetailsRow keyStatsDetailsRow : take) {
                String str = keyStatsDetailsRow.label;
                if (str == null) {
                    throw new IllegalArgumentException(AnnotatedPrivateKey.LABEL);
                }
                String str2 = keyStatsDetailsRow.value;
                if (str2 == null) {
                    throw new IllegalArgumentException("value");
                }
                arrayList.add(new InvestingKeyStats$Page.Row(str, str2, keyStatsDetailsRow.description));
            }
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InvestingKeyStats$Page(arrayList));
            String str3 = investmentEntityStats.title;
            if (str3 == null) {
                str3 = "";
            }
            listOf.getClass();
            List list = listOf;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ArrayList<InvestingKeyStats$Page.Row> arrayList3 = ((InvestingKeyStats$Page) it.next()).rows;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                for (InvestingKeyStats$Page.Row row : arrayList3) {
                    arrayList4.add(new InvestingDetailRowContentModel.Row(row.key, row.value));
                }
                arrayList2.add(new InvestingDetailRowContentModel(arrayList4, false));
            }
            InvestingDetailTileViewModel.Content content = new InvestingDetailTileViewModel.Content(str3, arrayList2);
            gapComposer.end(false);
            return content;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityStats.class), InvestingParsingErrorFactory.INSTANCE, null);
        }
    }
}
