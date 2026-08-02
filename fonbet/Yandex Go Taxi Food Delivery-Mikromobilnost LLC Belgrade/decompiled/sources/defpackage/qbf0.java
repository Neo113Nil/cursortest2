package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qbf0 {
    public final ArrayList a;
    public final float b;
    public final float c;
    public final float d;
    public final List e;

    public qbf0(ArrayList arrayList, float f, float f2, float f3, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = arrayList2;
    }

    public final gbf0 a(Context context) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((obf0) arrayList.get(i)).a.get(context);
        }
        int size2 = arrayList.size();
        float[] fArr = new float[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            fArr[i2] = ((obf0) arrayList.get(i2)).b;
        }
        return new gbf0(iArr, fArr, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbf0)) {
            return false;
        }
        qbf0 qbf0Var = (qbf0) obj;
        return this.a.equals(qbf0Var.a) && Float.compare(this.b, qbf0Var.b) == 0 && Float.compare(this.c, qbf0Var.c) == 0 && Float.compare(this.d, qbf0Var.d) == 0 && jl40.l(this.e, qbf0Var.e);
    }

    public final int hashCode() {
        int c = g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        List list = this.e;
        return c + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientLayer(colorStops=");
        sb.append(this.a);
        sb.append(", centerXFraction=");
        sb.append(this.b);
        sb.append(", centerYFraction=");
        vfc.x(sb, this.c, ", radiusFraction=", this.d, ", keyframes=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
