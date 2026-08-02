package defpackage;

import android.content.Context;
import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;

/* loaded from: classes6.dex */
public abstract class ye0 implements dwa0 {
    public final String a;

    public /* synthetic */ ye0(String str) {
        this.a = str;
    }

    public abstract ye0 b();

    public abstract c1b c(MainWebMessengerFragment mainWebMessengerFragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage);

    public abstract ye0 d();

    public abstract ye0 e(MainWebMessengerFragment mainWebMessengerFragment);

    @Override // defpackage.dwa0
    public String f() {
        return this.a;
    }

    public String g() {
        return this.a;
    }

    public abstract fe10 h();

    public abstract rf10 i(Context context);

    public String j() {
        return this.a;
    }

    public String k() {
        return this.a;
    }

    public String l() {
        return this.a;
    }

    public abstract ye0 m();

    public abstract ye0 n();

    public abstract ye0 o();
}
