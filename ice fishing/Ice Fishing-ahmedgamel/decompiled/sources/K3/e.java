package K3;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.Parcel;
import d3.AbstractC4446a;

/* loaded from: classes2.dex */
public final class e extends AbstractC0432a implements g {
    /* JADX WARN: Multi-variable type inference failed */
    public final void t1(String str, String str2, String str3, Bundle bundle, h hVar) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        int i = AbstractC4446a.f37037a;
        w02.writeInt(1);
        bundle.writeToParcel(w02, 0);
        if (hVar == 0) {
            w02.writeStrongBinder(null);
        } else {
            w02.writeStrongBinder(hVar);
        }
        F0(w02, 2);
    }
}
