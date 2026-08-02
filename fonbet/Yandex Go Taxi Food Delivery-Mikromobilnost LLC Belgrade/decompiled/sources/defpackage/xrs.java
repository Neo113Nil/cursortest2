package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivGallery;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class xrs implements dpk {
    public final Context a;
    public final a b;
    public final WeakHashMap c = new WeakHashMap();
    public final WeakHashMap w = new WeakHashMap();
    public final i3y x = kotlin.a.a(new dnr(13, this));

    public xrs(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public static final void a(xrs xrsVar, String str, int i) {
        if (str == null) {
            return;
        }
        xrsVar.b.i(new y131(str, (long) (i / ((Number) xrsVar.x.getValue()).floatValue())));
    }

    public static RecyclerView b(ViewGroup viewGroup) {
        RecyclerView b;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (b = b((ViewGroup) childAt)) != null) {
                return b;
            }
        }
        return null;
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        List extensions;
        RecyclerView recyclerView;
        Object obj;
        JSONObject jSONObject;
        ArrayList arrayList;
        if (matches(egkVar) && (extensions = egkVar.getExtensions()) != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, GalleryScrollPositionExtensionHandler.EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            Object opt = jSONObject.opt(GalleryScrollPositionExtensionHandler.PARAM_SCROLL_OFFSET_X);
            String str = opt instanceof String ? (String) opt : null;
            Object opt2 = jSONObject.opt(GalleryScrollPositionExtensionHandler.PARAM_SCROLL_OFFSET_Y);
            String str2 = opt2 instanceof String ? (String) opt2 : null;
            Object opt3 = jSONObject.opt(GalleryScrollPositionExtensionHandler.PARAM_SCROLL_REMAINING_X);
            String str3 = opt3 instanceof String ? (String) opt3 : null;
            Object opt4 = jSONObject.opt(GalleryScrollPositionExtensionHandler.PARAM_SCROLL_REMAINING_Y);
            String str4 = opt4 instanceof String ? (String) opt4 : null;
            u2l u2lVar = new u2l(eg90.b);
            JSONArray optJSONArray = jSONObject.optJSONArray(GalleryScrollPositionExtensionHandler.PARAM_ON_DID_SCROLL);
            if (optJSONArray != null) {
                d6w n = y6i0.n(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(tcc.n(n, 10));
                c6w it2 = n.iterator();
                while (it2.c) {
                    int nextInt = it2.nextInt();
                    kvo kvoVar = v3k.m;
                    arrayList2.add(kp50.p(u2lVar, optJSONArray.getJSONObject(nextInt)));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            c(view);
            if (view instanceof RecyclerView) {
                recyclerView = (RecyclerView) view;
            } else if (view instanceof ViewGroup) {
                WeakHashMap weakHashMap = this.w;
                WeakReference weakReference = (WeakReference) weakHashMap.get(view);
                recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
                if (recyclerView == null && (recyclerView = b((ViewGroup) view)) != null) {
                    weakHashMap.put(view, new WeakReference(recyclerView));
                }
            }
            if (recyclerView != null) {
                wrs wrsVar = new wrs(this, str, str2, str3, str4, arrayList, rvoVar, div2View);
                recyclerView.addOnScrollListener(wrsVar);
                this.c.put(recyclerView, new vrs(wrsVar));
            }
        }
    }

    public final void c(View view) {
        WeakReference weakReference;
        RecyclerView recyclerView;
        vrs vrsVar;
        WeakHashMap weakHashMap = this.c;
        vrs vrsVar2 = (vrs) weakHashMap.remove(view);
        if (vrsVar2 != null && (view instanceof RecyclerView)) {
            ((RecyclerView) view).removeOnScrollListener(vrsVar2.a);
        } else {
            if (!(view instanceof ViewGroup) || (weakReference = (WeakReference) this.w.get(view)) == null || (recyclerView = (RecyclerView) weakReference.get()) == null || (vrsVar = (vrs) weakHashMap.remove(recyclerView)) == null) {
                return;
            }
            recyclerView.removeOnScrollListener(vrsVar.a);
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List list;
        if (!(egkVar instanceof DivGallery) || (list = ((DivGallery) egkVar).n) == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, GalleryScrollPositionExtensionHandler.EXTENSION_ID)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        c(view);
        this.w.remove(view);
    }
}
