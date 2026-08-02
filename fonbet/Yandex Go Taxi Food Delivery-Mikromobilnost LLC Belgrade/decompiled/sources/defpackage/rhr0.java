package defpackage;

import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class rhr0 {
    public static final hzk a = hzk.n("nm", "hd", "it");

    public static qhr0 a(c cVar, nsz nszVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                z = cVar.nextBoolean();
            } else if (o != 2) {
                cVar.skipValue();
            } else {
                cVar.a();
                while (cVar.hasNext()) {
                    ehe a2 = fhe.a(cVar, nszVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                cVar.d();
            }
        }
        return new qhr0(str, arrayList, z);
    }
}
