package Z;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import h.LayoutInflaterFactory2C0159B;
import java.util.LinkedHashSet;
import r.C0342j;

/* renamed from: Z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0059g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1549a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1550b;

    public AbstractC0059g(Context context) {
        this.f1549a = context;
    }

    public void c() {
        h.y yVar = (h.y) this.f1549a;
        if (yVar != null) {
            try {
                ((LayoutInflaterFactory2C0159B) this.f1550b).f3113k.unregisterReceiver(yVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1549a = null;
        }
    }

    public void d() {
        Y y2 = (Y) this.f1549a;
        K.d dVar = (K.d) this.f1550b;
        LinkedHashSet linkedHashSet = y2.e;
        if (linkedHashSet.remove(dVar) && linkedHashSet.isEmpty()) {
            y2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof I.a)) {
            return menuItem;
        }
        I.a aVar = (I.a) menuItem;
        if (((C0342j) this.f1550b) == null) {
            this.f1550b = new C0342j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C0342j) this.f1550b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.t tVar = new l.t((Context) this.f1549a, aVar);
        ((C0342j) this.f1550b).put(aVar, tVar);
        return tVar;
    }

    public boolean h() {
        Y y2 = (Y) this.f1549a;
        View view = y2.f1505c.f1584F;
        D1.i.d(view, "operation.fragment.mView");
        int f2 = R.j.f(view);
        int i = y2.f1503a;
        return f2 == i || !(f2 == 2 || i == 2);
    }

    public abstract void i();

    public void j() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((h.y) this.f1549a) == null) {
            this.f1549a = new h.y(this);
        }
        ((LayoutInflaterFactory2C0159B) this.f1550b).f3113k.registerReceiver((h.y) this.f1549a, e);
    }

    public AbstractC0059g(Y y2, K.d dVar) {
        this.f1549a = y2;
        this.f1550b = dVar;
    }

    public AbstractC0059g(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B) {
        this.f1550b = layoutInflaterFactory2C0159B;
    }
}
