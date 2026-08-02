package kotlin.coroutines;

import defpackage.dse;
import defpackage.ese;
import defpackage.fse;
import defpackage.wls;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lfse;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EmptyCoroutineContext implements fse, Serializable {
    public static final EmptyCoroutineContext a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return obj;
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return this;
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return fseVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
