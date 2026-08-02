package defpackage;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.text.c;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class kur implements a39 {
    public final Context a;
    public final OkHttpClient b = new OkHttpClient(new joj());
    public final tf6 c = gld.B();
    public final sml d = new sml(17);

    public kur(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.a39
    public final ffg b(String str, n7w n7wVar) {
        mkn mknVar;
        PictureDrawable pictureDrawable = (PictureDrawable) ((WeakHashMap) this.d.a).get(str);
        if (pictureDrawable != null) {
            n7wVar.W(new cq8(pictureDrawable, t33.c));
            return new ih9();
        }
        if (c.v(str, "http://", false) || c.v(str, "https://", false)) {
            b0o b0oVar = new b0o();
            b0oVar.g(str);
            d0o b = b0oVar.b();
            OkHttpClient okHttpClient = this.b;
            okHttpClient.getClass();
            mknVar = new mkn(okHttpClient, b, false);
        } else {
            mknVar = null;
        }
        x97.y(this.c, null, null, new inr(mknVar, this, str, n7wVar, (Continuation) null, 2), 3);
        return new ks4(1, mknVar);
    }

    @Override // defpackage.a39
    public final Boolean c() {
        return Boolean.TRUE;
    }
}
