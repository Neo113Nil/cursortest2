package ru.yandex.taxi.communications.stories.domain;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.benefits_center.activation.data.b;
import defpackage.amp0;
import defpackage.aqf0;
import defpackage.et4;
import defpackage.gou0;
import defpackage.hpu0;
import defpackage.i3y;
import defpackage.jhu0;
import defpackage.kpu0;
import defpackage.lpu0;
import defpackage.m230;
import defpackage.m950;
import defpackage.mpu0;
import defpackage.npu0;
import defpackage.ogu0;
import defpackage.ptc;
import defpackage.ru4;
import defpackage.ruc;
import defpackage.spu0;
import defpackage.tje;
import defpackage.tlu0;
import defpackage.u45;
import defpackage.w030;
import defpackage.w511;
import defpackage.x3;
import defpackage.y50;
import defpackage.ykn0;
import defpackage.zq4;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.stories.presentation.story.StoryConfig$Mode;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.stories.presentation.story.g;

/* loaded from: classes6.dex */
public final class a extends m230 implements m950 {
    public final w030 E;
    public final ComponentActivity F;
    public final tlu0 G;
    public final ruc H;
    public final y50 I;
    public final hpu0 J;
    public final ptc K;
    public final aqf0 L;
    public final b M;
    public final zq4 N;
    public final et4 O;
    public final ru4 P;
    public final i3y Q;

    public a(w030 w030Var, ComponentActivity componentActivity, tlu0 tlu0Var, ruc rucVar, y50 y50Var, hpu0 hpu0Var, ptc ptcVar, aqf0 aqf0Var, b bVar, zq4 zq4Var, et4 et4Var, ru4 ru4Var) {
        super(null);
        this.E = w030Var;
        this.F = componentActivity;
        this.G = tlu0Var;
        this.H = rucVar;
        this.I = y50Var;
        this.J = hpu0Var;
        this.K = ptcVar;
        this.L = aqf0Var;
        this.M = bVar;
        this.N = zq4Var;
        this.O = et4Var;
        this.P = ru4Var;
        this.Q = kotlin.a.a(new ogu0(4, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new StoryRouterImpl$dismissOnNavigationChanges$1(this, null), 3);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        List singletonList;
        String str;
        npu0 npu0Var = (npu0) obj;
        String str2 = npu0Var.b;
        x3 x3Var = npu0Var.a;
        StoryConfig$Mode storyConfig$Mode = (StoryConfig$Mode) x3Var.b;
        boolean z = x3Var instanceof mpu0;
        if (z) {
            singletonList = Collections.singletonList(((mpu0) x3Var).c);
        } else if (x3Var instanceof lpu0) {
            singletonList = ((lpu0) x3Var).c;
        } else {
            if (!(x3Var instanceof kpu0)) {
                w511.b();
                return null;
            }
            singletonList = Collections.singletonList(((kpu0) x3Var).c.b);
        }
        Float f = npu0Var.c;
        float floatValue = f != null ? f.floatValue() : ((Number) this.Q.getValue()).floatValue();
        if (z || (x3Var instanceof kpu0)) {
            str = null;
        } else {
            if (!(x3Var instanceof lpu0)) {
                w511.b();
                return null;
            }
            str = ((lpu0) x3Var).w;
        }
        gou0 gou0Var = new gou0(str2, storyConfig$Mode, singletonList, floatValue, str, x3Var instanceof kpu0 ? ((kpu0) x3Var).c : null, npu0Var.d, npu0Var.e);
        ComponentActivity componentActivity = this.F;
        Lifecycle lifecycle = componentActivity.getLifecycle();
        ykn0 ykn0Var = new ykn0(27, this);
        jhu0 jhu0Var = new jhu0(this);
        amp0 amp0Var = new amp0();
        amp0Var.a = gou0Var;
        tlu0 tlu0Var = this.G;
        amp0Var.b = tlu0Var;
        amp0Var.c = kotlin.a.a(new ogu0(2, amp0Var));
        i3y i3yVar = (i3y) amp0Var.c;
        return new StoryModalView(componentActivity, lifecycle, new g(componentActivity, gou0Var, tlu0Var.d, (ru.yandex.taxi.stories.domain.a) i3yVar.getValue(), tlu0Var.b, tlu0Var.m, tlu0Var.o, tlu0Var.h, tlu0Var.i, this.H, tlu0Var.l, tlu0Var.n, ykn0Var, jhu0Var, this.L, this.M, this.N, this.O, this.P), tlu0Var.k, tlu0Var.c, tlu0Var.h, tlu0Var.b, tlu0Var.j, new spu0(tlu0Var.m, (ru.yandex.taxi.stories.domain.a) i3yVar.getValue(), tlu0Var.a, gou0Var), this.K);
    }
}
