package com.lumenpath.harispro.hrnavigator.ui.builder;

import C1.a;
import D1.i;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.b;
import b1.c;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentBuilderBinding;
import com.lumenpath.harispro.hrnavigator.ui.builder.BuilderFragment;
import e1.C0130b;
import java.util.ArrayList;
import u1.h;

/* loaded from: classes.dex */
public final class BuilderFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentBuilderBinding f2780W;

    /* renamed from: X, reason: collision with root package name */
    public int f2781X = 1;

    /* renamed from: Y, reason: collision with root package name */
    public String f2782Y = "";

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2783Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2784a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2785b0;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        N();
        FragmentBuilderBinding fragmentBuilderBinding = this.f2780W;
        i.b(fragmentBuilderBinding);
        fragmentBuilderBinding.nextButton.setOnClickListener(new ViewOnClickListenerC0050a(3, this));
    }

    public final void M(String str, a aVar) {
        MaterialButton materialButton = new MaterialButton(H(), null);
        materialButton.setText(str);
        materialButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        materialButton.setOnClickListener(new c(aVar, 0, this));
        FragmentBuilderBinding fragmentBuilderBinding = this.f2780W;
        i.b(fragmentBuilderBinding);
        fragmentBuilderBinding.optionsContainer.addView(materialButton);
        FragmentBuilderBinding fragmentBuilderBinding2 = this.f2780W;
        i.b(fragmentBuilderBinding2);
        fragmentBuilderBinding2.nextButton.setVisibility(8);
    }

    public final void N() {
        FragmentBuilderBinding fragmentBuilderBinding = this.f2780W;
        i.b(fragmentBuilderBinding);
        fragmentBuilderBinding.optionsContainer.removeAllViews();
        FragmentBuilderBinding fragmentBuilderBinding2 = this.f2780W;
        i.b(fragmentBuilderBinding2);
        fragmentBuilderBinding2.resultContainer.setVisibility(8);
        FragmentBuilderBinding fragmentBuilderBinding3 = this.f2780W;
        i.b(fragmentBuilderBinding3);
        fragmentBuilderBinding3.nextButton.setVisibility(0);
        int i = this.f2781X;
        if (i == 1) {
            FragmentBuilderBinding fragmentBuilderBinding4 = this.f2780W;
            i.b(fragmentBuilderBinding4);
            fragmentBuilderBinding4.stepTitle.setText("Step 1: Company Size");
            FragmentBuilderBinding fragmentBuilderBinding5 = this.f2780W;
            i.b(fragmentBuilderBinding5);
            fragmentBuilderBinding5.stepDescription.setText("How many employees does your company have?");
            for (final String str : h.F("1–10", "10–50", "50–100", "100+")) {
                M(str, new a() { // from class: b1.a
                    @Override // C1.a
                    public final Object c() {
                        BuilderFragment.this.f2782Y = str;
                        return t1.i.f4388c;
                    }
                });
            }
            return;
        }
        if (i == 2) {
            FragmentBuilderBinding fragmentBuilderBinding6 = this.f2780W;
            i.b(fragmentBuilderBinding6);
            fragmentBuilderBinding6.stepTitle.setText("Step 2: HR Function");
            FragmentBuilderBinding fragmentBuilderBinding7 = this.f2780W;
            i.b(fragmentBuilderBinding7);
            fragmentBuilderBinding7.stepDescription.setText("Do you have a dedicated HR person or department?");
            M("Yes", new b(0, this));
            M("No", new b(1, this));
            return;
        }
        if (i == 3) {
            FragmentBuilderBinding fragmentBuilderBinding8 = this.f2780W;
            i.b(fragmentBuilderBinding8);
            fragmentBuilderBinding8.stepTitle.setText("Step 3: Management");
            FragmentBuilderBinding fragmentBuilderBinding9 = this.f2780W;
            i.b(fragmentBuilderBinding9);
            fragmentBuilderBinding9.stepDescription.setText("Do you have team leads or managers?");
            M("Yes", new b(2, this));
            M("No", new b(3, this));
            return;
        }
        if (i == 4) {
            FragmentBuilderBinding fragmentBuilderBinding10 = this.f2780W;
            i.b(fragmentBuilderBinding10);
            fragmentBuilderBinding10.stepTitle.setText("Step 4: KPIs");
            FragmentBuilderBinding fragmentBuilderBinding11 = this.f2780W;
            i.b(fragmentBuilderBinding11);
            fragmentBuilderBinding11.stepDescription.setText("Do you have KPIs defined for roles?");
            M("Yes", new b(4, this));
            M("No", new b(5, this));
            return;
        }
        if (i != 5) {
            return;
        }
        FragmentBuilderBinding fragmentBuilderBinding12 = this.f2780W;
        i.b(fragmentBuilderBinding12);
        fragmentBuilderBinding12.stepTitle.setText("Step 5: Recommended Structure");
        FragmentBuilderBinding fragmentBuilderBinding13 = this.f2780W;
        i.b(fragmentBuilderBinding13);
        fragmentBuilderBinding13.stepDescription.setText("Based on your answers, here are the recommended actions:");
        FragmentBuilderBinding fragmentBuilderBinding14 = this.f2780W;
        i.b(fragmentBuilderBinding14);
        fragmentBuilderBinding14.optionsContainer.removeAllViews();
        FragmentBuilderBinding fragmentBuilderBinding15 = this.f2780W;
        i.b(fragmentBuilderBinding15);
        fragmentBuilderBinding15.nextButton.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        if (!this.f2783Z) {
            arrayList.add("📋 Appoint an HRBP or outsource HR functions");
        }
        if (!this.f2784a0) {
            arrayList.add("🏢 Define management roles and reporting lines");
        }
        if (!this.f2785b0) {
            arrayList.add("📈 Introduce KPI framework for key roles");
        }
        arrayList.add("🚀 Create an onboarding program");
        if (i.a(this.f2782Y, "100+") || i.a(this.f2782Y, "50–100")) {
            arrayList.add("📝 Develop formal HR regulations and policies");
        }
        if (!this.f2785b0) {
            arrayList.add("📊 Describe core business processes");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("✅ Your HR foundation looks solid — focus on optimization");
        }
        FragmentBuilderBinding fragmentBuilderBinding16 = this.f2780W;
        i.b(fragmentBuilderBinding16);
        fragmentBuilderBinding16.resultContainer.setVisibility(0);
        FragmentBuilderBinding fragmentBuilderBinding17 = this.f2780W;
        i.b(fragmentBuilderBinding17);
        RecyclerView recyclerView = fragmentBuilderBinding17.resultRecycler;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentBuilderBinding fragmentBuilderBinding18 = this.f2780W;
        i.b(fragmentBuilderBinding18);
        fragmentBuilderBinding18.resultRecycler.setAdapter(new C0130b(arrayList, 1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentBuilderBinding inflate = FragmentBuilderBinding.inflate(layoutInflater, viewGroup, false);
        this.f2780W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2780W = null;
    }
}
