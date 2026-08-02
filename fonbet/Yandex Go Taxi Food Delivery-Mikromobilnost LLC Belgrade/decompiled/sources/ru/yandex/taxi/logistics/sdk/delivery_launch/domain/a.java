package ru.yandex.taxi.logistics.sdk.delivery_launch.domain;

import defpackage.dpc;
import defpackage.fpc;
import defpackage.jse;
import defpackage.l0i;
import defpackage.m0i;
import defpackage.n0i;
import defpackage.ny61;
import defpackage.o0i;
import defpackage.onq0;
import defpackage.pnq0;
import defpackage.qnq0;
import defpackage.rol0;
import defpackage.st2;
import defpackage.tje;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.delivery_launch.data.b;
import ru.yandex.taxi.logistics.sdk.delivery_launch.domain.DeliveryLaunchLoadingStateRepository;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes9.dex */
public final class a implements l0i {
    public final b a;
    public final n0i b;
    public final st2 c;
    public final DeliveryLaunchLoadingStateRepository d;
    public final pnq0 e = qnq0.a(1);

    public a(b bVar, n0i n0iVar, st2 st2Var, DeliveryLaunchLoadingStateRepository deliveryLaunchLoadingStateRepository) {
        this.a = bVar;
        this.b = n0iVar;
        this.c = st2Var;
        this.d = deliveryLaunchLoadingStateRepository;
    }

    public final rol0 a(String str, m0i m0iVar) {
        return new rol0(new DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1(this, m0iVar, str, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x00b7, B:15:0x00bd, B:16:0x00ca, B:18:0x00d3, B:19:0x00de, B:22:0x00e7, B:28:0x00d9, B:29:0x00f2), top: B:11:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #3 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x00b7, B:15:0x00bd, B:16:0x00ca, B:18:0x00d3, B:19:0x00de, B:22:0x00e7, B:28:0x00d9, B:29:0x00f2), top: B:11:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:54:0x0079, B:41:0x0087, B:42:0x008e, B:45:0x0098), top: B:53:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:54:0x0079, B:41:0x0087, B:42:0x008e, B:45:0x0098), top: B:53:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v17, types: [onq0] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v7, types: [onq0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m0i m0iVar, ContinuationImpl continuationImpl) {
        DeliveryConfigInteractorImpl$updateConfig$1 deliveryConfigInteractorImpl$updateConfig$1;
        int i;
        pnq0 pnq0Var;
        int i2;
        Throwable th;
        ?? r11;
        Map map;
        TypedConfigsDto typedConfigsDto;
        pnq0 pnq0Var2;
        Object dpcVar;
        Object obj;
        Object value;
        LinkedHashMap linkedHashMap;
        try {
            if (continuationImpl instanceof DeliveryConfigInteractorImpl$updateConfig$1) {
                deliveryConfigInteractorImpl$updateConfig$1 = (DeliveryConfigInteractorImpl$updateConfig$1) continuationImpl;
                int i3 = deliveryConfigInteractorImpl$updateConfig$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    deliveryConfigInteractorImpl$updateConfig$1.label = i3 - Integer.MIN_VALUE;
                    Object obj2 = deliveryConfigInteractorImpl$updateConfig$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deliveryConfigInteractorImpl$updateConfig$1.label;
                    n0i n0iVar = this.b;
                    DeliveryLaunchLoadingStateRepository deliveryLaunchLoadingStateRepository = this.d;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        deliveryConfigInteractorImpl$updateConfig$1.L$0 = m0iVar;
                        pnq0Var = this.e;
                        deliveryConfigInteractorImpl$updateConfig$1.L$1 = pnq0Var;
                        deliveryConfigInteractorImpl$updateConfig$1.I$0 = 0;
                        deliveryConfigInteractorImpl$updateConfig$1.label = 1;
                        if (pnq0Var.b(deliveryConfigInteractorImpl$updateConfig$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r11 = (onq0) deliveryConfigInteractorImpl$updateConfig$1.L$1;
                        m0iVar = (m0i) deliveryConfigInteractorImpl$updateConfig$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            pnq0Var2 = r11;
                            obj = (fpc) obj2;
                            if (obj instanceof dpc) {
                                DeliveryLaunchLoadingStateRepository.State state = DeliveryLaunchLoadingStateRepository.State.ERROR;
                                r0 r0Var = deliveryLaunchLoadingStateRepository.a;
                                r0Var.getClass();
                                r0Var.m(null, state);
                            } else {
                                TypedConfigsDto typedConfigsDto2 = (TypedConfigsDto) ((dpc) obj).a();
                                r0 r0Var2 = ((o0i) n0iVar).a;
                                do {
                                    value = r0Var2.getValue();
                                    Map map2 = (Map) value;
                                    linkedHashMap = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
                                    linkedHashMap.put(m0iVar, typedConfigsDto2);
                                } while (!r0Var2.k(value, linkedHashMap));
                                DeliveryLaunchLoadingStateRepository.State state2 = DeliveryLaunchLoadingStateRepository.State.READY;
                                r0 r0Var3 = deliveryLaunchLoadingStateRepository.a;
                                r0Var3.getClass();
                                r0Var3.m(null, state2);
                            }
                            pnq0Var = pnq0Var2;
                            dpcVar = obj;
                            pnq0Var.f();
                            return dpcVar;
                        } catch (Throwable th2) {
                            th = th2;
                            ((kotlinx.coroutines.sync.b) r11).f();
                            throw th;
                        }
                    }
                    int i4 = deliveryConfigInteractorImpl$updateConfig$1.I$0;
                    ?? r2 = (onq0) deliveryConfigInteractorImpl$updateConfig$1.L$1;
                    m0i m0iVar2 = (m0i) deliveryConfigInteractorImpl$updateConfig$1.L$0;
                    kotlin.b.b(obj2);
                    pnq0Var = r2;
                    i2 = i4;
                    m0iVar = m0iVar2;
                    map = (Map) ((o0i) n0iVar).a.getValue();
                    if (map == null) {
                        try {
                            typedConfigsDto = (TypedConfigsDto) map.get(m0iVar);
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = pnq0Var;
                            ((kotlinx.coroutines.sync.b) r11).f();
                            throw th;
                        }
                    } else {
                        typedConfigsDto = null;
                    }
                    if (typedConfigsDto == null) {
                        dpcVar = new dpc(typedConfigsDto);
                        pnq0Var.f();
                        return dpcVar;
                    }
                    DeliveryLaunchLoadingStateRepository.State state3 = DeliveryLaunchLoadingStateRepository.State.LOADING;
                    try {
                        r0 r0Var4 = deliveryLaunchLoadingStateRepository.a;
                        r0Var4.getClass();
                        r0Var4.m(null, state3);
                        jse jseVar = this.c.b;
                        DeliveryConfigInteractorImpl$updateConfig$2$result$1 deliveryConfigInteractorImpl$updateConfig$2$result$1 = new DeliveryConfigInteractorImpl$updateConfig$2$result$1(this, m0iVar, null);
                        deliveryConfigInteractorImpl$updateConfig$1.L$0 = m0iVar;
                        deliveryConfigInteractorImpl$updateConfig$1.L$1 = pnq0Var;
                        deliveryConfigInteractorImpl$updateConfig$1.L$2 = null;
                        deliveryConfigInteractorImpl$updateConfig$1.I$0 = i2;
                        deliveryConfigInteractorImpl$updateConfig$1.I$1 = 0;
                        deliveryConfigInteractorImpl$updateConfig$1.label = 2;
                        Object k0 = tje.k0(jseVar, deliveryConfigInteractorImpl$updateConfig$2$result$1, deliveryConfigInteractorImpl$updateConfig$1);
                        if (k0 != coroutineSingletons) {
                            pnq0 pnq0Var3 = pnq0Var;
                            obj2 = k0;
                            pnq0Var2 = pnq0Var3;
                            obj = (fpc) obj2;
                            if (obj instanceof dpc) {
                            }
                            pnq0Var = pnq0Var2;
                            dpcVar = obj;
                            pnq0Var.f();
                            return dpcVar;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        r11 = pnq0Var;
                        ((kotlinx.coroutines.sync.b) r11).f();
                        throw th;
                    }
                }
            }
            map = (Map) ((o0i) n0iVar).a.getValue();
            if (map == null) {
            }
            if (typedConfigsDto == null) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        deliveryConfigInteractorImpl$updateConfig$1 = new DeliveryConfigInteractorImpl$updateConfig$1(this, continuationImpl);
        Object obj22 = deliveryConfigInteractorImpl$updateConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryConfigInteractorImpl$updateConfig$1.label;
        n0i n0iVar2 = this.b;
        DeliveryLaunchLoadingStateRepository deliveryLaunchLoadingStateRepository2 = this.d;
        if (i != 0) {
        }
    }
}
