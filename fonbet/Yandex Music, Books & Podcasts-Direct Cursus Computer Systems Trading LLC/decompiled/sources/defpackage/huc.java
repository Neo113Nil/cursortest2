package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class huc extends quj {
    public final LinkedHashMap h = new LinkedHashMap();
    public boolean i = true;

    @Override // defpackage.quj
    public final void d0(y yVar, o oVar) {
        oVar.getClass();
        n0(oVar);
    }

    @Override // defpackage.quj
    public final void f0(y yVar, o oVar, Bundle bundle) {
        oVar.getClass();
        if (this.i) {
            LinkedHashMap linkedHashMap = this.h;
            linkedHashMap.put(oVar, bundle);
            if (linkedHashMap.size() >= 5) {
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
        }
    }

    @Override // defpackage.quj
    public final void g0(y yVar, o oVar) {
        oVar.getClass();
        n0(oVar);
    }

    public final void n0(o oVar) {
        Bundle bundle = (Bundle) this.h.remove(oVar);
        if (bundle != null) {
            oVar.getClass();
            String o = ouj.o(oVar.getClass().getSimpleName(), ".onSaveInstanceState() bundle: ", v3g.v(bundle));
            Bundle arguments = oVar.getArguments();
            if (arguments != null) {
                o = ouj.o(o, "\n* fragment arguments = ", v3g.v(arguments));
            }
            ssg.a(3, "TransactionTooLargeHelper", o, null);
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.writeBundle(bundle);
                int dataSize = obtain.dataSize();
                obtain.recycle();
                Bundle arguments2 = oVar.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                obtain = Parcel.obtain();
                obtain.getClass();
                try {
                    obtain.writeBundle(arguments2);
                    int dataSize2 = obtain.dataSize();
                    obtain.recycle();
                    if (dataSize + dataSize2 > 200000) {
                        dfi.r("Bundle size is too large", "TransactionTooLargeHelper");
                    }
                } finally {
                }
            } finally {
            }
        }
    }
}
