package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class yio implements hsd0 {
    public final lho a;

    public yio(lho lhoVar) {
        this.a = lhoVar;
    }

    @Override // defpackage.hsd0
    public final void a(String str) {
        lho lhoVar = this.a;
        LinkedHashMap n = nnm.n(lhoVar, "from", str);
        n.put("_meta", lho.a(1, new HashMap()));
        lhoVar.d("PlusSmart.Content.Shown", n);
    }

    @Override // defpackage.hsd0
    public final void d(String str, String str2) {
        lho lhoVar = this.a;
        lhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("page_url", str2);
        linkedHashMap.put("_meta", lho.a(2, new HashMap()));
        lhoVar.d("PlusSmart.Content.Loading.Error", linkedHashMap);
    }

    @Override // defpackage.hsd0
    public final void f(String str) {
        lho lhoVar = this.a;
        LinkedHashMap n = nnm.n(lhoVar, "from", str);
        n.put("_meta", lho.a(1, new HashMap()));
        lhoVar.d("PlusSmart.Opened", n);
    }
}
