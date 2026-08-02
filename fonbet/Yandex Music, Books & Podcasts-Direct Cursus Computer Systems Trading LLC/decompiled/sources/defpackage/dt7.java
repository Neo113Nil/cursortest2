package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.trackselection.a;

/* loaded from: classes6.dex */
public final class dt7 implements a1t {
    public final a a;
    public final Context b;

    public dt7(Context context, a aVar, b2c b2cVar) {
        this.a = aVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    @Override // defpackage.a1t
    public final b1t a(x0t x0tVar) {
        return new b1t(this.b, new y8p(x0tVar.b(), x0tVar.c()), this.a);
    }
}
