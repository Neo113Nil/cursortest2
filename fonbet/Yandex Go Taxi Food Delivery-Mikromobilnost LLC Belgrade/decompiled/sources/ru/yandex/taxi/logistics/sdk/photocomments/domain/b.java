package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.delivery.libs.imageupload.api.UploadImageType;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.elb0;
import defpackage.i4b0;
import defpackage.ikb0;
import defpackage.ike;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jse;
import defpackage.l3z;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vr;
import defpackage.ye;
import defpackage.zrm;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b {
    public final elb0 a;
    public final vr b;
    public final st2 c;
    public final l3z d;
    public final com.yandex.delivery.libs.imageupload.impl.domain.b e;
    public final zrm f;
    public final ike g;
    public final LinkedHashMap h = new LinkedHashMap();

    public b(elb0 elb0Var, vr vrVar, st2 st2Var, l3z l3zVar, com.yandex.delivery.libs.imageupload.impl.domain.b bVar, zrm zrmVar) {
        this.a = elb0Var;
        this.b = vrVar;
        this.c = st2Var;
        this.d = l3zVar;
        this.e = bVar;
        this.f = zrmVar;
        this.g = bvf0.a(cvw.U(jl40.a(), st2Var.b));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|14|15))|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r0.g(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r10 = defpackage.jgz.a;
        defpackage.jgz.b("DeliveriesSubsystem", r8, "Error while uploading image");
        r0.b(new defpackage.hkb0(r7, r9, r6.d.b(r7)), r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, InputStream inputStream, okb0 okb0Var, ContinuationImpl continuationImpl) {
        PhotocommentsUploadInteractor$uploadPhotoComment$1 photocommentsUploadInteractor$uploadPhotoComment$1;
        int i;
        bVar.getClass();
        elb0 elb0Var = bVar.a;
        try {
            if (continuationImpl instanceof PhotocommentsUploadInteractor$uploadPhotoComment$1) {
                photocommentsUploadInteractor$uploadPhotoComment$1 = (PhotocommentsUploadInteractor$uploadPhotoComment$1) continuationImpl;
                int i2 = photocommentsUploadInteractor$uploadPhotoComment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    photocommentsUploadInteractor$uploadPhotoComment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = photocommentsUploadInteractor$uploadPhotoComment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = photocommentsUploadInteractor$uploadPhotoComment$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        tpr F = e.F(bVar.e.a(inputStream, UploadImageType.PHOTOCOMMENT), bVar.c.b);
                        ye yeVar = new ye(18, bVar, str, okb0Var);
                        photocommentsUploadInteractor$uploadPhotoComment$1.L$0 = str;
                        photocommentsUploadInteractor$uploadPhotoComment$1.L$1 = null;
                        photocommentsUploadInteractor$uploadPhotoComment$1.L$2 = okb0Var;
                        photocommentsUploadInteractor$uploadPhotoComment$1.label = 1;
                        Object collect = F.collect(yeVar, photocommentsUploadInteractor$uploadPhotoComment$1);
                        str = collect;
                        if (collect == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        okb0Var = (okb0) photocommentsUploadInteractor$uploadPhotoComment$1.L$2;
                        String str2 = (String) photocommentsUploadInteractor$uploadPhotoComment$1.L$0;
                        kotlin.b.b(obj);
                        str = str2;
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } finally {
            bVar.d();
        }
        photocommentsUploadInteractor$uploadPhotoComment$1 = new PhotocommentsUploadInteractor$uploadPhotoComment$1(bVar, continuationImpl);
        Object obj2 = photocommentsUploadInteractor$uploadPhotoComment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photocommentsUploadInteractor$uploadPhotoComment$1.label;
    }

    public final void b(String str, FileInputStream fileInputStream, okb0 okb0Var) {
        pzt0 N = tje.N(this.g, null, null, new PhotocommentsUploadInteractor$launchImageUpload$job$1(this, str, fileInputStream, okb0Var, null), 3);
        N.w(new i4b0(9, this));
        this.h.put(str, N);
        d();
    }

    public final void c(String str, okb0 okb0Var) {
        l8x l8xVar = (l8x) this.h.remove(str);
        if (l8xVar != null && l8xVar.isActive()) {
            l8xVar.a(null);
            d();
        }
        this.d.getClass();
        new File(str).delete();
        this.a.g(str, okb0Var);
    }

    public final void d() {
        Collection values = this.h.values();
        boolean z = false;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l8x) it.next()).isActive()) {
                    z = true;
                    break;
                }
            }
        }
        this.a.f(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(okb0 okb0Var, Uri uri, int i, int i2, ContinuationImpl continuationImpl) {
        PhotocommentsUploadInteractor$uploadImageForPosition$1 photocommentsUploadInteractor$uploadImageForPosition$1;
        int i3;
        Bitmap bitmap;
        if (continuationImpl instanceof PhotocommentsUploadInteractor$uploadImageForPosition$1) {
            photocommentsUploadInteractor$uploadImageForPosition$1 = (PhotocommentsUploadInteractor$uploadImageForPosition$1) continuationImpl;
            int i4 = photocommentsUploadInteractor$uploadImageForPosition$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                photocommentsUploadInteractor$uploadImageForPosition$1.label = i4 - Integer.MIN_VALUE;
                Object obj = photocommentsUploadInteractor$uploadImageForPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = photocommentsUploadInteractor$uploadImageForPosition$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    jse jseVar = this.c.b;
                    PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1 photocommentsUploadInteractor$uploadImageForPosition$bitmap$1 = new PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1(this, uri, i, i2, null);
                    photocommentsUploadInteractor$uploadImageForPosition$1.L$0 = okb0Var;
                    photocommentsUploadInteractor$uploadImageForPosition$1.L$1 = null;
                    photocommentsUploadInteractor$uploadImageForPosition$1.I$0 = i;
                    photocommentsUploadInteractor$uploadImageForPosition$1.I$1 = i2;
                    photocommentsUploadInteractor$uploadImageForPosition$1.label = 1;
                    obj = tje.k0(jseVar, photocommentsUploadInteractor$uploadImageForPosition$bitmap$1, photocommentsUploadInteractor$uploadImageForPosition$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    okb0Var = (okb0) photocommentsUploadInteractor$uploadImageForPosition$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                zy11 zy11Var = zy11.a;
                if (bitmap != null) {
                    jgz jgzVar = jgz.a;
                    jgz.b("DeliveriesSubsystem", "Error while converting photocomment to bitmap");
                    return zy11Var;
                }
                l3z l3zVar = this.d;
                l3zVar.getClass();
                String uuid = UUID.randomUUID().toString();
                File a = l3zVar.a(uuid);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(a);
                try {
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.a.e(new ikb0(uuid, l3zVar.b(uuid), 0, 0), okb0Var);
                    File a2 = l3zVar.a(uuid);
                    FileInputStream fileInputStream = a2.exists() ? new FileInputStream(a2) : null;
                    if (fileInputStream == null) {
                        return zy11Var;
                    }
                    b(uuid, fileInputStream, okb0Var);
                    return zy11Var;
                } finally {
                }
            }
        }
        photocommentsUploadInteractor$uploadImageForPosition$1 = new PhotocommentsUploadInteractor$uploadImageForPosition$1(this, continuationImpl);
        Object obj2 = photocommentsUploadInteractor$uploadImageForPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = photocommentsUploadInteractor$uploadImageForPosition$1.label;
        if (i3 != 0) {
        }
        bitmap = (Bitmap) obj2;
        zy11 zy11Var2 = zy11.a;
        if (bitmap != null) {
        }
    }
}
