package com.yandex.plus.bdui.plus.checkout.content;

import com.yandex.plus.bdui.plus.action.y;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes4.dex */
public abstract class l implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public static final jyr a = btf.b(new com.yandex.plus.bdui.plus.action.serializer.s(14));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && ((y) a.getValue()).a(this, obj);
    }

    public final int hashCode() {
        return ((y) a.getValue()).b(0, this);
    }
}
