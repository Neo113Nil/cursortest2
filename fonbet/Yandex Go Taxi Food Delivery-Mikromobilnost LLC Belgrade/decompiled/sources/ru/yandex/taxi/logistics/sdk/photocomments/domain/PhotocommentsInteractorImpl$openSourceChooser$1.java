package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import defpackage.fza0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsInteractorImpl$openSourceChooser$1", f = "PhotocommentsInteractorImpl.kt", l = {74, HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsInteractorImpl$openSourceChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ okb0 $position;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsInteractorImpl$openSourceChooser$1(a aVar, okb0 okb0Var, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = okb0Var;
        this.$maxHeight = i;
        this.$maxWidth = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotocommentsInteractorImpl$openSourceChooser$1(this.this$0, this.$position, this.$maxHeight, this.$maxWidth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotocommentsInteractorImpl$openSourceChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.photocomments.domain.a.b(r1, r2, r4, r5, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.photocomments.domain.a.c(r1, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r7 == r0) goto L22;
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
            fza0 fza0Var = this.this$0.b;
            Permission permission = Permission.CAMERA;
            this.label = 1;
            obj = fza0Var.a(permission, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a aVar = this.this$0;
        if (booleanValue) {
            okb0 okb0Var = this.$position;
            int i2 = this.$maxHeight;
            int i3 = this.$maxWidth;
            this.Z$0 = booleanValue;
            this.label = 2;
        } else {
            this.Z$0 = booleanValue;
            this.label = 3;
        }
    }
}
