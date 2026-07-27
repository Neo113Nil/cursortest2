package T;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: n, reason: collision with root package name */
    public final InputContentInfo f3033n;

    public f(Object obj) {
        this.f3033n = (InputContentInfo) obj;
    }

    @Override // T.g
    public final Uri b() {
        return this.f3033n.getContentUri();
    }

    @Override // T.g
    public final void e() {
        this.f3033n.requestPermission();
    }

    @Override // T.g
    public final Uri f() {
        return this.f3033n.getLinkUri();
    }

    @Override // T.g
    public final ClipDescription getDescription() {
        return this.f3033n.getDescription();
    }

    @Override // T.g
    public final Object h() {
        return this.f3033n;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3033n = new InputContentInfo(uri, clipDescription, uri2);
    }
}
