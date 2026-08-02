package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final class ttb extends amb1 {
    public final View b;
    public final Triple c;
    public final Pair d;

    public ttb(View view, Triple triple) {
        this.b = view;
        this.c = triple;
        this.d = new Pair(Float.valueOf(0.0f), Float.valueOf(view.getAlpha()));
    }

    @Override // defpackage.amb1
    public final Pair a() {
        return this.d;
    }

    @Override // defpackage.amb1
    public final Triple b() {
        return this.c;
    }

    @Override // defpackage.amb1
    public final View d() {
        return this.b;
    }

    @Override // defpackage.amb1
    public final Triple e() {
        View view = this.b;
        return new Triple(Float.valueOf(view.getX()), Float.valueOf(view.getY()), Float.valueOf(view.getZ()));
    }
}
