package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup;

import android.content.Context;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.pay.internal.feature.payment.i;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class c {
    public final Context a;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b b;
    public final g c;
    public final fkn d;

    public c(Context context, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar, g gVar, fkn fknVar) {
        context.getClass();
        bVar.getClass();
        this.a = context;
        this.b = bVar;
        this.c = gVar;
        this.d = fknVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:30|31))(10:32|(2:35|33)|36|37|(4:40|(3:42|43|44)(1:46)|45|38)|47|48|(2:49|(2:51|(1:53)(1:57))(2:58|59))|54|(1:56))|11|12|(1:14)|15|(4:17|(3:19|(1:21)(1:24)|(1:23))|25|26)(1:28)))|66|6|7|(0)(0)|11|12|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x002f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b0, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00af, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a7, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration;
        String str;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                String str2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = aVar.c;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((j) it.next()).d);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            str = null;
                            break;
                        }
                        str = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g) it3.next()).a;
                        if (str != null) {
                            break;
                        }
                    }
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.internal.feature.payment.b h = this.c.h();
                    bVar.l = 1;
                    obj = ((i) h).e(str, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (obj instanceof t7o) {
                    obj = null;
                }
                plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.b.a();
                if (plusPayTopupScreenConfiguration != null) {
                    return null;
                }
                String actionScenario = plusPayTopupScreenConfiguration.getActionScenario();
                b0 widgetUrl = plusPayTopupScreenConfiguration.getWidgetUrl();
                if (widgetUrl != null) {
                    String str3 = u.r(this.a, (com.yandex.plus.ui.core.theme.a) this.d.a.getValue()) ? widgetUrl.b : widgetUrl.a;
                    if (str3 != null) {
                        str2 = com.yandex.plus.bdui.plus.analytics.b.b(str3, a.a);
                    }
                }
                return new a(actionScenario, str2, plusPayTopupScreenConfiguration.getTimeoutParams().getStartMessageTimeoutMillis(), plusPayTopupScreenConfiguration.getTimeoutParams().getLoadMessageTimeoutMillis());
            }
        }
        bVar = new b(this, cg6Var);
        obj = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        String str22 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (obj instanceof t7o) {
        }
        plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = this.b.a();
        if (plusPayTopupScreenConfiguration != null) {
        }
    }
}
