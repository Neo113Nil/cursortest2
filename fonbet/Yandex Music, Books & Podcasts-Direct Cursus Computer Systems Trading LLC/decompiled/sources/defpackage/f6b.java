package defpackage;

import android.net.Uri;
import com.yandex.music.shared.player.storage.StorageUnavailableException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class f6b implements pyc {
    public final /* synthetic */ int a;
    public final vsb b;

    public f6b(vsb vsbVar, int i) {
        this.a = i;
        vsbVar.getClass();
        switch (i) {
            case 1:
                this.b = vsbVar;
                break;
            case 2:
                this.b = vsbVar;
                break;
            default:
                this.b = vsbVar;
                break;
        }
    }

    public final Boolean a(zvs zvsVar, String str, thr thrVar) {
        switch (this.a) {
            case 0:
                zvsVar.getClass();
                str.getClass();
                thrVar.getClass();
                liq d = this.b.d(thrVar);
                if (d == null) {
                    throw new StorageUnavailableException();
                }
                Uri uri = leu.L(str).b;
                uri.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                long h = d.h(0L, -1L, uri2);
                long a = qc6.a(d.a(uri2));
                if (a < 0) {
                    a = 0;
                }
                return Boolean.valueOf(a > 0 && a == h);
            case 1:
                zvsVar.getClass();
                str.getClass();
                thrVar.getClass();
                vsb vsbVar = this.b;
                liq d2 = vsbVar.d(thrVar);
                if (d2 == null) {
                    throw new StorageUnavailableException();
                }
                e6b e6bVar = new e6b(d2, vsb.c(vsbVar, d2, null, null, 14));
                try {
                    Uri parse = Uri.parse(str);
                    parse.getClass();
                    return Boolean.valueOf(bcx.L(e6bVar, parse) instanceof c0e);
                } catch (IOException unused) {
                    return Boolean.FALSE;
                }
            default:
                zvsVar.getClass();
                str.getClass();
                thrVar.getClass();
                liq d3 = this.b.d(thrVar);
                if (d3 == null) {
                    throw new StorageUnavailableException();
                }
                long h2 = d3.h(0L, -1L, str);
                long a2 = qc6.a(d3.a(str));
                if (a2 < 0) {
                    a2 = 0;
                }
                return Boolean.valueOf(a2 > 0 && a2 == h2);
        }
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
        }
        return a((zvs) obj, (String) obj2, (thr) obj3);
    }
}
