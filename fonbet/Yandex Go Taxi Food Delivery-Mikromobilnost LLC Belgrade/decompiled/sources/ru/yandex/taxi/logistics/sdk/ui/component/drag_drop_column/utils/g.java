package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.ck11;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.pzt0;
import defpackage.rsm;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ubn;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.zkp0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class g {
    public final androidx.compose.foundation.lazy.b a;
    public final tse b;
    public final rsm c;
    public pzt0 d;
    public final kotlinx.coroutines.channels.a e = sb2.a(-1, null, null, 6);

    public g(androidx.compose.foundation.lazy.b bVar, tse tseVar, rsm rsmVar) {
        this.a = bVar;
        this.b = tseVar;
        this.c = rsmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
    
        if (kotlinx.coroutines.a.i(100, r2) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0100 -> B:13:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0152 -> B:12:0x0155). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, ContinuationImpl continuationImpl) {
        Scroller$scrollLoop$1 scroller$scrollLoop$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Object obj;
        f fVar;
        Scroller$Direction scroller$Direction;
        sls slsVar;
        float f;
        float f2;
        float f3;
        float f4;
        Object obj2;
        char c;
        CoroutineSingletons coroutineSingletons2;
        f fVar2;
        tls tlsVar;
        g gVar2 = gVar;
        gVar2.getClass();
        if (continuationImpl instanceof Scroller$scrollLoop$1) {
            scroller$scrollLoop$1 = (Scroller$scrollLoop$1) continuationImpl;
            int i3 = scroller$scrollLoop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scroller$scrollLoop$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = scroller$scrollLoop$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scroller$scrollLoop$1.label;
                i2 = 1;
                obj = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    fVar = null;
                } else {
                    if (i == 1) {
                        f3 = scroller$scrollLoop$1.F$2;
                        f2 = scroller$scrollLoop$1.F$1;
                        f = scroller$scrollLoop$1.F$0;
                        slsVar = (sls) scroller$scrollLoop$1.L$2;
                        scroller$Direction = (Scroller$Direction) scroller$scrollLoop$1.L$1;
                        f fVar3 = (f) scroller$scrollLoop$1.L$0;
                        kotlin.b.b(obj3);
                        fVar = fVar3;
                        if (gVar2.c(scroller$Direction)) {
                            float floatValue = ((Number) slsVar.invoke()).floatValue();
                            if (floatValue <= 0.0f) {
                                scroller$scrollLoop$1.L$0 = fVar;
                                scroller$scrollLoop$1.L$1 = obj;
                                scroller$scrollLoop$1.L$2 = obj;
                                scroller$scrollLoop$1.L$3 = obj;
                                scroller$scrollLoop$1.F$0 = f;
                                scroller$scrollLoop$1.F$1 = f2;
                                scroller$scrollLoop$1.F$2 = f3;
                                scroller$scrollLoop$1.F$3 = floatValue;
                                scroller$scrollLoop$1.label = 2;
                            } else {
                                float f5 = floatValue / f3;
                                long f6 = y6i0.f((long) f5, 1L, 100L);
                                float f7 = (f6 / f5) * floatValue;
                                int i4 = zkp0.a[scroller$Direction.ordinal()];
                                if (i4 == i2) {
                                    f4 = -f7;
                                } else {
                                    if (i4 != 2) {
                                        w511.b();
                                        return obj;
                                    }
                                    f4 = f7;
                                }
                                androidx.compose.foundation.lazy.b bVar = gVar2.a;
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                ck11 K = sb2.K((int) f6, 0, ubn.d, 2);
                                scroller$scrollLoop$1.L$0 = fVar;
                                obj2 = null;
                                scroller$scrollLoop$1.L$1 = null;
                                scroller$scrollLoop$1.L$2 = null;
                                scroller$scrollLoop$1.L$3 = null;
                                scroller$scrollLoop$1.F$0 = f;
                                scroller$scrollLoop$1.F$1 = f2;
                                scroller$scrollLoop$1.F$2 = f3;
                                scroller$scrollLoop$1.F$3 = floatValue;
                                scroller$scrollLoop$1.F$4 = f5;
                                scroller$scrollLoop$1.J$0 = f6;
                                scroller$scrollLoop$1.F$5 = f7;
                                scroller$scrollLoop$1.F$6 = f4;
                                c = 3;
                                scroller$scrollLoop$1.label = 3;
                                coroutineSingletons2 = coroutineSingletons3;
                                if (androidx.compose.foundation.gestures.c.g(bVar, f4, K, scroller$scrollLoop$1) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                gVar2 = gVar;
                                obj = obj2;
                                coroutineSingletons = coroutineSingletons2;
                                i2 = 1;
                            }
                        }
                        return zy11.a;
                    }
                    if (i == 2) {
                        f fVar4 = (f) scroller$scrollLoop$1.L$0;
                        kotlin.b.b(obj3);
                        fVar = fVar4;
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar5 = (f) scroller$scrollLoop$1.L$0;
                        kotlin.b.b(obj3);
                        fVar = fVar5;
                        c = 3;
                        coroutineSingletons2 = coroutineSingletons;
                        obj2 = null;
                        gVar2 = gVar;
                        obj = obj2;
                        coroutineSingletons = coroutineSingletons2;
                        i2 = 1;
                    }
                }
                fVar2 = (f) oi9.b(gVar2.e.g());
                if (fVar2 != null) {
                    fVar = fVar2;
                }
                if (fVar != null && !fVar.equals(f.e)) {
                    scroller$Direction = fVar.a;
                    f = fVar.b;
                    slsVar = fVar.c;
                    tlsVar = fVar.d;
                    f2 = ((Number) gVar2.c.invoke()).floatValue() * f;
                    float f8 = f2 / 1000.0f;
                    scroller$scrollLoop$1.L$0 = fVar;
                    scroller$scrollLoop$1.L$1 = scroller$Direction;
                    scroller$scrollLoop$1.L$2 = slsVar;
                    scroller$scrollLoop$1.L$3 = obj;
                    scroller$scrollLoop$1.F$0 = f;
                    scroller$scrollLoop$1.F$1 = f2;
                    scroller$scrollLoop$1.F$2 = f8;
                    scroller$scrollLoop$1.label = i2;
                    if (tlsVar.invoke(scroller$scrollLoop$1) != coroutineSingletons) {
                        f3 = f8;
                        if (gVar2.c(scroller$Direction)) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        scroller$scrollLoop$1 = new Scroller$scrollLoop$1(gVar2, continuationImpl);
        Object obj32 = scroller$scrollLoop$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scroller$scrollLoop$1.label;
        i2 = 1;
        obj = null;
        if (i != 0) {
        }
        fVar2 = (f) oi9.b(gVar2.e.g());
        if (fVar2 != null) {
        }
        if (fVar != null) {
            scroller$Direction = fVar.a;
            f = fVar.b;
            slsVar = fVar.c;
            tlsVar = fVar.d;
            f2 = ((Number) gVar2.c.invoke()).floatValue() * f;
            float f82 = f2 / 1000.0f;
            scroller$scrollLoop$1.L$0 = fVar;
            scroller$scrollLoop$1.L$1 = scroller$Direction;
            scroller$scrollLoop$1.L$2 = slsVar;
            scroller$scrollLoop$1.L$3 = obj;
            scroller$scrollLoop$1.F$0 = f;
            scroller$scrollLoop$1.F$1 = f2;
            scroller$scrollLoop$1.F$2 = f82;
            scroller$scrollLoop$1.label = i2;
            if (tlsVar.invoke(scroller$scrollLoop$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (kotlinx.coroutines.a.f(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r7.o(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, ContinuationImpl continuationImpl) {
        Scroller$stop$1 scroller$stop$1;
        int i;
        pzt0 pzt0Var;
        gVar.getClass();
        if (continuationImpl instanceof Scroller$stop$1) {
            scroller$stop$1 = (Scroller$stop$1) continuationImpl;
            int i2 = scroller$stop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scroller$stop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scroller$stop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scroller$stop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.channels.a aVar = gVar.e;
                    f fVar = f.e;
                    scroller$stop$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        gVar.d = null;
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                pzt0Var = gVar.d;
                if (pzt0Var != null) {
                    scroller$stop$1.label = 2;
                }
                gVar.d = null;
                return zy11.a;
            }
        }
        scroller$stop$1 = new Scroller$stop$1(gVar, continuationImpl);
        Object obj2 = scroller$stop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scroller$stop$1.label;
        if (i != 0) {
        }
        pzt0Var = gVar.d;
        if (pzt0Var != null) {
        }
        gVar.d = null;
        return zy11.a;
    }

    public final boolean c(Scroller$Direction scroller$Direction) {
        int i = zkp0.a[scroller$Direction.ordinal()];
        androidx.compose.foundation.lazy.b bVar = this.a;
        if (i == 1) {
            return bVar.e();
        }
        if (i == 2) {
            return bVar.b();
        }
        w511.b();
        return false;
    }

    public final boolean d(Scroller$Direction scroller$Direction, float f, sls slsVar, tls tlsVar) {
        if (!c(scroller$Direction)) {
            return false;
        }
        if (this.d == null) {
            this.d = tje.N(this.b, null, null, new Scroller$start$3(this, null), 3);
        }
        this.e.d(new f(scroller$Direction, f, slsVar, tlsVar));
        return true;
    }
}
