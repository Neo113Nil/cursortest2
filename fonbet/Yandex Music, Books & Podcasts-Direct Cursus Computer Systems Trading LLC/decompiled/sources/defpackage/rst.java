package defpackage;

import com.yandex.music.shared.auth.proto.a;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rst implements hip {
    public static final rst a = new rst();
    public static final a b;

    static {
        a aVar = a.l;
        aVar.getClass();
        b = aVar;
    }

    @Override // defpackage.hip
    public final Object a() {
        return b;
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        a aVar = (a) obj;
        if (aVar != null) {
            aVar.writeTo(outputStream);
        }
        return Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        try {
            return (a) o3d.parseFrom(a.l, fileInputStream);
        } catch (bye e) {
            Assertions.throwOrSkip("SharedAuth", new FailedAssertionException("Cannot read proto.", e));
            return a.l;
        }
    }
}
