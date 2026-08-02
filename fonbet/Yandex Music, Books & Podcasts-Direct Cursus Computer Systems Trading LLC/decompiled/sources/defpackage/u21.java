package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class u21 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u21(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0243, code lost:
    
        if (r4.collect(r7, r3) != r5) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        imc imcVar;
        int i;
        xqn i2;
        u21 u21Var;
        rjc rjcVar2 = rjcVar;
        int i3 = this.a;
        int i4 = 3;
        int i5 = 5;
        int i6 = 4;
        int i7 = 10;
        int i8 = 12;
        int i9 = 15;
        int i10 = 1;
        int i11 = 2;
        Continuation continuation2 = null;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                Object collect = ((bca) obj3).collect(new tl0(i10, rjcVar2, (x21) obj2, (jx7) obj), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((bca) obj3).collect(new tl0(i11, rjcVar2, (z51) obj2, (jx7) obj), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((pjc) obj3).collect(new tl0(i4, rjcVar2, (wn1) obj2, (tm1) obj), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((pjc) obj3).collect(new tl0(i6, rjcVar2, (uz1) obj2, (jyr) obj), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((cz) obj3).collect(new tl0(i5, rjcVar2, (rw2) obj2, (Context) obj), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((pjc) obj3).collect(new qa3(rjcVar2, (dn9) obj2, (oq) obj), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((yc4) obj3).collect(new tl0(6, rjcVar2, (dn9) obj2, (oq) obj), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((pjc) obj3).collect(new tl0(9, rjcVar2, (nc5) obj2, (x1u) obj), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((bca) obj3).collect(new tl0(i7, rjcVar2, (od5) obj2, (jx7) obj), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 9:
                if (continuation instanceof imc) {
                    imcVar = (imc) continuation;
                    int i12 = imcVar.k;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        imcVar.k = i12 - Integer.MIN_VALUE;
                        Object obj4 = imcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = imcVar.k;
                        if (i != 0) {
                            i2 = hrg.i(obj4);
                            i2.a = obj3;
                            imcVar.m = this;
                            imcVar.n = rjcVar2;
                            imcVar.o = i2;
                            imcVar.k = 1;
                            if (rjcVar2.emit(obj3, imcVar) != nm6Var) {
                                u21Var = this;
                            }
                            break;
                        } else if (i == 1) {
                            xqn xqnVar = imcVar.o;
                            rjc rjcVar3 = imcVar.n;
                            u21Var = imcVar.m;
                            qgg.h0(obj4);
                            i2 = xqnVar;
                            rjcVar2 = rjcVar3;
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                            break;
                        }
                        pjc pjcVar = (pjc) u21Var.d;
                        tl0 tl0Var = new tl0(20, i2, u21Var.c, rjcVar2);
                        imcVar.m = null;
                        imcVar.n = null;
                        imcVar.o = null;
                        imcVar.k = 2;
                        break;
                    }
                }
                imcVar = new imc(this, continuation);
                Object obj42 = imcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = imcVar.k;
                if (i != 0) {
                }
                pjc pjcVar2 = (pjc) u21Var.d;
                tl0 tl0Var2 = new tl0(20, i2, u21Var.c, rjcVar2);
                imcVar.m = null;
                imcVar.n = null;
                imcVar.o = null;
                imcVar.k = 2;
            case 10:
                Object y = tt0.y(rjcVar2, new l1((pyc) obj, continuation2, 25), continuation, wg.s, new pjc[]{(pjc) obj3, (pjc) obj2});
                if (y != nm6.a) {
                    break;
                }
                break;
            case 11:
                Object collect10 = ((bca) obj3).collect(new tl0(21, rjcVar2, (iz7) obj2, (med[]) obj), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            case 12:
                Object collect11 = ((dkn) obj3).a.collect(new tl0(25, rjcVar2, (Integer) obj2, (Integer) obj), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
            case 13:
                Object collect12 = ((u21) obj3).collect(new tl0(27, rjcVar2, (mqs) obj2, (fdj) obj), continuation);
                if (collect12 != nm6.a) {
                    break;
                }
                break;
            case 14:
                Object collect13 = ((u21) obj3).collect(new tl0(28, rjcVar2, (rjj) obj2, (xgd) obj), continuation);
                if (collect13 != nm6.a) {
                    break;
                }
                break;
            case 15:
                Object collect14 = ((pjc) obj3).collect(new hyl(i10, rjcVar2, (lkm) obj2, (String) obj), continuation);
                if (collect14 != nm6.a) {
                    break;
                }
                break;
            case 16:
                Object collect15 = ((eno) obj3).collect(new hyl(i11, rjcVar2, (x3n) obj2, (String) obj), continuation);
                if (collect15 != nm6.a) {
                    break;
                }
                break;
            case 17:
                Object collect16 = ((eno) obj3).collect(new hyl(i4, rjcVar2, (n3m) obj2, (String) obj), continuation);
                if (collect16 != nm6.a) {
                    break;
                }
                break;
            case 18:
                Object collect17 = ((kvh) obj3).collect(new hyl(i5, rjcVar2, (h9q) obj2, (xqn) obj), continuation);
                if (collect17 != nm6.a) {
                    break;
                }
                break;
            case 19:
                pjc[] pjcVarArr = (pjc[]) obj3;
                Object y2 = tt0.y(rjcVar2, new gv6(continuation2, (ArrayList) obj2, (Context) obj, i8), continuation, new tn1(pjcVarArr, 4), pjcVarArr);
                if (y2 != nm6.a) {
                    break;
                }
                break;
            case 20:
                Object collect18 = ((pjc) obj3).collect(new hyl(7, rjcVar2, (mbj) obj2, (yks) obj), continuation);
                if (collect18 != nm6.a) {
                    break;
                }
                break;
            case 21:
                Object collect19 = ((pjc) obj3).collect(new jqp(rjcVar2, (b5t) obj2, (ybb) obj), continuation);
                if (collect19 != nm6.a) {
                    break;
                }
                break;
            case 22:
                Object collect20 = ((pjc) obj3).collect(new hyl(i7, rjcVar2, (t1w) obj2, (Map) obj), continuation);
                if (collect20 != nm6.a) {
                    break;
                }
                break;
            case 23:
                Object collect21 = ((clc) obj3).collect(new hyl(i8, rjcVar2, (ccw) obj2, (AtomicBoolean) obj), continuation);
                if (collect21 != nm6.a) {
                    break;
                }
                break;
            case 24:
                Object collect22 = ((pjc) obj3).collect(new hyl(14, rjcVar2, (anw) obj2, (pqw) obj), continuation);
                if (collect22 != nm6.a) {
                    break;
                }
                break;
            case 25:
                Object collect23 = ((l8v) obj3).collect(new azu(i9, rjcVar2, (hnw) obj2, (sqw) obj), continuation);
                if (collect23 != nm6.a) {
                    break;
                }
                break;
            case 26:
                Object collect24 = ((pjc) obj3).collect(new hyl(i9, rjcVar2, (hnw) obj2, (pqw) obj), continuation);
                if (collect24 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect25 = ((h7a) obj3).collect(new hyl(16, rjcVar2, (daq) obj2, (StationId) obj), continuation);
                if (collect25 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
