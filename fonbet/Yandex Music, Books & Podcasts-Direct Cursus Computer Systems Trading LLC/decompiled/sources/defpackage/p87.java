package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p87 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(ju0 ju0Var, boolean z, boolean z2, String str, String str2, String str3, z77 z77Var, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.o = ju0Var;
        this.l = z;
        this.m = z2;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = z77Var;
        this.n = z3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p87((ju0) this.o, this.l, this.m, (String) this.p, (String) this.q, (String) this.r, (z77) this.s, this.n, continuation);
            default:
                return new p87((g6a) this.o, (t5a) this.p, (q2a) this.q, (Map) this.r, (apo) this.s, this.l, this.m, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p87) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:11|(2:14|12)|15|16|(1:18)|(1:20)(1:133)|21|(1:132)(1:25)|(1:131)(1:28)|(1:30)(1:(1:130))|31|32|(1:34)(3:112|(7:114|(1:116)(1:127)|117|118|(1:120)|(1:126)|124)(1:128)|125)|35|(3:108|109|(11:111|38|39|(1:41)(1:105)|42|43|(1:45)(1:80)|46|(4:53|54|55|(2:57|(2:50|51)(1:52)))|48|(0)(0)))|37|38|39|(0)(0)|42|43|(0)(0)|46|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0230, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0231, code lost:
    
        r27 = r2;
        r16 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a A[Catch: IllegalArgumentException -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x013e, blocks: (B:109:0x0137, B:111:0x013b, B:41:0x014a), top: B:108:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0274  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object a;
        g06 g06Var;
        ArrayList arrayList;
        vhc vhcVar;
        String str;
        bsj bsjVar;
        Object obj2;
        StackTraceElement stackTraceElement;
        String str2;
        Object k4aVar;
        StackTraceElement stackTraceElement2;
        String str3;
        k4a k4aVar2;
        int i = this.j;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        Object obj7 = this.o;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        ju0 ju0Var = (ju0) obj7;
                        boolean z = this.l;
                        boolean z2 = this.m;
                        String str4 = (String) obj6;
                        String str5 = (String) obj5;
                        String str6 = (String) obj4;
                        z77 z77Var = (z77) obj3;
                        boolean z3 = this.n;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        a = ju0.a(ju0Var, z, z2, str4, str5, str6, z77Var, z3, this);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a = obj;
                    }
                    t7oVar = (x6a) a;
                    r7o r7oVar2 = z7o.b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                return t7oVar instanceof t7o ? r6a.a : t7oVar;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                g6a g6aVar = (g6a) obj7;
                t5a t5aVar = (t5a) obj6;
                q2a q2aVar = (q2a) obj5;
                Map map = (Map) obj4;
                apo apoVar = (apo) obj3;
                this.k = 1;
                g06 g06Var2 = g6aVar.d;
                ArrayList m = apoVar.m();
                ArrayList arrayList2 = new ArrayList(v75.o(m, 10));
                Iterator it = m.iterator();
                while (it.hasNext()) {
                    String str7 = (String) it.next();
                    ConcurrentHashMap concurrentHashMap = fsg.a;
                    arrayList2.add(new zhc(str7));
                }
                boolean contains = m.contains("isPreload");
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) apoVar.b;
                if (!copyOnWriteArrayList.isEmpty()) {
                    copyOnWriteArrayList.clear();
                    apoVar.o();
                }
                boolean z4 = q2aVar != null;
                boolean z5 = this.l;
                boolean z6 = this.m;
                boolean z7 = z4 && (z6 || !z5);
                boolean z8 = (z4 || z5) ? false : true;
                if (z7) {
                    apoVar.i("reloadRequest");
                } else if (z8) {
                    apoVar.i("headRequest");
                }
                jyr d = g6a.d(g6aVar, t5aVar, q2aVar, map, Boolean.valueOf(z5), null, null, 48);
                thc thcVar = (thc) g06Var2.c;
                thc thcVar2 = (thc) g06Var2.c;
                htb htbVar = thcVar.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                vhc vhcVar2 = vhc.d;
                if (booleanValue) {
                    StackTraceElement stackTraceElement3 = (StackTraceElement) hrg.k(0);
                    if (stackTraceElement3 != null) {
                        String fileName = stackTraceElement3.getFileName();
                        String str8 = fileName == null ? "No file info" : fileName;
                        g06Var = g06Var2;
                        String methodName = stackTraceElement3.getMethodName();
                        arrayList = arrayList2;
                        Integer num = new Integer(stackTraceElement3.getLineNumber());
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num == null || (str = num.toString()) == null) {
                            str = "No line info";
                        }
                        vhcVar = new vhc(str8, methodName, str);
                    } else {
                        g06Var = g06Var2;
                        arrayList = arrayList2;
                        vhcVar = vhcVar2;
                    }
                    g06Var2 = g06Var;
                } else {
                    arrayList = arrayList2;
                    vhcVar = vhcVar2;
                }
                g06Var2.N(yhc.DEBUG, "Document fetch started", d, arrayList, vhcVar.a, vhcVar.b, vhcVar.c);
                boolean z9 = this.n;
                if (q2aVar != null) {
                    try {
                        bsjVar = q2aVar.e;
                    } catch (IllegalArgumentException e2) {
                        IllegalArgumentException illegalArgumentException = e2;
                        boolean z10 = z9;
                        jyr d2 = g6a.d(g6aVar, t5aVar, q2aVar, map, Boolean.valueOf(z5), illegalArgumentException, null, 32);
                        IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                        htb htbVar2 = thcVar2.a;
                        if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                            String fileName2 = stackTraceElement.getFileName();
                            if (fileName2 == null) {
                                fileName2 = "No file info";
                            }
                            String methodName2 = stackTraceElement.getMethodName();
                            Integer num2 = new Integer(stackTraceElement.getLineNumber());
                            if (num2.intValue() <= 0) {
                                num2 = null;
                            }
                            if (num2 != null || (str2 = num2.toString()) == null) {
                                str2 = "No line info";
                            }
                            vhcVar2 = new vhc(fileName2, methodName2, str2);
                        }
                        vhc vhcVar3 = vhcVar2;
                        g06Var2.N(yhc.DEBUG, "Failed to create request", d2, arrayList, vhcVar3.a, vhcVar3.b, vhcVar3.c);
                        if (z10) {
                            apoVar.h(m);
                        }
                        k4aVar = new k4a(illegalArgumentException2);
                        if (k4aVar == nm6Var2) {
                        }
                    }
                    if (bsjVar != null) {
                        obj2 = bsjVar.a;
                        lah j = g6a.j(t5aVar, !(obj2 instanceof q5f) ? (q5f) obj2 : null, map, z5);
                        r0o r0oVar = new r0o(j);
                        r0oVar.b = contains;
                        yfx yfxVar = g6aVar.b;
                        String str9 = (String) g06Var2.d;
                        String str10 = str9 != null ? null : str9;
                        v5f v5fVar = (v5f) ((jyr) yfxVar.c).getValue();
                        g06 g06Var3 = g06Var2;
                        int i4 = 1;
                        i5f r = quj.r(v5fVar.a, new vg(v5fVar, i4));
                        vx6 vx6Var = new vx6(new iwe(i4, r, swf.X(r.b, ern.a(b6a.class))), yfxVar, q2aVar, t5aVar, str10);
                        if (!z6) {
                            try {
                                g6aVar.e(t5aVar, j);
                                k4aVar2 = null;
                            } catch (Throwable th2) {
                                if (z9) {
                                    apoVar.h(m);
                                }
                                g6aVar.h(t5aVar, th2, "DocumentService.tryLoadFromCache", apoVar);
                                jyr d3 = g6a.d(g6aVar, t5aVar, null, null, null, th2, null, 46);
                                c5b c5bVar = c5b.a;
                                htb htbVar3 = thcVar2.a;
                                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                                    String fileName3 = stackTraceElement2.getFileName();
                                    if (fileName3 == null) {
                                        fileName3 = "No file info";
                                    }
                                    String methodName3 = stackTraceElement2.getMethodName();
                                    int lineNumber = stackTraceElement2.getLineNumber();
                                    Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                                    if (valueOf == null || (str3 = valueOf.toString()) == null) {
                                        str3 = "No line info";
                                    }
                                    vhcVar2 = new vhc(fileName3, methodName3, str3);
                                }
                                vhc vhcVar4 = vhcVar2;
                                g06Var3.N(yhc.DEBUG, "Failed to fetch document", d3, c5bVar, vhcVar4.a, vhcVar4.b, vhcVar4.c);
                                k4aVar2 = new k4a(th2);
                            }
                            if (k4aVar2 != null) {
                                k4aVar = k4aVar2;
                                return k4aVar == nm6Var2 ? nm6Var2 : k4aVar;
                            }
                        }
                        k4aVar = g6aVar.k(t5aVar, j, vx6Var, apoVar, m, z9, r0oVar, this);
                        if (k4aVar == nm6Var2) {
                        }
                    }
                }
                obj2 = null;
                lah j2 = g6a.j(t5aVar, !(obj2 instanceof q5f) ? (q5f) obj2 : null, map, z5);
                r0o r0oVar2 = new r0o(j2);
                r0oVar2.b = contains;
                yfx yfxVar2 = g6aVar.b;
                String str92 = (String) g06Var2.d;
                if (str92 != null) {
                }
                v5f v5fVar2 = (v5f) ((jyr) yfxVar2.c).getValue();
                g06 g06Var32 = g06Var2;
                int i42 = 1;
                i5f r2 = quj.r(v5fVar2.a, new vg(v5fVar2, i42));
                vx6 vx6Var2 = new vx6(new iwe(i42, r2, swf.X(r2.b, ern.a(b6a.class))), yfxVar2, q2aVar, t5aVar, str10);
                if (!z6) {
                }
                k4aVar = g6aVar.k(t5aVar, j2, vx6Var2, apoVar, m, z9, r0oVar2, this);
                if (k4aVar == nm6Var2) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(g6a g6aVar, t5a t5aVar, q2a q2aVar, Map map, apo apoVar, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.o = g6aVar;
        this.p = t5aVar;
        this.q = q2aVar;
        this.r = map;
        this.s = apoVar;
        this.l = z;
        this.m = z2;
        this.n = z3;
    }
}
