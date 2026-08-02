package com.yandex.plus.bdui.plus.failure;

import com.yandex.plus.bdui.failure.d;
import com.yandex.plus.bdui.plus.content.controller.m;
import com.yandex.plus.bdui.plus.content.r;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements d {
    public final r a;
    public final String b;
    public final Throwable c;
    public final m d;

    public a(r rVar, String str, Throwable th, m mVar) {
        rVar.getClass();
        str.getClass();
        th.getClass();
        this.a = rVar;
        this.b = str;
        this.c = th;
        this.d = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PlusWebFailure(content=" + this.a + ", url=" + this.b + ", error=" + this.c + ", retryAction=" + this.d + ')';
    }
}
