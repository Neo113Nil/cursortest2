package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bdn {
    public final String a;
    public final String b;
    public final ild c;
    public final boolean d;
    public final Uri e;

    public bdn(String str, String str2, ild ildVar, boolean z, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = ildVar;
        this.d = z;
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdn)) {
            return false;
        }
        bdn bdnVar = (bdn) obj;
        return Intrinsics.d(this.a, bdnVar.a) && Intrinsics.d(this.b, bdnVar.b) && this.c.equals(bdnVar.c) && this.d == bdnVar.d && Intrinsics.d(this.e, bdnVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = k5r.e((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d);
        Uri uri = this.e;
        return e + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("QueueUiData(title=", this.a, ", subtitle=", this.b, ", castState=");
        m.append(this.c);
        m.append(", queueScreenAvailable=");
        m.append(this.d);
        m.append(", deeplink=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
