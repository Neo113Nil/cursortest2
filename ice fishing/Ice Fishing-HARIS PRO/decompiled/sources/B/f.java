package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c f12a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17g;

    /* renamed from: h, reason: collision with root package name */
    public int f18h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f19k;

    /* renamed from: l, reason: collision with root package name */
    public View f20l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f23o;

    public f() {
        super(-2, -2);
        this.f13b = false;
        this.f14c = 0;
        this.f15d = 0;
        this.e = -1;
        this.f16f = -1;
        this.f17g = 0;
        this.f18h = 0;
        this.f23o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f21m;
        }
        if (i != 1) {
            return false;
        }
        return this.f22n;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar;
        this.f13b = false;
        this.f14c = 0;
        this.f15d = 0;
        this.e = -1;
        this.f16f = -1;
        this.f17g = 0;
        this.f18h = 0;
        this.f23o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f1b);
        this.f14c = obtainStyledAttributes.getInteger(0, 0);
        this.f16f = obtainStyledAttributes.getResourceId(1, -1);
        this.f15d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.f17g = obtainStyledAttributes.getInt(5, 0);
        this.f18h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f13b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1902t;
            if (TextUtils.isEmpty(string)) {
                cVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1902t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1904v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1903u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    cVar = (c) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.f12a = cVar;
        }
        obtainStyledAttributes.recycle();
        c cVar2 = this.f12a;
        if (cVar2 != null) {
            cVar2.g(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.f13b = false;
        this.f14c = 0;
        this.f15d = 0;
        this.e = -1;
        this.f16f = -1;
        this.f17g = 0;
        this.f18h = 0;
        this.f23o = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f13b = false;
        this.f14c = 0;
        this.f15d = 0;
        this.e = -1;
        this.f16f = -1;
        this.f17g = 0;
        this.f18h = 0;
        this.f23o = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13b = false;
        this.f14c = 0;
        this.f15d = 0;
        this.e = -1;
        this.f16f = -1;
        this.f17g = 0;
        this.f18h = 0;
        this.f23o = new Rect();
    }
}
