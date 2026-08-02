package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final /* synthetic */ class ux00 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ux00(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int size;
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                size = arrayList.size();
                break;
            default:
                size = arrayList.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
