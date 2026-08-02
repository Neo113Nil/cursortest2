package defpackage;

import android.os.Trace;
import java.io.Closeable;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class sbb1 implements Closeable {
    public static final egz b;
    public final boolean a;

    static {
        ((i491) u591.a()).getClass();
        b = new egz();
    }

    public sbb1(String str) {
        b.getClass();
        this.a = true;
        Trace.beginSection(str.length() > 127 ? str.substring(0, HProv.PP_VERSION_TIMESTAMP) : str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            Trace.endSection();
        }
    }
}
