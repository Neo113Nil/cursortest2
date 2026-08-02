package com.yandex.plus.bdui.plus.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.k, com.yandex.plus.bdui.action.j {
    public final com.yandex.plus.bdui.failure.d a;

    public j(com.yandex.plus.bdui.failure.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    @Override // com.yandex.plus.bdui.action.k
    public final com.yandex.plus.bdui.action.a a() {
        com.yandex.plus.bdui.failure.d dVar = this.a;
        com.yandex.plus.bdui.action.k kVar = dVar instanceof com.yandex.plus.bdui.action.k ? (com.yandex.plus.bdui.action.k) dVar : null;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        com.yandex.plus.bdui.failure.d dVar = this.a;
        com.yandex.plus.bdui.action.j jVar = dVar instanceof com.yandex.plus.bdui.action.j ? (com.yandex.plus.bdui.action.j) dVar : null;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlusFailureContent(failure=" + this.a + ')';
    }
}
