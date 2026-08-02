package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.f;

/* loaded from: classes12.dex */
public final class t7w0 implements ozi {
    public final /* synthetic */ f a;
    public final /* synthetic */ AdditionalAction b;
    public final /* synthetic */ String c;

    public t7w0(f fVar, AdditionalAction additionalAction, String str) {
        this.a = fVar;
        this.b = additionalAction;
        this.c = str;
    }

    @Override // defpackage.ozi
    public final void X() {
        f.P(this.a, this.b, this.c);
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.R(false);
    }
}
