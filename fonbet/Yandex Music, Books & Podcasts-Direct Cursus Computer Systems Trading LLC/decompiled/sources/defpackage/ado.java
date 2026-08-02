package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ado {
    public final HashMap a = new HashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public final View a(jc8 jc8Var) {
        npb npbVar;
        int c = jc8Var.c();
        Integer valueOf = Integer.valueOf(c);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(valueOf, obj);
        }
        int intValue = ((Number) obj).intValue();
        LinkedList linkedList = (LinkedList) this.a.get(Integer.valueOf(c));
        if (linkedList == null || (npbVar = (npb) CollectionsKt.S(linkedList, intValue)) == null) {
            return null;
        }
        View view = npbVar.e;
        linkedHashMap.put(Integer.valueOf(c), Integer.valueOf(intValue + 1));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        return view;
    }
}
