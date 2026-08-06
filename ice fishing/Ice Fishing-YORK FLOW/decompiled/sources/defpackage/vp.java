package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vp {
    public final java.io.File JhCgjQRTAOCT;
    public byte[] P05cfTpS5W5L;
    public defpackage.wp[] QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final java.util.concurrent.Executor ZpBGe2uQfcn8;
    public final byte[] fWTAfUmVKrZq;
    public final defpackage.m21 giKS3J6vZuNy;
    public boolean oh71FJcDz6S2 = false;

    public vp(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, defpackage.m21 m21Var, java.lang.String str, java.io.File file) {
        byte[] bArr;
        this.ZpBGe2uQfcn8 = executor;
        this.giKS3J6vZuNy = m21Var;
        this.WDYagTQQm9ns = str;
        this.JhCgjQRTAOCT = file;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = defpackage.nn.T1fB7bDYiVJQ;
                    break;
                case 26:
                    bArr = defpackage.nn.gUjdnLbkVAaA;
                    break;
                case 27:
                    bArr = defpackage.nn.h3m55N1URyyK;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = defpackage.nn.fNwYGHIYeJcR;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = defpackage.nn.Ns0WNyEWdPsk;
        }
        this.fWTAfUmVKrZq = bArr;
    }

    public final java.io.FileInputStream ZpBGe2uQfcn8(android.content.res.AssetManager assetManager, java.lang.String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e) {
            java.lang.String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.giKS3J6vZuNy.fWTAfUmVKrZq();
            return null;
        }
    }

    public final void giKS3J6vZuNy(final int i, final java.io.Serializable serializable) {
        this.ZpBGe2uQfcn8.execute(new java.lang.Runnable() { // from class: up
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.vp.this.giKS3J6vZuNy.JhCgjQRTAOCT(i, serializable);
            }
        });
    }
}
