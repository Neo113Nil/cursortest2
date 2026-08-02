package e8;

import b8.C0539c;
import b8.InterfaceC0537a;
import com.google.android.gms.internal.ads.Wv;
import u7.EnumC5080f;

/* renamed from: e8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507w implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37408a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37409b;

    public C4507w() {
        this.f37408a = 1;
        this.f37409b = N3.C.N(EnumC5080f.f41049n, new X.r(3, this));
    }

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object value) {
        switch (this.f37408a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(value, "value");
                qVar.a(c()).p(c());
                return;
        }
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        switch (this.f37408a) {
            case 0:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                c8.e c9 = c();
                d8.a h3 = decoder.h(c9);
                int c10 = h3.c(c());
                if (c10 != -1) {
                    throw new C0539c(Wv.f(c10, "Unexpected index "));
                }
                h3.k(c9);
                return u7.v.f41073a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u7.e] */
    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        switch (this.f37408a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                return (c8.e) this.f37409b.getValue();
        }
    }

    public C4507w(InterfaceC0537a interfaceC0537a) {
        this.f37408a = 0;
        this.f37409b = interfaceC0537a;
    }
}
