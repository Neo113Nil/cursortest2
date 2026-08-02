package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission;

import defpackage.ghh;
import defpackage.jey;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class a extends jey {
    public final /* synthetic */ ghh a;

    public a(ghh ghhVar) {
        this.a = ghhVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        ghh ghhVar = this.a;
        ghhVar.A = tje.N(ghhVar.Jg(), null, null, new DefaultPermissionCameraLayerPresenter$start$1(ghhVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        ghh ghhVar = this.a;
        pzt0 pzt0Var = ghhVar.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ghhVar.A = null;
    }
}
