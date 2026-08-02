package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class vk41 extends iz4 {
    public final List f;
    public int g;
    public pzt0 h;
    public InMessage$StoryIsVisibleEvent$MiniStoryControlType i;

    public vk41(List list, jse jseVar) {
        super(jseVar, new tk41());
        this.f = list;
        this.g = -1;
        this.i = InMessage$StoryIsVisibleEvent$MiniStoryControlType.SWIPE;
        skd0.e(PlusLogTag.UI, "init() urlList=".concat(a.X(list, null, null, null, null, 63)));
    }
}
