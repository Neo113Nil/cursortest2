package f0;

/* loaded from: classes.dex */
public final class G extends K {

    /* renamed from: s, reason: collision with root package name */
    public final Class f2873s;

    public G(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f2873s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // f0.K, f0.L
    public final String b() {
        return this.f2873s.getName();
    }

    @Override // f0.K
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        D1.i.e(str, "value");
        Class cls = this.f2873s;
        Object[] enumConstants = cls.getEnumConstants();
        D1.i.d(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            String name = ((Enum) obj).name();
            if (name == null ? false : name.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        Enum r5 = (Enum) obj;
        if (r5 != null) {
            return r5;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
