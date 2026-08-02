package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class uuc {
    public final otc a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public final ArrayList c = new ArrayList();
    public boolean j = true;
    public boolean r = false;

    public uuc(otc otcVar, ClassLoader classLoader) {
        this.a = otcVar;
        this.b = classLoader;
    }

    public final void b(tuc tucVar) {
        this.c.add(tucVar);
        tucVar.d = this.d;
        tucVar.e = this.e;
        tucVar.f = this.f;
        tucVar.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            xq0.q("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.i = true;
            this.k = str;
        }
    }

    public abstract void d(int i, o oVar, String str, int i2);

    public final void e(int i, o oVar, String str) {
        if (i != 0) {
            d(i, oVar, str, 2);
        } else {
            xq0.x("Must use non-zero containerViewId");
        }
    }

    public final void f(int i, Class cls, Bundle bundle) {
        otc otcVar = this.a;
        if (otcVar == null) {
            xq0.q("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
            return;
        }
        ClassLoader classLoader = this.b;
        if (classLoader == null) {
            xq0.q("The FragmentManager must be attached to itshost to create a Fragment");
            return;
        }
        o a = otcVar.a(classLoader, cls.getName());
        if (bundle != null) {
            a.setArguments(bundle);
        }
        e(i, a, null);
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}
