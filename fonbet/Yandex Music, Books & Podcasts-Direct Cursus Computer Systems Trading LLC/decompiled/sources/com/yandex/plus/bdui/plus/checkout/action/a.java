package com.yandex.plus.bdui.plus.checkout.action;

import com.yandex.plus.bdui.plus.action.serializer.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.btf;
import defpackage.jyr;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {
    public static final jyr a = btf.b(new s(4));

    public static com.yandex.plus.bdui.action.a a(com.yandex.plus.bdui.shared.b bVar) {
        bVar.getClass();
        Map a2 = r1.a(bVar);
        com.yandex.plus.bdui.action.a aVar = a2 != null ? (com.yandex.plus.bdui.action.a) a2.get("clientErrorCloseAction") : null;
        return aVar == null ? (com.yandex.plus.bdui.plus.action.f) a.getValue() : aVar;
    }
}
