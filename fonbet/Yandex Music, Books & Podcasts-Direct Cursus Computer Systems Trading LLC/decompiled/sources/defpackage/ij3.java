package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public interface ij3 extends n3r, ReadableByteChannel {
    boolean A0(long j, pn3 pn3Var);

    String B();

    long C(pn3 pn3Var);

    long C0();

    InputStream E0();

    String G(long j);

    void O(hi3 hi3Var, long j);

    String T();

    void a0(long j);

    pn3 g0(long j);

    hi3 h();

    int h0(qwj qwjVar);

    byte[] k0();

    ikn peek();

    long q0(gj3 gj3Var);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    hi3 s();

    void skip(long j);

    String v0(Charset charset);
}
