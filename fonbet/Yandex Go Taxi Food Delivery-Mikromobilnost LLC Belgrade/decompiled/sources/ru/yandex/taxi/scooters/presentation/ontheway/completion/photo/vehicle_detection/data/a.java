package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data;

import defpackage.aan0;
import defpackage.b64;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.g3r;
import defpackage.g8e;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.r9n0;
import defpackage.rvj0;
import defpackage.rzo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x6v;
import defpackage.ywm0;
import defpackage.z9n0;
import defpackage.zgz;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final ScootersCompletionPhotoVehicleDetectionModelDownloadApi b;
    public final ywm0 c;
    public final aan0 d;
    public final r9n0 e;

    public a(tt2 tt2Var, ScootersCompletionPhotoVehicleDetectionModelDownloadApi scootersCompletionPhotoVehicleDetectionModelDownloadApi, ywm0 ywm0Var, aan0 aan0Var, r9n0 r9n0Var) {
        this.a = tt2Var;
        this.b = scootersCompletionPhotoVehicleDetectionModelDownloadApi;
        this.c = ywm0Var;
        this.d = aan0Var;
        this.e = r9n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x003c, CancellationException -> 0x00fa, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00fa, blocks: (B:12:0x0038, B:13:0x0099, B:19:0x009e, B:42:0x0084), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, File file, String str2, boolean z, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1;
        int i;
        z9n0 z9n0Var;
        String str3;
        z9n0 z9n0Var2;
        File file2;
        fmt fmtVar;
        aan0 aan0Var = aVar.d;
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1) {
                scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1 = (ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.label;
                    if (i != 0) {
                        b.b(obj);
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        File file3 = new File(file.getParentFile(), b64.j(file.getName(), ".download"));
                        file3.delete();
                        File file4 = new File(file.getParentFile(), b64.j(file.getName(), ".backup"));
                        file4.delete();
                        z9n0Var = new z9n0(file, file3, file4);
                        try {
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$0 = str;
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$1 = null;
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$2 = null;
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$3 = z9n0Var;
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.Z$0 = z;
                            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.label = 1;
                            obj = aVar.c(str, str2, scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            str3 = str;
                            z9n0Var2 = z9n0Var;
                        } catch (Throwable th) {
                            th = th;
                            File file5 = z9n0Var.b;
                            File file6 = z9n0Var.a;
                            file5.delete();
                            file2 = z9n0Var.c;
                            if (file2.isFile()) {
                                file6.delete();
                                file2.renameTo(file6);
                            }
                            file2.delete();
                            if (!z) {
                                aan0Var.b(str).delete();
                                aan0Var.c(str).delete();
                                aan0Var.a(str).delete();
                            }
                            zgz.a((z || !aan0Var.d(str)) ? "Failed to download completion photo vehicle detection model" : "Completion photo vehicle detection model revalidation failed, using cached model", th);
                            return zy11.a;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.Z$0;
                        z9n0Var2 = (z9n0) scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$3;
                        str3 = (String) scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.L$0;
                        try {
                            b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            z9n0Var = z9n0Var2;
                            str = str3;
                            File file52 = z9n0Var.b;
                            File file62 = z9n0Var.a;
                            file52.delete();
                            file2 = z9n0Var.c;
                            if (file2.isFile()) {
                            }
                            file2.delete();
                            if (!z) {
                            }
                            zgz.a((z || !aan0Var.d(str)) ? "Failed to download completion photo vehicle detection model" : "Completion photo vehicle detection model revalidation failed, using cached model", th);
                            return zy11.a;
                        }
                    }
                    fmtVar = (fmt) obj;
                    if (fmtVar == null) {
                        f(fmtVar, z9n0Var2.b);
                        aVar.e(str3, z9n0Var2, z);
                        aVar.d(str3, fmtVar.e.a("ETag"));
                        z9n0Var2.c.delete();
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            fmtVar = (fmt) obj;
            if (fmtVar == null) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1(aVar, continuationImpl);
        Object obj3 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadModel$1.label;
    }

    public static void f(fmt fmtVar, File file) {
        Object obj = fmtVar.a;
        InputStream byteStream = ((rvj0) obj).byteStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long l = rzo.l(byteStream, fileOutputStream);
                fileOutputStream.close();
                long contentLength = ((rvj0) obj).contentLength();
                if (contentLength > 0 && l != contentLength) {
                    throw new IOException("Downloaded model size mismatch: expected=" + contentLength + " actual=" + l);
                }
                byteStream.close();
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r6.c.a(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1;
        int i;
        if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1) {
            scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1 = (ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1) continuationImpl;
            int i2 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label;
                if (i != 0) {
                    b.b(obj);
                    ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2(this, str, null);
                    scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.L$0 = str;
                    scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.L$0;
                    b.b(obj);
                }
                this.a.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3(this, str, null);
                scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.L$0 = null;
                scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label = 2;
                Object k0 = tje.k0(mdhVar, scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3, scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label;
        if (i != 0) {
        }
        this.a.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$32 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$3(this, str, null);
        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.L$0 = null;
        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1.label = 2;
        Object k02 = tje.k0(mdhVar2, scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$32, scootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$1);
        if (k02 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1 scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1) {
                scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1 = (ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<rvj0> a = this.b.a(str, str2, x6v.a);
                        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.L$0 = null;
                        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.L$1 = null;
                        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.label = 1;
                        obj = a.a(scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1);
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
                    return (fmt) obj;
                }
            }
            if (i != 0) {
            }
            return (fmt) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if ((th instanceof GoApiHttpException) && th.getCode() == 304) {
                return null;
            }
            throw th;
        }
        scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1 = new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionModelDownloadRepository$fetchModelResponseOrNull$1.label;
    }

    public final void d(String str, String str2) {
        aan0 aan0Var = this.d;
        g3r.g(aan0Var.c(str), String.valueOf(aan0Var.b(str).length()));
        File a = aan0Var.a(str);
        if (str2 == null || evu0.J(str2)) {
            a.delete();
        } else {
            g3r.g(a, str2);
        }
    }

    public final void e(String str, z9n0 z9n0Var, boolean z) {
        File file = z9n0Var.c;
        File file2 = z9n0Var.a;
        if (z && file2.isFile() && !file2.renameTo(file)) {
            ny61.v(g8e.o("Failed to move current model to backup ", file.getAbsolutePath()));
            return;
        }
        if (!z) {
            aan0 aan0Var = this.d;
            aan0Var.b(str).delete();
            aan0Var.c(str).delete();
            aan0Var.a(str).delete();
        }
        if (z9n0Var.b.renameTo(file2)) {
            return;
        }
        if (file.isFile()) {
            file.renameTo(file2);
        }
        ny61.v(g8e.o("Failed to move downloaded model to ", file2.getAbsolutePath()));
    }
}
