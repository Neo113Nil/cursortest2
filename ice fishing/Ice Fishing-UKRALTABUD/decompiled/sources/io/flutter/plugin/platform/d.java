package io.flutter.plugin.platform;

import L.C0051b;
import L.Q;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2445b;

    public d(e eVar, View view) {
        this.f2445b = eVar;
        this.f2444a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f2444a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                e eVar = d.this.f2445b;
                if (i3 == 0) {
                    Q q2 = eVar.f2447b;
                    q2.getClass();
                    ((C0051b) q2.f597g).D("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                Q q3 = eVar.f2447b;
                q3.getClass();
                ((C0051b) q3.f597g).D("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
