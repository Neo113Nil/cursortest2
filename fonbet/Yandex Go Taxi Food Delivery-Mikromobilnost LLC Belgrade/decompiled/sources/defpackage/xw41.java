package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class xw41 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : extensions) {
                if (jl40.l(((bpk) obj).a, "weight_ext")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                view.setLayoutParams(new DivLayoutParams((ViewGroup.MarginLayoutParams) new LinearLayout.LayoutParams(0, 0, 1.0f)));
            }
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        Boolean bool;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            List list = extensions;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((bpk) it.next()).a, "weight_ext")) {
                        z = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return n891.o(bool);
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }
}
