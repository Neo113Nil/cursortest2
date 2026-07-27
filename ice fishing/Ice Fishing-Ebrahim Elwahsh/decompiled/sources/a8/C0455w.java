package a8;

import com.google.android.gms.internal.ads.CL;
import q7.EnumC4937f;

/* renamed from: a8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0455w implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4517a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4518b;

    public C0455w() {
        this.f4517a = 1;
        this.f4518b = com.bumptech.glide.e.p(EnumC4937f.f40159n, new X.r(2, this));
    }

    @Override // X7.a
    public final void a(c8.r rVar, Object value) {
        switch (this.f4517a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(value, "value");
                rVar.a(c()).p(c());
                return;
        }
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        switch (this.f4517a) {
            case 0:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                Y7.e c4 = c();
                Z7.a s3 = decoder.s(c4);
                int o9 = s3.o(c());
                if (o9 != -1) {
                    throw new X7.c(CL.i(o9, "Unexpected index "));
                }
                s3.p(c4);
                return q7.v.f40183a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q7.e] */
    @Override // X7.a
    public final Y7.e c() {
        switch (this.f4517a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                return (Y7.e) this.f4518b.getValue();
        }
    }

    public C0455w(X7.a aVar) {
        this.f4517a = 0;
        this.f4518b = aVar;
    }
}
