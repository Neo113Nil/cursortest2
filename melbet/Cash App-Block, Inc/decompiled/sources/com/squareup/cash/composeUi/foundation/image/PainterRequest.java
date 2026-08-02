package com.squareup.cash.composeUi.foundation.image;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PainterRequest {
    public final Object key;
    public final Function1 onError;
    public final String url;

    public PainterRequest(Object obj, String str, Function1 function1) {
        this.key = obj;
        this.url = str;
        this.onError = function1;
    }

    public static PainterRequest copy$default(PainterRequest painterRequest, Function1 function1) {
        Object obj = painterRequest.key;
        String str = painterRequest.url;
        painterRequest.getClass();
        return new PainterRequest(obj, str, function1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterRequest)) {
            return false;
        }
        PainterRequest painterRequest = (PainterRequest) obj;
        return Intrinsics.areEqual(this.key, painterRequest.key) && Intrinsics.areEqual(this.url, painterRequest.url) && Intrinsics.areEqual(this.onError, painterRequest.onError);
    }

    public final int hashCode() {
        Object obj = this.key;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function1 function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "PainterRequest(key=" + this.key + ", url=" + this.url + ", onError=" + this.onError + ")";
    }
}
