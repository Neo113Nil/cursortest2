package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import kotlin.TypeCastException;

/* loaded from: classes14.dex */
public final /* synthetic */ class sw41 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ sw41(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return f361.o(((LayoutInflater) obj).inflate(poh0.ybsdk_item_with_text_and_checkbox, (ViewGroup) obj2, false));
            case 1:
                c cVar = (c) obj2;
                return scc.g(Boolean.valueOf(cVar.a), Integer.valueOf(((Number) cVar.e.getValue()).intValue()));
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                gru o = gru.o((LayoutInflater) obj, viewGroup);
                ConstraintLayout constraintLayout = o.a;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int measuredWidth = viewGroup.getMeasuredWidth() / 2;
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                int marginStart = measuredWidth - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
                ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                layoutParams.width = marginStart - (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0);
                constraintLayout.setLayoutParams(layoutParams);
                o.b.setRotationY(r6.getResources().getInteger(ojh0.rtl_support_angle_for_image_mirrored));
                return new vv21(o, 2);
            case 3:
                return new c7i0();
            case 4:
                return new r59();
            case 5:
                return Boolean.valueOf(z81.a(((d0l0) obj).h(), ((d0l0) obj2).h()));
            default:
                return Boolean.valueOf(z81.a(((d0l0) obj).h(), ((d0l0) obj2).h()));
        }
    }
}
