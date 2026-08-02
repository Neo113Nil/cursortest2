package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class e3u extends aur implements Function2 {
    public ArrayList j;
    public Object k;
    public Object l;
    public String m;
    public String n;
    public Object o;
    public List p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ f3u t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3u(f3u f3uVar, Continuation continuation) {
        super(2, continuation);
        this.t = f3uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e3u e3uVar = new e3u(this.t, continuation);
        e3uVar.s = obj;
        return e3uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e3u) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        if (r5 == r4) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object c;
        Object a;
        jzb jzbVar;
        ArrayList arrayList2;
        long j;
        String str;
        String str2;
        rj6 rj6Var;
        Object obj2;
        Object a2;
        ArrayList arrayList3;
        long j2;
        String str3;
        jzb jzbVar2;
        String str4;
        f3u f3uVar = this.t;
        xpi xpiVar = f3uVar.n;
        x1u x1uVar = f3uVar.k;
        nm6 nm6Var = nm6.a;
        int i = this.r;
        if (i == 0) {
            qgg.h0(obj);
            n8g I = xp3.I(x1uVar.h);
            arrayList = new ArrayList(v75.o(I, 10));
            ListIterator listIterator = I.listIterator(0);
            while (true) {
                ezd ezdVar = (ezd) listIterator;
                if (!ezdVar.hasNext()) {
                    break;
                }
                c01 c01Var = (c01) ezdVar.next();
                arrayList.add(new r91(new q91(c01Var.b, vz1.w(c01Var.q.a), false), ghh.P(c01Var)));
            }
            String str5 = (String) CollectionsKt.firstOrNull(x1uVar.g);
            if (str5 == null) {
                String w = vz1.w(x1uVar.o.a);
                String str6 = x1uVar.b;
                jzb jzbVar3 = x1uVar.n;
                long j3 = x1uVar.f;
                this.s = null;
                this.j = null;
                this.k = arrayList;
                this.l = jzbVar3;
                this.m = str6;
                this.n = w;
                this.o = xpiVar;
                this.q = j3;
                this.r = 1;
                a = f3u.a(f3uVar, this);
                if (a != nm6Var) {
                    jzbVar = jzbVar3;
                    arrayList2 = arrayList;
                    j = j3;
                    str = w;
                    str2 = str6;
                    a3u a3uVar = new a3u(str, str2, jzbVar, j, arrayList2, (List) a, null);
                    xdr xdrVar = (xdr) xpiVar;
                    xdrVar.getClass();
                    xdrVar.m(null, a3uVar);
                    return Unit.a;
                }
            } else {
                l0t l0tVar = f3uVar.m;
                psd psdVar = new psd(2);
                psdVar.b = "VideoClipBottomSheetViewModel";
                psdVar.a("Loading full data for track");
                this.s = null;
                this.j = arrayList;
                this.r = 2;
                c = l0tVar.c(str5, psdVar, this);
            }
            return nm6Var;
        }
        if (i == 1) {
            long j4 = this.q;
            xpi xpiVar2 = (bqi) this.o;
            String str7 = this.n;
            String str8 = this.m;
            jzb jzbVar4 = (jzb) this.l;
            ?? r7 = (List) this.k;
            qgg.h0(obj);
            j = j4;
            xpiVar = xpiVar2;
            str = str7;
            str2 = str8;
            jzbVar = jzbVar4;
            arrayList2 = r7;
            a = obj;
            a3u a3uVar2 = new a3u(str, str2, jzbVar, j, arrayList2, (List) a, null);
            xdr xdrVar2 = (xdr) xpiVar;
            xdrVar2.getClass();
            xdrVar2.m(null, a3uVar2);
            return Unit.a;
        }
        if (i != 2) {
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = this.q;
            List list = this.p;
            jzb jzbVar5 = (jzb) this.o;
            String str9 = this.n;
            String str10 = this.m;
            xpi xpiVar3 = (bqi) this.l;
            rj6Var = (rj6) this.k;
            qgg.h0(obj);
            j2 = j5;
            arrayList3 = list;
            jzbVar2 = jzbVar5;
            str3 = str9;
            str4 = str10;
            xpiVar = xpiVar3;
            a2 = obj;
            obj2 = new a3u(str4, str3, jzbVar2, j2, arrayList3, (List) a2, (mqs) ((qj6) rj6Var).a);
            xdr xdrVar3 = (xdr) xpiVar;
            xdrVar3.getClass();
            xdrVar3.m(null, obj2);
            return Unit.a;
        }
        ArrayList arrayList4 = this.j;
        qgg.h0(obj);
        arrayList = arrayList4;
        c = obj;
        rj6Var = (rj6) c;
        if (!(rj6Var instanceof qj6)) {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            obj2 = z2u.a;
            xdr xdrVar32 = (xdr) xpiVar;
            xdrVar32.getClass();
            xdrVar32.m(null, obj2);
            return Unit.a;
        }
        String w2 = vz1.w(x1uVar.o.a);
        String str11 = x1uVar.b;
        jzb jzbVar6 = x1uVar.n;
        long j6 = x1uVar.f;
        this.s = null;
        this.j = null;
        this.k = rj6Var;
        this.l = xpiVar;
        this.m = w2;
        this.n = str11;
        this.o = jzbVar6;
        this.p = arrayList;
        this.q = j6;
        this.r = 3;
        a2 = f3u.a(f3uVar, this);
        if (a2 != nm6Var) {
            arrayList3 = arrayList;
            j2 = j6;
            str3 = str11;
            jzbVar2 = jzbVar6;
            str4 = w2;
            obj2 = new a3u(str4, str3, jzbVar2, j2, arrayList3, (List) a2, (mqs) ((qj6) rj6Var).a);
            xdr xdrVar322 = (xdr) xpiVar;
            xdrVar322.getClass();
            xdrVar322.m(null, obj2);
            return Unit.a;
        }
        return nm6Var;
    }
}
