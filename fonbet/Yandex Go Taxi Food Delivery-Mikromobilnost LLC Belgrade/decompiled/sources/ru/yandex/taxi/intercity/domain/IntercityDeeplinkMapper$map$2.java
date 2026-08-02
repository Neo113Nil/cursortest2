package ru.yandex.taxi.intercity.domain;

import android.net.Uri;
import com.yandex.go.dto.response.Action$CityMode;
import com.yandex.go.dto.response.n;
import com.yandex.go.dto.response.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.snw;
import defpackage.tnw;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltnw;", "<anonymous>", "(Ltse;)Ltnw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.intercity.domain.IntercityDeeplinkMapper$map$2", f = "IntercityDeeplinkMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class IntercityDeeplinkMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ snw $deeplink;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDeeplinkMapper$map$2(snw snwVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$deeplink = snwVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDeeplinkMapper$map$2(this.$deeplink, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDeeplinkMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r9 == null) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Uri uri = this.$deeplink.a;
        String queryParameter = uri.getQueryParameter("mode");
        String str = queryParameter == null ? "" : queryParameter;
        String queryParameter2 = uri.getQueryParameter("screen-name");
        String str2 = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri.getQueryParameter("layers-context");
        kotlinx.serialization.json.b bVar = queryParameter3 != null ? (kotlinx.serialization.json.b) ((xnt) this.this$0.a).c(queryParameter3, kotlinx.serialization.json.b.Companion.serializer()) : null;
        String queryParameter4 = uri.getQueryParameter("continuation-action");
        if (queryParameter4 != null) {
            pVar = (p) ((xnt) this.this$0.a).c(queryParameter4, p.Companion.serializer());
        }
        pVar = n.INSTANCE;
        return new tnw(str, str2, bVar, new Action$CityMode.Context(pVar), null);
    }
}
