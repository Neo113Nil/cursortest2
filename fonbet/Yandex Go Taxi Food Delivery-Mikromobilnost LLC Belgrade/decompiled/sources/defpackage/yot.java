package defpackage;

import android.graphics.drawable.Drawable;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final /* synthetic */ class yot implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yot(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (OkHttpClient) ((zn1) obj).b.k.getValue();
            default:
                return u8b1.g((Drawable) obj);
        }
    }
}
