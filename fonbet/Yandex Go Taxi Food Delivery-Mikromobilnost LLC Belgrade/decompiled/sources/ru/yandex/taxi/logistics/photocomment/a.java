package ru.yandex.taxi.logistics.photocomment;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.delivery.libs.imageupload.api.UploadImageType;
import defpackage.abe;
import defpackage.bhh;
import defpackage.elb0;
import defpackage.erv;
import defpackage.gdi;
import defpackage.hit;
import defpackage.ikb0;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oy8;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
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
public final class a {
    public final elb0 a;
    public final abe b;
    public final tt2 c;
    public final gdi d;
    public final hit e;
    public final com.yandex.delivery.libs.imageupload.impl.domain.b f;
    public final LinkedHashMap g = new LinkedHashMap();

    public a(elb0 elb0Var, abe abeVar, tt2 tt2Var, gdi gdiVar, hit hitVar, com.yandex.delivery.libs.imageupload.impl.domain.b bVar) {
        this.a = elb0Var;
        this.b = abeVar;
        this.c = tt2Var;
        this.d = gdiVar;
        this.e = hitVar;
        this.f = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|14|15))|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r0.g(r7, new defpackage.erv(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        defpackage.jst.e.c(java.lang.String.format("Error while uploading image", java.util.Arrays.copyOf(new java.lang.Object[]{r8}, 1)));
        r0.b(new defpackage.hkb0(r7, new defpackage.erv(r9), r6.d.b(r7)), new defpackage.erv(r9));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, InputStream inputStream, int i, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentInteractor$uploadPhotoComment$1 deliveryPhotocommentInteractor$uploadPhotoComment$1;
        int i2;
        aVar.getClass();
        elb0 elb0Var = aVar.a;
        try {
            if (continuationImpl instanceof DeliveryPhotocommentInteractor$uploadPhotoComment$1) {
                deliveryPhotocommentInteractor$uploadPhotoComment$1 = (DeliveryPhotocommentInteractor$uploadPhotoComment$1) continuationImpl;
                int i3 = deliveryPhotocommentInteractor$uploadPhotoComment$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    deliveryPhotocommentInteractor$uploadPhotoComment$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = deliveryPhotocommentInteractor$uploadPhotoComment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = deliveryPhotocommentInteractor$uploadPhotoComment$1.label;
                    int i4 = 1;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        rol0 a = aVar.f.a(inputStream, UploadImageType.PHOTOCOMMENT);
                        aVar.c.getClass();
                        sjh sjhVar = uyj.a;
                        tpr F = e.F(a, mdh.b);
                        oy8 oy8Var = new oy8(aVar, str, i, i4);
                        deliveryPhotocommentInteractor$uploadPhotoComment$1.L$0 = str;
                        deliveryPhotocommentInteractor$uploadPhotoComment$1.L$1 = null;
                        deliveryPhotocommentInteractor$uploadPhotoComment$1.I$0 = i;
                        deliveryPhotocommentInteractor$uploadPhotoComment$1.label = 1;
                        Object collect = F.collect(oy8Var, deliveryPhotocommentInteractor$uploadPhotoComment$1);
                        str = collect;
                        if (collect == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = deliveryPhotocommentInteractor$uploadPhotoComment$1.I$0;
                        String str2 = (String) deliveryPhotocommentInteractor$uploadPhotoComment$1.L$0;
                        kotlin.b.b(obj);
                        str = str2;
                    }
                    return zy11.a;
                }
            }
            if (i2 != 0) {
            }
            return zy11.a;
        } finally {
            aVar.d();
        }
        deliveryPhotocommentInteractor$uploadPhotoComment$1 = new DeliveryPhotocommentInteractor$uploadPhotoComment$1(aVar, continuationImpl);
        Object obj2 = deliveryPhotocommentInteractor$uploadPhotoComment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = deliveryPhotocommentInteractor$uploadPhotoComment$1.label;
        int i42 = 1;
    }

    public final void b(String str, FileInputStream fileInputStream, int i) {
        pzt0 N = tje.N(this.e.a, null, null, new DeliveryPhotocommentInteractor$launchImageUpload$job$1(this, str, fileInputStream, i, null), 3);
        N.w(new bhh(19, this));
        this.g.put(str, N);
        d();
    }

    public final void c(int i, String str) {
        l8x l8xVar = (l8x) this.g.remove(str);
        if (l8xVar != null && l8xVar.isActive()) {
            l8xVar.a(null);
            d();
        }
        this.d.getClass();
        new File(str).delete();
        this.a.g(str, new erv(i));
    }

    public final void d() {
        Collection values = this.g.values();
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, Uri uri, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentInteractor$uploadImageForPosition$1 deliveryPhotocommentInteractor$uploadImageForPosition$1;
        int i4;
        int i5;
        Bitmap bitmap;
        if (continuationImpl instanceof DeliveryPhotocommentInteractor$uploadImageForPosition$1) {
            deliveryPhotocommentInteractor$uploadImageForPosition$1 = (DeliveryPhotocommentInteractor$uploadImageForPosition$1) continuationImpl;
            int i6 = deliveryPhotocommentInteractor$uploadImageForPosition$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentInteractor$uploadImageForPosition$1.label = i6 - Integer.MIN_VALUE;
                DeliveryPhotocommentInteractor$uploadImageForPosition$1 deliveryPhotocommentInteractor$uploadImageForPosition$12 = deliveryPhotocommentInteractor$uploadImageForPosition$1;
                Object obj = deliveryPhotocommentInteractor$uploadImageForPosition$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentInteractor$uploadImageForPosition$12.label;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    DeliveryPhotocommentInteractor$uploadImageForPosition$bitmap$1 deliveryPhotocommentInteractor$uploadImageForPosition$bitmap$1 = new DeliveryPhotocommentInteractor$uploadImageForPosition$bitmap$1(this, uri, i2, i3, null);
                    deliveryPhotocommentInteractor$uploadImageForPosition$12.L$0 = null;
                    deliveryPhotocommentInteractor$uploadImageForPosition$12.I$0 = i;
                    deliveryPhotocommentInteractor$uploadImageForPosition$12.I$1 = i2;
                    deliveryPhotocommentInteractor$uploadImageForPosition$12.I$2 = i3;
                    deliveryPhotocommentInteractor$uploadImageForPosition$12.label = 1;
                    obj = tje.k0(mdhVar, deliveryPhotocommentInteractor$uploadImageForPosition$bitmap$1, deliveryPhotocommentInteractor$uploadImageForPosition$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i5 = i;
                } else {
                    if (i4 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = deliveryPhotocommentInteractor$uploadImageForPosition$12.I$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                zy11 zy11Var = zy11.a;
                if (bitmap != null) {
                    jst.e.c("Error while converting photocomment to bitmap");
                    return zy11Var;
                }
                gdi gdiVar = this.d;
                gdiVar.getClass();
                String uuid = UUID.randomUUID().toString();
                File a = gdiVar.a(uuid);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(a);
                try {
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.a.e(new ikb0(uuid, gdiVar.b(uuid), 0, 0), new erv(i5));
                    File a2 = gdiVar.a(uuid);
                    FileInputStream fileInputStream = a2.exists() ? new FileInputStream(a2) : null;
                    if (fileInputStream == null) {
                        return zy11Var;
                    }
                    b(uuid, fileInputStream, i5);
                    return zy11Var;
                } finally {
                }
            }
        }
        deliveryPhotocommentInteractor$uploadImageForPosition$1 = new DeliveryPhotocommentInteractor$uploadImageForPosition$1(this, continuationImpl);
        DeliveryPhotocommentInteractor$uploadImageForPosition$1 deliveryPhotocommentInteractor$uploadImageForPosition$122 = deliveryPhotocommentInteractor$uploadImageForPosition$1;
        Object obj2 = deliveryPhotocommentInteractor$uploadImageForPosition$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentInteractor$uploadImageForPosition$122.label;
        if (i4 != 0) {
        }
        bitmap = (Bitmap) obj2;
        zy11 zy11Var2 = zy11.a;
        if (bitmap != null) {
        }
    }
}
