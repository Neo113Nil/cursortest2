package defpackage;

import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;
import io.appmetrica.analytics.impl.C0553n3;

/* loaded from: classes15.dex */
public final class w0b extends c1b implements y0b {
    public final /* synthetic */ int b;
    public final ChatBackgroundController$BackgroundFragment c;
    public final heb w;
    public final /* synthetic */ d1b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0b(d1b d1bVar, ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment, heb hebVar, int i) {
        super(C0553n3.g);
        this.b = i;
        switch (i) {
            case 1:
                this.x = d1bVar;
                super("detached");
                this.c = chatBackgroundController$BackgroundFragment;
                this.w = hebVar;
                break;
            default:
                this.x = d1bVar;
                this.c = chatBackgroundController$BackgroundFragment;
                this.w = hebVar;
                break;
        }
    }

    @Override // defpackage.y0b
    public final ChatBackgroundController$BackgroundFragment a() {
        int i = this.b;
        return this.c;
    }

    @Override // defpackage.ye0
    public final ye0 b() {
        switch (this.b) {
            case 0:
                jl40.x("Attaching the WebView that is already attached");
                return this;
            default:
                return q();
        }
    }

    @Override // defpackage.ye0
    public final c1b c(MainWebMessengerFragment mainWebMessengerFragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        int i = this.b;
        ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = this.c;
        d1b d1bVar = this.x;
        heb hebVar = this.w;
        switch (i) {
            case 0:
                d1bVar.a.b("wm_background_foreground_switching");
                hebVar.d();
                hebVar.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
                break;
            default:
                hebVar.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
                d1bVar.a.b("wm_foreground_attaching");
                break;
        }
        return new x0b(d1bVar, chatBackgroundController$BackgroundFragment, hebVar, mainWebMessengerFragment);
    }

    @Override // defpackage.ye0
    public final ye0 d() {
        switch (this.b) {
            case 0:
                d1b d1bVar = this.x;
                d1bVar.a.b("wm_background_detaching");
                heb hebVar = this.w;
                hebVar.d();
                return new w0b(d1bVar, this.c, hebVar, 1);
            default:
                jl40.x("No preloading fragment was attached");
                return this;
        }
    }

    @Override // defpackage.ye0
    public final ye0 e(MainWebMessengerFragment mainWebMessengerFragment) {
        switch (this.b) {
            case 0:
                jl40.x("Hiding the WebView that was not shown");
                break;
            default:
                jl40.x("My webView was not shown yet, nothing to hide");
                break;
        }
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 m() {
        int i = this.b;
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 n() {
        int i = this.b;
        d1b d1bVar = this.x;
        heb hebVar = this.w;
        switch (i) {
            case 0:
                hebVar.d();
                hebVar.c();
                d1bVar.a.b("wm_background_attached_releasing");
                break;
            default:
                hebVar.c();
                d1bVar.a.b("wm_background_detached_releasing");
                break;
        }
        return new a1b(d1bVar);
    }

    @Override // defpackage.ye0
    public final ye0 o() {
        int i = this.b;
        ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = this.c;
        d1b d1bVar = this.x;
        heb hebVar = this.w;
        switch (i) {
            case 0:
                d1bVar.a.b("wm_background_attached_unload");
                hebVar.d();
                hebVar.c();
                break;
            default:
                hebVar.c();
                d1bVar.a.b("wm_background_detached_unload");
                break;
        }
        return new z0b(d1bVar, chatBackgroundController$BackgroundFragment);
    }

    @Override // defpackage.c1b
    public final heb p() {
        int i = this.b;
        return this.w;
    }

    public w0b q() {
        d1b d1bVar = this.x;
        yfa yfaVar = new yfa(d1bVar);
        ChatWebViewController$IntentPage chatWebViewController$IntentPage = ChatWebViewController$IntentPage.UNDEFINED;
        heb hebVar = this.w;
        ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = this.c;
        hebVar.b(chatBackgroundController$BackgroundFragment, yfaVar, chatWebViewController$IntentPage);
        d1bVar.a.b("wm_background_attaching");
        return new w0b(d1bVar, chatBackgroundController$BackgroundFragment, hebVar, 0);
    }
}
