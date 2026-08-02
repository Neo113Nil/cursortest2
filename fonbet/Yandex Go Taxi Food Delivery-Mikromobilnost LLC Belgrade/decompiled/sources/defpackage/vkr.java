package defpackage;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public final class vkr extends ukr {
    public final j0g a;
    public final pey b;
    public final sls c;

    public vkr(j0g j0gVar, FragmentActivity fragmentActivity, sls slsVar) {
        this.a = j0gVar;
        this.b = fragmentActivity;
        this.c = slsVar;
    }

    @Override // defpackage.ukr
    public final tkr create(j190 j190Var) {
        return new wkr(this.a, this.b, j190Var, this.c);
    }
}
