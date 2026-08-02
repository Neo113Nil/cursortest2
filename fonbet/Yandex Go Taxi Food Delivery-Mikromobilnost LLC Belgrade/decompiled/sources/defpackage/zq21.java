package defpackage;

import android.content.Context;
import com.yandex.go.navigation.activity.b;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import com.yandex.go.ui.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class zq21 extends a {
    public final Context F;
    public final y50 G;
    public final er21 H;
    public final jr21 I;
    public final vt7 J;
    public final b K;
    public final w030 L;
    public final i3y M;
    public final boolean N;

    public zq21(Context context, y50 y50Var, er21 er21Var, jr21 jr21Var, vt7 vt7Var, b bVar, w030 w030Var) {
        super(null);
        this.F = context;
        this.G = y50Var;
        this.H = er21Var;
        this.I = jr21Var;
        this.J = vt7Var;
        this.K = bVar;
        this.L = w030Var;
        this.M = kotlin.a.a(new pv01(20, this));
        this.N = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.L;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.N;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        d dVar = (d) this.M.getValue();
        s421 s421Var = this.H.a;
        return new UserPhotoUploadingModalView((Context) ((icg) s421Var.b).get(), dVar, (ip11) ((icg) s421Var.c).get(), (eq21) ((fq21) s421Var.w).get(), (pav) ((icg) s421Var.x).get());
    }
}
