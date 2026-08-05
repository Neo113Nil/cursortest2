package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class mc0 {
    public static final /* synthetic */ long NCTxEWno = b1.qoPGr6Ce.objectFieldOffset(mc0.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public fg[] qoPGr6Ce;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fg MdtA4re8(int i) {
        Object[] objArr = this.qoPGr6Ce;
        objArr.getClass();
        b1.qoPGr6Ce.putIntVolatile(this, NCTxEWno, NCTxEWno() - 1);
        if (i < NCTxEWno()) {
            VgvYg0wo(i, NCTxEWno());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                fg fgVar = objArr[i];
                fgVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (fgVar.compareTo(obj) < 0) {
                    VgvYg0wo(i, i2);
                    wxUZMvaN(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= NCTxEWno()) {
                    break;
                }
                Object[] objArr2 = this.qoPGr6Ce;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < NCTxEWno()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                VgvYg0wo(i, i5);
                i = i5;
            }
        }
        fg fgVar2 = objArr[NCTxEWno()];
        fgVar2.getClass();
        fgVar2.wxUZMvaN(null);
        fgVar2.MdtA4re8 = -1;
        objArr[NCTxEWno()] = null;
        return fgVar2;
    }

    public final int NCTxEWno() {
        return b1.qoPGr6Ce.getIntVolatile(this, NCTxEWno);
    }

    public final void VgvYg0wo(int i, int i2) {
        fg[] fgVarArr = this.qoPGr6Ce;
        fgVarArr.getClass();
        fg fgVar = fgVarArr[i2];
        fgVar.getClass();
        fg fgVar2 = fgVarArr[i];
        fgVar2.getClass();
        fgVarArr[i] = fgVar;
        fgVarArr[i2] = fgVar2;
        fgVar.MdtA4re8 = i;
        fgVar2.MdtA4re8 = i2;
    }

    public final void qoPGr6Ce(fg fgVar) {
        fgVar.wxUZMvaN((gg) this);
        fg[] fgVarArr = this.qoPGr6Ce;
        if (fgVarArr == null) {
            fgVarArr = new fg[4];
            this.qoPGr6Ce = fgVarArr;
        } else if (NCTxEWno() >= fgVarArr.length) {
            fgVarArr = (fg[]) Arrays.copyOf(fgVarArr, NCTxEWno() * 2);
            this.qoPGr6Ce = fgVarArr;
        }
        int NCTxEWno2 = NCTxEWno();
        b1.qoPGr6Ce.putIntVolatile(this, NCTxEWno, NCTxEWno2 + 1);
        fgVarArr[NCTxEWno2] = fgVar;
        fgVar.MdtA4re8 = NCTxEWno2;
        wxUZMvaN(NCTxEWno2);
    }

    public final void wxUZMvaN(int i) {
        while (i > 0) {
            fg[] fgVarArr = this.qoPGr6Ce;
            fgVarArr.getClass();
            int i2 = (i - 1) / 2;
            fg fgVar = fgVarArr[i2];
            fgVar.getClass();
            fg fgVar2 = fgVarArr[i];
            fgVar2.getClass();
            if (fgVar.compareTo(fgVar2) <= 0) {
                return;
            }
            VgvYg0wo(i, i2);
            i = i2;
        }
    }
}
