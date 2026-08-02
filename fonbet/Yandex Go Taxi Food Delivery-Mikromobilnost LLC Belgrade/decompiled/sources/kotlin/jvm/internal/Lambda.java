package kotlin.jvm.internal;

import defpackage.lms;
import defpackage.qoi0;
import defpackage.uoi0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Llms;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "arity", CA20Status.STATUS_USER_I, "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class Lambda<R> implements lms, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // defpackage.lms
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        qoi0.a.getClass();
        return uoi0.a(this);
    }
}
