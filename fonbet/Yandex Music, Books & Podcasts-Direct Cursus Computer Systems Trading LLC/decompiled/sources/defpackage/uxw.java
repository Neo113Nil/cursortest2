package defpackage;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class uxw extends eyw {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public uxw(Activity activity, int i, Intent intent) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.eyw
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
