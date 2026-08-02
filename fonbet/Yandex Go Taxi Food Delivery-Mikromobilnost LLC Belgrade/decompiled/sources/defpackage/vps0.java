package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class vps0 {
    public static final y60 h = new y60(26);
    public static final y60 i = new y60(27);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final ups0[] c = new ups0[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public vps0(int i2) {
        this.a = i2;
    }

    public final void a(float f, int i2) {
        ups0 ups0Var;
        int i3 = this.d;
        ArrayList arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        ups0[] ups0VarArr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            ups0Var = ups0VarArr[i5];
        } else {
            ups0Var = new ups0();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        ups0Var.a = i6;
        ups0Var.b = i2;
        ups0Var.c = f;
        arrayList.add(ups0Var);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            ups0 ups0Var2 = (ups0) arrayList.get(0);
            int i10 = ups0Var2.b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    ups0VarArr[i11] = ups0Var2;
                }
            } else {
                ups0Var2.b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ups0 ups0Var = (ups0) arrayList.get(i4);
            i3 += ups0Var.b;
            if (i3 >= f) {
                return ups0Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((ups0) unr0.k(1, arrayList)).c;
    }
}
