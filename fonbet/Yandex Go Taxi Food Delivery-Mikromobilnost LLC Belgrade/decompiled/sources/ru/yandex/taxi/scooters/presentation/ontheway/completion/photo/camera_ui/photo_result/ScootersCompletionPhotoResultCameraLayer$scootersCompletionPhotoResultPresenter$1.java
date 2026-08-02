package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import android.util.Size;
import android.view.View;
import com.yandex.go.design.view.GoImageView;
import defpackage.dvw;
import defpackage.i18;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/util/Size;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1", f = "ScootersCompletionPhotoResultCameraLayer.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        this.L$0 = bVar;
        this.label = 1;
        final j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        GoImageView goImageView = bVar.j().g;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!goImageView.isLaidOut() || goImageView.isLayoutRequested()) {
            goImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1$invokeSuspend$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    i18.this.resumeWith(new Size(view.getWidth(), view.getHeight()));
                }
            });
        } else {
            j18Var.resumeWith(new Size(goImageView.getWidth(), goImageView.getHeight()));
        }
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
