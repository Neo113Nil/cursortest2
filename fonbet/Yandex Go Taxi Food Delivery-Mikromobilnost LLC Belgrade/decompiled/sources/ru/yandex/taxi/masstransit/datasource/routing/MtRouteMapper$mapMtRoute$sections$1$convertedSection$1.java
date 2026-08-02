package ru.yandex.taxi.masstransit.datasource.routing;

import defpackage.cvw;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MtRouteMapper$mapMtRoute$sections$1$convertedSection$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ Ref$IntRef $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteMapper$mapMtRoute$sections$1$convertedSection$1(Ref$IntRef ref$IntRef) {
        super(0, 0, cvw.class, "nextId", "mapMtRoute$nextId(Lkotlin/jvm/internal/Ref$IntRef;)I");
        this.$id = ref$IntRef;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Ref$IntRef ref$IntRef = this.$id;
        int i = ref$IntRef.element + 1;
        ref$IntRef.element = i;
        return Integer.valueOf(i);
    }
}
