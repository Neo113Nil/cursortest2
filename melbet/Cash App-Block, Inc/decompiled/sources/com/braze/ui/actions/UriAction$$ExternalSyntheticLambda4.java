package com.braze.ui.actions;

import android.net.Uri;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeImageUtils;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class UriAction$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;

    public /* synthetic */ UriAction$$ExternalSyntheticLambda4(Uri uri, int i) {
        this.$r8$classId = i;
        this.f$0 = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String openUriWithActionViewFromPush$lambda$0;
        String shouldSkipCaching$lambda$0;
        String localBitmap$lambda$0;
        String bitmap$lambda$0;
        String localBitmap$lambda$1;
        String handleUrlOverride$lambda$1;
        String handleQueryAction$lambda$0;
        String brazeActionVersionAndJson$lambda$0;
        String execute$lambda$3;
        String execute$lambda$4;
        int i = this.$r8$classId;
        Uri uri = this.f$0;
        switch (i) {
            case 0:
                openUriWithActionViewFromPush$lambda$0 = UriAction.openUriWithActionViewFromPush$lambda$0(uri);
                return openUriWithActionViewFromPush$lambda$0;
            case 1:
                shouldSkipCaching$lambda$0 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$0(uri);
                return shouldSkipCaching$lambda$0;
            case 2:
                localBitmap$lambda$0 = BrazeImageUtils.getLocalBitmap$lambda$0(uri);
                return localBitmap$lambda$0;
            case 3:
                bitmap$lambda$0 = BrazeImageUtils.getBitmap$lambda$0(uri);
                return bitmap$lambda$0;
            case 4:
                localBitmap$lambda$1 = BrazeImageUtils.getLocalBitmap$lambda$1(uri);
                return localBitmap$lambda$1;
            case 5:
                handleUrlOverride$lambda$1 = BrazeWebViewClient.handleUrlOverride$lambda$1(uri);
                return handleUrlOverride$lambda$1;
            case 6:
                handleQueryAction$lambda$0 = BrazeWebViewClient.handleQueryAction$lambda$0(uri);
                return handleQueryAction$lambda$0;
            case 7:
                brazeActionVersionAndJson$lambda$0 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$0(uri);
                return brazeActionVersionAndJson$lambda$0;
            case 8:
                execute$lambda$3 = BrazeActionParser.execute$lambda$3(uri);
                return execute$lambda$3;
            default:
                execute$lambda$4 = BrazeActionParser.execute$lambda$4(uri);
                return execute$lambda$4;
        }
    }
}
