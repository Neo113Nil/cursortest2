package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class yf0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(uso usoVar, Bitmap bitmap, float f) {
        super(1);
        this.r = 1;
        this.t = usoVar;
        this.u = bitmap;
        this.s = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r2 > r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r2 < r1) goto L20;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float floatValue;
        switch (this.r) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.a();
                float f = this.s;
                yg0 yg0Var = (yg0) this.t;
                d43 d43Var = (d43) this.u;
                ou3 ou3Var = opfVar.a;
                nsh nshVar = ou3Var.b;
                long B = nshVar.B();
                nshVar.s().r();
                try {
                    xzi xziVar = (xzi) nshVar.b;
                    xziVar.m0(f, 0.0f);
                    xziVar.e0(45.0f, 0L);
                    ou3Var.d(yg0Var, d43Var);
                    vz1.A(nshVar, B);
                    return Unit.a;
                } catch (Throwable th) {
                    vz1.A(nshVar, B);
                    throw th;
                }
            case 1:
                uso usoVar = (uso) this.t;
                usoVar.d = (((Bitmap) this.u).getWidth() * this.s) / r10.getWidth();
                usoVar.e = (Bitmap) obj;
                usoVar.f = null;
                usoVar.g = null;
                usoVar.j = true;
                usoVar.invalidateSelf();
                return Unit.a;
            case 2:
                sm0 sm0Var = (sm0) obj;
                uqn uqnVar = (uqn) this.t;
                float f2 = this.s;
                float f3 = 0.0f;
                if (f2 <= 0.0f) {
                    if (f2 < 0.0f) {
                        floatValue = ((Number) sm0Var.e.getValue()).floatValue();
                        break;
                    }
                } else {
                    floatValue = ((Number) sm0Var.e.getValue()).floatValue();
                    break;
                }
                float f4 = f3 - uqnVar.a;
                if (f4 != ((dvf) this.u).a(f4) || f3 != ((Number) sm0Var.e.getValue()).floatValue()) {
                    sm0Var.a();
                }
                uqnVar.a += f4;
                return Unit.a;
            default:
                long longValue = ((Number) obj).longValue();
                wmt wmtVar = (wmt) this.t;
                if (wmtVar.b == Long.MIN_VALUE) {
                    wmtVar.b = longValue;
                }
                float f5 = wmtVar.e;
                ym0 ym0Var = new ym0(f5);
                float f6 = this.s;
                ym0 ym0Var2 = wmt.f;
                long m = f6 == 0.0f ? wmtVar.a.m(new ym0(f5), ym0Var2, wmtVar.c) : eeh.c((longValue - wmtVar.b) / f6);
                float f7 = ((ym0) wmtVar.a.A(m, ym0Var, ym0Var2, wmtVar.c)).a;
                wmtVar.c = (ym0) wmtVar.a.x(m, ym0Var, ym0Var2, wmtVar.c);
                wmtVar.b = longValue;
                float f8 = wmtVar.e - f7;
                wmtVar.e = f7;
                ((Function1) this.u).invoke(Float.valueOf(f8));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf0(float f, int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.s = f;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(wmt wmtVar, float f, Function1 function1) {
        super(1);
        this.r = 3;
        this.t = wmtVar;
        this.s = f;
        this.u = function1;
    }
}
