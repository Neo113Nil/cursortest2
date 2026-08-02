package defpackage;

import android.util.Log;
import com.yandex.passport.internal.social.a;

/* loaded from: classes.dex */
public final class kyw implements smd {
    public final int a;
    public final uww h;
    public final smd i;
    public final /* synthetic */ nyw j;

    public kyw(nyw nywVar, int i, uww uwwVar, a aVar) {
        this.j = nywVar;
        this.a = i;
        this.h = uwwVar;
        this.i = aVar;
    }

    @Override // defpackage.smd
    public final void X(h66 h66Var) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(h66Var)));
        this.j.m(h66Var, this.a);
    }
}
