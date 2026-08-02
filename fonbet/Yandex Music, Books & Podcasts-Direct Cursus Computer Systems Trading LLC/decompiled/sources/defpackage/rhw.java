package defpackage;

import androidx.core.app.n0;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import com.yandex.passport.api.b0;
import com.yandex.passport.api.h2;
import com.yandex.passport.api.o0;
import com.yandex.passport.api.u1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.ui.progress.c;
import com.yandex.passport.data.network.a1;
import com.yandex.passport.data.network.e6;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.data.network.g9;
import com.yandex.passport.data.network.ia;
import com.yandex.passport.data.network.pa;
import com.yandex.passport.data.network.rb;
import com.yandex.passport.data.network.x8;
import com.yandex.passport.data.network.xb;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.autologin.d;
import com.yandex.passport.internal.core.accounts.k;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.methods.b4;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.q1;
import com.yandex.passport.internal.report.reporters.i;
import com.yandex.passport.internal.report.t1;
import com.yandex.passport.internal.sloth.credentialmanager.a;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.c1;
import com.yandex.passport.internal.ui.bouncer.model.d0;
import com.yandex.passport.internal.ui.bouncer.model.e;
import com.yandex.passport.internal.ui.bouncer.model.f0;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.h0;
import com.yandex.passport.internal.ui.bouncer.model.i0;
import com.yandex.passport.internal.ui.bouncer.model.i2;
import com.yandex.passport.internal.ui.bouncer.model.j;
import com.yandex.passport.internal.ui.bouncer.model.j0;
import com.yandex.passport.internal.ui.bouncer.model.k0;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t;
import com.yandex.passport.internal.ui.bouncer.model.u;
import com.yandex.passport.internal.ui.bouncer.model.v;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w;
import com.yandex.passport.internal.ui.bouncer.model.y;
import com.yandex.passport.internal.ui.bouncer.model.z;
import com.yandex.passport.internal.ui.bouncer.model.z0;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rhw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhw(String str, xhw xhwVar, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.m = str;
        this.l = xhwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rhw((xhw) this.l, (kot) this.m, continuation, 0);
            case 1:
                return new rhw((String) this.m, (xhw) this.l, continuation);
            case 2:
                return new rhw((akw) this.l, (u9n) this.m, continuation, 2);
            case 3:
                return new rhw((List) this.l, continuation, (jkw) this.m, 3);
            case 4:
                rhw rhwVar = new rhw((anw) this.m, continuation, 4);
                rhwVar.l = obj;
                return rhwVar;
            case 5:
                rhw rhwVar2 = new rhw((vkw) this.m, continuation, 5);
                rhwVar2.l = obj;
                return rhwVar2;
            case 6:
                return new rhw((ysw) this.l, (ssw) this.m, continuation, 6);
            case 7:
                rhw rhwVar3 = new rhw((pqw) this.m, continuation, 7);
                rhwVar3.l = obj;
                return rhwVar3;
            case 8:
                return new rhw((Function2) this.l, (enj) this.m, continuation, 8);
            case 9:
                return new rhw((n0) this.l, this.m, continuation, 9);
            case 10:
                rhw rhwVar4 = new rhw((z0) this.m, continuation, 10);
                rhwVar4.l = obj;
                return rhwVar4;
            case 11:
                return new rhw((pjc) this.l, (aqi) this.m, continuation, 11);
            case 12:
                return new rhw((c) this.l, (aqi) this.m, continuation, 12);
            case 13:
                return new rhw((g1) this.l, (a1) this.m, continuation, 13);
            case 14:
                return new rhw((g9) this.l, (x8) this.m, continuation, 14);
            case 15:
                return new rhw((pa) this.l, (ia) this.m, continuation, 15);
            case 16:
                return new rhw((xb) this.l, (rb) this.m, continuation, 16);
            case 17:
                return new rhw((PassportProcessGlobalComponent) this.l, (x) this.m, continuation, 17);
            case 18:
                return new rhw((d) this.l, (g) this.m, continuation, 18);
            case 19:
                return new rhw((bw1) this.l, (g) this.m, continuation, 19);
            case 20:
                return new rhw((bw1) this.l, (f) this.m, continuation, 20);
            case 21:
                return new rhw((com.yandex.passport.internal.config.template.g) this.l, (e6) this.m, continuation, 21);
            case 22:
                return new rhw((k) this.l, (String) this.m, continuation, 22);
            case 23:
                return new rhw((k) this.l, (n) this.m, continuation, 23);
            case 24:
                rhw rhwVar5 = new rhw((q0) this.m, continuation, 24);
                rhwVar5.l = obj;
                return rhwVar5;
            case 25:
                return new rhw((rjc) this.l, continuation, (b0) this.m, 25);
            case 26:
                return new rhw((rjc) this.l, continuation, (o0) this.m, 26);
            case 27:
                return new rhw((rjc) this.l, continuation, (u1) this.m, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new rhw((rjc) this.l, continuation, (a) this.m, 28);
            default:
                return new rhw((rjc) this.l, continuation, (h2) this.m, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((rhw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0293, code lost:
    
        if (defpackage.bw1.b(r0, r7, r19) == r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x026f, code lost:
    
        if (r3 == r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02d9, code lost:
    
        if (r3 == r2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x05cb, code lost:
    
        if (r6 != null) goto L294;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c;
        l1 a;
        Boolean bool;
        Boolean bool2;
        Object c2;
        Object V;
        Object invoke;
        Object y;
        int i = this.j;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        Object obj3 = this.m;
        int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                xhw xhwVar = (xhw) this.l;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    xhwVar.p.lock();
                    try {
                        ghw ghwVar = xhwVar.o;
                        if (ghwVar != null) {
                            this.k = 1;
                            if (xhw.b(xhwVar, ghwVar, (kot) obj3, this) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    } finally {
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                String str = (String) obj3;
                xhw xhwVar2 = (xhw) this.l;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    String str2 = xhw.w;
                    Continuation continuation = null;
                    if (Intrinsics.d(str, xhwVar2.f())) {
                        e0 a2 = xhwVar2.q.a();
                        if (a2 == null) {
                            return Unit.a;
                        }
                        x97.y(xhwVar2.m, null, null, new l1p(a2, xhwVar2, "deviceId", continuation, 10), 3);
                    }
                    xhwVar2.p.lock();
                    try {
                        ghw ghwVar2 = xhwVar2.o;
                        if (ghwVar2 != null) {
                            this.k = 1;
                            Object c3 = ghwVar2.c("changeActiveDevice", new wgw(str, null), this);
                            if (c3 != nm6Var2) {
                                c3 = Unit.a;
                            }
                            if (c3 == nm6Var2) {
                                return nm6Var2;
                            }
                        }
                    } finally {
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                u9n u9nVar = (u9n) obj3;
                akw akwVar = (akw) this.l;
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ssg.a(2, akw.j, "refreshState: try to refresh playables meta", null);
                    ArrayList arrayList = u9nVar.d;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((t9n) it.next()).a);
                    }
                    jyr jyrVar = su6.e;
                    if (vq1.T()) {
                        xab xabVar = u9nVar.a;
                        if (!(xabVar instanceof sab) && !(xabVar instanceof tab) && !xabVar.equals(uab.a) && !(xabVar instanceof vab)) {
                            if (!(xabVar instanceof wab)) {
                                b6e.s();
                                return null;
                            }
                            int ordinal = ((wab) xabVar).c.ordinal();
                            if (ordinal == 0) {
                                z = true;
                            } else if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                        }
                    }
                    this.k = 1;
                    qkw qkwVar = akwVar.h;
                    HashSet hashSet = new HashSet();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        kiw kiwVar = ((wwk) it2.next()).a;
                        iiw iiwVar = kiwVar instanceof iiw ? (iiw) kiwVar : null;
                        if (iiwVar != null) {
                            hashSet.add(iiwVar);
                        }
                    }
                    qkwVar.getClass();
                    bjt bjtVar = qkwVar.c;
                    ReentrantLock reentrantLock = qkwVar.a;
                    reentrantLock.lock();
                    try {
                        Set keySet = ((HashMap) bjtVar.b).keySet();
                        keySet.getClass();
                        HashSet hashSet2 = new HashSet();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (!keySet.contains((iiw) next)) {
                                hashSet2.add(next);
                            }
                        }
                        reentrantLock.unlock();
                        if (hashSet2.isEmpty()) {
                            HashSet hashSet3 = new HashSet();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                kiw kiwVar2 = ((wwk) it4.next()).a;
                                miw miwVar = kiwVar2 instanceof miw ? (miw) kiwVar2 : null;
                                if (miwVar != null) {
                                    hashSet3.add(miwVar);
                                }
                            }
                            reentrantLock.lock();
                            try {
                                Set keySet2 = ((HashMap) bjtVar.c).keySet();
                                keySet2.getClass();
                                HashSet hashSet4 = new HashSet();
                                Iterator it5 = hashSet3.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (!keySet2.contains((miw) next2)) {
                                        hashSet4.add(next2);
                                    }
                                }
                                reentrantLock.unlock();
                                if (hashSet4.isEmpty()) {
                                    obj2 = Unit.a;
                                } else {
                                    obj2 = akwVar.e(CollectionsKt.w0(hashSet4), this);
                                    if (obj2 != nm6.a) {
                                        obj2 = Unit.a;
                                    }
                                }
                            } finally {
                            }
                        } else {
                            obj2 = akwVar.d(CollectionsKt.w0(hashSet2), z, true, this);
                            if (obj2 != nm6.a) {
                                obj2 = Unit.a;
                            }
                        }
                        if (obj2 == nm6Var3) {
                            return nm6Var3;
                        }
                    } finally {
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                Object obj4 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                List list = (List) this.l;
                if (list.isEmpty()) {
                    return null;
                }
                List w0 = CollectionsKt.w0(CollectionsKt.z0(list));
                b8u b8uVar = ((jkw) obj3).d;
                List list2 = w0;
                ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((miw) it6.next()).a);
                }
                this.k = 1;
                Object b = b8uVar.b(arrayList3, this);
                return b == obj4 ? obj4 : b;
            case 4:
                ohw ohwVar = (ohw) this.l;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    gsw gswVar = ((anw) obj3).b;
                    this.l = ohwVar;
                    this.k = 1;
                    c = gsw.c(gswVar, this);
                    if (c == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                return uwf.N((a0) c, ohwVar.c.a);
            case 5:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    pqw pqwVar = ((tkw) ((vkw) obj3)).b;
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit(pqwVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                ysw yswVar = (ysw) this.l;
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    qfw qfwVar = yswVar.a;
                    this.k = 1;
                    if (qfwVar.g(this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((hmw) yswVar.e).b.a();
                return Unit.a;
            case 7:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (rjcVar2.emit((pqw) obj3, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((Function2) this.l).invoke((enj) obj3, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                n0 n0Var = (n0) this.l;
                this.k = 1;
                Object x = n0Var.x(obj3, this);
                return x == nm6Var9 ? nm6Var9 : x;
            case 10:
                xdr xdrVar = (xdr) ((z0) obj3).d;
                Object obj5 = this.l;
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    Object value = xdrVar.getValue();
                    l1 l1Var = (l1) xdrVar.getValue();
                    k0 k0Var = (k0) obj5;
                    l1Var.getClass();
                    v1 v1Var = l1Var.a;
                    k0Var.getClass();
                    if (k0Var instanceof r) {
                        l lVar = ((r) k0Var).a;
                        a = l1.a(l1Var, c1.a(l1.a(l1Var, null, null, lVar, null, null, null, 59), true), null, lVar, null, null, null, 58);
                    } else if (k0Var instanceof y) {
                        l lVar2 = ((y) k0Var).b;
                        a = l1.a(l1Var, c1.a(l1.a(l1Var, null, null, lVar2, null, null, null, 59), true), null, lVar2, null, null, null, 58);
                    } else if ((k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.d) || (k0Var instanceof j) || (k0Var instanceof f0) || (k0Var instanceof c0) || (k0Var instanceof q) || (k0Var instanceof i0) || (k0Var instanceof g0) || (k0Var instanceof u) || (k0Var instanceof w) || (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.n) || (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.g) || (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.k)) {
                        a = l1.a(l1Var, c1.a(l1Var, true), null, null, null, null, null, 62);
                    } else if (k0Var instanceof j0) {
                        a = l1.a(l1Var, ((j0) k0Var).a, null, null, null, null, null, 62);
                    } else if ((k0Var instanceof m) || (k0Var instanceof t) || (k0Var instanceof z)) {
                        a = l1.a(l1Var, c1.a(l1Var, false), null, null, null, null, null, 62);
                    } else if (k0Var instanceof e) {
                        a = l1.a(l1Var, c1.a(l1Var, false), null, null, null, i2.c, null, 46);
                    } else if (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.f) {
                        a = l1.a(l1Var, c1.a(l1Var, false), null, null, null, i2.b, null, 46);
                    } else if (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.x) {
                        a = l1.a(l1Var, c1.a(l1Var, true), null, null, ((com.yandex.passport.internal.ui.bouncer.model.x) k0Var).a, null, null, 54);
                    } else if (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.o) {
                        com.yandex.passport.internal.ui.bouncer.model.o oVar = (com.yandex.passport.internal.ui.bouncer.model.o) k0Var;
                        a = l1.a(l1Var, new o1(oVar.a, oVar.b, oVar.c), null, null, null, null, null, 62);
                    } else {
                        if (!k0Var.equals(com.yandex.passport.internal.ui.bouncer.model.l.b)) {
                            if (k0Var instanceof d0) {
                                a = l1.a(l1Var, ((d0) k0Var).a, null, null, null, null, null, 62);
                            } else if (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.e0) {
                                com.yandex.passport.internal.ui.bouncer.model.e0 e0Var = (com.yandex.passport.internal.ui.bouncer.model.e0) k0Var;
                                if (v1Var instanceof p1) {
                                    p1 p1Var = (p1) v1Var;
                                    com.yandex.passport.internal.l lVar3 = p1Var.d;
                                    if (p1Var.e) {
                                        if (lVar3 != null) {
                                            bool = Boolean.valueOf(lVar3.e.h == 6);
                                        } else {
                                            bool = null;
                                        }
                                        if (bool == null) {
                                            if (lVar3 == null) {
                                                bool2 = null;
                                                break;
                                            } else {
                                                bool2 = Boolean.valueOf(lVar3.n());
                                                break;
                                            }
                                        }
                                    }
                                }
                                s1 s1Var = e0Var.a;
                                a = s1Var.a.a instanceof com.yandex.passport.sloth.data.z ? l1.a(l1Var, s1Var, null, null, null, i2.a, null, 46) : l1.a(l1Var, s1Var, null, null, null, null, null, 62);
                            } else if (k0Var instanceof p) {
                                a = l1.a(l1Var, ((p) k0Var).a, null, null, null, null, null, 62);
                            } else if (k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.a0) {
                                a = l1.a(l1Var, ((com.yandex.passport.internal.ui.bouncer.model.a0) k0Var).a, null, null, null, null, null, 62);
                            } else if (k0Var.equals(com.yandex.passport.internal.ui.bouncer.model.l.a)) {
                                a = l1.a(l1Var, com.yandex.passport.internal.ui.bouncer.model.u1.a, null, null, null, null, null, 62);
                            } else if (k0Var instanceof h0) {
                                a = l1.a(l1Var, null, null, null, null, null, ((h0) k0Var).a, 31);
                            } else if (k0Var instanceof s) {
                                a = l1.a(l1Var, c1.a(l1Var, false), ((s) k0Var).a, null, null, null, null, 60);
                            } else if (k0Var instanceof v) {
                                a = l1.a(l1Var, c1.a(l1Var, true), null, null, null, null, null, 62);
                            } else {
                                if (!(k0Var instanceof com.yandex.passport.internal.ui.bouncer.model.b0)) {
                                    b6e.s();
                                    return null;
                                }
                                l lVar4 = l1Var.c;
                                a = l1.a(l1Var, new n1(((com.yandex.passport.internal.ui.bouncer.model.b0) k0Var).a, lVar4 != null ? lVar4.C : false), null, null, null, null, null, 62);
                            }
                        }
                        a = l1Var;
                    }
                    b bVar = b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, hlr.d("\n                REDUCE:\n                    originalState: " + com.yandex.passport.internal.ui.bouncer.model.b.b(l1Var) + "\n                    action: " + k0Var.getClass().getName() + "\n                    newState: " + com.yandex.passport.internal.ui.bouncer.model.b.b(a) + "\n            "), 10);
                    }
                    if (!Intrinsics.d(value, a)) {
                        this.l = null;
                        this.k = 1;
                        xdrVar.getClass();
                        xdrVar.m(null, a);
                        if (Unit.a == nm6Var10) {
                            return nm6Var10;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(z ? 1 : 0, (aqi) obj3);
                    this.k = 1;
                    if (pjcVar.collect(aVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    c cVar = (c) this.l;
                    com.yandex.passport.common.ui.progress.a aVar2 = cVar instanceof com.yandex.passport.common.ui.progress.a ? (com.yandex.passport.common.ui.progress.a) cVar : null;
                    long j = aVar2 != null ? aVar2.a : 0L;
                    this.k = 1;
                    if (y2x.o(j, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((aqi) obj3).setValue(Boolean.TRUE);
                return Unit.a;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable w = com.yandex.passport.data.network.core.b.w((g1) this.l, (a1) obj3, this);
                    return w == nm6Var13 ? nm6Var13 : w;
                }
                if (i16 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable w2 = com.yandex.passport.data.network.core.b.w((g9) this.l, (x8) obj3, this);
                    return w2 == nm6Var14 ? nm6Var14 : w2;
                }
                if (i17 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable w3 = com.yandex.passport.data.network.core.b.w((pa) this.l, (ia) obj3, this);
                    return w3 == nm6Var15 ? nm6Var15 : w3;
                }
                if (i18 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable w4 = com.yandex.passport.data.network.core.b.w((xb) this.l, (rb) obj3, this);
                    return w4 == nm6Var16 ? nm6Var16 : w4;
                }
                if (i19 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((PassportProcessGlobalComponent) this.l).getLimitedPassportInitReportUseCase().g((x) obj3, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                d dVar = (d) this.l;
                g gVar = (g) obj3;
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.filter.l lVar5 = dVar.e;
                    ArrayList g = dVar.b.a().g();
                    com.yandex.passport.internal.entities.k kVar = gVar.a;
                    this.k = 1;
                    c2 = lVar5.c(g, kVar, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                List list3 = (List) c2;
                if (list3.isEmpty()) {
                    i iVar = dVar.c;
                    iVar.getClass();
                    iVar.p(q1.d);
                    throw new com.yandex.passport.api.exception.d("Accounts for auto login with provided filter not found");
                }
                com.yandex.passport.internal.autologin.k kVar2 = dVar.a;
                com.yandex.passport.internal.autologin.e eVar = new com.yandex.passport.internal.autologin.e(gVar.c, list3, com.yandex.plus.core.network.api.utils.a.L(gVar.a.a), gVar.f, 4);
                this.k = 2;
                Object g2 = kVar2.g(eVar, this);
                if (g2 != nm6Var18) {
                    return g2;
                }
                return nm6Var18;
            case 19:
                g gVar2 = (g) obj3;
                bw1 bw1Var = (bw1) this.l;
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                try {
                } catch (Throwable unused) {
                    r7o r7oVar = z7o.b;
                }
                if (i22 == 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    ocu ocuVar = new ocu(((com.yandex.passport.internal.impl.x) bw1Var.f).f, b4.c, new f9f[0], (Continuation) null, 21);
                    this.k = 2;
                    V = x97.V(dq7Var, ocuVar, this);
                    break;
                } else {
                    if (i22 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i22 != 2) {
                        if (i22 != 3 && i22 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        r7o r7oVar2 = z7o.b;
                        r7o r7oVar3 = z7o.b;
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                Object obj6 = ((z7o) V).a;
                if (!(obj6 instanceof t7o)) {
                    r7o r7oVar4 = z7o.b;
                    if (!((Boolean) obj6).booleanValue()) {
                        this.k = 4;
                        break;
                    } else {
                        this.k = 3;
                        if (bw1.a(bw1Var, gVar2, this) == nm6Var19) {
                            return nm6Var19;
                        }
                        r7o r7oVar22 = z7o.b;
                    }
                    r7o r7oVar5 = z7o.b;
                }
                r7o r7oVar32 = z7o.b;
                return Unit.a;
            case 20:
                f fVar = (f) obj3;
                bw1 bw1Var2 = (bw1) this.l;
                com.yandex.passport.internal.impl.x xVar = (com.yandex.passport.internal.impl.x) bw1Var2.f;
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    rhw rhwVar = (rhw) bw1Var2.i;
                    z1 z1Var = fVar.a;
                    this.k = 1;
                    invoke = rhwVar.invoke(z1Var, this);
                    if (invoke == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke = obj;
                }
                Object obj7 = ((z7o) invoke).a;
                if (!(obj7 instanceof t7o)) {
                    xVar.b.reportEvent((String) com.yandex.passport.internal.report.u1.d.c, tah.b(new Pair("uid", String.valueOf(fVar.a.b))));
                }
                Throwable a3 = z7o.a(obj7);
                if (a3 != null) {
                    xVar.b.reportEvent((String) t1.d.c, uah.e(new Pair("throwable-message", a3.getMessage()), new Pair("uid", String.valueOf(fVar.a.b))));
                }
                x97.y((qyf) bw1Var2.g, null, null, new com.yandex.passport.internal.autologin.ui.r((x0q) bw1Var2.h, objArr == true ? 1 : 0, fVar, i2), 3);
                return Unit.a;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.config.template.g gVar3 = (com.yandex.passport.internal.config.template.g) this.l;
                wb7 wb7Var = gVar3.a;
                j9w j9wVar = new j9w((e6) obj3, gVar3, objArr2 == true ? 1 : 0, 13);
                this.k = 1;
                Object a4 = wb7Var.a(j9wVar, this);
                return a4 == nm6Var21 ? nm6Var21 : a4;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.core.s sVar = ((k) this.l).g;
                    this.k = 1;
                    if (((com.yandex.passport.internal.network.l) sVar).b((String) obj3, "AndroidAccountManagerHelper", this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.core.s sVar2 = ((k) this.l).g;
                    String str3 = (String) ((n) obj3).b;
                    this.k = 1;
                    if (((com.yandex.passport.internal.network.l) sVar2).b(str3, "AndroidAccountManagerHelper", this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                z1 z1Var2 = (z1) this.l;
                nm6 nm6Var24 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.impl.x xVar2 = ((q0) obj3).b;
                    this.l = null;
                    this.k = 1;
                    y = xVar2.y(z1Var2, this);
                    if (y == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    y = ((z7o) obj).a;
                }
                return new z7o(y);
            case 25:
                nm6 nm6Var25 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) this.l).emit((b0) obj3, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) this.l).emit((o0) obj3, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) this.l).emit((u1) obj3, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var28 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) this.l).emit((a) obj3, this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var29 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((rjc) this.l).emit((h2) obj3, this) == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhw(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhw(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhw(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
