package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.core.common.d.j;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f234f;

    /* renamed from: g, reason: collision with root package name */
    public final int f235g;

    /* renamed from: h, reason: collision with root package name */
    public int f236h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f237j;

    /* renamed from: k, reason: collision with root package name */
    public View f238k;

    /* renamed from: l, reason: collision with root package name */
    public View f239l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f242o;

    public e() {
        super(-2, -2);
        this.f230b = false;
        this.f231c = 0;
        this.f232d = 0;
        this.f233e = -1;
        this.f234f = -1;
        this.f235g = 0;
        this.f236h = 0;
        this.f242o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f240m;
        }
        if (i != 1) {
            return false;
        }
        return this.f241n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f230b = false;
        this.f231c = 0;
        this.f232d = 0;
        this.f233e = -1;
        this.f234f = -1;
        this.f235g = 0;
        this.f236h = 0;
        this.f242o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f5b);
        this.f231c = obtainStyledAttributes.getInteger(0, 0);
        this.f234f = obtainStyledAttributes.getResourceId(1, -1);
        this.f232d = obtainStyledAttributes.getInteger(2, 0);
        this.f233e = obtainStyledAttributes.getInteger(6, -1);
        this.f235g = obtainStyledAttributes.getInt(5, 0);
        this.f236h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f230b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4627M;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(j.f13164z)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4627M;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4629O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4628N);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e9) {
                    throw new RuntimeException(AbstractC5128c.f("Could not inflate Behavior subclass ", string), e9);
                }
            }
            this.f229a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f229a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f230b = false;
        this.f231c = 0;
        this.f232d = 0;
        this.f233e = -1;
        this.f234f = -1;
        this.f235g = 0;
        this.f236h = 0;
        this.f242o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f230b = false;
        this.f231c = 0;
        this.f232d = 0;
        this.f233e = -1;
        this.f234f = -1;
        this.f235g = 0;
        this.f236h = 0;
        this.f242o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f230b = false;
        this.f231c = 0;
        this.f232d = 0;
        this.f233e = -1;
        this.f234f = -1;
        this.f235g = 0;
        this.f236h = 0;
        this.f242o = new Rect();
    }
}
