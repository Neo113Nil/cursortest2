package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.icefishing.icefishingbigwin.C5275R;
import java.lang.reflect.Constructor;
import m.C4668B;
import m.C4703o;
import m.C4705p;
import m.C4707q;
import m.Z;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4536D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f37809b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f37810c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f37811d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f37812e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f37813f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f37814g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final s.k f37815h = new s.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f37816a = new Object[2];

    public C4703o a(Context context, AttributeSet attributeSet) {
        return new C4703o(context, attributeSet);
    }

    public C4705p b(Context context, AttributeSet attributeSet) {
        return new C4705p(context, attributeSet, C5275R.attr.buttonStyle);
    }

    public C4707q c(Context context, AttributeSet attributeSet) {
        return new C4707q(context, attributeSet, C5275R.attr.checkboxStyle);
    }

    public C4668B d(Context context, AttributeSet attributeSet) {
        return new C4668B(context, attributeSet);
    }

    public Z e(Context context, AttributeSet attributeSet) {
        return new Z(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        s.k kVar = f37815h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f37809b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f37816a);
    }
}
