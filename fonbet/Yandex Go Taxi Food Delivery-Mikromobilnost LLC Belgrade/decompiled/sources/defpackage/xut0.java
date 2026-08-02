package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.LocalVariable;
import com.ybsdk.feature.deeplink.api.actions.NotifyLocalVariablesChanged;
import com.ybsdk.feature.deeplink.api.actions.SetHeaderClickable;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class xut0 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ a c;

    public /* synthetic */ xut0(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, a aVar, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = aVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        r0 r0Var;
        Object value;
        int i = this.a;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                if (deeplink.getAction() instanceof SetHeaderClickable) {
                    SetHeaderClickable setHeaderClickable = (SetHeaderClickable) deeplink.getAction();
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, vut0.a((vut0) value, null, setHeaderClickable.isClickable(), null, 253)));
                }
                break;
            default:
                if (deeplink.getAction() instanceof NotifyLocalVariablesChanged) {
                    NotifyLocalVariablesChanged notifyLocalVariablesChanged = (NotifyLocalVariablesChanged) deeplink.getAction();
                    itt0 itt0Var = aVar.G;
                    List<LocalVariable> localVariables = notifyLocalVariablesChanged.getLocalVariables();
                    ArrayList arrayList = new ArrayList(tcc.n(localVariables, 10));
                    for (LocalVariable localVariable : localVariables) {
                        arrayList.add(new c5z(localVariable.getName(), localVariable.getValue()));
                    }
                    itt0Var.a = new ctt0(itt0Var.a.a, arrayList);
                    break;
                }
                break;
        }
        return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
    }
}
