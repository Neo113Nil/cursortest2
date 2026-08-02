package com.squareup.cash.portfolio.graphs.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputNumberBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GraphAdapter extends RecyclerView.Adapter {
    public InvestingHomeViewModel.Portfolio data;
    public QrCodeScannerBinding$$ExternalSyntheticLambda0 eventReceiver;
    public final int itemViewType = 3;

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final Pi2UiInputNumberBinding binding;

        public ViewHolder(final GraphAdapter graphAdapter, Pi2UiInputNumberBinding pi2UiInputNumberBinding) {
            super(pi2UiInputNumberBinding.rootView);
            this.binding = pi2UiInputNumberBinding;
            MooncakeInvestingGraphView mooncakeInvestingGraphView = (MooncakeInvestingGraphView) pi2UiInputNumberBinding.inputLayout;
            final int i = 0;
            mooncakeInvestingGraphView.setScrubListener(new Function1() { // from class: com.squareup.cash.portfolio.graphs.views.GraphAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    GraphAdapter graphAdapter2 = graphAdapter;
                    switch (i2) {
                        case 0:
                            InvestingGraphContentModel.Point point = (InvestingGraphContentModel.Point) obj;
                            QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = graphAdapter2.eventReceiver;
                            if (qrCodeScannerBinding$$ExternalSyntheticLambda0 != null) {
                                qrCodeScannerBinding$$ExternalSyntheticLambda0.sendEvent(new InvestingGraphViewEvent.ScrubPoint(point));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            HistoricalRange historicalRange = (HistoricalRange) obj;
                            historicalRange.getClass();
                            QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda02 = graphAdapter2.eventReceiver;
                            if (qrCodeScannerBinding$$ExternalSyntheticLambda02 != null) {
                                qrCodeScannerBinding$$ExternalSyntheticLambda02.sendEvent(new InvestingGraphViewEvent.SelectRange(historicalRange));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            mooncakeInvestingGraphView.setLoaderYPosition(MooncakeInvestingGraphView.LoaderYPosition.BELOW_EVENT_LABEL);
            final int i2 = 1;
            ((InvestingGraphTabsView) pi2UiInputNumberBinding.editText).onToggle(new Function1() { // from class: com.squareup.cash.portfolio.graphs.views.GraphAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    GraphAdapter graphAdapter2 = graphAdapter;
                    switch (i22) {
                        case 0:
                            InvestingGraphContentModel.Point point = (InvestingGraphContentModel.Point) obj;
                            QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = graphAdapter2.eventReceiver;
                            if (qrCodeScannerBinding$$ExternalSyntheticLambda0 != null) {
                                qrCodeScannerBinding$$ExternalSyntheticLambda0.sendEvent(new InvestingGraphViewEvent.ScrubPoint(point));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            HistoricalRange historicalRange = (HistoricalRange) obj;
                            historicalRange.getClass();
                            QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda02 = graphAdapter2.eventReceiver;
                            if (qrCodeScannerBinding$$ExternalSyntheticLambda02 != null) {
                                qrCodeScannerBinding$$ExternalSyntheticLambda02.sendEvent(new InvestingGraphViewEvent.SelectRange(historicalRange));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
        }
    }

    public GraphAdapter() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.data == null ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.itemViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.itemViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        InvestingHomeViewModel.Portfolio portfolio = this.data;
        if (portfolio != null) {
            Pi2UiInputNumberBinding pi2UiInputNumberBinding = viewHolder2.binding;
            ((MooncakeInvestingGraphView) pi2UiInputNumberBinding.inputLayout).render(portfolio.graphContentModel);
            ((InvestingGraphTabsView) pi2UiInputNumberBinding.editText).selectToggle(portfolio.selectedRange);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).cloneInContext(viewGroup.getContext()).inflate(R.layout.investing_portfolio_graph, viewGroup, false);
        int i2 = R.id.graph;
        MooncakeInvestingGraphView mooncakeInvestingGraphView = (MooncakeInvestingGraphView) ViewBindings.findChildViewById(inflate, R.id.graph);
        if (mooncakeInvestingGraphView != null) {
            i2 = R.id.tabs;
            InvestingGraphTabsView investingGraphTabsView = (InvestingGraphTabsView) ViewBindings.findChildViewById(inflate, R.id.tabs);
            if (investingGraphTabsView != null) {
                return new ViewHolder(this, new Pi2UiInputNumberBinding((LinearLayout) inflate, mooncakeInvestingGraphView, investingGraphTabsView));
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
