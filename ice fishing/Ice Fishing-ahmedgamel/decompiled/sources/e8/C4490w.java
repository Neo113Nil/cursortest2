package e8;

import a.AbstractC0422a;
import b8.C0531c;
import b8.InterfaceC0529a;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import u7.EnumC5088f;

/* renamed from: e8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4490w implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37332a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37333b;

    public C4490w() {
        this.f37332a = 1;
        this.f37333b = AbstractC0422a.p(EnumC5088f.f41329n, new X.r(3, this));
    }

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object value) {
        switch (this.f37332a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(value, "value");
                qVar.a(c()).p(c());
                return;
        }
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        switch (this.f37332a) {
            case 0:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.h.e(decoder, "decoder");
                c8.e c9 = c();
                d8.a h9 = decoder.h(c9);
                int c10 = h9.c(c());
                if (c10 != -1) {
                    throw new C0531c(AbstractC4404f.e(c10, "Unexpected index "));
                }
                h9.k(c9);
                return u7.v.f41353a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u7.e] */
    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        switch (this.f37332a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                return (c8.e) this.f37333b.getValue();
        }
    }

    public C4490w(InterfaceC0529a interfaceC0529a) {
        this.f37332a = 0;
        this.f37333b = interfaceC0529a;
    }
}
