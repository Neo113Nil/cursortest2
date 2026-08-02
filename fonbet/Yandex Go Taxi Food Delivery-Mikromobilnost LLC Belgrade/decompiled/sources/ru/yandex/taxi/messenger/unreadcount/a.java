package ru.yandex.taxi.messenger.unreadcount;

import com.yandex.messenger.websdk.api.Cancelable;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.z221;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final r0 a;
    public final gci0 b;
    public volatile boolean c;
    public volatile Cancelable d;
    public final pzt0 e;

    public a(z221 z221Var, String str) {
        r0 c = bvf0.c(0);
        this.a = c;
        this.b = e.d(c);
        this.e = tje.N(z221Var.d, null, null, new UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1(z221Var, str, null, this), 3);
    }
}
