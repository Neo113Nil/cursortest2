package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;

/* loaded from: classes6.dex */
public final class lpu {
    public final t a;

    public lpu(t tVar) {
        tVar.getClass();
        this.a = tVar;
    }

    public final void a(String str) {
        str.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        y7g.O(this.a, Intent.createChooser(intent, null));
    }
}
