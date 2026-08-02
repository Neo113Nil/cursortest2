package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class ayw extends eyw {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ vyf b;

    public ayw(Intent intent, vyf vyfVar) {
        this.a = intent;
        this.b = vyfVar;
    }

    @Override // defpackage.eyw
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
