package defpackage;

import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.widget.b;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;

/* loaded from: classes2.dex */
public abstract class xty0 {
    public static final Text a(Integer num, String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        return str != null ? new Text.Constant(str) : num != null ? new Text.Resource(num.intValue()) : Text.Empty.INSTANCE;
    }

    public static void b(TextView textView) {
        textView.setSingleLine(true);
        textView.setHorizontalFadingEdgeEnabled(true);
        textView.setFadingEdgeLength(kp50.r(32));
        textView.setSelected(true);
    }

    public static void c(TextView textView, Text text, z2v0 z2v0Var, tls tlsVar, int i) {
        CharSequence a;
        String obj;
        tls tlsVar2 = z2v0Var;
        if ((i & 2) != 0) {
            tlsVar2 = new uiy0(19);
        }
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) != 0;
        if ((i & 16) != 0) {
            tlsVar = new xvq(29);
        }
        textView.setText((text == null || (a = d.a(textView.getContext(), text)) == null || (obj = a.toString()) == null) ? null : (Spanned) tlsVar2.invoke(rtu.a(tlsVar, obj)));
        if (z) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (z2) {
            return;
        }
        textView.setHighlightColor(0);
    }

    public static final void d(TextView textView, Text text) {
        textView.setText(text != null ? d.a(textView.getContext(), text) : null);
    }

    public static final void e(TextView textView, ColorModel colorModel) {
        textView.setTextColor(colorModel.get(textView.getContext()));
    }

    public static final void f(TextView textView, int i) {
        textView.setTextColor(rje.a(textView.getContext(), i));
    }

    public static final void g(TextView textView, int i) {
        textView.setTextAppearance(i);
        try {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(i, n4i0.AppCompatTextView);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n4i0.AppCompatTextView_lineHeight, -1);
                if (dimensionPixelSize > 0) {
                    b.b(textView, dimensionPixelSize);
                }
            } catch (Exception e) {
                trp0 trp0Var = trp0.a;
                trp0.e(new jqp0(e, "Failed to get dimension pixel size", null, null));
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Exception e2) {
            trp0 trp0Var2 = trp0.a;
            trp0.e(new jqp0(e2, "Failed to obtain styled attributes", null, null));
        }
    }
}
