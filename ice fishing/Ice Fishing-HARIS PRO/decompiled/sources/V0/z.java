package V0;

import O.K;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f1371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f1372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1373c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f1373c = textInputLayout;
        this.f1372b = editText;
        this.f1371a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1373c;
        textInputLayout.u(!textInputLayout.f2592A0, false);
        if (textInputLayout.f2632k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2648s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1372b;
        int lineCount = editText.getLineCount();
        int i = this.f1371a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = K.f747a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2650t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f1371a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
