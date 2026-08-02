package T;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: n, reason: collision with root package name */
    public final InputContentInfo f3106n;

    public f(Object obj) {
        this.f3106n = (InputContentInfo) obj;
    }

    @Override // T.g
    public final Uri b() {
        return this.f3106n.getContentUri();
    }

    @Override // T.g
    public final void c() {
        this.f3106n.requestPermission();
    }

    @Override // T.g
    public final Uri d() {
        return this.f3106n.getLinkUri();
    }

    @Override // T.g
    public final Object f() {
        return this.f3106n;
    }

    @Override // T.g
    public final ClipDescription getDescription() {
        return this.f3106n.getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3106n = new InputContentInfo(uri, clipDescription, uri2);
    }
}
