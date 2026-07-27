package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.reflect.Constructor;
import m.C4715B;
import m.C4751o;
import m.C4753p;
import m.C4755q;
import m.Z;

/* renamed from: h.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4538E {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f38022b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f38023c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38024d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f38025e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f38026f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f38027g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final s.k f38028h = new s.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f38029a = new Object[2];

    public C4751o a(Context context, AttributeSet attributeSet) {
        return new C4751o(context, attributeSet);
    }

    public C4753p b(Context context, AttributeSet attributeSet) {
        return new C4753p(context, attributeSet, C5284R.attr.buttonStyle);
    }

    public C4755q c(Context context, AttributeSet attributeSet) {
        return new C4755q(context, attributeSet, C5284R.attr.checkboxStyle);
    }

    public C4715B d(Context context, AttributeSet attributeSet) {
        return new C4715B(context, attributeSet);
    }

    public Z e(Context context, AttributeSet attributeSet) {
        return new Z(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        s.k kVar = f38028h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f38022b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f38029a);
    }
}
