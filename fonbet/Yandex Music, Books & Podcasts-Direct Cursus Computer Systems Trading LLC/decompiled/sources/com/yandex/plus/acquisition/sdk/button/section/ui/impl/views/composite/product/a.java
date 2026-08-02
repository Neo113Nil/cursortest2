package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product;

import com.yandex.plus.core.debug.panel.internal.model.log.e;
import com.yandex.plus.core.debug.panel.internal.model.log.f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a {
    public static boolean a(f fVar, ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((e) obj).a == fVar) {
                break;
            }
        }
        e eVar = (e) obj;
        if (eVar != null) {
            return eVar.b;
        }
        return false;
    }
}
