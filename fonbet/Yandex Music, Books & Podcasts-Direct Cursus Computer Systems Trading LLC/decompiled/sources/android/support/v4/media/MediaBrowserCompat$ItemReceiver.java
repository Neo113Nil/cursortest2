package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.i8o;
import defpackage.osh;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends i8o {
    @Override // defpackage.i8o
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = osh.a0(bundle);
        }
        if (i != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
