package kotlinx.coroutines.channels;

import defpackage.kq6;
import defpackage.pi9;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements wls {
    public static final BufferedChannelKt$createSegmentFunction$1 b = new BufferedChannelKt$createSegmentFunction$1(2, 1, kq6.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        pi9 pi9Var = (pi9) obj2;
        pi9 pi9Var2 = kq6.a;
        return new pi9(longValue, pi9Var, pi9Var.z, 0);
    }
}
