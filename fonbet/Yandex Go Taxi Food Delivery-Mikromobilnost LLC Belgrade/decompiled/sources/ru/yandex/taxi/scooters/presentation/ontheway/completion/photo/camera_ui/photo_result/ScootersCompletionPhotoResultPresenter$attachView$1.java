package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import android.graphics.drawable.BitmapDrawable;
import android.util.Size;
import defpackage.f9n0;
import defpackage.kpm0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pib0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter$attachView$1", f = "ScootersCompletionPhotoResultPresenter.kt", l = {64, 65, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoResultPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ pib0 $mvpView;
    final /* synthetic */ kpm0 $photo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoResultPresenter$attachView$1(c cVar, pib0 pib0Var, kpm0 kpm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$mvpView = pib0Var;
        this.$photo = kpm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionPhotoResultPresenter$attachView$1(this.this$0, this.$mvpView, this.$photo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoResultPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r9 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar = this.this$0.I;
            this.label = 1;
            obj = tlsVar.invoke(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((f9n0) obj).a) {
                    this.this$0.Lg();
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            this.$mvpView.N((BitmapDrawable) obj);
            this.$mvpView.B();
            ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a aVar = this.this$0.D;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = aVar.a(this);
        }
        this.this$0.y.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1 scootersCompletionPhotoResultPresenter$attachView$1$drawable$1 = new ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1(this.this$0, this.$photo, (Size) obj, null);
        this.L$0 = null;
        this.label = 2;
        obj = tje.k0(mdhVar, scootersCompletionPhotoResultPresenter$attachView$1$drawable$1, this);
    }
}
