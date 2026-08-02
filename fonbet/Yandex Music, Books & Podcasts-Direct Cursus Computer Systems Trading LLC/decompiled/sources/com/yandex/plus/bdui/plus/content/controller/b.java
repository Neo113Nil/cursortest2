package com.yandex.plus.bdui.plus.content.controller;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.bdui.action.a a;

    public b(com.yandex.plus.bdui.action.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.o(new StringBuilder("Action(action="), this.a, ')');
    }
}
