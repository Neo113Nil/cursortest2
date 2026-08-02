package com.yandex.plus.bdui;

/* loaded from: classes4.dex */
public final class w implements a0 {
    public final String a;

    public w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
