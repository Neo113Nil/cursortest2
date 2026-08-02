package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* loaded from: classes9.dex */
public interface qq6 extends y9t0, ReadableByteChannel {
    void B1(long j);

    String C0(Charset charset);

    void C1(yp6 yp6Var, long j);

    ByteString E0();

    String I0();

    boolean I1();

    long J(ByteString byteString);

    long K(ByteString byteString);

    String L();

    boolean Q(long j, ByteString byteString);

    boolean S(long j);

    yp6 V0();

    long X();

    int d2();

    long e1(byte b, long j, long j2);

    yp6 h();

    int h0(ng70 ng70Var);

    String j0(long j);

    String j1(long j);

    ByteString l0(long j);

    byte[] p0();

    InputStream p2();

    jci0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    String w1();

    long y0(oq6 oq6Var);
}
