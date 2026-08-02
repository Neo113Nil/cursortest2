package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp;", "Lem7;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class p extends em7 {
    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        l18 l18Var = l18.b;
        try {
            if (h()) {
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                File filesDir = ((Context) qdcVar.C(I)).getFilesDir();
                filesDir.getClass();
                new File(filesDir, "enableAMAltUrl").createNewFile();
                return;
            }
            bdt I2 = hag.I(Context.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            File filesDir2 = ((Context) qdcVar2.C(I2)).getFilesDir();
            filesDir2.getClass();
            new File(filesDir2, "enableAMAltUrl").delete();
        } catch (IOException | SecurityException unused) {
        }
    }
}
