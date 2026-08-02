package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j05 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ e15 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ j05(rjc rjcVar, e15 e15Var, String str, String str2, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = e15Var;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[LOOP:0: B:21:0x00b5->B:23:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        i05 i05Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        int i2;
        l05 l05Var;
        int i3;
        int i4;
        Object d;
        rjc rjcVar2;
        int i5;
        cvl cvlVar;
        rjc rjcVar3;
        rrl rrlVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof i05) {
                    i05Var = (i05) continuation;
                    int i6 = i05Var.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        i05Var.k = i6 - Integer.MIN_VALUE;
                        obj2 = i05Var.j;
                        nm6Var = nm6.a;
                        i = i05Var.k;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj2);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i2 = i05Var.n;
                                rjcVar = i05Var.m;
                                qgg.h0(obj2);
                            }
                        } else {
                            qgg.h0(obj2);
                            rjcVar = this.b;
                            i05Var.m = rjcVar;
                            i2 = 0;
                            i05Var.n = 0;
                            i05Var.k = 1;
                            obj2 = this.c.d(this.d, this.e, i05Var);
                            if (obj2 == nm6Var) {
                            }
                        }
                        i05Var.m = null;
                        i05Var.n = i2;
                        i05Var.k = 2;
                        if (rjcVar.emit(obj2, i05Var) == nm6Var) {
                        }
                    }
                }
                i05Var = new i05(this, continuation);
                obj2 = i05Var.j;
                nm6Var = nm6.a;
                i = i05Var.k;
                if (i == 0) {
                }
                i05Var.m = null;
                i05Var.n = i2;
                i05Var.k = 2;
                if (rjcVar.emit(obj2, i05Var) == nm6Var) {
                }
                break;
            default:
                if (continuation instanceof l05) {
                    l05Var = (l05) continuation;
                    int i7 = l05Var.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        l05Var.k = i7 - Integer.MIN_VALUE;
                        Object obj3 = l05Var.j;
                        nm6 nm6Var2 = nm6.a;
                        i3 = l05Var.k;
                        e15 e15Var = this.c;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        qgg.h0(obj3);
                                        break;
                                    } else {
                                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    i5 = l05Var.o;
                                    cvlVar = l05Var.n;
                                    rjcVar3 = l05Var.m;
                                    qgg.h0(obj3);
                                    List list = (List) obj3;
                                    List<mqs> list2 = list;
                                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                                    for (mqs mqsVar : list2) {
                                        arrayList.add(new t2m(mqsVar.d(), mqsVar.w0));
                                    }
                                    rrlVar = new rrl(cvlVar, arrayList, list);
                                    rjcVar2 = rjcVar3;
                                    l05Var.m = null;
                                    l05Var.n = null;
                                    l05Var.o = i5;
                                    l05Var.k = 3;
                                    if (rjcVar2.emit(rrlVar, l05Var) == nm6Var2) {
                                    }
                                }
                            } else {
                                int i8 = l05Var.p;
                                int i9 = l05Var.o;
                                rjc rjcVar4 = l05Var.m;
                                qgg.h0(obj3);
                                i4 = i8;
                                i5 = i9;
                                d = obj3;
                                rjcVar2 = rjcVar4;
                            }
                        } else {
                            qgg.h0(obj3);
                            rjc rjcVar5 = this.b;
                            l05Var.m = rjcVar5;
                            i4 = 0;
                            l05Var.o = 0;
                            l05Var.p = 0;
                            l05Var.k = 1;
                            d = e15Var.d(this.d, this.e, l05Var);
                            if (d != nm6Var2) {
                                rjcVar2 = rjcVar5;
                                i5 = 0;
                            }
                        }
                        cvlVar = (cvl) d;
                        if (cvlVar != null) {
                            rrlVar = null;
                            l05Var.m = null;
                            l05Var.n = null;
                            l05Var.o = i5;
                            l05Var.k = 3;
                            if (rjcVar2.emit(rrlVar, l05Var) == nm6Var2) {
                            }
                        } else {
                            Integer num = new Integer(20);
                            l05Var.m = rjcVar2;
                            l05Var.n = cvlVar;
                            l05Var.o = i5;
                            l05Var.p = i4;
                            l05Var.k = 2;
                            obj3 = x97.V(dm6.b, new xg(this.e, e15Var, num, this.d, (Continuation) null, 4), l05Var);
                            if (obj3 != nm6Var2) {
                                rjcVar3 = rjcVar2;
                                List list3 = (List) obj3;
                                List<mqs> list22 = list3;
                                ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
                                while (r4.hasNext()) {
                                }
                                rrlVar = new rrl(cvlVar, arrayList2, list3);
                                rjcVar2 = rjcVar3;
                                l05Var.m = null;
                                l05Var.n = null;
                                l05Var.o = i5;
                                l05Var.k = 3;
                                if (rjcVar2.emit(rrlVar, l05Var) == nm6Var2) {
                                }
                            }
                        }
                    }
                }
                l05Var = new l05(this, continuation);
                Object obj32 = l05Var.j;
                nm6 nm6Var22 = nm6.a;
                i3 = l05Var.k;
                e15 e15Var2 = this.c;
                if (i3 == 0) {
                }
                cvlVar = (cvl) d;
                if (cvlVar != null) {
                }
                break;
        }
        return Unit.a;
    }
}
