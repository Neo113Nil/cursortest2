package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(String str, int i, String str2, Class cls) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public Object get(Object obj) {
        mo490getGetter();
        throw null;
    }

    public void set(Object obj, Object obj2) {
        mo491getSetter();
        throw null;
    }
}
