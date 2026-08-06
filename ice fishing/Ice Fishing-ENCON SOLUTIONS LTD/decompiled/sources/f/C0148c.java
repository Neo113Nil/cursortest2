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
import y.AbstractC1073f;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2835A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0149d f2838D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2839a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2846h;

    /* renamed from: i, reason: collision with root package name */
    public int f2847i;

    /* renamed from: j, reason: collision with root package name */
    public int f2848j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2849k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2850l;

    /* renamed from: m, reason: collision with root package name */
    public int f2851m;

    /* renamed from: n, reason: collision with root package name */
    public char f2852n;

    /* renamed from: o, reason: collision with root package name */
    public int f2853o;

    /* renamed from: p, reason: collision with root package name */
    public char f2854p;

    /* renamed from: q, reason: collision with root package name */
    public int f2855q;

    /* renamed from: r, reason: collision with root package name */
    public int f2856r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2857s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2858u;

    /* renamed from: v, reason: collision with root package name */
    public int f2859v;

    /* renamed from: w, reason: collision with root package name */
    public int f2860w;

    /* renamed from: x, reason: collision with root package name */
    public String f2861x;

    /* renamed from: y, reason: collision with root package name */
    public String f2862y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2863z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2836B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f2837C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2840b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2841c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2842d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2843e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2844f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2845g = true;

    public C0148c(C0149d c0149d, Menu menu) {
        this.f2838D = c0149d;
        this.f2839a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2838D.f2868c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2857s).setVisible(this.t).setEnabled(this.f2858u).setCheckable(this.f2856r >= 1).setTitleCondensed(this.f2850l).setIcon(this.f2851m);
        int i2 = this.f2859v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2862y;
        C0149d c0149d = this.f2838D;
        if (str != null) {
            if (c0149d.f2868c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0149d.f2869d == null) {
                c0149d.f2869d = C0149d.a(c0149d.f2868c);
            }
            Object obj = c0149d.f2869d;
            String str2 = this.f2862y;
            MenuItemOnMenuItemClickListenerC0147b menuItemOnMenuItemClickListenerC0147b = new MenuItemOnMenuItemClickListenerC0147b();
            menuItemOnMenuItemClickListenerC0147b.f2833a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0147b.f2834b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0147b.f2832c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0147b);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof k;
        if (z3) {
        }
        if (this.f2856r >= 2 && z3) {
            k kVar = (k) menuItem;
            kVar.f3094x = (kVar.f3094x & (-5)) | 4;
        }
        String str3 = this.f2861x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0149d.f2864e, c0149d.f2866a));
            z2 = true;
        }
        int i3 = this.f2860w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f2863z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1073f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2835A;
        if (z4) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1073f.m(menuItem, charSequence2);
        }
        char c2 = this.f2852n;
        int i4 = this.f2853o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1073f.g(menuItem, c2, i4);
        }
        char c3 = this.f2854p;
        int i5 = this.f2855q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1073f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f2837C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1073f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2836B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1073f.i(menuItem, colorStateList);
            }
        }
    }
}
