package ru.yandex.taxi.am;

import defpackage.kj;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/am/InternalLinkAccountRouter$LinkAccountNotAuthorizedException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkj;", "account", "Lkj;", "a", "()Lkj;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalLinkAccountRouter$LinkAccountNotAuthorizedException extends Exception {
    private final kj account;

    public InternalLinkAccountRouter$LinkAccountNotAuthorizedException(Throwable th, kj kjVar) {
        super("Linkage portal account not authorized", th);
        this.account = kjVar;
    }

    /* renamed from: a, reason: from getter */
    public final kj getAccount() {
        return this.account;
    }
}
