package com.lumenpath.harispro.hrnavigator.ui.knowledge;

import D1.i;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.a;
import a1.C0083a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentArticleBinding;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ArticleFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentArticleBinding f2804W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("articleId");
        for (C0083a c0083a : a.f1640a) {
            if (c0083a.f1668a == i) {
                FragmentArticleBinding fragmentArticleBinding = this.f2804W;
                i.b(fragmentArticleBinding);
                fragmentArticleBinding.titleText.setText(c0083a.f1670c);
                FragmentArticleBinding fragmentArticleBinding2 = this.f2804W;
                i.b(fragmentArticleBinding2);
                fragmentArticleBinding2.whatText.setText(c0083a.e);
                FragmentArticleBinding fragmentArticleBinding3 = this.f2804W;
                i.b(fragmentArticleBinding3);
                fragmentArticleBinding3.whyText.setText(c0083a.f1672f);
                FragmentArticleBinding fragmentArticleBinding4 = this.f2804W;
                i.b(fragmentArticleBinding4);
                fragmentArticleBinding4.mistakesText.setText(c0083a.f1673g);
                FragmentArticleBinding fragmentArticleBinding5 = this.f2804W;
                i.b(fragmentArticleBinding5);
                fragmentArticleBinding5.recommendationsText.setText(c0083a.f1674h);
                FragmentArticleBinding fragmentArticleBinding6 = this.f2804W;
                i.b(fragmentArticleBinding6);
                fragmentArticleBinding6.summaryText.setText(c0083a.i);
                FragmentArticleBinding fragmentArticleBinding7 = this.f2804W;
                i.b(fragmentArticleBinding7);
                fragmentArticleBinding7.backButton.setOnClickListener(new ViewOnClickListenerC0050a(7, this));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentArticleBinding inflate = FragmentArticleBinding.inflate(layoutInflater, viewGroup, false);
        this.f2804W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2804W = null;
    }
}
