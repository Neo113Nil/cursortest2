package ru.yandex.taxi.scooters.domain;

import android.net.Uri;
import defpackage.h8n0;
import defpackage.kpm0;
import defpackage.ny61;
import defpackage.qan0;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.w;

/* loaded from: classes6.dex */
public final class d {
    public final ru.yandex.taxi.jobs.b a;
    public final w b;
    public final h8n0 c;

    public d(ru.yandex.taxi.jobs.b bVar, w wVar, h8n0 h8n0Var) {
        this.a = bVar;
        this.b = wVar;
        this.c = h8n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qan0 qan0Var, ContinuationImpl continuationImpl) {
        ScootersCompletePhotoInteractor$takeAndSavePhoto$1 scootersCompletePhotoInteractor$takeAndSavePhoto$1;
        int i;
        if (continuationImpl instanceof ScootersCompletePhotoInteractor$takeAndSavePhoto$1) {
            scootersCompletePhotoInteractor$takeAndSavePhoto$1 = (ScootersCompletePhotoInteractor$takeAndSavePhoto$1) continuationImpl;
            int i2 = scootersCompletePhotoInteractor$takeAndSavePhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletePhotoInteractor$takeAndSavePhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletePhotoInteractor$takeAndSavePhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletePhotoInteractor$takeAndSavePhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = this.b;
                    scootersCompletePhotoInteractor$takeAndSavePhoto$1.L$0 = null;
                    scootersCompletePhotoInteractor$takeAndSavePhoto$1.label = 1;
                    obj = wVar.a(qan0Var, scootersCompletePhotoInteractor$takeAndSavePhoto$1);
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
                kpm0 kpm0Var = new kpm0((Uri) obj, UUID.randomUUID().toString());
                this.c.a = kpm0Var;
                return kpm0Var;
            }
        }
        scootersCompletePhotoInteractor$takeAndSavePhoto$1 = new ScootersCompletePhotoInteractor$takeAndSavePhoto$1(this, continuationImpl);
        Object obj2 = scootersCompletePhotoInteractor$takeAndSavePhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletePhotoInteractor$takeAndSavePhoto$1.label;
        if (i != 0) {
        }
        kpm0 kpm0Var2 = new kpm0((Uri) obj2, UUID.randomUUID().toString());
        this.c.a = kpm0Var2;
        return kpm0Var2;
    }
}
