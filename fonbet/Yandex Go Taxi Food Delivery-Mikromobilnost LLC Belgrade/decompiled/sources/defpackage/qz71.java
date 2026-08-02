package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class qz71 implements pk81 {
    public final du81 a = new du81();
    public final ArrayDeque b = new ArrayDeque();
    public int c;
    public boolean d;

    public qz71() {
        for (int i = 0; i < 2; i++) {
            this.b.addFirst(new v471(this, 2));
        }
        this.c = 0;
    }

    @Override // defpackage.c581
    public final rw81 a() {
        if (this.d) {
            ny61.k();
            return null;
        }
        if (this.c == 2) {
            ArrayDeque arrayDeque = this.b;
            if (!arrayDeque.isEmpty()) {
                rw81 rw81Var = (rw81) arrayDeque.removeFirst();
                du81 du81Var = this.a;
                if (du81Var.c(4)) {
                    rw81Var.a = 4 | rw81Var.a;
                } else {
                    long j = du81Var.x;
                    ByteBuffer byteBuffer = du81Var.c;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    wk71 wk71Var = new wk71(j, mt71.j(r871.L, parcelableArrayList));
                    rw81Var.b = du81Var.x;
                    rw81Var.c = wk71Var;
                    rw81Var.w = 0L;
                }
                du81Var.e();
                this.c = 0;
                return rw81Var;
            }
        }
        return null;
    }

    @Override // defpackage.c581
    public final void b(du81 du81Var) {
        if (this.d) {
            ny61.k();
            return;
        }
        if (this.c != 1) {
            ny61.k();
        } else if (this.a == du81Var) {
            this.c = 2;
        } else {
            w511.q();
        }
    }

    @Override // defpackage.c581
    public final void flush() {
        if (this.d) {
            ny61.k();
        } else {
            this.a.e();
            this.c = 0;
        }
    }

    @Override // defpackage.c581
    public final void release() {
        this.d = true;
    }

    @Override // defpackage.c581
    public final Object b() {
        if (!this.d) {
            if (this.c != 0) {
                return null;
            }
            this.c = 1;
            return this.a;
        }
        ny61.k();
        return null;
    }

    @Override // defpackage.pk81
    public final void a(long j) {
    }
}
