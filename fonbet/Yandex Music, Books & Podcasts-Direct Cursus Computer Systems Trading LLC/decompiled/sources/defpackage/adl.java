package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.player.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ladl;", "Ljnb;", "<init>", "()V", "player-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class adl extends jnb {
    public final gfo j = gfo.Player;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final boolean n;
    public final ybf o;
    public final cjl p;
    public final ybf q;
    public ObjectAnimator r;
    public final ru2 s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final jyr x;

    public adl() {
        final int i = 1;
        this.k = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I = hag.I(wjl.class);
                        qdc qdcVar = lklVar.a;
                        qdcVar.getClass();
                        wjl wjlVar = (wjl) qdcVar.C(I);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I2 = hag.I(cvb.class);
                        qdc qdcVar2 = lklVar2.a;
                        qdcVar2.getClass();
                        cvb cvbVar = (cvb) qdcVar2.C(I2);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var = l18.b;
                        bdt I3 = hag.I(icl.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var2 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        final int i2 = 2;
        this.l = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I = hag.I(wjl.class);
                        qdc qdcVar = lklVar.a;
                        qdcVar.getClass();
                        wjl wjlVar = (wjl) qdcVar.C(I);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I2 = hag.I(cvb.class);
                        qdc qdcVar2 = lklVar2.a;
                        qdcVar2.getClass();
                        cvb cvbVar = (cvb) qdcVar2.C(I2);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var = l18.b;
                        bdt I3 = hag.I(icl.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var2 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        final int i3 = 3;
        this.m = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I = hag.I(wjl.class);
                        qdc qdcVar = lklVar.a;
                        qdcVar.getClass();
                        wjl wjlVar = (wjl) qdcVar.C(I);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I2 = hag.I(cvb.class);
                        qdc qdcVar2 = lklVar2.a;
                        qdcVar2.getClass();
                        cvb cvbVar = (cvb) qdcVar2.C(I2);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var = l18.b;
                        bdt I3 = hag.I(icl.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var2 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.n = ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h();
        this.o = new ybf(ern.a(nnl.class), new zcl(this, 0), new lvj(4, new aok(20)));
        bdt I2 = hag.I(cjl.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.p = (cjl) qdcVar2.C(I2);
        this.q = new ybf(ern.a(zll.class), new zcl(this, 1), new lvj(5, new aok(21)));
        final int i4 = 4;
        this.s = new ru2(i4, this);
        this.t = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I3 = hag.I(wjl.class);
                        qdc qdcVar3 = lklVar.a;
                        qdcVar3.getClass();
                        wjl wjlVar = (wjl) qdcVar3.C(I3);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I22 = hag.I(cvb.class);
                        qdc qdcVar22 = lklVar2.a;
                        qdcVar22.getClass();
                        cvb cvbVar = (cvb) qdcVar22.C(I22);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I32 = hag.I(icl.class);
                        qdc qdcVar32 = l18Var2.a;
                        qdcVar32.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var22 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var22.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        this.u = l18Var.b(hag.I(fal.class), true);
        final int i5 = 5;
        this.v = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I3 = hag.I(wjl.class);
                        qdc qdcVar3 = lklVar.a;
                        qdcVar3.getClass();
                        wjl wjlVar = (wjl) qdcVar3.C(I3);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I22 = hag.I(cvb.class);
                        qdc qdcVar22 = lklVar2.a;
                        qdcVar22.getClass();
                        cvb cvbVar = (cvb) qdcVar22.C(I22);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I32 = hag.I(icl.class);
                        qdc qdcVar32 = l18Var2.a;
                        qdcVar32.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var22 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var22.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        final int i6 = 6;
        this.w = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I3 = hag.I(wjl.class);
                        qdc qdcVar3 = lklVar.a;
                        qdcVar3.getClass();
                        wjl wjlVar = (wjl) qdcVar3.C(I3);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I22 = hag.I(cvb.class);
                        qdc qdcVar22 = lklVar2.a;
                        qdcVar22.getClass();
                        cvb cvbVar = (cvb) qdcVar22.C(I22);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I32 = hag.I(icl.class);
                        qdc qdcVar32 = l18Var2.a;
                        qdcVar32.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var22 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var22.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
        final int i7 = 0;
        this.x = btf.b(new Function0(this) { // from class: vcl
            public final /* synthetic */ adl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        break;
                    case 1:
                        adl adlVar = this.b;
                        xjl xjlVar = (xjl) ((nnl) adlVar.o.getValue()).k.getValue();
                        y childFragmentManager = adlVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        t requireActivity = adlVar.requireActivity();
                        requireActivity.getClass();
                        dzf viewLifecycleOwner = adlVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                        kxi d = adlVar.d();
                        xjlVar.getClass();
                        qnq qnqVar = new qnq(childFragmentManager, requireActivity, F, d, 48);
                        lkl lklVar = (lkl) xjlVar.b.getValue();
                        bdt I3 = hag.I(wjl.class);
                        qdc qdcVar3 = lklVar.a;
                        qdcVar3.getClass();
                        wjl wjlVar = (wjl) qdcVar3.C(I3);
                        lkl lklVar2 = (lkl) xjlVar.b.getValue();
                        bdt I22 = hag.I(cvb.class);
                        qdc qdcVar22 = lklVar2.a;
                        qdcVar22.getClass();
                        cvb cvbVar = (cvb) qdcVar22.C(I22);
                        evj evjVar = xjlVar.a;
                        hn5 hn5Var = qnqVar.b;
                        y yVar = qnqVar.a;
                        hn5Var.getClass();
                        yVar.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I32 = hag.I(icl.class);
                        qdc qdcVar32 = l18Var2.a;
                        qdcVar32.getClass();
                        til tilVar = new til(hn5Var, yVar, d);
                        lkl lklVar3 = (lkl) xjlVar.b.getValue();
                        bdt I4 = hag.I(e3h.class);
                        qdc qdcVar4 = lklVar3.a;
                        qdcVar4.getClass();
                        e3h e3hVar = (e3h) qdcVar4.C(I4);
                        ce5 ce5Var = (ce5) evjVar.d;
                        break;
                    case 2:
                        iml imlVar = (iml) this.b.k.getValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        adl adlVar2 = this.b;
                        l18 l18Var22 = l18.b;
                        bdt I5 = hag.I(uhi.class);
                        qdc qdcVar5 = l18Var22.a;
                        qdcVar5.getClass();
                        Context requireContext = adlVar2.requireContext();
                        requireContext.getClass();
                        break;
                    case 5:
                        ssd requireActivity2 = this.b.requireActivity();
                        mdl mdlVar = requireActivity2 instanceof mdl ? (mdl) requireActivity2 : null;
                        if (mdlVar == null || (r1 = ((a) mdlVar).K) == null) {
                            break;
                        }
                        break;
                    default:
                        ssd requireActivity3 = this.b.requireActivity();
                        mdl mdlVar2 = requireActivity3 instanceof mdl ? (mdl) requireActivity3 : null;
                        if (mdlVar2 == null || (r1 = ((a) mdlVar2).L) == null) {
                            break;
                        }
                        break;
                }
                return ydr.a(Boolean.FALSE);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A(adl adlVar, na0 na0Var, cg6 cg6Var) {
        wcl wclVar;
        int i;
        if (cg6Var instanceof wcl) {
            wclVar = (wcl) cg6Var;
            int i2 = wclVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wclVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wclVar.j;
                nm6 nm6Var = nm6.a;
                i = wclVar.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    qgg.h0(obj);
                    x0q x0qVar = ((zll) adlVar.q.getValue()).k;
                    fmi fmiVar = new fmi(28, na0Var);
                    wclVar.l = 1;
                    x0qVar.getClass();
                    x0q.m(x0qVar, fmiVar, wclVar);
                    return;
                }
            }
        }
        wclVar = new wcl(adlVar, cg6Var);
        Object obj2 = wclVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wclVar.l;
        if (i == 0) {
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        getLifecycle().a(this.s);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(nke.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        nke nkeVar = (nke) qdcVar.C(I);
        Context requireContext = requireContext();
        requireContext.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
        ((rke) nkeVar.a.a.getValue()).getClass();
        h4b h4bVar = new h4b(rke.a(requireContext).d(F));
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        ComposeView composeView = new ComposeView(requireContext2, null, 0, 6, null);
        composeView.setContent(new wn5(new ucl(this, h4bVar, 0), -758113072, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        getLifecycle().d(this.s);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        ox6.B(this.p.e, wyf.F(getLifecycle()), new tek(3, this, view));
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getJ() {
        return this.j;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        int ordinal = ((aal) this.p.b.getValue()).ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return ((jub) this.l.getValue()).e.c().d();
        }
        if (ordinal == 2) {
            return ((st4) this.m.getValue()).k();
        }
        if (ordinal == 3) {
            return null;
        }
        b6e.s();
        return null;
    }
}
