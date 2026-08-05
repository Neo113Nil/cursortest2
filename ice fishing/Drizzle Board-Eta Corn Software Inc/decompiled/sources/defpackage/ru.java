package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ru extends pu implements Iterable, xn {
    public static final /* synthetic */ int jb9XjC4I = 0;
    public final yt Qr9iLBAD;

    public ru(tu tuVar) {
        super(tuVar);
        yt ytVar = new yt();
        ytVar.MdtA4re8 = this;
        ytVar.wxUZMvaN = new a80(0);
        this.Qr9iLBAD = ytVar;
    }

    @Override // defpackage.pu
    public final void P7K7Inc8(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.P7K7Inc8(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, v00.wxUZMvaN);
        obtainAttributes.getClass();
        int resourceId = obtainAttributes.getResourceId(0, 0);
        yt ytVar = this.Qr9iLBAD;
        ru ruVar = (ru) ytVar.MdtA4re8;
        if (resourceId == ruVar.MdtA4re8.qoPGr6Ce) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + ruVar).toString());
        }
        ytVar.qoPGr6Ce = resourceId;
        ytVar.NCTxEWno = null;
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
                valueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
        }
        ytVar.NCTxEWno = valueOf;
        obtainAttributes.recycle();
    }

    public final pu Qr9iLBAD(int i) {
        yt ytVar = this.Qr9iLBAD;
        return ytVar.qoPGr6Ce(i, (ru) ytVar.MdtA4re8, null, false);
    }

    @Override // defpackage.pu
    public final ou VgvYg0wo(f0 f0Var) {
        ou VgvYg0wo = super.VgvYg0wo(f0Var);
        yt ytVar = this.Qr9iLBAD;
        ytVar.getClass();
        return ytVar.NCTxEWno(VgvYg0wo, f0Var, false, (ru) ytVar.MdtA4re8);
    }

    public final void b2ZJblxo(pu puVar) {
        puVar.getClass();
        yt ytVar = this.Qr9iLBAD;
        a80 a80Var = (a80) ytVar.wxUZMvaN;
        ru ruVar = (ru) ytVar.MdtA4re8;
        VM67d7Sv vM67d7Sv = ruVar.MdtA4re8;
        VM67d7Sv vM67d7Sv2 = puVar.MdtA4re8;
        int i = vM67d7Sv2.qoPGr6Ce;
        String str = (String) vM67d7Sv2.P7K7Inc8;
        if (i == 0 && str == null) {
            m1.sjUBp5pO("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = (String) vM67d7Sv.P7K7Inc8;
        if (str2 != null && fn.qoPGr6Ce(str, str2)) {
            throw new IllegalArgumentException(("Destination " + puVar + " cannot have the same route as graph " + ruVar).toString());
        }
        if (i == vM67d7Sv.qoPGr6Ce) {
            throw new IllegalArgumentException(("Destination " + puVar + " cannot have the same id as graph " + ruVar).toString());
        }
        pu puVar2 = (pu) ej0.eVhOlqcC(a80Var, i);
        if (puVar2 == puVar) {
            return;
        }
        if (puVar.wxUZMvaN != null) {
            m1.Ey6iv0m0("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (puVar2 != null) {
            puVar2.wxUZMvaN = null;
        }
        puVar.wxUZMvaN = ruVar;
        a80Var.NCTxEWno(vM67d7Sv2.qoPGr6Ce, puVar);
    }

    @Override // defpackage.pu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ru) || !super.equals(obj)) {
            return false;
        }
        yt ytVar = this.Qr9iLBAD;
        int MdtA4re8 = ((a80) ytVar.wxUZMvaN).MdtA4re8();
        yt ytVar2 = ((ru) obj).Qr9iLBAD;
        if (MdtA4re8 != ((a80) ytVar2.wxUZMvaN).MdtA4re8() || ytVar.qoPGr6Ce != ytVar2.qoPGr6Ce) {
            return false;
        }
        for (pu puVar : l60.I5GHvsYW(new ow5vqvCr(2, (a80) ytVar.wxUZMvaN))) {
            if (!puVar.equals(ej0.eVhOlqcC((a80) ytVar2.wxUZMvaN, puVar.MdtA4re8.qoPGr6Ce))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pu
    public final int hashCode() {
        yt ytVar = this.Qr9iLBAD;
        int i = ytVar.qoPGr6Ce;
        a80 a80Var = (a80) ytVar.wxUZMvaN;
        int MdtA4re8 = a80Var.MdtA4re8();
        for (int i2 = 0; i2 < MdtA4re8; i2++) {
            i = (((i * 31) + a80Var.qoPGr6Ce(i2)) * 31) + ((pu) a80Var.wxUZMvaN(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        yt ytVar = this.Qr9iLBAD;
        ytVar.getClass();
        return new su(ytVar);
    }

    public final ou jb9XjC4I(f0 f0Var, pu puVar) {
        return this.Qr9iLBAD.NCTxEWno(super.VgvYg0wo(f0Var), f0Var, true, puVar);
    }

    @Override // defpackage.pu
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        yt ytVar = this.Qr9iLBAD;
        ytVar.getClass();
        ytVar.getClass();
        pu Qr9iLBAD = Qr9iLBAD(ytVar.qoPGr6Ce);
        sb.append(" startDestination=");
        if (Qr9iLBAD == null) {
            String str = (String) ytVar.NCTxEWno;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(ytVar.qoPGr6Ce));
            }
        } else {
            sb.append("{");
            sb.append(Qr9iLBAD.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
