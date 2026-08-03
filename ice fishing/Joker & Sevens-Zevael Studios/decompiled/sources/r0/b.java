package r0;

import java.util.NoSuchElementException;
import l1.f0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends a implements qc.d {

    /* renamed from: j, reason: collision with root package name */
    public final f0 f5899j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5900k;

    public b(f0 f0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f5899j = f0Var;
        this.f5900k = obj2;
    }

    @Override // r0.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f5900k;
    }

    @Override // r0.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f5900k;
        this.f5900k = obj;
        e eVar = (e) this.f5899j.f4001h;
        u0.h hVar = eVar.f5907j;
        Object obj3 = this.f5897h;
        if (!hVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = eVar.f5906i;
        if (!z10) {
            hVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = eVar.f5904g[eVar.f5905h];
            Object obj4 = lVar.f5921g[lVar.f5923i];
            hVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, hVar.f6673h, obj4, 0);
        }
        eVar.f5910m = hVar.f6675j;
        return obj2;
    }
}
