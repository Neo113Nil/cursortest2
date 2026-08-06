package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7836b;

    public d(e eVar, View view) {
        this.f7836b = eVar;
        this.f7835a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f7835a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                e eVar = d.this.f7836b;
                if (i3 == 0) {
                    x0.e eVar2 = eVar.f7838b;
                    eVar2.getClass();
                    ((I0.b) eVar2.f8530b).G("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                x0.e eVar3 = eVar.f7838b;
                eVar3.getClass();
                ((I0.b) eVar3.f8530b).G("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
