package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bnn extends aur implements pyc {
    public List j;
    public List k;
    public List l;
    public upi m;
    public upi n;
    public upi o;
    public Set p;
    public upi q;
    public int r;
    public /* synthetic */ qdi s;
    public final /* synthetic */ cnn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnn(cnn cnnVar, Continuation continuation) {
        super(3, continuation);
        this.t = cnnVar;
    }

    public static final void k(cnn cnnVar, List list, List list2, List list3, upi upiVar, upi upiVar2, upi upiVar3, upi upiVar4) {
        char c;
        long j;
        long j2;
        synchronized (cnnVar.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    wr5 wr5Var = (wr5) list3.get(i);
                    wr5Var.d();
                    cnnVar.G(wr5Var);
                }
                list3.clear();
                Object[] objArr = upiVar.b;
                long[] jArr = upiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    wr5 wr5Var2 = (wr5) objArr[(i2 << 3) + i4];
                                    wr5Var2.d();
                                    cnnVar.G(wr5Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                upiVar.c();
                Object[] objArr2 = upiVar2.b;
                long[] jArr2 = upiVar2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((wr5) objArr2[(i5 << 3) + i7]).k();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                upiVar2.c();
                upiVar3.c();
                Object[] objArr3 = upiVar4.b;
                long[] jArr3 = upiVar4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    wr5 wr5Var3 = (wr5) objArr3[(i8 << 3) + i10];
                                    wr5Var3.d();
                                    cnnVar.G(wr5Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                upiVar4.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void l(List list, cnn cnnVar) {
        list.clear();
        synchronized (cnnVar.c) {
            try {
                ArrayList arrayList = cnnVar.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((mfi) arrayList.get(i));
                }
                cnnVar.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bnn bnnVar = new bnn(this.t, (Continuation) obj3);
        bnnVar.s = (qdi) obj2;
        bnnVar.invokeSuspend(Unit.a);
        return nm6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0142 -> B:6:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0203 -> B:35:0x009f). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qdi qdiVar;
        upi upiVar;
        upi upiVar2;
        List list;
        Set set;
        List list2;
        upi upiVar3;
        List list3;
        upi upiVar4;
        List list4;
        upi upiVar5;
        List list5;
        upi upiVar6;
        Object obj2;
        zt3 zt3Var;
        nm6 nm6Var;
        qdi qdiVar2;
        gpi gpiVar;
        bnn bnnVar = this;
        nm6 nm6Var2 = nm6.a;
        int i = bnnVar.r;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            qgg.h0(obj);
            qdiVar = bnnVar.s;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = xso.a;
            upiVar = new upi();
            upi upiVar7 = new upi();
            upi upiVar8 = new upi();
            yso ysoVar = new yso(upiVar8);
            upiVar2 = new upi();
            list = arrayList;
            set = ysoVar;
            list2 = arrayList2;
            upiVar3 = upiVar8;
            list3 = arrayList3;
            upiVar4 = upiVar7;
            synchronized (bnnVar.t.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                upi upiVar9 = bnnVar.q;
                set = bnnVar.p;
                upiVar3 = bnnVar.o;
                upiVar4 = bnnVar.n;
                upiVar = bnnVar.m;
                list3 = bnnVar.l;
                list2 = bnnVar.k;
                list = bnnVar.j;
                qdi qdiVar3 = bnnVar.s;
                qgg.h0(obj);
                upiVar2 = upiVar9;
                qdiVar = qdiVar3;
                cnn cnnVar = bnnVar.t;
                synchronized (cnnVar.c) {
                    try {
                        tpi tpiVar = cnnVar.l;
                        if (tpiVar.e != 0) {
                            gpi d = sgi.d(tpiVar);
                            cnnVar.l.a();
                            nnd nndVar = cnnVar.m;
                            ((tpi) nndVar.b).a();
                            ((tpi) nndVar.c).a();
                            cnnVar.o.a();
                            gpiVar = new gpi(d.b);
                            Object[] objArr = d.a;
                            int i5 = d.b;
                            nm6Var = nm6Var2;
                            int i6 = 0;
                            while (i6 < i5) {
                                int i7 = i6;
                                mfi mfiVar = (mfi) objArr[i6];
                                gpiVar.a(new Pair(mfiVar, cnnVar.n.g(mfiVar)));
                                i6 = i7 + 1;
                                qdiVar = qdiVar;
                            }
                            qdiVar2 = qdiVar;
                            cnnVar.n.a();
                        } else {
                            nm6Var = nm6Var2;
                            qdiVar2 = qdiVar;
                            gpiVar = whj.b;
                            gpiVar.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = gpiVar.a;
                int i8 = gpiVar.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    Pair pair = (Pair) objArr2[i9];
                    mfi mfiVar2 = (mfi) pair.a;
                    lfi lfiVar = (lfi) pair.b;
                    if (lfiVar != null) {
                        m mVar = new m(mfiVar2.c.e);
                        oxq o = lfiVar.a.o();
                        try {
                            pq5.i(o, mVar);
                            o.e(true);
                            mVar.h();
                        } catch (Throwable th2) {
                            o.e(false);
                            throw th2;
                        }
                    }
                }
                bnnVar = this;
                nm6Var2 = nm6Var;
                qdiVar = qdiVar2;
                i2 = 2;
                i3 = 1;
                synchronized (bnnVar.t.c) {
                }
                cnn cnnVar2 = bnnVar.t;
                bnnVar.s = qdiVar;
                bnnVar.j = list;
                bnnVar.k = list2;
                bnnVar.l = list3;
                bnnVar.m = upiVar;
                bnnVar.n = upiVar4;
                bnnVar.o = upiVar3;
                bnnVar.p = set;
                bnnVar.q = upiVar2;
                bnnVar.r = i3;
                if (cnnVar2.A()) {
                    obj2 = Unit.a;
                } else {
                    zt3 zt3Var2 = new zt3(i3, qxe.b(bnnVar));
                    zt3Var2.s();
                    synchronized (cnnVar2.c) {
                        if (cnnVar2.A()) {
                            zt3Var = zt3Var2;
                        } else {
                            cnnVar2.r = zt3Var2;
                            zt3Var = null;
                        }
                    }
                    if (zt3Var != null) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(Unit.a);
                    }
                    obj2 = zt3Var2.q();
                    if (obj2 != nm6.a) {
                        obj2 = Unit.a;
                    }
                }
                if (obj2 != nm6Var2) {
                    List list6 = list;
                    upiVar5 = upiVar;
                    upiVar6 = upiVar2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    upi upiVar10 = upiVar4;
                    upi upiVar11 = upiVar3;
                    if (cnn.u(bnnVar.t)) {
                        List list7 = list4;
                        upiVar2 = upiVar6;
                        upiVar = upiVar5;
                        list = list5;
                        list3 = list7;
                        bnnVar = this;
                        upiVar3 = upiVar11;
                        upiVar4 = upiVar10;
                        set = set2;
                        synchronized (bnnVar.t.c) {
                        }
                    } else {
                        ann annVar = new ann(bnnVar.t, upiVar11, upiVar6, list5, list2, upiVar5, list4, upiVar10, set2);
                        bnnVar.s = qdiVar;
                        bnnVar.j = list5;
                        bnnVar.k = list2;
                        bnnVar.l = list4;
                        bnnVar.m = upiVar5;
                        bnnVar.n = upiVar10;
                        bnnVar.o = upiVar11;
                        bnnVar.p = set2;
                        bnnVar.q = upiVar6;
                        bnnVar.r = i2;
                        if (qdiVar.P(annVar, bnnVar) != nm6Var2) {
                            List list8 = list4;
                            upiVar2 = upiVar6;
                            upiVar = upiVar5;
                            list = list5;
                            list3 = list8;
                            upiVar3 = upiVar11;
                            upiVar4 = upiVar10;
                            set = set2;
                            cnn cnnVar3 = bnnVar.t;
                            synchronized (cnnVar3.c) {
                            }
                        }
                    }
                }
                return nm6Var2;
            }
            upi upiVar12 = bnnVar.q;
            set = bnnVar.p;
            upiVar3 = bnnVar.o;
            upiVar4 = bnnVar.n;
            upi upiVar13 = bnnVar.m;
            List list9 = bnnVar.l;
            list2 = bnnVar.k;
            List list10 = bnnVar.j;
            qdi qdiVar4 = bnnVar.s;
            qgg.h0(obj);
            upiVar6 = upiVar12;
            qdiVar = qdiVar4;
            list4 = list9;
            list5 = list10;
            upiVar5 = upiVar13;
            Set set22 = set;
            upi upiVar102 = upiVar4;
            upi upiVar112 = upiVar3;
            if (cnn.u(bnnVar.t)) {
            }
        }
    }
}
