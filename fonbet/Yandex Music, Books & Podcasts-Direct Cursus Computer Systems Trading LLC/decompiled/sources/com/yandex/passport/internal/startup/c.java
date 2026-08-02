package com.yandex.passport.internal.startup;

import com.yandex.passport.internal.methods.requester.f;
import defpackage.dzf;
import defpackage.x97;
import defpackage.yn7;

/* loaded from: classes4.dex */
public final class c implements yn7 {
    public final /* synthetic */ f a;

    public c(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
        x97.y(d.d, null, null, new b(this.a, null, 0), 3);
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        x97.y(d.d, null, null, new b(this.a, null, 1), 3);
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
    }
}
