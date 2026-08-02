package com.squareup.cash.portfolio.graphs.views;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.internal.zzbsy;
import com.robinhood.spark.SparkAdapter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class InvestingGraphAdapter extends SparkAdapter {
    public boolean isScrubbing;
    public final zzbsy paintProvider;
    public boolean smoothData = true;
    public InvestingGraphContentModel content = new InvestingGraphContentModel.Loading(null, 31);
    public List smoothedData = EmptyList.INSTANCE;

    public InvestingGraphAdapter(zzbsy zzbsyVar) {
        this.paintProvider = zzbsyVar;
    }

    public final List getDisplayedData() {
        return (this.isScrubbing || !this.smoothData) ? this.content.getPoints() : this.smoothedData;
    }

    @Override // com.robinhood.spark.SparkAdapter
    public final InvestingGraphPathType getPathType(int i) {
        InvestingGraphContentModel investingGraphContentModel = this.content;
        if (investingGraphContentModel instanceof InvestingGraphContentModel.Error) {
            throw new NotImplementedError(null, 1, null);
        }
        if (investingGraphContentModel instanceof InvestingGraphContentModel.Loading) {
            return Loading.INSTANCE;
        }
        if (!(investingGraphContentModel instanceof InvestingGraphContentModel.Loaded)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal = ((InvestingGraphContentModel.Point) getDisplayedData().get(i)).effectFromPreviousPoint.ordinal();
        if (ordinal == 0) {
            return Normal.INSTANCE;
        }
        if (ordinal == 1) {
            return NormalGray.INSTANCE;
        }
        if (ordinal == 2) {
            return DataMissing.INSTANCE;
        }
        if (ordinal == 3) {
            return Gap.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void setContent(InvestingGraphContentModel investingGraphContentModel) {
        investingGraphContentModel.getClass();
        if (this.content == investingGraphContentModel) {
            return;
        }
        if (investingGraphContentModel instanceof InvestingGraphContentModel.Loaded) {
            InvestingGraphContentModel.Loaded loaded = (InvestingGraphContentModel.Loaded) investingGraphContentModel;
            if (loaded.points.isEmpty() || loaded.smoothedPoints.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$3("Need at least one point for rendering a loaded graph");
                return;
            }
        }
        this.content = investingGraphContentModel;
        this.smoothedData = investingGraphContentModel.getSmoothedPoints();
        this.observable.notifyChanged();
    }
}
