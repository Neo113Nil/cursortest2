package D;

import a.AbstractC0069a;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class c0 extends U {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, x0.b bVar) {
        b0 b0Var;
        int i2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (bVar instanceof b0) {
            b0Var = (b0) bVar;
            int i3 = b0Var.f173m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b0Var.f173m = i3 - Integer.MIN_VALUE;
                Object obj2 = b0Var.f171k;
                w0.a aVar = w0.a.f3071f;
                i2 = b0Var.f173m;
                t0.g gVar = t0.g.f2989a;
                if (i2 != 0) {
                    o.g.C(obj2);
                    if (this.f143b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f142a);
                    try {
                        G.g gVar2 = G.g.f335a;
                        o0 o0Var = new o0(fileOutputStream3);
                        b0Var.f169i = fileOutputStream3;
                        b0Var.f170j = fileOutputStream3;
                        b0Var.f173m = 1;
                        gVar2.b(obj, o0Var);
                        if (gVar == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = b0Var.f170j;
                    fileOutputStream = b0Var.f169i;
                    try {
                        o.g.C(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0069a.f(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0069a.f(fileOutputStream, null);
                return gVar;
            }
        }
        b0Var = new b0(this, bVar);
        Object obj22 = b0Var.f171k;
        w0.a aVar2 = w0.a.f3071f;
        i2 = b0Var.f173m;
        t0.g gVar3 = t0.g.f2989a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0069a.f(fileOutputStream, null);
        return gVar3;
    }
}
