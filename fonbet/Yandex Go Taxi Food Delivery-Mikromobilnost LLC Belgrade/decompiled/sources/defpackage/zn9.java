package defpackage;

import android.view.View;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import java.util.ArrayList;
import java.util.Arrays;
import ru.yandex.taxi.widget.BalanceWidget;

/* loaded from: classes12.dex */
public final class zn9 implements co9 {
    public final /* synthetic */ ChargersBackgroundModalView a;

    public zn9(ChargersBackgroundModalView chargersBackgroundModalView) {
        this.a = chargersBackgroundModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ao9 binding;
        ao9 binding2;
        ao9 binding3;
        ao9 binding4;
        ao9 binding5;
        boolean z;
        BalanceWidget balanceWidget;
        BalanceWidget balanceWidget2;
        ao9 binding6;
        ao9 binding7;
        g18 g18Var;
        ao9 binding8;
        ao9 binding9;
        ao9 binding10;
        pav pavVar;
        ao9 binding11;
        ao9 binding12;
        oo9 oo9Var = (oo9) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = oo9Var.a;
        mwa mwaVar = oo9Var.d;
        no9 no9Var = oo9Var.b;
        ChargersBackgroundModalView chargersBackgroundModalView = this.a;
        if (z2) {
            binding12 = chargersBackgroundModalView.getBinding();
            arrayList.add(binding12.i);
        } else if (z2) {
            w511.b();
            return;
        } else {
            binding = chargersBackgroundModalView.getBinding();
            arrayList2.add(binding.i);
        }
        binding2 = chargersBackgroundModalView.getBinding();
        binding2.g.setVisibility(8);
        if (no9Var != null) {
            mo9 mo9Var = no9Var.b;
            binding7 = chargersBackgroundModalView.getBinding();
            binding7.f.setText(no9Var.a);
            g18Var = chargersBackgroundModalView.loadIconCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            if (mo9Var instanceof lo9) {
                pavVar = chargersBackgroundModalView.imageLoader;
                binding11 = chargersBackgroundModalView.getBinding();
                chargersBackgroundModalView.loadIconCancellable = ((nac) pavVar.a(binding11.e)).c(((lo9) mo9Var).a);
            } else if (!(mo9Var instanceof ko9)) {
                w511.b();
                return;
            } else {
                binding8 = chargersBackgroundModalView.getBinding();
                binding8.e.setImageResource(((ko9) mo9Var).a);
            }
            binding9 = chargersBackgroundModalView.getBinding();
            arrayList.add(binding9.e);
            binding10 = chargersBackgroundModalView.getBinding();
            arrayList.add(binding10.f);
        } else {
            binding3 = chargersBackgroundModalView.getBinding();
            arrayList2.add(binding3.e);
            binding4 = chargersBackgroundModalView.getBinding();
            arrayList2.add(binding4.f);
        }
        boolean z3 = oo9Var.c;
        if (z3) {
            binding6 = chargersBackgroundModalView.getBinding();
            arrayList.add(binding6.b);
            chargersBackgroundModalView.showPlusPlaque();
        } else if (z3) {
            w511.b();
            return;
        } else {
            binding5 = chargersBackgroundModalView.getBinding();
            arrayList2.add(binding5.b);
            chargersBackgroundModalView.hidePlusPlaque();
        }
        if (jl40.l(mwaVar, bei.A)) {
            chargersBackgroundModalView.isSurgeViewShown = false;
            chargersBackgroundModalView.cancelSetContentJob();
            balanceWidget2 = chargersBackgroundModalView.surgeView;
            arrayList2.add(balanceWidget2);
        } else {
            if (!(mwaVar instanceof lwa)) {
                w511.b();
                return;
            }
            chargersBackgroundModalView.cancelSetContentJob();
            chargersBackgroundModalView.updateSurgeUi((lwa) mwaVar);
            z = chargersBackgroundModalView.isSurgeViewShown;
            if (!z) {
                chargersBackgroundModalView.isSurgeViewShown = true;
                balanceWidget = chargersBackgroundModalView.surgeView;
                arrayList.add(balanceWidget);
            }
        }
        View[] viewArr = (View[]) arrayList.toArray(new View[0]);
        for (View view : (View[]) Arrays.copyOf(viewArr, viewArr.length)) {
            cma1.J(view);
        }
        View[] viewArr2 = (View[]) arrayList2.toArray(new View[0]);
        for (View view2 : (View[]) Arrays.copyOf(viewArr2, viewArr2.length)) {
            cma1.L(view2);
        }
        arrayList.clear();
        arrayList2.clear();
    }
}
