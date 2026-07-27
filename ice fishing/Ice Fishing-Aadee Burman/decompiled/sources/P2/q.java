package P2;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class q implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2526n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Intent f2527u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2528v;

    public /* synthetic */ q(Intent intent, Object obj, int i) {
        this.f2526n = i;
        this.f2527u = intent;
        this.f2528v = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [O2.e, java.lang.Object] */
    public final void a() {
        switch (this.f2526n) {
            case 0:
                Intent intent = this.f2527u;
                if (intent != null) {
                    ((GoogleApiActivity) this.f2528v).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f2527u;
                if (intent2 != null) {
                    this.f2528v.a(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e9) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e9);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
