package com.gamericefishpro.space.l4;

import com.gamericefishpro.space.i9.y3;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f0 implements a {
    public final File a;
    public final AtomicBoolean b;

    public f0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        com.gamericefishpro.space.p4.g serializer = com.gamericefishpro.space.p4.g.a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a = file;
        this.b = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.gamericefishpro.space.l4.f0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.gamericefishpro.space.l4.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.gamericefishpro.space.l4.f0] */
    public static Object a(f0 f0Var, com.gamericefishpro.space.vh.c cVar) {
        e0 e0Var;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i = e0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0Var.w = i - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(f0Var, cVar);
            }
        } else {
            e0Var = new e0(f0Var, cVar);
        }
        Object obj = e0Var.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        ?? r2 = e0Var.w;
        com.gamericefishpro.space.p4.g gVar = com.gamericefishpro.space.p4.g.a;
        boolean z = true;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream = e0Var.e;
                    r2 = (f0) e0Var.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        y3.s(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            y3.s(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) e0Var.d;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    y3.s(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        y3.s(closeable, th);
                        throw th6;
                    }
                }
            }
            com.gamericefishpro.space.wa.b.P(obj);
            if (f0Var.b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(f0Var.a);
                try {
                    e0Var.d = f0Var;
                    e0Var.e = fileInputStream2;
                    e0Var.w = 1;
                    com.gamericefishpro.space.p4.b bVarA = gVar.a(fileInputStream2);
                    if (bVarA != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = bVarA;
                        y3.s(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r2 = f0Var;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!f0Var.a.exists()) {
                    return new com.gamericefishpro.space.p4.b(z);
                }
                FileInputStream fileInputStream3 = new FileInputStream(f0Var.a);
                try {
                    e0Var.d = fileInputStream3;
                    e0Var.e = null;
                    e0Var.w = 2;
                    com.gamericefishpro.space.p4.b bVarA2 = gVar.a(fileInputStream3);
                    if (bVarA2 != aVar) {
                        obj = bVarA2;
                        closeable = fileInputStream3;
                        y3.s(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            f0Var = r2;
        }
    }

    @Override // com.gamericefishpro.space.l4.a
    public final void close() {
        this.b.set(true);
    }
}
