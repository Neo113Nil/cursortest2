package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.internal.ads.Wv;
import java.util.Locale;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332d implements InterfaceC0330c, InterfaceC0334e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2153n = 0;

    /* renamed from: u, reason: collision with root package name */
    public ClipData f2154u;

    /* renamed from: v, reason: collision with root package name */
    public int f2155v;

    /* renamed from: w, reason: collision with root package name */
    public int f2156w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f2157x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f2158y;

    public /* synthetic */ C0332d() {
    }

    @Override // O.InterfaceC0330c
    public void a(Bundle bundle) {
        this.f2158y = bundle;
    }

    @Override // O.InterfaceC0330c
    public C0336f build() {
        return new C0336f(new C0332d(this));
    }

    @Override // O.InterfaceC0334e
    public int d() {
        return this.f2155v;
    }

    @Override // O.InterfaceC0334e
    public ClipData e() {
        return this.f2154u;
    }

    @Override // O.InterfaceC0330c
    public void h(Uri uri) {
        this.f2157x = uri;
    }

    @Override // O.InterfaceC0330c
    public void i(int i) {
        this.f2156w = i;
    }

    public String toString() {
        String str;
        switch (this.f2153n) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2154u.getDescription());
                sb.append(", source=");
                int i = this.f2155v;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f2156w;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = this.f2157x;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return Wv.i(sb, this.f2158y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0334e
    public int u() {
        return this.f2156w;
    }

    @Override // O.InterfaceC0334e
    public ContentInfo x() {
        return null;
    }

    public C0332d(C0332d c0332d) {
        ClipData clipData = c0332d.f2154u;
        clipData.getClass();
        this.f2154u = clipData;
        int i = c0332d.f2155v;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f2155v = i;
        int i4 = c0332d.f2156w;
        if ((i4 & 1) == i4) {
            this.f2156w = i4;
            this.f2157x = c0332d.f2157x;
            this.f2158y = c0332d.f2158y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
