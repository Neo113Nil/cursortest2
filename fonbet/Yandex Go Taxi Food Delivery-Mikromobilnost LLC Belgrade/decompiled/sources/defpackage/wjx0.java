package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final /* synthetic */ class wjx0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ wjx0(LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = linkedHashMap;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (i) {
            case 0:
                pjx0 pjx0Var = (pjx0) obj;
                pex0 pex0Var = (pex0) linkedHashMap.get(pjx0Var.b);
                if (pex0Var != null) {
                    return new Pair(pjx0Var, pex0Var);
                }
                return null;
            default:
                return (pex0) linkedHashMap.get((String) obj);
        }
    }
}
