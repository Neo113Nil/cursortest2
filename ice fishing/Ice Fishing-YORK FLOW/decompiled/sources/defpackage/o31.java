package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o31 implements android.view.inputmethod.InputConnection {
    public defpackage.nm1 JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public final defpackage.ci1 ZpBGe2uQfcn8;
    public int fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;
    public boolean oh71FJcDz6S2;
    public final java.util.ArrayList QiMR8OkAhezm = new java.util.ArrayList();
    public boolean P05cfTpS5W5L = true;

    public o31(defpackage.nm1 nm1Var, defpackage.ci1 ci1Var, boolean z) {
        this.ZpBGe2uQfcn8 = ci1Var;
        this.giKS3J6vZuNy = z;
        this.JhCgjQRTAOCT = nm1Var;
    }

    public final void ZpBGe2uQfcn8(defpackage.bu buVar) {
        this.fWTAfUmVKrZq++;
        try {
            this.QiMR8OkAhezm.add(buVar);
        } finally {
            giKS3J6vZuNy();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        this.fWTAfUmVKrZq++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.QiMR8OkAhezm.clear();
        this.fWTAfUmVKrZq = 0;
        this.P05cfTpS5W5L = false;
        java.util.ArrayList arrayList = ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).e6mdH7fiFuta;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (defpackage.ma0.QiMR8OkAhezm(((java.lang.ref.WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z = this.P05cfTpS5W5L;
        return z ? this.giKS3J6vZuNy : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.og(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.ep(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.fp(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return giKS3J6vZuNy();
    }

    public final void fWTAfUmVKrZq(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.dx());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        defpackage.nm1 nm1Var = this.JhCgjQRTAOCT;
        return android.text.TextUtils.getCapsMode(nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2, defpackage.in1.oh71FJcDz6S2(nm1Var.giKS3J6vZuNy), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.oh71FJcDz6S2 = z;
        if (z) {
            this.WDYagTQQm9ns = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return defpackage.t80.Wc0TdmRSwbbi(this.JhCgjQRTAOCT);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (defpackage.in1.fWTAfUmVKrZq(this.JhCgjQRTAOCT.giKS3J6vZuNy)) {
            return null;
        }
        return defpackage.v70.maCixPsq4ml2(this.JhCgjQRTAOCT).oh71FJcDz6S2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        return defpackage.v70.VFeft99leXEK(this.JhCgjQRTAOCT, i).oh71FJcDz6S2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        return defpackage.v70.oCu53ZX2v4Ju(this.JhCgjQRTAOCT, i).oh71FJcDz6S2;
    }

    public final boolean giKS3J6vZuNy() {
        int i = this.fWTAfUmVKrZq - 1;
        this.fWTAfUmVKrZq = i;
        if (i == 0) {
            java.util.ArrayList arrayList = this.QiMR8OkAhezm;
            if (!arrayList.isEmpty()) {
                ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).WDYagTQQm9ns.P05cfTpS5W5L(new java.util.ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.fWTAfUmVKrZq > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            z = false;
            switch (i) {
                case android.R.id.selectAll:
                    ZpBGe2uQfcn8(new defpackage.vc1(0, this.JhCgjQRTAOCT.ZpBGe2uQfcn8.oh71FJcDz6S2.length()));
                    break;
                case android.R.id.cut:
                    fWTAfUmVKrZq(277);
                    return false;
                case android.R.id.copy:
                    fWTAfUmVKrZq(278);
                    return false;
                case android.R.id.paste:
                    fWTAfUmVKrZq(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        android.util.Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).oh71FJcDz6S2.P05cfTpS5W5L(new defpackage.n60(i2));
            }
            i2 = 1;
            ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).oh71FJcDz6S2.P05cfTpS5W5L(new defpackage.n60(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.cn cnVar;
        boolean z4 = this.P05cfTpS5W5L;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                cnVar = ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).fNwYGHIYeJcR;
                synchronized (cnVar.fWTAfUmVKrZq) {
                    try {
                        cnVar.oh71FJcDz6S2 = z2;
                        cnVar.QiMR8OkAhezm = z3;
                        cnVar.P05cfTpS5W5L = z5;
                        cnVar.e6mdH7fiFuta = z;
                        if (z6) {
                            cnVar.WDYagTQQm9ns = true;
                            if (cnVar.GE9mJIPrb8gP != null) {
                                cnVar.ZpBGe2uQfcn8();
                            }
                        }
                        cnVar.JhCgjQRTAOCT = z7;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        cnVar = ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).fNwYGHIYeJcR;
        synchronized (cnVar.fWTAfUmVKrZq) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        ((android.view.inputmethod.BaseInputConnection) ((defpackage.um1) this.ZpBGe2uQfcn8.oh71FJcDz6S2).GE9mJIPrb8gP.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.tc1(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.P05cfTpS5W5L;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.uc1(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.P05cfTpS5W5L;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.vc1(i, i2));
        return true;
    }
}
