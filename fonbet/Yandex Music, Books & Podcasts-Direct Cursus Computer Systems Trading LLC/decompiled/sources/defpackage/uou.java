package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class uou implements oou {
    public final dst a;
    public final n9w b;

    public uou(dst dstVar, n9w n9wVar) {
        this.a = dstVar;
        this.b = n9wVar;
    }

    public static nou f(mou mouVar) {
        return new nou(mouVar.a, mouVar.b, mouVar.c, mouVar.d, new Date(mouVar.e), mouVar.f, mouVar.g, mouVar.h, mouVar.i, mouVar.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        pou pouVar;
        int i;
        int i2;
        int i3;
        if (cg6Var instanceof pou) {
            pouVar = (pou) cg6Var;
            int i4 = pouVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pouVar.n = i4 - Integer.MIN_VALUE;
                Object obj = pouVar.l;
                nm6 nm6Var = nm6.a;
                i = pouVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = this.b.a();
                    pouVar.j = 0;
                    pouVar.k = 0;
                    pouVar.n = 1;
                    obj = this.a.b(a, pouVar);
                    if (obj != nm6Var) {
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(f((mou) it.next()));
                    }
                    return arrayList;
                }
                i2 = pouVar.k;
                i3 = pouVar.j;
                qgg.h0(obj);
                lou C = ((UserDatabase) obj).C();
                pouVar.j = i3;
                pouVar.k = i2;
                pouVar.n = 2;
                obj = up6.G(C.a, true, false, new xlu(15), pouVar);
            }
        }
        pouVar = new pou(this, cg6Var);
        Object obj2 = pouVar.l;
        nm6 nm6Var2 = nm6.a;
        i = pouVar.n;
        if (i != 0) {
        }
        lou C2 = ((UserDatabase) obj2).C();
        pouVar.j = i3;
        pouVar.k = i2;
        pouVar.n = 2;
        obj2 = up6.G(C2.a, true, false, new xlu(15), pouVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r11 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, cg6 cg6Var) {
        qou qouVar;
        int i;
        Object obj;
        int i2;
        int i3;
        if (cg6Var instanceof qou) {
            qouVar = (qou) cg6Var;
            int i4 = qouVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qouVar.o = i4 - Integer.MIN_VALUE;
                Object obj2 = qouVar.m;
                nm6 nm6Var = nm6.a;
                i = qouVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    String a = this.b.a();
                    qouVar.j = str;
                    qouVar.k = 0;
                    qouVar.l = 0;
                    qouVar.o = 1;
                    Object b = this.a.b(a, qouVar);
                    if (b != nm6Var) {
                        obj = b;
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    Iterable iterable = (Iterable) obj2;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(f((mou) it.next()));
                    }
                    return arrayList;
                }
                int i5 = qouVar.l;
                int i6 = qouVar.k;
                String str2 = qouVar.j;
                qgg.h0(obj2);
                i2 = i5;
                str = str2;
                i3 = i6;
                obj = obj2;
                lou C = ((UserDatabase) obj).C();
                qouVar.j = null;
                qouVar.k = i3;
                qouVar.l = i2;
                qouVar.o = 2;
                obj2 = up6.G(C.a, true, false, new srp(str, 17), qouVar);
            }
        }
        qouVar = new qou(this, cg6Var);
        Object obj22 = qouVar.m;
        nm6 nm6Var2 = nm6.a;
        i = qouVar.o;
        if (i != 0) {
        }
        lou C2 = ((UserDatabase) obj).C();
        qouVar.j = null;
        qouVar.k = i3;
        qouVar.l = i2;
        qouVar.o = 2;
        obj22 = up6.G(C2.a, true, false, new srp(str, 17), qouVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (defpackage.tyf.N(r10, r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, cg6 cg6Var) {
        rou rouVar;
        int i;
        int i2;
        int i3;
        if (cg6Var instanceof rou) {
            rouVar = (rou) cg6Var;
            int i4 = rouVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rouVar.o = i4 - Integer.MIN_VALUE;
                Object obj = rouVar.m;
                nm6 nm6Var = nm6.a;
                i = rouVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = this.b.a();
                    rouVar.j = list;
                    i2 = 0;
                    rouVar.k = 0;
                    rouVar.l = 0;
                    rouVar.o = 1;
                    obj = this.a.b(a, rouVar);
                    if (obj != nm6Var) {
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = rouVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                int i5 = rouVar.l;
                int i6 = rouVar.k;
                List list3 = rouVar.j;
                qgg.h0(obj);
                i2 = i5;
                list = list3;
                i3 = i6;
                ueo ueoVar = (ueo) obj;
                qys qysVar = new qys(ueoVar, null, list);
                rouVar.j = null;
                rouVar.k = i3;
                rouVar.l = i2;
                rouVar.o = 2;
            }
        }
        rouVar = new rou(this, cg6Var);
        Object obj2 = rouVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rouVar.o;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        qys qysVar2 = new qys(ueoVar2, null, list);
        rouVar.j = null;
        rouVar.k = i3;
        rouVar.l = i2;
        rouVar.o = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var, String str, ArrayList arrayList) {
        sou souVar;
        int i;
        String str2;
        ArrayList arrayList2;
        int i2;
        int i3;
        if (cg6Var instanceof sou) {
            souVar = (sou) cg6Var;
            int i4 = souVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                souVar.p = i4 - Integer.MIN_VALUE;
                Object obj = souVar.n;
                nm6 nm6Var = nm6.a;
                i = souVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = this.b.a();
                    souVar.j = str;
                    souVar.k = arrayList;
                    souVar.l = 0;
                    souVar.m = 0;
                    souVar.p = 1;
                    obj = this.a.b(a, souVar);
                    if (obj != nm6Var) {
                        str2 = str;
                        arrayList2 = arrayList;
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = souVar.m;
                i3 = souVar.l;
                ArrayList arrayList3 = souVar.k;
                String str3 = souVar.j;
                qgg.h0(obj);
                arrayList2 = arrayList3;
                str2 = str3;
                ueo ueoVar = (ueo) obj;
                ct ctVar = new ct(ueoVar, (Continuation) null, arrayList2, str2, 7);
                souVar.j = null;
                souVar.k = null;
                souVar.l = i3;
                souVar.m = i2;
                souVar.p = 2;
            }
        }
        souVar = new sou(this, cg6Var);
        Object obj2 = souVar.n;
        nm6 nm6Var2 = nm6.a;
        i = souVar.p;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        ct ctVar2 = new ct(ueoVar2, (Continuation) null, arrayList2, str2, 7);
        souVar.j = null;
        souVar.k = null;
        souVar.l = i3;
        souVar.m = i2;
        souVar.p = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (r0 != r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(nou nouVar, cg6 cg6Var) {
        tou touVar;
        nm6 nm6Var;
        int i;
        nou nouVar2;
        int i2;
        int i3;
        Object G;
        if (cg6Var instanceof tou) {
            touVar = (tou) cg6Var;
            int i4 = touVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                touVar.o = i4 - Integer.MIN_VALUE;
                Object obj = touVar.m;
                nm6Var = nm6.a;
                i = touVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = this.b.a();
                    nouVar2 = nouVar;
                    touVar.j = nouVar2;
                    touVar.k = 0;
                    touVar.l = 0;
                    touVar.o = 1;
                    obj = this.a.b(a, touVar);
                    if (obj != nm6Var) {
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = touVar.l;
                int i6 = touVar.k;
                nou nouVar3 = touVar.j;
                qgg.h0(obj);
                i2 = i5;
                nouVar2 = nouVar3;
                i3 = i6;
                lou C = ((UserDatabase) obj).C();
                mou mouVar = new mou(nouVar2.a, nouVar2.b, nouVar2.c, nouVar2.d, nouVar2.e.getTime(), nouVar2.f, nouVar2.g, nouVar2.h, nouVar2.i, nouVar2.j);
                touVar.j = null;
                touVar.k = i3;
                touVar.l = i2;
                touVar.o = 2;
                G = up6.G(C.a, false, true, new wes(18, C, mouVar), touVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        touVar = new tou(this, cg6Var);
        Object obj2 = touVar.m;
        nm6Var = nm6.a;
        i = touVar.o;
        if (i != 0) {
        }
        lou C2 = ((UserDatabase) obj2).C();
        mou mouVar2 = new mou(nouVar2.a, nouVar2.b, nouVar2.c, nouVar2.d, nouVar2.e.getTime(), nouVar2.f, nouVar2.g, nouVar2.h, nouVar2.i, nouVar2.j);
        touVar.j = null;
        touVar.k = i3;
        touVar.l = i2;
        touVar.o = 2;
        G = up6.G(C2.a, false, true, new wes(18, C2, mouVar2), touVar);
        if (G != nm6Var) {
        }
    }
}
