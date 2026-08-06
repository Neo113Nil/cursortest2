package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ol {
    public pl[] AvO7iQsrTN;
    public boolean EljAMC1QTz = false;
    public final Executor GWasM1elztuh;
    public final String OOA6hdeuvCS;
    public final byte[] X1lG3V04pd;
    public final fs0 Yi7zF1RB1;
    public byte[] encWxUiV2;
    public final File xqGvceK5x;

    public ol(AssetManager assetManager, Executor executor, fs0 fs0Var, String str, File file) {
        byte[] bArr;
        this.GWasM1elztuh = executor;
        this.Yi7zF1RB1 = fs0Var;
        this.OOA6hdeuvCS = str;
        this.xqGvceK5x = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = o30.uFEq9NpZ;
                    break;
                case 26:
                    bArr = o30.XnEVoBF0td1l;
                    break;
                case 27:
                    bArr = o30.E7jCp8Ls;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = o30.rQPn8YBR;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = o30.JFJ3QoxA;
        }
        this.X1lG3V04pd = bArr;
    }

    public final FileInputStream GWasM1elztuh(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.Yi7zF1RB1.OOA6hdeuvCS();
            return null;
        }
    }

    public final void Yi7zF1RB1(final int i, final Serializable serializable) {
        this.GWasM1elztuh.execute(new Runnable() { // from class: nl
            @Override // java.lang.Runnable
            public final void run() {
                ol.this.Yi7zF1RB1.EljAMC1QTz(i, serializable);
            }
        });
    }
}
