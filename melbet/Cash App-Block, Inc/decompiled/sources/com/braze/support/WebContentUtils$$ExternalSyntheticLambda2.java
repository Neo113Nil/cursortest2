package com.braze.support;

import com.braze.ui.UserJavascriptInterfaceBase;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class WebContentUtils$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ WebContentUtils$$ExternalSyntheticLambda2(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String localHtmlUrlFromRemoteUrl$lambda$3;
        String replacePrefetchedUrlsWithLocalAssets$lambda$1;
        String customAttribute$lambda$0;
        String customAttribute$lambda$1;
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                localHtmlUrlFromRemoteUrl$lambda$3 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(str2, str);
                return localHtmlUrlFromRemoteUrl$lambda$3;
            case 1:
                replacePrefetchedUrlsWithLocalAssets$lambda$1 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$1(str2, str);
                return replacePrefetchedUrlsWithLocalAssets$lambda$1;
            case 2:
                customAttribute$lambda$0 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$0(str2, str);
                return customAttribute$lambda$0;
            default:
                customAttribute$lambda$1 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$1(str2, str);
                return customAttribute$lambda$1;
        }
    }
}
