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
    public final boolean f1520a;

    /* renamed from: b, reason: collision with root package name */
    public C0186a f1521b;

    /* renamed from: c, reason: collision with root package name */
    public e f1522c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1523d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1524e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.q f1525f;

    public j(i iVar) {
        new AtomicReference();
        this.f1520a = true;
        this.f1521b = new C0186a();
        e eVar = e.f1514f;
        this.f1522c = eVar;
        new ArrayList();
        this.f1523d = new WeakReference(iVar);
        this.f1525f = new O0.q(eVar);
    }

    public final void a(d dVar) {
        e eVar;
        C0185a c0185a;
        E0.i.e(dVar, "event");
        if (this.f1520a) {
            if (C0185a.f2340j != null) {
                c0185a = C0185a.f2340j;
            } else {
                synchronized (C0185a.class) {
                    try {
                        if (C0185a.f2340j == null) {
                            C0185a.f2340j = new C0185a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0185a = C0185a.f2340j;
            }
            ((C0185a) c0185a.f2341i).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException("Method handleLifecycleEvent must be called on the main thread");
            }
        }
        int i2 = c.f1512a[dVar.ordinal()];
        e eVar2 = e.f1513e;
        switch (i2) {
            case 1:
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                eVar = e.f1515g;
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                eVar = e.f1516h;
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                eVar = e.f1517i;
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar = eVar2;
                break;
            default:
                throw new IllegalArgumentException(dVar + " has no target state");
        }
        e eVar3 = this.f1522c;
        if (eVar3 == eVar) {
            return;
        }
        e eVar4 = e.f1514f;
        WeakReference weakReference = this.f1523d;
        if (eVar3 == eVar4 && eVar == eVar2) {
            throw new IllegalStateException(("no event down from " + this.f1522c + " in component " + weakReference.get()).toString());
        }
        this.f1522c = eVar;
        if (this.f1524e) {
            return;
        }
        this.f1524e = true;
        if (((i) weakReference.get()) == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        this.f1521b.getClass();
        Object obj = this.f1522c;
        O0.q qVar = this.f1525f;
        qVar.getClass();
        if (obj == null) {
            obj = P0.l.f850a;
        }
        qVar.a(null, obj);
        this.f1524e = false;
        if (this.f1522c == eVar2) {
            this.f1521b = new C0186a();
        }
    }
}
