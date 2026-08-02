package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {
    public final com.yandex.plus.pay.ui.core.debug.internal.domain.form.d a;

    public f(com.yandex.plus.pay.ui.core.debug.internal.domain.form.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Form(formInfo=" + this.a + ')';
    }
}
