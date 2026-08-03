package p;

import android.net.Uri;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f5395h;

    public /* synthetic */ a(b bVar, Bundle bundle, int i10) {
        this.f5394g = i10;
        this.f5395h = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5394g) {
            case 0:
                this.f5395h.f5397e.getClass();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f5395h.f5397e.getClass();
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f5395h.f5397e.getClass();
                break;
            case 3:
                this.f5395h.f5397e.getClass();
                break;
            case 4:
                this.f5395h.f5397e.getClass();
                break;
            case 5:
                this.f5395h.f5397e.getClass();
                break;
            case 6:
                this.f5395h.f5397e.getClass();
                break;
            case 7:
                this.f5395h.f5397e.getClass();
                break;
            case 8:
                this.f5395h.f5397e.getClass();
                break;
            default:
                this.f5395h.f5397e.getClass();
                break;
        }
    }

    public /* synthetic */ a(b bVar, String str, Bundle bundle, int i10) {
        this.f5394g = i10;
        this.f5395h = bVar;
    }

    public a(b bVar, int i10, Bundle bundle) {
        this.f5394g = 1;
        this.f5395h = bVar;
    }

    public a(b bVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f5394g = 5;
        this.f5395h = bVar;
    }

    public a(b bVar, int i10, int i11, Bundle bundle) {
        this.f5394g = 6;
        this.f5395h = bVar;
    }

    public a(b bVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f5394g = 8;
        this.f5395h = bVar;
    }
}
