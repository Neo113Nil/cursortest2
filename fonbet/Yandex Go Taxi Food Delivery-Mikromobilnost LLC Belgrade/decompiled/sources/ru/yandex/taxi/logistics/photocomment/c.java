package ru.yandex.taxi.logistics.photocomment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import defpackage.a60;
import defpackage.ny61;
import defpackage.r40;
import defpackage.s40;
import defpackage.y50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes5.dex */
public final class c {
    public final y50 a;
    public final g b;

    public c(y50 y50Var, g gVar) {
        this.a = y50Var;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, ContinuationImpl continuationImpl) {
        PhotoCommentsCallbackImpl$getActivityResult$1 photoCommentsCallbackImpl$getActivityResult$1;
        int i;
        if (continuationImpl instanceof PhotoCommentsCallbackImpl$getActivityResult$1) {
            photoCommentsCallbackImpl$getActivityResult$1 = (PhotoCommentsCallbackImpl$getActivityResult$1) continuationImpl;
            int i2 = photoCommentsCallbackImpl$getActivityResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photoCommentsCallbackImpl$getActivityResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = photoCommentsCallbackImpl$getActivityResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoCommentsCallbackImpl$getActivityResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a60 a60Var = (a60) this.a;
                    a60Var.getClass();
                    try {
                        a60Var.e(HProv.PP_SECURITY_LEVEL, intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                    photoCommentsCallbackImpl$getActivityResult$1.L$0 = null;
                    photoCommentsCallbackImpl$getActivityResult$1.label = 1;
                    obj = this.b.d(HProv.PP_SECURITY_LEVEL, photoCommentsCallbackImpl$getActivityResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                r40 r40Var = (r40) obj;
                return new s40(r40Var.a, r40Var.c);
            }
        }
        photoCommentsCallbackImpl$getActivityResult$1 = new PhotoCommentsCallbackImpl$getActivityResult$1(this, continuationImpl);
        Object obj2 = photoCommentsCallbackImpl$getActivityResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoCommentsCallbackImpl$getActivityResult$1.label;
        if (i != 0) {
        }
        r40 r40Var2 = (r40) obj2;
        return new s40(r40Var2.a, r40Var2.c);
    }
}
