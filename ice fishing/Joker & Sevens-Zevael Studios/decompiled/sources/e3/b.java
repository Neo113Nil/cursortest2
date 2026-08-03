package e3;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Comparator;
import m0.s0;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2064a;

    public /* synthetic */ b(int i10) {
        this.f2064a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2064a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b2 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b2 != b10) {
                        return b2 - b10;
                    }
                }
                return 0;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ac.i iVar = (ac.i) obj;
                ac.i iVar2 = (ac.i) obj2;
                return (((Number) iVar.f271h).intValue() - ((Number) iVar.f270g).intValue()) - (((Number) iVar2.f271h).intValue() - ((Number) iVar2.f270g).intValue());
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return pc.j.f(((s0) obj).f4753b, ((s0) obj2).f4753b);
            default:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                float f10 = g0Var.J.f8103p.J;
                float f11 = g0Var2.J.f8103p.J;
                return f10 == f11 ? pc.j.f(g0Var.t(), g0Var2.t()) : Float.compare(f10, f11);
        }
    }
}
