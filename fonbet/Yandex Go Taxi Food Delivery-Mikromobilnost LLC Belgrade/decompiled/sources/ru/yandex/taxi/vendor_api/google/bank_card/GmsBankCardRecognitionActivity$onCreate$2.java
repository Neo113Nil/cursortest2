package ru.yandex.taxi.vendor_api.google.bank_card;

import android.util.Size;
import android.view.View;
import androidx.camera.core.j;
import androidx.lifecycle.Lifecycle;
import defpackage.cmi;
import defpackage.co7;
import defpackage.eja1;
import defpackage.fsy0;
import defpackage.i5f0;
import defpackage.igh0;
import defpackage.jln;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o89;
import defpackage.ooc;
import defpackage.tse;
import defpackage.unb1;
import defpackage.v5a1;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.camera.ml.c;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.bank_card.GmsBankCardRecognitionActivity$onCreate$2", f = "GmsBankCardRecognitionActivity.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class GmsBankCardRecognitionActivity$onCreate$2 extends SuspendLambda implements wls {
    final /* synthetic */ GmsBankCardRecognitionActivity $context;
    int label;
    final /* synthetic */ GmsBankCardRecognitionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsBankCardRecognitionActivity$onCreate$2(GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity, GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity2, Continuation continuation) {
        super(2, continuation);
        this.$context = gmsBankCardRecognitionActivity;
        this.this$0 = gmsBankCardRecognitionActivity2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GmsBankCardRecognitionActivity$onCreate$2(this.$context, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GmsBankCardRecognitionActivity$onCreate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        r8 = r8.this$0.mlCameraController;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        co7 co7Var;
        CircleButtonImageView circleButtonImageView;
        c cVar;
        CircleButtonImageView circleButtonImageView2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            i5f0 i5f0Var = i5f0.b;
            o89 c = v5a1.c(this.$context);
            this.label = 1;
            obj = ooc.e(c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.this$0.camera = ((i5f0) obj).d(this.$context, xs7.c, new j[0]);
        jln jlnVar = new jln(27, unb1.c(fsy0.c));
        View findViewById = this.this$0.findViewById(igh0.bank_card_camera_target);
        GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity = this.this$0;
        c cVar2 = new c(this.$context, (CameraPreview) gmsBankCardRecognitionActivity.findViewById(igh0.bank_card_camera_preview), eja1.s(this.this$0));
        cVar2.d = new a(jlnVar, findViewById, this.this$0);
        gmsBankCardRecognitionActivity.mlCameraController = cVar2;
        co7Var = this.this$0.camera;
        if (co7Var == null) {
            co7Var = null;
        }
        boolean p = co7Var.c().p();
        GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity2 = this.this$0;
        if (p) {
            circleButtonImageView2 = gmsBankCardRecognitionActivity2.btnFlashLight;
            (circleButtonImageView2 != null ? circleButtonImageView2 : null).setOnClickListener(new cmi(27, this.this$0));
        } else {
            circleButtonImageView = gmsBankCardRecognitionActivity2.btnFlashLight;
            (circleButtonImageView != null ? circleButtonImageView : null).setVisibility(8);
        }
        if (this.this$0.getLifecycle().b().a(Lifecycle.State.RESUMED) && cVar != null) {
            cVar.b(new Size(720, 1280));
        }
        return zy11.a;
    }
}
