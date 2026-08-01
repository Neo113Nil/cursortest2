package com.lumenpath.harispro.hrnavigator.ui.calculators;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.p;
import a1.c;
import a1.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentCalculatorBinding;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CalculatorFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentCalculatorBinding f2786W;

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f2787X = new ArrayList();

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("calculatorId");
        for (d dVar : p.f1656b) {
            if (dVar.f1680a == i) {
                FragmentCalculatorBinding fragmentCalculatorBinding = this.f2786W;
                i.b(fragmentCalculatorBinding);
                fragmentCalculatorBinding.titleText.setText(dVar.f1681b);
                for (c cVar : dVar.f1682c) {
                    TextInputLayout textInputLayout = new TextInputLayout(H(), null);
                    textInputLayout.setHint(cVar.f1678a);
                    textInputLayout.setPlaceholderText(cVar.f1679b);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.bottomMargin = textInputLayout.getResources().getDimensionPixelSize(R.dimen.spacing_md);
                    textInputLayout.setLayoutParams(marginLayoutParams);
                    TextInputEditText textInputEditText = new TextInputEditText(textInputLayout.getContext(), null);
                    textInputEditText.setInputType(8194);
                    textInputEditText.setTextColor(H().getColor(R.color.haris_on_surface));
                    textInputLayout.addView(textInputEditText);
                    this.f2787X.add(textInputEditText);
                    FragmentCalculatorBinding fragmentCalculatorBinding2 = this.f2786W;
                    i.b(fragmentCalculatorBinding2);
                    fragmentCalculatorBinding2.fieldsContainer.addView(textInputLayout);
                }
                FragmentCalculatorBinding fragmentCalculatorBinding3 = this.f2786W;
                i.b(fragmentCalculatorBinding3);
                fragmentCalculatorBinding3.calculateButton.setOnClickListener(new b1.c(this, 1, dVar));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentCalculatorBinding inflate = FragmentCalculatorBinding.inflate(layoutInflater, viewGroup, false);
        this.f2786W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2786W = null;
    }
}
