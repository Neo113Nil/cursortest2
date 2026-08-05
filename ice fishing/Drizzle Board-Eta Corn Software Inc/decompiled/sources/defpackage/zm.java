package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zm implements an {
    public final InputContentInfo NCTxEWno;

    public zm(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.NCTxEWno = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.an
    public final Object MdtA4re8() {
        return this.NCTxEWno;
    }

    @Override // defpackage.an
    public final void P7K7Inc8() {
        this.NCTxEWno.requestPermission();
    }

    @Override // defpackage.an
    public final Uri b2ZJblxo() {
        return this.NCTxEWno.getLinkUri();
    }

    @Override // defpackage.an
    public final ClipDescription qoPGr6Ce() {
        return this.NCTxEWno.getDescription();
    }

    @Override // defpackage.an
    public final Uri wxUZMvaN() {
        return this.NCTxEWno.getContentUri();
    }

    public zm(Object obj) {
        this.NCTxEWno = (InputContentInfo) obj;
    }
}
