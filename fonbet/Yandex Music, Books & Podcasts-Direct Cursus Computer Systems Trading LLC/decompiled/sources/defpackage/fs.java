package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class fs implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public fs(pyc pycVar) {
        this.a = 13;
        this.b = (aur) pycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Type inference failed for: r1v14, types: [aur, pyc] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b0 -> B:73:0x01b3). Please report as a decompilation issue!!! */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        qkc qkcVar;
        int i;
        int i2;
        rjc rjcVar2;
        int length;
        fs fsVar;
        switch (this.a) {
            case 0:
                Object collect = ((ds) this.b).collect(new dm(rjcVar, 1), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((ez) this.b).collect(new dm(rjcVar, 13), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((ez) this.b).collect(new dm(rjcVar, 15), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((ub7) this.b).collect(new dm(rjcVar, 23), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((ez) this.b).collect(new dm(rjcVar, 29), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((em) this.b).collect(new g62(rjcVar, 1), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((ss3) this.b).collect(new g62(rjcVar, 9), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((wz3) this.b).collect(new g62(rjcVar, 28), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((d64) this.b).collect(new l34(rjcVar, 20), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((z78) this.b).collect(new a56(rjcVar, 3), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((d64) this.b).collect(new a56(rjcVar, 10), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((bca) this.b).collect(new pja(rjcVar, 4), continuation);
                if (collect12 != nm6.a) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((ub7) this.b).collect(new pja(rjcVar, 7), continuation);
                if (collect13 != nm6.a) {
                    break;
                }
                break;
            case 13:
                j57 j57Var = new j57((pyc) this.b, rjcVar, (Continuation) null);
                tjc tjcVar = new tjc(continuation.getContext(), continuation, 0);
                Object l0 = swf.l0(tjcVar, true, tjcVar, j57Var);
                if (l0 != nm6.a) {
                    break;
                }
                break;
            case 14:
                if (continuation instanceof qkc) {
                    qkcVar = (qkc) continuation;
                    int i3 = qkcVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qkcVar.k = i3 - Integer.MIN_VALUE;
                        Object obj = qkcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = qkcVar.k;
                        if (i != 0) {
                            qgg.h0(obj);
                            i2 = 0;
                            rjcVar2 = rjcVar;
                            length = ((Object[]) this.b).length;
                            fsVar = this;
                            if (i2 < length) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            length = qkcVar.p;
                            i2 = qkcVar.o;
                            rjc rjcVar3 = qkcVar.n;
                            fsVar = qkcVar.m;
                            qgg.h0(obj);
                            rjcVar2 = rjcVar3;
                            i2++;
                            if (i2 < length) {
                                Object obj2 = ((Object[]) fsVar.b)[i2];
                                qkcVar.m = fsVar;
                                qkcVar.n = rjcVar2;
                                qkcVar.o = i2;
                                qkcVar.p = length;
                                qkcVar.k = 1;
                                if (rjcVar2.emit(obj2, qkcVar) == nm6Var) {
                                }
                                i2++;
                                if (i2 < length) {
                                    break;
                                }
                            }
                        }
                    }
                }
                qkcVar = new qkc(this, continuation);
                Object obj3 = qkcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = qkcVar.k;
                if (i != 0) {
                }
                break;
            case 15:
                Object emit = rjcVar.emit(this.b, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            case 16:
                Object collect14 = ((bca) this.b).collect(new orc(rjcVar, 0), continuation);
                if (collect14 != nm6.a) {
                    break;
                }
                break;
            case 17:
                Object collect15 = ((ifd) this.b).collect(new orc(rjcVar, 10), continuation);
                if (collect15 != nm6.a) {
                    break;
                }
                break;
            case 18:
                Object collect16 = ((ckc) this.b).collect(new orc(rjcVar, 18), continuation);
                if (collect16 != nm6.a) {
                    break;
                }
                break;
            case 19:
                Object collect17 = ((ub7) this.b).collect(new orc(rjcVar, 24), continuation);
                if (collect17 != nm6.a) {
                    break;
                }
                break;
            case 20:
                Object collect18 = ((ifd) this.b).collect(new orc(rjcVar, 27), continuation);
                if (collect18 != nm6.a) {
                    break;
                }
                break;
            case 21:
                Object collect19 = ((ifd) this.b).collect(new fgf(rjcVar, 20), continuation);
                if (collect19 != nm6.a) {
                    break;
                }
                break;
            case 22:
                Object collect20 = ((ub7) this.b).collect(new fgf(rjcVar, 23), continuation);
                if (collect20 != nm6.a) {
                    break;
                }
                break;
            case 23:
                dkn dknVar = (dkn) this.b;
                Object collect21 = dknVar.a.collect(new roh(rjcVar, 9), continuation);
                if (collect21 != nm6.a) {
                    break;
                }
                break;
            case 24:
                Object collect22 = ((njf) this.b).collect(new roh(rjcVar, 11), continuation);
                if (collect22 != nm6.a) {
                    break;
                }
                break;
            case 25:
                Object collect23 = ((cla) this.b).collect(new roh(rjcVar, 12), continuation);
                if (collect23 != nm6.a) {
                    break;
                }
                break;
            case 26:
                Object collect24 = ((fs) this.b).collect(new roh(rjcVar, 14), continuation);
                if (collect24 != nm6.a) {
                    break;
                }
                break;
            case 27:
                Object collect25 = ((clc) this.b).collect(new roh(rjcVar, 20), continuation);
                if (collect25 != nm6.a) {
                    break;
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Object collect26 = ((pf5) this.b).collect(new bgj(rjcVar, 17), continuation);
                if (collect26 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect27 = ((a1l) this.b).collect(new bgj(rjcVar, 25), continuation);
                if (collect27 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
