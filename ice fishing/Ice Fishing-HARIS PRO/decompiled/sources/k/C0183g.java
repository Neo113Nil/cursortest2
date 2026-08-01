package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.o;
import l.p;
import l.t;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3326A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3327B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0184h f3330E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3331a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3337h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3338k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3339l;

    /* renamed from: m, reason: collision with root package name */
    public int f3340m;

    /* renamed from: n, reason: collision with root package name */
    public char f3341n;

    /* renamed from: o, reason: collision with root package name */
    public int f3342o;

    /* renamed from: p, reason: collision with root package name */
    public char f3343p;

    /* renamed from: q, reason: collision with root package name */
    public int f3344q;

    /* renamed from: r, reason: collision with root package name */
    public int f3345r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3346s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3347t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3348u;

    /* renamed from: v, reason: collision with root package name */
    public int f3349v;

    /* renamed from: w, reason: collision with root package name */
    public int f3350w;

    /* renamed from: x, reason: collision with root package name */
    public String f3351x;

    /* renamed from: y, reason: collision with root package name */
    public String f3352y;

    /* renamed from: z, reason: collision with root package name */
    public p f3353z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3328C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f3329D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3332b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3333c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3334d = 0;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3335f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3336g = true;

    public C0183g(C0184h c0184h, Menu menu) {
        this.f3330E = c0184h;
        this.f3331a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3330E.f3357c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3346s).setVisible(this.f3347t).setEnabled(this.f3348u).setCheckable(this.f3345r >= 1).setTitleCondensed(this.f3339l).setIcon(this.f3340m);
        int i = this.f3349v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f3352y;
        C0184h c0184h = this.f3330E;
        if (str != null) {
            if (c0184h.f3357c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0184h.f3358d == null) {
                c0184h.f3358d = C0184h.a(c0184h.f3357c);
            }
            Object obj = c0184h.f3358d;
            String str2 = this.f3352y;
            MenuItemOnMenuItemClickListenerC0182f menuItemOnMenuItemClickListenerC0182f = new MenuItemOnMenuItemClickListenerC0182f();
            menuItemOnMenuItemClickListenerC0182f.f3324a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0182f.f3325b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0182f.f3323c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0182f);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f3345r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).g(true);
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.f3768d;
                    I.a aVar = tVar.f3767c;
                    if (method == null) {
                        tVar.f3768d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f3768d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.f3351x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0184h.e, c0184h.f3355a));
            z2 = true;
        }
        int i2 = this.f3350w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        p pVar = this.f3353z;
        if (pVar != null) {
            if (menuItem instanceof I.a) {
                ((I.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3326A;
        boolean z3 = menuItem instanceof I.a;
        if (z3) {
            ((I.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3327B;
        if (z3) {
            ((I.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c2 = this.f3341n;
        int i3 = this.f3342o;
        if (z3) {
            ((I.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            menuItem.setAlphabeticShortcut(c2, i3);
        }
        char c3 = this.f3343p;
        int i4 = this.f3344q;
        if (z3) {
            ((I.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            menuItem.setNumericShortcut(c3, i4);
        }
        PorterDuff.Mode mode = this.f3329D;
        if (mode != null) {
            if (z3) {
                ((I.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f3328C;
        if (colorStateList != null) {
            if (z3) {
                ((I.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
