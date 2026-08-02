package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v6k extends ner implements Parcelable, l2r, aqi, sdr {

    @NotNull
    public static final Parcelable.Creator<v6k> CREATOR = new pgj(9);
    public k2r b;

    public v6k(long j) {
        b2r k = g2r.k();
        k2r k2rVar = new k2r(k.g(), j);
        if (!(k instanceof emd)) {
            k2rVar.b = new k2r(1, j);
        }
        this.b = k2rVar;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.b = (k2r) perVar;
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
        return Long.valueOf(h());
    }

    public final long h() {
        return ((k2r) g2r.t(this.b, this)).c;
    }

    public final void i(long j) {
        b2r k;
        k2r k2rVar = (k2r) g2r.i(this.b);
        if (k2rVar.c != j) {
            k2r k2rVar2 = this.b;
            synchronized (g2r.b) {
                k = g2r.k();
                ((k2r) g2r.o(k2rVar2, this, k, k2rVar)).c = j;
            }
            g2r.n(k, this);
        }
    }

    @Override // defpackage.mer
    public final per m(per perVar, per perVar2, per perVar3) {
        if (((k2r) perVar2).c == ((k2r) perVar3).c) {
            return perVar2;
        }
        return null;
    }

    @Override // defpackage.aqi
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((k2r) g2r.i(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
