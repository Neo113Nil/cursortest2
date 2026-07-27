package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.v;
import java.nio.ByteBuffer;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6616a = Long.MIN_VALUE;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f6617a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i, int i4, int i9, int i10) {
            super(r5.toString());
            StringBuilder h9 = AbstractC5051n.h(i, i4, "AudioTrack init failed: ", ", Config(", ", ");
            h9.append(i9);
            h9.append(", ");
            h9.append(i10);
            h9.append(")");
            this.f6617a = i;
        }
    }

    public interface c {
        void a();

        void a(int i);

        void a(int i, long j9, long j10);
    }

    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f6618a;

        public d(int i) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.f6618a = i;
        }
    }

    long a(boolean z8);

    v a(v vVar);

    void a();

    void a(float f6);

    void a(int i, int i4, int i9, int[] iArr, int i10, int i11);

    void a(com.anythink.basead.exoplayer.b.b bVar);

    void a(c cVar);

    boolean a(int i);

    boolean a(ByteBuffer byteBuffer, long j9);

    void b();

    void b(int i);

    void c();

    void c(int i);

    boolean d();

    boolean e();

    v f();

    void g();

    void h();

    void i();

    void j();
}
