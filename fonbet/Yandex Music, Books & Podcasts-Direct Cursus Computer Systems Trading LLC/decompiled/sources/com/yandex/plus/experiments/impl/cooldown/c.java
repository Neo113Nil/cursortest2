package com.yandex.plus.experiments.impl.cooldown;

import android.content.SharedPreferences;
import com.yandex.plus.home.datasource.local.preferences.j;
import com.yandex.plus.home.graphql.experiments.f;
import com.yandex.plus.home.graphql.experiments.h;
import com.yandex.plus.home.graphql.experiments.i;
import com.yandex.plus.home.internal.di.g;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rsa;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z62;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c extends com.yandex.plus.experiments.api.cache.c {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.core.android.extensions.c cVar, com.yandex.plus.home.datasource.local.preferences.a aVar, g gVar) {
        super(cVar);
        cVar.getClass();
        aVar.getClass();
        this.d = gVar;
        nsa.b.getClass();
        this.e = aVar.a(rsa.a, "RECHARGE_END");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r8 != r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r8 == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        a aVar;
        int i;
        f fVar;
        int i2;
        Object b;
        Continuation continuation = null;
        switch (this.c) {
            case 0:
                if (cg6Var instanceof a) {
                    aVar = (a) cg6Var;
                    int i3 = aVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.l = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.j;
                        nm6 nm6Var = nm6.a;
                        i = aVar.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            kotlinx.coroutines.a aVar2 = (kotlinx.coroutines.a) this.d;
                            pjt pjtVar = new pjt(this, continuation, 25);
                            aVar.l = 1;
                            obj = x97.V(aVar2, pjtVar, aVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                        }
                        return (nsa) obj;
                    }
                }
                aVar = new a(this, cg6Var);
                Object obj2 = aVar.j;
                nm6 nm6Var2 = nm6.a;
                i = aVar.l;
                if (i != 0) {
                }
                return (nsa) obj2;
            default:
                if (cg6Var instanceof f) {
                    fVar = (f) cg6Var;
                    int i4 = fVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fVar.l = i4 - Integer.MIN_VALUE;
                        Object obj3 = fVar.j;
                        Object obj4 = nm6.a;
                        i2 = fVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            fVar.l = 1;
                            obj3 = j(fVar);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj3);
                                b = ((z7o) obj3).a;
                                r7o r7oVar = z7o.b;
                                if (b instanceof t7o) {
                                    return null;
                                }
                                return b;
                            }
                            qgg.h0(obj3);
                        }
                        j jVar = (j) this.e;
                        fVar.l = 2;
                        b = jVar.b((String) obj3, fVar);
                        break;
                    }
                }
                fVar = new f(this, cg6Var);
                Object obj32 = fVar.j;
                Object obj42 = nm6.a;
                i2 = fVar.l;
                if (i2 != 0) {
                }
                j jVar2 = (j) this.e;
                fVar.l = 2;
                b = jVar2.b((String) obj32, fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r15 != r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r15 == r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        if (h(r5, r0) != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c9, code lost:
    
        if (r15 == r9) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        b bVar;
        int i;
        nsa nsaVar;
        h hVar;
        int i2;
        Object b;
        int i3 = this.c;
        boolean z = false;
        long j = this.b;
        com.yandex.plus.core.android.extensions.c cVar = this.a;
        long j2 = 0;
        switch (i3) {
            case 0:
                if (cg6Var instanceof b) {
                    bVar = (b) cg6Var;
                    int i4 = bVar.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bVar.m = i4 - Integer.MIN_VALUE;
                        Object obj = bVar.k;
                        Object obj2 = nm6.a;
                        i = bVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            bVar.m = 1;
                            obj = b(bVar);
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j2 = bVar.j;
                                qgg.h0(obj);
                                long a = cVar.a();
                                long o = nsa.o(a, j);
                                if (nsa.c(j2, a) > 0 && nsa.c(j2, o) < 0) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                            qgg.h0(obj);
                        }
                        nsaVar = (nsa) obj;
                        if (nsaVar == null) {
                            j2 = nsaVar.a;
                        } else {
                            nsa.b.getClass();
                        }
                        bVar.j = j2;
                        bVar.m = 2;
                        break;
                    }
                }
                bVar = new b(this, cg6Var);
                Object obj3 = bVar.k;
                Object obj22 = nm6.a;
                i = bVar.m;
                if (i != 0) {
                }
                nsaVar = (nsa) obj3;
                if (nsaVar == null) {
                }
                bVar.j = j2;
                bVar.m = 2;
                break;
            default:
                if (cg6Var instanceof h) {
                    hVar = (h) cg6Var;
                    int i5 = hVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hVar.l = i5 - Integer.MIN_VALUE;
                        Object obj4 = hVar.j;
                        Object obj5 = nm6.a;
                        i2 = hVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            hVar.l = 1;
                            obj4 = j(hVar);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj4);
                                b = ((z7o) obj4).a;
                                nsa.b.getClass();
                                Object nsaVar2 = new nsa(0L);
                                r7o r7oVar = z7o.b;
                                if (b instanceof t7o) {
                                    b = nsaVar2;
                                }
                                long j3 = ((nsa) b).a;
                                long a2 = cVar.a();
                                long o2 = nsa.o(a2, j);
                                if (nsa.c(j3, a2) > 0 && nsa.c(j3, o2) < 0) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                            qgg.h0(obj4);
                        }
                        j jVar = (j) this.e;
                        hVar.l = 2;
                        b = jVar.b((String) obj4, hVar);
                        break;
                    }
                }
                hVar = new h(this, cg6Var);
                Object obj42 = hVar.j;
                Object obj52 = nm6.a;
                i2 = hVar.l;
                if (i2 != 0) {
                }
                j jVar2 = (j) this.e;
                hVar.l = 2;
                b = jVar2.b((String) obj42, hVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, cg6 cg6Var) {
        i iVar;
        Object obj;
        Object obj2;
        int i;
        j jVar;
        nsa nsaVar;
        switch (this.c) {
            case 0:
                Object V = x97.V((kotlinx.coroutines.a) this.d, new z62(this, j, (Continuation) null), cg6Var);
                if (V != nm6.a) {
                    break;
                }
                break;
            default:
                if (cg6Var instanceof i) {
                    iVar = (i) cg6Var;
                    int i2 = iVar.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iVar.m = i2 - Integer.MIN_VALUE;
                        obj = iVar.k;
                        obj2 = nm6.a;
                        i = iVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            iVar.j = j;
                            iVar.m = 1;
                            obj = j(iVar);
                            if (obj == obj2) {
                            }
                        } else if (i == 1) {
                            j = iVar.j;
                            qgg.h0(obj);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                            ((z7o) obj).getClass();
                            break;
                        }
                        jVar = (j) this.e;
                        nsaVar = new nsa(j);
                        iVar.j = j;
                        iVar.m = 2;
                        if (jVar.d((String) obj, nsaVar, iVar) == obj2) {
                        }
                    }
                }
                iVar = new i(this, cg6Var);
                obj = iVar.k;
                obj2 = nm6.a;
                i = iVar.m;
                if (i != 0) {
                }
                jVar = (j) this.e;
                nsaVar = new nsa(j);
                iVar.j = j;
                iVar.m = 2;
                if (jVar.d((String) obj, nsaVar, iVar) == obj2) {
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(cg6 cg6Var) {
        com.yandex.plus.home.graphql.experiments.g gVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.graphql.experiments.g) {
            gVar = (com.yandex.plus.home.graphql.experiments.g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g gVar2 = (g) this.d;
                    gVar.l = 1;
                    obj = gVar2.invoke(gVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return String.valueOf(obj);
            }
        }
        gVar = new com.yandex.plus.home.graphql.experiments.g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        return String.valueOf(obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.core.android.extensions.c cVar, kotlinx.coroutines.a aVar, SharedPreferences sharedPreferences) {
        super(cVar);
        cVar.getClass();
        aVar.getClass();
        this.d = aVar;
        this.e = sharedPreferences;
    }
}
