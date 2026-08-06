package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc1 implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ jc1(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i;
        android.app.PendingIntent actionIntent;
        android.app.ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.kc1 kc1Var = (defpackage.kc1) obj;
                return java.lang.Integer.valueOf(defpackage.b80.oCu53ZX2v4Ju(kc1Var, kc1Var.P05cfTpS5W5L));
            case 1:
                return ((defpackage.sb0) ((java.util.ArrayList) obj).get(0)).ZpBGe2uQfcn8.ZpBGe2uQfcn8.giKS3J6vZuNy();
            case 2:
                defpackage.yc1 yc1Var = (defpackage.yc1) obj;
                defpackage.pw0 pw0Var = yc1Var.QiMR8OkAhezm;
                if (((defpackage.ae1) pw0Var.getValue()).ZpBGe2uQfcn8 == 9205357640488583168L || defpackage.ae1.fWTAfUmVKrZq(((defpackage.ae1) pw0Var.getValue()).ZpBGe2uQfcn8)) {
                    return null;
                }
                return yc1Var.WDYagTQQm9ns.giKS3J6vZuNy(((defpackage.ae1) pw0Var.getValue()).ZpBGe2uQfcn8);
            case 3:
                defpackage.hf1 hf1Var = (defpackage.hf1) obj;
                do {
                    synchronized (hf1Var.QiMR8OkAhezm) {
                        try {
                            if (!hf1Var.fWTAfUmVKrZq) {
                                hf1Var.fWTAfUmVKrZq = true;
                                try {
                                    defpackage.ho0 ho0Var = hf1Var.oh71FJcDz6S2;
                                    java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
                                    int i3 = ho0Var.QiMR8OkAhezm;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        defpackage.gf1 gf1Var = (defpackage.gf1) objArr[i4];
                                        defpackage.zn0 zn0Var = gf1Var.QiMR8OkAhezm;
                                        defpackage.y10 y10Var = gf1Var.ZpBGe2uQfcn8;
                                        java.lang.Object[] objArr2 = zn0Var.giKS3J6vZuNy;
                                        long[] jArr = zn0Var.ZpBGe2uQfcn8;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i = i6;
                                                            y10Var.P05cfTpS5W5L(objArr2[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                        }
                                                        j >>= i;
                                                        i8++;
                                                        i6 = i;
                                                    }
                                                    if (i7 != i6) {
                                                    }
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                }
                                            }
                                        }
                                        zn0Var.giKS3J6vZuNy();
                                    }
                                    hf1Var.fWTAfUmVKrZq = false;
                                } catch (java.lang.Throwable th) {
                                    hf1Var.fWTAfUmVKrZq = false;
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                } while (hf1Var.fWTAfUmVKrZq());
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 4:
                actionIntent = ((android.app.RemoteAction) obj).getActionIntent();
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (android.app.PendingIntent.CanceledException e) {
                        android.util.Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                } else {
                    actionIntent.send();
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 5:
                defpackage.pk1 pk1Var = (defpackage.pk1) obj;
                return pk1Var.s0TASMVLSWD5 ? defpackage.q70.h3m55N1URyyK(pk1Var) : defpackage.ak1.giKS3J6vZuNy;
            case 6:
                return new defpackage.or(defpackage.t80.OcTWLQzke1i2(24.0f, 16.0f, ((defpackage.el1) obj).ZpBGe2uQfcn8()));
            default:
                defpackage.on1 on1Var = (defpackage.on1) obj;
                on1Var.UmgHb6n58gfG = null;
                defpackage.wc1.GcLuU6pT9wO9(on1Var);
                defpackage.n70.maCixPsq4ml2(on1Var);
                defpackage.nq1.KrtOTfE6jiS2(on1Var);
                return java.lang.Boolean.TRUE;
        }
    }
}
