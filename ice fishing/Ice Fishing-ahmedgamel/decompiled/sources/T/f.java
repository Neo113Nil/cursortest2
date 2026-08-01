package T;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: n, reason: collision with root package name */
    public final InputContentInfo f3023n;

    public f(Object obj) {
        this.f3023n = (InputContentInfo) obj;
    }

    @Override // T.g
    public final Uri a() {
        return this.f3023n.getContentUri();
    }

    @Override // T.g
    public final void c() {
        this.f3023n.requestPermission();
    }

    @Override // T.g
    public final Uri e() {
        return this.f3023n.getLinkUri();
    }

    @Override // T.g
    public final ClipDescription getDescription() {
        return this.f3023n.getDescription();
    }

    @Override // T.g
    public final Object h() {
        return this.f3023n;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3023n = new InputContentInfo(uri, clipDescription, uri2);
    }
}
