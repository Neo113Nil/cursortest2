package com.gamericefishpro.space.i2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.d4.b {
    public final /* synthetic */ t v;
    public final /* synthetic */ com.gamericefishpro.space.h2.f0 w;
    public final /* synthetic */ t y;

    public n(t tVar, com.gamericefishpro.space.h2.f0 f0Var, t tVar2) {
        this.v = tVar;
        this.w = f0Var;
        this.y = tVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, com.gamericefishpro.space.e4.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        this.d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        t tVar = this.v;
        z zVar = tVar.R;
        if (zVar.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        com.gamericefishpro.space.h2.f0 f0Var = this.w;
        com.gamericefishpro.space.h2.f0 f0VarV = f0Var.v();
        while (true) {
            if (f0VarV == null) {
                f0VarV = null;
                break;
            } else if (f0VarV.Z.d(8)) {
                break;
            } else {
                f0VarV = f0VarV.v();
            }
        }
        Integer numValueOf = f0VarV != null ? Integer.valueOf(f0VarV.e) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == tVar.getSemanticsOwner().a().g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        hVar.b = iIntValue;
        t tVar2 = this.y;
        accessibilityNodeInfo.setParent(tVar2, iIntValue);
        int i = f0Var.e;
        int iD = zVar.V.d(i);
        if (iD != -1) {
            com.gamericefishpro.space.f3.j jVarP = f0.p(tVar.getAndroidViewsHandler$ui(), iD);
            if (jVarP != null) {
                accessibilityNodeInfo.setTraversalBefore(jVarP);
            } else {
                accessibilityNodeInfo.setTraversalBefore(tVar2, iD);
            }
            t.d(tVar, i, accessibilityNodeInfo, zVar.X);
        }
        int iD2 = zVar.W.d(i);
        if (iD2 != -1) {
            com.gamericefishpro.space.f3.j jVarP2 = f0.p(tVar.getAndroidViewsHandler$ui(), iD2);
            if (jVarP2 != null) {
                accessibilityNodeInfo.setTraversalAfter(jVarP2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(tVar2, iD2);
            }
            t.d(tVar, i, accessibilityNodeInfo, zVar.Y);
        }
    }
}
