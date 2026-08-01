package com.lumenpath.harispro.hrnavigator.ui.roadmap;

import D1.i;
import F0.d;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.j;
import a1.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentChecklistDetailBinding;
import java.util.NoSuchElementException;
import u1.h;

/* loaded from: classes.dex */
public final class RoadmapDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentChecklistDetailBinding f2819W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("roadmapId");
        for (p pVar : j.f1649a) {
            if (pVar.f1726a == i) {
                FragmentChecklistDetailBinding fragmentChecklistDetailBinding = this.f2819W;
                i.b(fragmentChecklistDetailBinding);
                fragmentChecklistDetailBinding.titleText.setText("Plan: ".concat(pVar.f1727b));
                int i2 = 0;
                for (Object obj : pVar.f1728c) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h.H();
                        throw null;
                    }
                    d dVar = new d(H(), null);
                    dVar.setText(i3 + ". " + ((String) obj));
                    dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    FragmentChecklistDetailBinding fragmentChecklistDetailBinding2 = this.f2819W;
                    i.b(fragmentChecklistDetailBinding2);
                    fragmentChecklistDetailBinding2.checkboxContainer.addView(dVar);
                    i2 = i3;
                }
                FragmentChecklistDetailBinding fragmentChecklistDetailBinding3 = this.f2819W;
                i.b(fragmentChecklistDetailBinding3);
                fragmentChecklistDetailBinding3.clearButton.setOnClickListener(new ViewOnClickListenerC0050a(9, this));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentChecklistDetailBinding inflate = FragmentChecklistDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.f2819W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2819W = null;
    }
}
