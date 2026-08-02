package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z6l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7l b;

    public /* synthetic */ z6l(f7l f7lVar, int i) {
        this.a = i;
        this.b = f7lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[Catch: CancellationException -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:39:0x008a, B:43:0x0095, B:44:0x0186, B:48:0x00a0, B:49:0x0155, B:54:0x00a9, B:55:0x00f6, B:57:0x012f, B:63:0x00b1, B:64:0x0119, B:66:0x0120, B:67:0x0125, B:69:0x00b8, B:71:0x00c0, B:76:0x00d1, B:77:0x00dd, B:78:0x00e2, B:79:0x00e3, B:84:0x00fd, B:89:0x016d, B:91:0x0175, B:96:0x0197, B:97:0x019c), top: B:35:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120 A[Catch: CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:39:0x008a, B:43:0x0095, B:44:0x0186, B:48:0x00a0, B:49:0x0155, B:54:0x00a9, B:55:0x00f6, B:57:0x012f, B:63:0x00b1, B:64:0x0119, B:66:0x0120, B:67:0x0125, B:69:0x00b8, B:71:0x00c0, B:76:0x00d1, B:77:0x00dd, B:78:0x00e2, B:79:0x00e3, B:84:0x00fd, B:89:0x016d, B:91:0x0175, B:96:0x0197, B:97:0x019c), top: B:35:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125 A[Catch: CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:39:0x008a, B:43:0x0095, B:44:0x0186, B:48:0x00a0, B:49:0x0155, B:54:0x00a9, B:55:0x00f6, B:57:0x012f, B:63:0x00b1, B:64:0x0119, B:66:0x0120, B:67:0x0125, B:69:0x00b8, B:71:0x00c0, B:76:0x00d1, B:77:0x00dd, B:78:0x00e2, B:79:0x00e3, B:84:0x00fd, B:89:0x016d, B:91:0x0175, B:96:0x0197, B:97:0x019c), top: B:35:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        y6l y6lVar;
        y6l y6lVar2;
        kal kalVar;
        int i;
        int i2;
        long e;
        n7q n7qVar;
        boolean z;
        boolean z2;
        hln hlnVar;
        long j;
        kal kalVar2;
        h4q f;
        e7l e7lVar;
        int i3;
        switch (this.a) {
            case 0:
                uol uolVar = this.b.b;
                try {
                    if (continuation instanceof y6l) {
                        y6lVar = (y6l) continuation;
                        int i4 = y6lVar.k;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            y6lVar.k = i4 - Integer.MIN_VALUE;
                            y6lVar2 = y6lVar;
                            Object obj2 = y6lVar2.j;
                            nm6 nm6Var = nm6.a;
                            switch (y6lVar2.k) {
                                case 0:
                                    qgg.h0(obj2);
                                    kalVar = (kal) obj;
                                    if (!(kalVar instanceof ial)) {
                                        if (!Intrinsics.d(kalVar, jal.a)) {
                                            throw new x7j();
                                        }
                                        zol zolVar = zol.a;
                                        y6lVar2.m = null;
                                        y6lVar2.n = 0;
                                        y6lVar2.k = 5;
                                        if (uolVar.o(zolVar, y6lVar2) == nm6Var) {
                                            return nm6Var;
                                        }
                                        i = 0;
                                        y6lVar2.m = null;
                                        y6lVar2.n = i;
                                        y6lVar2.k = 6;
                                        if (uolVar.i(y6lVar2) == nm6Var) {
                                            return nm6Var;
                                        }
                                        return Unit.a;
                                    }
                                    int ordinal = ((ial) kalVar).c.ordinal();
                                    if (ordinal == 0) {
                                        lpl R = pcg.R(((ial) kalVar).a.c());
                                        y6lVar2.m = kalVar;
                                        y6lVar2.n = 0;
                                        y6lVar2.k = 1;
                                        if (uolVar.o(R, y6lVar2) == nm6Var) {
                                            return nm6Var;
                                        }
                                        i2 = 0;
                                        Long l = ((ial) kalVar).e;
                                        e = l == null ? l.longValue() : ((ial) kalVar).a.e();
                                        kal kalVar3 = kalVar;
                                        n7qVar = ((ial) kalVar3).a;
                                        z = ((ial) kalVar3).b;
                                        z2 = ((ial) kalVar3).d;
                                        hlnVar = ((ial) kalVar3).c;
                                        y6lVar2.m = kalVar3;
                                        y6lVar2.n = i2;
                                        y6lVar2.o = e;
                                        y6lVar2.k = 3;
                                        if (uolVar.h(n7qVar, e, z, z2, hlnVar, y6lVar2) == nm6Var) {
                                        }
                                    } else {
                                        if (ordinal != 1) {
                                            if (ordinal != 2) {
                                                throw new x7j();
                                            }
                                            e = ((ial) kalVar).a.e();
                                            i2 = 0;
                                            kal kalVar32 = kalVar;
                                            n7qVar = ((ial) kalVar32).a;
                                            z = ((ial) kalVar32).b;
                                            z2 = ((ial) kalVar32).d;
                                            hlnVar = ((ial) kalVar32).c;
                                            y6lVar2.m = kalVar32;
                                            y6lVar2.n = i2;
                                            y6lVar2.o = e;
                                            y6lVar2.k = 3;
                                            if (uolVar.h(n7qVar, e, z, z2, hlnVar, y6lVar2) == nm6Var) {
                                                return nm6Var;
                                            }
                                            j = e;
                                            kalVar2 = kalVar32;
                                            f = ((ial) kalVar2).a.f();
                                            y6lVar2.m = null;
                                            y6lVar2.n = i2;
                                            y6lVar2.o = j;
                                            y6lVar2.k = 4;
                                            if (uolVar.m(f, y6lVar2) == nm6Var) {
                                                return nm6Var;
                                            }
                                            return Unit.a;
                                        }
                                        yol yolVar = yol.a;
                                        y6lVar2.m = kalVar;
                                        y6lVar2.n = 0;
                                        y6lVar2.k = 2;
                                        Object o = uolVar.o(yolVar, y6lVar2);
                                        if (o == nm6Var) {
                                            return nm6Var;
                                        }
                                        obj2 = o;
                                        i2 = 0;
                                        e = ((Number) obj2).longValue();
                                        kal kalVar322 = kalVar;
                                        n7qVar = ((ial) kalVar322).a;
                                        z = ((ial) kalVar322).b;
                                        z2 = ((ial) kalVar322).d;
                                        hlnVar = ((ial) kalVar322).c;
                                        y6lVar2.m = kalVar322;
                                        y6lVar2.n = i2;
                                        y6lVar2.o = e;
                                        y6lVar2.k = 3;
                                        if (uolVar.h(n7qVar, e, z, z2, hlnVar, y6lVar2) == nm6Var) {
                                        }
                                    }
                                case 1:
                                    i2 = y6lVar2.n;
                                    kalVar = y6lVar2.m;
                                    qgg.h0(obj2);
                                    Long l2 = ((ial) kalVar).e;
                                    if (l2 == null) {
                                    }
                                    kal kalVar3222 = kalVar;
                                    n7qVar = ((ial) kalVar3222).a;
                                    z = ((ial) kalVar3222).b;
                                    z2 = ((ial) kalVar3222).d;
                                    hlnVar = ((ial) kalVar3222).c;
                                    y6lVar2.m = kalVar3222;
                                    y6lVar2.n = i2;
                                    y6lVar2.o = e;
                                    y6lVar2.k = 3;
                                    if (uolVar.h(n7qVar, e, z, z2, hlnVar, y6lVar2) == nm6Var) {
                                    }
                                    break;
                                case 2:
                                    i2 = y6lVar2.n;
                                    kalVar = y6lVar2.m;
                                    qgg.h0(obj2);
                                    e = ((Number) obj2).longValue();
                                    kal kalVar32222 = kalVar;
                                    n7qVar = ((ial) kalVar32222).a;
                                    z = ((ial) kalVar32222).b;
                                    z2 = ((ial) kalVar32222).d;
                                    hlnVar = ((ial) kalVar32222).c;
                                    y6lVar2.m = kalVar32222;
                                    y6lVar2.n = i2;
                                    y6lVar2.o = e;
                                    y6lVar2.k = 3;
                                    if (uolVar.h(n7qVar, e, z, z2, hlnVar, y6lVar2) == nm6Var) {
                                    }
                                    break;
                                case 3:
                                    j = y6lVar2.o;
                                    i2 = y6lVar2.n;
                                    kalVar2 = y6lVar2.m;
                                    qgg.h0(obj2);
                                    f = ((ial) kalVar2).a.f();
                                    y6lVar2.m = null;
                                    y6lVar2.n = i2;
                                    y6lVar2.o = j;
                                    y6lVar2.k = 4;
                                    if (uolVar.m(f, y6lVar2) == nm6Var) {
                                    }
                                    return Unit.a;
                                case 4:
                                case 6:
                                    qgg.h0(obj2);
                                    return Unit.a;
                                case 5:
                                    i = y6lVar2.n;
                                    qgg.h0(obj2);
                                    y6lVar2.m = null;
                                    y6lVar2.n = i;
                                    y6lVar2.k = 6;
                                    if (uolVar.i(y6lVar2) == nm6Var) {
                                    }
                                    return Unit.a;
                                default:
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                            }
                        }
                    }
                    switch (y6lVar2.k) {
                    }
                } catch (CancellationException e2) {
                    CancellationException c = n7w.c("Unexpected cancellation exception in flow collector", e2);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c));
                    throw c;
                }
                y6lVar = new y6l(this, continuation);
                y6lVar2 = y6lVar;
                Object obj22 = y6lVar2.j;
                nm6 nm6Var2 = nm6.a;
            default:
                try {
                    if (continuation instanceof e7l) {
                        e7lVar = (e7l) continuation;
                        int i5 = e7lVar.k;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            e7lVar.k = i5 - Integer.MIN_VALUE;
                            Object obj3 = e7lVar.j;
                            nm6 nm6Var3 = nm6.a;
                            i3 = e7lVar.k;
                            if (i3 != 0) {
                                qgg.h0(obj3);
                                f7l f7lVar = this.b;
                                e7lVar.k = 1;
                                if (f7lVar.a(e7lVar) == nm6Var3) {
                                    return nm6Var3;
                                }
                            } else {
                                if (i3 != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj3);
                            }
                            return Unit.a;
                        }
                    }
                    if (i3 != 0) {
                    }
                    return Unit.a;
                } catch (CancellationException e3) {
                    CancellationException c2 = n7w.c("Unexpected cancellation exception in flow collector", e3);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c2));
                    throw c2;
                }
                e7lVar = new e7l(this, continuation);
                Object obj32 = e7lVar.j;
                nm6 nm6Var32 = nm6.a;
                i3 = e7lVar.k;
        }
    }
}
