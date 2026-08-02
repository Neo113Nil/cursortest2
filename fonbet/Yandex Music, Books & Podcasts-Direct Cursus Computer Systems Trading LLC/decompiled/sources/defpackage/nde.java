package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class nde extends cee {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.cee
    public final qde d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cee
    /* renamed from: f */
    public final qde values() {
        return ((psn) this).h.keySet();
    }

    @Override // defpackage.cee, java.util.Map
    public final Collection values() {
        return ((psn) this).h.keySet();
    }

    @Override // defpackage.cee
    public Object writeReplace() {
        return new mde(this);
    }
}
