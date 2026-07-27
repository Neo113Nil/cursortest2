package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327d implements InterfaceC0325c, InterfaceC0329e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2065n = 0;

    /* renamed from: u, reason: collision with root package name */
    public ClipData f2066u;

    /* renamed from: v, reason: collision with root package name */
    public int f2067v;

    /* renamed from: w, reason: collision with root package name */
    public int f2068w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f2069x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f2070y;

    public /* synthetic */ C0327d() {
    }

    @Override // O.InterfaceC0325c
    public void b(Bundle bundle) {
        this.f2070y = bundle;
    }

    @Override // O.InterfaceC0325c
    public C0331f build() {
        return new C0331f(new C0327d(this));
    }

    @Override // O.InterfaceC0329e
    public int d() {
        return this.f2067v;
    }

    @Override // O.InterfaceC0329e
    public ClipData e() {
        return this.f2066u;
    }

    @Override // O.InterfaceC0325c
    public void f(Uri uri) {
        this.f2069x = uri;
    }

    @Override // O.InterfaceC0325c
    public void n(int i) {
        this.f2068w = i;
    }

    public String toString() {
        String str;
        switch (this.f2065n) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2066u.getDescription());
                sb.append(", source=");
                int i = this.f2067v;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i6 = this.f2068w;
                sb.append((i6 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i6));
                Uri uri = this.f2069x;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return u1.h.g(sb, this.f2070y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0329e
    public int u() {
        return this.f2068w;
    }

    @Override // O.InterfaceC0329e
    public ContentInfo v() {
        return null;
    }

    public C0327d(C0327d c0327d) {
        ClipData clipData = c0327d.f2066u;
        clipData.getClass();
        this.f2066u = clipData;
        int i = c0327d.f2067v;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f2067v = i;
        int i6 = c0327d.f2068w;
        if ((i6 & 1) == i6) {
            this.f2068w = i6;
            this.f2069x = c0327d.f2069x;
            this.f2070y = c0327d.f2070y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i6) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
