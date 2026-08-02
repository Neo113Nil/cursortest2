package defpackage;

import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;

/* loaded from: classes15.dex */
public final class x0b extends c1b implements y0b {
    public final ChatBackgroundController$BackgroundFragment b;
    public final heb c;
    public final MainWebMessengerFragment w;
    public final /* synthetic */ d1b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b(d1b d1bVar, ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment, heb hebVar, MainWebMessengerFragment mainWebMessengerFragment) {
        super("foreground");
        this.x = d1bVar;
        this.b = chatBackgroundController$BackgroundFragment;
        this.c = hebVar;
        this.w = mainWebMessengerFragment;
    }

    @Override // defpackage.y0b
    public final ChatBackgroundController$BackgroundFragment a() {
        return this.b;
    }

    @Override // defpackage.ye0
    public final ye0 b() {
        return this;
    }

    @Override // defpackage.ye0
    public final c1b c(MainWebMessengerFragment mainWebMessengerFragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        if (mainWebMessengerFragment.equals(this.w)) {
            jl40.x("Attaching twice in a row without detaching");
            return this;
        }
        d1b d1bVar = this.x;
        d1bVar.a.b("wm_foreground_replacing");
        heb hebVar = this.c;
        hebVar.d();
        hebVar.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
        return new x0b(d1bVar, this.b, hebVar, mainWebMessengerFragment);
    }

    @Override // defpackage.ye0
    public final ye0 d() {
        this.x.a.b("wm_foreground_owning");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 e(MainWebMessengerFragment mainWebMessengerFragment) {
        if (!mainWebMessengerFragment.equals(this.w)) {
            return this;
        }
        d1b d1bVar = this.x;
        d1bVar.a.b("wm_foreground_detaching");
        heb hebVar = this.c;
        hebVar.d();
        boolean z = d1bVar.e;
        ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = this.b;
        if (!z) {
            hebVar.c();
            return new z0b(d1bVar, chatBackgroundController$BackgroundFragment);
        }
        if (!chatBackgroundController$BackgroundFragment.getIsViewCreated()) {
            return new w0b(d1bVar, chatBackgroundController$BackgroundFragment, hebVar, 1);
        }
        hebVar.b(chatBackgroundController$BackgroundFragment, new yfa(d1bVar), ChatWebViewController$IntentPage.UNDEFINED);
        return new w0b(d1bVar, chatBackgroundController$BackgroundFragment, hebVar, 0);
    }

    @Override // defpackage.ye0
    public final ye0 m() {
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 n() {
        d1b d1bVar = this.x;
        d1bVar.a.b("wm_foreground_releasing");
        return new b1b(d1bVar, this.c, this.w);
    }

    @Override // defpackage.ye0
    public final ye0 o() {
        return this;
    }

    @Override // defpackage.c1b
    public final heb p() {
        return this.c;
    }
}
