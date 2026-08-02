package defpackage;

import com.yandex.messenger.websdk.internal.webview.ChatWebViewClient;

/* loaded from: classes15.dex */
public final /* synthetic */ class xdb {
    public final /* synthetic */ ChatWebViewClient a;

    public /* synthetic */ xdb(ChatWebViewClient chatWebViewClient) {
        this.a = chatWebViewClient;
    }

    public final void a() {
        heb hebVar = (heb) this.a.controller;
        hebVar.g.b("wm_main_new_token");
        hebVar.i("onTokenChange", null);
    }
}
