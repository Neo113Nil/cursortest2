package bd;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import b0.p0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import m0.a2;
import m0.d1;
import x.n1;
import x.z0;
import y1.g1;
import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1128g;

    /* renamed from: h, reason: collision with root package name */
    public int f1129h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1130i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1131j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1132k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1133l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c5.c cVar, fc.d dVar) {
        super(2, dVar);
        this.f1128g = 3;
        this.f1132k = cVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1128g) {
            case 0:
                o oVar = new o((e) this.f1130i, (e0) this.f1131j, (Float) this.f1132k, dVar, 0);
                oVar.f1133l = obj;
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new o((b0) this.f1133l, (e) this.f1130i, (e0) this.f1131j, (Float) this.f1132k, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new o((d2.d) this.f1133l, (ScrollCaptureSession) this.f1130i, (Rect) this.f1131j, (Consumer) this.f1132k, dVar, 2);
            case 3:
                o oVar2 = new o((c5.c) this.f1132k, dVar);
                oVar2.f1133l = obj;
                return oVar2;
            case 4:
                o oVar3 = new o((d1) this.f1131j, (v.e0) this.f1132k, dVar);
                oVar3.f1133l = obj;
                return oVar3;
            default:
                o oVar4 = new o((x.i) this.f1130i, (n1) this.f1131j, (x.d) this.f1132k, dVar, 5);
                oVar4.f1133l = obj;
                return oVar4;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1128g) {
            case 0:
                return ((o) create((w) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((o) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return ((o) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case 3:
                return ((o) create((f) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case 4:
                ((o) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
                return gc.a.f2559g;
            default:
                return ((o) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0280, code lost:
    
        if (bd.u.e(r3, r4, r26) == r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (m0.z.p(getContext()).l(r8, r26) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        if (bd.u.e(r4, r6, r26) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cd, code lost:
    
        if (r3 == r7) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:53:0x012b, B:55:0x01a6, B:60:0x01b5, B:62:0x01bd, B:70:0x0148), top: B:48:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [e5.a] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r6v7, types: [c5.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bd.f, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e4 -> B:31:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0106 -> B:31:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01cd -> B:54:0x01a6). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a6;
        ad.b bVar;
        ?? r82;
        e5.a aVar;
        Object obj2;
        f fVar;
        yc.y yVar;
        pc.p pVar;
        CancellationException cancellationException = null;
        ?? r42 = 0;
        switch (this.f1128g) {
            case 0:
                e0 e0Var = (e0) this.f1131j;
                gc.a aVar2 = gc.a.f2559g;
                int i10 = this.f1129h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    int ordinal = ((w) this.f1133l).ordinal();
                    if (ordinal == 0) {
                        e eVar = (e) this.f1130i;
                        this.f1129h = 1;
                        if (eVar.c(e0Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (ordinal == 2) {
                        Float f10 = (Float) this.f1132k;
                        if (f10 == u.f1154a) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        e0Var.h(null, f10);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ac.o oVar = ac.o.f277a;
                e eVar2 = (e) this.f1130i;
                e0 e0Var2 = (e0) this.f1131j;
                gc.a aVar3 = gc.a.f2559g;
                int i11 = this.f1129h;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            v6.a.W(obj);
                        } else if (i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                b0 b0Var = (b0) this.f1133l;
                if (b0Var == x.f1163a) {
                    this.f1129h = 1;
                    if (eVar2.c(e0Var2, this) != aVar3) {
                        return oVar;
                    }
                } else {
                    fc.d dVar = null;
                    if (b0Var == x.f1164b) {
                        cd.b0 g8 = e0Var2.g();
                        n nVar = new n(2, null);
                        this.f1129h = 2;
                        break;
                    } else {
                        cd.b0 g10 = e0Var2.g();
                        z zVar = new z(b0Var, null);
                        int i12 = k.f1116a;
                        fc.j jVar = fc.j.f2348g;
                        ad.a aVar4 = ad.a.f280g;
                        e c3 = u.c(u.c(new x4.s(1, new cd.k(zVar, g10, jVar, -2, aVar4), new a0(2, r42, dVar))));
                        o oVar2 = new o(eVar2, e0Var2, (Float) this.f1132k, dVar, 0);
                        this.f1129h = 4;
                        Object c7 = new cd.k(new j(oVar2, dVar, r42), c3, jVar, -2, aVar4).l(jVar, 0, aVar4).c(cd.u.f1390g, this);
                        if (c7 != aVar3) {
                            c7 = oVar;
                        }
                        if (c7 != aVar3) {
                            c7 = oVar;
                        }
                        if (c7 != aVar3) {
                            return oVar;
                        }
                    }
                }
                return aVar3;
                this.f1129h = 3;
                if (eVar2.c(e0Var2, this) != aVar3) {
                    return oVar;
                }
                return aVar3;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                gc.a aVar5 = gc.a.f2559g;
                int i13 = this.f1129h;
                if (i13 == 0) {
                    v6.a.W(obj);
                    d2.d dVar2 = (d2.d) this.f1133l;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f1130i;
                    Rect rect = (Rect) this.f1131j;
                    s2.j jVar2 = new s2.j(rect.left, rect.top, rect.right, rect.bottom);
                    this.f1129h = 1;
                    a6 = d2.d.a(dVar2, scrollCaptureSession, jVar2, this);
                    if (a6 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    a6 = obj;
                }
                ((Consumer) this.f1132k).accept(f1.d0.r((s2.j) a6));
                return ac.o.f277a;
            case 3:
                ac.o oVar3 = ac.o.f277a;
                ?? r62 = (c5.c) this.f1132k;
                gc.a aVar6 = gc.a.f2559g;
                int i14 = this.f1129h;
                try {
                    if (i14 == 0) {
                        v6.a.W(obj);
                        f fVar2 = (f) this.f1133l;
                        ad.e a8 = a.a.a(-1, 6, null);
                        a8.s(oVar3);
                        e5.a aVar7 = new e5.a(a8);
                        g5.j jVar3 = r62.f1230d;
                        String[] strArr = r62.f1229c;
                        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                        jVar3.getClass();
                        pc.j.e(strArr2, "queryKeys");
                        synchronized (jVar3.f2534k) {
                            try {
                                for (String str : strArr2) {
                                    LinkedHashMap linkedHashMap = jVar3.f2534k;
                                    Object obj3 = linkedHashMap.get(str);
                                    if (obj3 == null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        linkedHashMap.put(str, linkedHashSet);
                                        obj3 = linkedHashSet;
                                    }
                                    ((Set) obj3).add(aVar7);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            bVar = new ad.b(a8);
                            r42 = aVar7;
                            fVar = fVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            r42 = aVar7;
                            r62.b(r42);
                            throw th;
                        }
                    } else if (i14 == 1) {
                        ad.b bVar2 = (ad.b) this.f1131j;
                        e5.a aVar8 = (e5.a) this.f1130i;
                        f fVar3 = (f) this.f1133l;
                        v6.a.W(obj);
                        bVar = bVar2;
                        obj2 = obj;
                        aVar = aVar8;
                        r82 = fVar3;
                        if (((Boolean) obj2).booleanValue()) {
                            r62.b(aVar);
                            return oVar3;
                        }
                        bVar.c();
                        this.f1133l = r82;
                        this.f1130i = aVar;
                        this.f1131j = bVar;
                        this.f1129h = 2;
                        Object a10 = r82.a(r62, this);
                        r42 = aVar;
                        fVar = r82;
                        break;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ad.b bVar3 = (ad.b) this.f1131j;
                        e5.a aVar9 = (e5.a) this.f1130i;
                        f fVar4 = (f) this.f1133l;
                        v6.a.W(obj);
                        bVar = bVar3;
                        r42 = aVar9;
                        fVar = fVar4;
                    }
                    this.f1133l = fVar;
                    this.f1130i = r42;
                    this.f1131j = bVar;
                    this.f1129h = 1;
                    obj2 = bVar.b(this);
                    aVar = r42;
                    r82 = fVar;
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 4:
                gc.a aVar10 = gc.a.f2559g;
                int i15 = this.f1129h;
                if (i15 == 0) {
                    v6.a.W(obj);
                    yc.y yVar2 = (yc.y) this.f1133l;
                    pc.p pVar2 = new pc.p();
                    pVar2.f5680g = 1.0f;
                    yVar = yVar2;
                    pVar = pVar2;
                } else if (i15 == 1) {
                    pc.p pVar3 = (pc.p) this.f1130i;
                    yc.y yVar3 = (yc.y) this.f1133l;
                    v6.a.W(obj);
                    pVar = pVar3;
                    yVar = yVar3;
                    if (pVar.f5680g == 0.0f) {
                        f8.c cVar = new f8.c(new ld.d(new p0(14, yVar), (fc.d) null));
                        v.d0 d0Var = new v.d0(2, null);
                        this.f1133l = yVar;
                        this.f1130i = pVar;
                        this.f1129h = 2;
                        break;
                    }
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pc.p pVar4 = (pc.p) this.f1130i;
                    yc.y yVar4 = (yc.y) this.f1133l;
                    v6.a.W(obj);
                    pVar = pVar4;
                    yVar = yVar4;
                }
                b0.v vVar = new b0.v((d1) this.f1131j, (v.e0) this.f1132k, pVar, yVar, 3);
                this.f1133l = yVar;
                this.f1130i = pVar;
                this.f1129h = 1;
                if (getContext().v(g1.f8550g) != null) {
                    throw new ClassCastException();
                }
                break;
            default:
                x.i iVar = (x.i) this.f1130i;
                b0.j jVar4 = iVar.f7810x;
                gc.a aVar11 = gc.a.f2559g;
                int i16 = this.f1129h;
                try {
                    try {
                        if (i16 == 0) {
                            v6.a.W(obj);
                            b1 k3 = yc.a0.k(((yc.y) this.f1133l).f());
                            iVar.C = true;
                            z0 z0Var = iVar.f7808v;
                            w.p0 p0Var = w.p0.f7480g;
                            a2 a2Var = new a2((n1) this.f1131j, iVar, (x.d) this.f1132k, k3, null, 1);
                            this.f1129h = 1;
                            if (z0Var.e(p0Var, a2Var, this) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                        }
                        jVar4.b();
                        iVar.C = false;
                        jVar4.a(null);
                        iVar.A = false;
                        return ac.o.f277a;
                    } catch (CancellationException e10) {
                        cancellationException = e10;
                        throw cancellationException;
                    }
                } catch (Throwable th4) {
                    iVar.C = false;
                    jVar4.a(cancellationException);
                    iVar.A = false;
                    throw th4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1128g = i10;
        this.f1130i = obj;
        this.f1131j = obj2;
        this.f1132k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1128g = i10;
        this.f1133l = obj;
        this.f1130i = obj2;
        this.f1131j = obj3;
        this.f1132k = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d1 d1Var, v.e0 e0Var, fc.d dVar) {
        super(2, dVar);
        this.f1128g = 4;
        this.f1131j = d1Var;
        this.f1132k = e0Var;
    }
}
