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
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f71a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f72b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77g;

    /* renamed from: h, reason: collision with root package name */
    public int f78h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f79j;

    /* renamed from: k, reason: collision with root package name */
    public View f80k;

    /* renamed from: l, reason: collision with root package name */
    public View f81l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f82m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f84o;

    public e() {
        super(-2, -2);
        this.f72b = false;
        this.f73c = 0;
        this.f74d = 0;
        this.f75e = -1;
        this.f76f = -1;
        this.f77g = 0;
        this.f78h = 0;
        this.f84o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f82m;
        }
        if (i != 1) {
            return false;
        }
        return this.f83n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f72b = false;
        this.f73c = 0;
        this.f74d = 0;
        this.f75e = -1;
        this.f76f = -1;
        this.f77g = 0;
        this.f78h = 0;
        this.f84o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f5b);
        this.f73c = obtainStyledAttributes.getInteger(0, 0);
        this.f76f = obtainStyledAttributes.getResourceId(1, -1);
        this.f74d = obtainStyledAttributes.getInteger(2, 0);
        this.f75e = obtainStyledAttributes.getInteger(6, -1);
        this.f77g = obtainStyledAttributes.getInt(5, 0);
        this.f78h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f72b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4659M;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(com.anythink.core.common.d.j.f12378z)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4659M;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4661O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4660N);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e9) {
                    throw new RuntimeException(u1.h.f("Could not inflate Behavior subclass ", string), e9);
                }
            }
            this.f71a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f71a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f72b = false;
        this.f73c = 0;
        this.f74d = 0;
        this.f75e = -1;
        this.f76f = -1;
        this.f77g = 0;
        this.f78h = 0;
        this.f84o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f72b = false;
        this.f73c = 0;
        this.f74d = 0;
        this.f75e = -1;
        this.f76f = -1;
        this.f77g = 0;
        this.f78h = 0;
        this.f84o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f72b = false;
        this.f73c = 0;
        this.f74d = 0;
        this.f75e = -1;
        this.f76f = -1;
        this.f77g = 0;
        this.f78h = 0;
        this.f84o = new Rect();
    }
}
