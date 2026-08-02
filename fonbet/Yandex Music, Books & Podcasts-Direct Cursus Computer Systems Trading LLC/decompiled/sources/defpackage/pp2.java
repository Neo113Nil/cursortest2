package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class pp2 implements ok0 {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ pp2(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.ok0
    public List b() {
        return this.b;
    }

    @Override // defpackage.ok0
    public boolean c() {
        List list = this.b;
        return list.isEmpty() || (list.size() == 1 && ((acf) list.get(0)).c());
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
