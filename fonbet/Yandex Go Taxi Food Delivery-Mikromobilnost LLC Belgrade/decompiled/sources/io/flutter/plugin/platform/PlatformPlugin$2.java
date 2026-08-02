package io.flutter.plugin.platform;

import android.view.View;
import defpackage.ea20;
import defpackage.yvc0;
import java.util.Arrays;

/* loaded from: classes4.dex */
class PlatformPlugin$2 implements View.OnSystemUiVisibilityChangeListener {
    final /* synthetic */ yvc0 this$0;
    final /* synthetic */ View val$decorView;

    public PlatformPlugin$2(yvc0 yvc0Var, View view) {
        this.this$0 = yvc0Var;
        this.val$decorView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onSystemUiVisibilityChange$0(int i) {
        int i2 = i & 4;
        yvc0 yvc0Var = this.this$0;
        if (i2 == 0) {
            ((ea20) yvc0Var.b.b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
        } else {
            ((ea20) yvc0Var.b.b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(final int i) {
        this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.b
            @Override // java.lang.Runnable
            public final void run() {
                PlatformPlugin$2.this.lambda$onSystemUiVisibilityChange$0(i);
            }
        });
    }
}
