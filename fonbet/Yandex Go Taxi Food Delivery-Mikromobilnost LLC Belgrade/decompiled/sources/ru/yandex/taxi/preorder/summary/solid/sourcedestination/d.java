package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import android.widget.FrameLayout;
import defpackage.dia0;
import defpackage.fva0;
import defpackage.mct0;
import defpackage.oct0;
import defpackage.pct0;
import defpackage.qct0;
import defpackage.rsn;
import defpackage.uov0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wov0;
import defpackage.xov0;
import defpackage.yov0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ b a;

    public d(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        rsn rsnVar = (rsn) obj;
        yov0 yov0Var = (yov0) rsnVar.a;
        yov0 yov0Var2 = (yov0) rsnVar.b;
        b bVar = this.a;
        if (yov0Var != null && yov0Var2 != null && yov0Var.getClass() != yov0Var2.getClass()) {
            bVar.n = null;
            bVar.o = null;
            bVar.p = null;
            FrameLayout frameLayout = bVar.a;
            frameLayout.removeAllViews();
            frameLayout.setPadding(0, 0, 0, 0);
        }
        if (yov0Var2 != null) {
            bVar.getClass();
            fva0 fva0Var = bVar.f;
            if (yov0Var2.equals(wov0.a)) {
                bVar.n = null;
                bVar.o = null;
                bVar.p = null;
                FrameLayout frameLayout2 = bVar.a;
                frameLayout2.removeAllViews();
                frameLayout2.setPadding(0, 0, 0, 0);
            } else {
                if (!(yov0Var2 instanceof xov0)) {
                    w511.b();
                    return null;
                }
                qct0 qct0Var = ((xov0) yov0Var2).a;
                if (qct0Var instanceof oct0) {
                    r rVar = ((oct0) qct0Var).a;
                    if (bVar.o == null) {
                        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
                        a aVar = new a(bVar);
                        dia0 dia0Var = new dia0(8);
                        fva0Var.getClass();
                        fva0.f(fva0Var, "Summary.SourceDestinationComponentV2.Create", performanceAnalytics$Type, 0L, 4);
                        aVar.invoke();
                        fva0Var.a("Summary.SourceDestinationComponentV2.Create", performanceAnalytics$Type, dia0Var);
                    }
                    SourceDestinationComponentV2 sourceDestinationComponentV2 = bVar.o;
                    if (sourceDestinationComponentV2 != null) {
                        sourceDestinationComponentV2.render(rVar);
                    }
                    SummarySourceDestinationViewHolder$handleNewbies$sourceButtonListener$1 summarySourceDestinationViewHolder$handleNewbies$sourceButtonListener$1 = rVar.a.h.length() > 0 ? new SummarySourceDestinationViewHolder$handleNewbies$sourceButtonListener$1(0, bVar, b.class, "onSourceTrailClick", "onSourceTrailClick()V", 0) : null;
                    SummarySourceDestinationViewHolder$handleNewbies$destinationButtonListener$1 summarySourceDestinationViewHolder$handleNewbies$destinationButtonListener$1 = new SummarySourceDestinationViewHolder$handleNewbies$destinationButtonListener$1(0, bVar, b.class, "onDestinationTrailClick", "onDestinationTrailClick()V", 0);
                    SourceDestinationComponentV2 sourceDestinationComponentV22 = bVar.o;
                    if (sourceDestinationComponentV22 != null) {
                        sourceDestinationComponentV22.setOnSourceButtonClickListener(summarySourceDestinationViewHolder$handleNewbies$sourceButtonListener$1);
                    }
                    SourceDestinationComponentV2 sourceDestinationComponentV23 = bVar.o;
                    if (sourceDestinationComponentV23 != null) {
                        sourceDestinationComponentV23.setOnDestinationButtonClickListener(summarySourceDestinationViewHolder$handleNewbies$destinationButtonListener$1);
                    }
                    boolean z = rVar.b.o;
                    SourceDestinationComponentV2 sourceDestinationComponentV24 = bVar.o;
                    if (z) {
                        if (sourceDestinationComponentV24 != null) {
                            sourceDestinationComponentV24.setDestinationTrailButtonListener(summarySourceDestinationViewHolder$handleNewbies$destinationButtonListener$1);
                        }
                    } else if (sourceDestinationComponentV24 != null) {
                        sourceDestinationComponentV24.setDestinationTrailButtonListener(null);
                    }
                } else {
                    if (!(qct0Var instanceof pct0)) {
                        w511.b();
                        return null;
                    }
                    pct0 pct0Var = (pct0) qct0Var;
                    mct0 mct0Var = pct0Var.a;
                    if (bVar.n == null) {
                        PerformanceAnalytics$Type performanceAnalytics$Type2 = PerformanceAnalytics$Type.Creating;
                        uov0 uov0Var = new uov0(bVar, 1);
                        dia0 dia0Var2 = new dia0(8);
                        fva0Var.getClass();
                        fva0.f(fva0Var, "Summary.SourceDestinationComponent.Create", performanceAnalytics$Type2, 0L, 4);
                        uov0Var.invoke();
                        fva0Var.a("Summary.SourceDestinationComponent.Create", performanceAnalytics$Type2, dia0Var2);
                    }
                    SourceDestinationComponent sourceDestinationComponent = bVar.n;
                    if (sourceDestinationComponent != null) {
                        sourceDestinationComponent.setDestinationTrailClickListener(mct0Var.f == DestinationTrailMode.ADD_DESTINATION ? bVar.s : null);
                    }
                    SourceDestinationComponent sourceDestinationComponent2 = bVar.n;
                    if (sourceDestinationComponent2 != null) {
                        sourceDestinationComponent2.render(mct0Var);
                    }
                    boolean z2 = pct0Var.b;
                    SourceDestinationComponent sourceDestinationComponent3 = bVar.n;
                    if (z2) {
                        if (sourceDestinationComponent3 != null) {
                            sourceDestinationComponent3.startProgressAnimation();
                        }
                    } else if (sourceDestinationComponent3 != null) {
                        sourceDestinationComponent3.stopProgressAnimation();
                    }
                }
            }
        }
        return zy11.a;
    }
}
