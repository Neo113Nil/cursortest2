package ru.yandex.video.m3.ab;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.ab.config.AbConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$initListenersNotifications$1", f = "YandexPlayerAbConfigManager.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager$initListenersNotifications$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ YandexPlayerAbConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerAbConfigManager$initListenersNotifications$1(YandexPlayerAbConfigManager yandexPlayerAbConfigManager, Continuation<? super YandexPlayerAbConfigManager$initListenersNotifications$1> continuation) {
        super(2, continuation);
        this.this$0 = yandexPlayerAbConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerAbConfigManager$initListenersNotifications$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerAbConfigManager$initListenersNotifications$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40Var = this.this$0.actualPublishedAbConfig;
            final YandexPlayerAbConfigManager yandexPlayerAbConfigManager = this.this$0;
            vpr vprVar = new vpr() { // from class: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$initListenersNotifications$1.1
                public final Object emit(AbConfig abConfig, Continuation<? super zy11> continuation) {
                    CopyOnWriteArraySet copyOnWriteArraySet;
                    if (abConfig != null) {
                        copyOnWriteArraySet = YandexPlayerAbConfigManager.this.abConfigUpdatesListeners;
                        Iterator<T> it = copyOnWriteArraySet.iterator();
                        while (it.hasNext()) {
                            ((YandexPlayerAbConfigUpdateListener) it.next()).onAbConfigUpdated(abConfig.getTestIds());
                        }
                    }
                    return zy11.a;
                }

                @Override // defpackage.vpr
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((AbConfig) obj2, (Continuation<? super zy11>) continuation);
                }
            };
            this.label = 1;
            if (pz40Var.collect(vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
