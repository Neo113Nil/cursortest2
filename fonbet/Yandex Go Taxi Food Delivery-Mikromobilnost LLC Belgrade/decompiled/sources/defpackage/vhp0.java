package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.urbanads.internal.divkit.extensions.scrollinteraction.ScrollInteractionTouchListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vhp0 implements dpk {
    public static RecyclerView a(View view) {
        while (true) {
            View view2 = null;
            if (view == null || (view instanceof RecyclerView)) {
                break;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                if (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt == null) {
                        ny61.s();
                        return null;
                    }
                    view2 = childAt;
                } else {
                    continue;
                }
            }
            view = view2;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        return null;
    }

    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ArrayList arrayList;
        Object obj;
        JSONObject jSONObject;
        RecyclerView a;
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
            if (bpkVar == null || (jSONObject = bpkVar.b) == null || (a = a(view)) == null) {
                return;
            }
            u2l u2lVar = new u2l(eg90.b);
            JSONArray optJSONArray = jSONObject.optJSONArray("onFocus");
            int i = 0;
            if (optJSONArray != null) {
                arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        kvo kvoVar = v3k.m;
                        arrayList2.add(kp50.p(u2lVar, optJSONObject));
                    }
                }
            } else {
                arrayList2 = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("onBlur");
            if (optJSONArray2 != null) {
                arrayList = new ArrayList();
                int length2 = optJSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        kvo kvoVar2 = v3k.m;
                        arrayList.add(kp50.p(u2lVar, optJSONObject2));
                    }
                }
            }
            a.setOnTouchListener(new ScrollInteractionTouchListener(new thp0(arrayList2, div2View, rvoVar, i), new thp0(arrayList, div2View, rvoVar, 1)));
        }
    }

    @Override // defpackage.dpk
    public final void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
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
    public final void preprocess(egk egkVar, rvo rvoVar) {
    }

    @Override // defpackage.dpk
    public final void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        RecyclerView a = a(view);
        if (a != null) {
            a.setOnTouchListener(null);
        }
    }
}
