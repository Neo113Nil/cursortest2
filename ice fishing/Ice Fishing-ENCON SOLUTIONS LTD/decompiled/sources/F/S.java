package F;

import a.AbstractC0083a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public class S implements InterfaceC0026b {

    /* renamed from: a, reason: collision with root package name */
    public final File f429a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f430b = new AtomicBoolean(false);

    public S(File file) {
        this.f429a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(5:44|45|47|48|(1:50)(1:51))(2:42|43))|30|31))|70|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [F.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(S s2, AbstractC0991b abstractC0991b) {
        Q q2;
        ?? r2;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (abstractC0991b instanceof Q) {
            q2 = (Q) abstractC0991b;
            int i2 = q2.f428h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2.f428h = i2 - Integer.MIN_VALUE;
                Object obj = q2.f426f;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                r2 = q2.f428h;
                I.g gVar = I.g.f714a;
                boolean z2 = true;
                if (r2 != 0) {
                    R1.l.F(obj);
                    if (s2.f430b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(s2.f429a);
                        try {
                            q2.f424d = s2;
                            q2.f425e = fileInputStream2;
                            q2.f428h = 1;
                            I.b a2 = gVar.a(fileInputStream2);
                            if (a2 == enumC0985a) {
                                return enumC0985a;
                            }
                            fileInputStream = fileInputStream2;
                            obj = a2;
                        } catch (Throwable th3) {
                            r2 = s2;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!s2.f429a.exists()) {
                            return new I.b(z2);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(s2.f429a);
                        try {
                            q2.f424d = fileInputStream3;
                            q2.f425e = null;
                            q2.f428h = 2;
                            I.b a3 = gVar.a(fileInputStream3);
                            if (a3 == enumC0985a) {
                                return enumC0985a;
                            }
                            obj = a3;
                            closeable = fileInputStream3;
                            AbstractC0083a.e(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) q2.f424d;
                        try {
                            R1.l.F(obj);
                            AbstractC0083a.e(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    fileInputStream = q2.f425e;
                    r2 = (S) q2.f424d;
                    try {
                        R1.l.F(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                AbstractC0083a.e(fileInputStream, null);
                return obj;
            }
        }
        q2 = new Q(s2, abstractC0991b);
        Object obj2 = q2.f426f;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        r2 = q2.f428h;
        I.g gVar2 = I.g.f714a;
        boolean z22 = true;
        if (r2 != 0) {
        }
        AbstractC0083a.e(fileInputStream, null);
        return obj2;
    }

    @Override // F.InterfaceC0026b
    public final void close() {
        this.f430b.set(true);
    }
}
