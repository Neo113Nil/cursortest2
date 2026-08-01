package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v0.AbstractC0360a;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d implements InterfaceC0027c, InterfaceC0029e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f796a;

    /* renamed from: b, reason: collision with root package name */
    public Object f797b;

    /* renamed from: c, reason: collision with root package name */
    public int f798c;

    /* renamed from: d, reason: collision with root package name */
    public int f799d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f800f;

    public /* synthetic */ C0028d() {
        this.f796a = 0;
    }

    @Override // O.InterfaceC0027c
    public void a(Bundle bundle) {
        this.f800f = bundle;
    }

    public void b(j0 j0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((X) it.next()).f776a.c() & 8) != 0) {
                ((View) this.e).setTranslationY(AbstractC0360a.c(this.f799d, 0, r3.f776a.b()));
                return;
            }
        }
    }

    @Override // O.InterfaceC0027c
    public void d(Uri uri) {
        this.e = uri;
    }

    @Override // O.InterfaceC0029e
    public int f() {
        return this.f798c;
    }

    @Override // O.InterfaceC0029e
    public ClipData h() {
        return (ClipData) this.f797b;
    }

    @Override // O.InterfaceC0027c
    public C0030f k() {
        return new C0030f(new C0028d(this));
    }

    @Override // O.InterfaceC0029e
    public int n() {
        return this.f799d;
    }

    public String toString() {
        String str;
        switch (this.f796a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f797b).getDescription());
                sb.append(", source=");
                int i = this.f798c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f799d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return D1.h.h(sb, ((Bundle) this.f800f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0029e
    public ContentInfo v() {
        return null;
    }

    @Override // O.InterfaceC0027c
    public void y(int i) {
        this.f799d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0028d(View view) {
        this.f796a = 2;
        this.f800f = new int[2];
        this.e = view;
    }

    public C0028d(C0028d c0028d) {
        this.f796a = 1;
        ClipData clipData = (ClipData) c0028d.f797b;
        clipData.getClass();
        this.f797b = clipData;
        int i = c0028d.f798c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f798c = i;
            int i2 = c0028d.f799d;
            if ((i2 & 1) == i2) {
                this.f799d = i2;
                this.e = (Uri) c0028d.e;
                this.f800f = (Bundle) c0028d.f800f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
