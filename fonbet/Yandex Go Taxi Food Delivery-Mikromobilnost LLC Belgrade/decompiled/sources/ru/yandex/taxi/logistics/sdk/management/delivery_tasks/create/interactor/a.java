package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor;

import defpackage.f6i;
import defpackage.j2s;
import defpackage.jgz;
import defpackage.n6i;
import defpackage.ny61;
import defpackage.o6i;
import defpackage.p4f;
import defpackage.pfi;
import defpackage.r4f;
import defpackage.scc;
import defpackage.sfi;
import defpackage.tzh;
import defpackage.w511;
import defpackage.wy21;
import defpackage.xy21;
import defpackage.yy21;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.e;

/* loaded from: classes9.dex */
public final class a {
    public static final String i = d.class.getSimpleName();
    public final e a;
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b b;
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.d c;
    public final j2s d;
    public final c e;
    public final ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d f;
    public final b g;
    public final sfi h;

    public a(e eVar, ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b bVar, ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar, j2s j2sVar, c cVar, ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar2, b bVar2, sfi sfiVar) {
        this.a = eVar;
        this.b = bVar;
        this.c = dVar;
        this.d = j2sVar;
        this.e = cVar;
        this.f = dVar2;
        this.g = bVar2;
        this.h = sfiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f6i f6iVar, List list, boolean z, ContinuationImpl continuationImpl) {
        CreateDeliveryInteractor$createDelivery$1 createDeliveryInteractor$createDelivery$1;
        int i2;
        yy21 yy21Var;
        if (continuationImpl instanceof CreateDeliveryInteractor$createDelivery$1) {
            createDeliveryInteractor$createDelivery$1 = (CreateDeliveryInteractor$createDelivery$1) continuationImpl;
            int i3 = createDeliveryInteractor$createDelivery$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                createDeliveryInteractor$createDelivery$1.label = i3 - Integer.MIN_VALUE;
                Object obj = createDeliveryInteractor$createDelivery$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = createDeliveryInteractor$createDelivery$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z = createDeliveryInteractor$createDelivery$1.Z$0;
                            list = (List) createDeliveryInteractor$createDelivery$1.L$1;
                            f6iVar = (f6i) createDeliveryInteractor$createDelivery$1.L$0;
                            kotlin.b.b(obj);
                        } else if (i2 == 3) {
                        } else if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                if (f6iVar instanceof n6i) {
                    createDeliveryInteractor$createDelivery$1.L$0 = null;
                    createDeliveryInteractor$createDelivery$1.L$1 = null;
                    createDeliveryInteractor$createDelivery$1.Z$0 = z;
                    createDeliveryInteractor$createDelivery$1.label = 1;
                    Object b = b(f6iVar, list, null, createDeliveryInteractor$createDelivery$1);
                    if (b != obj2) {
                        return b;
                    }
                } else {
                    if (!(f6iVar instanceof o6i)) {
                        w511.b();
                        return null;
                    }
                    if (z) {
                        createDeliveryInteractor$createDelivery$1.L$0 = f6iVar;
                        createDeliveryInteractor$createDelivery$1.L$1 = list;
                        createDeliveryInteractor$createDelivery$1.Z$0 = z;
                        createDeliveryInteractor$createDelivery$1.label = 2;
                        obj = this.g.b((o6i) f6iVar, createDeliveryInteractor$createDelivery$1);
                    } else {
                        createDeliveryInteractor$createDelivery$1.L$0 = null;
                        createDeliveryInteractor$createDelivery$1.L$1 = null;
                        createDeliveryInteractor$createDelivery$1.Z$0 = z;
                        createDeliveryInteractor$createDelivery$1.label = 4;
                        Object b2 = b(f6iVar, list, null, createDeliveryInteractor$createDelivery$1);
                        if (b2 != obj2) {
                            return b2;
                        }
                    }
                }
                yy21Var = (yy21) obj;
                if (yy21Var instanceof xy21) {
                    if (yy21Var instanceof wy21) {
                        return p4f.a;
                    }
                    w511.b();
                    return null;
                }
                String a = ((xy21) yy21Var).a();
                createDeliveryInteractor$createDelivery$1.L$0 = null;
                createDeliveryInteractor$createDelivery$1.L$1 = null;
                createDeliveryInteractor$createDelivery$1.L$2 = null;
                createDeliveryInteractor$createDelivery$1.Z$0 = z;
                createDeliveryInteractor$createDelivery$1.label = 3;
                Object b3 = b(f6iVar, list, a, createDeliveryInteractor$createDelivery$1);
                return b3 == obj2 ? obj2 : b3;
            }
        }
        createDeliveryInteractor$createDelivery$1 = new CreateDeliveryInteractor$createDelivery$1(this, continuationImpl);
        Object obj3 = createDeliveryInteractor$createDelivery$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = createDeliveryInteractor$createDelivery$1.label;
        if (i2 == 0) {
        }
        yy21Var = (yy21) obj3;
        if (yy21Var instanceof xy21) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        if (r2 == r4) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0242 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01b4 -> B:32:0x01b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(f6i f6iVar, List list, String str, ContinuationImpl continuationImpl) {
        CreateDeliveryInteractor$createDeliveryInternal$1 createDeliveryInteractor$createDeliveryInternal$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        List list2;
        List list3;
        Iterator it;
        int i3;
        List list4;
        List list5;
        r4f r4fVar;
        int i4;
        List list6;
        List list7 = list;
        if (continuationImpl instanceof CreateDeliveryInteractor$createDeliveryInternal$1) {
            createDeliveryInteractor$createDeliveryInternal$1 = (CreateDeliveryInteractor$createDeliveryInternal$1) continuationImpl;
            int i5 = createDeliveryInteractor$createDeliveryInternal$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                createDeliveryInteractor$createDeliveryInternal$1.label = i5 - Integer.MIN_VALUE;
                obj = createDeliveryInteractor$createDeliveryInternal$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = createDeliveryInteractor$createDeliveryInternal$1.label;
                String str2 = i;
                ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar = this.c;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        dVar.g((UUID) it2.next());
                    }
                    createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                    createDeliveryInteractor$createDeliveryInternal$1.L$1 = list7;
                    createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                    createDeliveryInteractor$createDeliveryInternal$1.label = 1;
                    obj = this.a.a(f6iVar, str, createDeliveryInteractor$createDeliveryInternal$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            list3 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$4;
                            list2 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$1;
                            kotlin.b.b(obj);
                            it = list3.iterator();
                            i3 = 0;
                            list4 = list2;
                            list5 = list3;
                            r4fVar = (r4f) obj;
                            i4 = 0;
                            if (!it.hasNext()) {
                            }
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                r4f r4fVar2 = (r4f) createDeliveryInteractor$createDeliveryInternal$1.L$5;
                                kotlin.b.b(obj);
                                return r4fVar2;
                            }
                            r4fVar = (r4f) createDeliveryInteractor$createDeliveryInternal$1.L$5;
                            list5 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$4;
                            list6 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$1;
                            kotlin.b.b(obj);
                            int i6 = 0;
                            for (Object obj2 : list5) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                String str3 = (String) obj2;
                                dVar.e((UUID) list6.get(i6), str3, 0);
                                this.h.a.g(new pfi(str3));
                                i6 = i7;
                            }
                            createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$1 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$4 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$5 = r4fVar;
                            createDeliveryInteractor$createDeliveryInternal$1.label = 5;
                            return this.d.a(createDeliveryInteractor$createDeliveryInternal$1) != coroutineSingletons ? coroutineSingletons : r4fVar;
                        }
                        int i8 = createDeliveryInteractor$createDeliveryInternal$1.I$1;
                        int i9 = createDeliveryInteractor$createDeliveryInternal$1.I$0;
                        it = (Iterator) createDeliveryInteractor$createDeliveryInternal$1.L$7;
                        r4f r4fVar3 = (r4f) createDeliveryInteractor$createDeliveryInternal$1.L$5;
                        List list8 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$4;
                        list4 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$1;
                        kotlin.b.b(obj);
                        i3 = i8;
                        i4 = i9;
                        r4fVar = r4fVar3;
                        list5 = list8;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            int i10 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            UUID uuid = (UUID) list4.get(i3);
                            createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$1 = list4;
                            createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$4 = list5;
                            createDeliveryInteractor$createDeliveryInternal$1.L$5 = r4fVar;
                            createDeliveryInteractor$createDeliveryInternal$1.L$6 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$7 = it;
                            createDeliveryInteractor$createDeliveryInternal$1.L$8 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.L$9 = null;
                            createDeliveryInteractor$createDeliveryInternal$1.I$0 = i4;
                            createDeliveryInteractor$createDeliveryInternal$1.I$1 = i10;
                            createDeliveryInteractor$createDeliveryInternal$1.I$2 = i3;
                            createDeliveryInteractor$createDeliveryInternal$1.I$3 = 0;
                            createDeliveryInteractor$createDeliveryInternal$1.label = 3;
                            if (this.f.b(uuid, (String) next, createDeliveryInteractor$createDeliveryInternal$1) != coroutineSingletons) {
                                i3 = i10;
                                if (!it.hasNext()) {
                                    jgz.a.h(str2);
                                    jgz.a("Delivery commit success: ids=" + list5, new Object[0]);
                                    createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$1 = list4;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$4 = list5;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$5 = r4fVar;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$6 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$7 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$8 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.L$9 = null;
                                    createDeliveryInteractor$createDeliveryInternal$1.label = 4;
                                    if (this.e.b(kotlin.collections.b.f(), createDeliveryInteractor$createDeliveryInternal$1) != coroutineSingletons) {
                                        list6 = list4;
                                        int i62 = 0;
                                        while (r2.hasNext()) {
                                        }
                                        createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                                        createDeliveryInteractor$createDeliveryInternal$1.L$1 = null;
                                        createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                                        createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
                                        createDeliveryInteractor$createDeliveryInternal$1.L$4 = null;
                                        createDeliveryInteractor$createDeliveryInternal$1.L$5 = r4fVar;
                                        createDeliveryInteractor$createDeliveryInternal$1.label = 5;
                                        if (this.d.a(createDeliveryInteractor$createDeliveryInternal$1) != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    list7 = (List) createDeliveryInteractor$createDeliveryInternal$1.L$1;
                    kotlin.b.b(obj);
                }
                tzh tzhVar = (tzh) obj;
                List a = tzhVar.a();
                jgz.a.h(str2);
                jgz.a("Delivery draft success: ids=" + a, new Object[0]);
                int i11 = 0;
                for (Object obj3 : a) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        scc.m();
                        throw null;
                    }
                    dVar.m((String) obj3, (UUID) list7.get(i11));
                    i11 = i12;
                }
                createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
                createDeliveryInteractor$createDeliveryInternal$1.L$1 = list7;
                createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
                createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
                createDeliveryInteractor$createDeliveryInternal$1.L$4 = a;
                createDeliveryInteractor$createDeliveryInternal$1.label = 2;
                obj = this.b.b(tzhVar, createDeliveryInteractor$createDeliveryInternal$1);
                if (obj != coroutineSingletons) {
                    list2 = list7;
                    list3 = a;
                    it = list3.iterator();
                    i3 = 0;
                    list4 = list2;
                    list5 = list3;
                    r4fVar = (r4f) obj;
                    i4 = 0;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        createDeliveryInteractor$createDeliveryInternal$1 = new CreateDeliveryInteractor$createDeliveryInternal$1(this, continuationImpl);
        obj = createDeliveryInteractor$createDeliveryInternal$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = createDeliveryInteractor$createDeliveryInternal$1.label;
        String str22 = i;
        ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar2 = this.c;
        if (i2 != 0) {
        }
        tzh tzhVar2 = (tzh) obj;
        List a2 = tzhVar2.a();
        jgz.a.h(str22);
        jgz.a("Delivery draft success: ids=" + a2, new Object[0]);
        int i112 = 0;
        while (r7.hasNext()) {
        }
        createDeliveryInteractor$createDeliveryInternal$1.L$0 = null;
        createDeliveryInteractor$createDeliveryInternal$1.L$1 = list7;
        createDeliveryInteractor$createDeliveryInternal$1.L$2 = null;
        createDeliveryInteractor$createDeliveryInternal$1.L$3 = null;
        createDeliveryInteractor$createDeliveryInternal$1.L$4 = a2;
        createDeliveryInteractor$createDeliveryInternal$1.label = 2;
        obj = this.b.b(tzhVar2, createDeliveryInteractor$createDeliveryInternal$1);
        if (obj != coroutineSingletons) {
        }
    }
}
