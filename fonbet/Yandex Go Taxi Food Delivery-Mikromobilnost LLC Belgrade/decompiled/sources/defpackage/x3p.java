package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.external_service.router.b;
import com.yandex.go.ugc.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.a;

/* loaded from: classes12.dex */
public final class x3p implements vje {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3p(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        int i = this.a;
        n5u n5uVar = n5u.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri data = intent.getData();
                return (data != null && ((b) obj2).L.a(data, (h1p) obj)) ? new m5u(false, false) : n5uVar;
            case 1:
                return a.a((a) obj2, intent, ((zuo0) obj).getSessionId(), (ContinuationImpl) continuation);
            default:
                Uri data2 = intent.getData();
                if (data2 == null || !"ugc".equalsIgnoreCase(data2.getAuthority())) {
                    return n5uVar;
                }
                if (jl40.l((String) obj2, data2.getQueryParameter("id"))) {
                    return new m5u(false, false);
                }
                ((f) obj).r(new qu(9));
                return n5uVar;
        }
    }
}
