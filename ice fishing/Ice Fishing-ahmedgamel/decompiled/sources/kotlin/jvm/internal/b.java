package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b implements O7.b, Serializable {
    public static final Object NO_RECEIVER = a.f38635n;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient O7.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // O7.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // O7.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public O7.b compute() {
        O7.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        O7.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract O7.b computeReflected();

    @Override // O7.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // O7.b
    public String getName() {
        return this.name;
    }

    public O7.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return s.a(cls);
        }
        s.f38645a.getClass();
        return new l(cls);
    }

    @Override // O7.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public O7.b getReflected() {
        O7.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new H7.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // O7.b
    public O7.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // O7.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // O7.b
    public O7.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // O7.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // O7.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // O7.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // O7.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
