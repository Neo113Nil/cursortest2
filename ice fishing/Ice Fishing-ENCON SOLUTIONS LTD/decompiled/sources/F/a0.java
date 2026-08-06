package F;

import a.AbstractC0083a;
import h1.C0239i;
import java.io.FileOutputStream;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class a0 extends S {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC0991b abstractC0991b) {
        Z z2;
        int i2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0991b instanceof Z) {
            z2 = (Z) abstractC0991b;
            int i3 = z2.f460h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.f460h = i3 - Integer.MIN_VALUE;
                Object obj2 = z2.f458f;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = z2.f460h;
                C0239i c0239i = C0239i.f3393a;
                if (i2 != 0) {
                    R1.l.F(obj2);
                    if (this.f430b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f429a);
                    try {
                        I.g gVar = I.g.f714a;
                        m0 m0Var = new m0(fileOutputStream3);
                        z2.f456d = fileOutputStream3;
                        z2.f457e = fileOutputStream3;
                        z2.f460h = 1;
                        gVar.b(obj, m0Var);
                        if (c0239i == enumC0985a) {
                            return enumC0985a;
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
                    fileOutputStream2 = z2.f457e;
                    fileOutputStream = z2.f456d;
                    try {
                        R1.l.F(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0083a.e(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0083a.e(fileOutputStream, null);
                return c0239i;
            }
        }
        z2 = new Z(this, abstractC0991b);
        Object obj22 = z2.f458f;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = z2.f460h;
        C0239i c0239i2 = C0239i.f3393a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0083a.e(fileOutputStream, null);
        return c0239i2;
    }
}
