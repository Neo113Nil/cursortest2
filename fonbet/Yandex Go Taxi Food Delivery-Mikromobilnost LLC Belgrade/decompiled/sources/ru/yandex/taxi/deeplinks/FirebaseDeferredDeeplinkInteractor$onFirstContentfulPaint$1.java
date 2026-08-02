package ru.yandex.taxi.deeplinks;

import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.deeplinks.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1", f = "FirebaseDeferredDeeplinkInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FirebaseDeferredDeeplinkInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                final h hVar = this.this$0;
                final int i3 = 0;
                cey.b(hVar.c, Lifecycle.Event.ON_RESUME, new Runnable() { // from class: ccr
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        h hVar2 = hVar;
                        switch (i4) {
                            case 0:
                                if (!hVar2.d(hVar2.d.k(), Constants.DEEPLINK)) {
                                    hVar2.d.k().registerOnSharedPreferenceChangeListener(hVar2.e);
                                    break;
                                }
                                break;
                            default:
                                hVar2.d.k().unregisterOnSharedPreferenceChangeListener(hVar2.e);
                                break;
                        }
                    }
                });
                final h hVar2 = this.this$0;
                cey.b(hVar2.c, Lifecycle.Event.ON_PAUSE, new Runnable() { // from class: ccr
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i2;
                        h hVar22 = hVar2;
                        switch (i4) {
                            case 0:
                                if (!hVar22.d(hVar22.d.k(), Constants.DEEPLINK)) {
                                    hVar22.d.k().registerOnSharedPreferenceChangeListener(hVar22.e);
                                    break;
                                }
                                break;
                            default:
                                hVar22.d.k().unregisterOnSharedPreferenceChangeListener(hVar22.e);
                                break;
                        }
                    }
                });
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.this$0.d.k().unregisterOnSharedPreferenceChangeListener(this.this$0.e);
            throw th;
        }
    }
}
