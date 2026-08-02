package ru.yandex.taxi.deeplinks;

import android.net.Uri;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.v770;
import defpackage.z0h;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Loep0;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lv770;", "openReason", "Lru/yandex/taxi/deeplinks/DeeplinkSource;", "deeplinkSource", "Lo5u;", "<anonymous>", "(Loep0;Landroid/net/Uri;Lv770;Lru/yandex/taxi/deeplinks/DeeplinkSource;)Lo5u;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.IntentHandlerKt$processDeeplink$1", f = "IntentHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class IntentHandlerKt$processDeeplink$1 extends SuspendLambda implements dms {
    final /* synthetic */ z0h $this_processDeeplink;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentHandlerKt$processDeeplink$1(z0h z0hVar, Continuation continuation) {
        super(5, continuation);
        this.$this_processDeeplink = z0hVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        IntentHandlerKt$processDeeplink$1 intentHandlerKt$processDeeplink$1 = new IntentHandlerKt$processDeeplink$1(this.$this_processDeeplink, (Continuation) obj5);
        intentHandlerKt$processDeeplink$1.L$0 = (oep0) obj;
        intentHandlerKt$processDeeplink$1.L$1 = (Uri) obj2;
        intentHandlerKt$processDeeplink$1.L$2 = (v770) obj3;
        intentHandlerKt$processDeeplink$1.L$3 = (DeeplinkSource) obj4;
        return intentHandlerKt$processDeeplink$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oep0 oep0Var = (oep0) this.L$0;
        Uri uri = (Uri) this.L$1;
        v770 v770Var = (v770) this.L$2;
        DeeplinkSource deeplinkSource = (DeeplinkSource) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            z0h z0hVar = this.$this_processDeeplink;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = z0hVar.a(oep0Var, uri, v770Var, deeplinkSource, this);
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
