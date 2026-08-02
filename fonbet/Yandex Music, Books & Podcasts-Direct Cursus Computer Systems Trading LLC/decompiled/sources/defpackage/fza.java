package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.api.UserCodeVerifier;

/* loaded from: classes3.dex */
public final class fza implements UserCodeVerifier {
    public final /* synthetic */ gza a;

    public fza(gza gzaVar) {
        this.a = gzaVar;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.UserCodeVerifier
    public final Object verify(long j, String str, String str2, Continuation continuation) {
        o oVar = this.a.b;
        str.getClass();
        str2.getClass();
        x97.y(cmd.a, dm6.b, null, new n5(oVar, j, str, str2, (Continuation) null), 2);
        return Unit.a;
    }
}
