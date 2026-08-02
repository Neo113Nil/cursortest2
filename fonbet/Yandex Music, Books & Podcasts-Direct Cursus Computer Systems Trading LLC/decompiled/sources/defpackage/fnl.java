package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class fnl extends aur implements Function2 {
    public ArrayList j;
    public Collection k;
    public Iterator l;
    public vfg m;
    public int n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnl(ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.s = arrayList;
        this.t = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        fnl fnlVar = new fnl(this.s, this.t, continuation);
        fnlVar.r = obj;
        return fnlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fnl) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
    
        if (defpackage.saf.C(r11, r10) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ce -> B:6:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d1 -> B:6:0x00d2). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        Collection arrayList2;
        Iterator it;
        int i2;
        int i3;
        mm6 mm6Var = (mm6) this.r;
        nm6 nm6Var = nm6.a;
        int i4 = this.q;
        Continuation continuation = null;
        if (i4 == 0) {
            qgg.h0(obj);
            ArrayList<vfg> arrayList3 = this.s;
            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
            for (vfg vfgVar : arrayList3) {
                arrayList4.add(new Pair(vfgVar, x97.p(mm6Var, null, null, new g2l(vfgVar, continuation, 5), 3)));
            }
            rs rsVar = new rs(arrayList4, continuation, 6);
            this.r = null;
            this.j = arrayList4;
            this.q = 1;
            if (tyf.L(this.t, rsVar, this) != nm6Var) {
                arrayList = arrayList4;
            }
            return nm6Var;
        }
        if (i4 == 1) {
            arrayList = this.j;
            qgg.h0(obj);
        } else {
            if (i4 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.p;
            i = this.o;
            i3 = this.n;
            vfg vfgVar2 = this.m;
            it = this.l;
            arrayList2 = this.k;
            qgg.h0(obj);
            if (vfgVar2 != null) {
                arrayList2.add(vfgVar2);
            }
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                vfgVar2 = (vfg) pair.a;
                mu7 mu7Var = (mu7) pair.b;
                if (!mu7Var.b() && !mu7Var.isCancelled() && (mu7Var.o() instanceof d73)) {
                    vfgVar2 = null;
                }
                if (vfgVar2 != null) {
                    this.r = null;
                    this.j = null;
                    this.k = arrayList2;
                    this.l = it;
                    this.m = vfgVar2;
                    this.n = i3;
                    this.o = i;
                    this.p = i2;
                    this.q = 2;
                } else {
                    vfgVar2 = null;
                }
                if (vfgVar2 != null) {
                }
                if (it.hasNext()) {
                    return (List) arrayList2;
                }
            }
        }
        i = 0;
        arrayList2 = new ArrayList();
        it = arrayList.iterator();
        i2 = 0;
        i3 = 0;
        if (it.hasNext()) {
        }
    }
}
