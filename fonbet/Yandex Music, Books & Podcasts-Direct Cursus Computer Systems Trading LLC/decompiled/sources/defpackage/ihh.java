package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* loaded from: classes.dex */
public final class ihh extends uhh {
    public final /* synthetic */ int e;
    public final /* synthetic */ i8o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihh(Object obj, i8o i8oVar, int i) {
        super(obj);
        this.e = i;
        this.f = i8oVar;
    }

    @Override // defpackage.uhh
    public final void c(Object obj) {
        switch (this.e) {
            case 0:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
                int i = this.d & 2;
                i8o i8oVar = this.f;
                if (i == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
                    i8oVar.b(0, bundle);
                    break;
                } else {
                    i8oVar.b(-1, null);
                    break;
                }
            default:
                List list = (List) obj;
                int i2 = this.d & 4;
                i8o i8oVar2 = this.f;
                if (i2 == 0 && list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    i8oVar2.b(0, bundle2);
                    break;
                } else {
                    i8oVar2.b(-1, null);
                    break;
                }
        }
    }
}
