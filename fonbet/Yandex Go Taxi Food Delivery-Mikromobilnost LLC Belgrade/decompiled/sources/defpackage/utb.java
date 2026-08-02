package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final class utb extends amb1 {
    public final View b;
    public final Triple c;
    public final Pair d;

    public utb(View view, Triple triple) {
        this.b = view;
        this.c = triple;
        this.d = new Pair(Float.valueOf(view.getAlpha()), Float.valueOf(0.0f));
    }

    @Override // defpackage.amb1
    public final Pair a() {
        return this.d;
    }

    @Override // defpackage.amb1
    public final Triple b() {
        View view = this.b;
        return new Triple(Float.valueOf(view.getX()), Float.valueOf(view.getY()), Float.valueOf(view.getZ()));
    }

    @Override // defpackage.amb1
    public final View d() {
        return this.b;
    }

    @Override // defpackage.amb1
    public final Triple e() {
        Triple triple = this.c;
        float floatValue = ((Number) triple.getFirst()).floatValue();
        float floatValue2 = ((Number) triple.getSecond()).floatValue();
        float floatValue3 = ((Number) triple.getThird()).floatValue();
        Triple b = b();
        float floatValue4 = ((Number) b.getFirst()).floatValue();
        float floatValue5 = ((Number) b.getSecond()).floatValue();
        return new Triple(Float.valueOf(n.a(floatValue, floatValue4, 2.0f, floatValue4)), Float.valueOf(n.a(floatValue2, floatValue5, 2.0f, floatValue5)), Float.valueOf(floatValue3));
    }
}
