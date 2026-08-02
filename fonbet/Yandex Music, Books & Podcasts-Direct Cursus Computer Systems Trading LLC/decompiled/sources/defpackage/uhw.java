package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class uhw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ xhw c;

    public /* synthetic */ uhw(rjc rjcVar, xhw xhwVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = xhwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        thw thwVar;
        int i;
        vhw vhwVar;
        int i2;
        whw whwVar;
        int i3;
        int i4 = this.a;
        xhw xhwVar = this.c;
        rjc rjcVar = this.b;
        switch (i4) {
            case 0:
                if (continuation instanceof thw) {
                    thwVar = (thw) continuation;
                    int i5 = thwVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        thwVar.k = i5 - Integer.MIN_VALUE;
                        Object obj2 = thwVar.j;
                        nm6 nm6Var = nm6.a;
                        i = thwVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            a0 L = uwf.L((a0) obj, xhwVar.b);
                            thwVar.k = 1;
                            if (rjcVar.emit(L, thwVar) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                thwVar = new thw(this, continuation);
                Object obj22 = thwVar.j;
                nm6 nm6Var2 = nm6.a;
                i = thwVar.k;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof vhw) {
                    vhwVar = (vhw) continuation;
                    int i6 = vhwVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        vhwVar.k = i6 - Integer.MIN_VALUE;
                        Object obj3 = vhwVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = vhwVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            double doubleValue = ((Number) obj).doubleValue();
                            String str = xhw.w;
                            String f = xhwVar.f();
                            s0 r = rwd.r(xhwVar.f(), 6, 0L);
                            k18 k = d.k();
                            k.h(doubleValue);
                            k.d();
                            d.f((d) k.b, r);
                            kot kotVar = new kot(f, (d) k.b());
                            vhwVar.k = 1;
                            if (rjcVar.emit(kotVar, vhwVar) == nm6Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                vhwVar = new vhw(this, continuation);
                Object obj32 = vhwVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = vhwVar.k;
                if (i2 != 0) {
                }
            default:
                if (continuation instanceof whw) {
                    whwVar = (whw) continuation;
                    int i7 = whwVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        whwVar.k = i7 - Integer.MIN_VALUE;
                        Object obj4 = whwVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = whwVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            orw orwVar = (orw) obj;
                            orwVar.getClass();
                            e0 e0Var = orwVar.a;
                            e0Var.getClass();
                            String str2 = xhw.w;
                            b5n s = e0.s(e0Var);
                            a0 h = s.h();
                            h.getClass();
                            a0 L2 = uwf.L(h, xhwVar.b);
                            if (L2 == null) {
                                L2 = s.h();
                            }
                            s.i(L2);
                            orw orwVar2 = new orw((e0) s.b(), orwVar.b);
                            whwVar.k = 1;
                            if (rjcVar.emit(orwVar2, whwVar) == nm6Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                whwVar = new whw(this, continuation);
                Object obj42 = whwVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = whwVar.k;
                if (i3 != 0) {
                }
        }
        return Unit.a;
    }
}
