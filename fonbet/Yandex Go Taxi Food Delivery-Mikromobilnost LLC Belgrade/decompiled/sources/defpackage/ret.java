package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.performance.impl.internal.MemoryMonitorImpl;
import com.yandex.go.litert.classification.a;
import com.yandex.go.navigator.events.g;
import com.yandex.go.route.interactor.c;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.internal.view.timeline.MissedHistoryAnimator;
import com.ybsdk.screens.menu.presentation.MenuFragment;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.preorder.tollroad.analytics.e;

/* loaded from: classes15.dex */
public final class ret implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public ret(hvt hvtVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public static ret a(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new ret(n3wVar, xvf0Var, xvf0Var2, 8);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new qet((kse) xvf0Var.get(), (ChatRequest) xvf0Var3.get(), (b) xvf0Var2.get());
            case 1:
                xvt xvtVar = (xvt) xvf0Var3.get();
                return new tut(xvtVar);
            case 2:
                return new dpv((g) xvf0Var3.get(), (x1l0) xvf0Var2.get(), (gpv) xvf0Var.get());
            case 3:
                return new m1w((j1w) xvf0Var3.get(), (InputTextController) xvf0Var2.get(), (Mesix) xvf0Var.get());
            case 4:
                return new r1s(18, (p220) xvf0Var3.get(), (q220) xvf0Var2.get(), (MessengerEnvironment) xvf0Var.get());
            case 5:
                return new gzw((p4t) xvf0Var3.get(), (nz01) xvf0Var2.get(), (q6b) xvf0Var.get());
            case 6:
                return new j0x((Context) xvf0Var3.get(), (c220) xvf0Var2.get(), (x22) xvf0Var.get());
            case 7:
                return new e((ru.yandex.taxi.preorder.tollroad.data.e) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (ptx) xvf0Var.get());
            case 8:
                return new a((Context) xvf0Var3.get(), (com.yandex.go.litert.service.a) xvf0Var2.get(), (yuy) xvf0Var.get());
            case 9:
                return new p1z((x22) xvf0Var.get(), (at2) xvf0Var3.get(), (com.yandex.messaging.internal.storage.contacts.a) xvf0Var2.get());
            case 10:
                return new r4z((Context) xvf0Var3.get(), (odu0) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 11:
                return new knz((jnz) xvf0Var3.get(), (tt2) xvf0Var2.get(), (bnz) xvf0Var.get());
            case 12:
                return new j900((zuj0) xvf0Var3.get(), (ru.yandex.taxi.e) xvf0Var2.get(), (f7w0) xvf0Var.get());
            case 13:
                return new com.yandex.go.preorder.header.g((c) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (ck31) xvf0Var.get());
            case 14:
                return new pe10(7, (Context) xvf0Var3.get(), (noy0) xvf0Var2.get(), (ij10) xvf0Var.get());
            case 15:
                return new MemoryMonitorImpl((Context) xvf0Var3.get(), (ni10) xvf0Var2.get(), (wi10) xvf0Var.get());
            case 16:
                return new ij10((rp21) xvf0Var3.get(), (z5z) xvf0Var2.get(), i5m.a(xvf0Var));
            case 17:
                return new MenuFragment((tw51) xvf0Var3.get(), (com.ybsdk.rconfig.b) xvf0Var2.get(), (qa60) xvf0Var.get());
            case 18:
                return new com.yandex.messaging.navigation.c((Fragment) xvf0Var3.get(), (vse) xvf0Var2.get(), (kse) xvf0Var.get());
            case 19:
                return new ya20((ru.yandex.taxi.preorder.source.pickup.a) xvf0Var3.get(), (ah00) xvf0Var2.get(), (ab20) xvf0Var.get());
            case 20:
                return new com.yandex.messaging.miniapps.js.listeners.b((ChatRequest) xvf0Var3.get(), (com.yandex.messaging.domain.botrequest.e) xvf0Var2.get(), (x22) xvf0Var.get());
            case 21:
                return new MissedHistoryAnimator((Activity) xvf0Var3.get(), (mp11) xvf0Var2.get(), (qbz0) xvf0Var.get());
            case 22:
                yaq0 yaq0Var = (yaq0) xvf0Var3.get();
                i6r i6rVar = (i6r) xvf0Var2.get();
                k6x k6xVar = (k6x) xvf0Var.get();
                yaq0Var.getClass();
                c0g c0gVar = (c0g) i6rVar;
                return new com.yandex.go.flex.common.actions.select_contact.di.a(yaq0Var, c0gVar, new taq0((vp21) c0gVar.z.a0.get(), c0gVar.N2()), new qgn0(12, k6xVar));
            case 23:
                return new ke30((tse) xvf0Var3.get(), (b7z0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 24:
                return new zj30((f) xvf0Var3.get(), (ah00) xvf0Var2.get(), (ak30) xvf0Var.get());
            case 25:
                return new ek30((d411) xvf0Var3.get(), (wu30) xvf0Var2.get(), (cw30) xvf0Var.get());
            case 26:
                Context context = (Context) xvf0Var3.get();
                return new ru.yandex.taxi.masstransit.stoproute.mapper.a((pdc) xvf0Var.get(), (zuj0) xvf0Var2.get(), context);
            case 27:
                return new ru.yandex.taxi.masstransit.paymentcards.c(i5m.a(xvf0Var3), (ru.yandex.taxi.am.g) xvf0Var2.get(), (sy00) xvf0Var.get());
            case 28:
                return new il40((Context) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (vmw0) xvf0Var.get());
            default:
                return new e100(20, (i6r) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (y9y0) xvf0Var.get());
        }
    }

    public /* synthetic */ ret(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
