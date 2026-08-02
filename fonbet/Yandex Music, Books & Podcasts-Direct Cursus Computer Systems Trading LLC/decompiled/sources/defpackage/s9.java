package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.cast.interaction.AbstractTvInteractor$Companion$DEFAULT_TYPE$1;
import ru.kinopoisk.sdk.easylogin.internal.C1004d1;
import ru.kinopoisk.sdk.easylogin.internal.C1086j;
import ru.kinopoisk.sdk.easylogin.internal.C1100k;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1290xb;
import ru.kinopoisk.sdk.easylogin.internal.Q2;
import ru.kinopoisk.sdk.easylogin.internal.Y0;

/* loaded from: classes5.dex */
public abstract class s9 implements InterfaceC1290xb {

    @NotNull
    public static final Type c;

    @NotNull
    public final Q2 a;

    @NotNull
    public final arf b;

    static {
        Type type = new AbstractTvInteractor$Companion$DEFAULT_TYPE$1().getType();
        type.getClass();
        c = type;
    }

    public s9(Q2 q2) {
        q2.getClass();
        this.a = q2;
        this.b = btf.b(new k5(1, this));
    }

    public abstract Object a(cg6 cg6Var);

    public abstract Object a(Continuation continuation);

    public final Object a(@NotNull Y0 y0, @NotNull Type type, @NotNull cg6 cg6Var) {
        return x97.V(this.a.a(), new C1086j(y0, this, ServiceCommand.TYPE_REQ, type, C1100k.a, null), cg6Var);
    }

    public abstract Object a(C1004d1 c1004d1, Type type, cg6 cg6Var);

    public abstract String a();

    public abstract String b();

    public static final String a(s9 s9Var) {
        s9Var.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }
}
