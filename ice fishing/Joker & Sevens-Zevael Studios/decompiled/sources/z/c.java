package z;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements d, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8942a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8943b;

    public c(int i10) {
        this.f8942a = i10;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f8943b = 0;
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f8943b = 0;
                break;
            case 3:
                this.f8943b = 0;
                break;
            default:
                this.f8943b = 0;
                break;
        }
    }

    @Override // z.d, z.g
    public final float a() {
        switch (this.f8942a) {
        }
        return this.f8943b;
    }

    @Override // z.g
    public final void b(v1.g0 g0Var, int i10, int[] iArr, int[] iArr2) {
        switch (this.f8942a) {
            case 0:
                i.a(i10, iArr, iArr2, false);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                i.d(i10, iArr, iArr2, false);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                i.e(i10, iArr, iArr2, false);
                break;
            default:
                i.f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override // z.d
    public final void c(s2.c cVar, int i10, int[] iArr, s2.l lVar, int[] iArr2) {
        switch (this.f8942a) {
            case 0:
                if (lVar != s2.l.f6396g) {
                    i.a(i10, iArr, iArr2, true);
                    break;
                } else {
                    i.a(i10, iArr, iArr2, false);
                    break;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (lVar != s2.l.f6396g) {
                    i.d(i10, iArr, iArr2, true);
                    break;
                } else {
                    i.d(i10, iArr, iArr2, false);
                    break;
                }
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (lVar != s2.l.f6396g) {
                    i.e(i10, iArr, iArr2, true);
                    break;
                } else {
                    i.e(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (lVar != s2.l.f6396g) {
                    i.f(i10, iArr, iArr2, true);
                    break;
                } else {
                    i.f(i10, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f8942a) {
            case 0:
                return "Arrangement#Center";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "Arrangement#SpaceAround";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
