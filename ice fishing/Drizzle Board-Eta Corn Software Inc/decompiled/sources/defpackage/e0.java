package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class e0 {
    public final Object[] qoPGr6Ce = new Object[2];
    public static final Class[] NCTxEWno = {Context.class, AttributeSet.class};
    public static final int[] MdtA4re8 = {R.attr.onClick};
    public static final int[] wxUZMvaN = {R.attr.accessibilityHeading};
    public static final int[] VgvYg0wo = {R.attr.accessibilityPaneTitle};
    public static final int[] P7K7Inc8 = {R.attr.screenReaderFocusable};
    public static final String[] b2ZJblxo = {"android.widget.", "android.view.", "android.webkit."};
    public static final p70 Qr9iLBAD = new p70(0);

    public FOrSgJlm MdtA4re8(Context context, AttributeSet attributeSet) {
        return new FOrSgJlm(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.checkboxStyle);
    }

    public AppCompatButton NCTxEWno(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public final View P7K7Inc8(Context context, String str, String str2) {
        String concat;
        p70 p70Var = Qr9iLBAD;
        Constructor constructor = (Constructor) p70Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(NCTxEWno);
            p70Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.qoPGr6Ce);
    }

    public w VgvYg0wo(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    public uezcOCXw qoPGr6Ce(Context context, AttributeSet attributeSet) {
        return new uezcOCXw(context, attributeSet);
    }

    public vLKozZt7 wxUZMvaN(Context context, AttributeSet attributeSet) {
        return new vLKozZt7(context, attributeSet);
    }
}
