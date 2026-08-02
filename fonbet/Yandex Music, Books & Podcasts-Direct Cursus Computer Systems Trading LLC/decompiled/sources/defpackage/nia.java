package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class nia extends aur implements Function2 {
    public final /* synthetic */ int j;
    public Object[] k;
    public Object[] l;
    public int m;
    public int n;
    public final /* synthetic */ wia o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nia(wia wiaVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.o = wiaVar;
        this.p = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nia(this.o, this.p, continuation, 0);
            case 1:
                return new nia(this.o, this.p, continuation, 1);
            default:
                return new nia(this.o, this.p, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nia) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        int i;
        Object d;
        Object[] objArr2;
        Object k;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        Object m;
        Object[] objArr5;
        Object z;
        int i3;
        Object[] objArr6;
        Object k2;
        Object[] objArr7;
        Object[] objArr8;
        int i4;
        Object C;
        Object[] objArr9;
        Object k3;
        Object[] objArr10;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i5 = this.n;
                int i6 = this.p;
                wia wiaVar = this.o;
                int i7 = 1;
                if (i5 == 0) {
                    qgg.h0(obj);
                    objArr = new List[2];
                    yx4 e = wiaVar.e();
                    Integer num = new Integer(i6);
                    this.k = objArr;
                    this.l = objArr;
                    i = 0;
                    this.m = 0;
                    this.n = 1;
                    d = e.d(num, this);
                    if (d == obj2) {
                        return obj2;
                    }
                    objArr2 = objArr;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i7 = this.m;
                        Object[] objArr11 = (List[]) this.l;
                        Object[] objArr12 = (List[]) this.k;
                        qgg.h0(obj);
                        objArr = objArr12;
                        k = obj;
                        objArr3 = objArr11;
                        objArr3[i7] = k;
                        return v75.p(u75.h(objArr));
                    }
                    int i8 = this.m;
                    Object[] objArr13 = (List[]) this.l;
                    Object[] objArr14 = (List[]) this.k;
                    qgg.h0(obj);
                    objArr2 = objArr13;
                    objArr = objArr14;
                    i = i8;
                    d = obj;
                }
                objArr2[i] = d;
                yx4 e2 = wiaVar.e();
                Integer num2 = new Integer(i6);
                this.k = objArr;
                this.l = objArr;
                this.m = 1;
                this.n = 2;
                e2.getClass();
                List list = dw.MyMusicBooks.a;
                k = e2.k(vz1.k(list, list), Boolean.FALSE, num2, this);
                if (k == obj2) {
                    return obj2;
                }
                objArr3 = objArr;
                objArr3[i7] = k;
                return v75.p(u75.h(objArr));
            case 1:
                Object obj3 = nm6.a;
                int i9 = this.n;
                int i10 = this.p;
                wia wiaVar2 = this.o;
                int i11 = 2;
                if (i9 == 0) {
                    qgg.h0(obj);
                    objArr4 = new List[3];
                    yx4 e3 = wiaVar2.e();
                    Integer num3 = new Integer(i10);
                    this.k = objArr4;
                    this.l = objArr4;
                    i2 = 0;
                    this.m = 0;
                    this.n = 1;
                    e3.getClass();
                    Boolean bool = Boolean.TRUE;
                    m = yx4.m(e3, null, bool, num3, bool, this, 17);
                    if (m == obj3) {
                        return obj3;
                    }
                    objArr5 = objArr4;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i11 = this.m;
                            Object[] objArr15 = (List[]) this.l;
                            Object[] objArr16 = (List[]) this.k;
                            qgg.h0(obj);
                            objArr4 = objArr16;
                            k2 = obj;
                            objArr7 = objArr15;
                            objArr7[i11] = k2;
                            return v75.p(u75.h(objArr4));
                        }
                        int i12 = this.m;
                        Object[] objArr17 = (List[]) this.l;
                        objArr4 = (List[]) this.k;
                        qgg.h0(obj);
                        i3 = i12;
                        objArr6 = objArr17;
                        z = obj;
                        objArr6[i3] = z;
                        yx4 e4 = wiaVar2.e();
                        Integer num4 = new Integer(i10);
                        this.k = objArr4;
                        this.l = objArr4;
                        this.m = 2;
                        this.n = 3;
                        k2 = e4.k(null, Boolean.TRUE, num4, this);
                        if (k2 != obj3) {
                            return obj3;
                        }
                        objArr7 = objArr4;
                        objArr7[i11] = k2;
                        return v75.p(u75.h(objArr4));
                    }
                    i2 = this.m;
                    Object[] objArr18 = (List[]) this.l;
                    Object[] objArr19 = (List[]) this.k;
                    qgg.h0(obj);
                    objArr5 = objArr18;
                    objArr4 = objArr19;
                    m = obj;
                }
                objArr5[i2] = m;
                yx4 e5 = wiaVar2.e();
                Boolean bool2 = Boolean.TRUE;
                Integer num5 = new Integer(i10);
                this.k = objArr4;
                this.l = objArr4;
                this.m = 1;
                this.n = 2;
                z = e5.z(null, null, bool2, num5, this);
                if (z == obj3) {
                    return obj3;
                }
                i3 = 1;
                objArr6 = objArr4;
                objArr6[i3] = z;
                yx4 e42 = wiaVar2.e();
                Integer num42 = new Integer(i10);
                this.k = objArr4;
                this.l = objArr4;
                this.m = 2;
                this.n = 3;
                k2 = e42.k(null, Boolean.TRUE, num42, this);
                if (k2 != obj3) {
                }
            default:
                Object obj4 = nm6.a;
                int i13 = this.n;
                int i14 = this.p;
                wia wiaVar3 = this.o;
                int i15 = 1;
                if (i13 == 0) {
                    qgg.h0(obj);
                    objArr8 = new List[2];
                    yx4 e6 = wiaVar3.e();
                    Integer num6 = new Integer(i14);
                    this.k = objArr8;
                    this.l = objArr8;
                    i4 = 0;
                    this.m = 0;
                    this.n = 1;
                    C = e6.C(num6, this);
                    if (C == obj4) {
                        return obj4;
                    }
                    objArr9 = objArr8;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i15 = this.m;
                        Object[] objArr20 = (List[]) this.l;
                        Object[] objArr21 = (List[]) this.k;
                        qgg.h0(obj);
                        objArr8 = objArr21;
                        k3 = obj;
                        objArr10 = objArr20;
                        objArr10[i15] = k3;
                        return v75.p(u75.h(objArr8));
                    }
                    int i16 = this.m;
                    Object[] objArr22 = (List[]) this.l;
                    Object[] objArr23 = (List[]) this.k;
                    qgg.h0(obj);
                    objArr9 = objArr22;
                    objArr8 = objArr23;
                    i4 = i16;
                    C = obj;
                }
                objArr9[i4] = C;
                yx4 e7 = wiaVar3.e();
                Integer num7 = new Integer(i14);
                this.k = objArr8;
                this.l = objArr8;
                this.m = 1;
                this.n = 2;
                e7.getClass();
                List list2 = dw.MyMusicPodcasts.a;
                k3 = e7.k(vz1.k(list2, list2), Boolean.FALSE, num7, this);
                if (k3 == obj4) {
                    return obj4;
                }
                objArr10 = objArr8;
                objArr10[i15] = k3;
                return v75.p(u75.h(objArr8));
        }
    }
}
