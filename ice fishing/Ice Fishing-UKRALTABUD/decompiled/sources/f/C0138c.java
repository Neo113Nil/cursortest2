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
import w.AbstractC0274f;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1876A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0139d f1879D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1880a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1887h;

    /* renamed from: i, reason: collision with root package name */
    public int f1888i;

    /* renamed from: j, reason: collision with root package name */
    public int f1889j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1890k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1891l;

    /* renamed from: m, reason: collision with root package name */
    public int f1892m;

    /* renamed from: n, reason: collision with root package name */
    public char f1893n;

    /* renamed from: o, reason: collision with root package name */
    public int f1894o;

    /* renamed from: p, reason: collision with root package name */
    public char f1895p;

    /* renamed from: q, reason: collision with root package name */
    public int f1896q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1897s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1898t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1899u;

    /* renamed from: v, reason: collision with root package name */
    public int f1900v;

    /* renamed from: w, reason: collision with root package name */
    public int f1901w;

    /* renamed from: x, reason: collision with root package name */
    public String f1902x;

    /* renamed from: y, reason: collision with root package name */
    public String f1903y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1904z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1877B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f1878C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1881b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1882c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1883d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1884e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1885f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1886g = true;

    public C0138c(C0139d c0139d, Menu menu) {
        this.f1879D = c0139d;
        this.f1880a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1879D.f1909c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1897s).setVisible(this.f1898t).setEnabled(this.f1899u).setCheckable(this.r >= 1).setTitleCondensed(this.f1891l).setIcon(this.f1892m);
        int i2 = this.f1900v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1903y;
        C0139d c0139d = this.f1879D;
        if (str != null) {
            if (c0139d.f1909c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0139d.f1910d == null) {
                c0139d.f1910d = C0139d.a(c0139d.f1909c);
            }
            Object obj = c0139d.f1910d;
            String str2 = this.f1903y;
            MenuItemOnMenuItemClickListenerC0137b menuItemOnMenuItemClickListenerC0137b = new MenuItemOnMenuItemClickListenerC0137b();
            menuItemOnMenuItemClickListenerC0137b.f1874a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0137b.f1875b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0137b.f1873c);
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
            kVar.f2007x = (kVar.f2007x & (-5)) | 4;
        }
        String str3 = this.f1902x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0139d.f1905e, c0139d.f1907a));
            z2 = true;
        }
        int i3 = this.f1901w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f1904z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0274f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1876A;
        if (z4) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0274f.m(menuItem, charSequence2);
        }
        char c2 = this.f1893n;
        int i4 = this.f1894o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0274f.g(menuItem, c2, i4);
        }
        char c3 = this.f1895p;
        int i5 = this.f1896q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0274f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1878C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0274f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1877B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0274f.i(menuItem, colorStateList);
            }
        }
    }
}
