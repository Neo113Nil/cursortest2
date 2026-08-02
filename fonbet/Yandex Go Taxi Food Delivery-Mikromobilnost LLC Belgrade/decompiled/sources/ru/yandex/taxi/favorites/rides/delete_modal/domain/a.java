package ru.yandex.taxi.favorites.rides.delete_modal.domain;

import android.content.Context;
import defpackage.aip;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.ye;
import defpackage.yt11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.rides.delete_modal.b;

/* loaded from: classes5.dex */
public final class a implements yt11 {
    public final Context a;
    public final ru.yandex.taxi.favorites.rides.delete_modal.data.a b;
    public final aip c;
    public final r0 d;
    public final mth e;

    public a(Context context, ru.yandex.taxi.favorites.rides.delete_modal.data.a aVar, aip aipVar) {
        this.a = context;
        this.b = aVar;
        this.c = aipVar;
        r0 c = bvf0.c(null);
        this.d = c;
        this.e = new mth(e.d(c), 6);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons b(String str, b bVar, ContinuationImpl continuationImpl) {
        DeleteModalInteractor$trackLoadingState$1 deleteModalInteractor$trackLoadingState$1;
        int i;
        if (continuationImpl instanceof DeleteModalInteractor$trackLoadingState$1) {
            deleteModalInteractor$trackLoadingState$1 = (DeleteModalInteractor$trackLoadingState$1) continuationImpl;
            int i2 = deleteModalInteractor$trackLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteModalInteractor$trackLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteModalInteractor$trackLoadingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteModalInteractor$trackLoadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 gci0Var = this.b.d;
                    ye yeVar = new ye(7, this, str, bVar);
                    deleteModalInteractor$trackLoadingState$1.L$0 = null;
                    deleteModalInteractor$trackLoadingState$1.L$1 = null;
                    deleteModalInteractor$trackLoadingState$1.label = 1;
                    if (gci0Var.a.collect(yeVar, deleteModalInteractor$trackLoadingState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        deleteModalInteractor$trackLoadingState$1 = new DeleteModalInteractor$trackLoadingState$1(this, continuationImpl);
        Object obj2 = deleteModalInteractor$trackLoadingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteModalInteractor$trackLoadingState$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
