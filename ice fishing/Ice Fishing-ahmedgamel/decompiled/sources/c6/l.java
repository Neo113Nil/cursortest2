package c6;

import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p8.EnumC4856b;
import p8.r;
import u7.v;
import v7.C5125p;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5785n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5786u;

    public /* synthetic */ l(int i, Object obj) {
        this.f5785n = i;
        this.f5786u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u7.e] */
    @Override // I7.a
    public final Object invoke() {
        switch (this.f5785n) {
            case 0:
                return new n4.c((y8.e) ((m) this.f5786u).f5793f.getValue());
            case 1:
                try {
                    return (List) ((I7.a) this.f5786u).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C5125p.f41221n;
                }
            case 2:
                return (List) this.f5786u;
            case 3:
                r rVar = (r) this.f5786u;
                rVar.getClass();
                try {
                    rVar.f39939P.l(2, 0, false);
                } catch (IOException e9) {
                    EnumC4856b enumC4856b = EnumC4856b.f39867w;
                    rVar.a(enumC4856b, enumC4856b, e9);
                }
                return v.f41073a;
            default:
                Object[] array = (Object[]) this.f5786u;
                kotlin.jvm.internal.h.e(array, "array");
                return new c8.g(array);
        }
    }
}
