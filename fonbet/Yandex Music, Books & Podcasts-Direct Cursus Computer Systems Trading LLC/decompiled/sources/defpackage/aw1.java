package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class aw1 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ bw1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(bw1 bw1Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = bw1Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        bw1 bw1Var = this.c;
        bw1Var.r(yv1.b((Context) bw1Var.c, (dv1) bw1Var.k, (qxp) bw1Var.j));
    }
}
