package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class f3 implements wn, Serializable {
    public final Object MdtA4re8;
    public transient wn NCTxEWno;
    public final String P7K7Inc8;
    public final String VgvYg0wo;
    public final boolean b2ZJblxo;
    public final Class wxUZMvaN;

    public f3(Object obj, Class cls, String str, String str2, boolean z) {
        this.MdtA4re8 = obj;
        this.wxUZMvaN = cls;
        this.VgvYg0wo = str;
        this.P7K7Inc8 = str2;
        this.b2ZJblxo = z;
    }

    public abstract wn MdtA4re8();

    public final o5 wxUZMvaN() {
        boolean z = this.b2ZJblxo;
        Class cls = this.wxUZMvaN;
        if (!z) {
            return m20.qoPGr6Ce(cls);
        }
        m20.qoPGr6Ce.getClass();
        return new gx(cls);
    }
}
