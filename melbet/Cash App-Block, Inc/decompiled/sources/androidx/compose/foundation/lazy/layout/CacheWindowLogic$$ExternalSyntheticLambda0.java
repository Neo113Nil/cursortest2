package androidx.compose.foundation.lazy.layout;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.pager.PagerCacheWindowLogic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CacheWindowLogic$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PagerCacheWindowLogic f$0;
    public final /* synthetic */ Recorder.AnonymousClass3 f$1;

    public /* synthetic */ CacheWindowLogic$$ExternalSyntheticLambda0(PagerCacheWindowLogic pagerCacheWindowLogic, Recorder.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.f$0 = pagerCacheWindowLogic;
        this.f$1 = anonymousClass3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Recorder.AnonymousClass3 anonymousClass3 = this.f$1;
        PagerCacheWindowLogic pagerCacheWindowLogic = this.f$0;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                pagerCacheWindowLogic.onItemPrefetched(anonymousClass3, intValue, intValue2);
                break;
            default:
                pagerCacheWindowLogic.onItemPrefetched(anonymousClass3, intValue, intValue2);
                break;
        }
        return Unit.INSTANCE;
    }
}
