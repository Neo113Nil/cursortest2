package com.squareup.cash.money.applets.db;

import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class PromotedAppletTileQueries$selectAll$2 extends FunctionReferenceImpl implements Function5 {
    public static final PromotedAppletTileQueries$selectAll$2 INSTANCE = new PromotedAppletTileQueries$selectAll$2(5, PromotedAppletTiles.class, "<init>", "<init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;)V", 0);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj;
        str.getClass();
        return new PromotedAppletTiles(str, ((Number) obj2).longValue(), (String) obj3, (String) obj4, (Image) obj5);
    }
}
