package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p3r extends tce {
    public final vnj a;
    public boolean b;
    public ij3 c;
    public uif d;
    public cak e;

    /* JADX WARN: Multi-variable type inference failed */
    public p3r(ij3 ij3Var, Function0 function0, vnj vnjVar) {
        this.a = vnjVar;
        this.c = ij3Var;
        this.d = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.tce
    public final synchronized cak a() {
        Throwable th;
        Long l;
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        cak cakVar = this.e;
        if (cakVar != null) {
            return cakVar;
        }
        ?? r0 = this.d;
        r0.getClass();
        File file = (File) r0.invoke();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = cak.b;
        cak N = h1b.N(File.createTempFile("tmp", null, file));
        hkn hknVar = new hkn(lac.a.k(N));
        try {
            ij3 ij3Var = this.c;
            ij3Var.getClass();
            l = Long.valueOf(hknVar.o0(ij3Var));
            try {
                hknVar.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                hknVar.close();
            } catch (Throwable th4) {
                fob.a(th3, th4);
            }
            th = th3;
            l = null;
        }
        if (th != null) {
            throw th;
        }
        l.getClass();
        this.c = null;
        this.e = N;
        this.d = null;
        return N;
    }

    @Override // defpackage.tce
    public final synchronized cak b() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        return this.e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.b = true;
            ij3 ij3Var = this.c;
            if (ij3Var != null) {
                k.a(ij3Var);
            }
            cak cakVar = this.e;
            if (cakVar != null) {
                b9f b9fVar = lac.a;
                b9fVar.getClass();
                b9fVar.d(cakVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.tce
    public final vnj g() {
        return this.a;
    }

    @Override // defpackage.tce
    public final synchronized ij3 o() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        ij3 ij3Var = this.c;
        if (ij3Var != null) {
            return ij3Var;
        }
        b9f b9fVar = lac.a;
        cak cakVar = this.e;
        cakVar.getClass();
        b9fVar.getClass();
        ikn iknVar = new ikn(fxf.S(cakVar.toFile()));
        this.c = iknVar;
        return iknVar;
    }
}
