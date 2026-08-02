package flex.utils.kotlin;

import defpackage.ike;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.s0j0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public final class a {
    public final ike a;
    public final int b;
    public final long c;
    public pzt0 d;

    public a(ike ikeVar, int i, long j) {
        this.a = ikeVar;
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x016f -> B:17:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tls tlsVar, tls tlsVar2, wls wlsVar, wls wlsVar2, wls wlsVar3, ContinuationImpl continuationImpl) {
        RepeatableTask$startRepeatableJob$1 repeatableTask$startRepeatableJob$1;
        int i;
        wls wlsVar4;
        wls wlsVar5;
        wls wlsVar6;
        Ref$IntRef ref$IntRef;
        RepeatableTask$startRepeatableJob$1 repeatableTask$startRepeatableJob$12;
        Object obj;
        tls tlsVar3;
        tls tlsVar4;
        tls tlsVar5;
        tls tlsVar6;
        wls wlsVar7;
        Ref$IntRef ref$IntRef2;
        Object obj2;
        wls wlsVar8;
        long j;
        wls wlsVar9;
        Ref$IntRef ref$IntRef3;
        int i2;
        aVar.getClass();
        if (continuationImpl instanceof RepeatableTask$startRepeatableJob$1) {
            repeatableTask$startRepeatableJob$1 = (RepeatableTask$startRepeatableJob$1) continuationImpl;
            int i3 = repeatableTask$startRepeatableJob$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                repeatableTask$startRepeatableJob$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = repeatableTask$startRepeatableJob$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = repeatableTask$startRepeatableJob$1.label;
                zy11 zy11Var = zy11.a;
                int i4 = 2;
                int i5 = 1;
                if (i != 0) {
                    b.b(obj3);
                    wlsVar4 = wlsVar;
                    wlsVar5 = wlsVar2;
                    wlsVar6 = wlsVar3;
                    ref$IntRef = new Ref$IntRef();
                    repeatableTask$startRepeatableJob$12 = repeatableTask$startRepeatableJob$1;
                    obj = null;
                    tlsVar3 = tlsVar;
                    tlsVar4 = tlsVar2;
                    i2 = ref$IntRef.element;
                    if (i2 < aVar.b) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ref$IntRef3 = (Ref$IntRef) repeatableTask$startRepeatableJob$1.L$5;
                    wls wlsVar10 = (wls) repeatableTask$startRepeatableJob$1.L$4;
                    wls wlsVar11 = (wls) repeatableTask$startRepeatableJob$1.L$3;
                    wls wlsVar12 = (wls) repeatableTask$startRepeatableJob$1.L$2;
                    tls tlsVar7 = (tls) repeatableTask$startRepeatableJob$1.L$1;
                    tls tlsVar8 = (tls) repeatableTask$startRepeatableJob$1.L$0;
                    b.b(obj3);
                    tlsVar5 = tlsVar8;
                    tlsVar6 = tlsVar7;
                    wlsVar7 = wlsVar12;
                    wlsVar9 = wlsVar11;
                    wlsVar6 = wlsVar10;
                    if (((Boolean) tlsVar6.invoke(obj3)).booleanValue()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i == 3) {
                        obj2 = repeatableTask$startRepeatableJob$1.L$6;
                        Ref$IntRef ref$IntRef4 = (Ref$IntRef) repeatableTask$startRepeatableJob$1.L$5;
                        wlsVar6 = (wls) repeatableTask$startRepeatableJob$1.L$4;
                        wls wlsVar13 = (wls) repeatableTask$startRepeatableJob$1.L$3;
                        wlsVar7 = (wls) repeatableTask$startRepeatableJob$1.L$2;
                        tlsVar6 = (tls) repeatableTask$startRepeatableJob$1.L$1;
                        tlsVar5 = (tls) repeatableTask$startRepeatableJob$1.L$0;
                        b.b(obj3);
                        wlsVar8 = wlsVar13;
                        ref$IntRef2 = ref$IntRef4;
                        ref$IntRef2.element += i5;
                        j = aVar.c;
                        repeatableTask$startRepeatableJob$1.L$0 = tlsVar5;
                        repeatableTask$startRepeatableJob$1.L$1 = tlsVar6;
                        repeatableTask$startRepeatableJob$1.L$2 = wlsVar7;
                        repeatableTask$startRepeatableJob$1.L$3 = wlsVar8;
                        repeatableTask$startRepeatableJob$1.L$4 = wlsVar6;
                        repeatableTask$startRepeatableJob$1.L$5 = ref$IntRef2;
                        repeatableTask$startRepeatableJob$1.L$6 = obj2;
                        repeatableTask$startRepeatableJob$1.label = 4;
                        if (kotlinx.coroutines.a.i(j, repeatableTask$startRepeatableJob$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 4) {
                        Object obj4 = repeatableTask$startRepeatableJob$1.L$6;
                        Ref$IntRef ref$IntRef5 = (Ref$IntRef) repeatableTask$startRepeatableJob$1.L$5;
                        wls wlsVar14 = (wls) repeatableTask$startRepeatableJob$1.L$4;
                        wls wlsVar15 = (wls) repeatableTask$startRepeatableJob$1.L$3;
                        wls wlsVar16 = (wls) repeatableTask$startRepeatableJob$1.L$2;
                        tls tlsVar9 = (tls) repeatableTask$startRepeatableJob$1.L$1;
                        tls tlsVar10 = (tls) repeatableTask$startRepeatableJob$1.L$0;
                        b.b(obj3);
                        Object obj5 = obj4;
                        tlsVar3 = tlsVar10;
                        wlsVar6 = wlsVar14;
                        wlsVar4 = wlsVar16;
                        ref$IntRef = ref$IntRef5;
                        repeatableTask$startRepeatableJob$12 = repeatableTask$startRepeatableJob$1;
                        tlsVar4 = tlsVar9;
                        wlsVar5 = wlsVar15;
                        i5 = 1;
                        obj = obj5;
                        i4 = 2;
                        i2 = ref$IntRef.element;
                        if (i2 < aVar.b) {
                            repeatableTask$startRepeatableJob$12.L$0 = tlsVar3;
                            repeatableTask$startRepeatableJob$12.L$1 = tlsVar4;
                            repeatableTask$startRepeatableJob$12.L$2 = wlsVar4;
                            repeatableTask$startRepeatableJob$12.L$3 = wlsVar5;
                            repeatableTask$startRepeatableJob$12.L$4 = wlsVar6;
                            repeatableTask$startRepeatableJob$12.L$5 = ref$IntRef;
                            repeatableTask$startRepeatableJob$12.L$6 = null;
                            repeatableTask$startRepeatableJob$12.label = i5;
                            Object invoke = tlsVar3.invoke(repeatableTask$startRepeatableJob$12);
                            if (invoke != coroutineSingletons) {
                                Ref$IntRef ref$IntRef6 = ref$IntRef;
                                wlsVar7 = wlsVar4;
                                ref$IntRef3 = ref$IntRef6;
                                tlsVar5 = tlsVar3;
                                tlsVar6 = tlsVar4;
                                obj3 = invoke;
                                repeatableTask$startRepeatableJob$1 = repeatableTask$startRepeatableJob$12;
                                wlsVar9 = wlsVar5;
                                if (((Boolean) tlsVar6.invoke(obj3)).booleanValue()) {
                                    s0j0 s0j0Var = new s0j0(ref$IntRef3.element, obj3);
                                    repeatableTask$startRepeatableJob$1.L$0 = tlsVar5;
                                    repeatableTask$startRepeatableJob$1.L$1 = tlsVar6;
                                    repeatableTask$startRepeatableJob$1.L$2 = wlsVar7;
                                    repeatableTask$startRepeatableJob$1.L$3 = wlsVar9;
                                    repeatableTask$startRepeatableJob$1.L$4 = wlsVar6;
                                    repeatableTask$startRepeatableJob$1.L$5 = ref$IntRef3;
                                    repeatableTask$startRepeatableJob$1.L$6 = obj3;
                                    repeatableTask$startRepeatableJob$1.label = 3;
                                    if (wlsVar9.invoke(s0j0Var, repeatableTask$startRepeatableJob$1) != coroutineSingletons) {
                                        Ref$IntRef ref$IntRef7 = ref$IntRef3;
                                        obj2 = obj3;
                                        wlsVar8 = wlsVar9;
                                        ref$IntRef2 = ref$IntRef7;
                                        ref$IntRef2.element += i5;
                                        j = aVar.c;
                                        repeatableTask$startRepeatableJob$1.L$0 = tlsVar5;
                                        repeatableTask$startRepeatableJob$1.L$1 = tlsVar6;
                                        repeatableTask$startRepeatableJob$1.L$2 = wlsVar7;
                                        repeatableTask$startRepeatableJob$1.L$3 = wlsVar8;
                                        repeatableTask$startRepeatableJob$1.L$4 = wlsVar6;
                                        repeatableTask$startRepeatableJob$1.L$5 = ref$IntRef2;
                                        repeatableTask$startRepeatableJob$1.L$6 = obj2;
                                        repeatableTask$startRepeatableJob$1.label = 4;
                                        if (kotlinx.coroutines.a.i(j, repeatableTask$startRepeatableJob$1) != coroutineSingletons) {
                                            obj5 = obj2;
                                            wlsVar4 = wlsVar7;
                                            ref$IntRef = ref$IntRef2;
                                            repeatableTask$startRepeatableJob$12 = repeatableTask$startRepeatableJob$1;
                                            tlsVar4 = tlsVar6;
                                            wlsVar15 = wlsVar8;
                                            tlsVar3 = tlsVar5;
                                            wlsVar5 = wlsVar15;
                                            i5 = 1;
                                            obj = obj5;
                                            i4 = 2;
                                            i2 = ref$IntRef.element;
                                            if (i2 < aVar.b) {
                                                if (obj != null) {
                                                    s0j0 s0j0Var2 = new s0j0(i2, obj);
                                                    repeatableTask$startRepeatableJob$12.L$0 = null;
                                                    repeatableTask$startRepeatableJob$12.L$1 = null;
                                                    repeatableTask$startRepeatableJob$12.L$2 = null;
                                                    repeatableTask$startRepeatableJob$12.L$3 = null;
                                                    repeatableTask$startRepeatableJob$12.L$4 = null;
                                                    repeatableTask$startRepeatableJob$12.L$5 = null;
                                                    repeatableTask$startRepeatableJob$12.L$6 = null;
                                                    repeatableTask$startRepeatableJob$12.L$7 = obj;
                                                    repeatableTask$startRepeatableJob$12.L$8 = null;
                                                    repeatableTask$startRepeatableJob$12.I$0 = 0;
                                                    repeatableTask$startRepeatableJob$12.label = 5;
                                                    if (wlsVar6.invoke(s0j0Var2, repeatableTask$startRepeatableJob$12) == coroutineSingletons) {
                                                    }
                                                }
                                                return zy11Var;
                                            }
                                        }
                                    }
                                } else {
                                    s0j0 s0j0Var3 = new s0j0(ref$IntRef3.element, obj3);
                                    repeatableTask$startRepeatableJob$1.L$0 = null;
                                    repeatableTask$startRepeatableJob$1.L$1 = null;
                                    repeatableTask$startRepeatableJob$1.L$2 = null;
                                    repeatableTask$startRepeatableJob$1.L$3 = null;
                                    repeatableTask$startRepeatableJob$1.L$4 = null;
                                    repeatableTask$startRepeatableJob$1.L$5 = null;
                                    repeatableTask$startRepeatableJob$1.L$6 = null;
                                    repeatableTask$startRepeatableJob$1.label = i4;
                                    if (wlsVar7.invoke(s0j0Var3, repeatableTask$startRepeatableJob$1) != coroutineSingletons) {
                                        return zy11Var;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                b.b(obj3);
                return zy11Var;
            }
        }
        repeatableTask$startRepeatableJob$1 = new RepeatableTask$startRepeatableJob$1(aVar, continuationImpl);
        Object obj32 = repeatableTask$startRepeatableJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = repeatableTask$startRepeatableJob$1.label;
        zy11 zy11Var2 = zy11.a;
        int i42 = 2;
        int i52 = 1;
        if (i != 0) {
        }
    }

    public final void b(tls tlsVar, tls tlsVar2, wls wlsVar, wls wlsVar2, wls wlsVar3) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(this.a, null, null, new RepeatableTask$start$5(this, tlsVar, tlsVar2, wlsVar, wlsVar2, wlsVar3, null), 3);
    }
}
