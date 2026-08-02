package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class lsr {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ msr E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public txh z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public lsr(msr msrVar, Menu menu) {
        this.E = msrVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        msr msrVar = this.E;
        Context context = msrVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                xq0.q("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (msrVar.d == null) {
                msrVar.d = msr.a(context);
            }
            Object obj = msrVar.d;
            String str = this.y;
            ksr ksrVar = new ksr();
            ksrVar.b = obj;
            Class<?> cls = obj.getClass();
            try {
                ksrVar.c = cls.getMethod(str, ksr.d);
                menuItem.setOnMenuItemClickListener(ksrVar);
            } catch (Exception e) {
                StringBuilder u = ouj.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                u.append(cls.getName());
                InflateException inflateException = new InflateException(u.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof rxh) {
                rxh rxhVar = (rxh) menuItem;
                rxhVar.x = (rxhVar.x & (-5)) | 4;
            } else if (menuItem instanceof wxh) {
                wxh wxhVar = (wxh) menuItem;
                nsr nsrVar = wxhVar.d;
                try {
                    if (wxhVar.e == null) {
                        wxhVar.e = nsrVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wxhVar.e.invoke(nsrVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, msr.e, msrVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        txh txhVar = this.z;
        if (txhVar != null) {
            if (menuItem instanceof nsr) {
                ((nsr) menuItem).b(txhVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof nsr;
        if (z2) {
            ((nsr) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            gvt.R(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((nsr) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            gvt.X(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((nsr) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            gvt.P(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((nsr) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            gvt.W(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((nsr) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                gvt.U(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((nsr) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                gvt.T(menuItem, colorStateList);
            }
        }
    }
}
