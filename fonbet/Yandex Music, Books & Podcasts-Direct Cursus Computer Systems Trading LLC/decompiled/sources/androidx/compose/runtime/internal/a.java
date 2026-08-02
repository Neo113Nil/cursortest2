package androidx.compose.runtime.internal;

import defpackage.aat;
import defpackage.as5;
import defpackage.dmk;
import defpackage.ozm;
import defpackage.qlk;
import defpackage.vlk;
import defpackage.vwt;
import defpackage.xlk;

/* loaded from: classes.dex */
public final class a extends vlk implements dmk, as5 {
    public static final a g = new a(aat.e, 0);

    @Override // defpackage.vlk, defpackage.dmk
    public final xlk builder() {
        qlk qlkVar = new qlk(this);
        qlkVar.g = this;
        return qlkVar;
    }

    @Override // defpackage.vlk, kotlin.collections.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ozm) {
            return super.containsKey((ozm) obj);
        }
        return false;
    }

    @Override // kotlin.collections.b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof vwt) {
            return super.containsValue((vwt) obj);
        }
        return false;
    }

    @Override // defpackage.vlk
    /* renamed from: e */
    public final xlk builder() {
        qlk qlkVar = new qlk(this);
        qlkVar.g = this;
        return qlkVar;
    }

    @Override // defpackage.vlk, kotlin.collections.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ozm) {
            return (vwt) super.get((ozm) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ozm) ? obj2 : (vwt) super.getOrDefault((ozm) obj, (vwt) obj2);
    }
}
