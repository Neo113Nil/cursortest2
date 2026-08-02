package com.anythink.core.common.n.c;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface e extends w, ReadableByteChannel {
    int a(o oVar);

    int a(byte[] bArr);

    int a(byte[] bArr, int i, int i4);

    long a(byte b9);

    long a(byte b9, long j6);

    long a(byte b9, long j6, long j9);

    long a(f fVar, long j6);

    long a(v vVar);

    String a(long j6, Charset charset);

    String a(Charset charset);

    void a(long j6);

    boolean a(long j6, f fVar);

    boolean a(long j6, f fVar, int i);

    long b(f fVar);

    long b(f fVar, long j6);

    void b(c cVar, long j6);

    void b(byte[] bArr);

    boolean b(long j6);

    long c(f fVar);

    @Deprecated
    c c();

    c d();

    f d(long j6);

    String e(long j6);

    String f(long j6);

    boolean g();

    e h();

    byte[] h(long j6);

    InputStream i();

    void i(long j6);

    byte k();

    short l();

    int m();

    long n();

    short o();

    int p();

    long q();

    long r();

    long s();

    f t();

    String u();

    String v();

    String w();

    int x();

    byte[] y();
}
