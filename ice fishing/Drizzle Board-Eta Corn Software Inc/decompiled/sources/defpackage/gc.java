package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gc {
    public final byte[] MdtA4re8;
    public final j00 NCTxEWno;
    public boolean P7K7Inc8 = false;
    public byte[] Qr9iLBAD;
    public final String VgvYg0wo;
    public hc[] b2ZJblxo;
    public final Executor qoPGr6Ce;
    public final File wxUZMvaN;

    public gc(AssetManager assetManager, Executor executor, j00 j00Var, String str, File file) {
        byte[] bArr;
        this.qoPGr6Ce = executor;
        this.NCTxEWno = j00Var;
        this.VgvYg0wo = str;
        this.wxUZMvaN = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = ra.jb9XjC4I;
                    break;
                case 26:
                    bArr = ra.Qr9iLBAD;
                    break;
                case 27:
                    bArr = ra.b2ZJblxo;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ra.P7K7Inc8;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = ra.VgvYg0wo;
        }
        this.MdtA4re8 = bArr;
    }

    public final void NCTxEWno(final int i, final Serializable serializable) {
        this.qoPGr6Ce.execute(new Runnable() { // from class: fc
            @Override // java.lang.Runnable
            public final void run() {
                gc.this.NCTxEWno.OnDfzHZD(i, serializable);
            }
        });
    }

    public final FileInputStream qoPGr6Ce(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.NCTxEWno.k3x7lurq();
            return null;
        }
    }
}
