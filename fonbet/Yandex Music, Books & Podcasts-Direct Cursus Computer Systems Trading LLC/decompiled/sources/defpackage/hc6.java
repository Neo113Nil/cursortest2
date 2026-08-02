package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class hc6 implements gc6, ic6 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public hc6(hc6 hc6Var) {
        ClipData clipData = hc6Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = hc6Var.c;
        if (i < 0) {
            Locale locale = Locale.US;
            xq0.x("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            xq0.x("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = hc6Var.d;
        if ((i2 & 1) != i2) {
            jj4.l("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i2;
        this.e = hc6Var.e;
        this.f = hc6Var.f;
    }

    @Override // defpackage.gc6
    public void a(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.gc6
    public void b(int i) {
        this.d = i;
    }

    @Override // defpackage.gc6
    public jc6 build() {
        return new jc6(new hc6(this));
    }

    @Override // defpackage.ic6
    public int e() {
        return this.c;
    }

    @Override // defpackage.ic6
    public ContentInfo f() {
        return null;
    }

    @Override // defpackage.ic6
    public ClipData g() {
        return this.b;
    }

    @Override // defpackage.ic6
    public int h() {
        return this.d;
    }

    @Override // defpackage.gc6
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return su4.o(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hc6() {
    }
}
