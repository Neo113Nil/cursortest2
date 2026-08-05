package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zu extends dv {
    public final Class KlHjfFWx;

    public zu(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.KlHjfFWx = cls;
        } else {
            m1.OnDfzHZD(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.dv, defpackage.ev
    public final String NCTxEWno() {
        return this.KlHjfFWx.getName();
    }

    @Override // defpackage.dv, defpackage.ev
    /* renamed from: Qr9iLBAD, reason: merged with bridge method [inline-methods] */
    public final Enum wxUZMvaN(String str) {
        Object obj;
        str.getClass();
        Class cls = this.KlHjfFWx;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            String name = ((Enum) obj).name();
            if (name == null ? str == null : name.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder b2ZJblxo = q70.b2ZJblxo("Enum value ", str, " not found for type ");
        b2ZJblxo.append(cls.getName());
        b2ZJblxo.append('.');
        throw new IllegalArgumentException(b2ZJblxo.toString());
    }
}
