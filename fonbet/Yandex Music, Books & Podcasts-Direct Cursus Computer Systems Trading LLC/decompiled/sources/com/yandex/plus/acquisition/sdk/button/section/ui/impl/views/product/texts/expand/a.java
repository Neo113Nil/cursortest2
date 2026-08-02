package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand;

import defpackage.tlm;
import defpackage.xal;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b a;
    public final com.yandex.plus.resources.core.c b;
    public final xal c;

    public a(com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b bVar, com.yandex.plus.resources.core.c cVar, xal xalVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = xalVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(400L, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Content(productTextsContent=" + this.a + ", stringsResolver=" + this.b + ", debounceTimeMs=400, onClickListener=" + this.c + ')';
    }
}
