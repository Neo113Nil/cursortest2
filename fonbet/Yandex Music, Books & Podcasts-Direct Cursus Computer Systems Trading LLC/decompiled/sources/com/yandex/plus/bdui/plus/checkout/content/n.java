package com.yandex.plus.bdui.plus.checkout.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements com.yandex.plus.bdui.action.j, com.yandex.plus.bdui.content.a {
    public final com.yandex.plus.bdui.action.a a;

    public n(com.yandex.plus.bdui.action.a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.action.a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.o(new StringBuilder("PlusPayPreviewContent(onBackAction="), this.a, ')');
    }
}
