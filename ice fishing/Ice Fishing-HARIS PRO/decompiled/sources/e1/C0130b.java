package e1;

import D1.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.lumenpath.harispro.hrnavigator.databinding.ItemBenchmarkCardBinding;
import com.lumenpath.harispro.hrnavigator.databinding.ItemSimpleCardBinding;
import java.util.List;
import k0.C;
import k0.L;
import k0.b0;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130b extends C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2839d;
    public final List e;

    public C0130b(List list, int i) {
        this.f2839d = i;
        switch (i) {
            case 1:
                this.e = list;
                break;
            default:
                i.e(list, "items");
                this.e = list;
                break;
        }
    }

    @Override // k0.C
    public final int a() {
        switch (this.f2839d) {
        }
        return this.e.size();
    }

    @Override // k0.C
    public final void c(b0 b0Var, int i) {
        switch (this.f2839d) {
            case 0:
                a1.b bVar = (a1.b) this.e.get(i);
                i.e(bVar, "item");
                ItemBenchmarkCardBinding itemBenchmarkCardBinding = ((C0129a) b0Var).f2838u;
                itemBenchmarkCardBinding.valueText.setText(bVar.f1676b);
                itemBenchmarkCardBinding.labelText.setText(bVar.f1675a);
                itemBenchmarkCardBinding.contextText.setText(bVar.f1677c);
                break;
            default:
                String str = (String) this.e.get(i);
                i.e(str, "text");
                ((g) b0Var).f2849u.textView.setText(str);
                break;
        }
    }

    @Override // k0.C
    public final b0 d(ViewGroup viewGroup) {
        switch (this.f2839d) {
            case 0:
                i.e(viewGroup, "parent");
                ItemBenchmarkCardBinding inflate = ItemBenchmarkCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate, "inflate(...)");
                inflate.getRoot().setLayoutParams(new L(-2, -1));
                return new C0129a(inflate);
            default:
                i.e(viewGroup, "parent");
                ItemSimpleCardBinding inflate2 = ItemSimpleCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate2, "inflate(...)");
                return new g(inflate2);
        }
    }
}
