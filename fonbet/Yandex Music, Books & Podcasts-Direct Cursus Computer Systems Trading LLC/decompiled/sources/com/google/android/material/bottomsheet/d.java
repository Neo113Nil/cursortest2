package com.google.android.material.bottomsheet;

import defpackage.heu;

/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.a;
        eVar.b = false;
        BottomSheetBehavior bottomSheetBehavior = eVar.d;
        heu heuVar = bottomSheetBehavior.viewDragHelper;
        if (heuVar != null && heuVar.g()) {
            eVar.a(eVar.a);
        } else if (bottomSheetBehavior.state == 2) {
            bottomSheetBehavior.setStateInternal(eVar.a);
        }
    }
}
