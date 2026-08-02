package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d8l {
    public static final d8l b;
    public static final String c;
    public final xgc a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        vq1.A(!false);
        b = new d8l(new xgc(sparseBooleanArray));
        int i = dvt.a;
        c = Integer.toString(0, 36);
    }

    public d8l(xgc xgcVar) {
        this.a = xgcVar;
    }

    public static d8l b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int intValue = integerArrayList.get(i).intValue();
            vq1.A(!false);
            sparseBooleanArray.append(intValue, true);
        }
        vq1.A(!false);
        return new d8l(new xgc(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            xgc xgcVar = this.a;
            if (i >= xgcVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(xgcVar.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d8l) {
            return this.a.equals(((d8l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
