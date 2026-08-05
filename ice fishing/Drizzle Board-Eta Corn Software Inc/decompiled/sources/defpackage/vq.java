package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class vq {
    public int MdtA4re8;
    public int NCTxEWno;
    public Object VgvYg0wo;
    public int wxUZMvaN;

    public vq() {
        if (k00.MdtA4re8 == null) {
            k00.MdtA4re8 = new k00(16);
        }
    }

    public abstract Object MdtA4re8(View view);

    public void NCTxEWno() {
        if (((wq) this.VgvYg0wo).jb9XjC4I != this.wxUZMvaN) {
            throw new ConcurrentModificationException();
        }
    }

    public void P7K7Inc8(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.MdtA4re8) {
            wxUZMvaN(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.MdtA4re8) {
            tag = MdtA4re8(view);
        } else {
            tag = view.getTag(this.NCTxEWno);
            if (!((Class) this.VgvYg0wo).isInstance(tag)) {
                tag = null;
            }
        }
        if (b2ZJblxo(tag, obj)) {
            View.AccessibilityDelegate VgvYg0wo = hg0.VgvYg0wo(view);
            Mq3SeTnW mq3SeTnW = VgvYg0wo != null ? VgvYg0wo instanceof i7xS8jrb ? ((i7xS8jrb) VgvYg0wo).qoPGr6Ce : new Mq3SeTnW(VgvYg0wo) : null;
            if (mq3SeTnW == null) {
                mq3SeTnW = new Mq3SeTnW();
            }
            hg0.eVhOlqcC(view, mq3SeTnW);
            view.setTag(this.NCTxEWno, obj);
            hg0.b2ZJblxo(view, this.wxUZMvaN);
        }
    }

    public void VgvYg0wo() {
        while (true) {
            int i = this.NCTxEWno;
            wq wqVar = (wq) this.VgvYg0wo;
            if (i >= wqVar.b2ZJblxo || wqVar.wxUZMvaN[i] >= 0) {
                return;
            } else {
                this.NCTxEWno = i + 1;
            }
        }
    }

    public abstract boolean b2ZJblxo(Object obj, Object obj2);

    public boolean hasNext() {
        return this.NCTxEWno < ((wq) this.VgvYg0wo).b2ZJblxo;
    }

    public int qoPGr6Ce(int i) {
        if (i < this.wxUZMvaN) {
            return ((ByteBuffer) this.VgvYg0wo).getShort(this.MdtA4re8 + i);
        }
        return 0;
    }

    public void remove() {
        wq wqVar = (wq) this.VgvYg0wo;
        NCTxEWno();
        if (this.MdtA4re8 == -1) {
            m1.Ey6iv0m0("Call next() before removing element from the iterator.");
            return;
        }
        wqVar.MdtA4re8();
        wqVar.k3x7lurq(this.MdtA4re8);
        this.MdtA4re8 = -1;
        this.wxUZMvaN = wqVar.jb9XjC4I;
    }

    public abstract void wxUZMvaN(View view, Object obj);
}
