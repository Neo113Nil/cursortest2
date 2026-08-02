package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.di.EasyLoginSdkComponent;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

/* loaded from: classes5.dex */
public final class nvw extends uif implements Function1 {
    public final /* synthetic */ lm4 r;
    public final /* synthetic */ Bundle s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvw(lm4 lm4Var, Bundle bundle) {
        super(1);
        this.r = lm4Var;
        this.s = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((is6) obj).getClass();
        Injector injector = Injector.a;
        EasyLoginSdkComponent easyLoginSdkComponent = Injector.b;
        if (easyLoginSdkComponent != null) {
            return new Injector.a(easyLoginSdkComponent.activityViewModelComponentFactory().create(this.r, this.s));
        }
        xq0.x("applicationComponent is not initialized");
        return null;
    }
}
