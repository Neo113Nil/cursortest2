package com.yandex.plus.pay.ui.core.api.domain;

import android.net.Uri;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.pay.log.impl.b;
import defpackage.cg6;
import defpackage.x97;
import defpackage.xz0;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class a {
    public static final Set d = xz0.Y(new String[]{"http", "https"});
    public final i a;
    public final kotlinx.coroutines.a b;
    public final b c;

    public a(i iVar, kotlinx.coroutines.a aVar, b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = iVar;
        this.b = aVar;
        this.c = bVar;
    }

    public final Object a(String str, cg6 cg6Var) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        b bVar = this.c;
        if (scheme == null || !CollectionsKt.I(d, parse.getScheme())) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            bVar.getClass();
            bVar.c(aVar, "PlusPayGetAuthorizedUrlInteractorImpl", "Invalid scheme for url = \"" + str + '\"');
            return str;
        }
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
            bVar.getClass();
            bVar.c(aVar2, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to get host for url = \"" + str + '\"');
            return str;
        }
        String host2 = parse.getHost();
        List e0 = host2 != null ? StringsKt.e0(host2, new char[]{'.'}, 6) : null;
        String str2 = e0 != null ? (String) CollectionsKt.Z(e0) : null;
        if (str2 != null) {
            return x97.V(this.b, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(9, this, parse, str2, str, (Continuation) null), cg6Var);
        }
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
        bVar.getClass();
        bVar.c(aVar3, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to get TLD for url = \"" + str + '\"');
        return str;
    }
}
