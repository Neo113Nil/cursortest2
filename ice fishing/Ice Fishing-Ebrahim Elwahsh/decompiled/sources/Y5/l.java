package Y5;

import g1.C4523c;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import l8.EnumC4710b;
import l8.r;
import q7.v;
import r7.C4985p;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4014n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4015u;

    public /* synthetic */ l(int i, Object obj) {
        this.f4014n = i;
        this.f4015u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, q7.e] */
    @Override // E7.a
    public final Object invoke() {
        switch (this.f4014n) {
            case 0:
                return new C4523c((u8.e) ((m) this.f4015u).f4022f.getValue());
            case 1:
                try {
                    return (List) ((E7.a) this.f4015u).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C4985p.f40358n;
                }
            case 2:
                return (List) this.f4015u;
            case 3:
                r rVar = (r) this.f4015u;
                rVar.getClass();
                try {
                    rVar.f39172P.k(2, 0, false);
                } catch (IOException e6) {
                    EnumC4710b enumC4710b = EnumC4710b.f39100w;
                    rVar.a(enumC4710b, enumC4710b, e6);
                }
                return v.f40183a;
            default:
                Object[] array = (Object[]) this.f4015u;
                kotlin.jvm.internal.h.e(array, "array");
                return new Y7.g(array);
        }
    }
}
