package defpackage;

import com.yandex.go.feedsdk.log.a;
import com.yandex.go.feedsdk.log.c;
import com.yandex.go.feedsdk.log.experiments.FeedSdkErrorReportingExperiment;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class zpq implements h3y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zpq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.h3y
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hzk hzkVar = (hzk) obj;
                c cVar = (c) hzkVar.a;
                String str = (String) hzkVar.b;
                if (!((FeedSdkErrorReportingExperiment) cVar.b.getValue()).b) {
                    return o430.z;
                }
                return new a(((FeedSdkErrorReportingExperiment) cVar.b.getValue()).f, str, (List) cVar.c.getValue(), (List) cVar.d.getValue(), (List) cVar.e.getValue());
            default:
                return (say0) obj;
        }
    }
}
