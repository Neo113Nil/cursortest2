package com.gamericefishpro.space.f3;

import android.os.Parcelable;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(z zVar, int i) {
        super(0);
        this.d = i;
        this.e = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.getLayoutNode().C();
                return Unit.a;
            case 1:
                z zVar = this.e;
                if (zVar.w && zVar.isAttachedToWindow() && zVar.getView().getParent() == zVar) {
                    q1 snapshotObserver = zVar.getSnapshotObserver();
                    snapshotObserver.a.c(zVar, c.e, zVar.getUpdate());
                }
                return Unit.a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.e.T.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                z zVar2 = this.e;
                zVar2.getReleaseBlock().invoke(zVar2.T);
                z.n(zVar2);
                return Unit.a;
            case 4:
                z zVar3 = this.e;
                zVar3.getResetBlock().invoke(zVar3.T);
                return Unit.a;
            default:
                z zVar4 = this.e;
                zVar4.getUpdateBlock().invoke(zVar4.T);
                return Unit.a;
        }
    }
}
