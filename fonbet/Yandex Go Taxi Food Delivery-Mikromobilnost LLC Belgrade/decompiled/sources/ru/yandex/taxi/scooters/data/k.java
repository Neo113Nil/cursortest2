package ru.yandex.taxi.scooters.data;

import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.zy11;
import defpackage.zzs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class k {
    public final com.yandex.go.utils.storage.json.a a;
    public final kotlinx.coroutines.sync.a b;

    public k(eex eexVar) {
        am2 am2Var = new am2("scooters", "destination", kotlin.collections.b.f());
        auu0 auu0Var = auu0.a;
        this.a = eexVar.b(am2Var, zzs.Companion.serializer());
        this.b = gtq0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersDestinationNavigationRepository$getSavedDestinationForSession$1 scootersDestinationNavigationRepository$getSavedDestinationForSession$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        String str3;
        try {
            if (continuationImpl instanceof ScootersDestinationNavigationRepository$getSavedDestinationForSession$1) {
                scootersDestinationNavigationRepository$getSavedDestinationForSession$1 = (ScootersDestinationNavigationRepository$getSavedDestinationForSession$1) continuationImpl;
                int i2 = scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersDestinationNavigationRepository$getSavedDestinationForSession$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$1 = aVar;
                        scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label = 1;
                        if (aVar.a(scootersDestinationNavigationRepository$getSavedDestinationForSession$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$1;
                        str3 = (String) scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            zzs zzsVar = (zzs) ((Map) obj).get(str3);
                            g050Var2.d(null);
                            return zzsVar;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$1;
                    str2 = (String) scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$0;
                    kotlin.b.b(obj);
                    com.yandex.go.utils.storage.json.a aVar2 = this.a;
                    scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$0 = str2;
                    scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$1 = g050Var;
                    scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label = 2;
                    obj = aVar2.a(scootersDestinationNavigationRepository$getSavedDestinationForSession$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        str3 = str2;
                        zzs zzsVar2 = (zzs) ((Map) obj).get(str3);
                        g050Var2.d(null);
                        return zzsVar2;
                    }
                    return coroutineSingletons;
                }
            }
            com.yandex.go.utils.storage.json.a aVar22 = this.a;
            scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$0 = str2;
            scootersDestinationNavigationRepository$getSavedDestinationForSession$1.L$1 = g050Var;
            scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label = 2;
            obj = aVar22.a(scootersDestinationNavigationRepository$getSavedDestinationForSession$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersDestinationNavigationRepository$getSavedDestinationForSession$1 = new ScootersDestinationNavigationRepository$getSavedDestinationForSession$1(this, continuationImpl);
        obj = scootersDestinationNavigationRepository$getSavedDestinationForSession$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDestinationNavigationRepository$getSavedDestinationForSession$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r3.d(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r8.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersDestinationNavigationRepository$removeDestination$1 scootersDestinationNavigationRepository$removeDestination$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersDestinationNavigationRepository$removeDestination$1) {
                scootersDestinationNavigationRepository$removeDestination$1 = (ScootersDestinationNavigationRepository$removeDestination$1) continuationImpl;
                int i2 = scootersDestinationNavigationRepository$removeDestination$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDestinationNavigationRepository$removeDestination$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersDestinationNavigationRepository$removeDestination$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDestinationNavigationRepository$removeDestination$1.label;
                    com.yandex.go.utils.storage.json.a aVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersDestinationNavigationRepository$removeDestination$1.L$0 = str;
                        g050Var = this.b;
                        scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
                        scootersDestinationNavigationRepository$removeDestination$1.label = 1;
                    } else if (i == 1) {
                        g050Var = (g050) scootersDestinationNavigationRepository$removeDestination$1.L$1;
                        str = (String) scootersDestinationNavigationRepository$removeDestination$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersDestinationNavigationRepository$removeDestination$1.L$1;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        g050Var = (g050) scootersDestinationNavigationRepository$removeDestination$1.L$1;
                        str = (String) scootersDestinationNavigationRepository$removeDestination$1.L$0;
                        kotlin.b.b(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                        linkedHashMap.remove(str);
                        scootersDestinationNavigationRepository$removeDestination$1.L$0 = null;
                        scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
                        scootersDestinationNavigationRepository$removeDestination$1.L$2 = null;
                        scootersDestinationNavigationRepository$removeDestination$1.label = 3;
                    }
                    scootersDestinationNavigationRepository$removeDestination$1.L$0 = str;
                    scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
                    scootersDestinationNavigationRepository$removeDestination$1.label = 2;
                    obj = aVar.a(scootersDestinationNavigationRepository$removeDestination$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj);
                    linkedHashMap2.remove(str);
                    scootersDestinationNavigationRepository$removeDestination$1.L$0 = null;
                    scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
                    scootersDestinationNavigationRepository$removeDestination$1.L$2 = null;
                    scootersDestinationNavigationRepository$removeDestination$1.label = 3;
                }
            }
            if (i != 0) {
            }
            scootersDestinationNavigationRepository$removeDestination$1.L$0 = str;
            scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
            scootersDestinationNavigationRepository$removeDestination$1.label = 2;
            obj = aVar.a(scootersDestinationNavigationRepository$removeDestination$1);
            if (obj == coroutineSingletons) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) obj);
            linkedHashMap22.remove(str);
            scootersDestinationNavigationRepository$removeDestination$1.L$0 = null;
            scootersDestinationNavigationRepository$removeDestination$1.L$1 = g050Var;
            scootersDestinationNavigationRepository$removeDestination$1.L$2 = null;
            scootersDestinationNavigationRepository$removeDestination$1.label = 3;
        } catch (Throwable th) {
            d(null);
            throw th;
        }
        scootersDestinationNavigationRepository$removeDestination$1 = new ScootersDestinationNavigationRepository$removeDestination$1(this, continuationImpl);
        obj = scootersDestinationNavigationRepository$removeDestination$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDestinationNavigationRepository$removeDestination$1.label;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r3.d(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r8.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        ScootersDestinationNavigationRepository$saveDestination$1 scootersDestinationNavigationRepository$saveDestination$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersDestinationNavigationRepository$saveDestination$1) {
                scootersDestinationNavigationRepository$saveDestination$1 = (ScootersDestinationNavigationRepository$saveDestination$1) continuationImpl;
                int i2 = scootersDestinationNavigationRepository$saveDestination$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDestinationNavigationRepository$saveDestination$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersDestinationNavigationRepository$saveDestination$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDestinationNavigationRepository$saveDestination$1.label;
                    com.yandex.go.utils.storage.json.a aVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersDestinationNavigationRepository$saveDestination$1.L$0 = str;
                        scootersDestinationNavigationRepository$saveDestination$1.L$1 = zzsVar;
                        g050Var = this.b;
                        scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
                        scootersDestinationNavigationRepository$saveDestination$1.label = 1;
                    } else if (i == 1) {
                        g050Var = (g050) scootersDestinationNavigationRepository$saveDestination$1.L$2;
                        zzsVar = (zzs) scootersDestinationNavigationRepository$saveDestination$1.L$1;
                        str = (String) scootersDestinationNavigationRepository$saveDestination$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersDestinationNavigationRepository$saveDestination$1.L$2;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        g050Var = (g050) scootersDestinationNavigationRepository$saveDestination$1.L$2;
                        zzsVar = (zzs) scootersDestinationNavigationRepository$saveDestination$1.L$1;
                        str = (String) scootersDestinationNavigationRepository$saveDestination$1.L$0;
                        kotlin.b.b(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                        linkedHashMap.put(str, zzsVar);
                        scootersDestinationNavigationRepository$saveDestination$1.L$0 = null;
                        scootersDestinationNavigationRepository$saveDestination$1.L$1 = null;
                        scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
                        scootersDestinationNavigationRepository$saveDestination$1.L$3 = null;
                        scootersDestinationNavigationRepository$saveDestination$1.label = 3;
                    }
                    scootersDestinationNavigationRepository$saveDestination$1.L$0 = str;
                    scootersDestinationNavigationRepository$saveDestination$1.L$1 = zzsVar;
                    scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
                    scootersDestinationNavigationRepository$saveDestination$1.label = 2;
                    obj = aVar.a(scootersDestinationNavigationRepository$saveDestination$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj);
                    linkedHashMap2.put(str, zzsVar);
                    scootersDestinationNavigationRepository$saveDestination$1.L$0 = null;
                    scootersDestinationNavigationRepository$saveDestination$1.L$1 = null;
                    scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
                    scootersDestinationNavigationRepository$saveDestination$1.L$3 = null;
                    scootersDestinationNavigationRepository$saveDestination$1.label = 3;
                }
            }
            if (i != 0) {
            }
            scootersDestinationNavigationRepository$saveDestination$1.L$0 = str;
            scootersDestinationNavigationRepository$saveDestination$1.L$1 = zzsVar;
            scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
            scootersDestinationNavigationRepository$saveDestination$1.label = 2;
            obj = aVar.a(scootersDestinationNavigationRepository$saveDestination$1);
            if (obj == coroutineSingletons) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) obj);
            linkedHashMap22.put(str, zzsVar);
            scootersDestinationNavigationRepository$saveDestination$1.L$0 = null;
            scootersDestinationNavigationRepository$saveDestination$1.L$1 = null;
            scootersDestinationNavigationRepository$saveDestination$1.L$2 = g050Var;
            scootersDestinationNavigationRepository$saveDestination$1.L$3 = null;
            scootersDestinationNavigationRepository$saveDestination$1.label = 3;
        } catch (Throwable th) {
            d(null);
            throw th;
        }
        scootersDestinationNavigationRepository$saveDestination$1 = new ScootersDestinationNavigationRepository$saveDestination$1(this, continuationImpl);
        obj = scootersDestinationNavigationRepository$saveDestination$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDestinationNavigationRepository$saveDestination$1.label;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
    }
}
