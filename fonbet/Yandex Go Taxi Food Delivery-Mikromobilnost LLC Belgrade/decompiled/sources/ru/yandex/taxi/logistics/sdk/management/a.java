package ru.yandex.taxi.logistics.sdk.management;

import defpackage.aci;
import defpackage.i4f;
import defpackage.j2s;
import defpackage.ny61;
import defpackage.ps50;
import defpackage.rzh;
import defpackage.zy11;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.ServerRejectedDeliveryException;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b a;
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.d b;
    public final j2s c;
    public final k d;
    public final ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c e;
    public final ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d f;
    public final aci g;

    public a(ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b bVar, ru.yandex.taxi.logistics.sdk.management.deliveries.d dVar, j2s j2sVar, k kVar, ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c cVar, ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar2, aci aciVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = j2sVar;
        this.d = kVar;
        this.e = cVar;
        this.f = dVar2;
        this.g = aciVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0132, code lost:
    
        if (r8.a(r3) == r4) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [ru.yandex.taxi.logistics.sdk.management.deliveries.d] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        CommitDeliveryInteractor$commit$1 commitDeliveryInteractor$commit$1;
        CoroutineSingletons coroutineSingletons;
        ?? r5;
        ?? r2;
        String str2;
        UUID uuid;
        boolean z;
        ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar;
        String str3;
        UUID uuid2;
        boolean z2;
        Map i2;
        int i3;
        int i4 = i;
        try {
            if (continuationImpl instanceof CommitDeliveryInteractor$commit$1) {
                commitDeliveryInteractor$commit$1 = (CommitDeliveryInteractor$commit$1) continuationImpl;
                int i5 = commitDeliveryInteractor$commit$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    commitDeliveryInteractor$commit$1.label = i5 - Integer.MIN_VALUE;
                    Object obj = commitDeliveryInteractor$commit$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = commitDeliveryInteractor$commit$1.label;
                    ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c cVar = this.e;
                    ?? r12 = this.b;
                    if (r5 != 0) {
                        kotlin.b.b(obj);
                        r5 = UUID.randomUUID();
                        r2 = 0;
                        z = false;
                        r2 = 0;
                        try {
                            r12.g(r5);
                            ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b bVar = this.a;
                            rzh rzhVar = new rzh(Collections.singletonList(str), i4);
                            commitDeliveryInteractor$commit$1.L$0 = str;
                            commitDeliveryInteractor$commit$1.L$1 = r5;
                            commitDeliveryInteractor$commit$1.I$0 = i4;
                            commitDeliveryInteractor$commit$1.I$1 = 0;
                            commitDeliveryInteractor$commit$1.label = 1;
                            if (bVar.b(rzhVar, commitDeliveryInteractor$commit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str2 = str;
                            uuid = r5;
                        } catch (ServerRejectedDeliveryException e) {
                            e = e;
                            i3 = r2;
                        } catch (Throwable th) {
                            th = th;
                            coroutineSingletons = r2;
                            if (coroutineSingletons == null) {
                            }
                            throw th;
                        }
                    } else if (r5 == 1) {
                        ?? r52 = commitDeliveryInteractor$commit$1.I$1;
                        i4 = commitDeliveryInteractor$commit$1.I$0;
                        UUID uuid3 = (UUID) commitDeliveryInteractor$commit$1.L$1;
                        str2 = (String) commitDeliveryInteractor$commit$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            z = r52;
                            uuid = uuid3;
                        } catch (ServerRejectedDeliveryException e2) {
                            e = e2;
                            i3 = r52;
                            r5 = uuid3;
                        } catch (Throwable th2) {
                            th = th2;
                            coroutineSingletons = r52;
                            r5 = uuid3;
                            if (coroutineSingletons == null) {
                                r12.l(r5);
                            }
                            throw th;
                        }
                    } else {
                        if (r5 != 2) {
                            if (r5 != 3) {
                                if (r5 != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i3 = commitDeliveryInteractor$commit$1.I$1;
                                r5 = (UUID) commitDeliveryInteractor$commit$1.L$1;
                                try {
                                    kotlin.b.b(obj);
                                } catch (ServerRejectedDeliveryException e3) {
                                    e = e3;
                                }
                                return zy11.a;
                            }
                            ?? r53 = commitDeliveryInteractor$commit$1.I$1;
                            i4 = commitDeliveryInteractor$commit$1.I$0;
                            UUID uuid4 = (UUID) commitDeliveryInteractor$commit$1.L$1;
                            str3 = (String) commitDeliveryInteractor$commit$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                r2 = r53;
                                r5 = uuid4;
                                r12.e(r5, str3, i4);
                                j2s j2sVar = this.c;
                                commitDeliveryInteractor$commit$1.L$0 = null;
                                commitDeliveryInteractor$commit$1.L$1 = r5;
                                commitDeliveryInteractor$commit$1.I$0 = i4;
                                commitDeliveryInteractor$commit$1.I$1 = r2 == true ? 1 : 0;
                                commitDeliveryInteractor$commit$1.label = 4;
                            } catch (ServerRejectedDeliveryException e4) {
                                e = e4;
                                i3 = r53;
                                r5 = uuid4;
                            } catch (Throwable th3) {
                                th = th3;
                                coroutineSingletons = r53;
                                r5 = uuid4;
                                if (coroutineSingletons == null) {
                                }
                                throw th;
                            }
                            String failureDescription = e.getFailureDescription();
                            ps50 networkError = e.getNetworkError();
                            if (failureDescription != null) {
                                cVar.getClass();
                                cVar.c(new i4f(failureDescription), "Commit: Delivery events returned failure");
                            } else if (networkError != null) {
                                cVar.getClass();
                                cVar.c(ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c.a(networkError), "Commit: " + networkError.a());
                            }
                            this.d.b(e.getFailureDescription());
                            if (i3 == 0) {
                                r12.l(r5);
                            }
                            return zy11.a;
                        }
                        ?? r54 = commitDeliveryInteractor$commit$1.I$1;
                        i4 = commitDeliveryInteractor$commit$1.I$0;
                        UUID uuid5 = (UUID) commitDeliveryInteractor$commit$1.L$1;
                        String str4 = (String) commitDeliveryInteractor$commit$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            z2 = r54;
                            uuid2 = uuid5;
                            str3 = str4;
                            i2 = kotlin.collections.b.i(new Pair("delivery_id", str3), new Pair("revision", new Integer(i4)));
                            commitDeliveryInteractor$commit$1.L$0 = str3;
                            commitDeliveryInteractor$commit$1.L$1 = uuid2;
                            commitDeliveryInteractor$commit$1.I$0 = i4;
                            commitDeliveryInteractor$commit$1.I$1 = z2 ? 1 : 0;
                            commitDeliveryInteractor$commit$1.label = 3;
                            r2 = z2;
                            r5 = uuid2;
                            if (cVar.b(i2, commitDeliveryInteractor$commit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r12.e(r5, str3, i4);
                            j2s j2sVar2 = this.c;
                            commitDeliveryInteractor$commit$1.L$0 = null;
                            commitDeliveryInteractor$commit$1.L$1 = r5;
                            commitDeliveryInteractor$commit$1.I$0 = i4;
                            commitDeliveryInteractor$commit$1.I$1 = r2 == true ? 1 : 0;
                            commitDeliveryInteractor$commit$1.label = 4;
                        } catch (ServerRejectedDeliveryException e5) {
                            e = e5;
                            i3 = r54;
                            r5 = uuid5;
                        } catch (Throwable th4) {
                            th = th4;
                            coroutineSingletons = r54;
                            r5 = uuid5;
                            if (coroutineSingletons == null) {
                            }
                            throw th;
                        }
                    }
                    this.g.a.put(str2, Integer.valueOf(i4));
                    dVar = this.f;
                    commitDeliveryInteractor$commit$1.L$0 = str2;
                    commitDeliveryInteractor$commit$1.L$1 = uuid;
                    commitDeliveryInteractor$commit$1.I$0 = i4;
                    commitDeliveryInteractor$commit$1.I$1 = z ? 1 : 0;
                    commitDeliveryInteractor$commit$1.label = 2;
                    if (dVar.b(uuid, str2, commitDeliveryInteractor$commit$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                    z2 = z;
                    uuid2 = uuid;
                    i2 = kotlin.collections.b.i(new Pair("delivery_id", str3), new Pair("revision", new Integer(i4)));
                    commitDeliveryInteractor$commit$1.L$0 = str3;
                    commitDeliveryInteractor$commit$1.L$1 = uuid2;
                    commitDeliveryInteractor$commit$1.I$0 = i4;
                    commitDeliveryInteractor$commit$1.I$1 = z2 ? 1 : 0;
                    commitDeliveryInteractor$commit$1.label = 3;
                    r2 = z2;
                    r5 = uuid2;
                    if (cVar.b(i2, commitDeliveryInteractor$commit$1) == coroutineSingletons) {
                    }
                    r12.e(r5, str3, i4);
                    j2s j2sVar22 = this.c;
                    commitDeliveryInteractor$commit$1.L$0 = null;
                    commitDeliveryInteractor$commit$1.L$1 = r5;
                    commitDeliveryInteractor$commit$1.I$0 = i4;
                    commitDeliveryInteractor$commit$1.I$1 = r2 == true ? 1 : 0;
                    commitDeliveryInteractor$commit$1.label = 4;
                }
            }
            if (r5 != 0) {
            }
            this.g.a.put(str2, Integer.valueOf(i4));
            dVar = this.f;
            commitDeliveryInteractor$commit$1.L$0 = str2;
            commitDeliveryInteractor$commit$1.L$1 = uuid;
            commitDeliveryInteractor$commit$1.I$0 = i4;
            commitDeliveryInteractor$commit$1.I$1 = z ? 1 : 0;
            commitDeliveryInteractor$commit$1.label = 2;
            if (dVar.b(uuid, str2, commitDeliveryInteractor$commit$1) != coroutineSingletons) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        commitDeliveryInteractor$commit$1 = new CommitDeliveryInteractor$commit$1(this, continuationImpl);
        Object obj2 = commitDeliveryInteractor$commit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = commitDeliveryInteractor$commit$1.label;
        ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c cVar2 = this.e;
        ?? r122 = this.b;
    }
}
