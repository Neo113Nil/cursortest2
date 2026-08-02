package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface ze9 {
    public static final ye9 a = new ye9();

    jf9 a(ArrayList arrayList);

    default jf9 b(ArrayList arrayList, Function1 function1) {
        jf9 a2 = a(arrayList);
        uej uejVar = new uej("Please implement DivPlayerPreloader.preloadVideo(src, callback)!");
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ipt((Uri) it.next(), uejVar));
        }
        function1.invoke(arrayList2);
        return a2;
    }
}
