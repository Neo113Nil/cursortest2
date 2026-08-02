package com.squareup.cash.p2pblocking.views;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda6(int i, Function1 function1, List list) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        List list = this.f$0;
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (i) {
            case 0:
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, P2PListRowKt.lambda$1751516285, 3);
                LazyListScope.items$default(lazyListScope, list.size(), null, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda7(2, function1, list), true, -1768972396), 6);
                break;
            default:
                lazyListScope.getClass();
                lazyListScope.items(list.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 15), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(19, function1, list), true, 802480018));
                break;
        }
        return Unit.INSTANCE;
    }
}
