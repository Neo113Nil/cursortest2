package F3;

import O.X;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class B implements TextWatcher {

    /* renamed from: n, reason: collision with root package name */
    public int f1006n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EditText f1007u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1008v;

    public B(TextInputLayout textInputLayout, EditText editText) {
        this.f1008v = textInputLayout;
        this.f1007u = editText;
        this.f1006n = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1008v;
        textInputLayout.u(!textInputLayout.f36284g1, false);
        if (textInputLayout.f36236D) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f36251L) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1007u;
        int lineCount = editText.getLineCount();
        int i = this.f1006n;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f2240a;
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f36277Z0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f1006n = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
    }
}
