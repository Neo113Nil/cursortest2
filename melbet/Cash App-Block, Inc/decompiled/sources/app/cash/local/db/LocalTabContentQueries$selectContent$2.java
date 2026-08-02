package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalTabContentQueries$selectContent$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LocalTabContentQueries$selectContent$2() {
        super(1, Local_tab_content.class, "<init>", "<init>(Lcom/squareup/protos/cash/local/client/v1/GetNeighborhoodsTabContentResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Local_tab_content((GetNeighborhoodsTabContentResponse) obj);
    }
}
