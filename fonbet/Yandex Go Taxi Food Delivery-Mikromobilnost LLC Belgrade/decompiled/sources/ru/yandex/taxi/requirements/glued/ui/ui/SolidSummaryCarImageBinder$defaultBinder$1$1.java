package ru.yandex.taxi.requirements.glued.ui.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.avg0;
import defpackage.sls;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.requirements.glued.ui.image.i;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SolidSummaryCarImageBinder$defaultBinder$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        View view;
        a aVar = (a) this.receiver;
        ImageView imageView = aVar.a;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        i iVar = aVar.d;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iVar.n;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iVar.m;
        imageView.setLayoutParams(layoutParams);
        ViewGroup viewGroup = aVar.c;
        if (viewGroup != null && (view = aVar.b) != null) {
            if (iVar.m == 0) {
                view.setVisibility(8);
                xw31.L(c.d(avg0.summary_without_image_top_selector_offset, imageView), viewGroup);
            } else {
                view.setVisibility(iVar.o ? 0 : 8);
                xw31.L(c.d(avg0.summary_with_image_top_selector_offset, imageView), viewGroup);
            }
        }
        return zy11.a;
    }
}
