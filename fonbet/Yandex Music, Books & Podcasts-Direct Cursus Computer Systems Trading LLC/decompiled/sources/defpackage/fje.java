package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class fje extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ hje l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fje(hje hjeVar, int i, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.l = hjeVar;
        this.k = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fje(this.l, continuation, 0);
            case 1:
                return new fje(this.l, continuation, 1);
            case 2:
                return new fje(this.l, continuation, 2);
            case 3:
                return new fje(this.l, continuation, 3);
            default:
                return new fje(this.l, this.k, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fje) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Continuation continuation = null;
        hje hjeVar = this.l;
        int i2 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) hjeVar.g.get(hjeVar.e - 1);
                    d85 d85Var = new d85(hjeVar.b.e);
                    this.k = 1;
                    if (fk0.c(fk0Var, d85Var, null, null, this, 14) == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var2 = (fk0) hjeVar.g.get(hjeVar.e);
                    d85 d85Var2 = new d85(hjeVar.b.f);
                    this.k = 1;
                    if (fk0.c(fk0Var2, d85Var2, null, null, this, 14) == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var3 = (fk0) hjeVar.g.get(hjeVar.e + 1);
                    d85 d85Var3 = new d85(hjeVar.b.e);
                    this.k = 1;
                    if (fk0.c(fk0Var3, d85Var3, null, null, this, 14) == nm6Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var4 = (fk0) hjeVar.g.get(hjeVar.e);
                    d85 d85Var4 = new d85(hjeVar.b.f);
                    this.k = 1;
                    if (fk0.c(fk0Var4, d85Var4, null, null, this, 14) == nm6Var4) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                int i7 = this.k;
                m2k m2kVar = hjeVar.b;
                Function1 function1 = hjeVar.d;
                mm6 mm6Var = hjeVar.c;
                float f = m2kVar.i;
                IntRange intRange = hjeVar.f;
                int i8 = intRange.a;
                int i9 = intRange.b;
                if (i7 > i9 || i8 > i7) {
                    hjeVar.b(i7);
                } else {
                    int i10 = hjeVar.e;
                    int i11 = 3;
                    if (i7 > i10) {
                        int i12 = i10 + 1;
                        hjeVar.e = i12;
                        if (i12 == i9 && i12 != hjeVar.a - 1) {
                            IntRange intRange2 = hjeVar.f;
                            IntRange intRange3 = new IntRange(intRange2.a + 1, intRange2.b + 1, 1);
                            hjeVar.f = intRange3;
                            function1.invoke(intRange3);
                            hjeVar.c(-f);
                        }
                        x97.y(mm6Var, null, null, new fje(hjeVar, continuation, 0), 3);
                        x97.y(mm6Var, null, null, new fje(hjeVar, continuation, i2), 3);
                        hjeVar.d();
                    } else if (i7 < i10) {
                        if (i7 == 0) {
                            hjeVar.b(i7);
                        } else {
                            int i13 = i10 - 1;
                            hjeVar.e = i13;
                            if (i13 == i8 && i13 != 0) {
                                IntRange intRange4 = hjeVar.f;
                                IntRange intRange5 = new IntRange(intRange4.a - 1, intRange4.b - 1, 1);
                                hjeVar.f = intRange5;
                                function1.invoke(intRange5);
                                hjeVar.c(f);
                                hjeVar.d();
                            }
                            x97.y(mm6Var, null, null, new fje(hjeVar, continuation, 2), 3);
                            x97.y(mm6Var, null, null, new fje(hjeVar, continuation, i11), 3);
                            hjeVar.d();
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fje(hje hjeVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = hjeVar;
    }
}
