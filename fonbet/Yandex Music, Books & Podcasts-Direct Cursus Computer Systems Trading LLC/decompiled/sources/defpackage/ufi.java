package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ufi extends ceg {
    public final long g;
    public final ArrayList h;
    public final ArrayList i;

    public ufi(int i, long j) {
        super(i, 4);
        this.g = j;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final vfi A(int i) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vfi vfiVar = (vfi) arrayList.get(i2);
            if (vfiVar.b == i) {
                return vfiVar;
            }
        }
        return null;
    }

    @Override // defpackage.ceg
    public final String toString() {
        return ceg.d(this.b) + " leaves: " + Arrays.toString(this.h.toArray()) + " containers: " + Arrays.toString(this.i.toArray());
    }

    public final ufi z(int i) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ufi ufiVar = (ufi) arrayList.get(i2);
            if (ufiVar.b == i) {
                return ufiVar;
            }
        }
        return null;
    }
}
