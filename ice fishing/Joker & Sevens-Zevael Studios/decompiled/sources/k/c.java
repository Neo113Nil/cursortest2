package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import l.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public final /* synthetic */ d D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3553a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3560h;

    /* renamed from: i, reason: collision with root package name */
    public int f3561i;

    /* renamed from: j, reason: collision with root package name */
    public int f3562j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3563k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3564l;

    /* renamed from: m, reason: collision with root package name */
    public int f3565m;

    /* renamed from: n, reason: collision with root package name */
    public char f3566n;

    /* renamed from: o, reason: collision with root package name */
    public int f3567o;

    /* renamed from: p, reason: collision with root package name */
    public char f3568p;

    /* renamed from: q, reason: collision with root package name */
    public int f3569q;

    /* renamed from: r, reason: collision with root package name */
    public int f3570r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3571s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3572t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3573u;

    /* renamed from: v, reason: collision with root package name */
    public int f3574v;

    /* renamed from: w, reason: collision with root package name */
    public int f3575w;

    /* renamed from: x, reason: collision with root package name */
    public String f3576x;

    /* renamed from: y, reason: collision with root package name */
    public String f3577y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3578z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3554b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3555c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3556d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3557e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3558f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3559g = true;

    public c(d dVar, Menu menu) {
        this.D = dVar;
        this.f3553a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f3583c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d dVar = this.D;
        Context context = dVar.f3583c;
        boolean z10 = false;
        menuItem.setChecked(this.f3571s).setVisible(this.f3572t).setEnabled(this.f3573u).setCheckable(this.f3570r >= 1).setTitleCondensed(this.f3564l).setIcon(this.f3565m);
        int i10 = this.f3574v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f3577y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f3584d == null) {
                dVar.f3584d = d.a(context);
            }
            Object obj = dVar.f3584d;
            String str = this.f3577y;
            b bVar = new b();
            bVar.f3551a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f3552b = cls.getMethod(str, b.f3550c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f3570r >= 2 && (menuItem instanceof i)) {
            i iVar = (i) menuItem;
            iVar.f3733x = (iVar.f3733x & (-5)) | 4;
        }
        String str2 = this.f3576x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d.f3579e, dVar.f3581a));
            z10 = true;
        }
        int i11 = this.f3575w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        CharSequence charSequence = this.f3578z;
        boolean z11 = menuItem instanceof i;
        if (z11) {
            ((i) menuItem).c(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z11) {
            ((i) menuItem).e(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c3 = this.f3566n;
        int i12 = this.f3567o;
        if (z11) {
            ((i) menuItem).setAlphabeticShortcut(c3, i12);
        } else {
            menuItem.setAlphabeticShortcut(c3, i12);
        }
        char c7 = this.f3568p;
        int i13 = this.f3569q;
        if (z11) {
            ((i) menuItem).setNumericShortcut(c7, i13);
        } else {
            menuItem.setNumericShortcut(c7, i13);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z11) {
                ((i) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z11) {
                ((i) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
