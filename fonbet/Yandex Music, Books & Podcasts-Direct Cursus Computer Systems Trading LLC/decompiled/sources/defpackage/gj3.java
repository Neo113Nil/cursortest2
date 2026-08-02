package defpackage;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes5.dex */
public interface gj3 extends jmq, WritableByteChannel {
    gj3 M(String str);

    gj3 W(pn3 pn3Var);

    gj3 c0(long j);

    @Override // defpackage.jmq, java.io.Flushable
    void flush();

    hi3 h();

    long o0(n3r n3rVar);

    gj3 r0(int i, byte[] bArr);

    gj3 v();

    gj3 w0(long j);

    gj3 write(byte[] bArr);

    gj3 writeByte(int i);

    gj3 writeInt(int i);

    gj3 writeShort(int i);
}
