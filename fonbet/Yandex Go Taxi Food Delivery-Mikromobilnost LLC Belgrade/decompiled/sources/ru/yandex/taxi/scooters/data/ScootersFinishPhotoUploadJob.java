package ru.yandex.taxi.scooters.data;

import android.content.Context;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.guy;
import defpackage.h6r;
import defpackage.huy;
import defpackage.iuy;
import defpackage.kpm0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.zy11;
import defpackage.zzf;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;
import ru.yandex.taxi.scooters.data.model.PhotoType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersFinishPhotoUploadJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScootersFinishPhotoUploadJob extends GoCoroutineJob<h6r> {
    public ScootersFinishPhotoUploadJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersFinishPhotoUploadJob$doWork$1 scootersFinishPhotoUploadJob$doWork$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersFinishPhotoUploadJob$doWork$1) {
                scootersFinishPhotoUploadJob$doWork$1 = (ScootersFinishPhotoUploadJob$doWork$1) continuationImpl;
                int i2 = scootersFinishPhotoUploadJob$doWork$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersFinishPhotoUploadJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersFinishPhotoUploadJob$doWork$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersFinishPhotoUploadJob$doWork$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersFinishPhotoUploadJob$doWork$1.label = 1;
                        if (c(scootersFinishPhotoUploadJob$doWork$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new iuy();
                }
            }
            if (i != 0) {
            }
            return new iuy();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return getRunAttemptCount() < 3 ? new huy() : new guy();
        }
        scootersFinishPhotoUploadJob$doWork$1 = new ScootersFinishPhotoUploadJob$doWork$1(this, continuationImpl);
        Object obj3 = scootersFinishPhotoUploadJob$doWork$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishPhotoUploadJob$doWork$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersFinishPhotoUploadJob$uploadPhoto$1 scootersFinishPhotoUploadJob$uploadPhoto$1;
        int i;
        String a;
        String a2;
        String str;
        kpm0 kpm0Var;
        if (continuationImpl instanceof ScootersFinishPhotoUploadJob$uploadPhoto$1) {
            scootersFinishPhotoUploadJob$uploadPhoto$1 = (ScootersFinishPhotoUploadJob$uploadPhoto$1) continuationImpl;
            int i2 = scootersFinishPhotoUploadJob$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishPhotoUploadJob$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFinishPhotoUploadJob$uploadPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishPhotoUploadJob$uploadPhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a3 = getInputData().a(LaunchBrowserActivity.KEY_URI);
                    if (a3 == null || (a = getInputData().a("uuid")) == null || (a2 = getInputData().a("session_id")) == null) {
                        return zy11.a;
                    }
                    kpm0 kpm0Var2 = new kpm0(Uri.parse(a3), a);
                    v r1 = ((zzf) ((h6r) b())).r1();
                    List singletonList = Collections.singletonList(kpm0Var2);
                    PhotoType photoType = PhotoType.COMPLETION;
                    scootersFinishPhotoUploadJob$uploadPhoto$1.L$0 = null;
                    scootersFinishPhotoUploadJob$uploadPhoto$1.L$1 = null;
                    scootersFinishPhotoUploadJob$uploadPhoto$1.L$2 = a2;
                    scootersFinishPhotoUploadJob$uploadPhoto$1.L$3 = kpm0Var2;
                    scootersFinishPhotoUploadJob$uploadPhoto$1.label = 1;
                    if (r1.a(a2, singletonList, photoType, scootersFinishPhotoUploadJob$uploadPhoto$1) != coroutineSingletons) {
                        str = a2;
                        kpm0Var = kpm0Var2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kpm0Var = (kpm0) scootersFinishPhotoUploadJob$uploadPhoto$1.L$3;
                str = (String) scootersFinishPhotoUploadJob$uploadPhoto$1.L$2;
                kotlin.b.b(obj);
                v r12 = ((zzf) ((h6r) b())).r1();
                PhotoType photoType2 = PhotoType.COMPLETION;
                scootersFinishPhotoUploadJob$uploadPhoto$1.L$0 = null;
                scootersFinishPhotoUploadJob$uploadPhoto$1.L$1 = null;
                scootersFinishPhotoUploadJob$uploadPhoto$1.L$2 = null;
                scootersFinishPhotoUploadJob$uploadPhoto$1.L$3 = null;
                scootersFinishPhotoUploadJob$uploadPhoto$1.label = 2;
                Object b = r12.b(str, kpm0Var, photoType2, scootersFinishPhotoUploadJob$uploadPhoto$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        scootersFinishPhotoUploadJob$uploadPhoto$1 = new ScootersFinishPhotoUploadJob$uploadPhoto$1(this, continuationImpl);
        Object obj2 = scootersFinishPhotoUploadJob$uploadPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishPhotoUploadJob$uploadPhoto$1.label;
        if (i != 0) {
        }
        v r122 = ((zzf) ((h6r) b())).r1();
        PhotoType photoType22 = PhotoType.COMPLETION;
        scootersFinishPhotoUploadJob$uploadPhoto$1.L$0 = null;
        scootersFinishPhotoUploadJob$uploadPhoto$1.L$1 = null;
        scootersFinishPhotoUploadJob$uploadPhoto$1.L$2 = null;
        scootersFinishPhotoUploadJob$uploadPhoto$1.L$3 = null;
        scootersFinishPhotoUploadJob$uploadPhoto$1.label = 2;
        Object b2 = r122.b(str, kpm0Var, photoType22, scootersFinishPhotoUploadJob$uploadPhoto$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
