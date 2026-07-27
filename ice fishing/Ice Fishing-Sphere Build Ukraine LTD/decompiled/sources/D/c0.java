package D;

import a.AbstractC0069a;
import java.io.FileOutputStream;
import t0.C0252g;

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
            int i3 = b0Var.f173l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b0Var.f173l = i3 - Integer.MIN_VALUE;
                Object obj2 = b0Var.f171j;
                w0.a aVar = w0.a.f3076e;
                i2 = b0Var.f173l;
                C0252g c0252g = C0252g.f2994a;
                if (i2 != 0) {
                    o.g.z(obj2);
                    if (this.f143b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f142a);
                    try {
                        G.g gVar = G.g.f336a;
                        o0 o0Var = new o0(fileOutputStream3);
                        b0Var.f169h = fileOutputStream3;
                        b0Var.f170i = fileOutputStream3;
                        b0Var.f173l = 1;
                        gVar.b(obj, o0Var);
                        if (c0252g == aVar) {
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
                    fileOutputStream2 = b0Var.f170i;
                    fileOutputStream = b0Var.f169h;
                    try {
                        o.g.z(obj2);
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
                return c0252g;
            }
        }
        b0Var = new b0(this, bVar);
        Object obj22 = b0Var.f171j;
        w0.a aVar2 = w0.a.f3076e;
        i2 = b0Var.f173l;
        C0252g c0252g2 = C0252g.f2994a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0069a.f(fileOutputStream, null);
        return c0252g2;
    }
}
