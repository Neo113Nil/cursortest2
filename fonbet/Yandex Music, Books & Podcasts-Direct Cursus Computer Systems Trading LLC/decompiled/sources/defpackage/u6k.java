package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u6k extends ner implements Parcelable, l2r, sdr, aqi {

    @NotNull
    public static final Parcelable.Creator<u6k> CREATOR = new pgj(8);
    public j2r b;

    public u6k(int i) {
        b2r k = g2r.k();
        j2r j2rVar = new j2r(k.g(), i);
        if (!(k instanceof emd)) {
            j2rVar.b = new j2r(1, i);
        }
        this.b = j2rVar;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.b = (j2r) perVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l2r
    public final n2r f() {
        return ehv.h;
    }

    @Override // defpackage.mer
    public final per g() {
        return this.b;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((j2r) g2r.t(this.b, this)).c;
    }

    public final void i(int i) {
        b2r k;
        j2r j2rVar = (j2r) g2r.i(this.b);
        if (j2rVar.c != i) {
            j2r j2rVar2 = this.b;
            synchronized (g2r.b) {
                k = g2r.k();
                ((j2r) g2r.o(j2rVar2, this, k, j2rVar)).c = i;
            }
            g2r.n(k, this);
        }
    }

    @Override // defpackage.mer
    public final per m(per perVar, per perVar2, per perVar3) {
        if (((j2r) perVar2).c == ((j2r) perVar3).c) {
            return perVar2;
        }
        return null;
    }

    @Override // defpackage.aqi
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((j2r) g2r.i(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
