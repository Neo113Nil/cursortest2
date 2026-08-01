package k;

import O.AbstractC0340o;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.o;
import l.p;
import l.t;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4621h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f38504A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f38505B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4622i f38508E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f38509a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38516h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f38517j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f38518k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f38519l;

    /* renamed from: m, reason: collision with root package name */
    public int f38520m;

    /* renamed from: n, reason: collision with root package name */
    public char f38521n;

    /* renamed from: o, reason: collision with root package name */
    public int f38522o;

    /* renamed from: p, reason: collision with root package name */
    public char f38523p;

    /* renamed from: q, reason: collision with root package name */
    public int f38524q;

    /* renamed from: r, reason: collision with root package name */
    public int f38525r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f38526s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38527t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38528u;

    /* renamed from: v, reason: collision with root package name */
    public int f38529v;

    /* renamed from: w, reason: collision with root package name */
    public int f38530w;

    /* renamed from: x, reason: collision with root package name */
    public String f38531x;

    /* renamed from: y, reason: collision with root package name */
    public String f38532y;

    /* renamed from: z, reason: collision with root package name */
    public p f38533z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f38506C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f38507D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f38510b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f38511c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f38512d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f38513e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38514f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38515g = true;

    public C4621h(C4622i c4622i, Menu menu) {
        this.f38508E = c4622i;
        this.f38509a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f38508E.f38538c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e9) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f38526s).setVisible(this.f38527t).setEnabled(this.f38528u).setCheckable(this.f38525r >= 1).setTitleCondensed(this.f38519l).setIcon(this.f38520m);
        int i = this.f38529v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f38532y;
        C4622i c4622i = this.f38508E;
        if (str != null) {
            if (c4622i.f38538c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c4622i.f38539d == null) {
                c4622i.f38539d = C4622i.a(c4622i.f38538c);
            }
            Object obj = c4622i.f38539d;
            String str2 = this.f38532y;
            MenuItemOnMenuItemClickListenerC4620g menuItemOnMenuItemClickListenerC4620g = new MenuItemOnMenuItemClickListenerC4620g();
            menuItemOnMenuItemClickListenerC4620g.f38502a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC4620g.f38503b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC4620g.f38501c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC4620g);
            } catch (Exception e9) {
                StringBuilder j6 = AbstractC4404f.j("Couldn't resolve menu item onClick handler ", str2, " in class ");
                j6.append(cls.getName());
                InflateException inflateException = new InflateException(j6.toString());
                inflateException.initCause(e9);
                throw inflateException;
            }
        }
        if (this.f38525r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f38845Q = (oVar.f38845Q & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.f38867x;
                    I.a aVar = tVar.f38866w;
                    if (method == null) {
                        tVar.f38867x = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f38867x.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str3 = this.f38531x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C4622i.f38534e, c4622i.f38536a));
            z3 = true;
        }
        int i6 = this.f38530w;
        if (i6 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i6);
            }
        }
        p pVar = this.f38533z;
        if (pVar != null) {
            if (menuItem instanceof I.a) {
                ((I.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f38504A;
        boolean z6 = menuItem instanceof I.a;
        if (z6) {
            ((I.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0340o.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f38505B;
        if (z6) {
            ((I.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0340o.m(menuItem, charSequence2);
        }
        char c9 = this.f38521n;
        int i9 = this.f38522o;
        if (z6) {
            ((I.a) menuItem).setAlphabeticShortcut(c9, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0340o.g(menuItem, c9, i9);
        }
        char c10 = this.f38523p;
        int i10 = this.f38524q;
        if (z6) {
            ((I.a) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0340o.k(menuItem, c10, i10);
        }
        PorterDuff.Mode mode = this.f38507D;
        if (mode != null) {
            if (z6) {
                ((I.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0340o.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f38506C;
        if (colorStateList != null) {
            if (z6) {
                ((I.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0340o.i(menuItem, colorStateList);
            }
        }
    }
}
