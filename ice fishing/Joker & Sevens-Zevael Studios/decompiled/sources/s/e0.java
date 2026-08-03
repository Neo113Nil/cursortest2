package s;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6254g;

    /* renamed from: h, reason: collision with root package name */
    public int f6255h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6256i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6257j;

    public e0(Object obj, Map map) {
        this.f6254g = 2;
        this.f6256i = obj;
        this.f6257j = map;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oc.c] */
    public void a() {
        Object invoke;
        wc.d dVar = (wc.d) this.f6257j;
        if (this.f6255h == -2) {
            invoke = ((oc.a) dVar.f7717b).invoke();
        } else {
            ?? r02 = dVar.f7718c;
            Object obj = this.f6256i;
            pc.j.b(obj);
            invoke = r02.invoke(obj);
        }
        this.f6256i = invoke;
        this.f6255h = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6254g) {
            case 0:
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (this.f6255h < ((Map) this.f6257j).size()) {
                }
                break;
            default:
                if (this.f6255h < 0) {
                    a();
                }
                if (this.f6255h == 1) {
                }
                break;
        }
        return ((wc.f) this.f6256i).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6254g) {
            case 0:
                return ((wc.f) this.f6256i).next();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((wc.f) this.f6256i).next();
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f6256i;
                this.f6255h++;
                Object obj2 = ((Map) this.f6257j).get(obj);
                if (obj2 != null) {
                    this.f6256i = ((s0.a) obj2).f6369b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            default:
                if (this.f6255h < 0) {
                    a();
                }
                if (this.f6255h == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f6256i;
                pc.j.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f6255h = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6254g) {
            case 0:
                int i10 = this.f6255h;
                if (i10 != -1) {
                    ((f0) this.f6257j).f6262h.h(i10);
                    this.f6255h = -1;
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i11 = this.f6255h;
                if (i11 != -1) {
                    ((j0) this.f6257j).f6294h.l(i11);
                    this.f6255h = -1;
                    return;
                }
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e0(wc.d dVar) {
        this.f6254g = 3;
        this.f6257j = dVar;
        this.f6255h = -2;
    }

    public e0(j0 j0Var) {
        this.f6254g = 1;
        this.f6257j = j0Var;
        this.f6255h = -1;
        this.f6256i = uc.e.m(new i0(j0Var, this, null));
    }

    public e0(f0 f0Var) {
        this.f6254g = 0;
        this.f6257j = f0Var;
        this.f6255h = -1;
        this.f6256i = uc.e.m(new d0(f0Var, this, null));
    }
}
