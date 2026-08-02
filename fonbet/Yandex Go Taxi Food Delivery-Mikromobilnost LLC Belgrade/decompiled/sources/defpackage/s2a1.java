package defpackage;

import com.yandex.go.eboks.objects.data.model.EboksObjectsDto;
import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import com.yandex.go.eboks.objects.data.model.EboksObjectsSet;
import com.yandex.go.eboks.objects.data.model.EboksRowanDto;
import com.yandex.go.eboks.objects.data.model.EboksRowanObjectsSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public abstract class s2a1 {
    public static void a(EbsLogger ebsLogger, Exception exc, Exception exc2, a7p a7pVar) {
        ebsLogger.error(exc);
        a7pVar.emit(new Event.Error(exc2));
    }

    public static final dn60 b(int i) {
        return new dn60(i, 11, (byte) 0);
    }

    public static final int c(EboksObjectsResponse eboksObjectsResponse) {
        int i;
        List list;
        List list2;
        EboksObjectsDto eboksObjectsDto = eboksObjectsResponse.a;
        int i2 = 0;
        if (eboksObjectsDto == null || (list2 = eboksObjectsDto.c) == null) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List list3 = ((EboksObjectsSet) it.next()).b;
                if (list3 != null) {
                    arrayList.add(list3);
                }
            }
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((List) it2.next()).size();
            }
        }
        EboksRowanDto eboksRowanDto = eboksObjectsResponse.b;
        if (eboksRowanDto != null && (list = eboksRowanDto.b) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                List list4 = ((EboksRowanObjectsSet) it3.next()).b;
                if (list4 != null) {
                    arrayList2.add(list4);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                i2 += ((List) it4.next()).size();
            }
        }
        return i + i2;
    }

    public static final f530 d(f530 f530Var, tls tlsVar) {
        return f530Var.k(new yjo(tlsVar));
    }
}
