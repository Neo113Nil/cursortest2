package defpackage;

import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.B0;
import ru.kinopoisk.sdk.easylogin.internal.P0;

/* loaded from: classes5.dex */
public final /* synthetic */ class xh2 implements qyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xh2(uif uifVar, int i) {
        this.a = i;
        this.b = (Function1) uifVar;
    }

    @Override // defpackage.qyc
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return B0.a(this.b, obj);
            default:
                return P0.c(this.b, obj);
        }
    }
}
