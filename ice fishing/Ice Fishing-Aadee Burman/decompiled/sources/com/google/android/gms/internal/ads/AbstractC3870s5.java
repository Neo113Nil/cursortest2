package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3870s5 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f33889b = Logger.getLogger(AbstractC3870s5.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final L7.b f33890a = new L7.b(2);

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC4032v5 a(C2656Lg c2656Lg, ZM zm) {
        int a9;
        ByteBuffer byteBuffer;
        long limit;
        InterfaceC4032v5 c4194y5;
        InterfaceC4032v5 interfaceC4032v5;
        long b9 = c2656Lg.b();
        L7.b bVar = this.f33890a;
        ((ByteBuffer) bVar.get()).rewind().limit(8);
        do {
            a9 = c2656Lg.a((ByteBuffer) bVar.get());
            byteBuffer = c2656Lg.f26126n;
            if (a9 == 8) {
                ((ByteBuffer) bVar.get()).rewind();
                long e9 = AbstractC2772Sd.e((ByteBuffer) bVar.get());
                if (e9 < 8 && e9 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e9);
                    sb.append("). Stop parsing!");
                    f33889b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) bVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (e9 == 1) {
                        ((ByteBuffer) bVar.get()).limit(16);
                        c2656Lg.a((ByteBuffer) bVar.get());
                        ((ByteBuffer) bVar.get()).position(8);
                        limit = AbstractC2772Sd.v((ByteBuffer) bVar.get()) - 16;
                    } else {
                        limit = e9 == 0 ? byteBuffer.limit() - c2656Lg.b() : e9 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) bVar.get()).limit(((ByteBuffer) bVar.get()).limit() + 16);
                        c2656Lg.a((ByteBuffer) bVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) bVar.get()).position() - 16; position < ((ByteBuffer) bVar.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) bVar.get()).position() - 16)] = ((ByteBuffer) bVar.get()).get(position);
                        }
                        limit -= 16;
                    }
                    long j6 = limit;
                    if (zm instanceof InterfaceC4032v5) {
                    }
                    if ("moov".equals(str)) {
                        c4194y5 = new C4086w5();
                    } else {
                        if ("mvhd".equals(str)) {
                            C4140x5 c4140x5 = new C4140x5("mvhd");
                            c4140x5.f34955G = 1.0d;
                            c4140x5.f34956H = 1.0f;
                            c4140x5.f34957I = C3082dN.f29748j;
                            interfaceC4032v5 = c4140x5;
                            ((ByteBuffer) bVar.get()).rewind();
                            interfaceC4032v5.a(c2656Lg, (ByteBuffer) bVar.get(), j6, this);
                            return interfaceC4032v5;
                        }
                        c4194y5 = new C4194y5(str, 0);
                    }
                    interfaceC4032v5 = c4194y5;
                    ((ByteBuffer) bVar.get()).rewind();
                    interfaceC4032v5.a(c2656Lg, (ByteBuffer) bVar.get(), j6, this);
                    return interfaceC4032v5;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (a9 >= 0);
        byteBuffer.position((int) b9);
        throw new EOFException();
    }
}
