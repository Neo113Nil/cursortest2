package com.lumenpath.harispro.hrnavigator.ui.metrics;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.g;
import a1.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentMetricDetailBinding;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class MetricDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentMetricDetailBinding f2808W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("metricId");
        for (j jVar : g.f1646a) {
            if (jVar.f1700a == i) {
                FragmentMetricDetailBinding fragmentMetricDetailBinding = this.f2808W;
                i.b(fragmentMetricDetailBinding);
                fragmentMetricDetailBinding.titleText.setText(jVar.f1701b);
                FragmentMetricDetailBinding fragmentMetricDetailBinding2 = this.f2808W;
                i.b(fragmentMetricDetailBinding2);
                fragmentMetricDetailBinding2.formulaText.setText(jVar.f1702c);
                FragmentMetricDetailBinding fragmentMetricDetailBinding3 = this.f2808W;
                i.b(fragmentMetricDetailBinding3);
                fragmentMetricDetailBinding3.descriptionText.setText(jVar.f1703d);
                FragmentMetricDetailBinding fragmentMetricDetailBinding4 = this.f2808W;
                i.b(fragmentMetricDetailBinding4);
                fragmentMetricDetailBinding4.benchmarkText.setText(jVar.e);
                FragmentMetricDetailBinding fragmentMetricDetailBinding5 = this.f2808W;
                i.b(fragmentMetricDetailBinding5);
                fragmentMetricDetailBinding5.tipsText.setText(jVar.f1704f);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentMetricDetailBinding inflate = FragmentMetricDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.f2808W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2808W = null;
    }
}
