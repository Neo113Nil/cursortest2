package N0;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import l.MenuC0229m;
import l.SubMenuC0216E;
import l.o;
import l.y;
import p0.C0323a;
import p0.q;
import x0.C0376a;

/* loaded from: classes.dex */
public final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    public A0.b f702a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f703b;

    /* renamed from: c, reason: collision with root package name */
    public int f704c;

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
    }

    @Override // l.y
    public final void d(Context context, MenuC0229m menuC0229m) {
        this.f702a.f676E = menuC0229m;
    }

    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        return false;
    }

    @Override // l.y
    public final int f() {
        return this.f704c;
    }

    @Override // l.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // l.y
    public final Parcelable l() {
        g gVar = new g();
        gVar.f700a = this.f702a.getSelectedItemId();
        SparseArray<C0376a> badgeDrawables = this.f702a.getBadgeDrawables();
        L0.f fVar = new L0.f();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            C0376a valueAt = badgeDrawables.valueAt(i);
            fVar.put(keyAt, valueAt != null ? valueAt.e.f4750a : null);
        }
        gVar.f701b = fVar;
        return gVar;
    }

    @Override // l.y
    public final void m(boolean z2) {
        C0323a c0323a;
        if (this.f703b) {
            return;
        }
        if (z2) {
            this.f702a.b();
            return;
        }
        A0.b bVar = this.f702a;
        MenuC0229m menuC0229m = bVar.f676E;
        if (menuC0229m == null || bVar.f681f == null) {
            return;
        }
        int size = menuC0229m.f3713f.size();
        if (size != bVar.f681f.length) {
            bVar.b();
            return;
        }
        int i = bVar.f682g;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = bVar.f676E.getItem(i2);
            if (item.isChecked()) {
                bVar.f682g = item.getItemId();
                bVar.f683h = i2;
            }
        }
        if (i != bVar.f682g && (c0323a = bVar.f677a) != null) {
            q.a(bVar, c0323a);
        }
        int i3 = bVar.e;
        boolean z3 = i3 != -1 ? i3 == 0 : bVar.f676E.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            bVar.f675D.f703b = true;
            bVar.f681f[i4].setLabelVisibilityMode(bVar.e);
            bVar.f681f[i4].setShifting(z3);
            bVar.f681f[i4].c((o) bVar.f676E.getItem(i4));
            bVar.f675D.f703b = false;
        }
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof g) {
            A0.b bVar = this.f702a;
            g gVar = (g) parcelable;
            int i = gVar.f700a;
            int size = bVar.f676E.f3713f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = bVar.f676E.getItem(i2);
                if (i == item.getItemId()) {
                    bVar.f682g = i;
                    bVar.f683h = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f702a.getContext();
            L0.f fVar = gVar.f701b;
            SparseArray sparseArray2 = new SparseArray(fVar.size());
            for (int i3 = 0; i3 < fVar.size(); i3++) {
                int keyAt = fVar.keyAt(i3);
                x0.b bVar2 = (x0.b) fVar.valueAt(i3);
                sparseArray2.put(keyAt, bVar2 != null ? new C0376a(context, bVar2) : null);
            }
            A0.b bVar3 = this.f702a;
            bVar3.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = bVar3.f692s;
                if (i4 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C0376a) sparseArray2.get(keyAt2));
                }
                i4++;
            }
            d[] dVarArr = bVar3.f681f;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    C0376a c0376a = (C0376a) sparseArray.get(dVar.getId());
                    if (c0376a != null) {
                        dVar.setBadge(c0376a);
                    }
                }
            }
        }
    }
}
