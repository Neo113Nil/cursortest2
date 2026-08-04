package com.gamericefishpro.space.d4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c, e {
    public final /* synthetic */ int d = 0;
    public ClipData e;
    public int i;
    public int v;
    public Uri w;
    public Bundle y;

    public /* synthetic */ d() {
    }

    @Override // com.gamericefishpro.space.d4.e
    public ClipData a() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.d4.e
    public int b() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.d4.c
    public f build() {
        return new f(new d(this));
    }

    @Override // com.gamericefishpro.space.d4.e
    public ContentInfo c() {
        return null;
    }

    @Override // com.gamericefishpro.space.d4.c
    public void d(Uri uri) {
        this.w = uri;
    }

    @Override // com.gamericefishpro.space.d4.e
    public int e() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.d4.c
    public void f(int i) {
        this.v = i;
    }

    @Override // com.gamericefishpro.space.d4.c
    public void setExtras(Bundle bundle) {
        this.y = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.d) {
            case 1:
                Uri uri = this.w;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.e.getDescription());
                sb.append(", source=");
                int i = this.i;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.v;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return com.gamericefishpro.space.t0.y0.j(sb, this.y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.e;
        clipData.getClass();
        this.e = clipData;
        int i = dVar.i;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.i = i;
        int i2 = dVar.v;
        if ((i2 & 1) == i2) {
            this.v = i2;
            this.w = dVar.w;
            this.y = dVar.y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
