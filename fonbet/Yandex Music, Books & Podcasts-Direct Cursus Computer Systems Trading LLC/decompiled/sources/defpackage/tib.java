package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tib implements n2i {
    public static final dsc g;
    public static final dsc h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("application/id3");
        g = new dsc(bscVar);
        bsc bscVar2 = new bsc();
        bscVar2.m = l5i.p("application/x-scte35");
        h = new dsc(bscVar2);
    }

    public tib(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tib.class != obj.getClass()) {
            return false;
        }
        tib tibVar = (tib) obj;
        return this.c == tibVar.c && this.d == tibVar.d && Objects.equals(this.a, tibVar.a) && this.b.equals(tibVar.b) && Arrays.equals(this.e, tibVar.e);
    }

    @Override // defpackage.n2i
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.e;
        }
        return null;
    }

    @Override // defpackage.n2i
    public final dsc getWrappedMetadataFormat() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int c = k5r.c((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
            long j = this.c;
            int i = (c + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
