package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ei {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final int P7K7Inc8;
    public final String VgvYg0wo;
    public final Uri qoPGr6Ce;
    public final boolean wxUZMvaN;

    public ei(String str, String str2) {
        this.qoPGr6Ce = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.NCTxEWno = 0;
        this.MdtA4re8 = 400;
        this.wxUZMvaN = false;
        this.VgvYg0wo = str2;
        this.P7K7Inc8 = 0;
    }

    public ei(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.qoPGr6Ce = uri;
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = z;
        this.VgvYg0wo = str;
        this.P7K7Inc8 = i3;
    }
}
