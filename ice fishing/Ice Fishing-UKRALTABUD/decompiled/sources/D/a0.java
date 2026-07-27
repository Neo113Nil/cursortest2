package D;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a0 implements InterfaceC0001b {

    /* renamed from: a, reason: collision with root package name */
    public final File f164a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f165b;

    /* renamed from: c, reason: collision with root package name */
    public final W f166c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f167d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.d f168e;

    public a0(File file, l0 l0Var, W w2) {
        E0.i.e(l0Var, "coordinator");
        this.f164a = file;
        this.f165b = l0Var;
        this.f166c = w2;
        this.f167d = new AtomicBoolean(false);
        this.f168e = S0.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [D.a0] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [D.Y, x0.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [D.a0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [D.s] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0017s c0017s, x0.b bVar) {
        ?? r02;
        int i2;
        U u2;
        Throwable th;
        a0 a0Var;
        boolean z2;
        try {
            if (bVar instanceof Y) {
                Y y2 = (Y) bVar;
                int i3 = y2.f156n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    y2.f156n = i3 - Integer.MIN_VALUE;
                    r02 = y2;
                    Object obj = r02.f154l;
                    w0.a aVar = w0.a.f3071f;
                    i2 = r02.f156n;
                    if (i2 != 0) {
                        o.g.C(obj);
                        if (this.f167d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d2 = this.f168e.d(null);
                        try {
                            U u3 = new U(this.f164a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d2);
                                r02.f151i = this;
                                r02.f152j = u3;
                                r02.f153k = d2;
                                r02.f156n = 1;
                                Object p2 = c0017s.p(u3, valueOf, r02);
                                if (p2 == aVar) {
                                    return aVar;
                                }
                                a0Var = this;
                                u2 = u3;
                                obj = p2;
                                z2 = d2;
                            } catch (Throwable th2) {
                                r02 = this;
                                u2 = u3;
                                th = th2;
                                c0017s = d2;
                                u2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            c0017s = d2;
                            if (c0017s != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0017s = r02.f153k;
                        u2 = r02.f152j;
                        r02 = r02.f151i;
                        try {
                            o.g.C(obj);
                            a0Var = r02;
                            z2 = c0017s;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                u2.close();
                            } catch (Throwable th5) {
                                o.g.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    u2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        a0Var.f168e.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            u2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (c0017s != 0) {
                r02.f168e.e(null);
            }
            throw th;
        }
        r02 = new Y(this, bVar);
        Object obj2 = r02.f154l;
        w0.a aVar2 = w0.a.f3071f;
        i2 = r02.f156n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(4:64|(2:66|(2:68|69))|70|(1:72)(1:73))(2:74|75))|45|46|47|48|49|(1:51)(5:52|14|15|16|(0)(0))))|46|47|48|49|(0)(0))|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Q q2, x0.b bVar) {
        Z z2;
        w0.a aVar;
        ?? r3;
        File file;
        a0 a0Var;
        S0.a aVar2;
        D0.p pVar;
        c0 c0Var;
        Throwable th;
        c0 c0Var2;
        File file2;
        a0 a0Var2;
        try {
            try {
                try {
                    if (bVar instanceof Z) {
                        z2 = (Z) bVar;
                        int i2 = z2.f163o;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            z2.f163o = i2 - Integer.MIN_VALUE;
                            Object obj = z2.f161m;
                            aVar = w0.a.f3071f;
                            r3 = z2.f163o;
                            if (r3 != 0) {
                                o.g.C(obj);
                                if (this.f167d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f164a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                z2.f157i = this;
                                z2.f158j = q2;
                                S0.d dVar = this.f168e;
                                z2.f159k = dVar;
                                z2.f163o = 1;
                                if (dVar.c(z2) == aVar) {
                                    return aVar;
                                }
                                a0Var = this;
                                aVar2 = dVar;
                                pVar = q2;
                            } else {
                                if (r3 != 1) {
                                    if (r3 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    c0Var2 = z2.f160l;
                                    file2 = (File) z2.f159k;
                                    aVar2 = (S0.a) z2.f158j;
                                    a0Var2 = z2.f157i;
                                    try {
                                        o.g.C(obj);
                                        try {
                                            c0Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = a0Var2.f164a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0000a.a(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + a0Var2.f164a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((S0.d) aVar2).e(null);
                                        return t0.g.f2989a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            c0Var2.close();
                                        } catch (Throwable th4) {
                                            o.g.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                S0.a aVar3 = (S0.a) z2.f159k;
                                D0.p pVar2 = (D0.p) z2.f158j;
                                a0Var = z2.f157i;
                                o.g.C(obj);
                                aVar2 = aVar3;
                                pVar = pVar2;
                            }
                            file = new File(a0Var.f164a.getAbsolutePath() + ".tmp");
                            c0Var = new c0(file);
                            z2.f157i = a0Var;
                            z2.f158j = aVar2;
                            z2.f159k = file;
                            z2.f160l = c0Var;
                            z2.f163o = 2;
                            if (pVar.f(c0Var, z2) != aVar) {
                                return aVar;
                            }
                            file2 = file;
                            a0Var2 = a0Var;
                            c0Var2 = c0Var;
                            c0Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    z2.f157i = a0Var;
                    z2.f158j = aVar2;
                    z2.f159k = file;
                    z2.f160l = c0Var;
                    z2.f163o = 2;
                    if (pVar.f(c0Var, z2) != aVar) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c0Var2 = c0Var;
                    c0Var2.close();
                    throw th;
                }
                c0Var = new c0(file);
            } catch (IOException e2) {
                e = e2;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new File(a0Var.f164a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((S0.d) r3).e(null);
            throw th6;
        }
        z2 = new Z(this, bVar);
        Object obj2 = z2.f161m;
        aVar = w0.a.f3071f;
        r3 = z2.f163o;
    }

    @Override // D.InterfaceC0001b
    public final void close() {
        this.f167d.set(true);
        this.f166c.a();
    }
}
