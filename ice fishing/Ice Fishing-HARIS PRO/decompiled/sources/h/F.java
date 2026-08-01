package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import m.C0238D;
import m.C0245b0;
import m.C0272p;
import m.C0274q;
import r.C0342j;

/* loaded from: classes.dex */
public class F {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f3135b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3136c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3137d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3138f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f3139g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final C0342j f3140h = new C0342j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3141a = new Object[2];

    public C0272p a(Context context, AttributeSet attributeSet) {
        return new C0272p(context, attributeSet);
    }

    public C0274q b(Context context, AttributeSet attributeSet) {
        return new C0274q(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.buttonStyle);
    }

    public m.r c(Context context, AttributeSet attributeSet) {
        return new m.r(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.checkboxStyle);
    }

    public C0238D d(Context context, AttributeSet attributeSet) {
        return new C0238D(context, attributeSet);
    }

    public C0245b0 e(Context context, AttributeSet attributeSet) {
        return new C0245b0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        C0342j c0342j = f3140h;
        Constructor constructor = (Constructor) c0342j.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3135b);
            c0342j.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3141a);
    }
}
