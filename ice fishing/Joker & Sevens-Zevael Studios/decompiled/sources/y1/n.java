package y1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final n f8585h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f8586i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f8587j;

    /* renamed from: k, reason: collision with root package name */
    public static final n f8588k;

    /* renamed from: l, reason: collision with root package name */
    public static final n f8589l;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8590g;

    static {
        int i10 = 1;
        f8585h = new n(i10, 0);
        f8586i = new n(i10, 1);
        f8587j = new n(i10, 2);
        f8588k = new n(i10, 3);
        f8589l = new n(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, int i11) {
        super(i10);
        this.f8590g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f8590g) {
            case 0:
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Boolean.TRUE;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return Boolean.FALSE;
            case 3:
                m0.r1 r1Var = (m0.r1) obj;
                m0.e0 e0Var = AndroidCompositionLocals_androidKt.f602a;
                r1Var.getClass();
                m0.z.t(r1Var, e0Var);
                return ((Context) m0.z.t(r1Var, AndroidCompositionLocals_androidKt.f603b)).getResources();
            default:
                return Boolean.valueOf(e0.j(obj));
        }
    }
}
