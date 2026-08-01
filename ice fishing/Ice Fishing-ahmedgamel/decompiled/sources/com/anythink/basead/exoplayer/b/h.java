package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.v;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6459a = Long.MIN_VALUE;

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
        public final int f6460a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i, int i6, int i9, int i10) {
            super(r5.toString());
            StringBuilder h9 = AbstractC4404f.h(i, i6, "AudioTrack init failed: ", ", Config(", ", ");
            h9.append(i9);
            h9.append(", ");
            h9.append(i10);
            h9.append(")");
            this.f6460a = i;
        }
    }

    public interface c {
        void a();

        void a(int i);

        void a(int i, long j6, long j9);
    }

    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f6461a;

        public d(int i) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.f6461a = i;
        }
    }

    long a(boolean z3);

    v a(v vVar);

    void a();

    void a(float f3);

    void a(int i, int i6, int i9, int[] iArr, int i10, int i11);

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
