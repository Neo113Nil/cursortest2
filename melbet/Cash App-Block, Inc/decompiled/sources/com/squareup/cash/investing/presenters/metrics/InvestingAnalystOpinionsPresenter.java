package com.squareup.cash.investing.presenters.metrics;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.R;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Loading;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class InvestingAnalystOpinionsPresenter implements MoleculePresenter {
    public final ColorModel.Accented accentColor;
    public final InvestmentEntityToken entityToken;
    public final RealInvestingMetrics metrics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public InvestingAnalystOpinionsPresenter(AndroidStringManager androidStringManager, RealInvestingMetrics realInvestingMetrics, ColorModel.Accented accented, BetterNavigator.ScreenNavigator screenNavigator, InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
        this.stringManager = androidStringManager;
        this.metrics = realInvestingMetrics;
        this.accentColor = accented;
        this.navigator = screenNavigator;
        this.entityToken = investmentEntityToken;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final X509CertChainUtils models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1579063721);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(this.metrics.getMetrics(this.entityToken), 13);
            gapComposer.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            rememberedValue = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        if (((InvestmentAnalystOpinions) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingAnalystOpinionsViewModel$Loading.INSTANCE;
        }
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, (Continuation) null, this, collectAsState, 25));
        AndroidStringManager androidStringManager = this.stringManager;
        String str = androidStringManager.get(R.string.investing_metrics_analyst_opinions_title);
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) collectAsState.getValue();
        investmentAnalystOpinions.getClass();
        String str2 = investmentAnalystOpinions.recommendation_label;
        str2.getClass();
        InvestmentAnalystOpinions investmentAnalystOpinions2 = (InvestmentAnalystOpinions) collectAsState.getValue();
        investmentAnalystOpinions2.getClass();
        Integer num = investmentAnalystOpinions2.score;
        num.getClass();
        InvestingAnalystOpinionsViewModel$Content.InvestingAnalystOpinionsGraphModel investingAnalystOpinionsGraphModel = new InvestingAnalystOpinionsViewModel$Content.InvestingAnalystOpinionsGraphModel(str2, num.intValue());
        InvestmentAnalystOpinions investmentAnalystOpinions3 = (InvestmentAnalystOpinions) collectAsState.getValue();
        investmentAnalystOpinions3.getClass();
        List list = investmentAnalystOpinions3.graph_labels;
        InvestmentAnalystOpinions investmentAnalystOpinions4 = (InvestmentAnalystOpinions) collectAsState.getValue();
        investmentAnalystOpinions4.getClass();
        Integer num2 = investmentAnalystOpinions4.analyst_count;
        Object[] objArr = {Integer.valueOf(num2 != null ? num2.intValue() : 0)};
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.investing_metrics_analyst_opinions_label)).format(objArr);
        format2.getClass();
        InvestingAnalystOpinionsViewModel$Content investingAnalystOpinionsViewModel$Content = new InvestingAnalystOpinionsViewModel$Content(str, investingAnalystOpinionsGraphModel, list, format2, this.accentColor);
        gapComposer.end(false);
        return investingAnalystOpinionsViewModel$Content;
    }
}
