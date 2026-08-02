package ru.yandex.video.m3.ab;

import android.util.Log;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ab.config.AbConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$getConfig$abConfig$2$1", f = "YandexPlayerAbConfigManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager$getConfig$abConfig$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ AbConfig $it;
    final /* synthetic */ String $vsid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerAbConfigManager$getConfig$abConfig$2$1(String str, AbConfig abConfig, Continuation<? super YandexPlayerAbConfigManager$getConfig$abConfig$2$1> continuation) {
        super(2, continuation);
        this.$vsid = str;
        this.$it = abConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerAbConfigManager$getConfig$abConfig$2$1(this.$vsid, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerAbConfigManager$getConfig$abConfig$2$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Log.i("YP:ABExps", "player with vsid=" + this.$vsid + " received config=" + this.$it);
        return zy11.a;
    }
}
