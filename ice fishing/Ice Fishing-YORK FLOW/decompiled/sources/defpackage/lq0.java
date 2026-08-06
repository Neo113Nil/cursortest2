package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lq0 extends defpackage.nq0 {
    public final java.lang.Class s0TASMVLSWD5;

    public lq0(java.lang.Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.s0TASMVLSWD5 = cls;
        } else {
            defpackage.h7.oh71FJcDz6S2(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.nq0
    /* renamed from: P05cfTpS5W5L, reason: merged with bridge method [inline-methods] */
    public final java.lang.Enum JhCgjQRTAOCT(java.lang.String str) {
        java.lang.Object obj;
        java.lang.Class cls = this.s0TASMVLSWD5;
        java.lang.Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (defpackage.ah1.w6IV1lieBIux(((java.lang.Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        if (r3 != null) {
            return r3;
        }
        throw new java.lang.IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }

    @Override // defpackage.nq0, defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        return this.s0TASMVLSWD5.getName();
    }
}
