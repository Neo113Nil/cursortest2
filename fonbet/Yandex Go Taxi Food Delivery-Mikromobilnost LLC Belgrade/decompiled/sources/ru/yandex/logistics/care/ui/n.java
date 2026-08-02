package ru.yandex.logistics.care.ui;

import android.util.Log;
import defpackage.acu;
import defpackage.bvf0;
import defpackage.cc41;
import defpackage.cr8;
import defpackage.e3n;
import defpackage.ec41;
import defpackage.fb41;
import defpackage.fc41;
import defpackage.fzd;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.geh;
import defpackage.gzd;
import defpackage.hr8;
import defpackage.i4b0;
import defpackage.izd;
import defpackage.jl40;
import defpackage.jzd;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.kzd;
import defpackage.l8x;
import defpackage.mb41;
import defpackage.mzd;
import defpackage.ny61;
import defpackage.nzd;
import defpackage.o430;
import defpackage.or8;
import defpackage.ozd;
import defpackage.pb41;
import defpackage.pzd;
import defpackage.pzt0;
import defpackage.qhb0;
import defpackage.qzd;
import defpackage.rhb0;
import defpackage.sb41;
import defpackage.scc;
import defpackage.shb0;
import defpackage.tcc;
import defpackage.thb0;
import defpackage.tje;
import defpackage.vb41;
import defpackage.vhb0;
import defpackage.vq8;
import defpackage.whb0;
import defpackage.xhb0;
import defpackage.yb41;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.camera.di.Config$CameraControl;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.camera.di.Config$Orientation;

/* loaded from: classes4.dex */
public final class n {
    public final fc41 a;
    public final geh b;
    public final ru.yandex.logistics.care.domain.a c;
    public final k5c d;
    public final or8 e;
    public final r0 f = bvf0.c(kotlin.collections.b.f());
    public final r0 g;
    public final gci0 h;
    public final String i;

    public n(fc41 fc41Var, geh gehVar, ru.yandex.logistics.care.domain.a aVar, k5c k5cVar, or8 or8Var) {
        String str;
        ozd nzdVar;
        ozd ozdVar;
        jzd jzdVar;
        pzd pzdVar;
        this.a = fc41Var;
        this.b = gehVar;
        this.c = aVar;
        this.d = k5cVar;
        this.e = or8Var;
        List list = fc41Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            fb41 fb41Var = (fb41) obj;
            int size = this.a.d.size();
            String str2 = this.a.e.a;
            yb41 yb41Var = fb41Var.g;
            String str3 = fb41Var.a;
            try {
                str = String.format(str2, Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(size)}, 2));
            } catch (Exception unused) {
                str = i2 + " / " + size;
            }
            String str4 = str;
            String str5 = fb41Var.b;
            Config$Orientation config$Orientation = jl40.l(fb41Var.d, "landscape") ? Config$Orientation.Landscape : Config$Orientation.Portrait;
            List<String> list2 = fb41Var.e;
            ArrayList arrayList2 = new ArrayList();
            for (String str6 : list2) {
                Config$CameraControl config$CameraControl = jl40.l(str6, "flash") ? Config$CameraControl.Flash : jl40.l(str6, "lens_selector") ? Config$CameraControl.LensSelector : null;
                if (config$CameraControl != null) {
                    arrayList2.add(config$CameraControl);
                }
            }
            Config$CameraLens config$CameraLens = jl40.l(fb41Var.f, "front") ? Config$CameraLens.Front : Config$CameraLens.Back;
            if (yb41Var != null) {
                String str7 = yb41Var.b;
                String str8 = yb41Var.a;
                if (jl40.l(str8, "static_image")) {
                    nzdVar = new nzd(str7);
                } else {
                    if (jl40.l(str8, "static_graphics")) {
                        nzdVar = new mzd(str7, yb41Var.c, yb41Var.d);
                    }
                    ozdVar = null;
                }
                ozdVar = nzdVar;
            } else {
                if (fb41Var.c) {
                    nzdVar = new nzd(fb41Var.b);
                    ozdVar = nzdVar;
                }
                ozdVar = null;
            }
            ec41 ec41Var = fb41Var.h;
            if (ec41Var != null) {
                int i3 = ec41Var.a;
                cc41 cc41Var = ec41Var.b;
                jzdVar = null;
                pzdVar = new pzd(i3, cc41Var.a, cc41Var.b, cc41Var.c);
            } else {
                jzdVar = null;
                pzdVar = null;
            }
            pb41 pb41Var = fb41Var.i;
            arrayList.add(new fzd(str3, str4, str5, config$Orientation, arrayList2, ozdVar, config$CameraLens, pzdVar, pb41Var != null ? new jzd(pb41Var.a, pb41Var.b) : jzdVar));
            i = i2;
        }
        fc41 fc41Var2 = this.a;
        String str9 = fc41Var2.a;
        vb41 vb41Var = fc41Var2.e;
        r0 c = bvf0.c(new qhb0(new qzd(str9, arrayList, new kzd(new gzd(vb41Var.i, vb41Var.j, vb41Var.k, vb41Var.l), new izd(vb41Var.m, vb41Var.n, vb41Var.o)))));
        this.g = c;
        this.h = kotlinx.coroutines.flow.e.d(c);
        this.i = this.a.a;
        kotlinx.coroutines.a.n(this.d.a).w(new i4b0(8, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if (kotlinx.coroutines.a.j(r12, r3) != r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r1 = r2.f.iterator();
        r5 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c5 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, ContinuationImpl continuationImpl) {
        PhotoProcessingDelegate$animateLoadingTitles$1 photoProcessingDelegate$animateLoadingTitles$1;
        int i;
        Iterator it;
        int i2;
        sb41 sb41Var;
        Iterator it2;
        int i3;
        long j;
        fc41 fc41Var = nVar.a;
        if (continuationImpl instanceof PhotoProcessingDelegate$animateLoadingTitles$1) {
            photoProcessingDelegate$animateLoadingTitles$1 = (PhotoProcessingDelegate$animateLoadingTitles$1) continuationImpl;
            int i4 = photoProcessingDelegate$animateLoadingTitles$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                photoProcessingDelegate$animateLoadingTitles$1.label = i4 - Integer.MIN_VALUE;
                Object obj = photoProcessingDelegate$animateLoadingTitles$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoProcessingDelegate$animateLoadingTitles$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (fc41Var.f.isEmpty()) {
                        return zy11Var;
                    }
                    it = fc41Var.f.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = photoProcessingDelegate$animateLoadingTitles$1.I$0;
                        it2 = (Iterator) photoProcessingDelegate$animateLoadingTitles$1.L$1;
                        kotlin.b.b(obj);
                        it = it2;
                        while (!it.hasNext()) {
                            it = fc41Var.f.iterator();
                            i2 = 0;
                        }
                        sb41Var = (sb41) it.next();
                        r0 r0Var = nVar.g;
                        thb0 thb0Var = new thb0(sb41Var.a);
                        photoProcessingDelegate$animateLoadingTitles$1.L$0 = null;
                        photoProcessingDelegate$animateLoadingTitles$1.L$1 = it;
                        photoProcessingDelegate$animateLoadingTitles$1.L$2 = null;
                        photoProcessingDelegate$animateLoadingTitles$1.L$3 = sb41Var;
                        photoProcessingDelegate$animateLoadingTitles$1.I$0 = i2;
                        photoProcessingDelegate$animateLoadingTitles$1.I$1 = 0;
                        photoProcessingDelegate$animateLoadingTitles$1.label = 1;
                        r0Var.emit(thb0Var, photoProcessingDelegate$animateLoadingTitles$1);
                        if (zy11Var != coroutineSingletons) {
                            it2 = it;
                            i3 = 0;
                            o430 o430Var = e3n.b;
                            j = sb41Var.b;
                            if (j < 1) {
                                j = 1;
                            }
                            long V = kp50.V(j, DurationUnit.SECONDS);
                            photoProcessingDelegate$animateLoadingTitles$1.L$0 = null;
                            photoProcessingDelegate$animateLoadingTitles$1.L$1 = it2;
                            photoProcessingDelegate$animateLoadingTitles$1.L$2 = null;
                            photoProcessingDelegate$animateLoadingTitles$1.L$3 = null;
                            photoProcessingDelegate$animateLoadingTitles$1.I$0 = i2;
                            photoProcessingDelegate$animateLoadingTitles$1.I$1 = i3;
                            photoProcessingDelegate$animateLoadingTitles$1.label = 2;
                        }
                        return coroutineSingletons;
                    }
                    int i5 = photoProcessingDelegate$animateLoadingTitles$1.I$1;
                    int i6 = photoProcessingDelegate$animateLoadingTitles$1.I$0;
                    sb41Var = (sb41) photoProcessingDelegate$animateLoadingTitles$1.L$3;
                    Iterator it3 = (Iterator) photoProcessingDelegate$animateLoadingTitles$1.L$1;
                    kotlin.b.b(obj);
                    i3 = i5;
                    i2 = i6;
                    it2 = it3;
                    o430 o430Var2 = e3n.b;
                    j = sb41Var.b;
                    if (j < 1) {
                    }
                    long V2 = kp50.V(j, DurationUnit.SECONDS);
                    photoProcessingDelegate$animateLoadingTitles$1.L$0 = null;
                    photoProcessingDelegate$animateLoadingTitles$1.L$1 = it2;
                    photoProcessingDelegate$animateLoadingTitles$1.L$2 = null;
                    photoProcessingDelegate$animateLoadingTitles$1.L$3 = null;
                    photoProcessingDelegate$animateLoadingTitles$1.I$0 = i2;
                    photoProcessingDelegate$animateLoadingTitles$1.I$1 = i3;
                    photoProcessingDelegate$animateLoadingTitles$1.label = 2;
                }
            }
        }
        photoProcessingDelegate$animateLoadingTitles$1 = new PhotoProcessingDelegate$animateLoadingTitles$1(nVar, continuationImpl);
        Object obj2 = photoProcessingDelegate$animateLoadingTitles$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoProcessingDelegate$animateLoadingTitles$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, File file, fzd fzdVar, ContinuationImpl continuationImpl) {
        PhotoProcessingDelegate$uploadPhoto$1 photoProcessingDelegate$uploadPhoto$1;
        int i;
        Object a;
        File file2;
        Object vhb0Var;
        r0 r0Var;
        Object value;
        nVar.getClass();
        if (continuationImpl instanceof PhotoProcessingDelegate$uploadPhoto$1) {
            photoProcessingDelegate$uploadPhoto$1 = (PhotoProcessingDelegate$uploadPhoto$1) continuationImpl;
            int i2 = photoProcessingDelegate$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photoProcessingDelegate$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                PhotoProcessingDelegate$uploadPhoto$1 photoProcessingDelegate$uploadPhoto$12 = photoProcessingDelegate$uploadPhoto$1;
                Object obj = photoProcessingDelegate$uploadPhoto$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoProcessingDelegate$uploadPhoto$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.logistics.care.domain.a aVar = nVar.c;
                    String str = fzdVar.c;
                    mb41 mb41Var = nVar.a.c.a;
                    String str2 = mb41Var.a;
                    Map map = mb41Var.b;
                    photoProcessingDelegate$uploadPhoto$12.L$0 = file;
                    photoProcessingDelegate$uploadPhoto$12.L$1 = fzdVar;
                    photoProcessingDelegate$uploadPhoto$12.label = 1;
                    a = aVar.a(str, file, str2, map, photoProcessingDelegate$uploadPhoto$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    file2 = file;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fzdVar = (fzd) photoProcessingDelegate$uploadPhoto$12.L$1;
                    file2 = (File) photoProcessingDelegate$uploadPhoto$12.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    file2.delete();
                    vhb0Var = new xhb0(file2);
                } else {
                    geh gehVar = nVar.b;
                    String o = g8e.o("Failed to upload photo: type=", fzdVar.c);
                    Throwable a2 = Result.a(a);
                    gehVar.getClass();
                    if (a2 != null) {
                        Log.e("Care_SDK", o, a2);
                    } else {
                        Log.e("Care_SDK", o);
                    }
                    vhb0Var = new vhb0(file2, fzdVar);
                }
                r0Var = nVar.f;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.b.o((Map) value, new Pair(fzdVar.c, vhb0Var))));
                return zy11.a;
            }
        }
        photoProcessingDelegate$uploadPhoto$1 = new PhotoProcessingDelegate$uploadPhoto$1(nVar, continuationImpl);
        PhotoProcessingDelegate$uploadPhoto$1 photoProcessingDelegate$uploadPhoto$122 = photoProcessingDelegate$uploadPhoto$1;
        Object obj2 = photoProcessingDelegate$uploadPhoto$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoProcessingDelegate$uploadPhoto$122.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        r0Var = nVar.f;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.o((Map) value, new Pair(fzdVar.c, vhb0Var))));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n nVar, ContinuationImpl continuationImpl) {
        PhotoProcessingDelegate$waitForUploadsAndUpdateState$1 photoProcessingDelegate$waitForUploadsAndUpdateState$1;
        int i;
        l8x l8xVar;
        ArrayList arrayList;
        fc41 fc41Var = nVar.a;
        r0 r0Var = nVar.g;
        or8 or8Var = nVar.e;
        if (continuationImpl instanceof PhotoProcessingDelegate$waitForUploadsAndUpdateState$1) {
            photoProcessingDelegate$waitForUploadsAndUpdateState$1 = (PhotoProcessingDelegate$waitForUploadsAndUpdateState$1) continuationImpl;
            int i2 = photoProcessingDelegate$waitForUploadsAndUpdateState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photoProcessingDelegate$waitForUploadsAndUpdateState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = photoProcessingDelegate$waitForUploadsAndUpdateState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoProcessingDelegate$waitForUploadsAndUpdateState$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    or8Var.k(cr8.b);
                    pzt0 N = tje.N(nVar.d, null, null, new PhotoProcessingDelegate$waitForUploadsAndUpdateState$animationJob$1(nVar, null), 3);
                    acu acuVar = new acu(nVar.f, 11);
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$0 = N;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.label = 1;
                    Object y = kotlinx.coroutines.flow.e.y(acuVar, photoProcessingDelegate$waitForUploadsAndUpdateState$1);
                    if (y != coroutineSingletons) {
                        obj = y;
                        l8xVar = N;
                    }
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                l8xVar = (l8x) photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$0;
                kotlin.b.b(obj);
                l8xVar.a(null);
                Collection values = ((Map) obj).values();
                arrayList = new ArrayList();
                for (Object obj2 : values) {
                    if (obj2 instanceof vhb0) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    or8Var.k(hr8.b);
                    vb41 vb41Var = fc41Var.e;
                    shb0 shb0Var = new shb0(vb41Var.f, vb41Var.g, vb41Var.h);
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$0 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$1 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$2 = null;
                    photoProcessingDelegate$waitForUploadsAndUpdateState$1.label = 2;
                    r0Var.emit(shb0Var, photoProcessingDelegate$waitForUploadsAndUpdateState$1);
                    return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                or8Var.k(vq8.b);
                vb41 vb41Var2 = fc41Var.e;
                rhb0 rhb0Var = new rhb0(vb41Var2.b, vb41Var2.c, vb41Var2.d, vb41Var2.e);
                photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$0 = null;
                photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$1 = null;
                photoProcessingDelegate$waitForUploadsAndUpdateState$1.L$2 = null;
                photoProcessingDelegate$waitForUploadsAndUpdateState$1.label = 3;
                r0Var.emit(rhb0Var, photoProcessingDelegate$waitForUploadsAndUpdateState$1);
                if (zy11Var == coroutineSingletons) {
                }
            }
        }
        photoProcessingDelegate$waitForUploadsAndUpdateState$1 = new PhotoProcessingDelegate$waitForUploadsAndUpdateState$1(nVar, continuationImpl);
        Object obj3 = photoProcessingDelegate$waitForUploadsAndUpdateState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoProcessingDelegate$waitForUploadsAndUpdateState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        l8xVar.a(null);
        Collection values2 = ((Map) obj3).values();
        arrayList = new ArrayList();
        while (r13.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
    }

    public final void d() {
        tje.N(this.d, null, null, new PhotoProcessingDelegate$handleCameraClosed$1(this, null), 3);
    }

    public final void e(File file, fzd fzdVar) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.f;
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.o((Map) value, new Pair(fzdVar.c, new whb0(file)))));
        tje.N(this.d, null, null, new PhotoProcessingDelegate$onPhotoConfirmed$2(this, file, fzdVar, null), 3);
    }
}
