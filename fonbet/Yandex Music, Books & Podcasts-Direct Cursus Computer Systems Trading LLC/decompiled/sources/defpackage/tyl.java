package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class tyl extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public int m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyl(fvf fvfVar, int i, int i2, Continuation continuation, int i3) {
        super(2, continuation);
        this.j = i3;
        this.l = fvfVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new tyl((fvf) this.l, this.m, this.n, continuation, 0);
            case 1:
                return new tyl((fvf) this.l, this.m, this.n, continuation, 1);
            case 2:
                return new tyl((fvf) this.l, this.m, this.n, continuation, 2);
            default:
                return new tyl((g51) this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((tyl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093 A[LOOP:0: B:9:0x008d->B:11:0x0093, LOOP_END] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Iterator it;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    fvf fvfVar = (fvf) this.l;
                    int i4 = this.m;
                    int i5 = this.n;
                    b9r Q = weo.Q(0.0f, 400.0f, null, 5);
                    this.k = 1;
                    if (ivf.x(fvfVar, i4, i5, Q, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    fvf fvfVar2 = (fvf) this.l;
                    int i7 = this.m;
                    int i8 = this.n;
                    b9r Q2 = weo.Q(0.0f, 400.0f, null, 5);
                    this.k = 1;
                    if (ivf.x(fvfVar2, i7, i8, Q2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    fvf fvfVar3 = (fvf) this.l;
                    int i10 = this.m;
                    int i11 = this.n;
                    b9r Q3 = weo.Q(0.0f, 400.0f, null, 5);
                    this.k = 1;
                    if (ivf.x(fvfVar3, i10, i11, Q3, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var4 = nm6.a;
                int i12 = this.n;
                if (i12 == 0) {
                    qgg.h0(obj);
                    g51 g51Var = (g51) this.l;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    i5h i5hVar = (i5h) g51Var.b.getValue();
                    this.k = 0;
                    this.m = 0;
                    this.n = 1;
                    obj = i5hVar.b(str, this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                    i = 0;
                    i2 = 0;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(saf.m0((q51) it.next()));
                        }
                        return arrayList;
                    }
                    i = this.m;
                    i2 = this.k;
                    qgg.h0(obj);
                }
                lm1 B = ((MainDatabase) obj).B();
                this.k = i2;
                this.m = i;
                this.n = 2;
                obj = up6.G(B.a, true, false, new ci1(18), this);
                if (obj == nm6Var4) {
                    return nm6Var4;
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyl(g51 g51Var, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = g51Var;
    }
}
