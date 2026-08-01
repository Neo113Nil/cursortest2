package O1;

import L1.C0003d;
import Q1.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends P1.a implements h, e {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f876d;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // O1.f
    public final Object a(Object obj, v1.d dVar) {
        g(obj);
        return t1.i.f4388c;
    }

    @Override // P1.a
    public final P1.c c() {
        return new r();
    }

    @Override // P1.a
    public final P1.c[] d() {
        return new r[2];
    }

    public final Object f() {
        u uVar = P1.b.f915b;
        Object obj = e.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    public final void g(Object obj) {
        int i;
        P1.c[] cVarArr;
        u uVar;
        if (obj == null) {
            obj = P1.b.f915b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (D1.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f876d;
            if ((i2 & 1) != 0) {
                this.f876d = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f876d = i3;
            P1.c[] cVarArr2 = this.f911a;
            while (true) {
                r[] rVarArr = (r[]) cVarArr2;
                if (rVarArr != null) {
                    for (r rVar : rVarArr) {
                        if (rVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f877a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(rVar);
                                if (obj2 != null && obj2 != (uVar = m.f868c)) {
                                    u uVar2 = m.f867b;
                                    if (obj2 != uVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj2, uVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(rVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0003d) obj2).b(t1.i.f4388c);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj2, uVar)) {
                                        if (atomicReferenceFieldUpdater2.get(rVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f876d;
                    if (i == i3) {
                        this.f876d = i3 + 1;
                        return;
                    }
                    cVarArr = this.f911a;
                }
                cVarArr2 = cVarArr;
                i3 = i;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:15:0x0080, B:17:0x0088, B:20:0x008f, B:21:0x0095, B:25:0x0098, B:27:0x00b9, B:30:0x00cc, B:31:0x00e4, B:37:0x00f8, B:33:0x00ef, B:36:0x00f5, B:46:0x009e, B:49:0x00a5, B:57:0x0055, B:59:0x005f, B:60:0x0070), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:15:0x0080, B:17:0x0088, B:20:0x008f, B:21:0x0095, B:25:0x0098, B:27:0x00b9, B:30:0x00cc, B:31:0x00e4, B:37:0x00f8, B:33:0x00ef, B:36:0x00f5, B:46:0x009e, B:49:0x00a5, B:57:0x0055, B:59:0x005f, B:60:0x0070), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cb -> B:15:0x0080). Please report as a decompilation issue!!! */
    @Override // O1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object w(O1.f r17, v1.d r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.q.w(O1.f, v1.d):java.lang.Object");
    }
}
