package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fx extends we {
    public final /* synthetic */ int wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(t10 t10Var, int i) {
        super(t10Var);
        this.wxUZMvaN = i;
    }

    @Override // defpackage.we
    public final int OnDfzHZD() {
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((t10) obj).Mq3SeTnW();
            default:
                return ((t10) obj).SgZGMMPL();
        }
    }

    @Override // defpackage.we
    public final void OxcuoDLp(int i) {
        int i2 = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i2) {
            case 0:
                ((t10) obj).hzgxAD8d(i);
                break;
            default:
                ((t10) obj).zCflySGU(i);
                break;
        }
    }

    @Override // defpackage.we
    public final int P7K7Inc8(View view) {
        int WYNAV5pd;
        int i;
        switch (this.wxUZMvaN) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                WYNAV5pd = t10.WYNAV5pd(view) + ((ViewGroup.MarginLayoutParams) u10Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) u10Var).bottomMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                WYNAV5pd = t10.DK9slbsy(view) + ((ViewGroup.MarginLayoutParams) u10Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).rightMargin;
                break;
        }
        return WYNAV5pd + i;
    }

    @Override // defpackage.we
    public final int Qr9iLBAD() {
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((t10) obj).OnDfzHZD;
            default:
                return ((t10) obj).ygLcUYwZ;
        }
    }

    @Override // defpackage.we
    public final int VgvYg0wo(View view) {
        int DK9slbsy;
        int i;
        switch (this.wxUZMvaN) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                DK9slbsy = t10.DK9slbsy(view) + ((ViewGroup.MarginLayoutParams) u10Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) u10Var).rightMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                DK9slbsy = t10.WYNAV5pd(view) + ((ViewGroup.MarginLayoutParams) u10Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).bottomMargin;
                break;
        }
        return DK9slbsy + i;
    }

    @Override // defpackage.we
    public final int b2ZJblxo(View view) {
        int left;
        int i;
        switch (this.wxUZMvaN) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                left = view.getLeft() - ((u10) view.getLayoutParams()).NCTxEWno.left;
                i = ((ViewGroup.MarginLayoutParams) u10Var).leftMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                left = view.getTop() - ((u10) view.getLayoutParams()).NCTxEWno.top;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.we
    public final int eVhOlqcC() {
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((t10) obj).euDDoUNr();
            default:
                return ((t10) obj).i7xS8jrb();
        }
    }

    @Override // defpackage.we
    public final int jb9XjC4I() {
        int i;
        int euDDoUNr;
        int i2 = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i2) {
            case 0:
                t10 t10Var = (t10) obj;
                i = t10Var.OnDfzHZD;
                euDDoUNr = t10Var.euDDoUNr();
                break;
            default:
                t10 t10Var2 = (t10) obj;
                i = t10Var2.ygLcUYwZ;
                euDDoUNr = t10Var2.i7xS8jrb();
                break;
        }
        return i - euDDoUNr;
    }

    @Override // defpackage.we
    public final int k3x7lurq() {
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((t10) obj).k3x7lurq;
            default:
                return ((t10) obj).ow5vqvCr;
        }
    }

    @Override // defpackage.we
    public final int lDXGDhIF(View view) {
        int i = this.wxUZMvaN;
        Object obj = this.MdtA4re8;
        Object obj2 = this.NCTxEWno;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((t10) obj2).VhgXwMj9(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((t10) obj2).VhgXwMj9(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.we
    public final int ow5vqvCr() {
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((t10) obj).ow5vqvCr;
            default:
                return ((t10) obj).k3x7lurq;
        }
    }

    @Override // defpackage.we
    public final int sjUBp5pO(View view) {
        int i = this.wxUZMvaN;
        Object obj = this.MdtA4re8;
        Object obj2 = this.NCTxEWno;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((t10) obj2).VhgXwMj9(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((t10) obj2).VhgXwMj9(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.we
    public final int wxUZMvaN(View view) {
        int right;
        int i;
        switch (this.wxUZMvaN) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                right = view.getRight() + ((u10) view.getLayoutParams()).NCTxEWno.right;
                i = ((ViewGroup.MarginLayoutParams) u10Var).rightMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                right = view.getBottom() + ((u10) view.getLayoutParams()).NCTxEWno.bottom;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.we
    public final int ygLcUYwZ() {
        int Mq3SeTnW;
        int euDDoUNr;
        int i = this.wxUZMvaN;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                t10 t10Var = (t10) obj;
                Mq3SeTnW = t10Var.OnDfzHZD - t10Var.Mq3SeTnW();
                euDDoUNr = t10Var.euDDoUNr();
                break;
            default:
                t10 t10Var2 = (t10) obj;
                Mq3SeTnW = t10Var2.ygLcUYwZ - t10Var2.SgZGMMPL();
                euDDoUNr = t10Var2.i7xS8jrb();
                break;
        }
        return Mq3SeTnW - euDDoUNr;
    }
}
