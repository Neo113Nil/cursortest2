package com.yandex.plus.bdui.templating.render;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d {
    public static g a(com.yandex.plus.core.templating.parser.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        ArrayList r = ((com.yandex.plus.bdui.plus.content.controller.f) bVar).r(str);
        if (!r.isEmpty() && !r.isEmpty()) {
            Iterator it = r.iterator();
            while (it.hasNext()) {
                if (!(((com.yandex.plus.core.templating.template.d) it.next()) instanceof com.yandex.plus.core.templating.template.b)) {
                    return new e(r);
                }
            }
        }
        return new f(str);
    }
}
