package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x6k extends ner implements Parcelable, l2r {

    @NotNull
    public static final Parcelable.Creator<x6k> CREATOR = new w6k(0);
    public final n2r b;
    public m2r c;

    public x6k(Object obj, n2r n2rVar) {
        this.b = n2rVar;
        b2r k = g2r.k();
        m2r m2rVar = new m2r(k.g(), obj);
        if (!(k instanceof emd)) {
            m2rVar.b = new m2r(1, obj);
        }
        this.c = m2rVar;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.c = (m2r) perVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l2r
    public final n2r f() {
        return this.b;
    }

    @Override // defpackage.mer
    public final per g() {
        return this.c;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return ((m2r) g2r.t(this.c, this)).c;
    }

    @Override // defpackage.mer
    public final per m(per perVar, per perVar2, per perVar3) {
        if (this.b.J(((m2r) perVar2).c, ((m2r) perVar3).c)) {
            return perVar2;
        }
        return null;
    }

    @Override // defpackage.aqi
    public final void setValue(Object obj) {
        b2r k;
        m2r m2rVar = (m2r) g2r.i(this.c);
        if (this.b.J(m2rVar.c, obj)) {
            return;
        }
        m2r m2rVar2 = this.c;
        synchronized (g2r.b) {
            k = g2r.k();
            ((m2r) g2r.o(m2rVar2, this, k, m2rVar)).c = obj;
        }
        g2r.n(k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((m2r) g2r.i(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        wvo wvoVar = wvo.e;
        n2r n2rVar = this.b;
        if (Intrinsics.d(n2rVar, wvoVar)) {
            i2 = 0;
        } else if (Intrinsics.d(n2rVar, ehv.h)) {
            i2 = 1;
        } else {
            if (!Intrinsics.d(n2rVar, rwd.h)) {
                xq0.q("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
