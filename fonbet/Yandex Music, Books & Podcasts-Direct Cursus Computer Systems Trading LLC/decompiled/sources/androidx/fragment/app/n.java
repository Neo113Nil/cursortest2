package androidx.fragment.app;

import defpackage.ji;
import defpackage.yyc;

/* loaded from: classes.dex */
public final class n implements yyc {
    public final /* synthetic */ o a;

    public n(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.yyc
    public final Object apply(Object obj) {
        o oVar = this.a;
        Object obj2 = oVar.mHost;
        return obj2 instanceof ji ? ((ji) obj2).getActivityResultRegistry() : oVar.requireActivity().getActivityResultRegistry();
    }
}
