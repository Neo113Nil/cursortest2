package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.carddetails.b;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class vd8 extends ViewPager2.a {
    public final /* synthetic */ CardDetailsFragment a;

    public vd8(CardDetailsFragment cardDetailsFragment) {
        this.a = cardDetailsFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        b viewModel;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        bq8 bq8Var;
        CardDetailsFragment cardDetailsFragment = this.a;
        viewModel = cardDetailsFragment.getViewModel();
        if (((bq8) viewModel.X()).e.a == i) {
            pz40 Y = viewModel.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                bq8Var = (bq8) value2;
            } while (!r0Var2.k(value2, bq8.a(bq8Var, null, null, false, null, new nhq0(bq8Var.e.a, false), null, null, null, null, 16367)));
        } else {
            rt1 rt1Var = viewModel.K.k;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("position", Integer.valueOf(i));
            rt1Var.a.a("card.list.scroll", linkedHashMap);
            pz40 Y2 = viewModel.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, bq8.a((bq8) value, null, null, false, null, new nhq0(i, false), null, null, null, null, 16363)));
            viewModel.u0();
        }
        cardDetailsFragment.safePost(new md8(cardDetailsFragment, 4));
    }
}
