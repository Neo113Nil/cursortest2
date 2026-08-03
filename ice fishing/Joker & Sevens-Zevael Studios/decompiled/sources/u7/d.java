package u7;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.util.Log;
import androidx.lifecycle.l0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import h3.k;
import k2.l;
import k2.n;
import k2.q;
import l.h;
import l.m;
import pc.j;
import v.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class d implements a4.f, k, q, m {

    /* renamed from: g, reason: collision with root package name */
    public static d f6723g;

    /* renamed from: h, reason: collision with root package name */
    public static d f6724h;

    public static final float[] d() {
        float[] fArr = p.f6922s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        p.f6922s = fArr2;
        return fArr2;
    }

    public static x0 e(y0 y0Var, l0 l0Var, int i10) {
        v0 v0Var = l0Var;
        if ((i10 & 2) != 0) {
            v0Var = y0Var instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) y0Var).d() : z3.b.f9100a;
        }
        x3.b e10 = y0Var instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) y0Var).e() : x3.a.f8285b;
        j.e(v0Var, "factory");
        j.e(e10, "extras");
        return new x0(y0Var.g(), v0Var, e10);
    }

    public static Typeface g(String str, l lVar, int i10) {
        Typeface create;
        if (i10 == 0 && j.a(lVar, l.f3612i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f3615g, i10 == 1);
        return create;
    }

    @Override // k2.q
    public Typeface b(l lVar, int i10) {
        return g(null, lVar, i10);
    }

    @Override // k2.q
    public Typeface c(n nVar, l lVar, int i10) {
        nVar.getClass();
        return g("sans-serif", lVar, i10);
    }

    @Override // l.m
    public boolean f(h hVar) {
        return false;
    }

    @Override // a4.f
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a4.f
    public void i(int i10, Object obj) {
        String str;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    @Override // l.m
    public void a(h hVar, boolean z10) {
    }

    @Override // h3.k
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // h3.k
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }
}
