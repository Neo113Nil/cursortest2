package c6;

import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p8.EnumC4856b;
import p8.r;
import u7.v;
import v7.C5135p;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5609n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5610u;

    public /* synthetic */ l(int i, Object obj) {
        this.f5609n = i;
        this.f5610u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u7.e] */
    @Override // I7.a
    public final Object invoke() {
        switch (this.f5609n) {
            case 0:
                return new F1.a((y8.e) ((m) this.f5610u).f5617f.getValue());
            case 1:
                try {
                    return (List) ((I7.a) this.f5610u).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C5135p.f41439n;
                }
            case 2:
                return (List) this.f5610u;
            case 3:
                r rVar = (r) this.f5610u;
                rVar.getClass();
                try {
                    rVar.f39889P.l(2, 0, false);
                } catch (IOException e9) {
                    EnumC4856b enumC4856b = EnumC4856b.f39817w;
                    rVar.a(enumC4856b, enumC4856b, e9);
                }
                return v.f41350a;
            default:
                Object[] array = (Object[]) this.f5610u;
                kotlin.jvm.internal.h.e(array, "array");
                return new c8.g(array);
        }
    }
}
