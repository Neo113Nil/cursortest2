package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.yandex.music.shared.smart.downloading.domain.SmartDownloadWorker;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class uyq extends a5w {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public uyq(bzq bzqVar) {
        bzqVar.getClass();
        this.b = bzqVar;
    }

    @Override // defpackage.a5w
    public final ucg a(Context context, String str, WorkerParameters workerParameters) {
        ucg a;
        int i = this.a;
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        switch (i) {
            case 0:
                if (Class.forName(str).equals(SmartDownloadWorker.class)) {
                    return new SmartDownloadWorker(context, workerParameters, (bzq) this.b);
                }
                return null;
            default:
                jwv jwvVar = (jwv) this.b;
                n8g b = t75.b();
                jwvVar.invoke(b);
                ListIterator listIterator = t75.a(b).listIterator(0);
                do {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        return null;
                    }
                    a = ((a5w) ezdVar.next()).a(context, str, workerParameters);
                } while (a == null);
                return a;
        }
    }

    public uyq(jwv jwvVar) {
        this.b = jwvVar;
    }
}
