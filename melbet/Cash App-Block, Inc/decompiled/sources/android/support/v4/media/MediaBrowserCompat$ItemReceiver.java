package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import defpackage.DropMode;

/* loaded from: classes3.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(DropMode.class.getClassLoader());
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
