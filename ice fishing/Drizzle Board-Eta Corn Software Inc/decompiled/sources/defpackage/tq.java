package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tq extends vq implements Iterator, xn {
    public final /* synthetic */ int P7K7Inc8;

    public tq(wq wqVar, int i) {
        this.P7K7Inc8 = i;
        this.VgvYg0wo = wqVar;
        this.MdtA4re8 = -1;
        this.wxUZMvaN = wqVar.jb9XjC4I;
        VgvYg0wo();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.P7K7Inc8) {
            case 0:
                NCTxEWno();
                int i = this.NCTxEWno;
                wq wqVar = (wq) this.VgvYg0wo;
                if (i >= wqVar.b2ZJblxo) {
                    throw new NoSuchElementException();
                }
                this.NCTxEWno = i + 1;
                this.MdtA4re8 = i;
                uq uqVar = new uq(wqVar, i);
                VgvYg0wo();
                return uqVar;
            case 1:
                NCTxEWno();
                int i2 = this.NCTxEWno;
                wq wqVar2 = (wq) this.VgvYg0wo;
                if (i2 >= wqVar2.b2ZJblxo) {
                    throw new NoSuchElementException();
                }
                this.NCTxEWno = i2 + 1;
                this.MdtA4re8 = i2;
                Object obj = wqVar2.NCTxEWno[i2];
                VgvYg0wo();
                return obj;
            default:
                NCTxEWno();
                int i3 = this.NCTxEWno;
                wq wqVar3 = (wq) this.VgvYg0wo;
                if (i3 >= wqVar3.b2ZJblxo) {
                    throw new NoSuchElementException();
                }
                this.NCTxEWno = i3 + 1;
                this.MdtA4re8 = i3;
                Object[] objArr = wqVar3.MdtA4re8;
                objArr.getClass();
                Object obj2 = objArr[this.MdtA4re8];
                VgvYg0wo();
                return obj2;
        }
    }
}
