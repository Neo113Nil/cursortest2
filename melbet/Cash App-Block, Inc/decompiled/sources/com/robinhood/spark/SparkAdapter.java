package com.robinhood.spark;

import android.database.DataSetObservable;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;

/* loaded from: classes4.dex */
public abstract class SparkAdapter {
    public final DataSetObservable observable = new DataSetObservable();

    public abstract InvestingGraphPathType getPathType(int i);
}
