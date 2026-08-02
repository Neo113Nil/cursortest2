package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.AnimationUtilsKt$addOnEndListenerForFadeOut$$inlined$addListener$default$1;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeOfferContainerView;
import java.util.Collection;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class tkd extends nx4 {
    public final ButtonSectionView h;
    public final ValueAnimator i;
    public final ValueAnimator j;
    public final ObjectAnimator k;
    public final ObjectAnimator l;
    public final ObjectAnimator m;

    public tkd(ButtonSectionView buttonSectionView, CompositeOfferContainerView compositeOfferContainerView, boolean z) {
        super(compositeOfferContainerView);
        this.h = buttonSectionView;
        this.i = new ValueAnimator();
        this.j = new ValueAnimator();
        this.k = kxa1.c(buttonSectionView.getPurchaseButton().getPurchaseTextView());
        this.l = kxa1.c(buttonSectionView.getPurchaseButton().getReadMoreTextView());
        this.m = z ? kxa1.c(buttonSectionView.getLegalsTextView()) : null;
    }

    @Override // defpackage.nx4
    public final Collection a() {
        List g = scc.g(this.j, this.i, this.k, this.l);
        ObjectAnimator objectAnimator = this.m;
        return objectAnimator != null ? a.o0(g, objectAnimator) : g;
    }

    @Override // defpackage.nx4
    public final void b() {
        this.i.removeAllUpdateListeners();
        this.j.removeAllUpdateListeners();
        this.k.removeAllListeners();
        this.l.removeAllListeners();
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
    }

    @Override // defpackage.nx4
    public final void c() {
        View view = this.h.getView();
        final int i = 0;
        int[] iArr = {view.getPaddingBottom(), 0};
        ValueAnimator valueAnimator = this.i;
        valueAnimator.setIntValues(iArr);
        final int i2 = 1;
        kxa1.b(new tls(this) { // from class: skd
            public final /* synthetic */ tkd b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                tkd tkdVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        mj91.e(intValue, tkdVar.h.getView());
                        break;
                    default:
                        View view2 = tkdVar.h.getView();
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), intValue);
                        break;
                }
                return zy11Var;
            }
        }, valueAnimator);
        int[] iArr2 = {view.getHeight(), 0};
        ValueAnimator valueAnimator2 = this.j;
        valueAnimator2.setIntValues(iArr2);
        kxa1.b(new tls(this) { // from class: skd
            public final /* synthetic */ tkd b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                tkd tkdVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        mj91.e(intValue, tkdVar.h.getView());
                        break;
                    default:
                        View view2 = tkdVar.h.getView();
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), intValue);
                        break;
                }
                return zy11Var;
            }
        }, valueAnimator2);
        nx4.d(this.k);
        ObjectAnimator objectAnimator = this.l;
        objectAnimator.setFloatValues(1.0f, 0.0f);
        objectAnimator.addListener(new AnimationUtilsKt$addOnEndListenerForFadeOut$$inlined$addListener$default$1((View) objectAnimator.getTarget()));
        ObjectAnimator objectAnimator2 = this.m;
        if (objectAnimator2 != null) {
            nx4.d(objectAnimator2);
        }
    }
}
