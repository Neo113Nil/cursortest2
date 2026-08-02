package defpackage;

import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nu9 extends kpj {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu9(BouncerActivity bouncerActivity, l lVar) {
        super(true);
        this.c = bouncerActivity;
        this.d = lVar;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        switch (this.b) {
            case 0:
                ((qu9) this.c).c(((iu9) this.d).h);
                return;
            default:
                BouncerActivity bouncerActivity = (BouncerActivity) this.c;
                c cVar = bouncerActivity.b;
                if (cVar == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                if (cVar.getBouncerRenderer().b() || ((l) this.d).p.c) {
                    return;
                }
                setEnabled(false);
                bouncerActivity.getOnBackPressedDispatcher().d();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu9(qu9 qu9Var, iu9 iu9Var, gc8 gc8Var) {
        super(true);
        this.c = qu9Var;
        this.d = iu9Var;
    }
}
