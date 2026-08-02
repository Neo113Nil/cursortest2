package com.miteksystems.misnap.controller.a;

import net.idrnd.misnap.iad.Result;

/* loaded from: classes4.dex */
public final class s$a extends net.idrnd.misnap.iad.a {
    public final Result a;

    public s$a(Result result) {
        this.a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s$a) && this.a.equals(((s$a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ')';
    }
}
