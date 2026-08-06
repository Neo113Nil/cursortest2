package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w implements mk, View.OnAttachStateChangeListener {
    public d AvO7iQsrTN;
    public final wDCmwMuMZmB EljAMC1QTz;
    public final uFEq9NpZ Mjvvu5DE;
    public final c OOA6hdeuvCS;
    public e01 WIEu4Ya2g8;
    public rf0 XnEVoBF0td1l;
    public boolean YmKjaVtbfp5Z;
    public final rf0 iwATDS1i01k;
    public long uFEq9NpZ;
    public final ArrayList encWxUiV2 = new ArrayList();
    public final long mOu10nynGul = 100;
    public s JFJ3QoxA = s.OOA6hdeuvCS;
    public boolean rQPn8YBR = true;
    public final n8 E7jCp8Ls = fb1.Yi7zF1RB1(1, null, 6);

    public w(c cVar, wDCmwMuMZmB wdcmwmumzmb) {
        this.OOA6hdeuvCS = cVar;
        this.EljAMC1QTz = wdcmwmumzmb;
        new Handler(Looper.getMainLooper());
        rf0 rf0Var = t20.GWasM1elztuh;
        rf0Var.getClass();
        this.XnEVoBF0td1l = rf0Var;
        this.iwATDS1i01k = new rf0();
        this.WIEu4Ya2g8 = new e01(cVar.getSemanticsOwner().GWasM1elztuh(), rf0Var);
        this.Mjvvu5DE = new uFEq9NpZ(2, this);
    }

    public final s20 AvO7iQsrTN() {
        if (this.rQPn8YBR) {
            this.rQPn8YBR = false;
            this.XnEVoBF0td1l = o30.WdrkLMV3xh(this.OOA6hdeuvCS.getSemanticsOwner(), XdwzlWIkSDqF.JFJ3QoxA);
            this.uFEq9NpZ = System.currentTimeMillis();
        }
        return this.XnEVoBF0td1l;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r8v12 android.view.autofill.AutofillId) from 0x0097: IF  (r8v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0075 A[HIDDEN] (LINE:152)
          (r8v12 android.view.autofill.AutofillId) from 0x00a0: PHI (r8v4 android.view.autofill.AutofillId) = (r8v3 android.view.autofill.AutofillId), (r8v12 android.view.autofill.AutofillId) binds: [B:103:0x009a, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E7jCp8Ls(int r19, defpackage.d01 r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w.E7jCp8Ls(int, d01):void");
    }

    public final void EljAMC1QTz(s20 s20Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        s20 s20Var2 = s20Var;
        int[] iArr3 = s20Var2.Yi7zF1RB1;
        long[] jArr = s20Var2.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        e01 e01Var = (e01) this.iwATDS1i01k.Yi7zF1RB1(i7);
                        f01 f01Var = (f01) s20Var2.Yi7zF1RB1(i7);
                        d01 d01Var = f01Var != null ? f01Var.GWasM1elztuh : null;
                        if (d01Var == null) {
                            throw mr0.EljAMC1QTz("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = d01Var.EljAMC1QTz;
                        hg0 hg0Var = d01Var.xqGvceK5x.OOA6hdeuvCS;
                        if (e01Var == null) {
                            Object[] objArr = hg0Var.Yi7zF1RB1;
                            long[] jArr2 = hg0Var.GWasM1elztuh;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                k01 k01Var = (k01) objArr[(i10 << 3) + i12];
                                                k01 k01Var2 = h01.M3K9sHhK;
                                                if (o30.rQPn8YBR(k01Var, k01Var2)) {
                                                    Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(k01Var2);
                                                    if (AvO7iQsrTN == null) {
                                                        AvO7iQsrTN = null;
                                                    }
                                                    List list = (List) AvO7iQsrTN;
                                                    rQPn8YBR(String.valueOf(list != null ? (u3) rb.YTyqgZhdF(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = hg0Var.Yi7zF1RB1;
                            long[] jArr3 = hg0Var.GWasM1elztuh;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                k01 k01Var3 = (k01) objArr2[(i13 << 3) + i15];
                                                k01 k01Var4 = h01.M3K9sHhK;
                                                if (o30.rQPn8YBR(k01Var3, k01Var4)) {
                                                    Object AvO7iQsrTN2 = e01Var.GWasM1elztuh.OOA6hdeuvCS.AvO7iQsrTN(k01Var4);
                                                    if (AvO7iQsrTN2 == null) {
                                                        AvO7iQsrTN2 = null;
                                                    }
                                                    List list2 = (List) AvO7iQsrTN2;
                                                    u3 u3Var = list2 != null ? (u3) rb.YTyqgZhdF(list2) : null;
                                                    Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(k01Var4);
                                                    if (AvO7iQsrTN3 == null) {
                                                        AvO7iQsrTN3 = null;
                                                    }
                                                    List list3 = (List) AvO7iQsrTN3;
                                                    u3 u3Var2 = list3 != null ? (u3) rb.YTyqgZhdF(list3) : null;
                                                    if (!o30.rQPn8YBR(u3Var, u3Var2)) {
                                                        rQPn8YBR(String.valueOf(u3Var2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    s20Var2 = s20Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            s20Var2 = s20Var;
            iArr3 = iArr;
        }
    }

    @Override // defpackage.mk
    public final void GWasM1elztuh(t90 t90Var) {
        XnEVoBF0td1l(this.OOA6hdeuvCS.getSemanticsOwner().GWasM1elztuh());
        mOu10nynGul();
        this.AvO7iQsrTN = null;
    }

    public final void JFJ3QoxA(d01 d01Var, e01 e01Var) {
        int i = 0;
        v vVar = new v(i, e01Var, this);
        d01Var.getClass();
        List JFJ3QoxA = d01.JFJ3QoxA(4, d01Var);
        int size = JFJ3QoxA.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = JFJ3QoxA.get(i3);
            if (AvO7iQsrTN().GWasM1elztuh(((d01) obj).EljAMC1QTz)) {
                vVar.EljAMC1QTz(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List JFJ3QoxA2 = d01.JFJ3QoxA(4, d01Var);
        int size2 = JFJ3QoxA2.size();
        while (i < size2) {
            d01 d01Var2 = (d01) JFJ3QoxA2.get(i);
            s20 AvO7iQsrTN = AvO7iQsrTN();
            int i4 = d01Var2.EljAMC1QTz;
            if (AvO7iQsrTN.GWasM1elztuh(i4)) {
                rf0 rf0Var = this.iwATDS1i01k;
                if (rf0Var.GWasM1elztuh(i4)) {
                    Object Yi7zF1RB1 = rf0Var.Yi7zF1RB1(i4);
                    if (Yi7zF1RB1 == null) {
                        throw mr0.EljAMC1QTz("node not present in pruned tree before this change");
                    }
                    JFJ3QoxA(d01Var2, (e01) Yi7zF1RB1);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void XnEVoBF0td1l(d01 d01Var) {
        if (encWxUiV2()) {
            this.encWxUiV2.add(new hg(d01Var.EljAMC1QTz, this.uFEq9NpZ, ig.EljAMC1QTz, null));
            List JFJ3QoxA = d01.JFJ3QoxA(4, d01Var);
            int size = JFJ3QoxA.size();
            for (int i = 0; i < size; i++) {
                XnEVoBF0td1l((d01) JFJ3QoxA.get(i));
            }
        }
    }

    @Override // defpackage.mk
    public final void Yi7zF1RB1(t90 t90Var) {
        this.AvO7iQsrTN = (d) this.EljAMC1QTz.GWasM1elztuh();
        E7jCp8Ls(-1, this.OOA6hdeuvCS.getSemanticsOwner().GWasM1elztuh());
        mOu10nynGul();
    }

    public final boolean encWxUiV2() {
        return this.AvO7iQsrTN != null;
    }

    public final void mOu10nynGul() {
        d dVar = this.AvO7iQsrTN;
        if (dVar == null) {
            return;
        }
        Object obj = dVar.EljAMC1QTz;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.encWxUiV2;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hg hgVar = (hg) arrayList.get(i);
            int ordinal = hgVar.X1lG3V04pd.ordinal();
            if (ordinal == 0) {
                ha1 ha1Var = hgVar.xqGvceK5x;
                if (ha1Var != null) {
                    ViewStructure viewStructure = (ViewStructure) ha1Var.EljAMC1QTz;
                    if (Build.VERSION.SDK_INT >= 29) {
                        a4.OOA6hdeuvCS(v9x4KbmAO.xqGvceK5x(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    o4.xqGvceK5x();
                    return;
                }
                AutofillId YmKjaVtbfp5Z = dVar.YmKjaVtbfp5Z(hgVar.GWasM1elztuh);
                if (YmKjaVtbfp5Z != null && Build.VERSION.SDK_INT >= 29) {
                    a4.EljAMC1QTz(v9x4KbmAO.xqGvceK5x(obj), YmKjaVtbfp5Z);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession xqGvceK5x = v9x4KbmAO.xqGvceK5x(obj);
            iriv6doqetn XnEVoBF0td1l = w60.XnEVoBF0td1l((View) dVar.AvO7iQsrTN);
            Objects.requireNonNull(XnEVoBF0td1l);
            a4.encWxUiV2(xqGvceK5x, n5.GWasM1elztuh(XnEVoBF0td1l.GWasM1elztuh), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.OOA6hdeuvCS.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.Mjvvu5DE);
        this.AvO7iQsrTN = null;
    }

    public final void rQPn8YBR(String str, int i) {
        d dVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (dVar = this.AvO7iQsrTN) != null) {
            AutofillId YmKjaVtbfp5Z = dVar.YmKjaVtbfp5Z(i);
            if (YmKjaVtbfp5Z == null) {
                throw mr0.EljAMC1QTz("Invalid content capture ID");
            }
            if (i2 >= 29) {
                a4.AvO7iQsrTN(v9x4KbmAO.xqGvceK5x(dVar.EljAMC1QTz), YmKjaVtbfp5Z, str);
            }
        }
    }

    public final void uFEq9NpZ() {
        rf0 rf0Var = this.iwATDS1i01k;
        rf0Var.X1lG3V04pd();
        s20 AvO7iQsrTN = AvO7iQsrTN();
        int[] iArr = AvO7iQsrTN.Yi7zF1RB1;
        Object[] objArr = AvO7iQsrTN.X1lG3V04pd;
        long[] jArr = AvO7iQsrTN.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            rf0Var.encWxUiV2(iArr[i4], new e01(((f01) objArr[i4]).GWasM1elztuh, AvO7iQsrTN()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.WIEu4Ya2g8 = new e01(this.OOA6hdeuvCS.getSemanticsOwner().GWasM1elztuh(), AvO7iQsrTN());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (defpackage.o30.mE4lRynR(r7.mOu10nynGul, r0) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xqGvceK5x(wg wgVar) {
        u uVar;
        int i;
        m8 m8Var;
        if (wgVar instanceof u) {
            uVar = (u) wgVar;
            int i2 = uVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = uVar.mOu10nynGul;
                i = uVar.rQPn8YBR;
                qh qhVar = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    n8 n8Var = this.E7jCp8Ls;
                    n8Var.getClass();
                    m8Var = new m8(n8Var);
                } else if (i == 1) {
                    m8Var = uVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return kc1.GWasM1elztuh;
                    }
                    m8Var.X1lG3V04pd();
                    if (encWxUiV2()) {
                        mOu10nynGul();
                    }
                    Handler handler = this.OOA6hdeuvCS.getHandler();
                    if (!this.YmKjaVtbfp5Z && handler != null) {
                        this.YmKjaVtbfp5Z = true;
                        handler.post(this.Mjvvu5DE);
                    }
                    uVar.encWxUiV2 = m8Var;
                    uVar.rQPn8YBR = 2;
                } else {
                    if (i != 2) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m8Var = uVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj);
                }
                uVar.encWxUiV2 = m8Var;
                uVar.rQPn8YBR = 1;
                obj = m8Var.Yi7zF1RB1(uVar);
            }
        }
        uVar = new u(this, wgVar);
        Object obj2 = uVar.mOu10nynGul;
        i = uVar.rQPn8YBR;
        qh qhVar2 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        uVar.encWxUiV2 = m8Var;
        uVar.rQPn8YBR = 1;
        obj2 = m8Var.Yi7zF1RB1(uVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
