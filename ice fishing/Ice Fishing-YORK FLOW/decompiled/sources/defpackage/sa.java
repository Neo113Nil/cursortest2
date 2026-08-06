package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements defpackage.y10 {
    public final /* synthetic */ java.io.Serializable P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns = 1;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ long oh71FJcDz6S2;

    public /* synthetic */ sa(long j, float[] fArr, defpackage.x31 x31Var, defpackage.w31 w31Var) {
        this.oh71FJcDz6S2 = j;
        this.QiMR8OkAhezm = fArr;
        this.P05cfTpS5W5L = x31Var;
        this.e6mdH7fiFuta = w31Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        long j;
        defpackage.gs1 gs1Var;
        float[] fArr;
        int i;
        float ZpBGe2uQfcn8;
        float ZpBGe2uQfcn82;
        int i2 = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        java.io.Serializable serializable = this.P05cfTpS5W5L;
        java.lang.Object obj3 = this.QiMR8OkAhezm;
        switch (i2) {
            case 0:
                defpackage.s31 s31Var = (defpackage.s31) obj3;
                defpackage.z31 z31Var = (defpackage.z31) serializable;
                long j2 = this.oh71FJcDz6S2;
                defpackage.ga gaVar = (defpackage.ga) obj2;
                defpackage.ld0 ld0Var = (defpackage.ld0) obj;
                ld0Var.ZpBGe2uQfcn8();
                float f = s31Var.ZpBGe2uQfcn8;
                float f2 = s31Var.giKS3J6vZuNy;
                defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
                ((defpackage.k0) ldVar.oh71FJcDz6S2.giKS3J6vZuNy).OcTWLQzke1i2(f, f2);
                try {
                    defpackage.ct.Fu5WBEia9jBo(ld0Var, (defpackage.w1) z31Var.WDYagTQQm9ns, j2, 0L, 0.0f, gaVar, 0, 890);
                    return gs1Var2;
                } finally {
                    ((defpackage.k0) ldVar.oh71FJcDz6S2.giKS3J6vZuNy).OcTWLQzke1i2(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                defpackage.x31 x31Var = (defpackage.x31) serializable;
                defpackage.w31 w31Var = (defpackage.w31) obj2;
                defpackage.dw0 dw0Var = (defpackage.dw0) obj;
                int i3 = dw0Var.giKS3J6vZuNy;
                defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
                int i4 = dw0Var.fWTAfUmVKrZq;
                long j3 = this.oh71FJcDz6S2;
                int oh71FJcDz6S2 = i3 > defpackage.in1.oh71FJcDz6S2(j3) ? dw0Var.giKS3J6vZuNy : defpackage.in1.oh71FJcDz6S2(j3);
                if (i4 >= defpackage.in1.WDYagTQQm9ns(j3)) {
                    i4 = defpackage.in1.WDYagTQQm9ns(j3);
                }
                long JhCgjQRTAOCT = defpackage.j80.JhCgjQRTAOCT(dw0Var.JhCgjQRTAOCT(oh71FJcDz6S2), dw0Var.JhCgjQRTAOCT(i4));
                int i5 = x31Var.WDYagTQQm9ns;
                defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
                int oh71FJcDz6S22 = defpackage.in1.oh71FJcDz6S2(JhCgjQRTAOCT);
                int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(JhCgjQRTAOCT);
                android.text.Layout layout = zm1Var.oh71FJcDz6S2;
                int length = layout.getText().length();
                if (oh71FJcDz6S22 < 0) {
                    defpackage.f80.ZpBGe2uQfcn8("startOffset must be > 0");
                }
                if (oh71FJcDz6S22 >= length) {
                    defpackage.f80.ZpBGe2uQfcn8("startOffset must be less than text length");
                }
                if (WDYagTQQm9ns <= oh71FJcDz6S22) {
                    defpackage.f80.ZpBGe2uQfcn8("endOffset must be greater than startOffset");
                }
                if (WDYagTQQm9ns > length) {
                    defpackage.f80.ZpBGe2uQfcn8("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i5 < (WDYagTQQm9ns - oh71FJcDz6S22) * 4) {
                    defpackage.f80.ZpBGe2uQfcn8("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int QiMR8OkAhezm = zm1Var.QiMR8OkAhezm(oh71FJcDz6S22);
                int QiMR8OkAhezm2 = zm1Var.QiMR8OkAhezm(WDYagTQQm9ns - 1);
                defpackage.m50 m50Var = new defpackage.m50(zm1Var);
                if (QiMR8OkAhezm <= QiMR8OkAhezm2) {
                    while (true) {
                        int lineStart = layout.getLineStart(QiMR8OkAhezm);
                        j = JhCgjQRTAOCT;
                        int oh71FJcDz6S23 = zm1Var.oh71FJcDz6S2(QiMR8OkAhezm);
                        int max = java.lang.Math.max(oh71FJcDz6S22, lineStart);
                        int min = java.lang.Math.min(WDYagTQQm9ns, oh71FJcDz6S23);
                        float P05cfTpS5W5L = zm1Var.P05cfTpS5W5L(QiMR8OkAhezm);
                        float WDYagTQQm9ns2 = zm1Var.WDYagTQQm9ns(QiMR8OkAhezm);
                        gs1Var = gs1Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(QiMR8OkAhezm) == 1;
                        int i6 = i5;
                        int i7 = max;
                        while (i7 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i7);
                            if (!z2 || isRtlCharAt) {
                                if (z2 && isRtlCharAt) {
                                    z = false;
                                    float ZpBGe2uQfcn83 = m50Var.ZpBGe2uQfcn8(i7, false, false, false);
                                    i = min;
                                    ZpBGe2uQfcn8 = m50Var.ZpBGe2uQfcn8(i7 + 1, true, true, false);
                                    ZpBGe2uQfcn82 = ZpBGe2uQfcn83;
                                } else {
                                    i = min;
                                    z = false;
                                    if (z2 || !isRtlCharAt) {
                                        ZpBGe2uQfcn8 = m50Var.ZpBGe2uQfcn8(i7, false, false, false);
                                        ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(i7 + 1, true, true, false);
                                    } else {
                                        ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(i7, false, false, true);
                                        ZpBGe2uQfcn8 = m50Var.ZpBGe2uQfcn8(i7 + 1, true, true, true);
                                    }
                                }
                                fArr[i6] = ZpBGe2uQfcn8;
                                fArr[i6 + 1] = P05cfTpS5W5L;
                                fArr[i6 + 2] = ZpBGe2uQfcn82;
                                fArr[i6 + 3] = WDYagTQQm9ns2;
                                i6 += 4;
                                i7++;
                                min = i;
                            } else {
                                ZpBGe2uQfcn8 = m50Var.ZpBGe2uQfcn8(i7, z, z, true);
                                i = min;
                                ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(i7 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i6] = ZpBGe2uQfcn8;
                            fArr[i6 + 1] = P05cfTpS5W5L;
                            fArr[i6 + 2] = ZpBGe2uQfcn82;
                            fArr[i6 + 3] = WDYagTQQm9ns2;
                            i6 += 4;
                            i7++;
                            min = i;
                        }
                        if (QiMR8OkAhezm != QiMR8OkAhezm2) {
                            QiMR8OkAhezm++;
                            JhCgjQRTAOCT = j;
                            i5 = i6;
                            gs1Var2 = gs1Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = JhCgjQRTAOCT;
                    gs1Var = gs1Var2;
                    fArr = fArr2;
                }
                int JhCgjQRTAOCT2 = (defpackage.in1.JhCgjQRTAOCT(j) * 4) + x31Var.WDYagTQQm9ns;
                for (int i8 = x31Var.WDYagTQQm9ns; i8 < JhCgjQRTAOCT2; i8 += 4) {
                    int i9 = i8 + 1;
                    float f3 = fArr[i9];
                    float f4 = w31Var.WDYagTQQm9ns;
                    fArr[i9] = f3 + f4;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f4;
                }
                x31Var.WDYagTQQm9ns = JhCgjQRTAOCT2;
                w31Var.WDYagTQQm9ns = m2Var.giKS3J6vZuNy() + w31Var.WDYagTQQm9ns;
                return gs1Var;
        }
    }

    public /* synthetic */ sa(defpackage.s31 s31Var, defpackage.z31 z31Var, long j, defpackage.ga gaVar) {
        this.QiMR8OkAhezm = s31Var;
        this.P05cfTpS5W5L = z31Var;
        this.oh71FJcDz6S2 = j;
        this.e6mdH7fiFuta = gaVar;
    }
}
