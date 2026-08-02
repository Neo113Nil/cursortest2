package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.i8o;
import defpackage.osh;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends i8o {
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
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
