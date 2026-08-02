package com.yandex.plus.home.feature.webviews.internal.stories;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {
    public final String a;
    public final String b;
    public final com.yandex.plus.home.api.config.a c;

    public q(String str, String str2, com.yandex.plus.home.api.config.a aVar) {
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebStoriesViewBundle(data=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b != null ? "<token_hidden>" : null);
        sb.append(", plusHomeBundle=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
