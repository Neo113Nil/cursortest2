package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ha8 implements bnq {
    public final Context a;

    public ha8(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ha8) {
            return Intrinsics.d(this.a, ((ha8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bnq
    public final Object s(rkn rknVar) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        q38 q38Var = new q38(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new lmq(q38Var, q38Var);
    }
}
