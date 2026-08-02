package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class z5i extends zhp {
    public final List a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z5i(String str, ArrayList arrayList) {
        super(r5, null);
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = ouj.q(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this.a = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5i(List list, String str, z5i z5iVar) {
        super(str, z5iVar);
        list.getClass();
        this.a = list;
    }
}
