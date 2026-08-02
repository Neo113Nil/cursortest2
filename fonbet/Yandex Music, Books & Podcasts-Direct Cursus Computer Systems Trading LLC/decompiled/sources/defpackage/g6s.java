package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class g6s {
    public static final kr3 a = new kr3(3, 5, null);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[LOOP:0: B:11:0x004d->B:12:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hur hurVar, kq2 kq2Var) {
        z5s z5sVar;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (kq2Var instanceof z5s) {
            z5sVar = (z5s) kq2Var;
            int i4 = z5sVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z5sVar.l = i4 - Integer.MIN_VALUE;
                Object obj = z5sVar.k;
                nm6 nm6Var = nm6.a;
                i = z5sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    z5sVar.j = hurVar;
                    z5sVar.l = 1;
                    obj = hurVar.a(gfm.b, z5sVar);
                    if (obj == nm6Var) {
                    }
                    ffm ffmVar = (ffm) obj;
                    List list = ffmVar.a;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = ffmVar.a;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hurVar = z5sVar.j;
                qgg.h0(obj);
                ffm ffmVar2 = (ffm) obj;
                List list3 = ffmVar2.a;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((lfm) list3.get(i3)).a();
                }
                List list22 = ffmVar2.a;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((lfm) list22.get(i2)).d) {
                        z5sVar.j = hurVar;
                        z5sVar.l = 1;
                        obj = hurVar.a(gfm.b, z5sVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        ffm ffmVar22 = (ffm) obj;
                        List list32 = ffmVar22.a;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = ffmVar22.a;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return Unit.a;
            }
        }
        z5sVar = new z5s(kq2Var);
        Object obj2 = z5sVar.k;
        nm6 nm6Var2 = nm6.a;
        i = z5sVar.l;
        if (i != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(defpackage.hur r6, boolean r7, defpackage.gfm r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.w5s
            if (r0 == 0) goto L13
            r0 = r9
            w5s r0 = (defpackage.w5s) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            w5s r0 = new w5s
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.m
            nm6 r1 = defpackage.nm6.a
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r6 = r0.l
            gfm r7 = r0.k
            hur r8 = r0.j
            defpackage.qgg.h0(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r6)
            r6 = 0
            return r6
        L38:
            defpackage.qgg.h0(r9)
        L3b:
            r0.j = r6
            r0.k = r8
            r0.l = r7
            r0.n = r3
            java.lang.Object r9 = r6.a(r8, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            ffm r9 = (defpackage.ffm) r9
            r2 = 0
            boolean r4 = f(r9, r7, r2)
            if (r4 == 0) goto L3b
            java.util.List r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6s.b(hur, boolean, gfm, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(hur hurVar, boolean z, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return b(hurVar, z, gfm.b, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(defpackage.hur r6, defpackage.gfm r7, defpackage.kq2 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.x5s
            if (r0 == 0) goto L13
            r0 = r8
            x5s r0 = (defpackage.x5s) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            x5s r0 = new x5s
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            nm6 r1 = defpackage.nm6.a
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            gfm r6 = r0.k
            hur r7 = r0.j
            defpackage.qgg.h0(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L45
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r6)
            r6 = 0
            return r6
        L35:
            defpackage.qgg.h0(r8)
        L38:
            r0.j = r6
            r0.k = r7
            r0.m = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            ffm r8 = (defpackage.ffm) r8
            r2 = 0
            boolean r4 = f(r8, r2, r3)
            if (r4 == 0) goto L38
            java.util.List r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6s.d(hur, gfm, kq2):java.lang.Object");
    }

    public static Object e(pfm pfmVar, Function1 function1, pyc pycVar, Function1 function12, Continuation continuation, int i) {
        Function1 function13 = (i & 2) != 0 ? null : function1;
        if ((i & 4) != 0) {
            pycVar = a;
        }
        Object Q = gld.Q(new xg(pfmVar, pycVar, function13, (Object) null, (i & 8) != 0 ? null : function12, (Continuation) null, 20), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }

    public static final boolean f(ffm ffmVar, boolean z, boolean z2) {
        if (z2) {
            List list = ffmVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((lfm) list.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((ffmVar.c & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = ffmVar.a;
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= size2) {
                return true;
            }
            lfm lfmVar = (lfm) list2.get(i2);
            if (!z) {
                z3 = swf.z(lfmVar);
            } else if (lfmVar.b() || lfmVar.h || !lfmVar.d) {
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            i2++;
        }
    }

    public static rar g(mm6 mm6Var, r2f r2fVar, Function2 function2) {
        return x97.y(mm6Var, null, pm6.d, new fpq(r2fVar, function2, (Continuation) null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(hur hurVar, gfm gfmVar, kq2 kq2Var) {
        e6s e6sVar;
        int i;
        xqn xqnVar;
        try {
            if (kq2Var instanceof e6s) {
                e6sVar = (e6s) kq2Var;
                int i2 = e6sVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    e6sVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = e6sVar.k;
                    Object obj2 = nm6.a;
                    i = e6sVar.l;
                    if (i != 0) {
                        xqn i3 = hrg.i(obj);
                        i3.a = bvg.a;
                        long b = hurVar.c().b();
                        Function2 zqcVar = new zqc(gfmVar, i3, null, 6);
                        e6sVar.j = i3;
                        e6sVar.l = 1;
                        if (hurVar.k(b, zqcVar, e6sVar) == obj2) {
                            return obj2;
                        }
                        xqnVar = i3;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar = e6sVar.j;
                        qgg.h0(obj);
                    }
                    return xqnVar.a;
                }
            }
            if (i != 0) {
            }
            return xqnVar.a;
        } catch (hfm unused) {
            return dvg.a;
        }
        e6sVar = new e6s(kq2Var);
        Object obj3 = e6sVar.k;
        Object obj22 = nm6.a;
        i = e6sVar.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(hur hurVar, gfm gfmVar, kq2 kq2Var) {
        f6s f6sVar;
        int i;
        hur hurVar2;
        gfm gfmVar2;
        int size;
        int i2;
        if (kq2Var instanceof f6s) {
            f6sVar = (f6s) kq2Var;
            int i3 = f6sVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f6sVar.m = i3 - Integer.MIN_VALUE;
                Object obj = f6sVar.l;
                nm6 nm6Var = nm6.a;
                i = f6sVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    f6sVar.j = hurVar;
                    f6sVar.k = gfmVar;
                    f6sVar.m = 1;
                    obj = hurVar.a(gfmVar, f6sVar);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    gfmVar2 = f6sVar.k;
                    hurVar2 = f6sVar.j;
                    qgg.h0(obj);
                    List list = ((ffm) obj).a;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gfmVar2 = f6sVar.k;
                hurVar2 = f6sVar.j;
                qgg.h0(obj);
                hur hurVar3 = hurVar2;
                gfmVar = gfmVar2;
                hurVar = hurVar3;
                List list2 = ((ffm) obj).a;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((lfm) list2.get(i4)).b()) {
                        return null;
                    }
                }
                f6sVar.j = hurVar;
                f6sVar.k = gfmVar;
                f6sVar.m = 1;
                obj = hurVar.a(gfmVar, f6sVar);
                if (obj != nm6Var) {
                    gfm gfmVar3 = gfmVar;
                    hurVar2 = hurVar;
                    gfmVar2 = gfmVar3;
                    List list3 = ((ffm) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!swf.A((lfm) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                lfm lfmVar = (lfm) list3.get(i5);
                                if (lfmVar.b() || swf.S(lfmVar, hurVar2.f.y, hurVar2.b())) {
                                    return null;
                                }
                            }
                            gfm gfmVar4 = gfm.c;
                            f6sVar.j = hurVar2;
                            f6sVar.k = gfmVar2;
                            f6sVar.m = 2;
                            obj = hurVar2.a(gfmVar4, f6sVar);
                        }
                    }
                    return list3.get(0);
                }
                return nm6Var;
            }
        }
        f6sVar = new f6s(kq2Var);
        Object obj2 = f6sVar.l;
        nm6 nm6Var2 = nm6.a;
        i = f6sVar.m;
        if (i != 0) {
        }
    }
}
