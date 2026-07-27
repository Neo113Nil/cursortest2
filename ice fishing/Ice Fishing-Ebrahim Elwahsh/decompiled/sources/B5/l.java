package B5;

import java.util.Map;
import q7.C4938g;
import r7.t;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f351n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f352u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i) {
        super(0);
        this.f351n = i;
        this.f352u = mVar;
    }

    @Override // E7.a
    public final Object invoke() {
        switch (this.f351n) {
            case 0:
                StringBuilder sb = new StringBuilder("onesignal/");
                m mVar = this.f352u;
                sb.append(mVar.f353e.getSdkBase());
                sb.append('/');
                sb.append(mVar.f353e.getSdkBaseVersion());
                return t.A(new C4938g(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
            default:
                m mVar2 = this.f352u;
                Map map = (Map) mVar2.f354f.getValue();
                f fVar = mVar2.f353e;
                return w8.a.c(map, fVar.getAppIdForHeaders(), fVar.getApiBaseUrl(), fVar.isOtelExporterLoggingEnabled());
        }
    }
}
