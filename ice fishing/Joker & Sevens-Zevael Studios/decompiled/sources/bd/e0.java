package bd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends cd.b implements p, e, cd.s {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1093l = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: k, reason: collision with root package name */
    public int f1094k;

    public e0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        if (obj == null) {
            obj = cd.c.f1342b;
        }
        h(null, obj);
        return ac.o.f277a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // bd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(bd.f r18, fc.d r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.e0.c(bd.f, fc.d):java.lang.Object");
    }

    @Override // cd.b
    public final cd.d d() {
        return new f0();
    }

    @Override // cd.b
    public final cd.d[] e() {
        return new f0[2];
    }

    @Override // bd.c0
    public final Object getValue() {
        dd.w wVar = cd.c.f1342b;
        Object obj = f1093l.get(this);
        if (obj == wVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        int i10;
        cd.d[] dVarArr;
        dd.w wVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1093l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !pc.j.a(obj3, obj)) {
                return false;
            }
            if (pc.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f1094k;
            if ((i11 & 1) != 0) {
                this.f1094k = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f1094k = i12;
            cd.d[] dVarArr2 = this.f1337g;
            while (true) {
                f0[] f0VarArr = (f0[]) dVarArr2;
                if (f0VarArr != null) {
                    for (f0 f0Var : f0VarArr) {
                        if (f0Var != null) {
                            AtomicReference atomicReference = f0Var.f1095a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (wVar = u.f1156c)) {
                                    dd.w wVar2 = u.f1155b;
                                    if (obj4 != wVar2) {
                                        while (!atomicReference.compareAndSet(obj4, wVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((yc.g) obj4).resumeWith(ac.o.f277a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, wVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f1094k;
                    if (i10 == i12) {
                        this.f1094k = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f1337g;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }

    @Override // cd.s
    public final e l(fc.i iVar, int i10, ad.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != ad.a.f281h) && !((i10 == 0 || i10 == -3) && aVar == ad.a.f280g)) ? new cd.g(this, iVar, i10, aVar) : this;
    }
}
