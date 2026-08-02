package com.yandex.plus.bdui.plus.shared;

/* loaded from: classes4.dex */
public final class f implements com.yandex.plus.bdui.shared.a {
    public final String a;

    public f(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.yandex.plus.bdui.shared.a
    public final com.yandex.plus.bdui.shared.a a(com.yandex.plus.bdui.shared.a aVar) {
        aVar.getClass();
        f fVar = aVar instanceof f ? (f) aVar : null;
        return fVar != null ? fVar : this;
    }

    @Override // com.yandex.plus.bdui.shared.a
    public final com.yandex.plus.bdui.shared.a copy() {
        return new f(this.a);
    }
}
