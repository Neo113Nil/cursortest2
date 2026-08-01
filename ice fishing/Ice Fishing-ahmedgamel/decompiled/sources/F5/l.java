package F5;

import L3.F;
import java.util.Map;
import u7.C5089g;
import v7.t;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f980n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f981u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i) {
        super(0);
        this.f980n = i;
        this.f981u = mVar;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f980n) {
            case 0:
                StringBuilder sb = new StringBuilder("onesignal/");
                m mVar = this.f981u;
                sb.append(mVar.f982e.getSdkBase());
                sb.append('/');
                sb.append(mVar.f982e.getSdkBaseVersion());
                return t.Q(new C5089g(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
            default:
                m mVar2 = this.f981u;
                Map map = (Map) mVar2.f983f.getValue();
                f fVar = mVar2.f982e;
                return F.i(map, fVar.getAppIdForHeaders(), fVar.getApiBaseUrl(), fVar.isOtelExporterLoggingEnabled());
        }
    }
}
