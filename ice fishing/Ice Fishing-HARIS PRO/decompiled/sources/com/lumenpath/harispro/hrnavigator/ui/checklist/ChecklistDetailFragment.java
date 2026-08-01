package com.lumenpath.harispro.hrnavigator.ui.checklist;

import D1.i;
import F0.d;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.c;
import a1.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentChecklistDetailBinding;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ChecklistDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentChecklistDetailBinding f2789W;

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f2790X = new ArrayList();

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("checklistId");
        for (e eVar : c.f1642a) {
            if (eVar.f1683a == i) {
                FragmentChecklistDetailBinding fragmentChecklistDetailBinding = this.f2789W;
                i.b(fragmentChecklistDetailBinding);
                fragmentChecklistDetailBinding.titleText.setText(eVar.f1684b);
                for (String str : eVar.f1686d) {
                    d dVar = new d(H(), null);
                    dVar.setText(str);
                    dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    this.f2790X.add(dVar);
                    FragmentChecklistDetailBinding fragmentChecklistDetailBinding2 = this.f2789W;
                    i.b(fragmentChecklistDetailBinding2);
                    fragmentChecklistDetailBinding2.checkboxContainer.addView(dVar);
                }
                FragmentChecklistDetailBinding fragmentChecklistDetailBinding3 = this.f2789W;
                i.b(fragmentChecklistDetailBinding3);
                fragmentChecklistDetailBinding3.clearButton.setOnClickListener(new ViewOnClickListenerC0050a(5, this));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentChecklistDetailBinding inflate = FragmentChecklistDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.f2789W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2789W = null;
    }
}
