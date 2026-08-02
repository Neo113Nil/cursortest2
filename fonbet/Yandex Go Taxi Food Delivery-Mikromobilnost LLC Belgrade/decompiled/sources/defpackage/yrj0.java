package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class yrj0 implements xrj0 {
    public final /* synthetic */ Size a;

    public yrj0(Size size) {
        this.a = size;
    }

    @Override // defpackage.xrj0
    public final List a(ArrayList arrayList) {
        Size size = this.a;
        int indexOf = arrayList.indexOf(size);
        if (indexOf > -1) {
            arrayList.remove(indexOf);
            arrayList.add(0, size);
        }
        return arrayList;
    }
}
