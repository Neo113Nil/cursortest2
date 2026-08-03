package p6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import o6.s0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5617c;

    public /* synthetic */ n(Intent intent, Object obj, int i10) {
        this.f5615a = i10;
        this.f5616b = intent;
        this.f5617c = obj;
    }

    public final void a() {
        switch (this.f5615a) {
            case 0:
                Intent intent = this.f5616b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f5617c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f5616b;
                if (intent2 != null) {
                    ((s0) this.f5617c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
