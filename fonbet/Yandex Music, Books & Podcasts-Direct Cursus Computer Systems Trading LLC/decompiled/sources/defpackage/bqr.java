package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bqr extends sce {
    public final Drawable a;
    public final rce b;
    public final bb7 c;
    public final xwh d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public bqr(Drawable drawable, rce rceVar, bb7 bb7Var, xwh xwhVar, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = rceVar;
        this.c = bb7Var;
        this.d = xwhVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.sce
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.sce
    public final rce b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqr)) {
            return false;
        }
        bqr bqrVar = (bqr) obj;
        return Intrinsics.d(this.a, bqrVar.a) && Intrinsics.d(this.b, bqrVar.b) && this.c == bqrVar.c && Intrinsics.d(this.d, bqrVar.d) && Intrinsics.d(this.e, bqrVar.e) && this.f == bqrVar.f && this.g == bqrVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xwh xwhVar = this.d;
        int hashCode2 = (hashCode + (xwhVar != null ? xwhVar.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + k5r.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
