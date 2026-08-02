package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.u;
import com.yandex.plus.home.repository.api.model.webconfig.v;
import com.yandex.plus.home.repository.api.model.webconfig.y;
import com.yandex.plus.home.repository.api.model.webconfig.z;
import defpackage.oj;
import defpackage.ryc;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends oj implements ryc {
    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g gVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g) obj3;
        p pVar = ((c) this.receiver).b;
        a0 config = gVar.getConfig();
        if (config == null || !booleanValue || !booleanValue2) {
            config = null;
        }
        if (config != null) {
            z zVar = config.c;
            u uVar = zVar.g;
            y yVar = zVar.e;
            if (yVar == y.d && uVar != null) {
                String str = uVar.a;
                String str2 = (String) CollectionsKt.R(uVar.b);
                if (str2 == null) {
                    str2 = "";
                }
                return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.a(gVar, str, str2, uVar.c, zVar.b);
            }
            if (zVar.c == v.a) {
                return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c(gVar, config, pVar.B(gVar, config));
            }
            if (yVar == y.c) {
                return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.b(gVar, config, pVar.B(gVar, config));
            }
        }
        return null;
    }
}
