package com.yandex.plus.bdui.plus.webview.navigation;

import android.net.Uri;
import com.yandex.plus.bdui.plus.action.y;
import defpackage.btf;
import defpackage.jyr;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends b {
    public static final jyr d = btf.b(new com.yandex.plus.bdui.plus.shared.serializer.d(1));
    public final String a;
    public final String b;
    public final Uri c;

    public d(Uri uri, String str, String str2) {
        super((y) d.getValue());
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final String a() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final String b() {
        return this.b;
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final Uri c() {
        return this.c;
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c);
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SimpleNavigation(baseUrl=" + this.a + ", entryPath=" + this.b + ", uri=" + this.c + ')';
    }
}
