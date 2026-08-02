package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.superapp.discovery.map.impl.ui.model.v2.SuperAppDiscoveryMapFlexContainerState;
import kotlin.TypeCastException;
import kotlin.sequences.a;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class uyv0 implements r7c0 {
    public final /* synthetic */ wyv0 a;

    public uyv0(wyv0 wyv0Var) {
        this.a = wyv0Var;
    }

    @Override // defpackage.r7c0
    public final void b() {
        wyv0 wyv0Var = this.a;
        if (wyv0Var.r0) {
            wyv0Var.l0 = SuperAppDiscoveryMapFlexContainerState.SUCCESS;
            wyv0.Kg(wyv0Var);
        } else {
            wyv0Var.r0 = true;
        }
        ViewGroup viewGroup = wyv0Var.z.a;
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            childAt.setLayoutParams(layoutParams);
            i = i2;
        }
        RecyclerView n = c.n(viewGroup);
        if (n == null) {
            return;
        }
        for (View view : a.d(new vet0(viewGroup, 1), n)) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // defpackage.r7c0
    public final void c() {
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState = SuperAppDiscoveryMapFlexContainerState.ERROR;
        wyv0 wyv0Var = this.a;
        wyv0Var.l0 = superAppDiscoveryMapFlexContainerState;
        wyv0.Kg(wyv0Var);
    }

    @Override // defpackage.r7c0
    public final void d() {
        wyv0 wyv0Var = this.a;
        wyv0Var.r0 = false;
        wyv0Var.l0 = SuperAppDiscoveryMapFlexContainerState.LOADING;
        wyv0.Kg(wyv0Var);
    }
}
