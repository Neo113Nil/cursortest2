package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import com.google.android.filament.Viewport;

/* loaded from: classes3.dex */
public final class ViewInfoStore$InfoRecord {
    public static final Pools$SimplePool sPool = new Pools$SimplePool(20);
    public int flags;
    public Viewport postInfo;
    public Viewport preInfo;

    public static ViewInfoStore$InfoRecord obtain() {
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) sPool.acquire();
        return viewInfoStore$InfoRecord == null ? new ViewInfoStore$InfoRecord() : viewInfoStore$InfoRecord;
    }
}
