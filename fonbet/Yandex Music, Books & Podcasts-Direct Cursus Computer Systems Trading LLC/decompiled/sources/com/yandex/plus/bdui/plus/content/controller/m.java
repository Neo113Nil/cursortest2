package com.yandex.plus.bdui.plus.content.controller;

import defpackage.h0l;

/* loaded from: classes4.dex */
public final class m implements com.yandex.plus.bdui.action.a {
    public final h0l a;

    public m(h0l h0lVar) {
        this.a = h0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a.equals(((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetryAction(retry=" + this.a + ')';
    }
}
