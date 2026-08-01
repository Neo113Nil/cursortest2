package e1;

import C1.l;
import D1.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.lumenpath.harispro.hrnavigator.databinding.ItemGridCardBinding;
import com.lumenpath.harispro.hrnavigator.databinding.ItemListCardBinding;
import java.util.ArrayList;
import java.util.List;
import k0.C;
import k0.b0;
import k0.r;

/* loaded from: classes.dex */
public final class d extends C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2842d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public List f2843f;

    public /* synthetic */ d(List list, l lVar, int i) {
        this.f2842d = i;
        this.f2843f = list;
        this.e = lVar;
    }

    @Override // k0.C
    public final int a() {
        switch (this.f2842d) {
            case 0:
                return this.f2843f.size();
            default:
                return ((ArrayList) this.f2843f).size();
        }
    }

    @Override // k0.C
    public final void c(b0 b0Var, int i) {
        switch (this.f2842d) {
            case 0:
                c cVar = (c) b0Var;
                f fVar = (f) this.f2843f.get(i);
                i.e(fVar, "item");
                ItemGridCardBinding itemGridCardBinding = cVar.f2840u;
                itemGridCardBinding.iconText.setText(fVar.f2846a);
                itemGridCardBinding.titleText.setText(fVar.f2847b);
                itemGridCardBinding.getRoot().setOnClickListener(new b1.c(cVar.f2841v, 2, cVar));
                break;
            default:
                e eVar = (e) b0Var;
                f fVar2 = (f) ((ArrayList) this.f2843f).get(i);
                i.e(fVar2, "item");
                ItemListCardBinding itemListCardBinding = eVar.f2844u;
                itemListCardBinding.iconText.setText(fVar2.f2846a);
                itemListCardBinding.titleText.setText(fVar2.f2847b);
                String str = fVar2.f2848c;
                if (str.length() > 0) {
                    itemListCardBinding.descriptionText.setText(str);
                    itemListCardBinding.descriptionText.setVisibility(0);
                } else {
                    itemListCardBinding.descriptionText.setVisibility(8);
                }
                itemListCardBinding.getRoot().setOnClickListener(new b1.c(eVar.f2845v, 3, eVar));
                break;
        }
    }

    @Override // k0.C
    public final b0 d(ViewGroup viewGroup) {
        switch (this.f2842d) {
            case 0:
                i.e(viewGroup, "parent");
                ItemGridCardBinding inflate = ItemGridCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate, "inflate(...)");
                inflate.getRoot().setLayoutParams(new r(-1, -2));
                return new c(this, inflate);
            default:
                i.e(viewGroup, "parent");
                ItemListCardBinding inflate2 = ItemListCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate2, "inflate(...)");
                return new e(this, inflate2);
        }
    }
}
