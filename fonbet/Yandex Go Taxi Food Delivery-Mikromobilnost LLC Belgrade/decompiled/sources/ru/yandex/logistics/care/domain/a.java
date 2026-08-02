package ru.yandex.logistics.care.domain;

import defpackage.brb1;
import defpackage.fzq;
import defpackage.jl40;
import defpackage.l5j0;
import defpackage.m5j0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.wg10;
import defpackage.wms;
import defpackage.yc21;
import defpackage.zc21;
import defpackage.zw40;
import defpackage.zy11;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.yandex.logistics.care.data.CarePhotoApi;

/* loaded from: classes4.dex */
public final class a {
    public final CarePhotoApi a;

    public a(CarePhotoApi carePhotoApi) {
        this.a = carePhotoApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7 A[Catch: Exception -> 0x00e5, CancellationException -> 0x00ed, TryCatch #2 {CancellationException -> 0x00ed, Exception -> 0x00e5, blocks: (B:12:0x004e, B:13:0x00ab, B:15:0x00b7, B:18:0x00ba, B:20:0x00c0, B:22:0x00c6, B:23:0x00c8, B:29:0x005b), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[Catch: Exception -> 0x00e5, CancellationException -> 0x00ed, TryCatch #2 {CancellationException -> 0x00ed, Exception -> 0x00e5, blocks: (B:12:0x004e, B:13:0x00ab, B:15:0x00b7, B:18:0x00ba, B:20:0x00c0, B:22:0x00c6, B:23:0x00c8, B:29:0x005b), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, File file, String str2, Map map, ContinuationImpl continuationImpl) {
        UploaderPhotoUseCaseImpl$upload$1 uploaderPhotoUseCaseImpl$upload$1;
        int i;
        zc21 zc21Var;
        try {
            if (continuationImpl instanceof UploaderPhotoUseCaseImpl$upload$1) {
                uploaderPhotoUseCaseImpl$upload$1 = (UploaderPhotoUseCaseImpl$upload$1) continuationImpl;
                int i2 = uploaderPhotoUseCaseImpl$upload$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uploaderPhotoUseCaseImpl$upload$1.label = i2 - Integer.MIN_VALUE;
                    UploaderPhotoUseCaseImpl$upload$1 uploaderPhotoUseCaseImpl$upload$12 = uploaderPhotoUseCaseImpl$upload$1;
                    Object obj = uploaderPhotoUseCaseImpl$upload$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = uploaderPhotoUseCaseImpl$upload$12.label;
                    if (i != 0) {
                        b.b(obj);
                        String uuid = UUID.randomUUID().toString();
                        int i3 = m5j0.a;
                        Regex regex = wg10.e;
                        l5j0 a = wms.a(str, qje.o("text/plain"));
                        l5j0 a2 = wms.a("image/jpeg", qje.o("text/plain"));
                        zw40 b = brb1.b("photo_data", file.getName(), new fzq(qje.o("image/jpeg"), file));
                        CarePhotoApi carePhotoApi = this.a;
                        uploaderPhotoUseCaseImpl$upload$12.L$0 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$1 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$2 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$3 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$4 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$5 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$6 = null;
                        uploaderPhotoUseCaseImpl$upload$12.L$7 = null;
                        uploaderPhotoUseCaseImpl$upload$12.label = 1;
                        obj = carePhotoApi.a(str2, uuid, a, a2, b, map, uploaderPhotoUseCaseImpl$upload$12);
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
                    zc21Var = (zc21) obj;
                    if (!jl40.l(zc21Var.a, "successful")) {
                        return zy11.a;
                    }
                    yc21 yc21Var = zc21Var.b;
                    return new Result.Failure(new Exception("Upload failed: code=" + (yc21Var != null ? yc21Var.a : null) + ", message=" + (yc21Var != null ? yc21Var.b : null)));
                }
            }
            if (i != 0) {
            }
            zc21Var = (zc21) obj;
            if (!jl40.l(zc21Var.a, "successful")) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        uploaderPhotoUseCaseImpl$upload$1 = new UploaderPhotoUseCaseImpl$upload$1(this, continuationImpl);
        UploaderPhotoUseCaseImpl$upload$1 uploaderPhotoUseCaseImpl$upload$122 = uploaderPhotoUseCaseImpl$upload$1;
        Object obj2 = uploaderPhotoUseCaseImpl$upload$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploaderPhotoUseCaseImpl$upload$122.label;
    }
}
