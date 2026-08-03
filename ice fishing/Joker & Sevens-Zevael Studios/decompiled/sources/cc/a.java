package cc;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import s.a0;
import w0.r;
import x1.q;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ListIterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1293g;

    /* renamed from: h, reason: collision with root package name */
    public int f1294h;

    /* renamed from: i, reason: collision with root package name */
    public int f1295i;

    /* renamed from: j, reason: collision with root package name */
    public int f1296j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1297k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(q qVar, int i10, int i11) {
        this(qVar, (i11 & 1) != 0 ? 0 : i10, 0, qVar.f8147g.f6220b);
        this.f1293g = 3;
    }

    public void a() {
        int i10;
        i10 = ((AbstractList) ((b) this.f1297k).f1302k).modCount;
        if (i10 != this.f1296j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        int i11;
        switch (this.f1293g) {
            case 0:
                a();
                b bVar = (b) this.f1297k;
                int i12 = this.f1294h;
                this.f1294h = i12 + 1;
                bVar.add(i12, obj);
                this.f1295i = -1;
                i10 = ((AbstractList) bVar).modCount;
                this.f1296j = i10;
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                b();
                c cVar = (c) this.f1297k;
                int i13 = this.f1294h;
                this.f1294h = i13 + 1;
                cVar.add(i13, obj);
                this.f1295i = -1;
                i11 = ((AbstractList) cVar).modCount;
                this.f1296j = i11;
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                c();
                w0.q qVar = (w0.q) this.f1297k;
                qVar.add(this.f1294h + 1, obj);
                this.f1295i = -1;
                this.f1294h++;
                this.f1296j = r.f(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i10;
        i10 = ((AbstractList) ((c) this.f1297k)).modCount;
        if (i10 != this.f1296j) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (r.f((w0.q) this.f1297k) != this.f1296j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1293g) {
            case 0:
                return this.f1294h < ((b) this.f1297k).f1300i;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return this.f1294h < ((c) this.f1297k).f1305h;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return this.f1294h < ((w0.q) this.f1297k).size() - 1;
            default:
                return this.f1294h < this.f1296j;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1293g) {
            case 0:
                if (this.f1294h > 0) {
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (this.f1294h > 0) {
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (this.f1294h >= 0) {
                }
                break;
            default:
                if (this.f1294h > this.f1295i) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1293g) {
            case 0:
                a();
                int i10 = this.f1294h;
                b bVar = (b) this.f1297k;
                if (i10 >= bVar.f1300i) {
                    throw new NoSuchElementException();
                }
                this.f1294h = i10 + 1;
                this.f1295i = i10;
                return bVar.f1298g[bVar.f1299h + i10];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                b();
                int i11 = this.f1294h;
                c cVar = (c) this.f1297k;
                if (i11 >= cVar.f1305h) {
                    throw new NoSuchElementException();
                }
                this.f1294h = i11 + 1;
                this.f1295i = i11;
                return cVar.f1304g[i11];
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                c();
                int i12 = this.f1294h + 1;
                this.f1295i = i12;
                w0.q qVar = (w0.q) this.f1297k;
                r.a(i12, qVar.size());
                Object obj = qVar.get(i12);
                this.f1294h = i12;
                return obj;
            default:
                a0 a0Var = ((q) this.f1297k).f8147g;
                int i13 = this.f1294h;
                this.f1294h = i13 + 1;
                Object e10 = a0Var.e(i13);
                pc.j.c(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (m) e10;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1293g) {
            case 0:
                return this.f1294h;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return this.f1294h;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return this.f1294h + 1;
            default:
                return this.f1294h - this.f1295i;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1293g) {
            case 0:
                a();
                int i10 = this.f1294h;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f1294h = i11;
                this.f1295i = i11;
                b bVar = (b) this.f1297k;
                return bVar.f1298g[bVar.f1299h + i11];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                b();
                int i12 = this.f1294h;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f1294h = i13;
                this.f1295i = i13;
                return ((c) this.f1297k).f1304g[i13];
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                c();
                int i14 = this.f1294h;
                w0.q qVar = (w0.q) this.f1297k;
                r.a(i14, qVar.size());
                int i15 = this.f1294h;
                this.f1295i = i15;
                this.f1294h--;
                return qVar.get(i15);
            default:
                a0 a0Var = ((q) this.f1297k).f8147g;
                int i16 = this.f1294h - 1;
                this.f1294h = i16;
                Object e10 = a0Var.e(i16);
                pc.j.c(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (m) e10;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f1293g) {
            case 0:
                i10 = this.f1294h;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                i10 = this.f1294h;
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return this.f1294h;
            default:
                i10 = this.f1294h - this.f1295i;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10;
        int i11;
        switch (this.f1293g) {
            case 0:
                b bVar = (b) this.f1297k;
                a();
                int i12 = this.f1295i;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i12);
                this.f1294h = this.f1295i;
                this.f1295i = -1;
                i10 = ((AbstractList) bVar).modCount;
                this.f1296j = i10;
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                c cVar = (c) this.f1297k;
                b();
                int i13 = this.f1295i;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i13);
                this.f1294h = this.f1295i;
                this.f1295i = -1;
                i11 = ((AbstractList) cVar).modCount;
                this.f1296j = i11;
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                c();
                w0.q qVar = (w0.q) this.f1297k;
                qVar.remove(this.f1295i);
                this.f1294h--;
                this.f1295i = -1;
                this.f1296j = r.f(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1293g) {
            case 0:
                a();
                int i10 = this.f1295i;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f1297k).set(i10, obj);
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                b();
                int i11 = this.f1295i;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f1297k).set(i11, obj);
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                w0.q qVar = (w0.q) this.f1297k;
                c();
                int i12 = this.f1295i;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i12, obj);
                this.f1296j = r.f(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i10) {
        int i11;
        this.f1293g = 1;
        this.f1297k = cVar;
        this.f1294h = i10;
        this.f1295i = -1;
        i11 = ((AbstractList) cVar).modCount;
        this.f1296j = i11;
    }

    public a(w0.q qVar, int i10) {
        this.f1293g = 2;
        this.f1297k = qVar;
        this.f1294h = i10 - 1;
        this.f1295i = -1;
        this.f1296j = r.f(qVar);
    }

    public a(q qVar, int i10, int i11, int i12) {
        this.f1293g = 3;
        this.f1297k = qVar;
        this.f1294h = i10;
        this.f1295i = i11;
        this.f1296j = i12;
    }

    public a(b bVar, int i10) {
        int i11;
        this.f1293g = 0;
        this.f1297k = bVar;
        this.f1294h = i10;
        this.f1295i = -1;
        i11 = ((AbstractList) bVar).modCount;
        this.f1296j = i11;
    }
}
