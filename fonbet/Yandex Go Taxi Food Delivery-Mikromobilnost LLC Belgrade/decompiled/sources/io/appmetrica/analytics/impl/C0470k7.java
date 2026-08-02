package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0470k7 {
    public final C0676rb a;
    public final C0182a7 b;
    public final Context c;
    public final C0648qb d;

    public C0470k7(Context context) {
        this(context, new C0676rb(), new C0182a7(), C0648qb.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0425ik c0425ik) {
        boolean mkdir;
        String str;
        Ma b;
        PrintWriter printWriter;
        C0648qb c0648qb;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.c);
        this.b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                C0597oi c0597oi = c0425ik.e.a;
                str = c0597oi.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c0597oi.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b = this.d.b(str);
                b.a.lock();
                b.b.a();
                this.a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new Yc(c0425ik.a, c0425ik.e, c0425ik.d).l());
                Or.a((Closeable) printWriter);
                b.c();
                c0648qb = this.d;
                synchronized (c0648qb) {
                    c0648qb.b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new Yc(c0425ik.a, c0425ik.e, c0425ik.d).l());
            Or.a((Closeable) printWriter);
            b.c();
            c0648qb = this.d;
            synchronized (c0648qb) {
            }
        } catch (Throwable unused) {
            Or.a((Closeable) printWriter);
            b.c();
            this.d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        C0597oi c0597oi2 = c0425ik.e.a;
        str = c0597oi2.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c0597oi2.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b = this.d.b(str);
        b.a.lock();
        b.b.a();
        this.a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0470k7(Context context, C0676rb c0676rb, C0182a7 c0182a7, C0648qb c0648qb) {
        this.c = context;
        this.a = c0676rb;
        this.b = c0182a7;
        this.d = c0648qb;
    }
}
