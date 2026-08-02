package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class qgh implements l190 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.l190
    public final void addOverlay(String str, tkr tkrVar) {
        this.a.put(str, tkrVar);
    }

    @Override // defpackage.l190
    public final boolean contains(String str) {
        return this.a.containsKey(str);
    }

    @Override // defpackage.l190
    public final tkr evictOverlay(String str) {
        return (tkr) this.a.remove(str);
    }

    @Override // defpackage.l190
    public final tkr getOverlay(String str) {
        return (tkr) this.a.get(str);
    }
}
