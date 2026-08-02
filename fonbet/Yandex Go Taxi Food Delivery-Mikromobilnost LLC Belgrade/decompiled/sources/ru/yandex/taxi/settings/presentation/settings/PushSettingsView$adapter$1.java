package ru.yandex.taxi.settings.presentation.settings;

import defpackage.a1g0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u8w;
import defpackage.v3g0;
import defpackage.y5r0;
import defpackage.z0g0;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.settings.domain.d;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class PushSettingsView$adapter$1 extends FunctionReferenceImpl implements tls {
    public final void i(y5r0 y5r0Var) {
        a aVar = (a) this.receiver;
        aVar.getClass();
        z0g0 z0g0Var = y5r0Var.j;
        a1g0 a1g0Var = aVar.y.a;
        a1g0Var.getClass();
        if (!a1g0Var.a(z0g0Var.a())) {
            ((v3g0) aVar.Dg()).wc(z0g0Var);
            return;
        }
        d dVar = aVar.x;
        dVar.getClass();
        dVar.d(Collections.singletonList(y5r0Var));
        u8w u8wVar = aVar.A.b.a;
        u8wVar.getClass();
        u8wVar.a.a("PushSettings.Tapped", new HashMap(), 1, new HashMap());
        pzt0 pzt0Var = aVar.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.G = tje.N(aVar.Jg(), null, CoroutineStart.UNDISPATCHED, new PushSettingsPresenter$onSettingToggleRequested$1(null, aVar), 1);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((y5r0) obj);
        return zy11.a;
    }
}
