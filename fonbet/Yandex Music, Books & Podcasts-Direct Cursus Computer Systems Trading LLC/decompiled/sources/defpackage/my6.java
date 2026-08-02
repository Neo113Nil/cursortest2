package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class my6 extends ly6 {
    public static final /* synthetic */ int h = 0;
    public final mka a;
    public final ok7 b;
    public vx3 c;
    public Function1 d;
    public Function1 e;
    public tdk f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my6(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_cvn_input_view_impl, this);
        int i2 = R.id.paymentsdk_prebuilt_cvn_field;
        if (((TextInputEditText) dag.v(R.id.paymentsdk_prebuilt_cvn_field, this)) != null) {
            i2 = R.id.paymentsdk_prebuilt_cvn_layout;
            TextInputLayout textInputLayout = (TextInputLayout) dag.v(R.id.paymentsdk_prebuilt_cvn_layout, this);
            if (textInputLayout != null) {
                this.a = new mka(this, textInputLayout);
                this.b = new ok7(0);
                hx3 hx3Var = hx3.AmericanExpress;
                this.c = wxf.M();
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.addTextChangedListener(new lb4(2, this));
                }
                EditText editText2 = textInputLayout.getEditText();
                if (editText2 != null) {
                    editText2.setOnFocusChangeListener(new cx3(4, this));
                }
                InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(this.c.d)};
                EditText editText3 = textInputLayout.getEditText();
                if (editText3 == null) {
                    return;
                }
                editText3.setFilters(lengthFilterArr);
                return;
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final String getCvn() {
        String str;
        Editable text;
        EditText editText = ((TextInputLayout) this.a.a).getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        }
        return str == null ? "" : str;
    }

    @Override // defpackage.ly6
    public final void a() {
        tdk tdkVar = this.f;
        if (tdkVar != null) {
            tdkVar.f(getCvn());
        }
    }

    public final void b(boolean z) {
        mka mkaVar = this.a;
        ((TextInputLayout) mkaVar.a).setErrorEnabled(false);
        TextInputLayout textInputLayout = (TextInputLayout) mkaVar.a;
        textInputLayout.setError(null);
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
            textInputLayout.setErrorEnabled(true);
            String str = b.a;
            if (str == null) {
                str = getResources().getString(R.string.paymentsdk_prebuilt_wrong_cvv_message);
            }
            textInputLayout.setError(str);
        }
        boolean z2 = b == null;
        if (this.g != z2) {
            this.g = z2;
            Function1 function1 = this.d;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z2));
            }
        }
    }

    @Override // defpackage.ly6
    public void setCardPaymentSystem(@NotNull ix3 ix3Var) {
        ix3Var.getClass();
        ArrayList arrayList = vx3.f;
        this.c = gos.n(wxf.S(ix3Var), false);
        InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(this.c.d)};
        EditText editText = ((TextInputLayout) this.a.a).getEditText();
        if (editText == null) {
            return;
        }
        editText.setFilters(lengthFilterArr);
    }

    @Override // defpackage.ly6
    public void setOnCvnInputFocusChangeListener(Function1<? super Boolean, Unit> function1) {
        this.e = function1;
    }

    @Override // defpackage.ly6
    public void setOnReadyListener(Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    @Override // defpackage.ly6
    public void setPaymentApi(sdk sdkVar) {
        this.f = sdkVar != null ? qgg.D(sdkVar) : null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public my6(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ my6(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public my6(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
