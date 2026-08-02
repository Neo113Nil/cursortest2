package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class wl81 extends ay4 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public wl81(int i, long j) {
        super(i, 7);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final wl81 j(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wl81 wl81Var = (wl81) arrayList.get(i2);
            if (wl81Var.b == i) {
                return wl81Var;
            }
        }
        return null;
    }

    public final hp81 k(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hp81 hp81Var = (hp81) arrayList.get(i2);
            if (hp81Var.b == i) {
                return hp81Var;
            }
        }
        return null;
    }

    @Override // defpackage.ay4
    public final String toString() {
        return ay4.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
