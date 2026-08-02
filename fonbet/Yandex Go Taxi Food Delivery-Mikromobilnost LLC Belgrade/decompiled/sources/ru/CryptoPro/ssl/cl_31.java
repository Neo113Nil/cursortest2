package ru.CryptoPro.ssl;

import defpackage.oyr;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* loaded from: classes4.dex */
final class cl_31 {
    public LinkedList a;
    public boolean b;

    public static void a(EngineArgs engineArgs, boolean z) {
        ByteBuffer duplicate = engineArgs.netData.duplicate();
        int position = duplicate.position();
        duplicate.position(position - engineArgs.deltaNet());
        duplicate.limit(position);
        if (SSLLogger.isAllEnabled()) {
            SSLLogger.dump(oyr.t(new StringBuilder("[Raw write"), z ? "" : " (bb)", "]: length = "), Integer.valueOf(duplicate.remaining()), duplicate);
        }
    }

    public final synchronized boolean b() {
        boolean z;
        z = false;
        if (this.b) {
            if (!(this.a.size() != 0)) {
                z = true;
            }
        }
        return z;
    }
}
