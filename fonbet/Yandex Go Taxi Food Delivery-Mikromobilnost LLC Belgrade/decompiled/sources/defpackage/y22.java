package defpackage;

import com.yandex.xplat.common.YSError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class y22 implements rwo {
    public final ArrayList a;
    public final km0 b;

    public y22(ArrayList arrayList, km0 km0Var) {
        this.a = arrayList;
        this.b = km0Var;
    }

    public final void a(iho ihoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ihoVar.b.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            Serializable b = mbb1.b((y3x) value);
            if (b != null) {
                linkedHashMap.put(str, b);
            }
        }
        jho.a.getClass();
        linkedHashMap.put(ClidProvider.TIMESTAMP, Long.valueOf(o450.a()));
        linkedHashMap.put("version", 1);
        for (Map.Entry entry2 : this.b.a().entrySet()) {
            Object value2 = entry2.getValue();
            linkedHashMap.put((String) entry2.getKey(), (String) value2);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qgo) it.next()).c(new c9v(16, "EVENTUS_".concat(ihoVar.a), linkedHashMap));
        }
    }

    public final md51 b(final iho ihoVar, md51 md51Var) {
        jho.a.getClass();
        final int i = 0;
        final v22 v22Var = new v22(o450.a(), i);
        a(ihoVar);
        md51 h = md51Var.h(new tls(this) { // from class: w22
            public final /* synthetic */ y22 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                v22 v22Var2 = v22Var;
                iho ihoVar2 = ihoVar;
                y22 y22Var = this.b;
                switch (i2) {
                    case 0:
                        y22Var.a(ihoVar2.d((lhn) v22Var2.invoke()));
                        break;
                    default:
                        y22Var.a(ihoVar2.a(((YSError) obj).getMessage(), (lhn) v22Var2.invoke()));
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 1;
        h.b(new tls(this) { // from class: w22
            public final /* synthetic */ y22 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                v22 v22Var2 = v22Var;
                iho ihoVar2 = ihoVar;
                y22 y22Var = this.b;
                switch (i22) {
                    case 0:
                        y22Var.a(ihoVar2.d((lhn) v22Var2.invoke()));
                        break;
                    default:
                        y22Var.a(ihoVar2.a(((YSError) obj).getMessage(), (lhn) v22Var2.invoke()));
                        break;
                }
                return zy11Var;
            }
        });
        return md51Var;
    }
}
