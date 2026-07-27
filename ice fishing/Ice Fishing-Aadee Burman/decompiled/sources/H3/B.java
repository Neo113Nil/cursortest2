package H3;

import O.X;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class B implements TextWatcher {

    /* renamed from: n, reason: collision with root package name */
    public int f1095n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EditText f1096u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1097v;

    public B(TextInputLayout textInputLayout, EditText editText) {
        this.f1097v = textInputLayout;
        this.f1096u = editText;
        this.f1095n = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1097v;
        textInputLayout.u(!textInputLayout.f36119g1, false);
        if (textInputLayout.f36071D) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f36086L) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1096u;
        int lineCount = editText.getLineCount();
        int i = this.f1095n;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f2054a;
                int minimumHeight = editText.getMinimumHeight();
                int i6 = textInputLayout.f36112Z0;
                if (minimumHeight != i6) {
                    editText.setMinimumHeight(i6);
                }
            }
            this.f1095n = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i6, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
    }
}
