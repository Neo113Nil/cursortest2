package defpackage;

import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lhh extends uhh {
    public final /* synthetic */ int e;
    public final /* synthetic */ oxa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhh(String str, oxa oxaVar, int i) {
        super(str);
        this.e = i;
        this.f = oxaVar;
    }

    @Override // defpackage.uhh
    public final void a() {
        switch (this.e) {
            case 0:
                ((MediaBrowserService.Result) this.f.b).detach();
                break;
            default:
                ((MediaBrowserService.Result) this.f.b).detach();
                break;
        }
    }

    @Override // defpackage.uhh
    public final void c(Object obj) {
        ArrayList arrayList;
        switch (this.e) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                        arrayList2.add(obtain);
                    }
                    arrayList = arrayList2;
                }
                this.f.H(arrayList);
                break;
            default:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                oxa oxaVar = this.f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    oxaVar.H(null);
                    break;
                } else {
                    Parcel obtain2 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem2.writeToParcel(obtain2, 0);
                    oxaVar.H(obtain2);
                    break;
                }
        }
    }
}
