package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.preorder.address.e;
import com.yandex.go.preorder.lifecycle.f;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.a;
import com.yandex.messaging.internal.translator.b;
import com.yandex.messaging.internal.translator.g;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.main.map.c;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.summary.solid.interactors.y;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class qcb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;

    public /* synthetic */ qcb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.l;
        xvf0 xvf0Var2 = this.m;
        xvf0 xvf0Var3 = this.k;
        xvf0 xvf0Var4 = this.j;
        xvf0 xvf0Var5 = this.i;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.g;
        xvf0 xvf0Var8 = this.f;
        xvf0 xvf0Var9 = this.e;
        xvf0 xvf0Var10 = this.d;
        xvf0 xvf0Var11 = this.c;
        xvf0 xvf0Var12 = this.b;
        switch (i) {
            case 0:
                return new pcb((Lifecycle) xvf0Var12.get(), (ChatRequest) xvf0Var11.get(), (k) xvf0Var10.get(), (g) xvf0Var9.get(), (bcb) xvf0Var8.get(), (mdb) xvf0Var7.get(), (a) xvf0Var6.get(), (vet) xvf0Var5.get(), (bcb) xvf0Var4.get(), (b) xvf0Var3.get(), (gzw) xvf0Var.get(), (nz01) xvf0Var2.get());
            case 1:
                return new z7i((Context) xvf0Var12.get(), (i130) xvf0Var11.get(), (t8i) xvf0Var10.get(), (l8i) xvf0Var9.get(), (lx4) xvf0Var8.get(), (wiq0) xvf0Var7.get(), (uq1) xvf0Var6.get(), (rqo) xvf0Var5.get(), (b8r) xvf0Var4.get(), (c4r0) xvf0Var3.get(), (zof) xvf0Var.get(), (oep0) xvf0Var2.get());
            case 2:
                return new y((rqo) xvf0Var12.get(), (hqj0) xvf0Var11.get(), (dqe0) xvf0Var10.get(), (cjj0) xvf0Var9.get(), (i2s) xvf0Var8.get(), (c4r0) xvf0Var7.get(), (slh) xvf0Var6.get(), (ck31) xvf0Var5.get(), (tt2) xvf0Var4.get(), (oep0) xvf0Var3.get(), this.l, i5m.a(xvf0Var2));
            case 3:
                return new c((axt) xvf0Var12.get(), (ru.yandex.taxi.persuggest.source.g) xvf0Var11.get(), (i) xvf0Var10.get(), (q9j0) xvf0Var9.get(), (tt2) xvf0Var8.get(), (rwt) xvf0Var7.get(), (xwt) xvf0Var6.get(), (oyb0) xvf0Var5.get(), (er3) xvf0Var4.get(), (ir3) xvf0Var3.get(), (c9l0) xvf0Var.get(), (zuj0) xvf0Var2.get());
            case 4:
                return new fn6((String) xvf0Var12.get(), (ml21) xvf0Var11.get(), (pe51) xvf0Var10.get(), (fe51) xvf0Var9.get(), (ke51) xvf0Var8.get(), (yi3) xvf0Var7.get(), (de51) xvf0Var6.get(), (c370) xvf0Var5.get(), (ouf0) xvf0Var4.get(), (Moshi) xvf0Var3.get(), (rz10) xvf0Var.get(), i5m.a(xvf0Var2));
            case 5:
                return new y0l0(i5m.a(xvf0Var12), (ysg) xvf0Var11.get(), (w) xvf0Var10.get(), (ga9) xvf0Var9.get(), (b20) xvf0Var8.get(), (ci70) xvf0Var7.get(), (yze0) xvf0Var6.get(), (com.yandex.go.taxi.order.recalculation.domain.a) xvf0Var5.get(), (j2y0) xvf0Var4.get(), (c2y0) xvf0Var3.get(), (m2y0) xvf0Var.get(), (opw) xvf0Var2.get());
            case 6:
                return new chn0((qwo0) xvf0Var12.get(), (ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.a) xvf0Var11.get(), (u) xvf0Var10.get(), (thn0) xvf0Var9.get(), (i6o0) xvf0Var8.get(), (h) xvf0Var7.get(), (y6p0) xvf0Var6.get(), (ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.a) xvf0Var5.get(), (ru.yandex.taxi.scooters.data.g) xvf0Var4.get(), (x4o0) xvf0Var3.get(), (vvo0) xvf0Var.get(), (d) xvf0Var2.get());
            case 7:
                return new f((nzb0) xvf0Var12.get(), (jgt0) xvf0Var11.get(), (ru.yandex.taxi.clarifypoint.b) xvf0Var10.get(), (kqv0) xvf0Var9.get(), (ru.yandex.taxi.linked_order.a) xvf0Var8.get(), (r) xvf0Var7.get(), (net0) xvf0Var6.get(), (s) xvf0Var5.get(), (z3g0) xvf0Var4.get(), (e) xvf0Var3.get(), (cjt0) xvf0Var.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var2.get());
            case 8:
                return new cht0((vvx0) xvf0Var12.get(), (uq40) xvf0Var11.get(), (AddressResolveRepository) xvf0Var10.get(), (net0) xvf0Var9.get(), (biv0) xvf0Var8.get(), (yit0) xvf0Var7.get(), (v) xvf0Var6.get(), (jev0) xvf0Var5.get(), (ou7) xvf0Var4.get(), (kqv0) xvf0Var3.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var.get(), (uet0) xvf0Var2.get());
            case 9:
                hbz0 hbz0Var = (hbz0) xvf0Var12.get();
                com.yandex.messaging.internal.view.timeline.common.a aVar = (com.yandex.messaging.internal.view.timeline.common.a) xvf0Var11.get();
                tdz0 tdz0Var = (tdz0) xvf0Var10.get();
                ChatInputHeightState chatInputHeightState = (ChatInputHeightState) xvf0Var9.get();
                dbb dbbVar = (dbb) xvf0Var8.get();
                com.yandex.messaging.input.c cVar = (com.yandex.messaging.input.c) xvf0Var7.get();
                vse vseVar = (vse) xvf0Var6.get();
                return new com.yandex.messaging.ui.timeline.d(hbz0Var, aVar, tdz0Var, chatInputHeightState, dbbVar, cVar, vseVar, (mdb) xvf0Var4.get(), (com.yandex.messaging.domain.personal.mentions.a) xvf0Var3.get(), (ChatRequest) xvf0Var.get(), (com.yandex.messaging.internal.view.timeline.i) xvf0Var2.get());
            default:
                return new fn6((com.yandex.messaging.internal.storage.contacts.a) xvf0Var12.get(), (com.yandex.messaging.internal.avatar.a) xvf0Var11.get(), (xav) xvf0Var10.get(), (noy0) xvf0Var9.get(), (otx) xvf0Var8.get(), (jcz0) xvf0Var7.get(), (kse) xvf0Var6.get(), (sh21) xvf0Var5.get(), (jft) xvf0Var4.get(), (com.yandex.messaging.domain.user.b) xvf0Var3.get(), i5m.a(xvf0Var), (z5z) xvf0Var2.get());
        }
    }
}
