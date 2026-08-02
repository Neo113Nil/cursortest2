package ru.yandex.taxi.masstransit.mapper;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.mapper.MtOverlayUiStateMapper", f = "MtOverlayUiStateMapper.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_CONTAINER_EXTENSION_DEL, PollMessageDraft.MAX_ANSWER_LENGTH, PollMessageDraft.MAX_ANSWER_LENGTH, HProv.PP_CONTAINER_STATUS, HProv.PP_CONTAINER_STATUS, 150, 157, 157}, m = "overlaySections", v = 2)
/* loaded from: classes6.dex */
final class MtOverlayUiStateMapper$overlaySections$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOverlayUiStateMapper$overlaySections$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, 0.0f, null, null, this);
    }
}
