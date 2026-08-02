package ru.yandex.taxi.settings.handlers;

import defpackage.auu0;
import defpackage.b64;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p0g0;
import defpackage.p53;
import defpackage.r85;
import defpackage.v4r0;
import defpackage.vj60;
import defpackage.wnt;
import defpackage.xby;
import defpackage.xnt;
import defpackage.y0g0;
import defpackage.y4g0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.settings.domain.c;

/* loaded from: classes6.dex */
public final class b implements y0g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public b(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        PushChannelInteractorImpl$findChannel$1 pushChannelInteractorImpl$findChannel$1;
        int i;
        if (continuationImpl instanceof PushChannelInteractorImpl$findChannel$1) {
            pushChannelInteractorImpl$findChannel$1 = (PushChannelInteractorImpl$findChannel$1) continuationImpl;
            int i2 = pushChannelInteractorImpl$findChannel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushChannelInteractorImpl$findChannel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushChannelInteractorImpl$findChannel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushChannelInteractorImpl$findChannel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(map.get("type"), "plus_subscription_activation_status")) {
                        return "plus_subscription";
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.addAll(c((String) map.get("marketing_tags")));
                    linkedHashSet.addAll(c((String) map.get("tags")));
                    linkedHashSet.remove("voip");
                    if (linkedHashSet.isEmpty()) {
                        String str = (String) map.get("category");
                        if (jl40.l(str, "QR")) {
                            return "pay_in_partners";
                        }
                        if (str == null) {
                            return "default";
                        }
                        xby.l(jst.e, "PUSH_ACK:ERROR:PUSH_CHANNEL_UNKNOWN_CATEGORY", null, null, b64.l("Category: '", str, "'. For push: ", kotlin.collections.a.X(iw00.x(map), null, null, null, null, 63)), 2);
                        return "default";
                    }
                    pushChannelInteractorImpl$findChannel$1.L$0 = null;
                    pushChannelInteractorImpl$findChannel$1.L$1 = null;
                    pushChannelInteractorImpl$findChannel$1.label = 1;
                    obj = b(map, linkedHashSet, true, pushChannelInteractorImpl$findChannel$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (String) obj;
            }
        }
        pushChannelInteractorImpl$findChannel$1 = new PushChannelInteractorImpl$findChannel$1(this, continuationImpl);
        Object obj3 = pushChannelInteractorImpl$findChannel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushChannelInteractorImpl$findChannel$1.label;
        if (i != 0) {
        }
        return (String) obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, Set set, boolean z, ContinuationImpl continuationImpl) {
        PushChannelInteractorImpl$findChannelFromTags$1 pushChannelInteractorImpl$findChannelFromTags$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PushChannelInteractorImpl$findChannelFromTags$1) {
            pushChannelInteractorImpl$findChannelFromTags$1 = (PushChannelInteractorImpl$findChannelFromTags$1) continuationImpl;
            int i2 = pushChannelInteractorImpl$findChannelFromTags$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushChannelInteractorImpl$findChannelFromTags$1.label = i2 - Integer.MIN_VALUE;
                obj = pushChannelInteractorImpl$findChannelFromTags$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushChannelInteractorImpl$findChannelFromTags$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (set.isEmpty()) {
                        return null;
                    }
                    h3y h3yVar = this.c;
                    Set set2 = set;
                    String a = ((vj60) h3yVar.get()).a(set2);
                    if (a != null) {
                        jst.e.n("Channel for sending notification was found: ".concat(a));
                        return a;
                    }
                    y4g0 y4g0Var = ((vj60) h3yVar.get()).a;
                    boolean containsAll = v4r0.h(y4g0Var.b(), y4g0Var.a.a.a()).containsAll(set2);
                    h3y h3yVar2 = this.d;
                    wnt wntVar = this.a;
                    if (containsAll) {
                        jst.e.n("No enabled channel for sending notifications.");
                        NotificationShareData.a a2 = r85.a(wntVar, map);
                        ((p0g0) h3yVar2.get()).a(a2.b, a2.e, a2.c, kotlin.collections.a.J0(set));
                        return "fake_disabled_channel";
                    }
                    if (!z) {
                        NotificationShareData.a a3 = r85.a(wntVar, map);
                        ((p0g0) h3yVar2.get()).b(a3.b, a3.e, a3.c, kotlin.collections.a.J0(set));
                        r85.f(null, "PUSH_CHANNEL_UNKNOWN_TAGS", "Tags: '" + set + "'. For push: " + kotlin.collections.a.X(iw00.x(map), null, null, null, null, 63));
                        return null;
                    }
                    jst.e.n("No channel for sending notifications. Updating push settings.");
                    pushChannelInteractorImpl$findChannelFromTags$1.L$0 = map;
                    pushChannelInteractorImpl$findChannelFromTags$1.L$1 = set;
                    pushChannelInteractorImpl$findChannelFromTags$1.L$2 = null;
                    pushChannelInteractorImpl$findChannelFromTags$1.Z$0 = z;
                    pushChannelInteractorImpl$findChannelFromTags$1.label = 1;
                    obj = ((c) this.b.get()).a(set, 5000L, pushChannelInteractorImpl$findChannelFromTags$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z = pushChannelInteractorImpl$findChannelFromTags$1.Z$0;
                    set = (Set) pushChannelInteractorImpl$findChannelFromTags$1.L$1;
                    map = (Map) pushChannelInteractorImpl$findChannelFromTags$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    jst.e.n("Updating push settings failed.");
                    return "fake_disabled_channel";
                }
                jst.e.n("Updating push settings finished.");
                pushChannelInteractorImpl$findChannelFromTags$1.L$0 = null;
                pushChannelInteractorImpl$findChannelFromTags$1.L$1 = null;
                pushChannelInteractorImpl$findChannelFromTags$1.L$2 = null;
                pushChannelInteractorImpl$findChannelFromTags$1.Z$0 = z;
                pushChannelInteractorImpl$findChannelFromTags$1.label = 2;
                Object b = b(map, set, false, pushChannelInteractorImpl$findChannelFromTags$1);
                return b == obj2 ? obj2 : b;
            }
        }
        pushChannelInteractorImpl$findChannelFromTags$1 = new PushChannelInteractorImpl$findChannelFromTags$1(this, continuationImpl);
        obj = pushChannelInteractorImpl$findChannelFromTags$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushChannelInteractorImpl$findChannelFromTags$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final List c(String str) {
        EmptyList emptyList = EmptyList.a;
        if (str != null && !evu0.J(str)) {
            try {
                return (List) ((xnt) this.a).c(str, new p53(auu0.a, 0));
            } catch (SerializationException e) {
                jst.e.k(e, "Error while parse tags from push data: ".concat(str));
            }
        }
        return emptyList;
    }
}
