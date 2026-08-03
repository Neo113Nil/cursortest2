package b9;

import android.content.DialogInterface;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.notifications.internal.registration.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1044b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f1043a = i10;
        this.f1044b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f1043a) {
            case 0:
                d.m0show$lambda0((c) this.f1044b, dialogInterface, i10);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d.m1show$lambda1((c) this.f1044b, dialogInterface, i10);
                break;
            default:
                a.b.m38invokeSuspend$lambda1((com.onesignal.notifications.internal.registration.impl.a) this.f1044b, dialogInterface, i10);
                break;
        }
    }
}
