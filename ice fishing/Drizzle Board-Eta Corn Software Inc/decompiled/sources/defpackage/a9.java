package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a9 implements z8, b9 {
    public ClipData MdtA4re8;
    public final /* synthetic */ int NCTxEWno = 0;
    public Uri P7K7Inc8;
    public int VgvYg0wo;
    public Bundle b2ZJblxo;
    public int wxUZMvaN;

    public a9(a9 a9Var) {
        ClipData clipData = a9Var.MdtA4re8;
        clipData.getClass();
        this.MdtA4re8 = clipData;
        int i = a9Var.wxUZMvaN;
        if (i < 0) {
            Locale locale = Locale.US;
            m1.sjUBp5pO("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            m1.sjUBp5pO("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.wxUZMvaN = i;
        int i2 = a9Var.VgvYg0wo;
        if ((i2 & 1) == i2) {
            this.VgvYg0wo = i2;
            this.P7K7Inc8 = a9Var.P7K7Inc8;
            this.b2ZJblxo = a9Var.b2ZJblxo;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.z8
    public void I5GHvsYW(int i) {
        this.VgvYg0wo = i;
    }

    @Override // defpackage.b9
    public ClipData MdtA4re8() {
        return this.MdtA4re8;
    }

    @Override // defpackage.b9
    public int OxcuoDLp() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.z8
    public c9 build() {
        return new c9(new a9(this));
    }

    @Override // defpackage.b9
    public int jb9XjC4I() {
        return this.VgvYg0wo;
    }

    @Override // defpackage.b9
    public ContentInfo ow5vqvCr() {
        return null;
    }

    @Override // defpackage.z8
    public void setExtras(Bundle bundle) {
        this.b2ZJblxo = bundle;
    }

    @Override // defpackage.z8
    public void sjUBp5pO(Uri uri) {
        this.P7K7Inc8 = uri;
    }

    public String toString() {
        String str;
        switch (this.NCTxEWno) {
            case 1:
                Uri uri = this.P7K7Inc8;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.MdtA4re8.getDescription());
                sb.append(", source=");
                int i = this.wxUZMvaN;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.VgvYg0wo;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.b2ZJblxo != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a9() {
    }
}
