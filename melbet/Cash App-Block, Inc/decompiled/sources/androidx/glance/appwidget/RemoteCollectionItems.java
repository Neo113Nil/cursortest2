package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RemoteCollectionItems {
    public static final RemoteCollectionItems Empty = new RemoteCollectionItems(new long[0], new RemoteViews[0], 1);
    public final int _viewTypeCount;
    public final long[] ids;
    public final RemoteViews[] views;

    public RemoteCollectionItems(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.ids = jArr;
        this.views = remoteViewsArr;
        this._viewTypeCount = i;
        if (jArr.length != remoteViewsArr.length) {
            a$$ExternalSyntheticBUOutline0.m$3("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            a$$ExternalSyntheticBUOutline0.m$3("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList)).size();
        if (size <= this._viewTypeCount) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline1.m(this._viewTypeCount, size, ", but the collection contains ", " different layout ids", new StringBuilder("View type count is set to ")));
        throw null;
    }
}
