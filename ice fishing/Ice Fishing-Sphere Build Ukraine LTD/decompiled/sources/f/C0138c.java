package f;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import g.k;
import java.lang.reflect.Constructor;
import w.AbstractC0268f;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1884A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0139d f1887D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1888a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1895h;

    /* renamed from: i, reason: collision with root package name */
    public int f1896i;

    /* renamed from: j, reason: collision with root package name */
    public int f1897j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1898k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1899l;

    /* renamed from: m, reason: collision with root package name */
    public int f1900m;

    /* renamed from: n, reason: collision with root package name */
    public char f1901n;

    /* renamed from: o, reason: collision with root package name */
    public int f1902o;

    /* renamed from: p, reason: collision with root package name */
    public char f1903p;

    /* renamed from: q, reason: collision with root package name */
    public int f1904q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1905s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1906t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1907u;

    /* renamed from: v, reason: collision with root package name */
    public int f1908v;

    /* renamed from: w, reason: collision with root package name */
    public int f1909w;

    /* renamed from: x, reason: collision with root package name */
    public String f1910x;

    /* renamed from: y, reason: collision with root package name */
    public String f1911y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1912z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1885B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f1886C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1889b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1890c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1891d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1892e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1893f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1894g = true;

    public C0138c(C0139d c0139d, Menu menu) {
        this.f1887D = c0139d;
        this.f1888a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1887D.f1917c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1905s).setVisible(this.f1906t).setEnabled(this.f1907u).setCheckable(this.r >= 1).setTitleCondensed(this.f1899l).setIcon(this.f1900m);
        int i2 = this.f1908v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1911y;
        C0139d c0139d = this.f1887D;
        if (str != null) {
            if (c0139d.f1917c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0139d.f1918d == null) {
                c0139d.f1918d = C0139d.a(c0139d.f1917c);
            }
            Object obj = c0139d.f1918d;
            String str2 = this.f1911y;
            MenuItemOnMenuItemClickListenerC0137b menuItemOnMenuItemClickListenerC0137b = new MenuItemOnMenuItemClickListenerC0137b();
            menuItemOnMenuItemClickListenerC0137b.f1882a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0137b.f1883b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0137b.f1881c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0137b);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof k;
        if (z3) {
        }
        if (this.r >= 2 && z3) {
            k kVar = (k) menuItem;
            kVar.f2015x = (kVar.f2015x & (-5)) | 4;
        }
        String str3 = this.f1910x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0139d.f1913e, c0139d.f1915a));
            z2 = true;
        }
        int i3 = this.f1909w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f1912z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0268f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1884A;
        if (z4) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0268f.m(menuItem, charSequence2);
        }
        char c2 = this.f1901n;
        int i4 = this.f1902o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0268f.g(menuItem, c2, i4);
        }
        char c3 = this.f1903p;
        int i5 = this.f1904q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0268f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1886C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0268f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1885B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0268f.i(menuItem, colorStateList);
            }
        }
    }
}
