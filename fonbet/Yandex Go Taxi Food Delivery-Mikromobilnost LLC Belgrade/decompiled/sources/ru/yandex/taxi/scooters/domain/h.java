package ru.yandex.taxi.scooters.domain;

import android.net.Uri;
import defpackage.jl40;
import defpackage.kpm0;
import defpackage.lpm0;
import defpackage.mpm0;
import defpackage.npm0;
import defpackage.ny61;
import defpackage.oln0;
import defpackage.ppm0;
import defpackage.qan0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.w8v;
import defpackage.ywm0;
import defpackage.zjo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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
public final class h implements zjo0 {
    public final w a;
    public final v b;
    public final oln0 c;
    public final ywm0 d;

    public h(w wVar, v vVar, oln0 oln0Var, ywm0 ywm0Var) {
        this.a = wVar;
        this.b = vVar;
        this.c = oln0Var;
        this.d = ywm0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|13|14|15|(6:17|18|(2:20|21)|14|15|(2:23|24)(0))(0))(2:30|31))(2:32|33))(3:37|38|(1:40))|34|35|15|(0)(0)))|45|6|7|(0)(0)|34|35|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
    
        r7.k(r8, r10, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008a -> B:14:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(h hVar, String str, List list, ContinuationImpl continuationImpl) {
        ScootersFeedbackPhotosInteractor$realUploadPhotos$1 scootersFeedbackPhotosInteractor$realUploadPhotos$1;
        int i;
        Iterator it;
        String str2;
        v vVar = hVar.b;
        if (continuationImpl instanceof ScootersFeedbackPhotosInteractor$realUploadPhotos$1) {
            scootersFeedbackPhotosInteractor$realUploadPhotos$1 = (ScootersFeedbackPhotosInteractor$realUploadPhotos$1) continuationImpl;
            int i2 = scootersFeedbackPhotosInteractor$realUploadPhotos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackPhotosInteractor$realUploadPhotos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFeedbackPhotosInteractor$realUploadPhotos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackPhotosInteractor$realUploadPhotos$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PhotoType photoType = PhotoType.FEEDBACK;
                    scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$0 = str;
                    scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$1 = list;
                    scootersFeedbackPhotosInteractor$realUploadPhotos$1.label = 1;
                    if (vVar.a(str, list, photoType, scootersFeedbackPhotosInteractor$realUploadPhotos$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    list = (List) scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$1;
                    str = (String) scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kpm0 kpm0Var = (kpm0) scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$3;
                    it = (Iterator) scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$2;
                    str2 = (String) scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        hVar.k(str2, th, Collections.singletonList(kpm0Var));
                    }
                    hVar.j(str2, kpm0Var);
                    if (!it.hasNext()) {
                        kpm0Var = (kpm0) it.next();
                        PhotoType photoType2 = PhotoType.FEEDBACK;
                        scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$0 = str2;
                        scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$1 = null;
                        scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$2 = it;
                        scootersFeedbackPhotosInteractor$realUploadPhotos$1.L$3 = kpm0Var;
                        scootersFeedbackPhotosInteractor$realUploadPhotos$1.label = 2;
                        if (vVar.b(str2, kpm0Var, photoType2, scootersFeedbackPhotosInteractor$realUploadPhotos$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hVar.j(str2, kpm0Var);
                        if (!it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
                it = list.iterator();
                str2 = str;
                if (!it.hasNext()) {
                }
            }
        }
        scootersFeedbackPhotosInteractor$realUploadPhotos$1 = new ScootersFeedbackPhotosInteractor$realUploadPhotos$1(hVar, continuationImpl);
        Object obj2 = scootersFeedbackPhotosInteractor$realUploadPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackPhotosInteractor$realUploadPhotos$1.label;
        if (i != 0) {
        }
        it = list.iterator();
        str2 = str;
        if (!it.hasNext()) {
        }
    }

    @Override // defpackage.zjo0
    public final Object a(String str, Continuation continuation) {
        oln0 oln0Var = this.c;
        List<ppm0> a = oln0Var.a(str);
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
        boolean isEmpty = arrayList2.isEmpty();
        zy11 zy11Var = zy11.a;
        if (isEmpty) {
            return zy11Var;
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(a, 10));
        for (ppm0 ppm0Var : a) {
            if (!(ppm0Var.b instanceof lpm0)) {
                ppm0Var = new ppm0(ppm0Var.a, mpm0.a);
            }
            arrayList3.add(ppm0Var);
        }
        oln0Var.b(str, arrayList3);
        this.d.c(new ScootersFeedbackPhotosInteractor$uploadPhotos$3(this, str, arrayList2, null));
        return zy11Var;
    }

    @Override // defpackage.zjo0
    public final void b(String str) {
        oln0 oln0Var = this.c;
        List a = oln0Var.a(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((ppm0) obj).a()) {
                arrayList.add(obj);
            }
        }
        oln0Var.b(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.zjo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, w8v w8vVar, ContinuationImpl continuationImpl) {
        ScootersFeedbackPhotosInteractor$takeAndSavePhoto$1 scootersFeedbackPhotosInteractor$takeAndSavePhoto$1;
        int i;
        if (continuationImpl instanceof ScootersFeedbackPhotosInteractor$takeAndSavePhoto$1) {
            scootersFeedbackPhotosInteractor$takeAndSavePhoto$1 = (ScootersFeedbackPhotosInteractor$takeAndSavePhoto$1) continuationImpl;
            int i2 = scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qan0 qan0Var = new qan0(2, w8vVar);
                    scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.L$0 = str;
                    scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.L$1 = null;
                    scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.label = 1;
                    obj = this.a.a(qan0Var, scootersFeedbackPhotosInteractor$takeAndSavePhoto$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.L$0;
                    kotlin.b.b(obj);
                }
                oln0 oln0Var = this.c;
                oln0Var.b(str, kotlin.collections.a.m0(oln0Var.a(str), Collections.singletonList(new ppm0(new kpm0((Uri) obj, UUID.randomUUID().toString())))));
                return zy11.a;
            }
        }
        scootersFeedbackPhotosInteractor$takeAndSavePhoto$1 = new ScootersFeedbackPhotosInteractor$takeAndSavePhoto$1(this, continuationImpl);
        Object obj2 = scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackPhotosInteractor$takeAndSavePhoto$1.label;
        if (i != 0) {
        }
        oln0 oln0Var2 = this.c;
        oln0Var2.b(str, kotlin.collections.a.m0(oln0Var2.a(str), Collections.singletonList(new ppm0(new kpm0((Uri) obj2, UUID.randomUUID().toString())))));
        return zy11.a;
    }

    @Override // defpackage.zjo0
    public final void d(String str, ppm0 ppm0Var) {
        r0 r0Var = this.c.a;
        List list = (List) ((Map) r0Var.getValue()).get(str);
        ArrayList j0 = list != null ? kotlin.collections.a.j0(list, ppm0Var) : null;
        if (j0 == null) {
            return;
        }
        r0Var.m(null, kotlin.collections.b.o((Map) r0Var.getValue(), new Pair(str, j0)));
    }

    @Override // defpackage.zjo0
    public final int e(String str) {
        List a = this.c.a(str);
        int i = 0;
        if ((a instanceof Collection) && a.isEmpty()) {
            return 0;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (((ppm0) it.next()).a() && (i = i + 1) < 0) {
                scc.l();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.zjo0
    public final List f(String str) {
        return this.c.a(str);
    }

    @Override // defpackage.zjo0
    public final tpr g(String str) {
        return new ru.yandex.taxi.scooters.data.n(this.c.a, str);
    }

    @Override // defpackage.zjo0
    public final void h(String str, ppm0 ppm0Var) {
        oln0 oln0Var = this.c;
        oln0Var.b(str, kotlin.collections.a.j0(oln0Var.a(str), ppm0Var));
    }

    public final void j(String str, kpm0 kpm0Var) {
        oln0 oln0Var = this.c;
        ArrayList arrayList = new ArrayList(oln0Var.a(str));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(((ppm0) it.next()).a.b, kpm0Var.b)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        arrayList.set(i, new ppm0(kpm0Var, lpm0.a));
        oln0Var.b(str, arrayList);
    }

    public final void k(String str, Throwable th, List list) {
        oln0 oln0Var = this.c;
        ArrayList arrayList = new ArrayList(oln0Var.a(str));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kpm0 kpm0Var = (kpm0) it.next();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (jl40.l(((ppm0) it2.next()).a.b, kpm0Var.b)) {
                    break;
                } else {
                    i++;
                }
            }
            arrayList.set(i, new ppm0(kpm0Var, new npm0()));
            oln0Var.b(str, arrayList);
        }
    }
}
