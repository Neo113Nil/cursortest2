package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.v;
import com.google.android.gms.internal.ads.Wv;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7245a = Long.MIN_VALUE;

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
        public final int f7246a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i, int i4, int i6, int i9) {
            super(r5.toString());
            StringBuilder j6 = Wv.j(i, i4, "AudioTrack init failed: ", ", Config(", ", ");
            j6.append(i6);
            j6.append(", ");
            j6.append(i9);
            j6.append(")");
            this.f7246a = i;
        }
    }

    public interface c {
        void a();

        void a(int i);

        void a(int i, long j6, long j9);
    }

    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f7247a;

        public d(int i) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.f7247a = i;
        }
    }

    long a(boolean z6);

    v a(v vVar);

    void a();

    void a(float f2);

    void a(int i, int i4, int i6, int[] iArr, int i9, int i10);

    void a(com.anythink.basead.exoplayer.b.b bVar);

    void a(c cVar);

    boolean a(int i);

    boolean a(ByteBuffer byteBuffer, long j6);

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
