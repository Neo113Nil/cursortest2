package defpackage;

import android.net.Uri;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.ybsdk.deeplink.generated.CloseSdkWithResultAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class snb1 {
    public static final void a(f530 f530Var, ButtonSize buttonSize, sls slsVar, fid fidVar, int i, int i2) {
        ButtonSize buttonSize2;
        ButtonSize buttonSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1691563883);
        int i3 = i | (btsVar.k(f530Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 32 : 16;
        }
        int i5 = i3 | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            } else if (i4 != 0) {
                buttonSize3 = ButtonSize.L;
                btsVar.u();
                m8d.a.getClass();
                a aVar = m8d.b;
                int i6 = (i5 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT;
                int i7 = i5 << 3;
                y4b1.a(f530Var, null, buttonSize3, slsVar, aVar, btsVar, i6 | (i7 & 896) | (i7 & 7168), 2);
                buttonSize2 = buttonSize3;
            }
            buttonSize3 = buttonSize;
            btsVar.u();
            m8d.a.getClass();
            a aVar2 = m8d.b;
            int i62 = (i5 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT;
            int i72 = i5 << 3;
            y4b1.a(f530Var, null, buttonSize3, slsVar, aVar2, btsVar, i62 | (i72 & 896) | (i72 & 7168), 2);
            buttonSize2 = buttonSize3;
        } else {
            btsVar.Y();
            buttonSize2 = buttonSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var, (Object) buttonSize2, (Object) slsVar, i, i2, 22);
        }
    }

    public static CloseSdkWithResultAction b(Uri uri) {
        String queryParameter = uri.getQueryParameter("scenario");
        if (queryParameter == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!Collections.singleton("scenario").contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter2 = uri.getQueryParameter((String) next);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap.put(next, queryParameter2);
        }
        return new CloseSdkWithResultAction(queryParameter, linkedHashMap.isEmpty() ? null : linkedHashMap);
    }
}
