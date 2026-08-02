package q0;

import S7.C0393g;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import n.ExecutorC4756a;
import p0.AbstractC4827b;
import z7.InterfaceC5240d;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4866f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f40029a;

    public AbstractC4866f(TopicsManager mTopicsManager) {
        h.e(mTopicsManager, "mTopicsManager");
        this.f40029a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(AbstractC4866f abstractC4866f, C4861a c4861a, InterfaceC5240d interfaceC5240d) {
        C4865e c4865e;
        int i;
        List topics;
        Iterator it;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        if (interfaceC5240d instanceof C4865e) {
            c4865e = (C4865e) interfaceC5240d;
            int i4 = c4865e.f40028w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4865e.f40028w = i4 - Integer.MIN_VALUE;
                Object obj = c4865e.f40026u;
                A7.a aVar = A7.a.f215n;
                i = c4865e.f40028w;
                if (i != 0) {
                    Q3.b.s(obj);
                    GetTopicsRequest a9 = abstractC4866f.a(c4861a);
                    c4865e.f40025n = abstractC4866f;
                    c4865e.f40028w = 1;
                    C0393g c0393g = new C0393g(1, A8.b.n(c4865e));
                    c0393g.r();
                    abstractC4866f.f40029a.getTopics(a9, new ExecutorC4756a(1), new K.h(c0393g));
                    obj = c0393g.q();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC4866f = c4865e.f40025n;
                    Q3.b.s(obj);
                }
                GetTopicsResponse response = AbstractC4827b.g(obj);
                abstractC4866f.getClass();
                h.e(response, "response");
                ArrayList arrayList = new ArrayList();
                topics = response.getTopics();
                it = topics.iterator();
                while (it.hasNext()) {
                    Topic h3 = AbstractC4827b.h(it.next());
                    taxonomyVersion = h3.getTaxonomyVersion();
                    modelVersion = h3.getModelVersion();
                    topicId = h3.getTopicId();
                    arrayList.add(new C4863c(topicId, taxonomyVersion, modelVersion));
                }
                return new C4862b(arrayList);
            }
        }
        c4865e = new C4865e(abstractC4866f, interfaceC5240d);
        Object obj2 = c4865e.f40026u;
        A7.a aVar2 = A7.a.f215n;
        i = c4865e.f40028w;
        if (i != 0) {
        }
        GetTopicsResponse response2 = AbstractC4827b.g(obj2);
        abstractC4866f.getClass();
        h.e(response2, "response");
        ArrayList arrayList2 = new ArrayList();
        topics = response2.getTopics();
        it = topics.iterator();
        while (it.hasNext()) {
        }
        return new C4862b(arrayList2);
    }

    public GetTopicsRequest a(C4861a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        h.e(request, "request");
        adsSdkName = AbstractC4827b.c().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        h.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public Object b(C4861a c4861a, InterfaceC5240d interfaceC5240d) {
        return c(this, c4861a, interfaceC5240d);
    }
}
