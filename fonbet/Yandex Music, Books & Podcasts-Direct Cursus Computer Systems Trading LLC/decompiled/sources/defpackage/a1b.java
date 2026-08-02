package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class a1b {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public a1b(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? rf0.l(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(bxj bxjVar) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect e = i >= 31 ? rf0.e(context) : new lmd(context);
        e.setColor(this.b);
        if (!hqe.a(this.c, 0L)) {
            bxj bxjVar2 = bxj.a;
            long j = this.c;
            if (bxjVar == bxjVar2) {
                e.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return e;
            }
            e.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return e;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(bxj.a);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(bxj.b);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(bxj.b);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(bxj.a);
        this.d = a;
        return a;
    }
}
