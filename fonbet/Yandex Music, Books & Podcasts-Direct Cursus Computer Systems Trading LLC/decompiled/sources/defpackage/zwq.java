package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class zwq extends h7o implements Function2 {
    public Object k;
    public Iterator l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Iterator s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwq(int i, int i2, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.q = i;
        this.r = i2;
        this.s = it;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        zwq zwqVar = new zwq(this.q, this.r, this.s, continuation);
        zwqVar.p = obj;
        return zwqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zwq) create((ygp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b2  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        tdo tdoVar;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        int i6;
        tdo tdoVar2;
        boolean z;
        ygp ygpVar = (ygp) this.p;
        nm6 nm6Var = nm6.a;
        int i7 = this.o;
        int i8 = this.r;
        boolean z2 = true;
        int i9 = this.q;
        if (i7 == 0) {
            qgg.h0(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it3 = this.s;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                tdo tdoVar3 = new tdo(0, new Object[i10]);
                i2 = i10;
                i3 = i;
                it = it3;
                tdoVar = tdoVar3;
                while (true) {
                    int i11 = tdoVar.c;
                    Object[] objArr = tdoVar.b;
                    if (it.hasNext()) {
                    }
                    z2 = z;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.n;
                i2 = this.m;
                it = this.l;
                tdoVar = (tdo) this.k;
                qgg.h0(obj);
                tdoVar.a(i8);
                while (true) {
                    int i112 = tdoVar.c;
                    Object[] objArr2 = tdoVar.b;
                    if (it.hasNext()) {
                        i6 = i2;
                        tdoVar2 = tdoVar;
                        break;
                    }
                    Object next = it.next();
                    z = z2;
                    if (tdoVar.f() == i112) {
                        xq0.q("ring buffer is full");
                        return null;
                    }
                    int i12 = tdoVar.d;
                    int i13 = tdoVar.e;
                    objArr2[(i12 + i13) % i112] = next;
                    tdoVar.e = i13 + 1;
                    if (tdoVar.f() == i112) {
                        if (tdoVar.e >= i9) {
                            ArrayList arrayList2 = new ArrayList(tdoVar);
                            this.p = ygpVar;
                            this.k = tdoVar;
                            this.l = it;
                            this.m = i2;
                            this.n = i3;
                            this.o = 3;
                            ygpVar.a(arrayList2, this);
                            nm6 nm6Var2 = nm6.a;
                            return nm6Var;
                        }
                        int i14 = i112 + (i112 >> 1) + 1;
                        if (i14 > i9) {
                            i14 = i9;
                        }
                        tdoVar = new tdo(tdoVar.e, tdoVar.d == 0 ? Arrays.copyOf(objArr2, i14) : tdoVar.toArray(new Object[i14]));
                    }
                    z2 = z;
                }
            } else if (i7 == 4) {
                i3 = this.n;
                i6 = this.m;
                tdoVar2 = (tdo) this.k;
                qgg.h0(obj);
                tdoVar2.a(i8);
                if (tdoVar2.e > i8) {
                    ArrayList arrayList3 = new ArrayList(tdoVar2);
                    this.p = ygpVar;
                    this.k = tdoVar2;
                    this.l = null;
                    this.m = i6;
                    this.n = i3;
                    this.o = 4;
                    ygpVar.a(arrayList3, this);
                    nm6 nm6Var3 = nm6.a;
                    return nm6Var;
                }
                if (!tdoVar2.isEmpty()) {
                    this.p = null;
                    this.k = null;
                    this.l = null;
                    this.m = i6;
                    this.n = i3;
                    this.o = 5;
                    ygpVar.a(tdoVar2, this);
                    nm6 nm6Var4 = nm6.a;
                    return nm6Var;
                }
            } else {
                if (i7 != 5) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            qgg.h0(obj);
        } else {
            i5 = this.n;
            i4 = this.m;
            it2 = this.l;
            qgg.h0(obj);
            arrayList = new ArrayList(i9);
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.p = ygpVar;
                        this.k = arrayList;
                        this.l = it2;
                        this.m = i4;
                        this.n = i;
                        this.o = 1;
                        ygpVar.a(arrayList, this);
                        nm6 nm6Var5 = nm6.a;
                        return nm6Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.p = null;
                this.k = null;
                this.l = null;
                this.m = i4;
                this.n = i;
                this.o = 2;
                ygpVar.a(arrayList, this);
                nm6 nm6Var6 = nm6.a;
                return nm6Var;
            }
        }
        return Unit.a;
    }
}
