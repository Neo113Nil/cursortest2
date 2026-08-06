package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606n6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0274aa f6550a;

    /* renamed from: b, reason: collision with root package name */
    public final C0399f6 f6551b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6552c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9 f6553d;

    public C0606n6(Context context) {
        this(context, new C0274aa(), new C0399f6(), Z9.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0824vh c0824vh) {
        boolean mkdir;
        String str;
        C0868x9 b2;
        PrintWriter printWriter;
        Z9 z9;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f6552c);
        this.f6551b.getClass();
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
                Bf bf = c0824vh.f7069e.f4458a;
                str = bf.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf.f4214a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b2 = this.f6553d.b(str);
                b2.f7194a.lock();
                b2.f7195b.a();
                this.f6550a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0507jb(c0824vh.f7065a, c0824vh.f7069e, c0824vh.f7068d).k());
                AbstractC0572lo.a((Closeable) printWriter);
                b2.c();
                z9 = this.f6553d;
                synchronized (z9) {
                    z9.f5492b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0507jb(c0824vh.f7065a, c0824vh.f7069e, c0824vh.f7068d).k());
            AbstractC0572lo.a((Closeable) printWriter);
            b2.c();
            z9 = this.f6553d;
            synchronized (z9) {
            }
        } catch (Throwable unused) {
            AbstractC0572lo.a((Closeable) printWriter);
            b2.c();
            this.f6553d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Bf bf2 = c0824vh.f7069e.f4458a;
        str = bf2.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf2.f4214a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b2 = this.f6553d.b(str);
        b2.f7194a.lock();
        b2.f7195b.a();
        this.f6550a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0606n6(Context context, C0274aa c0274aa, C0399f6 c0399f6, Z9 z9) {
        this.f6552c = context;
        this.f6550a = c0274aa;
        this.f6551b = c0399f6;
        this.f6553d = z9;
    }
}
