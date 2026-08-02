package androidx.media3.session;

import android.graphics.Bitmap;
import androidx.core.app.f0;
import defpackage.j4x;
import defpackage.kzc;
import defpackage.mzb;
import defpackage.vq1;

/* loaded from: classes.dex */
public final class a implements kzc {
    public final int a;
    public final f0 b;
    public final c c;
    public boolean d;

    public a(int i, f0 f0Var, c cVar) {
        this.a = i;
        this.b = f0Var;
        this.c = cVar;
    }

    @Override // defpackage.kzc
    public final void onFailure(Throwable th) {
        if (this.d) {
            return;
        }
        vq1.n0("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.kzc
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (this.d) {
            return;
        }
        f0 f0Var = this.b;
        f0Var.h(bitmap);
        final j4x j4xVar = new j4x(this.a, f0Var.b());
        c cVar = this.c;
        final MediaNotificationManager mediaNotificationManager = cVar.a;
        final int i = cVar.b;
        final mzb mzbVar = cVar.c;
        mediaNotificationManager.e.execute(new Runnable() { // from class: androidx.media3.session.g
            @Override // java.lang.Runnable
            public final void run() {
                MediaNotificationManager mediaNotificationManager2 = MediaNotificationManager.this;
                if (i == mediaNotificationManager2.i) {
                    mediaNotificationManager2.f(mzbVar, j4xVar, mediaNotificationManager2.c(false));
                }
            }
        });
    }
}
