package com.lumenpath.harispro.hrnavigator.ui.mistakes;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.h;
import a1.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentDetailTextBinding;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class MistakeDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentDetailTextBinding f2810W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("mistakeId");
        for (l lVar : h.f1647a) {
            if (lVar.f1709a == i) {
                FragmentDetailTextBinding fragmentDetailTextBinding = this.f2810W;
                i.b(fragmentDetailTextBinding);
                fragmentDetailTextBinding.titleText.setText(lVar.f1710b);
                FragmentDetailTextBinding fragmentDetailTextBinding2 = this.f2810W;
                i.b(fragmentDetailTextBinding2);
                fragmentDetailTextBinding2.contentText.setText("Description\n\n" + lVar.f1711c + "\n\nConsequences\n\n" + lVar.f1712d + "\n\nHow to fix\n\n" + lVar.e);
                FragmentDetailTextBinding fragmentDetailTextBinding3 = this.f2810W;
                i.b(fragmentDetailTextBinding3);
                fragmentDetailTextBinding3.exampleText.setVisibility(8);
                FragmentDetailTextBinding fragmentDetailTextBinding4 = this.f2810W;
                i.b(fragmentDetailTextBinding4);
                fragmentDetailTextBinding4.tipsText.setText(lVar.f1713f);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentDetailTextBinding inflate = FragmentDetailTextBinding.inflate(layoutInflater, viewGroup, false);
        this.f2810W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2810W = null;
    }
}
