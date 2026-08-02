package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.ComposeView;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ji7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji7(Context context, int i) {
        super(0);
        this.r = i;
        this.s = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        Context context = this.s;
        switch (i) {
            case 0:
                return agv.a(context.getApplicationContext(), new h88(context.getApplicationContext()), new y9w(28));
            case 1:
                return emm.a(context, elp.b);
            case 2:
                return emm.a(context, elp.a);
            case 3:
                Bitmap.Config[] configArr = k.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                xq0.q("cacheDir == null");
                return null;
            case 4:
                Bitmap.Config[] configArr2 = k.a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                xq0.q("cacheDir == null");
                return null;
            case 5:
                File externalFilesDir = context.getExternalFilesDir("Yandex-ListPlayerManager-Video-Cache");
                externalFilesDir.getClass();
                return externalFilesDir;
            case 6:
                return new ComposeView(this.s, null, 0, 6, null);
            default:
                context.getClass();
                return AppMetricaYandex.getUuid(context);
        }
    }
}
