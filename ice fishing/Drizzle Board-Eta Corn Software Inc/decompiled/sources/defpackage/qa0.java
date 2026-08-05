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
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qa0 {
    public ds DK9slbsy;
    public boolean Ey6iv0m0;
    public int FySoLYna;
    public boolean I5GHvsYW;
    public boolean KlHjfFWx;
    public int OnDfzHZD;
    public int OxcuoDLp;
    public boolean Qr9iLBAD;
    public int RXQxj5Oe;
    public CharSequence U0LaHZX7;
    public String WYNAV5pd;
    public int amk52bBQ;
    public int eVhOlqcC;
    public final /* synthetic */ ra0 euDDoUNr;
    public String gjV1z5T1;
    public int jb9XjC4I;
    public CharSequence k3x7lurq;
    public int lDXGDhIF;
    public CharSequence lwWCatUu;
    public CharSequence ow5vqvCr;
    public final Menu qoPGr6Ce;
    public char sjUBp5pO;
    public char ygLcUYwZ;
    public ColorStateList i7xS8jrb = null;
    public PorterDuff.Mode Mq3SeTnW = null;
    public int NCTxEWno = 0;
    public int MdtA4re8 = 0;
    public int wxUZMvaN = 0;
    public int VgvYg0wo = 0;
    public boolean P7K7Inc8 = true;
    public boolean b2ZJblxo = true;

    public qa0(ra0 ra0Var, Menu menu) {
        this.euDDoUNr = ra0Var;
        this.qoPGr6Ce = menu;
    }

    public final void NCTxEWno(MenuItem menuItem) {
        ra0 ra0Var = this.euDDoUNr;
        Context context = ra0Var.MdtA4re8;
        boolean z = false;
        menuItem.setChecked(this.KlHjfFWx).setVisible(this.Ey6iv0m0).setEnabled(this.I5GHvsYW).setCheckable(this.amk52bBQ >= 1).setTitleCondensed(this.ow5vqvCr).setIcon(this.OnDfzHZD);
        int i = this.RXQxj5Oe;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.WYNAV5pd != null) {
            if (context.isRestricted()) {
                m1.Ey6iv0m0("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object obj = ra0Var.wxUZMvaN;
            if (obj == null) {
                obj = ra0.qoPGr6Ce(context);
                ra0Var.wxUZMvaN = obj;
            }
            String str = this.WYNAV5pd;
            pa0 pa0Var = new pa0();
            pa0Var.NCTxEWno = obj;
            Class<?> cls = obj.getClass();
            try {
                pa0Var.MdtA4re8 = cls.getMethod(str, pa0.wxUZMvaN);
                menuItem.setOnMenuItemClickListener(pa0Var);
            } catch (Exception e) {
                StringBuilder b2ZJblxo = q70.b2ZJblxo("Couldn't resolve menu item onClick handler ", str, " in class ");
                b2ZJblxo.append(cls.getName());
                InflateException inflateException = new InflateException(b2ZJblxo.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.amk52bBQ >= 2) {
            if (menuItem instanceof cs) {
                cs csVar = (cs) menuItem;
                csVar.gjV1z5T1 = (csVar.gjV1z5T1 & (-5)) | 4;
            } else if (menuItem instanceof gs) {
                gs gsVar = (gs) menuItem;
                sa0 sa0Var = gsVar.MdtA4re8;
                try {
                    Method method = gsVar.wxUZMvaN;
                    if (method == null) {
                        method = sa0Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        gsVar.wxUZMvaN = method;
                    }
                    method.invoke(sa0Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.gjV1z5T1;
        if (str2 != null) {
            menuItem.setActionView((View) qoPGr6Ce(str2, ra0.VgvYg0wo, ra0Var.qoPGr6Ce));
            z = true;
        }
        int i2 = this.FySoLYna;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ds dsVar = this.DK9slbsy;
        if (dsVar != null) {
            if (menuItem instanceof sa0) {
                ((sa0) menuItem).qoPGr6Ce(dsVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.lwWCatUu;
        boolean z2 = menuItem instanceof sa0;
        if (z2) {
            ((sa0) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            as.wxUZMvaN(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.U0LaHZX7;
        if (z2) {
            ((sa0) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            as.Qr9iLBAD(menuItem, charSequence2);
        }
        char c = this.ygLcUYwZ;
        int i3 = this.lDXGDhIF;
        if (z2) {
            ((sa0) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            as.MdtA4re8(menuItem, c, i3);
        }
        char c2 = this.sjUBp5pO;
        int i4 = this.OxcuoDLp;
        if (z2) {
            ((sa0) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            as.b2ZJblxo(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.Mq3SeTnW;
        if (mode != null) {
            if (z2) {
                ((sa0) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                as.P7K7Inc8(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.i7xS8jrb;
        if (colorStateList != null) {
            if (z2) {
                ((sa0) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                as.VgvYg0wo(menuItem, colorStateList);
            }
        }
    }

    public final Object qoPGr6Ce(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.euDDoUNr.MdtA4re8.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
