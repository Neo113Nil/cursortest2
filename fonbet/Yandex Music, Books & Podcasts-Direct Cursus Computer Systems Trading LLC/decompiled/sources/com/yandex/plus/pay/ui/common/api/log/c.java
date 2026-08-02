package com.yandex.plus.pay.ui.common.api.log;

import android.app.Activity;
import android.content.ComponentName;
import androidx.fragment.app.o;
import defpackage.dzf;
import defpackage.yn7;

/* loaded from: classes5.dex */
public final class c implements yn7 {
    public final String a;
    public final com.yandex.plus.pay.log.impl.b b;

    public c(String str, com.yandex.plus.pay.log.impl.b bVar) {
        bVar.getClass();
        this.a = str;
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(c cVar, dzf dzfVar) {
        String shortClassName;
        if (dzfVar instanceof Activity) {
            ComponentName component = ((Activity) dzfVar).getIntent().getComponent();
            return (component == null || (shortClassName = component.getShortClassName()) == null) ? dzfVar.getClass().getSimpleName() : shortClassName;
        }
        if (!(dzfVar instanceof o)) {
            return "unknown";
        }
        String tag = ((o) dzfVar).getTag();
        return tag == null ? dzfVar.getClass().getSimpleName() : tag;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        dzfVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" created (not visible)"));
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" destroyed"));
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" paused (visible, not interactive)"));
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" resumed (interactive)"));
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" started (visible, not interactive)"));
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, a(this, dzfVar).concat(" stopped (not visible)"));
    }
}
