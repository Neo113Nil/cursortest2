package com.yandex.messenger.websdk.api;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.btf;
import defpackage.cuk;
import defpackage.dh4;
import defpackage.eh4;
import defpackage.ern;
import defpackage.fh4;
import defpackage.ia0;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.kh4;
import defpackage.mhm;
import defpackage.ncv;
import defpackage.p7h;
import defpackage.qdc;
import defpackage.vbv;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/WebMessenger;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class WebMessenger {
    public final MessengerParams a;
    public final jyr b;
    public final jyr c;
    public final vbv d;

    public WebMessenger(Context context, MessengerParams messengerParams, MessengerAnalyticsFactory messengerAnalyticsFactory, SupportInfoProvider supportInfoProvider, cuk cukVar) {
        WebChromeClientConfig webChromeClientConfig = new WebChromeClientConfig();
        this.a = messengerParams;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: tbv
            public final /* synthetic */ WebMessenger b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (hfj) this.b.d.m.getValue();
                    default:
                        return (h02) this.b.d.k.getValue();
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: tbv
            public final /* synthetic */ WebMessenger b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (hfj) this.b.d.m.getValue();
                    default:
                        return (h02) this.b.d.k.getValue();
                }
            }
        });
        WeakReference weakReference = ncv.a;
        if (weakReference == null || ((ncv) weakReference.get()) == null) {
            ncv.a = new WeakReference(new ncv());
        }
        vbv vbvVar = new vbv(context, messengerParams, messengerAnalyticsFactory, supportInfoProvider, cukVar, webChromeClientConfig, new mhm());
        this.d = vbvVar;
        qdc qdcVar = vbvVar.r;
        k5r.t(qdcVar, qdcVar, "wm_init_sdk");
    }

    public final dh4 a() {
        dh4 a;
        kh4 kh4Var = (kh4) this.d.w.getValue();
        qdc qdcVar = kh4Var.a;
        k5r.t(qdcVar, qdcVar, "wm_chat_background_init");
        Object obj = kh4Var.d;
        eh4 eh4Var = obj instanceof eh4 ? (eh4) obj : null;
        if (eh4Var != null && (a = eh4Var.a()) != null) {
            a.g = null;
        }
        kh4Var.d.f();
        dh4 dh4Var = new dh4();
        fh4 fh4Var = new fh4(kh4Var, dh4Var);
        dh4Var.g = kh4Var;
        kh4Var.d = fh4Var;
        return dh4Var;
    }

    public final p7h b(ChatRequest chatRequest, String str, String str2) {
        vbv vbvVar = this.d;
        vbvVar.r.sendEvent("wm_get_chat_frame", chatRequest.c());
        p7h p7hVar = new p7h();
        p7hVar.g = new ia0(p7hVar, vbvVar, chatRequest, str, str2);
        return p7hVar;
    }

    public final String toString() {
        String h = ern.a(this.a.b.getClass()).h();
        String str = StringsKt.U("music") ? null : "music";
        if (str == null) {
            str = "no workspace";
        }
        return k5r.m(h, ";", str, ";yandex.ru");
    }
}
