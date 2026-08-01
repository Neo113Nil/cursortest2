package com.lumenpath.harispro.hrnavigator.ui.diagnostics;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.e;
import a1.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentDiagnosticResultBinding;
import com.lumenpath.harispro.hrnavigator.ui.diagnostics.DiagnosticResultFragment;
import e1.C0130b;
import f0.w;
import f0.z;
import h0.f;
import java.util.ArrayList;
import java.util.List;
import u1.g;

/* loaded from: classes.dex */
public final class DiagnosticResultFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentDiagnosticResultBinding f2797W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        final int i = 0;
        final int i2 = 1;
        i.e(view, "view");
        int i3 = G().getInt("diagnosticScore");
        List list = e.f1644a;
        h hVar = i3 >= 32 ? new h("High HR Maturity", "🟢", "green", "Your organization demonstrates strong HR practices. Most core processes are in place and functioning effectively.", u1.h.F("Focus on HR analytics to drive continuous improvement", "Develop advanced talent management programs", "Benchmark against industry leaders"), u1.h.F("Implement predictive analytics for turnover", "Expand leadership development programs", "Optimize employee experience journey")) : i3 >= 20 ? new h("Medium HR Maturity", "🟡", "yellow", "Your HR foundation is solid but several areas need attention. Key processes exist but are not consistently applied.", u1.h.F("Standardize HR processes across departments", "Implement regular performance review cycles", "Develop a structured onboarding program"), u1.h.F("Document all HR policies and procedures", "Introduce KPI tracking for all roles", "Train managers on feedback and coaching")) : new h("Low HR Maturity", "🔴", "red", "Your organization has significant gaps in HR management. Immediate action is recommended to build foundational HR processes.", u1.h.F("Start with documenting basic HR policies", "Create job descriptions for all positions", "Establish a simple onboarding checklist"), u1.h.F("Define organizational structure", "Implement basic performance tracking", "Consider engaging HR consulting support"));
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding = this.f2797W;
        i.b(fragmentDiagnosticResultBinding);
        fragmentDiagnosticResultBinding.levelEmoji.setText(hVar.f1693b);
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding2 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding2);
        fragmentDiagnosticResultBinding2.levelText.setText(hVar.f1692a);
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding3 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding3);
        fragmentDiagnosticResultBinding3.descriptionText.setText(hVar.f1695d);
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding4 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding4);
        TextView textView = fragmentDiagnosticResultBinding4.recommendationsText;
        List list2 = hVar.e;
        ArrayList arrayList = new ArrayList(u1.i.I(list2, 10));
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                u1.h.H();
                throw null;
            }
            arrayList.add(i5 + ". " + ((String) obj));
            i4 = i5;
        }
        textView.setText(g.Q(arrayList, "\n\n", null, null, null, 62));
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding5 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding5);
        RecyclerView recyclerView = fragmentDiagnosticResultBinding5.improvementsRecycler;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding6 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding6);
        fragmentDiagnosticResultBinding6.improvementsRecycler.setAdapter(new C0130b(hVar.f1696f, 1));
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding7 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding7);
        fragmentDiagnosticResultBinding7.retryButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticResultFragment f3064b;

            {
                this.f3064b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        f.l(this.f3064b).l(R.id.action_global_diagnostic, null);
                        break;
                    default:
                        z l2 = f.l(this.f3064b);
                        i.e(l2, "navController");
                        w f2 = l2.f();
                        if ((f2 == null || R.id.homeFragment != f2.f2994h) && !l2.o(R.id.homeFragment, false)) {
                            l2.l(R.id.homeFragment, null);
                            break;
                        }
                        break;
                }
            }
        });
        FragmentDiagnosticResultBinding fragmentDiagnosticResultBinding8 = this.f2797W;
        i.b(fragmentDiagnosticResultBinding8);
        fragmentDiagnosticResultBinding8.homeButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticResultFragment f3064b;

            {
                this.f3064b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        f.l(this.f3064b).l(R.id.action_global_diagnostic, null);
                        break;
                    default:
                        z l2 = f.l(this.f3064b);
                        i.e(l2, "navController");
                        w f2 = l2.f();
                        if ((f2 == null || R.id.homeFragment != f2.f2994h) && !l2.o(R.id.homeFragment, false)) {
                            l2.l(R.id.homeFragment, null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentDiagnosticResultBinding inflate = FragmentDiagnosticResultBinding.inflate(layoutInflater, viewGroup, false);
        this.f2797W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2797W = null;
    }
}
