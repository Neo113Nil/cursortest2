package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class cne implements dne {
    public final InputContentInfo a;

    public cne(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.dne
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // defpackage.dne
    public final Object i() {
        return this.a;
    }

    @Override // defpackage.dne
    public final Uri l() {
        return this.a.getContentUri();
    }

    @Override // defpackage.dne
    public final void m() {
        this.a.requestPermission();
    }

    @Override // defpackage.dne
    public final Uri q() {
        return this.a.getLinkUri();
    }

    public cne(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
