package ru.yandex.taxi.logistics.photocomment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.a60;
import defpackage.elb0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.qej;
import defpackage.r40;
import defpackage.sls;
import defpackage.v7j0;
import defpackage.vr;
import defpackage.vu;
import defpackage.y50;
import defpackage.yej;
import defpackage.yvf0;
import defpackage.zej;
import defpackage.zii;
import defpackage.zy11;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes5.dex */
public final class b {
    public final Context a;
    public final zii b;
    public final yvf0 c;
    public final vu d;
    public final v7j0 e;
    public final g f;
    public final a g;
    public final y50 h;
    public final vr i;
    public final com.yandex.delivery.utils.dialogmanager.impl.b j;
    public final elb0 k;
    public final oep0 l;
    public sls m;

    public b(Context context, zii ziiVar, yvf0 yvf0Var, vu vuVar, v7j0 v7j0Var, g gVar, a aVar, y50 y50Var, vr vrVar, com.yandex.delivery.utils.dialogmanager.impl.b bVar, elb0 elb0Var, oep0 oep0Var) {
        this.a = context;
        this.b = ziiVar;
        this.c = yvf0Var;
        this.d = vuVar;
        this.e = v7j0Var;
        this.f = gVar;
        this.g = aVar;
        this.h = y50Var;
        this.i = vrVar;
        this.j = bVar;
        this.k = elb0Var;
        this.l = oep0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(2:20|(1:22)(3:23|24|(1:26)))|13|14|15))|33|6|7|8|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        defpackage.jst.e.j(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r40 r40Var, int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$handleCameraResult$1 deliveryPhotocommentRouter$handleCameraResult$1;
        int i4;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$handleCameraResult$1) {
            deliveryPhotocommentRouter$handleCameraResult$1 = (DeliveryPhotocommentRouter$handleCameraResult$1) continuationImpl;
            int i5 = deliveryPhotocommentRouter$handleCameraResult$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$handleCameraResult$1.label = i5 - Integer.MIN_VALUE;
                DeliveryPhotocommentRouter$handleCameraResult$1 deliveryPhotocommentRouter$handleCameraResult$12 = deliveryPhotocommentRouter$handleCameraResult$1;
                Object obj = deliveryPhotocommentRouter$handleCameraResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$handleCameraResult$12.label;
                vr vrVar = this.i;
                zy11 zy11Var = zy11.a;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    if (r40Var.a != -1) {
                        return zy11Var;
                    }
                    Uri g = vrVar.g();
                    a aVar = this.g;
                    deliveryPhotocommentRouter$handleCameraResult$12.L$0 = null;
                    deliveryPhotocommentRouter$handleCameraResult$12.L$1 = null;
                    deliveryPhotocommentRouter$handleCameraResult$12.I$0 = i;
                    deliveryPhotocommentRouter$handleCameraResult$12.I$1 = i2;
                    deliveryPhotocommentRouter$handleCameraResult$12.I$2 = i3;
                    deliveryPhotocommentRouter$handleCameraResult$12.label = 1;
                    if (aVar.e(i, g, i2, i3, deliveryPhotocommentRouter$handleCameraResult$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                vrVar.getClass();
                new File(new File(vrVar.a.getCacheDir(), "logistics"), "photo_storage.jpg").delete();
                return zy11Var;
            }
        }
        deliveryPhotocommentRouter$handleCameraResult$1 = new DeliveryPhotocommentRouter$handleCameraResult$1(this, continuationImpl);
        DeliveryPhotocommentRouter$handleCameraResult$1 deliveryPhotocommentRouter$handleCameraResult$122 = deliveryPhotocommentRouter$handleCameraResult$1;
        Object obj2 = deliveryPhotocommentRouter$handleCameraResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$handleCameraResult$122.label;
        vr vrVar2 = this.i;
        zy11 zy11Var2 = zy11.a;
        if (i4 != 0) {
        }
        vrVar2.getClass();
        new File(new File(vrVar2.a.getCacheDir(), "logistics"), "photo_storage.jpg").delete();
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(4:20|(2:26|(1:28))|14|15)|13|14|15))|34|6|7|8|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        defpackage.jst.e.j(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r40 r40Var, int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$handleGalleryResult$1 deliveryPhotocommentRouter$handleGalleryResult$1;
        int i4;
        Intent intent;
        Uri data;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$handleGalleryResult$1) {
            deliveryPhotocommentRouter$handleGalleryResult$1 = (DeliveryPhotocommentRouter$handleGalleryResult$1) continuationImpl;
            int i5 = deliveryPhotocommentRouter$handleGalleryResult$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$handleGalleryResult$1.label = i5 - Integer.MIN_VALUE;
                DeliveryPhotocommentRouter$handleGalleryResult$1 deliveryPhotocommentRouter$handleGalleryResult$12 = deliveryPhotocommentRouter$handleGalleryResult$1;
                Object obj = deliveryPhotocommentRouter$handleGalleryResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$handleGalleryResult$12.label;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    if (r40Var.a == -1 && (intent = r40Var.c) != null && (data = intent.getData()) != null) {
                        a aVar = this.g;
                        deliveryPhotocommentRouter$handleGalleryResult$12.L$0 = null;
                        deliveryPhotocommentRouter$handleGalleryResult$12.L$1 = null;
                        deliveryPhotocommentRouter$handleGalleryResult$12.I$0 = i;
                        deliveryPhotocommentRouter$handleGalleryResult$12.I$1 = i2;
                        deliveryPhotocommentRouter$handleGalleryResult$12.I$2 = i3;
                        deliveryPhotocommentRouter$handleGalleryResult$12.label = 1;
                        if (aVar.e(i, data, i2, i3, deliveryPhotocommentRouter$handleGalleryResult$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i4 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
        }
        deliveryPhotocommentRouter$handleGalleryResult$1 = new DeliveryPhotocommentRouter$handleGalleryResult$1(this, continuationImpl);
        DeliveryPhotocommentRouter$handleGalleryResult$1 deliveryPhotocommentRouter$handleGalleryResult$122 = deliveryPhotocommentRouter$handleGalleryResult$1;
        Object obj2 = deliveryPhotocommentRouter$handleGalleryResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$handleGalleryResult$122.label;
        if (i4 != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$launchCameraIfPermitted$1 deliveryPhotocommentRouter$launchCameraIfPermitted$1;
        int i4;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$launchCameraIfPermitted$1) {
            deliveryPhotocommentRouter$launchCameraIfPermitted$1 = (DeliveryPhotocommentRouter$launchCameraIfPermitted$1) continuationImpl;
            int i5 = deliveryPhotocommentRouter$launchCameraIfPermitted$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$launchCameraIfPermitted$1.label = i5 - Integer.MIN_VALUE;
                DeliveryPhotocommentRouter$launchCameraIfPermitted$1 deliveryPhotocommentRouter$launchCameraIfPermitted$12 = deliveryPhotocommentRouter$launchCameraIfPermitted$1;
                Object obj = deliveryPhotocommentRouter$launchCameraIfPermitted$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$launchCameraIfPermitted$12.label;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", this.i.g());
                    a60 a60Var = (a60) this.h;
                    a60Var.getClass();
                    try {
                        a60Var.e(HProv.PP_SECURITY_LEVEL, intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                    deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$0 = i;
                    deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$1 = i2;
                    deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$2 = i3;
                    deliveryPhotocommentRouter$launchCameraIfPermitted$12.label = 1;
                    obj = this.f.d(HProv.PP_SECURITY_LEVEL, deliveryPhotocommentRouter$launchCameraIfPermitted$12);
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    i3 = deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$2;
                    i2 = deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$1;
                    i = deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$0;
                    kotlin.b.b(obj);
                }
                int i6 = i2;
                int i7 = i3;
                deliveryPhotocommentRouter$launchCameraIfPermitted$12.L$0 = null;
                deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$0 = i;
                deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$1 = i6;
                deliveryPhotocommentRouter$launchCameraIfPermitted$12.I$2 = i7;
                deliveryPhotocommentRouter$launchCameraIfPermitted$12.label = 2;
                Object a = a((r40) obj, i, i6, i7, deliveryPhotocommentRouter$launchCameraIfPermitted$12);
                return a != obj2 ? obj2 : a;
            }
        }
        deliveryPhotocommentRouter$launchCameraIfPermitted$1 = new DeliveryPhotocommentRouter$launchCameraIfPermitted$1(this, continuationImpl);
        DeliveryPhotocommentRouter$launchCameraIfPermitted$1 deliveryPhotocommentRouter$launchCameraIfPermitted$122 = deliveryPhotocommentRouter$launchCameraIfPermitted$1;
        Object obj3 = deliveryPhotocommentRouter$launchCameraIfPermitted$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$launchCameraIfPermitted$122.label;
        if (i4 != 0) {
        }
        int i62 = i2;
        int i72 = i3;
        deliveryPhotocommentRouter$launchCameraIfPermitted$122.L$0 = null;
        deliveryPhotocommentRouter$launchCameraIfPermitted$122.I$0 = i;
        deliveryPhotocommentRouter$launchCameraIfPermitted$122.I$1 = i62;
        deliveryPhotocommentRouter$launchCameraIfPermitted$122.I$2 = i72;
        deliveryPhotocommentRouter$launchCameraIfPermitted$122.label = 2;
        Object a2 = a((r40) obj3, i, i62, i72, deliveryPhotocommentRouter$launchCameraIfPermitted$122);
        if (a2 != obj22) {
        }
    }

    public final jqr d() {
        return new jqr(this.k.d(), new DeliveryPhotocommentRouter$observeUploadErrors$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$onCameraPhotocommentChosen$1 deliveryPhotocommentRouter$onCameraPhotocommentChosen$1;
        int i4;
        boolean booleanValue;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$onCameraPhotocommentChosen$1) {
            deliveryPhotocommentRouter$onCameraPhotocommentChosen$1 = (DeliveryPhotocommentRouter$onCameraPhotocommentChosen$1) continuationImpl;
            int i5 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label = i5 - Integer.MIN_VALUE;
                Object obj = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label;
                v7j0 v7j0Var = this.e;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$0 = i;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$1 = i2;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$2 = i3;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(3, deliveryPhotocommentRouter$onCameraPhotocommentChosen$1);
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        if (i4 == 3) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$2;
                    i2 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$1;
                    i = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$0 = i;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$1 = i2;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$2 = i3;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.Z$0 = booleanValue;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label = 2;
                    Object c = c(i, i2, i3, deliveryPhotocommentRouter$onCameraPhotocommentChosen$1);
                    if (c != obj2) {
                        return c;
                    }
                } else {
                    if (((com.yandex.go.permission.b) v7j0Var).f(3)) {
                        return zy11.a;
                    }
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$0 = i;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$1 = i2;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.I$2 = i3;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.Z$0 = booleanValue;
                    deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label = 3;
                    Object g = g(i, i2, i3, deliveryPhotocommentRouter$onCameraPhotocommentChosen$1);
                    if (g != obj2) {
                        return g;
                    }
                }
                return obj2;
            }
        }
        deliveryPhotocommentRouter$onCameraPhotocommentChosen$1 = new DeliveryPhotocommentRouter$onCameraPhotocommentChosen$1(this, continuationImpl);
        Object obj3 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$onCameraPhotocommentChosen$1.label;
        v7j0 v7j0Var2 = this.e;
        if (i4 != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1 deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1;
        int i4;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1) {
            deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1 = (DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1) continuationImpl;
            int i5 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1.label = i5 - Integer.MIN_VALUE;
                DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1 deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1;
                Object obj = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.label;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    a60 a60Var = (a60) this.h;
                    a60Var.getClass();
                    try {
                        a60Var.e(HProv.PP_SECURITY_LEVEL, intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                    deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$0 = i;
                    deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$1 = i2;
                    deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$2 = i3;
                    deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.label = 1;
                    obj = this.f.d(HProv.PP_SECURITY_LEVEL, deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12);
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    i3 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$2;
                    i2 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$1;
                    i = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$0;
                    kotlin.b.b(obj);
                }
                int i6 = i2;
                int i7 = i3;
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.L$0 = null;
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$0 = i;
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$1 = i6;
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.I$2 = i7;
                deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12.label = 2;
                Object b = b((r40) obj, i, i6, i7, deliveryPhotocommentRouter$onGalleryPhotocommentChosen$12);
                return b != obj2 ? obj2 : b;
            }
        }
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1 = new DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1(this, continuationImpl);
        DeliveryPhotocommentRouter$onGalleryPhotocommentChosen$1 deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$1;
        Object obj3 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.label;
        if (i4 != 0) {
        }
        int i62 = i2;
        int i72 = i3;
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.L$0 = null;
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.I$0 = i;
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.I$1 = i62;
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.I$2 = i72;
        deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122.label = 2;
        Object b2 = b((r40) obj3, i, i62, i72, deliveryPhotocommentRouter$onGalleryPhotocommentChosen$122);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0101, code lost:
    
        if (e(r7, r6, r4, r2) != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r7 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, int i2, int i3, ContinuationImpl continuationImpl) {
        DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1 deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1;
        int i4;
        int i5;
        int i6;
        int i7;
        Object a;
        int i8;
        int i9;
        int i10;
        sls slsVar;
        if (continuationImpl instanceof DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1) {
            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1 = (DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i11 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label = i11 - Integer.MIN_VALUE;
                Object obj = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label;
                Context context = this.a;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    qej qejVar = new qej(null, context.getString(kyh0.delivery_photocomment_camera_permission_dialog_title), context.getString(kyh0.delivery_photocomment_camera_permission_dialog_settings), context.getString(kyh0.delivery_photocomment_dialog_cancel), null, false, null, null, 241);
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$0 = null;
                    i5 = i;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0 = i5;
                    i6 = i2;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1 = i6;
                    i7 = i3;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2 = i7;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label = 1;
                    a = this.j.a(qejVar, deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1);
                } else if (i4 == 1) {
                    int i12 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2;
                    int i13 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1;
                    int i14 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0;
                    kotlin.b.b(obj);
                    i7 = i12;
                    i6 = i13;
                    a = obj;
                    i5 = i14;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        slsVar = this.m;
                        if (slsVar != null) {
                            slsVar.invoke();
                        }
                        return zy11.a;
                    }
                    i10 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2;
                    i9 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1;
                    i8 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0;
                    kotlin.b.b(obj);
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$0 = null;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$1 = null;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0 = i8;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1 = i9;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2 = i10;
                    deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label = 3;
                }
                if (jl40.l((zej) a, yej.a)) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        a60 a60Var = (a60) this.h;
                        a60Var.getClass();
                        try {
                            a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                        } catch (ActivityNotFoundException unused) {
                        }
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$0 = null;
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$1 = null;
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0 = i5;
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1 = i6;
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2 = i7;
                        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label = 2;
                        if (this.f.d(HProv.PP_DELETE_SAVED_PASSWD, deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1) != obj2) {
                            i8 = i5;
                            i9 = i6;
                            i10 = i7;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$0 = null;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.L$1 = null;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$0 = i8;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$1 = i9;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.I$2 = i10;
                            deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label = 3;
                        }
                        return obj2;
                    }
                }
                slsVar = this.m;
                if (slsVar != null) {
                }
                return zy11.a;
            }
        }
        deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1 = new DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1(this, continuationImpl);
        Object obj3 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = deliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1.label;
        Context context2 = this.a;
        if (i4 != 0) {
        }
        if (jl40.l((zej) a, yej.a)) {
        }
        slsVar = this.m;
        if (slsVar != null) {
        }
        return zy11.a;
    }
}
