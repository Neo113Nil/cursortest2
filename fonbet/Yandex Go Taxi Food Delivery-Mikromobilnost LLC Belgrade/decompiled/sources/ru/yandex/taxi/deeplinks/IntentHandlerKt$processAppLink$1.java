package ru.yandex.taxi.deeplinks;

import android.net.Uri;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.vu2;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loep0;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lo5u;", "<anonymous>", "(Loep0;Landroid/net/Uri;)Lo5u;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.IntentHandlerKt$processAppLink$1", f = "IntentHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class IntentHandlerKt$processAppLink$1 extends SuspendLambda implements zls {
    final /* synthetic */ vu2 $this_processAppLink;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentHandlerKt$processAppLink$1(vu2 vu2Var, Continuation continuation) {
        super(3, continuation);
        this.$this_processAppLink = vu2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntentHandlerKt$processAppLink$1 intentHandlerKt$processAppLink$1 = new IntentHandlerKt$processAppLink$1(this.$this_processAppLink, (Continuation) obj3);
        intentHandlerKt$processAppLink$1.L$0 = (oep0) obj;
        intentHandlerKt$processAppLink$1.L$1 = (Uri) obj2;
        return intentHandlerKt$processAppLink$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oep0 oep0Var = (oep0) this.L$0;
        Uri uri = (Uri) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vu2 vu2Var = this.$this_processAppLink;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = vu2Var.b(oep0Var, uri, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (o5u) obj;
    }
}
