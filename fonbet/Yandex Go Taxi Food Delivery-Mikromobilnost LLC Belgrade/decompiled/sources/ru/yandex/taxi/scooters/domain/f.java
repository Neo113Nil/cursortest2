package ru.yandex.taxi.scooters.domain;

import android.net.Uri;
import defpackage.acn0;
import defpackage.g8m0;
import defpackage.kpm0;
import defpackage.l8x;
import defpackage.lpm0;
import defpackage.ny61;
import defpackage.ojb0;
import defpackage.ppm0;
import defpackage.qan0;
import defpackage.sdc;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.w8v;
import defpackage.ywm0;
import defpackage.zjo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.data.model.PhotoType;
import ru.yandex.taxi.scooters.data.v;
import ru.yandex.taxi.scooters.data.w;

/* loaded from: classes6.dex */
public final class f implements zjo0 {
    public final w a;
    public final v b;
    public final acn0 c;
    public final ywm0 d;

    public f(w wVar, v vVar, acn0 acn0Var, ywm0 ywm0Var) {
        this.a = wVar;
        this.b = vVar;
        this.c = acn0Var;
        this.d = ywm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (r1.b(r5, r11, r13, r3) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
        if (r1.a(r11, r12, r13, r3) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009d -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(f fVar, String str, List list, ContinuationImpl continuationImpl) {
        ScootersDamagePhotosInteractor$realUploadPhotos$1 scootersDamagePhotosInteractor$realUploadPhotos$1;
        int i;
        Iterator it;
        String str2;
        ojb0 ojb0Var = ojb0.b;
        v vVar = fVar.b;
        acn0 acn0Var = fVar.c;
        try {
            if (continuationImpl instanceof ScootersDamagePhotosInteractor$realUploadPhotos$1) {
                scootersDamagePhotosInteractor$realUploadPhotos$1 = (ScootersDamagePhotosInteractor$realUploadPhotos$1) continuationImpl;
                int i2 = scootersDamagePhotosInteractor$realUploadPhotos$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDamagePhotosInteractor$realUploadPhotos$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersDamagePhotosInteractor$realUploadPhotos$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDamagePhotosInteractor$realUploadPhotos$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        PhotoType photoType = PhotoType.FEEDBACK;
                        scootersDamagePhotosInteractor$realUploadPhotos$1.L$0 = str;
                        scootersDamagePhotosInteractor$realUploadPhotos$1.L$1 = list;
                        scootersDamagePhotosInteractor$realUploadPhotos$1.label = 1;
                    } else if (i == 1) {
                        list = (List) scootersDamagePhotosInteractor$realUploadPhotos$1.L$1;
                        str = (String) scootersDamagePhotosInteractor$realUploadPhotos$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kpm0 kpm0Var = (kpm0) scootersDamagePhotosInteractor$realUploadPhotos$1.L$3;
                        it = (Iterator) scootersDamagePhotosInteractor$realUploadPhotos$1.L$2;
                        str2 = (String) scootersDamagePhotosInteractor$realUploadPhotos$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            LinkedHashMap linkedHashMap = acn0Var.c;
                            Integer num = (Integer) linkedHashMap.get(str2);
                            linkedHashMap.put(str2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                            fVar.j(str2, kpm0Var);
                            if (!it.hasNext()) {
                                acn0Var.c(str2, new ojb0());
                                return zy11.a;
                            }
                            kpm0Var = (kpm0) it.next();
                            acn0Var.c(str2, new ojb0());
                            PhotoType photoType2 = PhotoType.FEEDBACK;
                            scootersDamagePhotosInteractor$realUploadPhotos$1.L$0 = str2;
                            scootersDamagePhotosInteractor$realUploadPhotos$1.L$1 = null;
                            scootersDamagePhotosInteractor$realUploadPhotos$1.L$2 = it;
                            scootersDamagePhotosInteractor$realUploadPhotos$1.L$3 = kpm0Var;
                            scootersDamagePhotosInteractor$realUploadPhotos$1.label = 2;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            acn0Var.c(str2, ojb0Var);
                            throw th;
                        }
                    }
                    it = list.iterator();
                    str2 = str;
                    if (!it.hasNext()) {
                    }
                }
            }
            if (i != 0) {
            }
            it = list.iterator();
            str2 = str;
            if (!it.hasNext()) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            acn0Var.c(str, ojb0Var);
            throw th2;
        }
        scootersDamagePhotosInteractor$realUploadPhotos$1 = new ScootersDamagePhotosInteractor$realUploadPhotos$1(fVar, continuationImpl);
        Object obj2 = scootersDamagePhotosInteractor$realUploadPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDamagePhotosInteractor$realUploadPhotos$1.label;
    }

    @Override // defpackage.zjo0
    public final Object a(String str, Continuation continuation) {
        List a = this.c.a(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (!((ppm0) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ppm0) it.next()).a);
        }
        if (arrayList2.isEmpty()) {
            return zy11.a;
        }
        return this.d.b(str, new ScootersDamagePhotosInteractor$uploadPhotos$2(this, str, arrayList2, null), (ContinuationImpl) continuation);
    }

    @Override // defpackage.zjo0
    public final void b(String str) {
        l8x l8xVar = (l8x) this.d.c.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        acn0 acn0Var = this.c;
        List a = acn0Var.a(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((ppm0) obj).a()) {
                arrayList.add(obj);
            }
        }
        acn0Var.b(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.zjo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, w8v w8vVar, ContinuationImpl continuationImpl) {
        ScootersDamagePhotosInteractor$takeAndSavePhoto$1 scootersDamagePhotosInteractor$takeAndSavePhoto$1;
        int i;
        if (continuationImpl instanceof ScootersDamagePhotosInteractor$takeAndSavePhoto$1) {
            scootersDamagePhotosInteractor$takeAndSavePhoto$1 = (ScootersDamagePhotosInteractor$takeAndSavePhoto$1) continuationImpl;
            int i2 = scootersDamagePhotosInteractor$takeAndSavePhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDamagePhotosInteractor$takeAndSavePhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDamagePhotosInteractor$takeAndSavePhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDamagePhotosInteractor$takeAndSavePhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qan0 qan0Var = new qan0(2, w8vVar);
                    scootersDamagePhotosInteractor$takeAndSavePhoto$1.L$0 = str;
                    scootersDamagePhotosInteractor$takeAndSavePhoto$1.L$1 = null;
                    scootersDamagePhotosInteractor$takeAndSavePhoto$1.label = 1;
                    obj = this.a.a(qan0Var, scootersDamagePhotosInteractor$takeAndSavePhoto$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersDamagePhotosInteractor$takeAndSavePhoto$1.L$0;
                    kotlin.b.b(obj);
                }
                acn0 acn0Var = this.c;
                acn0Var.b(str, kotlin.collections.a.m0(acn0Var.a(str), Collections.singletonList(new ppm0(new kpm0((Uri) obj, UUID.randomUUID().toString())))));
                return zy11.a;
            }
        }
        scootersDamagePhotosInteractor$takeAndSavePhoto$1 = new ScootersDamagePhotosInteractor$takeAndSavePhoto$1(this, continuationImpl);
        Object obj2 = scootersDamagePhotosInteractor$takeAndSavePhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDamagePhotosInteractor$takeAndSavePhoto$1.label;
        if (i != 0) {
        }
        acn0 acn0Var2 = this.c;
        acn0Var2.b(str, kotlin.collections.a.m0(acn0Var2.a(str), Collections.singletonList(new ppm0(new kpm0((Uri) obj2, UUID.randomUUID().toString())))));
        return zy11.a;
    }

    @Override // defpackage.zjo0
    public final void d(String str, ppm0 ppm0Var) {
        r0 r0Var = this.c.a;
        List list = (List) ((Map) r0Var.getValue()).get(str);
        if (list != null) {
            r0Var.m(null, kotlin.collections.b.o((Map) r0Var.getValue(), new Pair(str, kotlin.collections.a.j0(list, ppm0Var))));
        }
    }

    @Override // defpackage.zjo0
    public final int e(String str) {
        List a = this.c.a(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (!((ppm0) obj).a()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    @Override // defpackage.zjo0
    public final List f(String str) {
        return this.c.a(str);
    }

    @Override // defpackage.zjo0
    public final tpr g(String str) {
        return new ru.yandex.taxi.scooters.data.j(this.c.a, str);
    }

    @Override // defpackage.zjo0
    public final void h(String str, ppm0 ppm0Var) {
        acn0 acn0Var = this.c;
        ArrayList arrayList = new ArrayList(acn0Var.a(str));
        int i = 29;
        arrayList.removeIf(new sdc(i, new g8m0(i, ppm0Var)));
        acn0Var.b(str, arrayList);
    }

    public final void j(String str, kpm0 kpm0Var) {
        acn0 acn0Var = this.c;
        ArrayList arrayList = new ArrayList(acn0Var.a(str));
        int i = 28;
        arrayList.removeIf(new sdc(i, new g8m0(i, kpm0Var)));
        acn0Var.b(str, kotlin.collections.a.o0(arrayList, new ppm0(kpm0Var, lpm0.a)));
    }
}
