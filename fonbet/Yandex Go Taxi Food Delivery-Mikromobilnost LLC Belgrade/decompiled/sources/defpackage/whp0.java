package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.flex.common.extensions.ScrollInteractionTouchListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class whp0 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ArrayList arrayList;
        Object obj;
        JSONObject jSONObject;
        int i;
        ArrayList arrayList2;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "scrollInteraction")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            View view2 = view;
            while (true) {
                if (view2 == null || (view2 instanceof RecyclerView)) {
                    break;
                }
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                    view2 = null;
                } else {
                    view2 = viewGroup.getChildAt(0);
                    if (view2 == null) {
                        ny61.s();
                        return;
                    }
                }
            }
            final RecyclerView recyclerView = view2 instanceof RecyclerView ? (RecyclerView) view2 : null;
            if (recyclerView == null) {
                return;
            }
            u2l u2lVar = new u2l(eg90.b);
            JSONArray optJSONArray = jSONObject.optJSONArray("onFocus");
            if (optJSONArray != null) {
                ltx ltxVar = new ltx(u2lVar, 1);
                arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        arrayList2.add(ltxVar.invoke(optJSONObject));
                    }
                }
            } else {
                arrayList2 = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("onBlur");
            int i3 = 2;
            if (optJSONArray2 != null) {
                ltx ltxVar2 = new ltx(u2lVar, i3);
                ArrayList arrayList3 = new ArrayList();
                int length2 = optJSONArray2.length();
                for (i = 0; i < length2; i++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList3.add(ltxVar2.invoke(optJSONObject2));
                    }
                }
                arrayList = arrayList3;
            }
            recyclerView.setOnTouchListener(new ScrollInteractionTouchListener(new thp0(arrayList2, div2View, rvoVar, i3), new thp0(arrayList, div2View, rvoVar, 3)));
            tje.F(view).a(new f1k() { // from class: uhp0
                @Override // java.lang.AutoCloseable, java.io.Closeable
                public final void close() {
                    RecyclerView.this.setOnTouchListener(null);
                }
            });
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "scrollInteraction")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        tje.m(view);
    }
}
