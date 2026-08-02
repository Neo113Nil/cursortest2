package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Buffer;
import okio.Buffer$outputStream$1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class EquatableBitmap$Companion$toEquatable$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bitmap $this_toEquatable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EquatableBitmap$Companion$toEquatable$2(Bitmap bitmap, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_toEquatable = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new EquatableBitmap$Companion$toEquatable$2(this.$this_toEquatable, continuation, 0);
            default:
                return new EquatableBitmap$Companion$toEquatable$2(this.$this_toEquatable, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((EquatableBitmap$Companion$toEquatable$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Bitmap bitmap = this.$this_toEquatable;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new EquatableBitmap(bitmap);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int min = Math.min(Math.min(bitmap.getWidth(), bitmap.getHeight()), 1080);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, min, min, false);
                createScaledBitmap.getClass();
                Buffer buffer = new Buffer();
                createScaledBitmap.compress(RealProfilePhotoManager.PHOTO_FORMAT, 85, new Buffer$outputStream$1(buffer, 0));
                return buffer.readByteString(buffer.size);
        }
    }
}
