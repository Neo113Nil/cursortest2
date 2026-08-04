package com.gamericefishpro.space.l4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements a {
    public final File a;
    public final t0 b;
    public final com.gamericefishpro.space.a2.b c;
    public final AtomicBoolean d;
    public final com.gamericefishpro.space.xi.c e;

    public k0(File file, t0 coordinator, com.gamericefishpro.space.a2.b onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        com.gamericefishpro.space.p4.g serializer = com.gamericefishpro.space.p4.g.a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.a = file;
        this.b = coordinator;
        this.c = onClose;
        this.d = new AtomicBoolean(false);
        this.e = new com.gamericefishpro.space.xi.c();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:33:0x0078, B:42:0x0089, B:41:0x0086, B:38:0x0081), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.gamericefishpro.space.l4.k0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.gamericefishpro.space.l4.k0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.l4.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.gamericefishpro.space.l4.k0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.gamericefishpro.space.l4.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object a(n nVar, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        ?? i0Var;
        Throwable th;
        f0 f0Var;
        ?? r7;
        ?? r0;
        if (cVar instanceof i0) {
            i0 i0Var2 = (i0) cVar;
            int i = i0Var2.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var2.y = i - Integer.MIN_VALUE;
                i0Var = i0Var2;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.v;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = i0Var.y;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = i0Var.i;
                f0Var = i0Var.e;
                i0Var = i0Var.d;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    r0 = i0Var;
                    r7 = nVar;
                    try {
                        f0Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        r0.e.b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        f0Var.close();
                    } catch (Throwable th4) {
                        com.gamericefishpro.space.oh.c.a(th, th4);
                    }
                    throw th;
                }
            }
            com.gamericefishpro.space.wa.b.P(obj);
            if (this.d.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zF = this.e.f();
            try {
                f0 f0Var2 = new f0(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    i0Var.d = this;
                    i0Var.e = f0Var2;
                    i0Var.i = zF;
                    i0Var.y = 1;
                    Object objA = nVar.a(f0Var2, boolValueOf, i0Var);
                    if (objA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    r7 = zF;
                    r0 = this;
                    f0Var = f0Var2;
                    f0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        r0.e.b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    nVar = zF;
                    i0Var = this;
                    f0Var = f0Var2;
                    f0Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                nVar = zF;
                i0Var = this;
                if (nVar != 0) {
                    i0Var.e.b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (nVar != 0) {
                i0Var.e.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e9 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TryCatch #3 {all -> 0x0119, blocks: (B:44:0x00e9, B:46:0x00ef, B:49:0x00f8, B:50:0x0118, B:55:0x011e, B:58:0x0126, B:67:0x0135, B:69:0x013b, B:70:0x013e, B:65:0x0133, B:64:0x0130, B:33:0x009e, B:34:0x00ba), top: B:81:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0126 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0119, blocks: (B:44:0x00e9, B:46:0x00ef, B:49:0x00f8, B:50:0x0118, B:55:0x011e, B:58:0x0126, B:67:0x0135, B:69:0x013b, B:70:0x013e, B:65:0x0133, B:64:0x0130, B:33:0x009e, B:34:0x00ba), top: B:81:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(b0 b0Var, com.gamericefishpro.space.vh.c cVar) throws IOException {
        j0 j0Var;
        File file;
        k0 k0Var;
        com.gamericefishpro.space.xi.a aVar;
        Function2 function2;
        m0 m0Var;
        Throwable th;
        m0 m0Var2;
        File file2;
        k0 k0Var2;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i = j0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.z = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object obj = j0Var.w;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = j0Var.z;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            com.gamericefishpro.space.wa.b.P(obj);
                            if (this.d.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            j0Var.d = this;
                            j0Var.e = b0Var;
                            com.gamericefishpro.space.xi.c cVar2 = this.e;
                            j0Var.i = cVar2;
                            j0Var.z = 1;
                            if (cVar2.c(j0Var) != aVar2) {
                                k0Var = this;
                                aVar = cVar2;
                                function2 = b0Var;
                            }
                            return aVar2;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m0Var2 = j0Var.v;
                            File file4 = (File) j0Var.i;
                            aVar = (com.gamericefishpro.space.xi.a) j0Var.e;
                            k0Var2 = j0Var.d;
                            try {
                                com.gamericefishpro.space.wa.b.P(obj);
                                file2 = file4;
                                Unit unit = Unit.a;
                                try {
                                    m0Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !com.gamericefishpro.space.b9.a.e(file2, k0Var2.a)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + k0Var2.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit2 = Unit.a;
                                aVar.b(null);
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    m0Var2.close();
                                } catch (Throwable th4) {
                                    com.gamericefishpro.space.oh.c.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        com.gamericefishpro.space.xi.a aVar3 = (com.gamericefishpro.space.xi.a) j0Var.i;
                        Function2 function3 = (Function2) j0Var.e;
                        k0Var = j0Var.d;
                        com.gamericefishpro.space.wa.b.P(obj);
                        aVar = aVar3;
                        function2 = function3;
                        j0Var.d = k0Var;
                        j0Var.e = aVar;
                        j0Var.i = file;
                        j0Var.v = m0Var;
                        j0Var.z = 2;
                        if (function2.invoke(m0Var, j0Var) != aVar2) {
                            file2 = file;
                            k0Var2 = k0Var;
                            m0Var2 = m0Var;
                            Unit unit3 = Unit.a;
                            m0Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + k0Var2.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            Unit unit4 = Unit.a;
                            aVar.b(null);
                            return Unit.a;
                        }
                        return aVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        m0Var2 = m0Var;
                        m0Var2.close();
                        throw th;
                    }
                    com.gamericefishpro.space.p4.g serializer = com.gamericefishpro.space.p4.g.a;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    m0Var = new m0(file);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(k0Var.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                aVar.b(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = aVar2;
        }
    }

    @Override // com.gamericefishpro.space.l4.a
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
