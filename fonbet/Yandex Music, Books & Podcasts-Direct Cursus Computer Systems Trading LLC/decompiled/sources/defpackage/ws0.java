package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ws0 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final ciq h = new ciq(0);
    public final Object[] a = new Object[2];

    public iq0 a(Context context, AttributeSet attributeSet) {
        return new iq0(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public lq0 c(Context context, AttributeSet attributeSet) {
        return new lq0(context, attributeSet);
    }

    public pr0 d(Context context, AttributeSet attributeSet) {
        return new pr0(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ba, code lost:
    
        if (r8.equals("ImageButton") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View f(View view, String str, Context context, AttributeSet attributeSet, boolean z) {
        Context context2;
        View qr0Var;
        int i;
        char c2 = 4;
        if (z) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ken.A, 0, 0);
            if (z) {
                i = obtainStyledAttributes.getResourceId(4, 0);
                if (i != 0) {
                    Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                }
            } else {
                i = 0;
            }
            obtainStyledAttributes.recycle();
            context2 = (i == 0 || ((context instanceof uf6) && ((uf6) context).a == i)) ? context : new uf6(context, i);
        } else {
            context2 = context;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        View view2 = null;
        switch (c2) {
            case 0:
                qr0Var = new qr0(context2, attributeSet);
                break;
            case 1:
                qr0Var = new mq0(context2, attributeSet);
                break;
            case 2:
                qr0Var = new nr0(context2, attributeSet);
                break;
            case 3:
                qr0Var = e(context2, attributeSet);
                break;
            case 4:
                qr0Var = new AppCompatImageButton(context2, attributeSet);
                break;
            case 5:
                qr0Var = new sr0(context2, attributeSet);
                break;
            case 6:
                qr0Var = new es0(context2, attributeSet);
                break;
            case 7:
                qr0Var = d(context2, attributeSet);
                break;
            case '\b':
                qr0Var = new us0(context2, attributeSet);
                break;
            case '\t':
                qr0Var = new AppCompatImageView(context2, attributeSet);
                break;
            case '\n':
                qr0Var = a(context2, attributeSet);
                break;
            case 11:
                qr0Var = c(context2, attributeSet);
                break;
            case '\f':
                qr0Var = new kr0(context2, attributeSet);
                break;
            case '\r':
                qr0Var = b(context2, attributeSet);
                break;
            default:
                qr0Var = null;
                break;
        }
        if (qr0Var == null && context != context2) {
            Object[] objArr = this.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = g;
                        if (i2 < 3) {
                            View g2 = g(context2, str, strArr[i2]);
                            if (g2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = g2;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View g3 = g(context2, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = g3;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            qr0Var = view2;
        }
        if (qr0Var != null) {
            Context context3 = qr0Var.getContext();
            if ((context3 instanceof ContextWrapper) && qr0Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, c);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    qr0Var.setOnClickListener(new vs0(qr0Var, string));
                }
                obtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap = wdu.a;
                    new jdu(ru.yandex.music.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(qr0Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    wdu.r(qr0Var, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z3 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = wdu.a;
                    new jdu(ru.yandex.music.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(qr0Var, Boolean.valueOf(z3));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return qr0Var;
    }

    public final View g(Context context, String str, String str2) {
        String concat;
        ciq ciqVar = h;
        Constructor constructor = (Constructor) ciqVar.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            ciqVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
