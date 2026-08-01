package com.lumenpath.harispro.hrnavigator.ui.structures;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.l;
import a1.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentStructureDetailBinding;
import com.lumenpath.harispro.hrnavigator.databinding.ItemOrgLevelBinding;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class StructureDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentStructureDetailBinding f2822W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        int i = G().getInt("structureId");
        for (m mVar : l.f1651a) {
            if (mVar.f1714a == i) {
                FragmentStructureDetailBinding fragmentStructureDetailBinding = this.f2822W;
                i.b(fragmentStructureDetailBinding);
                fragmentStructureDetailBinding.titleText.setText(mVar.f1715b);
                FragmentStructureDetailBinding fragmentStructureDetailBinding2 = this.f2822W;
                i.b(fragmentStructureDetailBinding2);
                fragmentStructureDetailBinding2.descriptionText.setText(mVar.f1716c);
                FragmentStructureDetailBinding fragmentStructureDetailBinding3 = this.f2822W;
                i.b(fragmentStructureDetailBinding3);
                fragmentStructureDetailBinding3.prosText.setText(mVar.f1717d);
                FragmentStructureDetailBinding fragmentStructureDetailBinding4 = this.f2822W;
                i.b(fragmentStructureDetailBinding4);
                fragmentStructureDetailBinding4.consText.setText(mVar.e);
                FragmentStructureDetailBinding fragmentStructureDetailBinding5 = this.f2822W;
                i.b(fragmentStructureDetailBinding5);
                fragmentStructureDetailBinding5.whenText.setText(mVar.f1718f);
                for (String str : mVar.f1719g) {
                    LayoutInflater layoutInflater = this.f1588K;
                    if (layoutInflater == null) {
                        layoutInflater = x(null);
                        this.f1588K = layoutInflater;
                    }
                    FragmentStructureDetailBinding fragmentStructureDetailBinding6 = this.f2822W;
                    i.b(fragmentStructureDetailBinding6);
                    ItemOrgLevelBinding inflate = ItemOrgLevelBinding.inflate(layoutInflater, fragmentStructureDetailBinding6.schemaContainer, false);
                    i.d(inflate, "inflate(...)");
                    inflate.levelText.setText(str);
                    FragmentStructureDetailBinding fragmentStructureDetailBinding7 = this.f2822W;
                    i.b(fragmentStructureDetailBinding7);
                    fragmentStructureDetailBinding7.schemaContainer.addView(inflate.getRoot());
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentStructureDetailBinding inflate = FragmentStructureDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.f2822W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2822W = null;
    }
}
