package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yii {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public yii(int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yii)) {
            return false;
        }
        yii yiiVar = (yii) obj;
        return this.a == yiiVar.a && this.b == yiiVar.b && this.c == yiiVar.c && this.d == yiiVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", maxPhotoWidth=", Extension.C_BRAKE, xvz.p("DeliveryPhotocommentScreenConfig(enabled=", this.b, ", maxPointPhotocomments=", ", maxPhotoHeight=", this.a));
    }

    public yii() {
        this(0, 0, 0, false);
    }
}
