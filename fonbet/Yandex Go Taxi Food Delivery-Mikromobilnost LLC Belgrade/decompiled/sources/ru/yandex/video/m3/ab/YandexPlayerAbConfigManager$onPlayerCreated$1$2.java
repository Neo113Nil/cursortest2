package ru.yandex.video.m3.ab;

import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$onPlayerCreated$1$2", f = "YandexPlayerAbConfigManager.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager$onPlayerCreated$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ PlayerLifecycleObserver $lifecycleObserver;
    final /* synthetic */ YandexPlayer<?> $player;
    int label;
    final /* synthetic */ YandexPlayerAbConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerAbConfigManager$onPlayerCreated$1$2(PlayerLifecycleObserver playerLifecycleObserver, YandexPlayer<?> yandexPlayer, YandexPlayerAbConfigManager yandexPlayerAbConfigManager, Continuation<? super YandexPlayerAbConfigManager$onPlayerCreated$1$2> continuation) {
        super(2, continuation);
        this.$lifecycleObserver = playerLifecycleObserver;
        this.$player = yandexPlayer;
        this.this$0 = yandexPlayerAbConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerAbConfigManager$onPlayerCreated$1$2(this.$lifecycleObserver, this.$player, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerAbConfigManager$onPlayerCreated$1$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            n4u0 isReleasedFlow = this.$lifecycleObserver.getIsReleasedFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$player, this.$lifecycleObserver, this.this$0, null);
            this.label = 1;
            if (e.k(isReleasedFlow, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isReleased", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$onPlayerCreated$1$2$1", f = "YandexPlayerAbConfigManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$onPlayerCreated$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PlayerLifecycleObserver $lifecycleObserver;
        final /* synthetic */ YandexPlayer<?> $player;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ YandexPlayerAbConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(YandexPlayer<?> yandexPlayer, PlayerLifecycleObserver playerLifecycleObserver, YandexPlayerAbConfigManager yandexPlayerAbConfigManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$player = yandexPlayer;
            this.$lifecycleObserver = playerLifecycleObserver;
            this.this$0 = yandexPlayerAbConfigManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$player, this.$lifecycleObserver, this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public final Object invoke(boolean z, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CopyOnWriteArraySet copyOnWriteArraySet;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            if (this.Z$0) {
                this.$player.removeObserver(this.$lifecycleObserver);
                copyOnWriteArraySet = this.this$0.playerObservers;
                copyOnWriteArraySet.remove(this.$lifecycleObserver);
            }
            return zy11.a;
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super zy11>) obj2);
        }
    }
}
