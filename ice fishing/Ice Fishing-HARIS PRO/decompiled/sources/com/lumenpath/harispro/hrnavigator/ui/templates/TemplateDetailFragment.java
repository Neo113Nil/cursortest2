package com.lumenpath.harispro.hrnavigator.ui.templates;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.m;
import a1.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentTemplateDetailBinding;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class TemplateDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentTemplateDetailBinding f2824W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("templateId");
        for (k kVar : m.f1652a) {
            if (kVar.f1705a == i) {
                FragmentTemplateDetailBinding fragmentTemplateDetailBinding = this.f2824W;
                i.b(fragmentTemplateDetailBinding);
                fragmentTemplateDetailBinding.titleText.setText(kVar.f1706b);
                FragmentTemplateDetailBinding fragmentTemplateDetailBinding2 = this.f2824W;
                i.b(fragmentTemplateDetailBinding2);
                TextView textView = fragmentTemplateDetailBinding2.categoryText;
                String upperCase = kVar.f1707c.toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                textView.setText(upperCase);
                FragmentTemplateDetailBinding fragmentTemplateDetailBinding3 = this.f2824W;
                i.b(fragmentTemplateDetailBinding3);
                fragmentTemplateDetailBinding3.contentText.setText(kVar.f1708d);
                FragmentTemplateDetailBinding fragmentTemplateDetailBinding4 = this.f2824W;
                i.b(fragmentTemplateDetailBinding4);
                fragmentTemplateDetailBinding4.tipsText.setText(kVar.e);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentTemplateDetailBinding inflate = FragmentTemplateDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.f2824W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2824W = null;
    }
}
