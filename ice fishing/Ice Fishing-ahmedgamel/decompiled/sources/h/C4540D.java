package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.Constructor;
import m.C4680B;
import m.C4716o;
import m.C4718p;
import m.C4720q;
import m.Z;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4540D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f37834b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f37835c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f37836d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f37837e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f37838f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f37839g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final s.k f37840h = new s.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f37841a = new Object[2];

    public C4716o a(Context context, AttributeSet attributeSet) {
        return new C4716o(context, attributeSet);
    }

    public C4718p b(Context context, AttributeSet attributeSet) {
        return new C4718p(context, attributeSet, C5248R.attr.buttonStyle);
    }

    public C4720q c(Context context, AttributeSet attributeSet) {
        return new C4720q(context, attributeSet, C5248R.attr.checkboxStyle);
    }

    public C4680B d(Context context, AttributeSet attributeSet) {
        return new C4680B(context, attributeSet);
    }

    public Z e(Context context, AttributeSet attributeSet) {
        return new Z(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        s.k kVar = f37840h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f37834b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f37841a);
    }
}
