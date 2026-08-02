package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class zbb1 {
    public static final void a(at6 at6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1793199835);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(at6Var) : btsVar2.e(at6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i4 = i2;
        if (btsVar2.V(i4 & 1, (i4 & 19) != 18)) {
            wg6 a = b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 0, 0, 8191);
            bts btsVar3 = btsVar2;
            lg6 c = qab1.c(a, new up2(zp2.d), null, btsVar3, 384, 0);
            boolean z = ((dtr0) a.g.getValue()).a == -1;
            boolean z2 = !z;
            if (z) {
                i3 = 0;
                btsVar3.e0(413696679);
                btsVar3.t(false);
            } else {
                btsVar3.e0(413427599);
                r901 r901Var = at6Var.a;
                e68 e68Var = at6Var.c;
                boolean z3 = (i4 & 112) == 32;
                Object Q = btsVar3.Q();
                if (z3 || Q == did.a) {
                    Q = new a0(19, tlsVar);
                    btsVar3.o0(Q);
                }
                pqb1.b(r901Var, e68Var, (tls) Q, null, btsVar3, 3080);
                btsVar3 = btsVar3;
                i3 = 0;
                btsVar3.t(false);
            }
            bts btsVar4 = btsVar3;
            c.a(null, a, c, false, false, null, null, null, wwg.S(1811134222, true, new rs6(z2, tlsVar, i3), btsVar3), null, null, wwg.S(912599931, true, new l0(2, at6Var, tlsVar), btsVar3), btsVar4, 100663296, 48, 1785);
            btsVar = btsVar4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(at6Var, tlsVar, i, 9);
        }
    }

    public static final void b(lfx lfxVar, Object obj) {
        g0c g0cVar = (g0c) lfxVar;
        if (g0cVar.e(obj)) {
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + g0cVar.c());
    }

    public static final Uri c(Context context, Bitmap bitmap, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (str == null || evu0.J(str)) {
            str = "screenshot";
        }
        File file = new File(externalCacheDir, b64.l("screenshots", File.separator, str, ".png"));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                try {
                    return FileProvider.getUriForFile(context, "ru.yandex.taxi.utils.fileprovider." + context.getPackageName(), file);
                } catch (Throwable th) {
                    xby.d.x(th, "Unable to create a uri by FileProvider");
                    return null;
                }
            } finally {
            }
        } catch (IOException e) {
            xby.d.k(e, "Unable to save bitmap");
            return null;
        }
    }
}
