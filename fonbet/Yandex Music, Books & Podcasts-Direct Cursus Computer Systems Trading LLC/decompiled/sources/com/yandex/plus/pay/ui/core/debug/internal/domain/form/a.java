package com.yandex.plus.pay.ui.core.debug.internal.domain.form;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {
    public final String a;
    public final String b;
    public final String c;

    public a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.yandex.plus.pay.ui.core.debug.internal.domain.form.c
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUrl(questionId=");
        sb.append(this.a);
        sb.append(", dataUrl=");
        sb.append(this.b);
        sb.append(", fileName=");
        return dfi.i(sb, this.c, ')');
    }
}
