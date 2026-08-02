package kotlin.jvm.internal;

import defpackage.d0k;
import defpackage.e9f;
import defpackage.ern;
import defpackage.g9f;
import defpackage.hif;
import defpackage.ns3;
import defpackage.u9f;
import defpackage.x9f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class a implements e9f, Serializable {
    public static final Object NO_RECEIVER = ns3.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient e9f reflected;
    private final String signature;

    public a(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.e9f
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.e9f
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public e9f compute() {
        e9f e9fVar = this.reflected;
        if (e9fVar != null) {
            return e9fVar;
        }
        e9f computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract e9f computeReflected();

    @Override // defpackage.d9f
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.e9f
    public String getName() {
        return this.name;
    }

    public g9f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ern.a(cls);
        }
        ern.a.getClass();
        return new d0k(cls);
    }

    @Override // defpackage.e9f
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public e9f getReflected() {
        e9f compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new hif();
    }

    @Override // defpackage.e9f
    public u9f getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.e9f
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.e9f
    public x9f getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.e9f
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.e9f
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.e9f
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public a() {
        this(NO_RECEIVER, null, null, null, false);
    }
}
