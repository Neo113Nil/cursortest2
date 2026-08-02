package k;

import O.AbstractC0345o;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.Wv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.o;
import l.p;
import l.t;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4631h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f38516A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f38517B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4632i f38520E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f38521a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38528h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f38529j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f38530k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f38531l;

    /* renamed from: m, reason: collision with root package name */
    public int f38532m;

    /* renamed from: n, reason: collision with root package name */
    public char f38533n;

    /* renamed from: o, reason: collision with root package name */
    public int f38534o;

    /* renamed from: p, reason: collision with root package name */
    public char f38535p;

    /* renamed from: q, reason: collision with root package name */
    public int f38536q;

    /* renamed from: r, reason: collision with root package name */
    public int f38537r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f38538s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38539t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38540u;

    /* renamed from: v, reason: collision with root package name */
    public int f38541v;

    /* renamed from: w, reason: collision with root package name */
    public int f38542w;

    /* renamed from: x, reason: collision with root package name */
    public String f38543x;

    /* renamed from: y, reason: collision with root package name */
    public String f38544y;

    /* renamed from: z, reason: collision with root package name */
    public p f38545z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f38518C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f38519D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f38522b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f38523c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f38524d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f38525e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38526f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38527g = true;

    public C4631h(C4632i c4632i, Menu menu) {
        this.f38520E = c4632i;
        this.f38521a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f38520E.f38550c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e9) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f38538s).setVisible(this.f38539t).setEnabled(this.f38540u).setCheckable(this.f38537r >= 1).setTitleCondensed(this.f38531l).setIcon(this.f38532m);
        int i = this.f38541v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f38544y;
        C4632i c4632i = this.f38520E;
        if (str != null) {
            if (c4632i.f38550c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c4632i.f38551d == null) {
                c4632i.f38551d = C4632i.a(c4632i.f38550c);
            }
            Object obj = c4632i.f38551d;
            String str2 = this.f38544y;
            MenuItemOnMenuItemClickListenerC4630g menuItemOnMenuItemClickListenerC4630g = new MenuItemOnMenuItemClickListenerC4630g();
            menuItemOnMenuItemClickListenerC4630g.f38514a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC4630g.f38515b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC4630g.f38513c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC4630g);
            } catch (Exception e9) {
                StringBuilder l9 = Wv.l("Couldn't resolve menu item onClick handler ", str2, " in class ");
                l9.append(cls.getName());
                InflateException inflateException = new InflateException(l9.toString());
                inflateException.initCause(e9);
                throw inflateException;
            }
        }
        if (this.f38537r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f38772Q = (oVar.f38772Q & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.f38794x;
                    I.a aVar = tVar.f38793w;
                    if (method == null) {
                        tVar.f38794x = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f38794x.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str3 = this.f38543x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C4632i.f38546e, c4632i.f38548a));
            z6 = true;
        }
        int i4 = this.f38542w;
        if (i4 > 0) {
            if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        p pVar = this.f38545z;
        if (pVar != null) {
            if (menuItem instanceof I.a) {
                ((I.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f38516A;
        boolean z9 = menuItem instanceof I.a;
        if (z9) {
            ((I.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0345o.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f38517B;
        if (z9) {
            ((I.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0345o.m(menuItem, charSequence2);
        }
        char c9 = this.f38533n;
        int i6 = this.f38534o;
        if (z9) {
            ((I.a) menuItem).setAlphabeticShortcut(c9, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0345o.g(menuItem, c9, i6);
        }
        char c10 = this.f38535p;
        int i9 = this.f38536q;
        if (z9) {
            ((I.a) menuItem).setNumericShortcut(c10, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0345o.k(menuItem, c10, i9);
        }
        PorterDuff.Mode mode = this.f38519D;
        if (mode != null) {
            if (z9) {
                ((I.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0345o.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f38518C;
        if (colorStateList != null) {
            if (z9) {
                ((I.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0345o.i(menuItem, colorStateList);
            }
        }
    }
}
