package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f2a extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final xdh a;
    public final ok7 b;
    public vx3 c;
    public Function1 d;
    public tdk e;
    public boolean f;
    public final ez6 g;
    public g0c h;
    public final TranslateAnimation i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_divkit_cvn_input_view, this);
        int i2 = R.id.paymentsdk_container_for_numbers;
        LinearLayout linearLayout = (LinearLayout) dag.v(R.id.paymentsdk_container_for_numbers, this);
        if (linearLayout != null) {
            i2 = R.id.paymentsdk_cvv_blur;
            View v = dag.v(R.id.paymentsdk_cvv_blur, this);
            if (v != null) {
                i2 = R.id.paymentsdk_cvv_blur_container;
                CardView cardView = (CardView) dag.v(R.id.paymentsdk_cvv_blur_container, this);
                if (cardView != null) {
                    i2 = R.id.paymentsdk_cvv_fake_edittext;
                    EditText editText = (EditText) dag.v(R.id.paymentsdk_cvv_fake_edittext, this);
                    if (editText != null) {
                        this.a = new xdh(this, linearLayout, v, cardView, editText);
                        this.b = new ok7(0);
                        hx3 hx3Var = hx3.AmericanExpress;
                        this.c = wxf.M();
                        ez6 ez6Var = new ez6();
                        ez6Var.c = c5b.a;
                        ez6Var.b = -1;
                        this.g = ez6Var;
                        editText.addTextChangedListener(new lb4(7, this));
                        linearLayout.setOnClickListener(new ol(12, this));
                        editText.setOnFocusChangeListener(new cx3(8, this));
                        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.c.d)});
                        TranslateAnimation translateAnimation = new TranslateAnimation(2, -0.8f, 2, -0.2f, 1, 0.0f, 1, 0.0f);
                        translateAnimation.setDuration(800L);
                        translateAnimation.setInterpolator(new LinearInterpolator());
                        translateAnimation.setRepeatMode(2);
                        translateAnimation.setRepeatCount(-1);
                        this.i = translateAnimation;
                        return;
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCvn() {
        String str;
        Editable text = ((EditText) this.a.d).getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final void b(boolean z) {
        String cvn = getCvn();
        cvn.getClass();
        aw3 aw3Var = new aw3(cvn);
        sq5 a = this.b.a();
        hx3 hx3Var = this.c.a;
        hx3Var.getClass();
        ArrayList arrayList = vx3.f;
        ((ArrayList) a.b).add(new dxf(gos.n(hx3Var, false).d));
        yx3 b = a.b(aw3Var);
        if (z && b != null && !StringsKt.U(getCvn())) {
            this.g.a();
        }
        boolean z2 = b == null;
        if (this.f != z2) {
            this.f = z2;
            if (z2) {
                gut.l0(null).y();
            }
            Function1 function1 = this.d;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z2));
            }
        }
    }

    public final void c() {
        tdk tdkVar = this.e;
        if (tdkVar != null) {
            tdkVar.f(getCvn());
        }
    }

    public final void d() {
        mgk H;
        tdk tdkVar = this.e;
        if (tdkVar != null) {
            String cvn = getCvn();
            cvn.getClass();
            rdk rdkVar = tdkVar.g;
            if (rdkVar == null || (H = rdkVar.H()) == null) {
                return;
            }
            rfk rfkVar = H.k;
            ffk ffkVar = rfkVar instanceof ffk ? (ffk) rfkVar : null;
            if (ffkVar != null) {
                ogk ogkVar = H.a;
                String w = o8g.w(ffkVar);
                String b = H.b();
                ogkVar.getClass();
                w.getClass();
                j03 j03Var = ogkVar.a;
                mif.b(mif.a(j03Var.d(b), new lj0(7, j03Var, cvn, w), null, 5), lhb.y0, new igk(H, 3), 1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public final void e(boolean z) {
        xdh xdhVar = this.a;
        View view = (View) xdhVar.b;
        View view2 = (View) xdhVar.b;
        view.getLayoutParams().width = ((LinearLayout) xdhVar.a).getMeasuredWidth() * 2;
        pv8 pv8Var = (pv8) CollectionsKt.Z(this.g.c);
        if (pv8Var != null) {
            pv8Var.setState(new mv8(false));
        }
        if (z) {
            ((CardView) xdhVar.c).setVisibility(0);
            view2.startAnimation(this.i);
            return;
        }
        view2.animate().setDuration(200L).alpha(0.0f).setListener(new le(3, this)).start();
        Animation animation = view2.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public void setCardPaymentSystem(@NotNull ix3 ix3Var) {
        xdh xdhVar;
        ix3Var.getClass();
        ArrayList arrayList = vx3.f;
        this.c = gos.n(wxf.S(ix3Var), false);
        ArrayList arrayList2 = new ArrayList();
        int i = this.c.d + 1;
        int i2 = 0;
        while (true) {
            xdhVar = this.a;
            if (i2 >= i) {
                break;
            }
            LinearLayout linearLayout = (LinearLayout) xdhVar.a;
            Context context = linearLayout.getContext();
            context.getClass();
            pv8 pv8Var = new pv8(context, null, 0, 6, null);
            arrayList2.add(pv8Var);
            linearLayout.addView(pv8Var);
            i2++;
        }
        ez6 ez6Var = this.g;
        ez6Var.getClass();
        ez6Var.c = arrayList2;
        ez6Var.b = 0;
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            ((pv8) next).setState(i3 == ez6Var.b ? lv8.a : i3 == ez6Var.c.size() + (-1) ? new mv8(false) : lv8.d);
            i3 = i4;
        }
        Editable text = ((EditText) xdhVar.d).getText();
        if (text != null) {
            text.toString();
        }
        ((EditText) xdhVar.d).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.c.d)});
    }

    public final void setEventReporter(@NotNull g0c g0cVar) {
        g0cVar.getClass();
        this.h = g0cVar;
    }

    public void setOnReadyListener(Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    public void setPaymentApi(sdk sdkVar) {
        this.e = sdkVar != null ? vwb.G(sdkVar) : null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ f2a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2a(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
