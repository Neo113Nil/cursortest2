package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.trackselection.a;
import ru.yandex.video.m3.data.TargetFormat;

/* loaded from: classes6.dex */
public final class t6s implements a1t {
    public final rp7 a;
    public final a b;
    public final r6s c;
    public final Context d;

    public t6s(Context context, rp7 rp7Var, a aVar, b2c b2cVar, r6s r6sVar) {
        this.a = rp7Var;
        this.b = aVar;
        this.c = r6sVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.d = applicationContext;
    }

    @Override // defpackage.a1t
    public final b1t a(x0t x0tVar) {
        arr b = x0tVar.b();
        arr c = x0tVar.c();
        TargetFormat targetFormat = (TargetFormat) this.a.a;
        r6s r6sVar = this.c;
        return new b1t(this.d, new o6s(targetFormat, b, c, r6sVar.a, r6sVar.b), this.b);
    }
}
