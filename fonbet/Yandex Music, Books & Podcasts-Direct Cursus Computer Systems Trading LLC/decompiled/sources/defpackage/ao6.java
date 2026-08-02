package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ao6 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ bo6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao6(bo6 bo6Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bo6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ao6(this.l, continuation, 0);
            default:
                return new ao6(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ao6) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        bo6 bo6Var = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str = bo6Var.a;
                    pce pceVar = new pce(bo6Var.c);
                    pceVar.c = str;
                    pceVar.e(lmq.c);
                    pceVar.j = xee.L(xz0.X(new e7t[]{new g3r(false)}));
                    rce a = pceVar.a();
                    cce cceVar = bo6Var.d;
                    this.k = 1;
                    obj = cceVar.a(a, this);
                    if (obj == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                sce sceVar = (sce) obj;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        float[] fArr = new float[3];
                        aa5.h(bitmap.getPixel(0, 0), fArr);
                        float f = fArr[1];
                        float f2 = 0.6f;
                        if (f > 0.6f) {
                            f = 0.6f;
                        }
                        fArr[1] = f;
                        float f3 = fArr[2];
                        double d = fArr[0];
                        if (30.0d <= d && d <= 120.0d) {
                            f2 = 0.4f;
                        }
                        fArr[2] = yhn.c(f3, 0.12f, f2);
                        bo6Var.f.setValue(new yn6(c3x.f(aa5.a(fArr))));
                    } else {
                        su4.s(2, null, tlm.j("Unexpected cover type ", drawable.getClass()), null);
                    }
                }
                break;
            default:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object Q = gld.Q(new rc4(bo6Var, continuation, 21), this);
                    if (Q != obj2) {
                        Q = Unit.a;
                    }
                    if (Q == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
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
