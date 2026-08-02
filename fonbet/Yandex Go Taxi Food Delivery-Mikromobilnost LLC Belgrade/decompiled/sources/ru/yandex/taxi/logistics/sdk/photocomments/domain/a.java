package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.bvf0;
import defpackage.c0i0;
import defpackage.ds7;
import defpackage.e100;
import defpackage.fza0;
import defpackage.gzh;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.qej;
import defpackage.r5s;
import defpackage.rzh0;
import defpackage.s40;
import defpackage.st2;
import defpackage.tje;
import defpackage.vej;
import defpackage.w511;
import defpackage.wej;
import defpackage.xej;
import defpackage.y30;
import defpackage.yej;
import defpackage.yuj0;
import defpackage.zej;
import defpackage.zy11;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.photocomment.c;

/* loaded from: classes5.dex */
public final class a {
    public final c a;
    public final fza0 b;
    public final ds7 c;
    public final b d;
    public final yuj0 e;
    public final com.yandex.delivery.utils.dialogmanager.impl.b f;
    public final y30 g;
    public final e100 h;
    public final ike i;

    public a(c cVar, fza0 fza0Var, ds7 ds7Var, b bVar, yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar2, y30 y30Var, e100 e100Var, st2 st2Var) {
        this.a = cVar;
        this.b = fza0Var;
        this.c = ds7Var;
        this.d = bVar;
        this.e = yuj0Var;
        this.f = bVar2;
        this.g = y30Var;
        this.h = e100Var;
        this.i = bvf0.a(st2Var.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r8.d((defpackage.s40) r12, r9, r4, r5, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, okb0 okb0Var, int i, int i2, ContinuationImpl continuationImpl) {
        PhotocommentsInteractorImpl$launchCameraIfPermitted$1 photocommentsInteractorImpl$launchCameraIfPermitted$1;
        int i3;
        aVar.getClass();
        if (continuationImpl instanceof PhotocommentsInteractorImpl$launchCameraIfPermitted$1) {
            photocommentsInteractorImpl$launchCameraIfPermitted$1 = (PhotocommentsInteractorImpl$launchCameraIfPermitted$1) continuationImpl;
            int i4 = photocommentsInteractorImpl$launchCameraIfPermitted$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                photocommentsInteractorImpl$launchCameraIfPermitted$1.label = i4 - Integer.MIN_VALUE;
                PhotocommentsInteractorImpl$launchCameraIfPermitted$1 photocommentsInteractorImpl$launchCameraIfPermitted$12 = photocommentsInteractorImpl$launchCameraIfPermitted$1;
                Object obj = photocommentsInteractorImpl$launchCameraIfPermitted$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = photocommentsInteractorImpl$launchCameraIfPermitted$12.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    c cVar = aVar.a;
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", aVar.c.a());
                    photocommentsInteractorImpl$launchCameraIfPermitted$12.L$0 = okb0Var;
                    photocommentsInteractorImpl$launchCameraIfPermitted$12.I$0 = i;
                    photocommentsInteractorImpl$launchCameraIfPermitted$12.I$1 = i2;
                    photocommentsInteractorImpl$launchCameraIfPermitted$12.label = 1;
                    obj = cVar.a(intent, photocommentsInteractorImpl$launchCameraIfPermitted$12);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    i2 = photocommentsInteractorImpl$launchCameraIfPermitted$12.I$1;
                    i = photocommentsInteractorImpl$launchCameraIfPermitted$12.I$0;
                    okb0Var = (okb0) photocommentsInteractorImpl$launchCameraIfPermitted$12.L$0;
                    kotlin.b.b(obj);
                }
                int i5 = i;
                int i6 = i2;
                photocommentsInteractorImpl$launchCameraIfPermitted$12.L$0 = null;
                photocommentsInteractorImpl$launchCameraIfPermitted$12.L$1 = null;
                photocommentsInteractorImpl$launchCameraIfPermitted$12.I$0 = i5;
                photocommentsInteractorImpl$launchCameraIfPermitted$12.I$1 = i6;
                photocommentsInteractorImpl$launchCameraIfPermitted$12.label = 2;
            }
        }
        photocommentsInteractorImpl$launchCameraIfPermitted$1 = new PhotocommentsInteractorImpl$launchCameraIfPermitted$1(aVar, continuationImpl);
        PhotocommentsInteractorImpl$launchCameraIfPermitted$1 photocommentsInteractorImpl$launchCameraIfPermitted$122 = photocommentsInteractorImpl$launchCameraIfPermitted$1;
        Object obj3 = photocommentsInteractorImpl$launchCameraIfPermitted$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = photocommentsInteractorImpl$launchCameraIfPermitted$122.label;
        if (i3 != 0) {
        }
        int i52 = i;
        int i62 = i2;
        photocommentsInteractorImpl$launchCameraIfPermitted$122.L$0 = null;
        photocommentsInteractorImpl$launchCameraIfPermitted$122.L$1 = null;
        photocommentsInteractorImpl$launchCameraIfPermitted$122.I$0 = i52;
        photocommentsInteractorImpl$launchCameraIfPermitted$122.I$1 = i62;
        photocommentsInteractorImpl$launchCameraIfPermitted$122.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r15 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, okb0 okb0Var, int i, int i2, ContinuationImpl continuationImpl) {
        PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1 photocommentsInteractorImpl$launchSourceChooserIfPermitted$1;
        int i3;
        Intent intent;
        Object obj;
        Intent intent2;
        Uri data;
        aVar.getClass();
        if (continuationImpl instanceof PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1) {
            photocommentsInteractorImpl$launchSourceChooserIfPermitted$1 = (PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1) continuationImpl;
            int i4 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$1.label = i4 - Integer.MIN_VALUE;
                PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1 photocommentsInteractorImpl$launchSourceChooserIfPermitted$12 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$1;
                Object obj2 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.label;
                Object obj4 = zy11.a;
                if (i3 != 0) {
                    kotlin.b.b(obj2);
                    c cVar = aVar.a;
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.setType("image/*");
                    Intent createChooser = Intent.createChooser(intent3, null);
                    Intent intent4 = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent4.putExtra("output", aVar.c.a());
                    createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent4});
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$0 = okb0Var;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$0 = i;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$1 = i2;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.label = 1;
                    obj2 = cVar.a(createChooser, photocommentsInteractorImpl$launchSourceChooserIfPermitted$12);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj4;
                    }
                    i2 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$1;
                    i = photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$0;
                    okb0Var = (okb0) photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$0;
                    kotlin.b.b(obj2);
                }
                int i5 = i;
                s40 s40Var = (s40) obj2;
                intent = s40Var.b;
                if ((intent == null ? intent.getData() : null) == null) {
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$0 = null;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$1 = null;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$0 = i5;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$1 = i2;
                    photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.label = 2;
                    if (s40Var.a != -1 || (intent2 = s40Var.b) == null || (data = intent2.getData()) == null || (obj = aVar.d.e(okb0Var, data, i5, i2, photocommentsInteractorImpl$launchSourceChooserIfPermitted$12)) != obj3) {
                        obj = obj4;
                    }
                    return obj == obj3 ? obj3 : obj4;
                }
                int i6 = i2;
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$0 = null;
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.L$1 = null;
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$0 = i5;
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.I$1 = i6;
                photocommentsInteractorImpl$launchSourceChooserIfPermitted$12.label = 3;
                if (aVar.d(s40Var, okb0Var, i5, i6, photocommentsInteractorImpl$launchSourceChooserIfPermitted$12) == obj3) {
                }
            }
        }
        photocommentsInteractorImpl$launchSourceChooserIfPermitted$1 = new PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1(aVar, continuationImpl);
        PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1 photocommentsInteractorImpl$launchSourceChooserIfPermitted$122 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$1;
        Object obj22 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = photocommentsInteractorImpl$launchSourceChooserIfPermitted$122.label;
        Object obj42 = zy11.a;
        if (i3 != 0) {
        }
        int i52 = i;
        s40 s40Var2 = (s40) obj22;
        intent = s40Var2.b;
        if ((intent == null ? intent.getData() : null) == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, ContinuationImpl continuationImpl) {
        PhotocommentsInteractorImpl$showPermissionDeniedForeverDialog$1 photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1;
        int i;
        zej zejVar;
        yuj0 yuj0Var = aVar.e;
        if (continuationImpl instanceof PhotocommentsInteractorImpl$showPermissionDeniedForeverDialog$1) {
            photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1 = (PhotocommentsInteractorImpl$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i2 = photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qej qejVar = new qej(null, yuj0Var.a(c0i0.delivery_camera_permission_dialog_title, new Object[0]), yuj0Var.a(rzh0.delivery_settings_button, new Object[0]), yuj0Var.a(rzh0.logistics_cancel_button, new Object[0]), null, false, null, null, 241);
                    com.yandex.delivery.utils.dialogmanager.impl.b bVar = aVar.f;
                    photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.L$0 = null;
                    photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.label = 1;
                    obj = bVar.a(qejVar, photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1);
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
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    Context a = aVar.g.a();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", a.getPackageName(), null));
                    if (intent.resolveActivity(a.getPackageManager()) != null) {
                        try {
                            a.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            intent.toString();
                        }
                    }
                } else if (!jl40.l(zejVar, vej.a) && !jl40.l(zejVar, wej.a) && !jl40.l(zejVar, xej.a)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1 = new PhotocommentsInteractorImpl$showPermissionDeniedForeverDialog$1(aVar, continuationImpl);
        Object obj2 = photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photocommentsInteractorImpl$showPermissionDeniedForeverDialog$1.label;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!jl40.l(zejVar, yej.a)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(s40 s40Var, okb0 okb0Var, int i, int i2, ContinuationImpl continuationImpl) {
        PhotocommentsInteractorImpl$handleCameraResult$1 photocommentsInteractorImpl$handleCameraResult$1;
        int i3;
        if (continuationImpl instanceof PhotocommentsInteractorImpl$handleCameraResult$1) {
            photocommentsInteractorImpl$handleCameraResult$1 = (PhotocommentsInteractorImpl$handleCameraResult$1) continuationImpl;
            int i4 = photocommentsInteractorImpl$handleCameraResult$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                photocommentsInteractorImpl$handleCameraResult$1.label = i4 - Integer.MIN_VALUE;
                PhotocommentsInteractorImpl$handleCameraResult$1 photocommentsInteractorImpl$handleCameraResult$12 = photocommentsInteractorImpl$handleCameraResult$1;
                Object obj = photocommentsInteractorImpl$handleCameraResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = photocommentsInteractorImpl$handleCameraResult$12.label;
                ds7 ds7Var = this.c;
                zy11 zy11Var = zy11.a;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    if (s40Var.a != -1) {
                        return zy11Var;
                    }
                    Uri a = ds7Var.a();
                    photocommentsInteractorImpl$handleCameraResult$12.L$0 = null;
                    photocommentsInteractorImpl$handleCameraResult$12.L$1 = null;
                    photocommentsInteractorImpl$handleCameraResult$12.L$2 = null;
                    photocommentsInteractorImpl$handleCameraResult$12.I$0 = i;
                    photocommentsInteractorImpl$handleCameraResult$12.I$1 = i2;
                    photocommentsInteractorImpl$handleCameraResult$12.label = 1;
                    if (this.d.e(okb0Var, a, i, i2, photocommentsInteractorImpl$handleCameraResult$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ds7Var.getClass();
                new File(new File(ds7Var.a.getCacheDir(), "logistics"), "photo_storage.jpg").delete();
                return zy11Var;
            }
        }
        photocommentsInteractorImpl$handleCameraResult$1 = new PhotocommentsInteractorImpl$handleCameraResult$1(this, continuationImpl);
        PhotocommentsInteractorImpl$handleCameraResult$1 photocommentsInteractorImpl$handleCameraResult$122 = photocommentsInteractorImpl$handleCameraResult$1;
        Object obj2 = photocommentsInteractorImpl$handleCameraResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = photocommentsInteractorImpl$handleCameraResult$122.label;
        ds7 ds7Var2 = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i3 != 0) {
        }
        ds7Var2.getClass();
        new File(new File(ds7Var2.a.getCacheDir(), "logistics"), "photo_storage.jpg").delete();
        return zy11Var2;
    }

    public final jqr e(gzh gzhVar) {
        b bVar = this.d;
        return new jqr(bVar.a.d(), new PhotocommentsUploadInteractor$observeUploadErrors$1(bVar, gzhVar, null), 3);
    }

    public final void f(okb0 okb0Var, int i, int i2) {
        tje.N(this.i, null, null, new PhotocommentsInteractorImpl$onCameraChosen$1(this, okb0Var, i, i2, null), 3);
    }

    public final void g(okb0 okb0Var, int i, int i2) {
        tje.N(this.i, null, null, new PhotocommentsInteractorImpl$onGalleryChosen$1(this, okb0Var, i, i2, null), 3);
    }

    public final void h(r5s r5sVar, int i, int i2) {
        tje.N(this.i, null, null, new PhotocommentsInteractorImpl$openSourceChooser$1(this, r5sVar, i, i2, null), 3);
    }

    public final void i() {
        tje.N(this.i, null, null, new PhotocommentsInteractorImpl$showMaxPhotosDialog$1(this, null), 3);
    }
}
