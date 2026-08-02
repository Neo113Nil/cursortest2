package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class rmk implements eg90 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ rmk(ArrayList arrayList, int i) {
        this.c = i;
        this.d = arrayList;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        int i = this.c;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                arrayList.add(new RuntimeException("Patch parsing non-critical error #" + (arrayList.size() + 1), exc));
                break;
            default:
                arrayList.add(exc);
                break;
        }
    }
}
