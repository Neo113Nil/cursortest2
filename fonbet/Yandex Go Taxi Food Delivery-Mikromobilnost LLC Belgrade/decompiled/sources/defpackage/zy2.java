package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.Map;
import yads.h01;

/* loaded from: classes11.dex */
public final class zy2 {
    public final boolean a;
    public boolean b;

    public zy2(Context context, SharedPreferences sharedPreferences, x22 x22Var) {
        tje.e();
        String string = sharedPreferences.getString("CURRENT_APP_VERSION_NAME", null);
        long j = sharedPreferences.getLong("CURRENT_APP_VERSION_CODE", 0L);
        String d = vqb1.d(context);
        String str = d == null ? "250.2" : d;
        PackageInfo f = vqb1.f(context);
        Long valueOf = f != null ? Long.valueOf(f.getLongVersionCode()) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 190L;
        if (string != null) {
            this.a = false;
            this.b = j != longValue;
        } else {
            boolean contains = sharedPreferences.contains("keyboard_height_port");
            this.b = contains;
            this.a = true ^ contains;
        }
        if (this.a || this.b) {
            x22Var.f("apk update", "from", string, "to", str);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("CURRENT_APP_VERSION_CODE", longValue);
            edit.putString("CURRENT_APP_VERSION_NAME", str);
            edit.apply();
        }
    }

    public zy2(Map map) {
        String b = ob71.b(map, h01.T);
        if (b != null) {
            Boolean.parseBoolean(b);
        }
        String b2 = ob71.b(map, h01.U);
        boolean parseBoolean = b2 == null ? true : Boolean.parseBoolean(b2);
        String b3 = ob71.b(map, h01.V);
        boolean parseBoolean2 = b3 != null ? Boolean.parseBoolean(b3) : true;
        this.a = parseBoolean;
        this.b = parseBoolean2;
    }

    public /* synthetic */ zy2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public zy2(a73 a73Var, int i) {
        switch (i) {
            case 2:
                this.b = false;
                this.a = a73Var.b(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 3:
            default:
                this.a = a73Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = xbj.a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
            case 4:
                Iterator it = a73Var.c(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r0 = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                    }
                }
                this.a = r0;
                this.b = a73Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
        }
    }
}
