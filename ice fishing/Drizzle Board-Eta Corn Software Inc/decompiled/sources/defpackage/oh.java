package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oh extends Drawable.ConstantState {
    public r60 Ey6iv0m0;
    public final Rect FySoLYna;
    public int I5GHvsYW;
    public int KlHjfFWx;
    public boolean MdtA4re8;
    public int NCTxEWno;
    public int OnDfzHZD;
    public int OxcuoDLp;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public int RXQxj5Oe;
    public boolean VgvYg0wo;
    public float amk52bBQ;
    public int b2ZJblxo;
    public float eVhOlqcC;
    public int[] gjV1z5T1;
    public int jb9XjC4I;
    public int k3x7lurq;
    public int lDXGDhIF;
    public float ow5vqvCr;
    public Drawable.ConstantState qoPGr6Ce;
    public float sjUBp5pO;
    public int wxUZMvaN;
    public float ygLcUYwZ;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Cloneable, t60[]] */
    public oh(oh ohVar) {
        this.NCTxEWno = 0;
        this.MdtA4re8 = false;
        this.wxUZMvaN = Integer.MIN_VALUE;
        this.VgvYg0wo = false;
        this.P7K7Inc8 = Integer.MIN_VALUE;
        this.b2ZJblxo = Integer.MIN_VALUE;
        this.Qr9iLBAD = Integer.MIN_VALUE;
        this.jb9XjC4I = Integer.MIN_VALUE;
        this.eVhOlqcC = Float.NaN;
        this.k3x7lurq = Integer.MIN_VALUE;
        this.ow5vqvCr = Float.NaN;
        this.OnDfzHZD = Integer.MIN_VALUE;
        this.ygLcUYwZ = Float.NaN;
        this.lDXGDhIF = Integer.MIN_VALUE;
        this.sjUBp5pO = Float.NaN;
        this.OxcuoDLp = Integer.MIN_VALUE;
        this.amk52bBQ = Float.NaN;
        this.KlHjfFWx = Integer.MIN_VALUE;
        this.Ey6iv0m0 = null;
        this.I5GHvsYW = Integer.MIN_VALUE;
        this.RXQxj5Oe = Integer.MIN_VALUE;
        this.FySoLYna = null;
        this.gjV1z5T1 = FocusRingDrawable.amk52bBQ;
        if (ohVar != null) {
            this.qoPGr6Ce = ohVar.qoPGr6Ce;
            this.NCTxEWno = ohVar.NCTxEWno;
            this.MdtA4re8 = ohVar.MdtA4re8;
            this.wxUZMvaN = ohVar.wxUZMvaN;
            this.VgvYg0wo = ohVar.VgvYg0wo;
            this.P7K7Inc8 = ohVar.P7K7Inc8;
            this.b2ZJblxo = ohVar.b2ZJblxo;
            this.Qr9iLBAD = ohVar.Qr9iLBAD;
            this.jb9XjC4I = ohVar.jb9XjC4I;
            this.eVhOlqcC = ohVar.eVhOlqcC;
            this.k3x7lurq = ohVar.k3x7lurq;
            this.ow5vqvCr = ohVar.ow5vqvCr;
            this.OnDfzHZD = ohVar.OnDfzHZD;
            this.ygLcUYwZ = ohVar.ygLcUYwZ;
            this.lDXGDhIF = ohVar.lDXGDhIF;
            this.sjUBp5pO = ohVar.sjUBp5pO;
            this.OxcuoDLp = ohVar.OxcuoDLp;
            this.amk52bBQ = ohVar.amk52bBQ;
            this.KlHjfFWx = ohVar.KlHjfFWx;
            this.I5GHvsYW = ohVar.I5GHvsYW;
            this.RXQxj5Oe = ohVar.RXQxj5Oe;
            r60 r60Var = ohVar.Ey6iv0m0;
            if (r60Var instanceof t60) {
                this.Ey6iv0m0 = ((t60) r60Var).eVhOlqcC().qoPGr6Ce();
            } else if (r60Var instanceof z90) {
                z90 z90Var = (z90) r60Var;
                yt ytVar = new yt();
                int i = z90Var.qoPGr6Ce;
                ytVar.qoPGr6Ce = i;
                ytVar.NCTxEWno = z90Var.NCTxEWno;
                int[][] iArr = z90Var.MdtA4re8;
                int[][] iArr2 = new int[iArr.length][];
                ytVar.MdtA4re8 = iArr2;
                t60[] t60VarArr = z90Var.wxUZMvaN;
                ytVar.wxUZMvaN = new t60[t60VarArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(t60VarArr, 0, (t60[]) ytVar.wxUZMvaN, 0, ytVar.qoPGr6Ce);
                this.Ey6iv0m0 = ytVar.qoPGr6Ce != 0 ? new z90(ytVar) : null;
            } else {
                this.Ey6iv0m0 = r60Var;
            }
            if (ohVar.FySoLYna != null) {
                this.FySoLYna = new Rect(ohVar.FySoLYna);
            }
            int[] iArr3 = ohVar.gjV1z5T1;
            this.gjV1z5T1 = Arrays.copyOf(iArr3, iArr3.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.qoPGr6Ce;
        return this.NCTxEWno | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, (Resources) null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources);
    }
}
