package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bvf0;
import defpackage.dys0;
import defpackage.eys0;
import defpackage.fys0;
import defpackage.gci0;
import defpackage.gp7;
import defpackage.gys0;
import defpackage.hys0;
import defpackage.ike;
import defpackage.j4z;
import defpackage.jse;
import defpackage.kn1;
import defpackage.kt7;
import defpackage.ln1;
import defpackage.lys0;
import defpackage.mhe;
import defpackage.nhe;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q8s;
import defpackage.qxs0;
import defpackage.qys0;
import defpackage.rk6;
import defpackage.rxs0;
import defpackage.st2;
import defpackage.sys0;
import defpackage.tis0;
import defpackage.tje;
import defpackage.tys0;
import defpackage.w511;
import defpackage.wbf;
import defpackage.wxs0;
import defpackage.xxs0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.h;

/* loaded from: classes5.dex */
public final class a implements kt7 {
    public final q8s a;
    public final kn1 b;
    public final st2 c;
    public h d;
    public Bitmap e;
    public final ike f;
    public final r0 g;
    public final gci0 h;

    public a(q8s q8sVar, kn1 kn1Var, st2 st2Var) {
        this.a = q8sVar;
        this.b = kn1Var;
        this.c = st2Var;
        this.f = bvf0.a(st2Var.a);
        r0 c = bvf0.c(sys0.a);
        this.g = c;
        this.h = e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(a aVar, qys0 qys0Var, byte[] bArr, wbf wbfVar, ContinuationImpl continuationImpl) {
        AiCameraStrategy$handlePhotoTaken$1 aiCameraStrategy$handlePhotoTaken$1;
        int i;
        Bitmap bitmap;
        Bitmap bitmap2;
        h hVar;
        aVar.getClass();
        st2 st2Var = aVar.c;
        if (continuationImpl instanceof AiCameraStrategy$handlePhotoTaken$1) {
            aiCameraStrategy$handlePhotoTaken$1 = (AiCameraStrategy$handlePhotoTaken$1) continuationImpl;
            int i2 = aiCameraStrategy$handlePhotoTaken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiCameraStrategy$handlePhotoTaken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aiCameraStrategy$handlePhotoTaken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiCameraStrategy$handlePhotoTaken$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jse jseVar = st2Var.b;
                    AiCameraStrategy$handlePhotoTaken$2 aiCameraStrategy$handlePhotoTaken$2 = new AiCameraStrategy$handlePhotoTaken$2(aVar, bArr, null);
                    aiCameraStrategy$handlePhotoTaken$1.L$0 = qys0Var;
                    aiCameraStrategy$handlePhotoTaken$1.L$1 = null;
                    aiCameraStrategy$handlePhotoTaken$1.L$2 = wbfVar;
                    aiCameraStrategy$handlePhotoTaken$1.label = 1;
                    obj = tje.k0(jseVar, aiCameraStrategy$handlePhotoTaken$2, aiCameraStrategy$handlePhotoTaken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wbfVar = (wbf) aiCameraStrategy$handlePhotoTaken$1.L$2;
                    qys0Var = (qys0) aiCameraStrategy$handlePhotoTaken$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                bitmap = (Bitmap) pair.getFirst();
                bitmap2 = (Bitmap) pair.getSecond();
                if (bitmap != null && bitmap2 != null) {
                    hVar = aVar.d;
                    if (hVar != null) {
                        ((ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) hVar.a.b.get()).a(hVar.b, hVar.c, new tis0((Object) ModalViewType.OVER_CAMERA, (Object) 462, z, 16));
                    }
                    tje.N(aVar.f, st2Var.b, null, new AiCameraStrategy$handlePhotoProcessing$1(aVar, bitmap, wbfVar, null), 2);
                    aVar.i(qys0Var, bitmap2, false, mhe.a);
                }
                return zy11.a;
            }
        }
        aiCameraStrategy$handlePhotoTaken$1 = new AiCameraStrategy$handlePhotoTaken$1(aVar, continuationImpl);
        Object obj2 = aiCameraStrategy$handlePhotoTaken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiCameraStrategy$handlePhotoTaken$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        bitmap = (Bitmap) pair2.getFirst();
        bitmap2 = (Bitmap) pair2.getSecond();
        if (bitmap != null) {
            hVar = aVar.d;
            if (hVar != null) {
            }
            tje.N(aVar.f, st2Var.b, null, new AiCameraStrategy$handlePhotoProcessing$1(aVar, bitmap, wbfVar, null), 2);
            aVar.i(qys0Var, bitmap2, false, mhe.a);
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(a aVar, qys0 qys0Var, Uri uri, ContinuationImpl continuationImpl) {
        AiCameraStrategy$prepareImagesFromGallery$1 aiCameraStrategy$prepareImagesFromGallery$1;
        int i;
        Bitmap bitmap;
        aVar.getClass();
        if (continuationImpl instanceof AiCameraStrategy$prepareImagesFromGallery$1) {
            aiCameraStrategy$prepareImagesFromGallery$1 = (AiCameraStrategy$prepareImagesFromGallery$1) continuationImpl;
            int i2 = aiCameraStrategy$prepareImagesFromGallery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiCameraStrategy$prepareImagesFromGallery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aiCameraStrategy$prepareImagesFromGallery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiCameraStrategy$prepareImagesFromGallery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jse jseVar = aVar.c.b;
                    AiCameraStrategy$prepareImagesFromGallery$2 aiCameraStrategy$prepareImagesFromGallery$2 = new AiCameraStrategy$prepareImagesFromGallery$2(aVar, uri, null);
                    aiCameraStrategy$prepareImagesFromGallery$1.L$0 = qys0Var;
                    aiCameraStrategy$prepareImagesFromGallery$1.L$1 = null;
                    aiCameraStrategy$prepareImagesFromGallery$1.label = 1;
                    obj = tje.k0(jseVar, aiCameraStrategy$prepareImagesFromGallery$2, aiCameraStrategy$prepareImagesFromGallery$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qys0Var = (qys0) aiCameraStrategy$prepareImagesFromGallery$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                Bitmap bitmap2 = (Bitmap) pair.getFirst();
                bitmap = (Bitmap) pair.getSecond();
                aVar.e = bitmap2;
                if (bitmap != null) {
                    aVar.i(qys0Var, bitmap, true, mhe.b);
                }
                return zy11.a;
            }
        }
        aiCameraStrategy$prepareImagesFromGallery$1 = new AiCameraStrategy$prepareImagesFromGallery$1(aVar, continuationImpl);
        Object obj2 = aiCameraStrategy$prepareImagesFromGallery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiCameraStrategy$prepareImagesFromGallery$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        Bitmap bitmap22 = (Bitmap) pair2.getFirst();
        bitmap = (Bitmap) pair2.getSecond();
        aVar.e = bitmap22;
        if (bitmap != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.kt7
    public final gci0 a() {
        return this.h;
    }

    @Override // defpackage.kt7
    public final void b() {
        bvf0.j(this.f, null);
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.e = null;
    }

    @Override // defpackage.kt7
    public final void c(xxs0 xxs0Var) {
        if (xxs0Var instanceof rxs0) {
            rxs0 rxs0Var = (rxs0) xxs0Var;
            if (rxs0Var.equals(wxs0.a)) {
                h hVar = this.d;
                if (hVar != null) {
                    hVar.a.f.b(hVar.b.a);
                    return;
                }
                return;
            }
            if (!rxs0Var.equals(qxs0.a)) {
                w511.b();
                return;
            }
            Object value = this.h.a.getValue();
            qys0 qys0Var = value instanceof qys0 ? (qys0) value : null;
            if (qys0Var == null) {
                return;
            }
            qys0 a = qys0.a(qys0Var, null, mhe.a, false, 19);
            r0 r0Var = this.g;
            r0Var.getClass();
            r0Var.m(null, a);
        }
    }

    @Override // defpackage.kt7
    public final void d(lys0 lys0Var, rk6 rk6Var) {
        r0 r0Var = this.g;
        tys0 tys0Var = (tys0) r0Var.getValue();
        if ((lys0Var instanceof hys0) && (tys0Var instanceof qys0)) {
            hys0 hys0Var = (hys0) lys0Var;
            boolean z = hys0Var instanceof dys0;
            ike ikeVar = this.f;
            if (z) {
                tje.N(ikeVar, null, null, new AiCameraStrategy$handleInnerCameraAction$1(this, tys0Var, lys0Var, null), 3);
                return;
            }
            if (hys0Var.equals(eys0.a)) {
                qys0 qys0Var = (qys0) tys0Var;
                if (qys0Var.c != null) {
                    qys0 a = qys0.a(qys0Var, null, null, false, 11);
                    r0Var.getClass();
                    r0Var.m(null, a);
                    Bitmap bitmap = this.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.e = null;
                }
                rk6Var.invoke();
                return;
            }
            if (hys0Var instanceof fys0) {
                tje.N(ikeVar, null, null, new AiCameraStrategy$handleInnerCameraAction$2(this, tys0Var, lys0Var, null), 3);
                return;
            }
            if (!(hys0Var instanceof gys0)) {
                w511.b();
                return;
            }
            qys0 qys0Var2 = (qys0) tys0Var;
            wbf wbfVar = ((gys0) lys0Var).a;
            Bitmap bitmap2 = this.e;
            if (bitmap2 != null) {
                h hVar = this.d;
                if (hVar != null) {
                    ((ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) hVar.a.b.get()).a(hVar.b, hVar.c, new tis0((Object) ModalViewType.OVER_CAMERA, (Object) 462, true, 16));
                }
                tje.N(ikeVar, this.c.b, null, new AiCameraStrategy$handlePhotoProcessing$1(this, bitmap2, wbfVar, null), 2);
            }
            qys0 a2 = qys0.a(qys0Var2, null, null, false, 15);
            r0Var.getClass();
            r0Var.m(null, a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.kt7
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(gp7 gp7Var, h hVar, ContinuationImpl continuationImpl) {
        AiCameraStrategy$initialize$1 aiCameraStrategy$initialize$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        pz40 pz40Var;
        FormattedText formattedText;
        CharSequence charSequence;
        if (continuationImpl instanceof AiCameraStrategy$initialize$1) {
            aiCameraStrategy$initialize$1 = (AiCameraStrategy$initialize$1) continuationImpl;
            int i2 = aiCameraStrategy$initialize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiCameraStrategy$initialize$1.label = i2 - Integer.MIN_VALUE;
                obj = aiCameraStrategy$initialize$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiCameraStrategy$initialize$1.label;
                q8s q8sVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d = hVar;
                    FormattedText formattedText2 = gp7Var.a;
                    aiCameraStrategy$initialize$1.L$0 = gp7Var;
                    aiCameraStrategy$initialize$1.L$1 = null;
                    pz40Var = this.g;
                    aiCameraStrategy$initialize$1.L$2 = pz40Var;
                    aiCameraStrategy$initialize$1.label = 1;
                    obj = q8sVar.a(formattedText2, aiCameraStrategy$initialize$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pz40Var = (pz40) aiCameraStrategy$initialize$1.L$3;
                        CharSequence charSequence2 = (CharSequence) aiCameraStrategy$initialize$1.L$2;
                        kotlin.b.b(obj);
                        charSequence = charSequence2;
                        qys0 qys0Var = new qys0(charSequence, (CharSequence) obj, null, mhe.a, false);
                        r0 r0Var = (r0) pz40Var;
                        r0Var.getClass();
                        r0Var.m(null, qys0Var);
                        return zy11.a;
                    }
                    pz40Var = (pz40) aiCameraStrategy$initialize$1.L$2;
                    gp7Var = (gp7) aiCameraStrategy$initialize$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                formattedText = gp7Var.b;
                aiCameraStrategy$initialize$1.L$0 = null;
                aiCameraStrategy$initialize$1.L$1 = null;
                aiCameraStrategy$initialize$1.L$2 = charSequence3;
                aiCameraStrategy$initialize$1.L$3 = pz40Var;
                aiCameraStrategy$initialize$1.label = 2;
                if (formattedText == null) {
                    Object a = q8sVar.a(formattedText, aiCameraStrategy$initialize$1);
                    if (a != coroutineSingletons) {
                        a = (CharSequence) a;
                    }
                    obj = a;
                } else {
                    q8sVar.getClass();
                    obj = null;
                }
                if (obj != coroutineSingletons) {
                    charSequence = charSequence3;
                    qys0 qys0Var2 = new qys0(charSequence, (CharSequence) obj, null, mhe.a, false);
                    r0 r0Var2 = (r0) pz40Var;
                    r0Var2.getClass();
                    r0Var2.m(null, qys0Var2);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        aiCameraStrategy$initialize$1 = new AiCameraStrategy$initialize$1(this, continuationImpl);
        obj = aiCameraStrategy$initialize$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiCameraStrategy$initialize$1.label;
        q8s q8sVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj;
        formattedText = gp7Var.b;
        aiCameraStrategy$initialize$1.L$0 = null;
        aiCameraStrategy$initialize$1.L$1 = null;
        aiCameraStrategy$initialize$1.L$2 = charSequence32;
        aiCameraStrategy$initialize$1.L$3 = pz40Var;
        aiCameraStrategy$initialize$1.label = 2;
        if (formattedText == null) {
        }
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void i(qys0 qys0Var, Bitmap bitmap, boolean z, nhe nheVar) {
        qys0 a = qys0.a(qys0Var, new j4z(new ln1(bitmap, 0), null, 30), nheVar, z, 3);
        r0 r0Var = this.g;
        r0Var.getClass();
        r0Var.m(null, a);
    }
}
