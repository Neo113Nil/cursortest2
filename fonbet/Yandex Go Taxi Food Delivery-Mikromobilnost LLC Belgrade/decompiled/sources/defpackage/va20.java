package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class va20 implements b3u0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ va20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, Map map) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((IReporterYandex) obj).reportStatboxEvent(str, (Map<String, Object>) map);
                break;
            default:
                Iterator it = ((List) ((asd) obj).e.getValue()).iterator();
                while (it.hasNext()) {
                    ((b3u0) it.next()).reportStatboxEvent(str, map);
                }
                break;
        }
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, String str2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((IReporterYandex) obj).reportStatboxEvent(str, str2);
                break;
            default:
                Iterator it = ((List) ((asd) obj).e.getValue()).iterator();
                while (it.hasNext()) {
                    ((b3u0) it.next()).reportStatboxEvent(str, str2);
                }
                break;
        }
    }
}
