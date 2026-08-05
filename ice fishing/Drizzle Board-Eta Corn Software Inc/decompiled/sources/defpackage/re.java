package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import java.util.UUID;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class re implements k9, os, z9, j00 {
    public final /* synthetic */ int NCTxEWno;
    public static final /* synthetic */ re MdtA4re8 = new re(1);
    public static final /* synthetic */ re wxUZMvaN = new re(2);
    public static final /* synthetic */ re VgvYg0wo = new re(3);
    public static final re P7K7Inc8 = new re(4);
    public static final re b2ZJblxo = new re(5);
    public static final re Qr9iLBAD = new re(6);
    public static final re jb9XjC4I = new re(7);

    public /* synthetic */ re(int i) {
        this.NCTxEWno = i;
    }

    public static ut MdtA4re8(k0 k0Var, pu puVar, Bundle bundle, po poVar, hu huVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        puVar.getClass();
        poVar.getClass();
        return new ut(k0Var, puVar, bundle, poVar, huVar, uuid, null);
    }

    @Override // defpackage.os
    public boolean Ey6iv0m0(yr yrVar) {
        return false;
    }

    public float NCTxEWno(float f) {
        return 1.0f;
    }

    @Override // defpackage.j00
    public void OnDfzHZD(int i, Object obj) {
        String str;
        switch (this.NCTxEWno) {
            case 28:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
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
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.j00
    public void k3x7lurq() {
        switch (this.NCTxEWno) {
            case 28:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public Signature[] wxUZMvaN(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    private final void VgvYg0wo() {
    }

    private final void P7K7Inc8(int i, Object obj) {
    }

    @Override // defpackage.os
    public void qoPGr6Ce(yr yrVar, boolean z) {
    }
}
