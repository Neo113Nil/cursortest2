package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import x1.InterfaceC1067b;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC1067b, Serializable {
    public static final Object NO_RECEIVER = a.f8066a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1067b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // x1.InterfaceC1067b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // x1.InterfaceC1067b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1067b compute() {
        InterfaceC1067b interfaceC1067b = this.reflected;
        if (interfaceC1067b != null) {
            return interfaceC1067b;
        }
        InterfaceC1067b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC1067b computeReflected();

    @Override // x1.InterfaceC1066a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public x1.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return q.a(cls);
        }
        q.f8077a.getClass();
        return new k(cls);
    }

    @Override // x1.InterfaceC1067b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1067b getReflected();

    @Override // x1.InterfaceC1067b
    public x1.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // x1.InterfaceC1067b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // x1.InterfaceC1067b
    public x1.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // x1.InterfaceC1067b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // x1.InterfaceC1067b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // x1.InterfaceC1067b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
