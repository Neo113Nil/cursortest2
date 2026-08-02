package F5;

import java.util.Map;
import u7.C5081g;
import v7.t;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1006n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f1007u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i) {
        super(0);
        this.f1006n = i;
        this.f1007u = mVar;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f1006n) {
            case 0:
                StringBuilder sb = new StringBuilder("onesignal/");
                m mVar = this.f1007u;
                sb.append(mVar.f1008e.getSdkBase());
                sb.append('/');
                sb.append(mVar.f1008e.getSdkBaseVersion());
                return t.u(new C5081g(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
            default:
                m mVar2 = this.f1007u;
                Map map = (Map) mVar2.f1009f.getValue();
                f fVar = mVar2.f1008e;
                return d6.c.b(map, fVar.getAppIdForHeaders(), fVar.getApiBaseUrl(), fVar.isOtelExporterLoggingEnabled());
        }
    }
}
