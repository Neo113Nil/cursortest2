package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class hvd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ivd l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvd(ivd ivdVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ivdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hvd(this.l, continuation, 0);
            case 1:
                return new hvd(this.l, continuation, 1);
            case 2:
                return new hvd(this.l, continuation, 2);
            default:
                return new hvd(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((hvd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (defpackage.fk0.c(r8, r9, r10, null, r14, 12) == r0) goto L32;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.j;
        int i2 = 2;
        int i3 = 0;
        ivd ivdVar = this.l;
        int i4 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    boolean z = ivdVar.f;
                    this.k = 1;
                    Object Q = gld.Q(new ak1(ivdVar, z, (Continuation) null), this);
                    if (Q != obj2) {
                        Q = Unit.a;
                    }
                    if (Q == obj2) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    clc clcVar = new clc(ivdVar.h, new jud(i2, i4, continuation));
                    hvd hvdVar = new hvd(ivdVar, continuation, i3);
                    this.k = 1;
                    if (zsd.O(clcVar, hvdVar, this) == nm6Var) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    String str = ivdVar.a;
                    pce pceVar = new pce(ivdVar.d);
                    pceVar.c = str;
                    pceVar.e(lmq.c);
                    pceVar.j = xee.L(xz0.X(new e7t[]{new g3r(true)}));
                    rce a = pceVar.a();
                    cce cceVar = ivdVar.e;
                    this.k = 1;
                    obj = cceVar.a(a, this);
                    if (obj == nm6Var2) {
                        break;
                    }
                } else if (i7 == 1) {
                    qgg.h0(obj);
                } else if (i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                sce sceVar = (sce) obj;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        j = c3x.f(bitmap.getPixel(0, 0));
                    } else {
                        su4.s(2, null, tlm.j("Unexpected cover type ", drawable.getClass()), null);
                        j = ivdVar.c;
                    }
                    ivdVar.l.setValue(new d85(j));
                    bcb.a = j;
                    fk0 fk0Var = ivdVar.i;
                    d85 d85Var = new d85(j);
                    act S = weo.S(300, 0, null, 6);
                    this.k = 2;
                    break;
                }
            default:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ivdVar.h;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar.emit(unit, this) == nm6Var3) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
