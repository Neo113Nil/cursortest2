package defpackage;

import com.yandex.go.suggest.impl.data.a;
import com.yandex.go.suggest.impl.data.flex.actions.EnableSearchSectionLoadingStateAction;
import com.yandex.go.suggest.impl.data.flex.actions.PatchSearchRequestResultDataAction;
import com.yandex.go.suggest.impl.data.flex.actions.SubstituteAction;
import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction;
import com.yandex.go.suggest.impl.data.flex.variables.b;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class zew0 implements dw {
    public final gfw0 a;
    public final b b;
    public final a c;

    public zew0(gfw0 gfw0Var, b bVar, a aVar) {
        this.a = gfw0Var;
        this.b = bVar;
        this.c = aVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        yew0 yew0Var = (yew0) krVar;
        boolean z = yew0Var instanceof EnableSearchSectionLoadingStateAction;
        b bVar = this.b;
        if (z) {
            bVar.b(((EnableSearchSectionLoadingStateAction) yew0Var).a);
            return;
        }
        if (yew0Var instanceof UpdateSearchSectionsStateAction) {
            bVar.e(((UpdateSearchSectionsStateAction) yew0Var).a);
            return;
        }
        if (yew0Var instanceof SubstituteAction) {
            SubstituteAction substituteAction = (SubstituteAction) yew0Var;
            this.c.a(substituteAction.a, substituteAction.b, substituteAction.c);
            return;
        }
        if (!(yew0Var instanceof PatchSearchRequestResultDataAction)) {
            w511.b();
            return;
        }
        Map map = ((PatchSearchRequestResultDataAction) yew0Var).a;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        gfw0 gfw0Var = this.a;
        gfw0Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            boolean J = evu0.J(str2);
            LinkedHashMap linkedHashMap = gfw0Var.e;
            if (J) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
        }
    }
}
