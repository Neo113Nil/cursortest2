package defpackage;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.fragment.app.t;
import com.connectsdk.etc.helper.HttpMessage;
import com.yandex.plus.bdui.action.h;
import com.yandex.plus.bdui.content.d;
import com.yandex.plus.bdui.plus.content.controller.m;
import com.yandex.plus.bdui.plus.content.controller.q;
import com.yandex.plus.bdui.plus.content.j;
import com.yandex.plus.bdui.plus.content.r;
import com.yandex.plus.bdui.ui.a;
import com.yandex.plus.bdui.ui.b;
import com.yandex.plus.home.datasource.openapi.models.j5;
import com.yandex.plus.home.plaque.repository.rest.o;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class ujd extends ezc implements tyc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                return yjd.b((yjd) this.receiver, (drc) obj, (x66) obj2, (yxc) obj3, ((Boolean) obj4).booleanValue(), (Continuation) obj5);
            case 1:
                return yjd.c((yjd) this.receiver, (drc) obj, (x66) obj2, (yxc) obj3, ((Boolean) obj4).booleanValue(), (Continuation) obj5);
            case 2:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                String str4 = (String) obj4;
                ((Number) obj5).longValue();
                str.getClass();
                e4n e4nVar = (e4n) this.receiver;
                e4nVar.getClass();
                x3n x3nVar = ((c4n) e4nVar.a.a).n;
                Continuation continuation = null;
                if (x3nVar == null) {
                    Intrinsics.j("downloadListener");
                    throw null;
                }
                t tVar = (t) x3nVar.a;
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                request.setMimeType(str4);
                request.addRequestHeader(HttpMessage.USER_AGENT, str2);
                request.setTitle(guessFileName);
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                if (etn.z(tVar, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 || Build.VERSION.SDK_INT >= 33) {
                    x97.y((qyf) x3nVar.c, dm6.b, null, new z3n((DownloadManager) tVar.getSystemService(DownloadManager.class), request, continuation, 1), 2);
                } else {
                    try {
                        x3nVar.d = request;
                        ((zh) x3nVar.b).a("android.permission.WRITE_EXTERNAL_STORAGE");
                    } catch (ActivityNotFoundException unused) {
                        ssg.a(7, null, "Activity for requesting storage permission not found", null);
                    }
                }
                return Unit.a;
            case 3:
                h hVar = (h) obj;
                d dVar = (d) obj2;
                com.yandex.plus.bdui.flex.ui.t tVar2 = (com.yandex.plus.bdui.flex.ui.t) obj3;
                String str5 = (String) obj4;
                Throwable th = (Throwable) obj5;
                hVar.getClass();
                dVar.getClass();
                str5.getClass();
                th.getClass();
                q qVar = (q) this.receiver;
                FrameLayout frameLayout = qVar.k;
                jyr jyrVar = qVar.j;
                if (frameLayout != null) {
                    qVar.m = ((a) jyrVar.getValue()).b(frameLayout);
                    frameLayout.removeAllViews();
                    frameLayout.addView(qVar.m);
                    d dVar2 = new d(dVar.a, (j) qVar.f.invoke(new com.yandex.plus.bdui.plus.failure.a((r) dVar.b, str5, th, new m(new h0l(qVar, hVar, dVar, tVar2, 11)))), dVar.c, false);
                    a aVar = (a) jyrVar.getValue();
                    aVar.getClass();
                    x97.D(g.a, new b(aVar, dVar2, null, 0));
                }
                return Unit.a;
            default:
                return o.f((o) this.receiver, (j5) obj, ((Boolean) obj2).booleanValue(), (Map) obj3, (com.yandex.plus.home.benchmark.b) obj4, (Continuation) obj5);
        }
    }
}
