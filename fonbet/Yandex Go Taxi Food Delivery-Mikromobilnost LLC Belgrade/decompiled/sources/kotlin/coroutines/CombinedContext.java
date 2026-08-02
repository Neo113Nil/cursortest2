package kotlin.coroutines;

import defpackage.b64;
import defpackage.cvw;
import defpackage.dse;
import defpackage.ese;
import defpackage.fse;
import defpackage.i9a;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yk;
import defpackage.zy11;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lfse;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "left", "Lfse;", "Ldse;", "element", "Ldse;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CombinedContext implements fse, Serializable {
    private final dse element;
    private final fse left;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", "Lfse;", "elements", "[Lfse;", "getElements", "()[Lfse;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final fse[] elements;

        public Serialized(fse[] fseVarArr) {
            this.elements = fseVarArr;
        }

        private final Object readResolve() {
            fse[] fseVarArr = this.elements;
            fse fseVar = EmptyCoroutineContext.a;
            for (fse fseVar2 : fseVarArr) {
                fseVar = fseVar.plus(fseVar2);
            }
            return fseVar;
        }
    }

    public CombinedContext(fse fseVar, dse dseVar) {
        this.left = fseVar;
        this.element = dseVar;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int b = b();
        fse[] fseVarArr = new fse[b];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(zy11.a, new i9a(20, fseVarArr, ref$IntRef));
        if (ref$IntRef.element == b) {
            return new Serialized(fseVarArr);
        }
        ny61.r("Check failed.");
        return null;
    }

    public final int b() {
        int i = 2;
        while (true) {
            fse fseVar = this.left;
            this = fseVar instanceof CombinedContext ? (CombinedContext) fseVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.b() == b()) {
                while (true) {
                    dse dseVar = this.element;
                    if (!jl40.l(combinedContext.get(dseVar.getKey()), dseVar)) {
                        z = false;
                        break;
                    }
                    fse fseVar = this.left;
                    if (!(fseVar instanceof CombinedContext)) {
                        dse dseVar2 = (dse) fseVar;
                        z = jl40.l(combinedContext.get(dseVar2.getKey()), dseVar2);
                        break;
                    }
                    this = (CombinedContext) fseVar;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(this.left.fold(obj, wlsVar), this.element);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        while (true) {
            dse dseVar = this.element.get(eseVar);
            if (dseVar != null) {
                return dseVar;
            }
            fse fseVar = this.left;
            if (!(fseVar instanceof CombinedContext)) {
                return fseVar.get(eseVar);
            }
            this = (CombinedContext) fseVar;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        dse dseVar = this.element.get(eseVar);
        fse fseVar = this.left;
        if (dseVar != null) {
            return fseVar;
        }
        fse minusKey = fseVar.minusKey(eseVar);
        if (minusKey == this.left) {
            return this;
        }
        dse dseVar2 = this.element;
        return minusKey == EmptyCoroutineContext.a ? dseVar2 : new CombinedContext(minusKey, dseVar2);
    }

    @Override // defpackage.fse
    public final /* bridge */ fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    public final String toString() {
        return b64.p(new StringBuilder("["), (String) fold("", new yk(4)), ']');
    }
}
