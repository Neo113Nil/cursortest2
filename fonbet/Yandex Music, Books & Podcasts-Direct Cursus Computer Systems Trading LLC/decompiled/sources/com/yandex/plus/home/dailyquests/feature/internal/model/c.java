package com.yandex.plus.home.dailyquests.feature.internal.model;

import android.graphics.drawable.Drawable;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final Drawable a;
    public final String b;
    public final f c;
    public final String d;

    public c(Drawable drawable, String str, f fVar, String str2) {
        str.getClass();
        this.a = drawable;
        this.b = str;
        this.c = fVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && this.c.equals(cVar.c) && Intrinsics.d(this.d, cVar.d);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (this.c.hashCode() + k5r.c((drawable == null ? 0 : drawable.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainPart(questImage=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", progressPart=");
        sb.append(this.c);
        sb.append(", daysLeftUntilDeadlineText=");
        return dfi.i(sb, this.d, ')');
    }
}
