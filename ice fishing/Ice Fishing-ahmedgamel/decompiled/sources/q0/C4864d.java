package q0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import kotlin.jvm.internal.h;
import p0.AbstractC4827b;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4864d extends AbstractC4866f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4864d(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.f40024b = i;
    }

    @Override // q0.AbstractC4866f
    public GetTopicsRequest a(C4861a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f40024b) {
            case 1:
                h.e(request, "request");
                adsSdkName = AbstractC4827b.c().setAdsSdkName("com.google.android.gms.ads");
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(request.f40019a);
                build = shouldRecordObservation.build();
                h.d(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.a(request);
        }
    }
}
