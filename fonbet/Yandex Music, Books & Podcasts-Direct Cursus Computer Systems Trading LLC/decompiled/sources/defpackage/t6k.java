package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t6k extends ner implements Parcelable, poi, l2r {

    @NotNull
    public static final Parcelable.Creator<t6k> CREATOR = new pgj(7);
    public i2r b;

    public t6k(float f) {
        b2r k = g2r.k();
        i2r i2rVar = new i2r(k.g(), f);
        if (!(k instanceof emd)) {
            i2rVar.b = new i2r(1, f);
        }
        this.b = i2rVar;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.b = (i2r) perVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.cjc
    public final float e() {
        return ((i2r) g2r.t(this.b, this)).c;
    }

    @Override // defpackage.l2r
    public final n2r f() {
        return ehv.h;
    }

    @Override // defpackage.mer
    public final per g() {
        return this.b;
    }

    public final void h(float f) {
        b2r k;
        i2r i2rVar = (i2r) g2r.i(this.b);
        if (i2rVar.c == f) {
            return;
        }
        i2r i2rVar2 = this.b;
        synchronized (g2r.b) {
            k = g2r.k();
            ((i2r) g2r.o(i2rVar2, this, k, i2rVar)).c = f;
        }
        g2r.n(k, this);
    }

    @Override // defpackage.mer
    public final per m(per perVar, per perVar2, per perVar3) {
        if (((i2r) perVar2).c == ((i2r) perVar3).c) {
            return perVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((i2r) g2r.i(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(e());
    }
}
