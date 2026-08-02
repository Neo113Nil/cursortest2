package ru.yandex.taxi.preorder.mainscreen;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import defpackage.evu0;
import defpackage.jst;
import defpackage.lg21;
import defpackage.mg21;
import defpackage.og21;
import defpackage.qv10;
import kotlin.Metadata;
import ru.yandex.taxi.h;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/RedirectModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/h;", "platformHelper", "Llg21;", "uriRouter", "", "url", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/h;Llg21;Ljava/lang/String;)V", "Lzy11;", "openOriginalAppUrl", "()V", "Lru/yandex/taxi/h;", "Llg21;", "Ljava/lang/String;", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RedirectModalView extends ModalView {
    private final h platformHelper;
    private final lg21 uriRouter;
    private final String url;

    public RedirectModalView(Context context, h hVar, lg21 lg21Var, String str) {
        super(context);
        this.platformHelper = hVar;
        this.uriRouter = lg21Var;
        this.url = str;
    }

    public final void openOriginalAppUrl() {
        String a = og21.a(Uri.parse(this.url), "id");
        if (a == null || evu0.J(a)) {
            ((mg21) this.uriRouter).c(this.url);
            return;
        }
        boolean c = this.platformHelper.c(a);
        h hVar = this.platformHelper;
        if (!c) {
            hVar.d(a);
            return;
        }
        Context context = hVar.a;
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(a));
        } catch (ActivityNotFoundException unused) {
            qv10.C(new Object[]{a}, 1, "Error to start application %s", jst.e);
            hVar.d(a);
        }
    }
}
