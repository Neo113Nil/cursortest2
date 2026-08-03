package w;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7523a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7524b;

    /* renamed from: c, reason: collision with root package name */
    public long f7525c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f7526d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f7527e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f7528f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f7529g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f7530h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f7531i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f7532j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f7533k;

    public y(Context context, int i10) {
        this.f7523a = context;
        this.f7524b = i10;
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
        return !((Build.VERSION.SDK_INT >= 31 ? h.f7427a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f7523a;
        EdgeEffect a6 = i10 >= 31 ? h.f7427a.a(context, null) : new f0(context);
        a6.setColor(this.f7524b);
        if (!s2.k.a(this.f7525c, 0L)) {
            long j3 = this.f7525c;
            a6.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
        return a6;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f7527e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a6 = a();
        this.f7527e = a6;
        return a6;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f7528f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a6 = a();
        this.f7528f = a6;
        return a6;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f7529g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a6 = a();
        this.f7529g = a6;
        return a6;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f7526d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a6 = a();
        this.f7526d = a6;
        return a6;
    }
}
