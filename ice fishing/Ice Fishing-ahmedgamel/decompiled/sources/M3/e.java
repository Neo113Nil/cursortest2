package M3;

import android.os.Bundle;
import android.os.Parcel;
import c3.AbstractC0549a;
import f3.AbstractC4518a;

/* loaded from: classes2.dex */
public final class e extends AbstractC0549a implements g {
    /* JADX WARN: Multi-variable type inference failed */
    public final void r1(String str, String str2, String str3, Bundle bundle, h hVar) {
        Parcel t02 = t0();
        t02.writeString(str);
        t02.writeString(str2);
        t02.writeString(str3);
        int i = AbstractC4518a.f37439a;
        t02.writeInt(1);
        bundle.writeToParcel(t02, 0);
        if (hVar == 0) {
            t02.writeStrongBinder(null);
        } else {
            t02.writeStrongBinder(hVar);
        }
        D0(t02, 2);
    }
}
