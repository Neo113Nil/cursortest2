package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.text.Editable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.view.b;
import kotlin.TypeCastException;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.experiment.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.surge.dialog.TextBlockView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes6.dex */
public final class vw0 extends dv31 {
    public final /* synthetic */ int k = 0;
    public final /* synthetic */ Context l;
    public final /* synthetic */ DividerAwareComponent m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(TextBlockView textBlockView, TextBlockView textBlockView2, Context context) {
        super(textBlockView, lky0.q);
        this.m = textBlockView2;
        this.l = context;
    }

    private final void h(Object obj, Object obj2) {
    }

    private final void i(Object obj, Object obj2) {
    }

    private final void j(float f) {
    }

    private final void k(float f) {
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
        int i = this.k;
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        ww0 ww0Var;
        int buttonColor;
        rky0 rky0Var;
        rky0 rky0Var2;
        g18 g18Var;
        g18 runRotationAnimation;
        int i = this.k;
        DividerAwareComponent dividerAwareComponent = this.m;
        Context context = this.l;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                a aVar2 = (a) obj;
                AddressInputView addressInputView = (AddressInputView) dividerAwareComponent;
                ww0Var = addressInputView.binding;
                ShimmeringRobotoTextView shimmeringRobotoTextView = ww0Var.l;
                ConstraintLayout constraintLayout = ww0Var.k;
                RobotoTextView robotoTextView = ww0Var.g;
                ButtonComponent buttonComponent = ww0Var.e;
                KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = ww0Var.c;
                String str = aVar.a;
                String str2 = aVar.h;
                boolean z = aVar.n;
                CharSequence charSequence = aVar.b;
                shimmeringRobotoTextView.setText(str);
                ShimmeringRobotoTextView shimmeringRobotoTextView2 = ww0Var.l;
                String str3 = aVar.a;
                shimmeringRobotoTextView2.setVisibility((str3.length() <= 0 || !aVar.s) ? 8 : 0);
                addressInputView.canWatchText = false;
                Editable text = keyboardAwareRobotoEditText.getText();
                String obj3 = text != null ? text.toString() : null;
                boolean l = jl40.l(obj3 != null ? evu0.m0(obj3).toString() : null, charSequence);
                boolean z2 = !l;
                if (!l) {
                    if (!evu0.J(charSequence) && !evu0.A(charSequence, " ") && obj3 != null && !evu0.J(obj3)) {
                        charSequence = ((Object) charSequence) + " ";
                    }
                    keyboardAwareRobotoEditText.setText(charSequence);
                }
                keyboardAwareRobotoEditText.setHint(aVar.e);
                keyboardAwareRobotoEditText.setTextColor(s8o.m(aVar.c, context));
                addressInputView.checkClearTextVisible();
                addressInputView.canWatchText = true;
                addressInputView.updateIcon(aVar2.f, aVar.f);
                boolean z3 = aVar.r;
                buttonComponent.setVisibility((!z3 || str2.length() <= 0 || z) ? 8 : 0);
                ww0Var.f.setVisibility((z3 && str2.length() > 0 && z) ? 0 : 8);
                buttonColor = addressInputView.buttonColor(aVar);
                buttonComponent.setButtonBackground(buttonColor);
                tp11.b(0, robotoTextView);
                buttonComponent.setText(str2);
                robotoTextView.setText(str2);
                e eVar = new e();
                eVar.g(constraintLayout);
                if (str3.length() == 0 && z) {
                    eVar.i(keyboardAwareRobotoEditText.getId(), 4, 0, 4);
                } else {
                    eVar.e(keyboardAwareRobotoEditText.getId(), 4);
                }
                eVar.b(constraintLayout);
                if (z) {
                    addressInputView.setPadding(0, 0, 0, 0);
                }
                ImageView imageView = ww0Var.j;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int r = z ? tje.r(irg0.big_icon_size, addressInputView.getContext()) : tje.r(irg0.icon_size, addressInputView.getContext());
                layoutParams.width = r;
                layoutParams.height = r;
                imageView.setLayoutParams(layoutParams);
                addressInputView.updateMode(aVar.l);
                addressInputView.setVisibility(aVar.m ? 0 : 8);
                addressInputView.updateLayout(ww0Var, aVar.p);
                addressInputView.updateAddress(aVar, z2);
                return;
            default:
                lky0 lky0Var = (lky0) obj2;
                TextBlockView textBlockView = (TextBlockView) dividerAwareComponent;
                rky0Var = textBlockView.binding;
                ConstraintLayout constraintLayout2 = rky0Var.a;
                RobotoTextView robotoTextView2 = rky0Var.e;
                int i2 = lky0Var.g;
                kdc kdcVar = lky0Var.k;
                CharSequence charSequence2 = lky0Var.d;
                constraintLayout2.setMinHeight(i2);
                rky0Var2 = textBlockView.binding;
                xw31.N(lky0Var.h, rky0Var2.b);
                ImageView imageView2 = rky0Var.d;
                Drawable drawable = lky0Var.a;
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(drawable != null ? 0 : 8);
                g18Var = textBlockView.animationCancellable;
                if (g18Var != null) {
                    g18Var.cancel();
                }
                textBlockView.animationCancellable = null;
                if (drawable != null && lky0Var.b) {
                    runRotationAnimation = textBlockView.runRotationAnimation(imageView2);
                    textBlockView.animationCancellable = runRotationAnimation;
                }
                b.q(constraintLayout2, lky0Var.p);
                rky0Var.f.setText(lky0Var.c);
                robotoTextView2.setText(charSequence2);
                robotoTextView2.setVisibility(!evu0.J(charSequence2) ? 0 : 8);
                textBlockView.setDividers(DividerPosition.BOTTOM, !lky0Var.e ? DividerType.NONE : imageView2.getVisibility() == 0 ? DividerType.ICON_MARGIN : DividerType.MARGIN);
                textBlockView.renderTrail(lky0Var.f);
                kky0 kky0Var = lky0Var.i;
                if (kky0Var != null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                    constraintLayout2.setForeground(vng.t(typedValue.resourceId, context));
                    constraintLayout2.setClickable(true);
                    c.z(new z5(26, textBlockView, kky0Var), constraintLayout2);
                } else {
                    constraintLayout2.setOnClickListener(null);
                    constraintLayout2.setClickable(false);
                    constraintLayout2.setFocusable(true);
                    constraintLayout2.setForeground(null);
                }
                rky0Var.c.setVisibility(lky0Var.j ? 0 : 8);
                if (kdcVar != null) {
                    float r2 = tje.r(tsg0.gradient_component_corner_radius, textBlockView.getContext());
                    float f = lky0Var.l ? r2 : 0.0f;
                    if (!lky0Var.m) {
                        r2 = 0.0f;
                    }
                    PaintDrawable paintDrawable = new PaintDrawable(s8o.m(kdcVar, context));
                    paintDrawable.setCornerRadii(new float[]{f, f, f, f, r2, r2, r2, r2});
                    constraintLayout2.setBackground(paintDrawable);
                } else {
                    constraintLayout2.setBackground(null);
                }
                textBlockView.updateMargins(lky0Var);
                return;
        }
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        int i = this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(AddressInputView addressInputView, a aVar, AddressInputView addressInputView2, Context context) {
        super(addressInputView, aVar);
        this.m = addressInputView2;
        this.l = context;
    }
}
