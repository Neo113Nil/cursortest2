package p0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: p0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1015l implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f8388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8389c;

    public /* synthetic */ DialogInterfaceOnClickListenerC1015l(Intent intent, Object obj, int i2) {
        this.f8387a = i2;
        this.f8388b = intent;
        this.f8389c = obj;
    }

    public final void a() {
        switch (this.f8387a) {
            case 0:
                Intent intent = this.f8388b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f8389c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f8388b;
                if (intent2 != null) {
                    ((o0.x) this.f8389c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e2) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
