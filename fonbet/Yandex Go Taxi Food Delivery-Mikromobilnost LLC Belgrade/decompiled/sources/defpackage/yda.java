package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yda implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wmh b;

    public /* synthetic */ yda(wmh wmhVar, int i) {
        this.a = i;
        this.b = wmhVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wmh wmhVar = this.b;
        switch (i) {
            case 0:
                wmhVar.a.l((List) obj);
                break;
            default:
                wmhVar.a.l((List) obj);
                break;
        }
        return zy11Var;
    }
}
