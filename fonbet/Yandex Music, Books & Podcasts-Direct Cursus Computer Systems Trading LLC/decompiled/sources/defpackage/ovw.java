package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.R3;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

/* loaded from: classes5.dex */
public final class ovw extends uif implements Function1 {
    public final /* synthetic */ fvw r;
    public final /* synthetic */ lm4 s;
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ R3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovw(fvw fvwVar, lm4 lm4Var, Bundle bundle, lvw lvwVar) {
        super(1);
        this.r = fvwVar;
        this.s = lm4Var;
        this.t = bundle;
        this.u = lvwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((is6) obj).getClass();
        return new Injector.b(this.r.fragmentViewModelComponentFactory().create(this.s, this.t, this.u));
    }
}
