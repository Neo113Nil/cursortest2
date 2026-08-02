package com.squareup.cash.portfolio.graphs.views;

import android.content.Context;
import com.google.android.libraries.places.internal.zzbsy;
import com.robinhood.spark.SparkView;

/* loaded from: classes6.dex */
public final class GraphView extends SparkView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final InvestingGraphAdapter graphAdapter;
    public long maxPrice;
    public long minPrice;
    public final zzbsy styler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphView(Context context) {
        super(context);
        context.getClass();
        zzbsy zzbsyVar = new zzbsy();
        this.styler = zzbsyVar;
        InvestingGraphAdapter investingGraphAdapter = new InvestingGraphAdapter(zzbsyVar);
        this.graphAdapter = investingGraphAdapter;
        this.minPrice = 0L;
        this.maxPrice = 0L;
        setAdapter(investingGraphAdapter);
        setFillType(0);
        setScrubEnabled(false);
    }

    /* renamed from: setCurrentPrice-nM2_iWI, reason: not valid java name */
    public final void m3719setCurrentPricenM2_iWI(long j) {
    }

    /* renamed from: setMaxPrice-nM2_iWI, reason: not valid java name */
    public final void m3720setMaxPricenM2_iWI(long j) {
        this.maxPrice = j;
    }

    /* renamed from: setMinPrice-nM2_iWI, reason: not valid java name */
    public final void m3721setMinPricenM2_iWI(long j) {
        this.minPrice = j;
    }
}
