package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vx41 {
    public final int a;
    public final ArrayList b;
    public final p1y c;

    public vx41(int i, ArrayList arrayList, p1y p1yVar) {
        this.a = i;
        this.b = arrayList;
        this.c = p1yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx41)) {
            return false;
        }
        vx41 vx41Var = (vx41) obj;
        return this.a == vx41Var.a && this.b.equals(vx41Var.b) && this.c.equals(vx41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "WheelPickerColumn(selectedIndex=" + this.a + ", options=" + this.b + ", layoutPolicy=" + this.c + Extension.C_BRAKE;
    }
}
