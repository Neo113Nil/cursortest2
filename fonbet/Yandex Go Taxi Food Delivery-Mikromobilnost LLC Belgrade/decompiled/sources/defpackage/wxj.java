package defpackage;

import coil.disk.a;
import java.io.Closeable;
import kotlin.text.Regex;

/* loaded from: classes10.dex */
public final class wxj implements Closeable {
    public final sxj a;
    public boolean b;
    public final /* synthetic */ a c;

    public wxj(a aVar, sxj sxjVar) {
        this.c = aVar;
        this.a = sxjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        a aVar = this.c;
        synchronized (aVar) {
            sxj sxjVar = this.a;
            int i = sxjVar.h - 1;
            sxjVar.h = i;
            if (i == 0 && sxjVar.f) {
                Regex regex = a.J;
                aVar.w(sxjVar);
            }
        }
    }
}
