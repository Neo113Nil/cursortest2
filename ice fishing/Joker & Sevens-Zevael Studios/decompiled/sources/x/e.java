package x;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m0.r1;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f7766h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f7767i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7768g;

    static {
        int i10 = 1;
        f7766h = new e(i10, 0);
        f7767i = new e(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f7768g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f7768g) {
            case 0:
                r1 r1Var = (r1) obj;
                x2 x2Var = AndroidCompositionLocals_androidKt.f603b;
                r1Var.getClass();
                if (((Context) m0.z.t(r1Var, x2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return g.f7789b;
                }
                d.f7759a.getClass();
                return c.f7752c;
            default:
                return Boolean.valueOf(!(((r1.n) obj).f5971i == 2));
        }
    }
}
