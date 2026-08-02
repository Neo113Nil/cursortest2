package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;
import defpackage.cxc0;
import defpackage.qwc0;
import defpackage.tg;
import defpackage.wor0;

/* loaded from: classes4.dex */
public final class g {
    public static final VirtualDisplay.Callback i = new VirtualDisplay.Callback() { // from class: io.flutter.plugin.platform.VirtualDisplayController$1
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    };
    public SingleViewPresentation a;
    public final Context b;
    public final tg c;
    public final int d;
    public final int e;
    public final wor0 f;
    public final cxc0 g;
    public VirtualDisplay h;

    public g(Activity activity, tg tgVar, VirtualDisplay virtualDisplay, qwc0 qwc0Var, wor0 wor0Var, cxc0 cxc0Var, int i2) {
        this.b = activity;
        this.c = tgVar;
        this.f = wor0Var;
        this.g = cxc0Var;
        this.e = i2;
        this.h = virtualDisplay;
        this.d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.h.getDisplay(), qwc0Var, tgVar, i2, cxc0Var);
        this.a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
