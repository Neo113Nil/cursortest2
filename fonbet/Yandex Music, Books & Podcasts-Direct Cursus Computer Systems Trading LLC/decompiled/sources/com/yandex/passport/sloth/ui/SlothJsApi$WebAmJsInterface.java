package com.yandex.passport.sloth.ui;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hrg;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v4w;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"com/yandex/passport/sloth/ui/SlothJsApi$WebAmJsInterface", "", "Lmm6;", "coroutineScope", "Lcom/yandex/passport/sloth/ui/a1;", "interactor", "Lcom/yandex/passport/sloth/ui/webview/i;", "webViewController", "<init>", "(Lmm6;Lcom/yandex/passport/sloth/ui/a1;Lcom/yandex/passport/sloth/ui/webview/i;)V", "", "payload", "", "processRequest", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "send", "(Ljava/lang/String;)V", "Lmm6;", "Lcom/yandex/passport/sloth/ui/a1;", "Lcom/yandex/passport/sloth/ui/webview/i;", "passport-sloth-ui_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class SlothJsApi$WebAmJsInterface {

    @NotNull
    private final mm6 coroutineScope;

    @NotNull
    private final a1 interactor;

    @NotNull
    private final com.yandex.passport.sloth.ui.webview.i webViewController;

    public SlothJsApi$WebAmJsInterface(@NotNull mm6 mm6Var, @NotNull a1 a1Var, @NotNull com.yandex.passport.sloth.ui.webview.i iVar) {
        mm6Var.getClass();
        a1Var.getClass();
        iVar.getClass();
        this.coroutineScope = mm6Var;
        this.interactor = a1Var;
        this.webViewController = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequest(String str, Continuation<? super Unit> continuation) {
        i iVar;
        int i;
        String str2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.webViewController.g) {
                        return Unit.a;
                    }
                    a1 a1Var = this.interactor;
                    iVar.j = str;
                    iVar.m = 1;
                    obj = ((com.yandex.passport.sloth.c1) a1Var).e(str, iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = iVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(bVar, null, hrg.r("performJsCommand(", str, ") resulted in ", (String) obj), 10);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    com.yandex.passport.sloth.ui.webview.i iVar2 = this.webViewController;
                    iVar2.getClass();
                    iVar2.a(new v4w(str2, 12));
                }
                return Unit.a;
            }
        }
        iVar = new i(this, continuation);
        Object obj2 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        if (i != 0) {
        }
        com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
        return Unit.a;
    }

    @JavascriptInterface
    public final void send(String json) {
        x97.y(this.coroutineScope, null, null, new j(json, this, null, 0), 3);
    }
}
