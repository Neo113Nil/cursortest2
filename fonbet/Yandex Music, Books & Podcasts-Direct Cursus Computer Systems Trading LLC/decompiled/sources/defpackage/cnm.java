package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class cnm implements anm {
    public static PreloadException.CacheInitException.InitFailed e;
    public final Function0 a;
    public liq b;
    public PreloadException.CacheInitException c;
    public final jyr d = btf.b(new s6f(9, this));

    public cnm(Context context, Function0 function0) {
        this.a = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        File file;
        bnm bnmVar;
        String externalStorageState = Environment.getExternalStorageState();
        liq liqVar = null;
        if (Intrinsics.d(externalStorageState, "mounted")) {
            try {
                file = (File) this.a.invoke();
            } catch (Throwable th) {
                this.c = new PreloadException.CacheInitException.InitFailed("Failed to create preload cache dir", th);
            }
            if (file != null) {
                try {
                    gwf gwfVar = new gwf(Math.max(262144L, 10240L) * 1024);
                    e = new PreloadException.CacheInitException.InitFailed("SimpleCache created in thread = " + Thread.currentThread().getName() + " this=" + this, null);
                    liqVar = new liq(file, gwfVar, null, true);
                } catch (Throwable th2) {
                    PreloadException.CacheInitException.InitFailed initFailed = e;
                    if (initFailed != null) {
                        StringWriter stringWriter = new StringWriter();
                        initFailed.printStackTrace(new PrintWriter(stringWriter));
                        String stringWriter2 = stringWriter.toString();
                        stringWriter2.getClass();
                        bnmVar = new bnm(initFailed.getMessage(), stringWriter2);
                    } else {
                        bnmVar = null;
                    }
                    this.c = new PreloadException.CacheInitException.InitFailed("SimpleCache init error in thread = " + Thread.currentThread().getName() + ": " + th2.getMessage() + " details: " + bnmVar + " this=" + this, th2);
                }
            }
            this.b = liqVar;
        }
        if (Intrinsics.d(externalStorageState, "mounted_ro")) {
            this.c = new PreloadException.CacheInitException.StorageReadOnly("External storage is mounted read-only");
        } else {
            this.c = new PreloadException.CacheInitException.StorageNotMounted(f1d.g("External storage mount state is ", externalStorageState));
        }
        file = null;
        if (file != null) {
        }
        this.b = liqVar;
    }
}
