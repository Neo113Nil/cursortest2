package defpackage;

import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;

/* loaded from: classes15.dex */
public final class z0b extends ye0 implements y0b {
    public final ChatBackgroundController$BackgroundFragment b;
    public final /* synthetic */ d1b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0b(d1b d1bVar, ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment) {
        super("empty");
        this.c = d1bVar;
        this.b = chatBackgroundController$BackgroundFragment;
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
        d1b d1bVar = this.c;
        d1bVar.a.b("wm_foreground_loading");
        heb a = d1bVar.b.a();
        a.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
        return new x0b(d1bVar, this.b, a, mainWebMessengerFragment);
    }

    @Override // defpackage.ye0
    public final ye0 d() {
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 n() {
        return new a1b(this.c);
    }

    @Override // defpackage.ye0
    public final ye0 o() {
        return this;
    }

    @Override // defpackage.ye0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final c1b m() {
        d1b d1bVar = this.c;
        d1bVar.a.b("wm_background_loading");
        heb a = d1bVar.b.a();
        ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment = this.b;
        w0b w0bVar = new w0b(d1bVar, chatBackgroundController$BackgroundFragment, a, 1);
        return chatBackgroundController$BackgroundFragment.getIsViewCreated() ? w0bVar.q() : w0bVar;
    }
}
