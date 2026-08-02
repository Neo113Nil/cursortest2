package ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination;

import android.view.ViewGroup;
import defpackage.k0l0;
import defpackage.m0l0;
import defpackage.mct0;
import defpackage.n0l0;
import defpackage.oct0;
import defpackage.pct0;
import defpackage.qct0;
import defpackage.qe30;
import defpackage.sls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.r;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ n0l0 a;
    public final /* synthetic */ ViewGroup b;

    public e(n0l0 n0l0Var, ViewGroup viewGroup) {
        this.a = n0l0Var;
        this.b = viewGroup;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        qct0 qct0Var = (qct0) obj;
        final n0l0 n0l0Var = this.a;
        n0l0Var.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.removeAllViews();
        final int i = 1;
        final int i2 = 0;
        if (qct0Var instanceof oct0) {
            r rVar = ((oct0) qct0Var).a;
            if (n0l0Var.k == null) {
                n0l0Var.k = new SourceDestinationComponentV2(viewGroup.getContext(), n0l0Var.f);
            }
            SourceDestinationComponentV2 sourceDestinationComponentV2 = n0l0Var.k;
            if (sourceDestinationComponentV2 != null) {
                sourceDestinationComponentV2.setOnSourceClickListener(new sls() { // from class: l0l0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        n0l0 n0l0Var2 = n0l0Var;
                        switch (i3) {
                            case 0:
                                act0 act0Var = n0l0Var2.i;
                                if (act0Var != null) {
                                    act0Var.Y();
                                    break;
                                }
                                break;
                            default:
                                act0 act0Var2 = n0l0Var2.i;
                                if (act0Var2 != null) {
                                    act0Var2.x0();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
                sourceDestinationComponentV2.setOnDestinationClickListener(new sls() { // from class: l0l0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i;
                        zy11 zy11Var = zy11.a;
                        n0l0 n0l0Var2 = n0l0Var;
                        switch (i3) {
                            case 0:
                                act0 act0Var = n0l0Var2.i;
                                if (act0Var != null) {
                                    act0Var.Y();
                                    break;
                                }
                                break;
                            default:
                                act0 act0Var2 = n0l0Var2.i;
                                if (act0Var2 != null) {
                                    act0Var2.x0();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
                sourceDestinationComponentV2.setOnDestinationButtonClickListener(rVar.b.h.length() > 0 ? new RouteBlockDelegate$renderNewbies$1$buttonListener$1(0, n0l0Var, n0l0.class, "onAddDestinationClick", "onAddDestinationClick()V", 0) : null);
                sourceDestinationComponentV2.render(rVar);
            }
            viewGroup.addView(n0l0Var.k, -1, -2);
        } else {
            if (!(qct0Var instanceof pct0)) {
                w511.b();
                return null;
            }
            mct0 mct0Var = ((pct0) qct0Var).a;
            if (n0l0Var.j == null) {
                SourceDestinationComponent sourceDestinationComponent = new SourceDestinationComponent(viewGroup.getContext(), null, 0, 6, null);
                sourceDestinationComponent.setAnimateLayoutChanged(false);
                sourceDestinationComponent.setStopPointsDelegate(n0l0Var.c);
                n0l0Var.j = sourceDestinationComponent;
            }
            SourceDestinationComponent sourceDestinationComponent2 = n0l0Var.j;
            if (sourceDestinationComponent2 != null) {
                sourceDestinationComponent2.setSourceTrailClickListener(new k0l0(0, n0l0Var));
                sourceDestinationComponent2.setDestinationTrailClickListener(new qe30(1, n0l0Var));
                sourceDestinationComponent2.setSourceDestinationListener(new m0l0(n0l0Var));
            }
            String str = n0l0Var.m;
            String str2 = n0l0Var.n;
            n0l0Var.m = str;
            n0l0Var.n = str2;
            SourceDestinationComponent sourceDestinationComponent3 = n0l0Var.j;
            if (sourceDestinationComponent3 != null) {
                sourceDestinationComponent3.applyDrawables(n0l0Var.a.b(str), n0l0Var.b.b(str2));
            }
            SourceDestinationComponent sourceDestinationComponent4 = n0l0Var.j;
            if (sourceDestinationComponent4 != null) {
                sourceDestinationComponent4.render(mct0Var);
                sourceDestinationComponent4.setVisibility(0);
                sourceDestinationComponent4.setHideKeyboardOnDetach(false);
            }
            viewGroup.addView(n0l0Var.j);
        }
        return zy11.a;
    }
}
