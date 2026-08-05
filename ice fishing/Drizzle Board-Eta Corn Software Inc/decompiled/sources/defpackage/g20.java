package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class g20 {
    public static final List KlHjfFWx = Collections.EMPTY_LIST;
    public WeakReference NCTxEWno;
    public RecyclerView OxcuoDLp;
    public m10 amk52bBQ;
    public int jb9XjC4I;
    public final View qoPGr6Ce;
    public int MdtA4re8 = -1;
    public int wxUZMvaN = -1;
    public int VgvYg0wo = -1;
    public int P7K7Inc8 = -1;
    public g20 b2ZJblxo = null;
    public g20 Qr9iLBAD = null;
    public ArrayList eVhOlqcC = null;
    public List k3x7lurq = null;
    public int ow5vqvCr = 0;
    public z10 OnDfzHZD = null;
    public boolean ygLcUYwZ = false;
    public int lDXGDhIF = 0;
    public int sjUBp5pO = -1;

    public g20(View view) {
        if (view != null) {
            this.qoPGr6Ce = view;
        } else {
            m1.sjUBp5pO("itemView may not be null");
            throw null;
        }
    }

    public final List MdtA4re8() {
        ArrayList arrayList;
        return ((this.jb9XjC4I & 1024) != 0 || (arrayList = this.eVhOlqcC) == null || arrayList.size() == 0) ? KlHjfFWx : this.k3x7lurq;
    }

    public final int NCTxEWno() {
        int i = this.P7K7Inc8;
        return i == -1 ? this.MdtA4re8 : i;
    }

    public final void OnDfzHZD(boolean z) {
        int i = this.ow5vqvCr;
        int i2 = z ? i - 1 : i + 1;
        this.ow5vqvCr = i2;
        if (i2 < 0) {
            this.ow5vqvCr = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.jb9XjC4I |= 16;
        } else if (z && i2 == 0) {
            this.jb9XjC4I &= -17;
        }
    }

    public final boolean P7K7Inc8() {
        if ((this.jb9XjC4I & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        return !this.qoPGr6Ce.hasTransientState();
    }

    public final boolean Qr9iLBAD() {
        return this.OnDfzHZD != null;
    }

    public final boolean VgvYg0wo() {
        return (this.jb9XjC4I & 4) != 0;
    }

    public final boolean b2ZJblxo() {
        return (this.jb9XjC4I & 8) != 0;
    }

    public final boolean eVhOlqcC() {
        return (this.jb9XjC4I & 2) != 0;
    }

    public final boolean jb9XjC4I() {
        return (this.jb9XjC4I & 256) != 0;
    }

    public final void k3x7lurq(int i, boolean z) {
        if (this.wxUZMvaN == -1) {
            this.wxUZMvaN = this.MdtA4re8;
        }
        int i2 = this.P7K7Inc8;
        if (i2 == -1) {
            i2 = this.MdtA4re8;
            this.P7K7Inc8 = i2;
        }
        if (z) {
            this.P7K7Inc8 = i2 + i;
        }
        this.MdtA4re8 += i;
        View view = this.qoPGr6Ce;
        if (view.getLayoutParams() != null) {
            ((u10) view.getLayoutParams()).MdtA4re8 = true;
        }
    }

    public final boolean lDXGDhIF() {
        return (this.jb9XjC4I & 32) != 0;
    }

    public final void ow5vqvCr() {
        this.jb9XjC4I = 0;
        this.MdtA4re8 = -1;
        this.wxUZMvaN = -1;
        this.P7K7Inc8 = -1;
        this.ow5vqvCr = 0;
        this.b2ZJblxo = null;
        this.Qr9iLBAD = null;
        ArrayList arrayList = this.eVhOlqcC;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.jb9XjC4I &= -1025;
        this.lDXGDhIF = 0;
        this.sjUBp5pO = -1;
        RecyclerView.b2ZJblxo(this);
    }

    public final void qoPGr6Ce(int i) {
        this.jb9XjC4I = i | this.jb9XjC4I;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.MdtA4re8 + " id=-1, oldPos=" + this.wxUZMvaN + ", pLpos:" + this.P7K7Inc8);
        if (Qr9iLBAD()) {
            sb.append(" scrap ");
            sb.append(this.ygLcUYwZ ? "[changeScrap]" : "[attachedScrap]");
        }
        if (VgvYg0wo()) {
            sb.append(" invalid");
        }
        if (!wxUZMvaN()) {
            sb.append(" unbound");
        }
        if ((this.jb9XjC4I & 2) != 0) {
            sb.append(" update");
        }
        if (b2ZJblxo()) {
            sb.append(" removed");
        }
        if (ygLcUYwZ()) {
            sb.append(" ignored");
        }
        if (jb9XjC4I()) {
            sb.append(" tmpDetached");
        }
        if (!P7K7Inc8()) {
            sb.append(" not recyclable(" + this.ow5vqvCr + ")");
        }
        if ((this.jb9XjC4I & 512) != 0 || VgvYg0wo()) {
            sb.append(" undefined adapter position");
        }
        if (this.qoPGr6Ce.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean wxUZMvaN() {
        return (this.jb9XjC4I & 1) != 0;
    }

    public final boolean ygLcUYwZ() {
        return (this.jb9XjC4I & 128) != 0;
    }
}
