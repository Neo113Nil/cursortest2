package ru.yandex.taxi.order.analytics.marknotify;

import com.yandex.go.shortcuts.dto.request.MarkNotifyParam;
import com.yandex.go.shortcuts.impl.interactors.e;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oo70;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.sw00;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements sw00 {
    public final e a;
    public final b b;
    public final ru.yandex.taxi.jobs.b c;
    public final ike d;

    public a(e eVar, b bVar, ru.yandex.taxi.jobs.b bVar2, tt2 tt2Var) {
        this.a = eVar;
        this.b = bVar;
        this.c = bVar2;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(mdh.b.plus(jl40.a()));
    }

    public final void a(String str, oo70 oo70Var) {
        unr0.C(new Object[]{oo70Var.getB()}, 1, "orderClicked %s", jst.e);
        com.yandex.go.coroutines.b.g(this.d, null, null, new MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1(this, str, oo70Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MarkNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1 markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1;
        int i;
        if (continuationImpl instanceof MarkNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1) {
            markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1 = (MarkNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1) continuationImpl;
            int i2 = markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.L$0 = null;
                    markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.label = 1;
                    obj = this.b.b(str, markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1 = new MarkNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1(this, continuationImpl);
        Object obj2 = markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = markNotifyOrderAnalyticsImpl$hasOrdersDataToSend$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj2).isEmpty());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|20))(4:21|22|23|(1:25)(1:14)))(1:26))(1:82)|27|(8:29|(18:32|(1:34)(1:68)|35|(1:37)(1:67)|38|(1:40)(1:66)|41|(1:43)(1:65)|44|(1:46)(1:64)|47|(1:49)(1:63)|50|(1:52)(1:62)|53|(2:57|58)|59|30)|69|70|71|72|(3:74|23|(0))|25)|14))|85|6|7|(0)(0)|27|(0)|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0099, code lost:
    
        if (r2 == r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ru.yandex.taxi.order.analytics.marknotify.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        MarkNotifyOrderAnalyticsImpl$sendData$1 markNotifyOrderAnalyticsImpl$sendData$1;
        ?? r5;
        String str2;
        Set set;
        String str3;
        Set set2;
        ?? r1 = str;
        if (continuationImpl instanceof MarkNotifyOrderAnalyticsImpl$sendData$1) {
            markNotifyOrderAnalyticsImpl$sendData$1 = (MarkNotifyOrderAnalyticsImpl$sendData$1) continuationImpl;
            int i = markNotifyOrderAnalyticsImpl$sendData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                markNotifyOrderAnalyticsImpl$sendData$1.label = i - Integer.MIN_VALUE;
                Object obj = markNotifyOrderAnalyticsImpl$sendData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r5 = markNotifyOrderAnalyticsImpl$sendData$1.label;
                zy11 zy11Var = zy11.a;
                int i2 = 2;
                ?? r11 = this.b;
                if (r5 != 0) {
                    kotlin.b.b(obj);
                    markNotifyOrderAnalyticsImpl$sendData$1.L$0 = r1;
                    markNotifyOrderAnalyticsImpl$sendData$1.label = 1;
                    obj = r11.b(r1, markNotifyOrderAnalyticsImpl$sendData$1);
                    str2 = r1;
                } else {
                    if (r5 != 1) {
                        if (r5 == 2) {
                            set2 = (Set) markNotifyOrderAnalyticsImpl$sendData$1.L$1;
                            str3 = (String) markNotifyOrderAnalyticsImpl$sendData$1.L$0;
                            kotlin.b.b(obj);
                            markNotifyOrderAnalyticsImpl$sendData$1.L$0 = str3;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$1 = set2;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$2 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$3 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.label = 3;
                            return r11.c(str3, set2, markNotifyOrderAnalyticsImpl$sendData$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (r5 == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (r5 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    String str4 = (String) markNotifyOrderAnalyticsImpl$sendData$1.L$0;
                    kotlin.b.b(obj);
                    str2 = str4;
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    Set<oo70> set3 = set;
                    ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                    for (oo70 oo70Var : set3) {
                        String b = oo70Var.getB();
                        MarkNotifyParam.AdditionalProperty additionalProperty = b != null ? new MarkNotifyParam.AdditionalProperty("widget_id", b) : null;
                        String c = oo70Var.getC();
                        MarkNotifyParam.AdditionalProperty additionalProperty2 = c != null ? new MarkNotifyParam.AdditionalProperty("button_name", c) : null;
                        String e = oo70Var.getE();
                        MarkNotifyParam.AdditionalProperty additionalProperty3 = e != null ? new MarkNotifyParam.AdditionalProperty("order_id", e) : null;
                        String a = oo70Var.getA();
                        MarkNotifyParam.AdditionalProperty additionalProperty4 = a != null ? new MarkNotifyParam.AdditionalProperty(Constants.KEY_SERVICE, a) : null;
                        String f = oo70Var.getF();
                        MarkNotifyParam.AdditionalProperty additionalProperty5 = f != null ? new MarkNotifyParam.AdditionalProperty("order_status", f) : null;
                        String d = oo70Var.getD();
                        MarkNotifyParam.AdditionalProperty additionalProperty6 = d != null ? new MarkNotifyParam.AdditionalProperty("button_id", d) : null;
                        String g = oo70Var.getG();
                        List A = j73.A(new MarkNotifyParam.AdditionalProperty[]{additionalProperty, additionalProperty2, additionalProperty3, additionalProperty4, additionalProperty5, additionalProperty6, g != null ? new MarkNotifyParam.AdditionalProperty("action_type", g) : null});
                        String b2 = oo70Var.getB();
                        if (b2 == null && (b2 = oo70Var.getD()) == null) {
                            b2 = "";
                        }
                        arrayList.add(new MarkNotifyParam.MarkNotifyItem(i2, b2, A));
                    }
                    MarkNotifyParam markNotifyParam = new MarkNotifyParam(UUID.randomUUID().toString(), arrayList, str2);
                    try {
                        e eVar = this.a;
                        markNotifyOrderAnalyticsImpl$sendData$1.L$0 = str2;
                        markNotifyOrderAnalyticsImpl$sendData$1.L$1 = set;
                        markNotifyOrderAnalyticsImpl$sendData$1.L$2 = null;
                        markNotifyOrderAnalyticsImpl$sendData$1.L$3 = null;
                        markNotifyOrderAnalyticsImpl$sendData$1.label = 2;
                        if (eVar.a(markNotifyParam, markNotifyOrderAnalyticsImpl$sendData$1) != coroutineSingletons) {
                            str3 = str2;
                            set2 = set;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$0 = str3;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$1 = set2;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$2 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$3 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.label = 3;
                            if (r11.c(str3, set2, markNotifyOrderAnalyticsImpl$sendData$1) != coroutineSingletons) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r5 = str2;
                        r1 = set;
                        if (s8o.u(th)) {
                            jst.e.j(th);
                            markNotifyOrderAnalyticsImpl$sendData$1.L$0 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$1 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$2 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$3 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.L$4 = null;
                            markNotifyOrderAnalyticsImpl$sendData$1.label = 4;
                            if (r11.c(r5, (Collection) r1, markNotifyOrderAnalyticsImpl$sendData$1) == coroutineSingletons) {
                            }
                        }
                    }
                }
            }
        }
        markNotifyOrderAnalyticsImpl$sendData$1 = new MarkNotifyOrderAnalyticsImpl$sendData$1(this, continuationImpl);
        Object obj2 = markNotifyOrderAnalyticsImpl$sendData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = markNotifyOrderAnalyticsImpl$sendData$1.label;
        zy11 zy11Var2 = zy11.a;
        int i22 = 2;
        ?? r112 = this.b;
        if (r5 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
    }
}
