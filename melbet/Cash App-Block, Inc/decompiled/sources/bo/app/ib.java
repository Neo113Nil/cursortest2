package bo.app;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ib extends ua {
    public ib(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((f9) obj).a(v9Var)) {
                return true;
            }
        }
        return false;
    }
}
