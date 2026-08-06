package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class gUjdnLbkVAaA implements java.lang.Runnable {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ gUjdnLbkVAaA(defpackage.vx1 vx1Var, android.graphics.Typeface typeface) {
        this.WDYagTQQm9ns = 9;
        this.oh71FJcDz6S2 = typeface;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x02a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02a9, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        android.view.View findFocus;
        java.lang.Boolean bool = null;
        int i2 = 0;
        switch (this.WDYagTQQm9ns) {
            case 0:
                ((defpackage.XntWc4eZSQ8j) this.oh71FJcDz6S2).fWTAfUmVKrZq();
                return;
            case 1:
                defpackage.z zVar = (defpackage.z) this.oh71FJcDz6S2;
                android.os.Trace.beginSection("measureAndLayout");
                try {
                    zVar.P05cfTpS5W5L.maCixPsq4ml2(true);
                    android.os.Trace.endSection();
                    android.os.Trace.beginSection("checkForSemanticsChanges");
                    try {
                        zVar.oh71FJcDz6S2();
                        android.os.Trace.endSection();
                        zVar.xahdJg25P1Bv = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                defpackage.p0 p0Var = (defpackage.p0) this.oh71FJcDz6S2;
                boolean oh71FJcDz6S2 = p0Var.oh71FJcDz6S2();
                defpackage.u uVar = p0Var.WDYagTQQm9ns;
                if (oh71FJcDz6S2) {
                    android.os.Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        uVar.maCixPsq4ml2(true);
                        defpackage.gn0 gn0Var = p0Var.T1fB7bDYiVJQ;
                        int[] iArr = gn0Var.giKS3J6vZuNy;
                        long[] jArr = gn0Var.ZpBGe2uQfcn8;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = i2;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!p0Var.WDYagTQQm9ns().ZpBGe2uQfcn8(i6)) {
                                                i = length;
                                                p0Var.P05cfTpS5W5L.add(new defpackage.pk(i6, p0Var.gUjdnLbkVAaA, defpackage.qk.oh71FJcDz6S2, null));
                                                p0Var.fNwYGHIYeJcR.fWTAfUmVKrZq(defpackage.gs1.ZpBGe2uQfcn8);
                                                j >>= 8;
                                                i5++;
                                                length = i;
                                            }
                                        }
                                        i = length;
                                        j >>= 8;
                                        i5++;
                                        length = i;
                                    }
                                    int i7 = length;
                                    if (i4 == 8) {
                                        length = i7;
                                    }
                                }
                                if (i3 != length) {
                                    i3++;
                                    i2 = 0;
                                }
                            }
                        }
                        android.os.Trace.beginSection("ContentCapture:sendAppearEvents");
                        p0Var.GE9mJIPrb8gP(uVar.getSemanticsOwner().ZpBGe2uQfcn8(), p0Var.XntWc4eZSQ8j);
                        android.os.Trace.endSection();
                        p0Var.fWTAfUmVKrZq(p0Var.WDYagTQQm9ns());
                        p0Var.gUjdnLbkVAaA();
                        p0Var.WmetiUbpKU9I = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                android.view.ActionMode actionMode = ((defpackage.e4) this.oh71FJcDz6S2).P05cfTpS5W5L;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                defpackage.gh.oh71FJcDz6S2((defpackage.gh) this.oh71FJcDz6S2);
                return;
            case 5:
                defpackage.dh dhVar = (defpackage.dh) this.oh71FJcDz6S2;
                java.lang.Runnable runnable = dhVar.oh71FJcDz6S2;
                if (runnable != null) {
                    runnable.run();
                    dhVar.oh71FJcDz6S2 = null;
                    return;
                }
                return;
            case 6:
                defpackage.kq.JhCgjQRTAOCT((defpackage.kq) this.oh71FJcDz6S2);
                return;
            case 7:
                defpackage.f00 f00Var = (defpackage.f00) this.oh71FJcDz6S2;
                synchronized (f00Var.JhCgjQRTAOCT) {
                    try {
                        if (f00Var.P05cfTpS5W5L == null) {
                            return;
                        }
                        try {
                            defpackage.y00 fWTAfUmVKrZq = f00Var.fWTAfUmVKrZq();
                            int i8 = fWTAfUmVKrZq.oh71FJcDz6S2;
                            if (i8 == 2) {
                                synchronized (f00Var.JhCgjQRTAOCT) {
                                }
                            }
                            if (i8 != 0) {
                                throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                int i9 = defpackage.qo1.ZpBGe2uQfcn8;
                                android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                defpackage.hu huVar = f00Var.fWTAfUmVKrZq;
                                android.content.Context context = f00Var.ZpBGe2uQfcn8;
                                huVar.getClass();
                                defpackage.y00[] y00VarArr = {fWTAfUmVKrZq};
                                defpackage.q70 q70Var = defpackage.rq1.ZpBGe2uQfcn8;
                                defpackage.v70.Ns0WNyEWdPsk("TypefaceCompat.createFromFontInfo");
                                try {
                                    android.graphics.Typeface WmetiUbpKU9I = defpackage.rq1.ZpBGe2uQfcn8.WmetiUbpKU9I(context, y00VarArr);
                                    android.os.Trace.endSection();
                                    java.nio.MappedByteBuffer UmgHb6n58gfG = defpackage.v70.UmgHb6n58gfG(f00Var.ZpBGe2uQfcn8, fWTAfUmVKrZq.ZpBGe2uQfcn8);
                                    if (UmgHb6n58gfG == null || WmetiUbpKU9I == null) {
                                        throw new java.lang.RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        defpackage.s81 s81Var = new defpackage.s81(WmetiUbpKU9I, defpackage.n70.OcTWLQzke1i2(UmgHb6n58gfG));
                                        android.os.Trace.endSection();
                                        synchronized (f00Var.JhCgjQRTAOCT) {
                                            try {
                                                defpackage.ma0 ma0Var = f00Var.P05cfTpS5W5L;
                                                if (ma0Var != null) {
                                                    ma0Var.blKFvluuDQOf(s81Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        f00Var.giKS3J6vZuNy();
                                        return;
                                    } finally {
                                        int i10 = defpackage.qo1.ZpBGe2uQfcn8;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (java.lang.Throwable th) {
                            synchronized (f00Var.JhCgjQRTAOCT) {
                                try {
                                    defpackage.ma0 ma0Var2 = f00Var.P05cfTpS5W5L;
                                    if (ma0Var2 != null) {
                                        ma0Var2.OcTWLQzke1i2(th);
                                    }
                                    f00Var.giKS3J6vZuNy();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                defpackage.f21 f21Var = (defpackage.f21) this.oh71FJcDz6S2;
                defpackage.zg0 zg0Var = f21Var.GE9mJIPrb8gP;
                if (f21Var.oh71FJcDz6S2 == 0) {
                    f21Var.QiMR8OkAhezm = true;
                    zg0Var.JhCgjQRTAOCT(defpackage.og0.ON_PAUSE);
                }
                if (f21Var.WDYagTQQm9ns == 0 && f21Var.QiMR8OkAhezm) {
                    zg0Var.JhCgjQRTAOCT(defpackage.og0.ON_STOP);
                    f21Var.P05cfTpS5W5L = true;
                    return;
                }
                return;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                throw null;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                defpackage.z51.setRippleState$lambda$1((defpackage.z51) this.oh71FJcDz6S2);
                return;
            case 11:
                android.view.View view = (android.view.View) this.oh71FJcDz6S2;
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                defpackage.um1 um1Var = (defpackage.um1) this.oh71FJcDz6S2;
                defpackage.a7 a7Var = um1Var.giKS3J6vZuNy;
                um1Var.gUjdnLbkVAaA = null;
                defpackage.ho0 ho0Var = um1Var.h3m55N1URyyK;
                android.view.View view2 = um1Var.ZpBGe2uQfcn8;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    ho0Var.QiMR8OkAhezm();
                    return;
                }
                java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
                int i11 = ho0Var.QiMR8OkAhezm;
                java.lang.Boolean bool2 = null;
                for (int i12 = 0; i12 < i11; i12++) {
                    defpackage.tm1 tm1Var = (defpackage.tm1) objArr[i12];
                    int ordinal = tm1Var.ordinal();
                    if (ordinal == 0) {
                        bool = java.lang.Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = java.lang.Boolean.FALSE;
                    } else if (ordinal != 2 && ordinal != 3) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return;
                    } else {
                        if (!defpackage.ma0.QiMR8OkAhezm(bool, java.lang.Boolean.FALSE)) {
                            bool2 = java.lang.Boolean.valueOf(tm1Var == defpackage.tm1.QiMR8OkAhezm);
                        }
                    }
                    bool2 = bool;
                }
                ho0Var.QiMR8OkAhezm();
                if (defpackage.ma0.QiMR8OkAhezm(bool, java.lang.Boolean.TRUE)) {
                    ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var.fWTAfUmVKrZq).getValue()).restartInput((android.view.View) a7Var.giKS3J6vZuNy);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((defpackage.k0) ((defpackage.k0) a7Var.JhCgjQRTAOCT).oh71FJcDz6S2).dG7RjM6DqYVL();
                    } else {
                        ((defpackage.k0) ((defpackage.k0) a7Var.JhCgjQRTAOCT).oh71FJcDz6S2).h3m55N1URyyK();
                    }
                }
                if (defpackage.ma0.QiMR8OkAhezm(bool, java.lang.Boolean.FALSE)) {
                    ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var.fWTAfUmVKrZq).getValue()).restartInput((android.view.View) a7Var.giKS3J6vZuNy);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gUjdnLbkVAaA(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }
}
