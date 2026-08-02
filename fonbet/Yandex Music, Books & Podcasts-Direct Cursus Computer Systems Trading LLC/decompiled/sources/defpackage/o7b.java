package defpackage;

import android.app.NotificationManager;
import androidx.core.app.f0;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.downloading.api.service.DownloadService;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class o7b implements rjc {
    public static final o7b b = new o7b(0);
    public static final o7b c = new o7b(1);
    public static final o7b d = new o7b(2);
    public static final o7b e = new o7b(3);
    public static final o7b f = new o7b(4);
    public static final o7b g = new o7b(5);
    public static final o7b h = new o7b(6);
    public final /* synthetic */ int a;

    public /* synthetic */ o7b(int i) {
        this.a = i;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                lke lkeVar = (lke) obj;
                lke lkeVar2 = (lke) p7b.f.get();
                if (Intrinsics.d(lkeVar2, lkeVar)) {
                    return Unit.a;
                }
                ssg.a(3, "InformerAnalyticsHelper", hrg.r("switch: ", lkeVar2 != null ? lkeVar2.getTag() : null, " -> ", lkeVar != null ? lkeVar.getTag() : null), null);
                if (lkeVar2 != null) {
                    lkeVar2.e(false);
                }
                if (lkeVar != null) {
                    lkeVar.e(true);
                }
                p7b.f = new WeakReference(lkeVar);
                return Unit.a;
            case 1:
                ssg.a(2, g4l.g, "queueUsageEvent=" + ((y7q) obj), null);
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                lbr.a();
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                Set<fow> set = (Set) obj;
                nmb nmbVar = j74.a;
                set.getClass();
                for (fow fowVar : set) {
                    nmb nmbVar2 = j74.a;
                    j74.b(xv7.z(fowVar), slb.Ynison);
                }
                return Unit.a;
            case 6:
                nmb nmbVar3 = j74.a;
                j74.a(xv7.z(((gow) obj).b), slb.Ynison, tlb.Autoconnect);
                return Unit.a;
            case 7:
                yaa yaaVar = (yaa) obj;
                es6 es6Var = DownloadService.d;
                if (es6Var == null) {
                    Intrinsics.j("notificationHelper");
                    throw null;
                }
                int i = yaaVar.a;
                int i2 = yaaVar.c;
                NotificationManager notificationManager = (NotificationManager) ((jyr) es6Var.b).getValue();
                if (notificationManager != null) {
                    ssg.a(2, null, f1d.e(i, i2, "downloaded:", ", max:"), null);
                    f0 f0Var = (f0) es6Var.c;
                    if (f0Var == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var.p = i2;
                    f0Var.q = i;
                    f0Var.r = false;
                    if (f0Var == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var.e(g3o.b(R.string.download_progress_title));
                    f0 f0Var2 = (f0) es6Var.c;
                    if (f0Var2 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var2.d(g3o.a(R.plurals.download_progress_content, i, Integer.valueOf(i)) + StringUtil.SPACE + i2);
                    f0 f0Var3 = (f0) es6Var.c;
                    if (f0Var3 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    y7g.K(notificationManager, 2, v7g.o(f0Var3));
                }
                return Unit.a;
            case 8:
                try {
                    ssg.a(2, f7l.f, "queueState=" + ((t7q) obj), null);
                    return Unit.a;
                } catch (CancellationException e2) {
                    CancellationException c2 = n7w.c("Unexpected cancellation exception in flow collector", e2);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c2));
                    throw c2;
                }
            case 9:
                try {
                    ssg.a(2, f7l.f, "playbackState=" + ((e6l) obj), null);
                    return Unit.a;
                } catch (CancellationException e3) {
                    CancellationException c3 = n7w.c("Unexpected cancellation exception in flow collector", e3);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c3));
                    throw c3;
                }
            case 10:
                return Unit.a;
            case 11:
                qxr.a();
                return Unit.a;
            case 12:
                s9f[] s9fVarArr = eyr.b;
                neg.A(dyr.a, null);
                qxr.a();
                return Unit.a;
            default:
                if (obj == null) {
                    throw new x7j();
                }
                throw new ClassCastException();
        }
    }

    public /* synthetic */ o7b(int i, Object obj) {
        this.a = i;
    }
}
