package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain;

import defpackage.d3a;
import defpackage.f9n0;
import defpackage.i9n0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.tpr;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class a {
    public static final /* synthetic */ int c = 0;
    public final pwy0 a;
    public final d3a b;

    public a(pwy0 pwy0Var, d3a d3aVar) {
        this.a = pwy0Var;
        this.b = d3aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1 scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1;
        int i;
        if (continuationImpl instanceof ScootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1) {
            scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1 = (ScootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1) continuationImpl;
            int i2 = scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    tpr a = this.a.a();
                    i9n0.Companion.getClass();
                    m0 m0Var = new m0(a, com.yandex.go.scooters.utils.a.a(this.b, i9n0.i), new ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1(this, null));
                    scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.label = 1;
                    obj = e.A(m0Var, scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1);
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
                f9n0 f9n0Var = (f9n0) obj;
                return f9n0Var != null ? f9n0.d : f9n0Var;
            }
        }
        scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1 = new ScootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoConfigInteractor$getCurrentPhotoConfig$1.label;
        if (i != 0) {
        }
        f9n0 f9n0Var2 = (f9n0) obj2;
        if (f9n0Var2 != null) {
        }
    }
}
