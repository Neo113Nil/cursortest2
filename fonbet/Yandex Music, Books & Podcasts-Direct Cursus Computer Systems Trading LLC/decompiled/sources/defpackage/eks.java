package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class eks implements hip {
    public static final eks a = new eks();
    public static final a b;

    static {
        a aVar = a.e;
        aVar.getClass();
        b = aVar;
    }

    @Override // defpackage.hip
    public final Object a() {
        return b;
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        ((a) obj).writeTo(outputStream);
        return Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        try {
            a aVar = (a) o3d.parseFrom(a.e, fileInputStream);
            aVar.getClass();
            return aVar;
        } catch (bye e) {
            Assertions.throwOrSkip("TinyMlStorage", new FailedAssertionException("Cannot read proto state!", e));
            return b;
        }
    }
}
