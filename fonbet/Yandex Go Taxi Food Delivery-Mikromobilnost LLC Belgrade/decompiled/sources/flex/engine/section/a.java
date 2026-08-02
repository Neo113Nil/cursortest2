package flex.engine.section;

import defpackage.d3q0;
import defpackage.i3y;
import defpackage.j400;
import defpackage.klc;
import defpackage.kq90;
import defpackage.n2q0;
import defpackage.ny61;
import defpackage.q2q0;
import defpackage.s1m;
import defpackage.s7s0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tjr;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.w2q0;
import defpackage.x2q0;
import defpackage.xfz;
import defpackage.y2q0;
import defpackage.ywl;
import defpackage.zjr;
import defpackage.zse;
import flex.logger.FlexLogLevel;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements s1m {
    public final zjr a = new zjr(xfz.b(a.class.getSimpleName()));

    @Override // defpackage.s1m
    public final ywl b(kq90 kq90Var, ywl ywlVar, ywl ywlVar2, ywl ywlVar3) {
        return ywlVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.s1m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(klc klcVar, u1m u1mVar, kq90 kq90Var, ywl ywlVar, Throwable th, Continuation continuation) {
        SectionPaginationPatcher$onError$1 sectionPaginationPatcher$onError$1;
        int i;
        StackTraceElement stackTraceElement;
        String str;
        String num;
        ywl ywlVar2;
        StackTraceElement stackTraceElement2;
        String num2;
        if (continuation instanceof SectionPaginationPatcher$onError$1) {
            sectionPaginationPatcher$onError$1 = (SectionPaginationPatcher$onError$1) continuation;
            int i2 = sectionPaginationPatcher$onError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sectionPaginationPatcher$onError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sectionPaginationPatcher$onError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sectionPaginationPatcher$onError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (kq90Var instanceof d3q0) {
                        w2q0 w2q0Var = ((d3q0) kq90Var).a;
                        boolean z = w2q0Var instanceof q2q0;
                        String str2 = "No line info";
                        EmptyList emptyList = EmptyList.a;
                        zjr zjrVar = this.a;
                        tjr tjrVar = tjr.d;
                        if (z) {
                            i3y a = kotlin.a.a(x2q0.a);
                            s7s0 s7s0Var = zjrVar.c.a;
                            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                                String fileName = stackTraceElement2.getFileName();
                                str = fileName != null ? fileName : "No file info";
                                String methodName = stackTraceElement2.getMethodName();
                                Integer num3 = new Integer(stackTraceElement2.getLineNumber());
                                if (num3.intValue() <= 0) {
                                    num3 = null;
                                }
                                if (num3 != null && (num2 = num3.toString()) != null) {
                                    str2 = num2;
                                }
                                tjrVar = new tjr(str, methodName, str2);
                            }
                            zjrVar.d(FlexLogLevel.INFO, "Disabling section pagination", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                            sjh sjhVar = uyj.a;
                            j400 j400Var = (j400) zse.a.b;
                            SectionPaginationPatcher$onError$2 sectionPaginationPatcher$onError$2 = new SectionPaginationPatcher$onError$2(w2q0Var, klcVar, null);
                            sectionPaginationPatcher$onError$1.L$0 = null;
                            sectionPaginationPatcher$onError$1.L$1 = null;
                            sectionPaginationPatcher$onError$1.L$2 = null;
                            sectionPaginationPatcher$onError$1.L$3 = ywlVar;
                            sectionPaginationPatcher$onError$1.L$4 = null;
                            sectionPaginationPatcher$onError$1.L$5 = null;
                            sectionPaginationPatcher$onError$1.label = 1;
                            obj = tje.k0(j400Var, sectionPaginationPatcher$onError$2, sectionPaginationPatcher$onError$1);
                            if (obj != coroutineSingletons) {
                                ywlVar2 = ywlVar;
                            }
                        } else if (w2q0Var instanceof n2q0) {
                            i3y a2 = kotlin.a.a(y2q0.a);
                            s7s0 s7s0Var2 = zjrVar.c.a;
                            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                                String fileName2 = stackTraceElement.getFileName();
                                str = fileName2 != null ? fileName2 : "No file info";
                                String methodName2 = stackTraceElement.getMethodName();
                                Integer num4 = new Integer(stackTraceElement.getLineNumber());
                                if (num4.intValue() <= 0) {
                                    num4 = null;
                                }
                                if (num4 != null && (num = num4.toString()) != null) {
                                    str2 = num;
                                }
                                tjrVar = new tjr(str, methodName2, str2);
                            }
                            zjrVar.d(FlexLogLevel.INFO, "Disabling content pagination", a2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                            sjh sjhVar2 = uyj.a;
                            j400 j400Var2 = (j400) zse.a.b;
                            SectionPaginationPatcher$onError$3 sectionPaginationPatcher$onError$3 = new SectionPaginationPatcher$onError$3(klcVar, null);
                            sectionPaginationPatcher$onError$1.L$0 = null;
                            sectionPaginationPatcher$onError$1.L$1 = null;
                            sectionPaginationPatcher$onError$1.L$2 = null;
                            sectionPaginationPatcher$onError$1.L$3 = ywlVar;
                            sectionPaginationPatcher$onError$1.L$4 = null;
                            sectionPaginationPatcher$onError$1.L$5 = null;
                            sectionPaginationPatcher$onError$1.label = 2;
                            if (tje.k0(j400Var2, sectionPaginationPatcher$onError$3, sectionPaginationPatcher$onError$1) == coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return ywlVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ywl ywlVar3 = (ywl) sectionPaginationPatcher$onError$1.L$3;
                    kotlin.b.b(obj);
                    return ywlVar3;
                }
                ywlVar2 = (ywl) sectionPaginationPatcher$onError$1.L$3;
                kotlin.b.b(obj);
                return ywlVar2;
            }
        }
        sectionPaginationPatcher$onError$1 = new SectionPaginationPatcher$onError$1(this, (ContinuationImpl) continuation);
        Object obj2 = sectionPaginationPatcher$onError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sectionPaginationPatcher$onError$1.label;
        if (i != 0) {
        }
        return ywlVar2;
    }
}
