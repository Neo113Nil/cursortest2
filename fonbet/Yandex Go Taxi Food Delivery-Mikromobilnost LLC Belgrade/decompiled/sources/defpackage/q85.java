package defpackage;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;

/* loaded from: classes4.dex */
public abstract class q85 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public ByteString c;
    public ByteString d;
    public IOException e;

    public abstract String a();

    public abstract v0w b();

    public final void c() {
        try {
            jci0 jci0Var = new jci0(b());
            try {
                ByteString l0 = jci0Var.l0(jci0Var.readInt());
                ByteString l02 = jci0Var.l0(jci0Var.readInt());
                jci0Var.close();
                synchronized (this) {
                    this.c = l0;
                    this.d = l02;
                }
            } finally {
            }
        } finally {
            this.b.countDown();
        }
    }
}
