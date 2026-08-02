package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.ik81;
import defpackage.qd81;
import defpackage.yg81;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class w03 extends m03 {
    public static final Parcelable.Creator<w03> CREATOR = new t03();
    public final List b;

    public w03(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new ik81(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ik81 ik81Var = (ik81) this.b.get(i2);
            long j = ik81Var.a;
            List list = ik81Var.f;
            parcel.writeLong(j);
            parcel.writeByte(ik81Var.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(ik81Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(ik81Var.d ? (byte) 1 : (byte) 0);
            int size2 = list.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                yg81 yg81Var = (yg81) list.get(i3);
                parcel.writeInt(yg81Var.a);
                parcel.writeLong(yg81Var.b);
            }
            parcel.writeLong(ik81Var.e);
            parcel.writeByte(ik81Var.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(ik81Var.h);
            parcel.writeInt(ik81Var.i);
            parcel.writeInt(ik81Var.j);
            parcel.writeInt(ik81Var.k);
        }
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public w03(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }
}
