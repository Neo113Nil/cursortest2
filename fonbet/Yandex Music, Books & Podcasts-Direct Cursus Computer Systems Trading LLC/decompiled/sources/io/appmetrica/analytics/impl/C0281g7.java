package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0281g7 {
    public final C0343ib a;
    public final X6 b;
    public final Context c;
    public final C0314hb d;

    public C0281g7(Context context) {
        this(context, new C0343ib(), new X6(), C0314hb.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Yj yj) {
        boolean mkdir;
        String str;
        Fa b;
        PrintWriter printWriter;
        C0314hb c0314hb;
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
                Xh xh = yj.e.a;
                str = xh.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + xh.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b = this.d.b(str);
                b.a.lock();
                b.b.a();
                this.a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new Ic(yj.a, yj.e, yj.d).k());
                AbstractC0734vr.a((Closeable) printWriter);
                b.c();
                c0314hb = this.d;
                synchronized (c0314hb) {
                    c0314hb.b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new Ic(yj.a, yj.e, yj.d).k());
            AbstractC0734vr.a((Closeable) printWriter);
            b.c();
            c0314hb = this.d;
            synchronized (c0314hb) {
            }
        } catch (Throwable unused) {
            AbstractC0734vr.a((Closeable) printWriter);
            b.c();
            this.d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Xh xh2 = yj.e.a;
        str = xh2.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + xh2.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b = this.d.b(str);
        b.a.lock();
        b.b.a();
        this.a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0281g7(Context context, C0343ib c0343ib, X6 x6, C0314hb c0314hb) {
        this.c = context;
        this.a = c0343ib;
        this.b = x6;
        this.d = c0314hb;
    }
}
