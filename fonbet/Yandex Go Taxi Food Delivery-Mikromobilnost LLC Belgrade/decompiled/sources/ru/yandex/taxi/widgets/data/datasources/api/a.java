package ru.yandex.taxi.widgets.data.datasources.api;

import defpackage.c551;
import defpackage.cmt;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.o801;
import defpackage.p551;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widgets.data.api.WidgetsApi;

/* loaded from: classes10.dex */
public final class a {
    public final WidgetsApi a;

    public a(WidgetsApi widgetsApi) {
        this.a = widgetsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c551 c551Var, boolean z, ContinuationImpl continuationImpl) {
        WidgetsApiDatasourceImpl$getWidgets$1 widgetsApiDatasourceImpl$getWidgets$1;
        int i;
        String str;
        if (continuationImpl instanceof WidgetsApiDatasourceImpl$getWidgets$1) {
            widgetsApiDatasourceImpl$getWidgets$1 = (WidgetsApiDatasourceImpl$getWidgets$1) continuationImpl;
            int i2 = widgetsApiDatasourceImpl$getWidgets$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsApiDatasourceImpl$getWidgets$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetsApiDatasourceImpl$getWidgets$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsApiDatasourceImpl$getWidgets$1.label;
                if (i != 0) {
                    b.b(obj);
                    WidgetsApi widgetsApi = this.a;
                    if (z) {
                        cmt<Map<o801, p551>> a = widgetsApi.a(c551Var);
                        widgetsApiDatasourceImpl$getWidgets$1.L$0 = null;
                        widgetsApiDatasourceImpl$getWidgets$1.Z$0 = z;
                        widgetsApiDatasourceImpl$getWidgets$1.label = 1;
                        Object d = ru.yandex.taxi.network.api.a.d(a, widgetsApiDatasourceImpl$getWidgets$1);
                        if (d != coroutineSingletons) {
                            return d;
                        }
                    } else {
                        cmt<p551> c = widgetsApi.c(c551Var);
                        widgetsApiDatasourceImpl$getWidgets$1.L$0 = c551Var;
                        widgetsApiDatasourceImpl$getWidgets$1.Z$0 = z;
                        widgetsApiDatasourceImpl$getWidgets$1.label = 2;
                        obj = ru.yandex.taxi.network.api.a.d(c, widgetsApiDatasourceImpl$getWidgets$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c551Var = (c551) widgetsApiDatasourceImpl$getWidgets$1.L$0;
                b.b(obj);
                p551 p551Var = (p551) obj;
                str = c551Var.a;
                if (str == null) {
                    str = "";
                }
                return gw00.e(new Pair(new o801(str), p551Var));
            }
        }
        widgetsApiDatasourceImpl$getWidgets$1 = new WidgetsApiDatasourceImpl$getWidgets$1(this, continuationImpl);
        Object obj2 = widgetsApiDatasourceImpl$getWidgets$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsApiDatasourceImpl$getWidgets$1.label;
        if (i != 0) {
        }
        p551 p551Var2 = (p551) obj2;
        str = c551Var.a;
        if (str == null) {
        }
        return gw00.e(new Pair(new o801(str), p551Var2));
    }
}
