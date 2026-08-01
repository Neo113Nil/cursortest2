package com.lumenpath.harispro.hrnavigator.ui.diagnostics;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.e;
import a1.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentDiagnosticBinding;
import com.lumenpath.harispro.hrnavigator.ui.diagnostics.DiagnosticFragment;
import h0.f;
import java.util.List;

/* loaded from: classes.dex */
public final class DiagnosticFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentDiagnosticBinding f2793W;

    /* renamed from: X, reason: collision with root package name */
    public int f2794X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2795Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2796Z = -1;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        FragmentDiagnosticBinding fragmentDiagnosticBinding = this.f2793W;
        i.b(fragmentDiagnosticBinding);
        fragmentDiagnosticBinding.progressBar.setMax(e.f1644a.size());
        M();
        FragmentDiagnosticBinding fragmentDiagnosticBinding2 = this.f2793W;
        i.b(fragmentDiagnosticBinding2);
        final int i = 0;
        fragmentDiagnosticBinding2.yesButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticFragment f3062b;

            {
                this.f3062b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        DiagnosticFragment diagnosticFragment = this.f3062b;
                        diagnosticFragment.f2796Z = 2;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding3 = diagnosticFragment.f2793W;
                        i.b(fragmentDiagnosticBinding3);
                        fragmentDiagnosticBinding3.nextButton.setEnabled(true);
                        break;
                    case 1:
                        DiagnosticFragment diagnosticFragment2 = this.f3062b;
                        diagnosticFragment2.f2796Z = 0;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding4 = diagnosticFragment2.f2793W;
                        i.b(fragmentDiagnosticBinding4);
                        fragmentDiagnosticBinding4.nextButton.setEnabled(true);
                        break;
                    case 2:
                        DiagnosticFragment diagnosticFragment3 = this.f3062b;
                        diagnosticFragment3.f2796Z = 1;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding5 = diagnosticFragment3.f2793W;
                        i.b(fragmentDiagnosticBinding5);
                        fragmentDiagnosticBinding5.nextButton.setEnabled(true);
                        break;
                    default:
                        DiagnosticFragment diagnosticFragment4 = this.f3062b;
                        diagnosticFragment4.f2795Y += diagnosticFragment4.f2796Z;
                        int i2 = diagnosticFragment4.f2794X + 1;
                        diagnosticFragment4.f2794X = i2;
                        if (i2 < e.f1644a.size()) {
                            diagnosticFragment4.M();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("diagnosticScore", diagnosticFragment4.f2795Y);
                            f.l(diagnosticFragment4).l(R.id.action_diagnostic_to_result, bundle);
                            break;
                        }
                }
            }
        });
        FragmentDiagnosticBinding fragmentDiagnosticBinding3 = this.f2793W;
        i.b(fragmentDiagnosticBinding3);
        final int i2 = 1;
        fragmentDiagnosticBinding3.noButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticFragment f3062b;

            {
                this.f3062b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        DiagnosticFragment diagnosticFragment = this.f3062b;
                        diagnosticFragment.f2796Z = 2;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding32 = diagnosticFragment.f2793W;
                        i.b(fragmentDiagnosticBinding32);
                        fragmentDiagnosticBinding32.nextButton.setEnabled(true);
                        break;
                    case 1:
                        DiagnosticFragment diagnosticFragment2 = this.f3062b;
                        diagnosticFragment2.f2796Z = 0;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding4 = diagnosticFragment2.f2793W;
                        i.b(fragmentDiagnosticBinding4);
                        fragmentDiagnosticBinding4.nextButton.setEnabled(true);
                        break;
                    case 2:
                        DiagnosticFragment diagnosticFragment3 = this.f3062b;
                        diagnosticFragment3.f2796Z = 1;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding5 = diagnosticFragment3.f2793W;
                        i.b(fragmentDiagnosticBinding5);
                        fragmentDiagnosticBinding5.nextButton.setEnabled(true);
                        break;
                    default:
                        DiagnosticFragment diagnosticFragment4 = this.f3062b;
                        diagnosticFragment4.f2795Y += diagnosticFragment4.f2796Z;
                        int i22 = diagnosticFragment4.f2794X + 1;
                        diagnosticFragment4.f2794X = i22;
                        if (i22 < e.f1644a.size()) {
                            diagnosticFragment4.M();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("diagnosticScore", diagnosticFragment4.f2795Y);
                            f.l(diagnosticFragment4).l(R.id.action_diagnostic_to_result, bundle);
                            break;
                        }
                }
            }
        });
        FragmentDiagnosticBinding fragmentDiagnosticBinding4 = this.f2793W;
        i.b(fragmentDiagnosticBinding4);
        final int i3 = 2;
        fragmentDiagnosticBinding4.sometimesButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticFragment f3062b;

            {
                this.f3062b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        DiagnosticFragment diagnosticFragment = this.f3062b;
                        diagnosticFragment.f2796Z = 2;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding32 = diagnosticFragment.f2793W;
                        i.b(fragmentDiagnosticBinding32);
                        fragmentDiagnosticBinding32.nextButton.setEnabled(true);
                        break;
                    case 1:
                        DiagnosticFragment diagnosticFragment2 = this.f3062b;
                        diagnosticFragment2.f2796Z = 0;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding42 = diagnosticFragment2.f2793W;
                        i.b(fragmentDiagnosticBinding42);
                        fragmentDiagnosticBinding42.nextButton.setEnabled(true);
                        break;
                    case 2:
                        DiagnosticFragment diagnosticFragment3 = this.f3062b;
                        diagnosticFragment3.f2796Z = 1;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding5 = diagnosticFragment3.f2793W;
                        i.b(fragmentDiagnosticBinding5);
                        fragmentDiagnosticBinding5.nextButton.setEnabled(true);
                        break;
                    default:
                        DiagnosticFragment diagnosticFragment4 = this.f3062b;
                        diagnosticFragment4.f2795Y += diagnosticFragment4.f2796Z;
                        int i22 = diagnosticFragment4.f2794X + 1;
                        diagnosticFragment4.f2794X = i22;
                        if (i22 < e.f1644a.size()) {
                            diagnosticFragment4.M();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("diagnosticScore", diagnosticFragment4.f2795Y);
                            f.l(diagnosticFragment4).l(R.id.action_diagnostic_to_result, bundle);
                            break;
                        }
                }
            }
        });
        FragmentDiagnosticBinding fragmentDiagnosticBinding5 = this.f2793W;
        i.b(fragmentDiagnosticBinding5);
        final int i4 = 3;
        fragmentDiagnosticBinding5.nextButton.setOnClickListener(new View.OnClickListener(this) { // from class: g1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DiagnosticFragment f3062b;

            {
                this.f3062b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        DiagnosticFragment diagnosticFragment = this.f3062b;
                        diagnosticFragment.f2796Z = 2;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding32 = diagnosticFragment.f2793W;
                        i.b(fragmentDiagnosticBinding32);
                        fragmentDiagnosticBinding32.nextButton.setEnabled(true);
                        break;
                    case 1:
                        DiagnosticFragment diagnosticFragment2 = this.f3062b;
                        diagnosticFragment2.f2796Z = 0;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding42 = diagnosticFragment2.f2793W;
                        i.b(fragmentDiagnosticBinding42);
                        fragmentDiagnosticBinding42.nextButton.setEnabled(true);
                        break;
                    case 2:
                        DiagnosticFragment diagnosticFragment3 = this.f3062b;
                        diagnosticFragment3.f2796Z = 1;
                        FragmentDiagnosticBinding fragmentDiagnosticBinding52 = diagnosticFragment3.f2793W;
                        i.b(fragmentDiagnosticBinding52);
                        fragmentDiagnosticBinding52.nextButton.setEnabled(true);
                        break;
                    default:
                        DiagnosticFragment diagnosticFragment4 = this.f3062b;
                        diagnosticFragment4.f2795Y += diagnosticFragment4.f2796Z;
                        int i22 = diagnosticFragment4.f2794X + 1;
                        diagnosticFragment4.f2794X = i22;
                        if (i22 < e.f1644a.size()) {
                            diagnosticFragment4.M();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("diagnosticScore", diagnosticFragment4.f2795Y);
                            f.l(diagnosticFragment4).l(R.id.action_diagnostic_to_result, bundle);
                            break;
                        }
                }
            }
        });
    }

    public final void M() {
        List list = e.f1644a;
        List list2 = e.f1644a;
        g gVar = (g) list2.get(this.f2794X);
        FragmentDiagnosticBinding fragmentDiagnosticBinding = this.f2793W;
        i.b(fragmentDiagnosticBinding);
        fragmentDiagnosticBinding.questionText.setText(gVar.f1691b);
        FragmentDiagnosticBinding fragmentDiagnosticBinding2 = this.f2793W;
        i.b(fragmentDiagnosticBinding2);
        fragmentDiagnosticBinding2.progressBar.setProgress(this.f2794X + 1);
        FragmentDiagnosticBinding fragmentDiagnosticBinding3 = this.f2793W;
        i.b(fragmentDiagnosticBinding3);
        fragmentDiagnosticBinding3.progressText.setText("Question " + (this.f2794X + 1) + " of " + list2.size());
        this.f2796Z = -1;
        FragmentDiagnosticBinding fragmentDiagnosticBinding4 = this.f2793W;
        i.b(fragmentDiagnosticBinding4);
        fragmentDiagnosticBinding4.nextButton.setEnabled(false);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentDiagnosticBinding inflate = FragmentDiagnosticBinding.inflate(layoutInflater, viewGroup, false);
        this.f2793W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2793W = null;
    }
}
