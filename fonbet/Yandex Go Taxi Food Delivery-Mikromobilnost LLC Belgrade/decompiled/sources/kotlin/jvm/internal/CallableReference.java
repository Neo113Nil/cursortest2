package kotlin.jvm.internal;

import defpackage.a590;
import defpackage.kfx;
import defpackage.mfx;
import defpackage.mgx;
import defpackage.qoi0;
import defpackage.rcb1;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* loaded from: classes9.dex */
public abstract class CallableReference implements kfx, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient kfx reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {
        public static final NoReceiver a = new NoReceiver();

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.kfx
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.kfx
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public kfx compute() {
        kfx kfxVar = this.reflected;
        if (kfxVar != null) {
            return kfxVar;
        }
        kfx computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract kfx computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        return rcb1.e(getOwner(), getSignature());
    }

    @Override // defpackage.jfx
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.kfx
    public String getName() {
        return this.name;
    }

    public mfx getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return qoi0.a(cls);
        }
        qoi0.a.getClass();
        return new a590(cls);
    }

    @Override // defpackage.kfx
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public kfx getReflected() {
        kfx compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // defpackage.kfx
    public mgx getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.kfx
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.kfx
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.kfx
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.kfx
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.kfx
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.kfx
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference() {
        this(NO_RECEIVER, null, null, null, false);
    }
}
