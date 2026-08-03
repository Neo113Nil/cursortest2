package v;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6943a;

    static {
        x4.s sVar = i1.f6864b;
        Float valueOf = Float.valueOf(1.0f);
        ac.i iVar = new ac.i(sVar, valueOf);
        ac.i iVar2 = new ac.i(i1.f6870h, valueOf);
        ac.i iVar3 = new ac.i(i1.f6869g, valueOf);
        ac.i iVar4 = new ac.i(i1.f6863a, Float.valueOf(0.01f));
        x4.s sVar2 = i1.f6871i;
        Float valueOf2 = Float.valueOf(0.5f);
        ac.i iVar5 = new ac.i(sVar2, valueOf2);
        ac.i iVar6 = new ac.i(i1.f6867e, valueOf2);
        ac.i iVar7 = new ac.i(i1.f6868f, valueOf2);
        x4.s sVar3 = i1.f6865c;
        Float valueOf3 = Float.valueOf(0.1f);
        ac.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, new ac.i(sVar3, valueOf3), new ac.i(i1.f6866d, valueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(bc.a0.B(9));
        bc.z.O(linkedHashMap, iVarArr);
        f6943a = linkedHashMap;
    }
}
