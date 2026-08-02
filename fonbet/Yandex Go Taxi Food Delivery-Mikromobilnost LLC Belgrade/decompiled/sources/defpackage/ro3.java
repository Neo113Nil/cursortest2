package defpackage;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class ro3 extends w920 {
    public final /* synthetic */ to3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ oif0 x;
    public final /* synthetic */ go3 y;

    public ro3(to3 to3Var, String str, String str2, String str3, oif0 oif0Var, go3 go3Var) {
        this.a = to3Var;
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = oif0Var;
        this.y = go3Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        return ouu.b(this.a.b, "media_upload/%s/%s/%s", FileUploadResponseData.class, kvj0Var);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.y.D((FileUploadResponseData) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        evu evuVar = this.a.c;
        String format = String.format("media_upload/%s/%s/%s", Arrays.copyOf(new Object[]{this.b, this.c, Uri.encode(this.w)}, 3));
        evuVar.getClass();
        t4j0 c = evuVar.c(format, new HashMap());
        c.e("POST", this.x);
        return c;
    }
}
