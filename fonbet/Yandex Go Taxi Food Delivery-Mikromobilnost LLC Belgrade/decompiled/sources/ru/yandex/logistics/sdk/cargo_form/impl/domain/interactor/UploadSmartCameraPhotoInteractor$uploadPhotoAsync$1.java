package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import android.graphics.Bitmap;
import com.yandex.delivery.libs.imageupload.api.UploadImageType;
import defpackage.jgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1", f = "UploadSmartCameraPhotoInteractor.kt", l = {50, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $formStateKey;
    final /* synthetic */ Object $formStateValue;
    final /* synthetic */ sls $onError;
    final /* synthetic */ Bitmap $photo;
    final /* synthetic */ String $taskId;
    final /* synthetic */ Object $taskParams;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1$2", f = "UploadSmartCameraPhotoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements tls {
        final /* synthetic */ sls $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(sls slsVar, Continuation continuation) {
            super(1, continuation);
            this.$onError = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$onError, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Continuation) obj);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$onError.invoke();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1(m mVar, Bitmap bitmap, String str, String str2, Object obj, Object obj2, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$photo = bitmap;
        this.$formStateKey = str;
        this.$taskId = str2;
        this.$formStateValue = obj;
        this.$taskParams = obj2;
        this.$onError = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1(this.this$0, this.$photo, this.$formStateKey, this.$taskId, this.$formStateValue, this.$taskParams, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r13.c(r0, r12) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                jgz jgzVar = jgz.a;
                jgz.a("Image upload was cancelled.", new Object[0]);
                throw e;
            }
            jgz jgzVar2 = jgz.a;
            jgz.d(e, "Error while uploading image", new Object[0]);
            com.yandex.delivery.utils.dialogmanager.a aVar = this.this$0.e;
            tls anonymousClass2 = new AnonymousClass2(this.$onError, null);
            this.L$0 = null;
            this.label = 2;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.delivery.libs.imageupload.impl.domain.b bVar = this.this$0.a;
            Bitmap bitmap = this.$photo;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            tpr F = kotlinx.coroutines.flow.e.F(bVar.a(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), UploadImageType.PHOTOCOMMENT), this.this$0.b.b);
            l lVar = new l(this.this$0, this.$formStateKey, this.$taskId, this.$formStateValue, this.$taskParams, this.$onError);
            this.label = 1;
            Object collect = F.collect(lVar, this);
            this = collect;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            this = this;
        }
        return zy11.a;
    }
}
