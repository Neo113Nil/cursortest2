package com.yandex.plus.home.dailyquests.feature.internal.model;

import android.graphics.drawable.Drawable;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements j {
    public final Drawable a;
    public final Drawable b;
    public final String c;
    public final CharSequence d;
    public final String e;

    public a(Drawable drawable, Drawable drawable2, String str, CharSequence charSequence, String str2) {
        str.getClass();
        charSequence.getClass();
        str2.getClass();
        this.a = drawable;
        this.b = drawable2;
        this.c = str;
        this.d = charSequence;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        Drawable drawable2 = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c((hashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Completed(questImage=");
        sb.append(this.a);
        sb.append(", completedImage=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append((Object) this.d);
        sb.append(", contentDescription=");
        return dfi.i(sb, this.e, ')');
    }
}
