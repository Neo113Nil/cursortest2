package J3;

import O.X;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class B implements TextWatcher {

    /* renamed from: n, reason: collision with root package name */
    public int f1451n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EditText f1452u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1453v;

    public B(TextInputLayout textInputLayout, EditText editText) {
        this.f1453v = textInputLayout;
        this.f1452u = editText;
        this.f1451n = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1453v;
        textInputLayout.u(!textInputLayout.f36882b1, false);
        if (textInputLayout.f36839D) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f36854L) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1452u;
        int lineCount = editText.getLineCount();
        int i = this.f1451n;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f2142a;
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f36873U0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f1451n = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }
}
