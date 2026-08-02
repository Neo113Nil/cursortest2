package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public final class spi {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public spi(spi spiVar) {
        this.a = 1;
        this.b = spiVar.b;
        this.c = spiVar.c;
        this.d = spiVar.d;
        this.e = spiVar.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "MutableRect(" + jf0.a0(this.b) + ", " + jf0.a0(this.c) + ", " + jf0.a0(this.d) + ", " + jf0.a0(this.e) + ')';
            default:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.b);
                sb.append(StringUtil.SPACE);
                sb.append(this.c);
                sb.append(StringUtil.SPACE);
                sb.append(this.d);
                sb.append(StringUtil.SPACE);
                return su4.m(this.e, "]", sb);
        }
    }

    public spi(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public spi() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
