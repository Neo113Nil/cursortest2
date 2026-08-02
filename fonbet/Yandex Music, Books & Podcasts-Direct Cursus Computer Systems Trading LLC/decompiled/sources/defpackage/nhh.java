package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nhh extends uhh {
    public final /* synthetic */ oxa e;
    public final /* synthetic */ Bundle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhh(rhh rhhVar, String str, oxa oxaVar, Bundle bundle) {
        super(str);
        this.e = oxaVar;
        this.f = bundle;
    }

    @Override // defpackage.uhh
    public final void a() {
        ((MediaBrowserService.Result) this.e.b).detach();
    }

    @Override // defpackage.uhh
    public final void c(Object obj) {
        List<MediaBrowserCompat$MediaItem> list = (List) obj;
        oxa oxaVar = this.e;
        if (list == null) {
            oxaVar.H(null);
            return;
        }
        if ((this.d & 1) != 0) {
            list = bih.a(list, this.f);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
            Parcel obtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        oxaVar.H(arrayList);
    }
}
