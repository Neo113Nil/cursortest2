package defpackage;

import android.content.Context;
import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.flex.utils.b;
import com.yandex.plus.bdui.plus.analytics.d;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.content.j;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes4.dex */
public final /* synthetic */ class os implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ os(ljf ljfVar, Function2 function2, eul eulVar, mqs mqsVar, c cVar, String str) {
        this.a = 1;
        this.e = ljfVar;
        this.f = function2;
        this.g = eulVar;
        this.b = mqsVar;
        this.c = cVar;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Continuation continuation = null;
        Object obj = this.f;
        Object obj2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                mmo mmoVar = (mmo) obj6;
                String str = (String) obj3;
                oq oqVar = (oq) obj;
                asq.t(z5l.g((z5l) mmoVar.d, (c) obj5, ((kxi) mmoVar.e).a(str), null, (mqs) obj4, 0, 0, null, oqVar, null, new qs(oqVar, continuation, 0), 23796), (Context) mmoVar.b, new p1n(8));
                ((ae5) obj2).invoke(Boolean.FALSE, str);
                return Unit.a;
            case 1:
                ljf ljfVar = (ljf) obj6;
                asq.t(z5l.e(ljfVar.a(), new jjf((Function2) this.f, (eul) obj2, (mqs) obj4, (c) obj5, ljfVar, (String) obj3, (Continuation) null)), ljfVar.a, new p1n(8));
                return Unit.a;
            case 2:
                lni lniVar = (lni) obj3;
                ssg.a(3, "MusicMatchRecognitionService", "connected", null);
                ((b6n) obj6).invoke();
                dq7 dq7Var = ca8.a;
                lniVar.e = x97.y((mm6) obj5, mn7.d, null, new ckg((yk3) obj4, lniVar, (j6e) obj, (i50) obj2, (Continuation) null, 7), 2);
                return Unit.a;
            case 3:
                return new teg((t4a) ((t0a) obj6).invoke(), new k((o) obj, (b) obj2), (a) obj3, (a) obj5, (tf6) obj4);
            case 4:
                return new d((Function0) obj3, (Function0) obj5, (Function0) obj4, (com.yandex.plus.log.api.b) obj, new p(16, (com.yandex.plus.pay.internal.benchmark.a) ((Function0) obj6).invoke(), (PlusPayCompositeOffers.Offer) obj2));
            case 5:
                pr prVar = new pr((com.yandex.plus.pay.ui.core.api.common.a) obj6, (com.yandex.plus.core.imageloader.b) obj3, (com.yandex.plus.pay.ui.design.api.api.a) obj5, (y) obj4, (com.yandex.plus.bdui.plus.checkout.action.a) obj, (com.yandex.plus.log.api.b) obj2, 29);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return new com.yandex.plus.bdui.content.c(null, null, ern.a(j.class), prVar, e5bVar);
            default:
                com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                jVar.a = (com.yandex.plus.bdui.plus.checkout.webview.contract.a) obj5;
                jVar.b = (com.yandex.plus.pay.ui.webview.family.domain.a) obj4;
                jVar.c = (String) obj3;
                jVar.d = (q) obj;
                jVar.e = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) obj2;
                return ((com.yandex.plus.pay.ui.webview.family.ui.c) obj6).a(jVar);
        }
    }

    public /* synthetic */ os(com.yandex.plus.pay.ui.webview.family.ui.c cVar, com.yandex.plus.bdui.plus.checkout.webview.contract.a aVar, com.yandex.plus.pay.ui.webview.family.domain.a aVar2, String str, q qVar, com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar3) {
        this.a = 6;
        this.e = cVar;
        this.c = aVar;
        this.b = aVar2;
        this.d = str;
        this.f = qVar;
        this.g = aVar3;
    }

    public /* synthetic */ os(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.e = obj;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
