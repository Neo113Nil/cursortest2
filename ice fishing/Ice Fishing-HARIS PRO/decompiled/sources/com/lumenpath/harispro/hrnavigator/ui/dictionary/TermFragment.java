package com.lumenpath.harispro.hrnavigator.ui.dictionary;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.n;
import a1.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentDetailTextBinding;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class TermFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentDetailTextBinding f2801W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("termId");
        for (r rVar : n.f1653a) {
            if (rVar.f1734a == i) {
                FragmentDetailTextBinding fragmentDetailTextBinding = this.f2801W;
                i.b(fragmentDetailTextBinding);
                fragmentDetailTextBinding.titleText.setText(rVar.f1735b);
                FragmentDetailTextBinding fragmentDetailTextBinding2 = this.f2801W;
                i.b(fragmentDetailTextBinding2);
                fragmentDetailTextBinding2.contentText.setText(rVar.f1737d);
                FragmentDetailTextBinding fragmentDetailTextBinding3 = this.f2801W;
                i.b(fragmentDetailTextBinding3);
                fragmentDetailTextBinding3.exampleText.setText(rVar.e);
                FragmentDetailTextBinding fragmentDetailTextBinding4 = this.f2801W;
                i.b(fragmentDetailTextBinding4);
                fragmentDetailTextBinding4.tipsText.setText(rVar.f1738f);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentDetailTextBinding inflate = FragmentDetailTextBinding.inflate(layoutInflater, viewGroup, false);
        this.f2801W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2801W = null;
    }
}
