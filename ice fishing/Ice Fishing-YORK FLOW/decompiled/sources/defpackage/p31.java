package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p31 implements android.view.inputmethod.InputConnection {
    public final defpackage.em1 JhCgjQRTAOCT;
    public int P05cfTpS5W5L;
    public defpackage.nm1 QiMR8OkAhezm;
    public final defpackage.cu1 WDYagTQQm9ns;
    public final defpackage.k0 ZpBGe2uQfcn8;
    public boolean e6mdH7fiFuta;
    public final defpackage.hg0 fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;
    public int oh71FJcDz6S2;
    public final java.util.ArrayList GE9mJIPrb8gP = new java.util.ArrayList();
    public boolean Ns0WNyEWdPsk = true;

    public p31(defpackage.nm1 nm1Var, defpackage.k0 k0Var, boolean z, defpackage.hg0 hg0Var, defpackage.em1 em1Var, defpackage.cu1 cu1Var) {
        this.ZpBGe2uQfcn8 = k0Var;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = hg0Var;
        this.JhCgjQRTAOCT = em1Var;
        this.WDYagTQQm9ns = cu1Var;
        this.QiMR8OkAhezm = nm1Var;
    }

    public final void ZpBGe2uQfcn8(defpackage.bu buVar) {
        this.oh71FJcDz6S2++;
        try {
            this.GE9mJIPrb8gP.add(buVar);
        } finally {
            giKS3J6vZuNy();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.Ns0WNyEWdPsk;
        if (!z) {
            return z;
        }
        this.oh71FJcDz6S2++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.GE9mJIPrb8gP.clear();
        this.oh71FJcDz6S2 = 0;
        this.Ns0WNyEWdPsk = false;
        java.util.ArrayList arrayList = ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).GE9mJIPrb8gP;
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
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z = this.Ns0WNyEWdPsk;
        return z ? this.giKS3J6vZuNy : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.og(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.Ns0WNyEWdPsk;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.ep(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.Ns0WNyEWdPsk;
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
        boolean z = this.Ns0WNyEWdPsk;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.dx());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        defpackage.nm1 nm1Var = this.QiMR8OkAhezm;
        return android.text.TextUtils.getCapsMode(nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2, defpackage.in1.oh71FJcDz6S2(nm1Var.giKS3J6vZuNy), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.e6mdH7fiFuta = z;
        if (z) {
            this.P05cfTpS5W5L = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return defpackage.wc1.GE9mJIPrb8gP(this.QiMR8OkAhezm);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (defpackage.in1.fWTAfUmVKrZq(this.QiMR8OkAhezm.giKS3J6vZuNy)) {
            return null;
        }
        return defpackage.v70.maCixPsq4ml2(this.QiMR8OkAhezm).oh71FJcDz6S2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        return defpackage.v70.VFeft99leXEK(this.QiMR8OkAhezm, i).oh71FJcDz6S2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        return defpackage.v70.oCu53ZX2v4Ju(this.QiMR8OkAhezm, i).oh71FJcDz6S2;
    }

    public final boolean giKS3J6vZuNy() {
        int i = this.oh71FJcDz6S2 - 1;
        this.oh71FJcDz6S2 = i;
        if (i == 0) {
            java.util.ArrayList arrayList = this.GE9mJIPrb8gP;
            if (!arrayList.isEmpty()) {
                ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).fWTAfUmVKrZq.P05cfTpS5W5L(new java.util.ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.oh71FJcDz6S2 > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            z = false;
            switch (i) {
                case android.R.id.selectAll:
                    ZpBGe2uQfcn8(new defpackage.vc1(0, this.QiMR8OkAhezm.ZpBGe2uQfcn8.oh71FJcDz6S2.length()));
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
        boolean z = this.Ns0WNyEWdPsk;
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
                ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).JhCgjQRTAOCT.P05cfTpS5W5L(new defpackage.n60(i2));
            }
            i2 = 1;
            ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).JhCgjQRTAOCT.P05cfTpS5W5L(new defpackage.n60(i2));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, final java.util.function.IntConsumer intConsumer) {
        defpackage.l6 l6Var;
        android.graphics.PointF startPoint;
        android.graphics.PointF endPoint;
        long j;
        int i;
        int i2;
        int i3;
        java.lang.String sb;
        android.graphics.PointF insertionPoint;
        defpackage.cn1 JhCgjQRTAOCT;
        java.lang.String textToInsert;
        android.graphics.PointF joinOrSplitPoint;
        defpackage.cn1 JhCgjQRTAOCT2;
        int granularity;
        android.graphics.RectF deletionStartArea;
        android.graphics.RectF deletionEndArea;
        android.graphics.RectF selectionStartArea;
        android.graphics.RectF selectionEndArea;
        int granularity2;
        int granularity3;
        android.graphics.RectF deletionArea;
        android.graphics.RectF selectionArea;
        int granularity4;
        defpackage.an1 an1Var;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(24, this);
            defpackage.hg0 hg0Var = this.fWTAfUmVKrZq;
            final int i4 = 3;
            if (hg0Var != null && (l6Var = hg0Var.GE9mJIPrb8gP) != null) {
                defpackage.cn1 JhCgjQRTAOCT3 = hg0Var.JhCgjQRTAOCT();
                if (l6Var.equals((JhCgjQRTAOCT3 == null || (an1Var = JhCgjQRTAOCT3.ZpBGe2uQfcn8.ZpBGe2uQfcn8) == null) ? null : an1Var.ZpBGe2uQfcn8)) {
                    boolean s0TASMVLSWD5 = defpackage.y1.s0TASMVLSWD5(handwritingGesture);
                    defpackage.em1 em1Var = this.JhCgjQRTAOCT;
                    if (s0TASMVLSWD5) {
                        android.view.inputmethod.SelectGesture WmetiUbpKU9I = defpackage.u40.WmetiUbpKU9I(handwritingGesture);
                        selectionArea = WmetiUbpKU9I.getSelectionArea();
                        defpackage.s31 Jkfc0NcwyPL8 = defpackage.w60.Jkfc0NcwyPL8(selectionArea);
                        granularity4 = WmetiUbpKU9I.getGranularity();
                        long qjMheFZ0l9kA = defpackage.jr0.qjMheFZ0l9kA(hg0Var, Jkfc0NcwyPL8, granularity4 == 1 ? 1 : 0);
                        if (defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA)) {
                            i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(WmetiUbpKU9I), fnwyghiyejcr);
                        } else {
                            fnwyghiyejcr.P05cfTpS5W5L(new defpackage.vc1((int) (qjMheFZ0l9kA >> 32), (int) (qjMheFZ0l9kA & 4294967295L)));
                            if (em1Var != null) {
                                em1Var.P05cfTpS5W5L(true);
                            }
                            i4 = 1;
                        }
                    } else if (defpackage.u40.UmgHb6n58gfG(handwritingGesture)) {
                        android.view.inputmethod.DeleteGesture h3m55N1URyyK = defpackage.u40.h3m55N1URyyK(handwritingGesture);
                        granularity3 = h3m55N1URyyK.getGranularity();
                        int i5 = granularity3 != 1 ? 0 : 1;
                        deletionArea = h3m55N1URyyK.getDeletionArea();
                        long qjMheFZ0l9kA2 = defpackage.jr0.qjMheFZ0l9kA(hg0Var, defpackage.w60.Jkfc0NcwyPL8(deletionArea), i5);
                        if (defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA2)) {
                            i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(h3m55N1URyyK), fnwyghiyejcr);
                        } else {
                            defpackage.ok0.Fu5WBEia9jBo(qjMheFZ0l9kA2, l6Var, i5 == 1, fnwyghiyejcr);
                            i4 = 1;
                        }
                    } else if (defpackage.u40.qjMheFZ0l9kA(handwritingGesture)) {
                        android.view.inputmethod.SelectRangeGesture s0TASMVLSWD52 = defpackage.u40.s0TASMVLSWD5(handwritingGesture);
                        selectionStartArea = s0TASMVLSWD52.getSelectionStartArea();
                        defpackage.s31 Jkfc0NcwyPL82 = defpackage.w60.Jkfc0NcwyPL8(selectionStartArea);
                        selectionEndArea = s0TASMVLSWD52.getSelectionEndArea();
                        defpackage.s31 Jkfc0NcwyPL83 = defpackage.w60.Jkfc0NcwyPL8(selectionEndArea);
                        granularity2 = s0TASMVLSWD52.getGranularity();
                        long e6mdH7fiFuta = defpackage.jr0.e6mdH7fiFuta(hg0Var, Jkfc0NcwyPL82, Jkfc0NcwyPL83, granularity2 == 1 ? 1 : 0);
                        if (defpackage.in1.fWTAfUmVKrZq(e6mdH7fiFuta)) {
                            i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(s0TASMVLSWD52), fnwyghiyejcr);
                        } else {
                            fnwyghiyejcr.P05cfTpS5W5L(new defpackage.vc1((int) (e6mdH7fiFuta >> 32), (int) (e6mdH7fiFuta & 4294967295L)));
                            if (em1Var != null) {
                                em1Var.P05cfTpS5W5L(true);
                            }
                            i4 = 1;
                        }
                    } else if (defpackage.y1.VFeft99leXEK(handwritingGesture)) {
                        android.view.inputmethod.DeleteRangeGesture e6mdH7fiFuta2 = defpackage.y1.e6mdH7fiFuta(handwritingGesture);
                        granularity = e6mdH7fiFuta2.getGranularity();
                        int i6 = granularity != 1 ? 0 : 1;
                        deletionStartArea = e6mdH7fiFuta2.getDeletionStartArea();
                        defpackage.s31 Jkfc0NcwyPL84 = defpackage.w60.Jkfc0NcwyPL8(deletionStartArea);
                        deletionEndArea = e6mdH7fiFuta2.getDeletionEndArea();
                        long e6mdH7fiFuta3 = defpackage.jr0.e6mdH7fiFuta(hg0Var, Jkfc0NcwyPL84, defpackage.w60.Jkfc0NcwyPL8(deletionEndArea), i6);
                        if (defpackage.in1.fWTAfUmVKrZq(e6mdH7fiFuta3)) {
                            i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(e6mdH7fiFuta2), fnwyghiyejcr);
                        } else {
                            defpackage.ok0.Fu5WBEia9jBo(e6mdH7fiFuta3, l6Var, i6 == 1, fnwyghiyejcr);
                            i4 = 1;
                        }
                    } else {
                        boolean dG7RjM6DqYVL = defpackage.y1.dG7RjM6DqYVL(handwritingGesture);
                        defpackage.cu1 cu1Var = this.WDYagTQQm9ns;
                        if (dG7RjM6DqYVL) {
                            android.view.inputmethod.JoinOrSplitGesture Ns0WNyEWdPsk = defpackage.y1.Ns0WNyEWdPsk(handwritingGesture);
                            if (cu1Var == null) {
                                i4 = defpackage.ok0.blKFvluuDQOf(defpackage.u40.gUjdnLbkVAaA(Ns0WNyEWdPsk), fnwyghiyejcr);
                            } else {
                                joinOrSplitPoint = Ns0WNyEWdPsk.getJoinOrSplitPoint();
                                int P05cfTpS5W5L = defpackage.jr0.P05cfTpS5W5L(hg0Var, defpackage.jr0.Ns0WNyEWdPsk(joinOrSplitPoint), cu1Var);
                                if (P05cfTpS5W5L == -1 || ((JhCgjQRTAOCT2 = hg0Var.JhCgjQRTAOCT()) != null && defpackage.jr0.GE9mJIPrb8gP(JhCgjQRTAOCT2.ZpBGe2uQfcn8, P05cfTpS5W5L))) {
                                    i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(Ns0WNyEWdPsk), fnwyghiyejcr);
                                } else {
                                    int i7 = P05cfTpS5W5L;
                                    while (i7 > 0) {
                                        int codePointBefore = java.lang.Character.codePointBefore(l6Var, i7);
                                        if (!defpackage.jr0.KrtOTfE6jiS2(codePointBefore)) {
                                            break;
                                        } else {
                                            i7 -= java.lang.Character.charCount(codePointBefore);
                                        }
                                    }
                                    while (P05cfTpS5W5L < l6Var.oh71FJcDz6S2.length()) {
                                        int codePointAt = java.lang.Character.codePointAt(l6Var, P05cfTpS5W5L);
                                        if (!defpackage.jr0.KrtOTfE6jiS2(codePointAt)) {
                                            break;
                                        } else {
                                            P05cfTpS5W5L += java.lang.Character.charCount(codePointAt);
                                        }
                                    }
                                    long JhCgjQRTAOCT4 = defpackage.j80.JhCgjQRTAOCT(i7, P05cfTpS5W5L);
                                    if (defpackage.in1.fWTAfUmVKrZq(JhCgjQRTAOCT4)) {
                                        int i8 = (int) (JhCgjQRTAOCT4 >> 32);
                                        fnwyghiyejcr.P05cfTpS5W5L(new defpackage.v40(new defpackage.bu[]{new defpackage.vc1(i8, i8), new defpackage.og(" ", 1)}));
                                    } else {
                                        defpackage.ok0.Fu5WBEia9jBo(JhCgjQRTAOCT4, l6Var, false, fnwyghiyejcr);
                                    }
                                    i4 = 1;
                                }
                            }
                        } else if (defpackage.u40.w7APNrr0aGRc(handwritingGesture)) {
                            android.view.inputmethod.InsertGesture T1fB7bDYiVJQ = defpackage.u40.T1fB7bDYiVJQ(handwritingGesture);
                            if (cu1Var == null) {
                                i4 = defpackage.ok0.blKFvluuDQOf(defpackage.u40.gUjdnLbkVAaA(T1fB7bDYiVJQ), fnwyghiyejcr);
                            } else {
                                insertionPoint = T1fB7bDYiVJQ.getInsertionPoint();
                                int P05cfTpS5W5L2 = defpackage.jr0.P05cfTpS5W5L(hg0Var, defpackage.jr0.Ns0WNyEWdPsk(insertionPoint), cu1Var);
                                if (P05cfTpS5W5L2 == -1 || ((JhCgjQRTAOCT = hg0Var.JhCgjQRTAOCT()) != null && defpackage.jr0.GE9mJIPrb8gP(JhCgjQRTAOCT.ZpBGe2uQfcn8, P05cfTpS5W5L2))) {
                                    i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(T1fB7bDYiVJQ), fnwyghiyejcr);
                                } else {
                                    textToInsert = T1fB7bDYiVJQ.getTextToInsert();
                                    fnwyghiyejcr.P05cfTpS5W5L(new defpackage.v40(new defpackage.bu[]{new defpackage.vc1(P05cfTpS5W5L2, P05cfTpS5W5L2), new defpackage.og(textToInsert, 1)}));
                                    i4 = 1;
                                }
                            }
                        } else if (defpackage.u40.OcTWLQzke1i2(handwritingGesture)) {
                            android.view.inputmethod.RemoveSpaceGesture XntWc4eZSQ8j = defpackage.u40.XntWc4eZSQ8j(handwritingGesture);
                            defpackage.cn1 JhCgjQRTAOCT5 = hg0Var.JhCgjQRTAOCT();
                            defpackage.bn1 bn1Var = JhCgjQRTAOCT5 != null ? JhCgjQRTAOCT5.ZpBGe2uQfcn8 : null;
                            startPoint = XntWc4eZSQ8j.getStartPoint();
                            long Ns0WNyEWdPsk2 = defpackage.jr0.Ns0WNyEWdPsk(startPoint);
                            endPoint = XntWc4eZSQ8j.getEndPoint();
                            long Ns0WNyEWdPsk3 = defpackage.jr0.Ns0WNyEWdPsk(endPoint);
                            defpackage.rc0 fWTAfUmVKrZq = hg0Var.fWTAfUmVKrZq();
                            if (bn1Var != null) {
                                defpackage.wm0 wm0Var = bn1Var.giKS3J6vZuNy;
                                if (fWTAfUmVKrZq != null) {
                                    long maCixPsq4ml2 = fWTAfUmVKrZq.maCixPsq4ml2(Ns0WNyEWdPsk2);
                                    long maCixPsq4ml22 = fWTAfUmVKrZq.maCixPsq4ml2(Ns0WNyEWdPsk3);
                                    int OcTWLQzke1i2 = defpackage.jr0.OcTWLQzke1i2(wm0Var, maCixPsq4ml2, cu1Var);
                                    int OcTWLQzke1i22 = defpackage.jr0.OcTWLQzke1i2(wm0Var, maCixPsq4ml22, cu1Var);
                                    if (OcTWLQzke1i2 != -1) {
                                        if (OcTWLQzke1i22 != -1) {
                                            OcTWLQzke1i2 = java.lang.Math.min(OcTWLQzke1i2, OcTWLQzke1i22);
                                        }
                                        OcTWLQzke1i22 = OcTWLQzke1i2;
                                    } else if (OcTWLQzke1i22 == -1) {
                                        j = defpackage.in1.giKS3J6vZuNy;
                                        if (defpackage.in1.fWTAfUmVKrZq(j)) {
                                            i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(XntWc4eZSQ8j), fnwyghiyejcr);
                                        } else {
                                            java.lang.String str = l6Var.subSequence(defpackage.in1.oh71FJcDz6S2(j), defpackage.in1.WDYagTQQm9ns(j)).oh71FJcDz6S2;
                                            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s+");
                                            compile.getClass();
                                            str.getClass();
                                            java.util.regex.Matcher matcher = compile.matcher(str);
                                            matcher.getClass();
                                            defpackage.a7 e6mdH7fiFuta4 = defpackage.q70.e6mdH7fiFuta(matcher, 0, str);
                                            if (e6mdH7fiFuta4 == null) {
                                                sb = str.toString();
                                                i2 = -1;
                                                i = -1;
                                            } else {
                                                int length = str.length();
                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length);
                                                int i9 = 0;
                                                i = -1;
                                                while (true) {
                                                    sb2.append((java.lang.CharSequence) str, i9, e6mdH7fiFuta4.GE9mJIPrb8gP().WDYagTQQm9ns);
                                                    if (i == -1) {
                                                        i = e6mdH7fiFuta4.GE9mJIPrb8gP().WDYagTQQm9ns;
                                                    }
                                                    i2 = e6mdH7fiFuta4.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                                    sb2.append((java.lang.CharSequence) "");
                                                    i3 = e6mdH7fiFuta4.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                                    e6mdH7fiFuta4 = e6mdH7fiFuta4.T1fB7bDYiVJQ();
                                                    if (i3 >= length || e6mdH7fiFuta4 == null) {
                                                        break;
                                                    } else {
                                                        i9 = i3;
                                                    }
                                                }
                                                if (i3 < length) {
                                                    sb2.append((java.lang.CharSequence) str, i3, length);
                                                }
                                                sb = sb2.toString();
                                            }
                                            if (i == -1 || i2 == -1) {
                                                i4 = defpackage.ok0.blKFvluuDQOf(defpackage.y1.GE9mJIPrb8gP(XntWc4eZSQ8j), fnwyghiyejcr);
                                            } else {
                                                int i10 = (int) (j >> 32);
                                                i4 = 1;
                                                fnwyghiyejcr.P05cfTpS5W5L(new defpackage.v40(new defpackage.bu[]{new defpackage.vc1(i10 + i, i10 + i2), new defpackage.og(sb.substring(i, sb.length() - (defpackage.in1.JhCgjQRTAOCT(j) - i2)), 1)}));
                                            }
                                        }
                                    }
                                    float giKS3J6vZuNy = (wm0Var.giKS3J6vZuNy(OcTWLQzke1i22) + wm0Var.oh71FJcDz6S2(OcTWLQzke1i22)) / 2.0f;
                                    int i11 = (int) (maCixPsq4ml2 >> 32);
                                    int i12 = (int) (maCixPsq4ml22 >> 32);
                                    j = wm0Var.P05cfTpS5W5L(new defpackage.s31(java.lang.Math.min(java.lang.Float.intBitsToFloat(i11), java.lang.Float.intBitsToFloat(i12)), giKS3J6vZuNy - 0.1f, java.lang.Math.max(java.lang.Float.intBitsToFloat(i11), java.lang.Float.intBitsToFloat(i12)), giKS3J6vZuNy + 0.1f), 0, defpackage.pa1.T1fB7bDYiVJQ);
                                    if (defpackage.in1.fWTAfUmVKrZq(j)) {
                                    }
                                }
                            }
                            j = defpackage.in1.giKS3J6vZuNy;
                            if (defpackage.in1.fWTAfUmVKrZq(j)) {
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new java.lang.Runnable() { // from class: u6
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i4);
                    }
                });
            } else {
                intConsumer.accept(i4);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        defpackage.hg0 hg0Var;
        defpackage.l6 l6Var;
        android.graphics.RectF deletionStartArea;
        android.graphics.RectF deletionEndArea;
        int granularity;
        android.graphics.RectF selectionStartArea;
        android.graphics.RectF selectionEndArea;
        int granularity2;
        android.graphics.RectF deletionArea;
        int granularity3;
        android.graphics.RectF selectionArea;
        int granularity4;
        defpackage.an1 an1Var;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (hg0Var = this.fWTAfUmVKrZq) != null && (l6Var = hg0Var.GE9mJIPrb8gP) != null) {
            defpackage.cn1 JhCgjQRTAOCT = hg0Var.JhCgjQRTAOCT();
            if (l6Var.equals((JhCgjQRTAOCT == null || (an1Var = JhCgjQRTAOCT.ZpBGe2uQfcn8.ZpBGe2uQfcn8) == null) ? null : an1Var.ZpBGe2uQfcn8)) {
                boolean s0TASMVLSWD5 = defpackage.y1.s0TASMVLSWD5(previewableHandwritingGesture);
                int i = 1;
                defpackage.q40 q40Var = defpackage.q40.WDYagTQQm9ns;
                defpackage.em1 em1Var = this.JhCgjQRTAOCT;
                if (s0TASMVLSWD5) {
                    android.view.inputmethod.SelectGesture WmetiUbpKU9I = defpackage.u40.WmetiUbpKU9I(previewableHandwritingGesture);
                    if (em1Var != null) {
                        selectionArea = WmetiUbpKU9I.getSelectionArea();
                        defpackage.s31 Jkfc0NcwyPL8 = defpackage.w60.Jkfc0NcwyPL8(selectionArea);
                        granularity4 = WmetiUbpKU9I.getGranularity();
                        long qjMheFZ0l9kA = defpackage.jr0.qjMheFZ0l9kA(hg0Var, Jkfc0NcwyPL8, granularity4 != 1 ? 0 : 1);
                        defpackage.hg0 hg0Var2 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var2 != null) {
                            hg0Var2.oh71FJcDz6S2(qjMheFZ0l9kA);
                        }
                        defpackage.hg0 hg0Var3 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var3 != null) {
                            hg0Var3.WDYagTQQm9ns(defpackage.in1.giKS3J6vZuNy);
                        }
                        if (!defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA)) {
                            em1Var.ZVVdXbWmyCSK(false);
                            em1Var.WmetiUbpKU9I(q40Var);
                        }
                    }
                } else if (defpackage.u40.UmgHb6n58gfG(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteGesture h3m55N1URyyK = defpackage.u40.h3m55N1URyyK(previewableHandwritingGesture);
                    if (em1Var != null) {
                        deletionArea = h3m55N1URyyK.getDeletionArea();
                        defpackage.s31 Jkfc0NcwyPL82 = defpackage.w60.Jkfc0NcwyPL8(deletionArea);
                        granularity3 = h3m55N1URyyK.getGranularity();
                        long qjMheFZ0l9kA2 = defpackage.jr0.qjMheFZ0l9kA(hg0Var, Jkfc0NcwyPL82, granularity3 != 1 ? 0 : 1);
                        defpackage.hg0 hg0Var4 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var4 != null) {
                            hg0Var4.WDYagTQQm9ns(qjMheFZ0l9kA2);
                        }
                        defpackage.hg0 hg0Var5 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var5 != null) {
                            hg0Var5.oh71FJcDz6S2(defpackage.in1.giKS3J6vZuNy);
                        }
                        if (!defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA2)) {
                            em1Var.ZVVdXbWmyCSK(false);
                            em1Var.WmetiUbpKU9I(q40Var);
                        }
                    }
                } else if (defpackage.u40.qjMheFZ0l9kA(previewableHandwritingGesture)) {
                    android.view.inputmethod.SelectRangeGesture s0TASMVLSWD52 = defpackage.u40.s0TASMVLSWD5(previewableHandwritingGesture);
                    if (em1Var != null) {
                        selectionStartArea = s0TASMVLSWD52.getSelectionStartArea();
                        defpackage.s31 Jkfc0NcwyPL83 = defpackage.w60.Jkfc0NcwyPL8(selectionStartArea);
                        selectionEndArea = s0TASMVLSWD52.getSelectionEndArea();
                        defpackage.s31 Jkfc0NcwyPL84 = defpackage.w60.Jkfc0NcwyPL8(selectionEndArea);
                        granularity2 = s0TASMVLSWD52.getGranularity();
                        long e6mdH7fiFuta = defpackage.jr0.e6mdH7fiFuta(hg0Var, Jkfc0NcwyPL83, Jkfc0NcwyPL84, granularity2 != 1 ? 0 : 1);
                        defpackage.hg0 hg0Var6 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var6 != null) {
                            hg0Var6.oh71FJcDz6S2(e6mdH7fiFuta);
                        }
                        defpackage.hg0 hg0Var7 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var7 != null) {
                            hg0Var7.WDYagTQQm9ns(defpackage.in1.giKS3J6vZuNy);
                        }
                        if (!defpackage.in1.fWTAfUmVKrZq(e6mdH7fiFuta)) {
                            em1Var.ZVVdXbWmyCSK(false);
                            em1Var.WmetiUbpKU9I(q40Var);
                        }
                    }
                } else if (defpackage.y1.VFeft99leXEK(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteRangeGesture e6mdH7fiFuta2 = defpackage.y1.e6mdH7fiFuta(previewableHandwritingGesture);
                    if (em1Var != null) {
                        deletionStartArea = e6mdH7fiFuta2.getDeletionStartArea();
                        defpackage.s31 Jkfc0NcwyPL85 = defpackage.w60.Jkfc0NcwyPL8(deletionStartArea);
                        deletionEndArea = e6mdH7fiFuta2.getDeletionEndArea();
                        defpackage.s31 Jkfc0NcwyPL86 = defpackage.w60.Jkfc0NcwyPL8(deletionEndArea);
                        granularity = e6mdH7fiFuta2.getGranularity();
                        long e6mdH7fiFuta3 = defpackage.jr0.e6mdH7fiFuta(hg0Var, Jkfc0NcwyPL85, Jkfc0NcwyPL86, granularity != 1 ? 0 : 1);
                        defpackage.hg0 hg0Var8 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var8 != null) {
                            hg0Var8.WDYagTQQm9ns(e6mdH7fiFuta3);
                        }
                        defpackage.hg0 hg0Var9 = em1Var.JhCgjQRTAOCT;
                        if (hg0Var9 != null) {
                            hg0Var9.oh71FJcDz6S2(defpackage.in1.giKS3J6vZuNy);
                        }
                        if (!defpackage.in1.fWTAfUmVKrZq(e6mdH7fiFuta3)) {
                            em1Var.ZVVdXbWmyCSK(false);
                            em1Var.WmetiUbpKU9I(q40Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new defpackage.ri(i, em1Var));
                }
                return true;
            }
        }
        return false;
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
        defpackage.dg0 dg0Var;
        boolean z4 = this.Ns0WNyEWdPsk;
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
                dg0Var = ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).h3m55N1URyyK;
                synchronized (dg0Var.fWTAfUmVKrZq) {
                    try {
                        dg0Var.oh71FJcDz6S2 = z2;
                        dg0Var.QiMR8OkAhezm = z3;
                        dg0Var.P05cfTpS5W5L = z5;
                        dg0Var.e6mdH7fiFuta = z;
                        if (z6) {
                            dg0Var.WDYagTQQm9ns = true;
                            if (dg0Var.GE9mJIPrb8gP != null) {
                                dg0Var.ZpBGe2uQfcn8();
                            }
                        }
                        dg0Var.JhCgjQRTAOCT = z7;
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
        dg0Var = ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).h3m55N1URyyK;
        synchronized (dg0Var.fWTAfUmVKrZq) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.Ns0WNyEWdPsk;
        if (!z) {
            return z;
        }
        ((android.view.inputmethod.BaseInputConnection) ((defpackage.ig0) this.ZpBGe2uQfcn8.oh71FJcDz6S2).Ns0WNyEWdPsk.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.tc1(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.Ns0WNyEWdPsk;
        if (z) {
            ZpBGe2uQfcn8(new defpackage.uc1(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.Ns0WNyEWdPsk;
        if (!z) {
            return z;
        }
        ZpBGe2uQfcn8(new defpackage.vc1(i, i2));
        return true;
    }
}
