package com.squareup.cash.booklet.ui;

import androidx.compose.ui.platform.UriHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BookletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UriHandler f$0;

    public /* synthetic */ BookletTileKt$$ExternalSyntheticLambda0(UriHandler uriHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = uriHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        UriHandler uriHandler = this.f$0;
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                str2.getClass();
                uriHandler.openUri(str);
                break;
            case 1:
                str.getClass();
                str2.getClass();
                uriHandler.openUri(str);
                break;
            case 2:
                str.getClass();
                str2.getClass();
                uriHandler.openUri(str);
                break;
            default:
                str.getClass();
                str2.getClass();
                uriHandler.openUri(str);
                break;
        }
        return Unit.INSTANCE;
    }
}
