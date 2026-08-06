package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oy {
    public h1 E7jCp8Ls;
    public Outline EljAMC1QTz;
    public final qy GWasM1elztuh;
    public float JFJ3QoxA;
    public a1 WIEu4Ya2g8;
    public RectF WdrkLMV3xh;
    public h1 XnEVoBF0td1l;
    public long Y6hRI1cF8;
    public int YmKjaVtbfp5Z;
    public long cilMamHF;
    public u9 iwATDS1i01k;
    public long jivtDDk9H;
    public boolean lv06NcmrQ;
    public boolean mE4lRynR;
    public z50 rQPn8YBR;
    public boolean uFEq9NpZ;
    public el Yi7zF1RB1 = rj0.EljAMC1QTz;
    public p50 X1lG3V04pd = p50.OOA6hdeuvCS;
    public hv xqGvceK5x = XdwzlWIkSDqF.cilMamHF;
    public final NWXxPwoOUSX9 OOA6hdeuvCS = new NWXxPwoOUSX9(12, this);
    public boolean AvO7iQsrTN = true;
    public long encWxUiV2 = 0;
    public long mOu10nynGul = 9205357640488583168L;
    public final ra Mjvvu5DE = new ra();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public oy(qy qyVar) {
        this.GWasM1elztuh = qyVar;
        qyVar.Y6hRI1cF8(false);
        this.jivtDDk9H = 0L;
        this.Y6hRI1cF8 = 0L;
        this.cilMamHF = 9205357640488583168L;
    }

    public final void GWasM1elztuh() {
        Outline outline;
        if (this.AvO7iQsrTN) {
            boolean z = this.lv06NcmrQ;
            Outline outline2 = null;
            qy qyVar = this.GWasM1elztuh;
            if (z || qyVar.eUH21U3apd() > 0.0f) {
                h1 h1Var = this.E7jCp8Ls;
                if (h1Var != null) {
                    RectF rectF = this.WdrkLMV3xh;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.WdrkLMV3xh = rectF;
                    }
                    boolean z2 = h1Var instanceof h1;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = h1Var.GWasM1elztuh;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.EljAMC1QTz;
                        if (outline == null) {
                            outline = new Outline();
                            this.EljAMC1QTz = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.uFEq9NpZ = !outline.canClip();
                    } else {
                        Outline outline3 = this.EljAMC1QTz;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.uFEq9NpZ = true;
                        outline = null;
                    }
                    this.E7jCp8Ls = h1Var;
                    if (outline != null) {
                        outline.setAlpha(qyVar.Yi7zF1RB1());
                        outline2 = outline;
                    }
                    qyVar.E7jCp8Ls(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.uFEq9NpZ && this.lv06NcmrQ) {
                        qyVar.Y6hRI1cF8(false);
                        qyVar.YmKjaVtbfp5Z();
                    } else {
                        qyVar.Y6hRI1cF8(this.lv06NcmrQ);
                    }
                } else {
                    qyVar.Y6hRI1cF8(this.lv06NcmrQ);
                    Outline outline4 = this.EljAMC1QTz;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.EljAMC1QTz = outline4;
                    }
                    Outline outline5 = outline4;
                    long CMh55RymNfS = o30.CMh55RymNfS(this.Y6hRI1cF8);
                    long j = this.encWxUiV2;
                    long j2 = this.mOu10nynGul;
                    if (j2 != 9205357640488583168L) {
                        CMh55RymNfS = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (CMh55RymNfS >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (CMh55RymNfS & 4294967295L)) + Float.intBitsToFloat(i3)), this.JFJ3QoxA);
                    outline5.setAlpha(qyVar.Yi7zF1RB1());
                    qyVar.E7jCp8Ls(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                qyVar.Y6hRI1cF8(false);
                qyVar.E7jCp8Ls(null, 0L);
            }
        }
        this.AvO7iQsrTN = false;
    }

    public final void OOA6hdeuvCS(long j, long j2, float f) {
        if (uk0.Yi7zF1RB1(this.encWxUiV2, j) && t21.GWasM1elztuh(this.mOu10nynGul, j2) && this.JFJ3QoxA == f && this.E7jCp8Ls == null) {
            return;
        }
        this.rQPn8YBR = null;
        this.E7jCp8Ls = null;
        this.AvO7iQsrTN = true;
        this.uFEq9NpZ = false;
        this.encWxUiV2 = j;
        this.mOu10nynGul = j2;
        this.JFJ3QoxA = f;
        GWasM1elztuh();
    }

    public final void X1lG3V04pd(ho hoVar) {
        ra raVar = this.Mjvvu5DE;
        raVar.X1lG3V04pd = (oy) raVar.Yi7zF1RB1;
        ig0 ig0Var = (ig0) raVar.xqGvceK5x;
        if (ig0Var != null && ig0Var.encWxUiV2()) {
            ig0 ig0Var2 = (ig0) raVar.OOA6hdeuvCS;
            if (ig0Var2 == null) {
                ig0 ig0Var3 = lx0.GWasM1elztuh;
                ig0Var2 = new ig0();
                raVar.OOA6hdeuvCS = ig0Var2;
            }
            ig0Var2.JFJ3QoxA(ig0Var);
            ig0Var.Yi7zF1RB1();
        }
        raVar.GWasM1elztuh = true;
        this.xqGvceK5x.mOu10nynGul(hoVar);
        raVar.GWasM1elztuh = false;
        oy oyVar = (oy) raVar.X1lG3V04pd;
        if (oyVar != null) {
            oyVar.YmKjaVtbfp5Z--;
            oyVar.Yi7zF1RB1();
        }
        ig0 ig0Var4 = (ig0) raVar.OOA6hdeuvCS;
        if (ig0Var4 == null || !ig0Var4.encWxUiV2()) {
            return;
        }
        Object[] objArr = ig0Var4.Yi7zF1RB1;
        long[] jArr = ig0Var4.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.YmKjaVtbfp5Z--;
                            ((oy) objArr[(i << 3) + i3]).Yi7zF1RB1();
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
        ig0Var4.Yi7zF1RB1();
    }

    public final void Yi7zF1RB1() {
        if (this.mE4lRynR && this.YmKjaVtbfp5Z == 0) {
            ra raVar = this.Mjvvu5DE;
            oy oyVar = (oy) raVar.Yi7zF1RB1;
            if (oyVar != null) {
                oyVar.YmKjaVtbfp5Z--;
                oyVar.Yi7zF1RB1();
                raVar.Yi7zF1RB1 = null;
            }
            ig0 ig0Var = (ig0) raVar.xqGvceK5x;
            if (ig0Var != null) {
                Object[] objArr = ig0Var.Yi7zF1RB1;
                long[] jArr = ig0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.YmKjaVtbfp5Z--;
                                    ((oy) objArr[(i << 3) + i3]).Yi7zF1RB1();
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
                ig0Var.Yi7zF1RB1();
            }
            this.GWasM1elztuh.YmKjaVtbfp5Z();
        }
    }

    public final z50 xqGvceK5x() {
        z50 an0Var;
        z50 z50Var = this.rQPn8YBR;
        h1 h1Var = this.E7jCp8Ls;
        if (z50Var != null) {
            return z50Var;
        }
        if (h1Var != null) {
            zm0 zm0Var = new zm0(h1Var);
            this.rQPn8YBR = zm0Var;
            return zm0Var;
        }
        long CMh55RymNfS = o30.CMh55RymNfS(this.Y6hRI1cF8);
        long j = this.encWxUiV2;
        long j2 = this.mOu10nynGul;
        if (j2 != 9205357640488583168L) {
            CMh55RymNfS = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (CMh55RymNfS >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (CMh55RymNfS & 4294967295L)) + intBitsToFloat2;
        if (this.JFJ3QoxA > 0.0f) {
            an0Var = new bn0(n4.Yi7zF1RB1(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            an0Var = new an0(new kt0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.rQPn8YBR = an0Var;
        return an0Var;
    }
}
