package ru.yandex.logistics.sdk.cargo_form.impl.photocomments;

import defpackage.c0k0;
import defpackage.ny61;
import defpackage.r5s;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c0k0 b;

    public b(vpr vprVar, c0k0 c0k0Var) {
        this.a = vprVar;
        this.b = c0k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1 formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FormPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1) {
            formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1 = (FormPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1) continuation;
            int i2 = formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = (List) ((Map) obj).get(new r5s(this.b));
                    if (obj3 == null) {
                        obj3 = EmptyList.a;
                    }
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.L$0 = null;
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.L$1 = null;
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.L$2 = null;
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.L$3 = null;
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.I$0 = 0;
                    formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1 = new FormPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formPhotocommentsRepositoryImpl$getPhotocommentsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
