package androidx.lifecycle;

import android.os.Looper;
import i.C0185a;
import j.C0186a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1512a;

    /* renamed from: b, reason: collision with root package name */
    public C0186a f1513b;

    /* renamed from: c, reason: collision with root package name */
    public e f1514c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1516e;

    /* renamed from: f, reason: collision with root package name */
    public final N0.q f1517f;

    public j(i iVar) {
        new AtomicReference();
        this.f1512a = true;
        this.f1513b = new C0186a();
        e eVar = e.f1506g;
        this.f1514c = eVar;
        new ArrayList();
        this.f1515d = new WeakReference(iVar);
        this.f1517f = new N0.q(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0185a c0185a;
        E0.i.e(dVar, "event");
        if (this.f1512a) {
            if (C0185a.f2332k != null) {
                c0185a = C0185a.f2332k;
            } else {
                synchronized (C0185a.class) {
                    try {
                        if (C0185a.f2332k == null) {
                            C0185a.f2332k = new C0185a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0185a = C0185a.f2332k;
            }
            ((C0185a) c0185a.f2333j).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        int i2 = c.f1504a[dVar.ordinal()];
        e eVar2 = e.f1505f;
        switch (i2) {
            case 1:
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                eVar = e.f1507h;
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                eVar = e.f1508i;
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                eVar = e.f1509j;
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        e eVar3 = this.f1514c;
        if (eVar3 == eVar) {
            return;
        }
        e eVar4 = e.f1506g;
        WeakReference weakReference = this.f1515d;
        if (eVar3 == eVar4 && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f1514c + " in component " + weakReference.get()).toString());
        }
        this.f1514c = eVar;
        if (this.f1516e) {
            return;
        }
        this.f1516e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f1513b.getClass();
        Object obj = this.f1514c;
        N0.q qVar = this.f1517f;
        qVar.getClass();
        if (obj == null) {
            obj = O0.l.f831a;
        }
        qVar.a(null, obj);
        this.f1516e = false;
        if (this.f1514c == eVar2) {
            this.f1513b = new C0186a();
        }
    }
}
