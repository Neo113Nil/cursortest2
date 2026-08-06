package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v1 implements defpackage.a40 {
    public static boolean oh71FJcDz6S2 = true;
    public boolean JhCgjQRTAOCT;
    public final defpackage.t1 WDYagTQQm9ns;
    public final defpackage.u ZpBGe2uQfcn8;
    public defpackage.hu1 fWTAfUmVKrZq;
    public final java.lang.Object giKS3J6vZuNy = new java.lang.Object();

    public v1(defpackage.u uVar) {
        this.ZpBGe2uQfcn8 = uVar;
        defpackage.t1 t1Var = new defpackage.t1();
        this.WDYagTQQm9ns = t1Var;
        if (uVar.isAttachedToWindow()) {
            android.content.Context context = uVar.getContext();
            if (!this.JhCgjQRTAOCT) {
                context.getApplicationContext().registerComponentCallbacks(t1Var);
                this.JhCgjQRTAOCT = true;
            }
        }
        uVar.addOnAttachStateChangeListener(new defpackage.u1(0, this));
    }

    @Override // defpackage.a40
    public final void ZpBGe2uQfcn8(defpackage.b40 b40Var) {
        synchronized (this.giKS3J6vZuNy) {
            if (!b40Var.BHfvd2J71qpO) {
                b40Var.BHfvd2J71qpO = true;
                b40Var.giKS3J6vZuNy();
            }
        }
    }

    public final defpackage.zs fWTAfUmVKrZq(defpackage.u uVar) {
        defpackage.hu1 hu1Var = this.fWTAfUmVKrZq;
        if (hu1Var != null) {
            return hu1Var;
        }
        defpackage.hu1 hu1Var2 = new defpackage.hu1(uVar.getContext());
        hu1Var2.setClipChildren(false);
        hu1Var2.setClipToPadding(false);
        hu1Var2.setTag(com.ice.fishing.wolberta.R.id.hide_graphics_layer_in_inspector_tag, java.lang.Boolean.TRUE);
        uVar.addView(hu1Var2, -1);
        this.fWTAfUmVKrZq = hu1Var2;
        return hu1Var2;
    }

    @Override // defpackage.a40
    public final defpackage.b40 giKS3J6vZuNy() {
        defpackage.d40 k40Var;
        defpackage.d40 d40Var;
        defpackage.b40 b40Var;
        synchronized (this.giKS3J6vZuNy) {
            try {
                defpackage.u uVar = this.ZpBGe2uQfcn8;
                int i = android.os.Build.VERSION.SDK_INT;
                if (i >= 29) {
                    uVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    d40Var = new defpackage.i40();
                } else {
                    if (oh71FJcDz6S2) {
                        try {
                            k40Var = new defpackage.g40(this.ZpBGe2uQfcn8, new defpackage.md(), new defpackage.ld());
                        } catch (java.lang.Throwable unused) {
                            oh71FJcDz6S2 = false;
                            k40Var = new defpackage.k40(fWTAfUmVKrZq(this.ZpBGe2uQfcn8));
                        }
                    } else {
                        k40Var = new defpackage.k40(fWTAfUmVKrZq(this.ZpBGe2uQfcn8));
                    }
                    d40Var = k40Var;
                }
                b40Var = new defpackage.b40(d40Var);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return b40Var;
    }
}
