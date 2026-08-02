package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity$EasyLoginActivityNavigator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginActivity$navigator$2 extends uif implements Function0<EasyLoginActivity.EasyLoginActivityNavigator> {
    final /* synthetic */ EasyLoginActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyLoginActivity$navigator$2(EasyLoginActivity easyLoginActivity) {
        super(0);
        this.this$0 = easyLoginActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EasyLoginActivity.EasyLoginActivityNavigator invoke() {
        EasyLoginActivity easyLoginActivity = this.this$0;
        androidx.fragment.app.y supportFragmentManager = easyLoginActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return new EasyLoginActivity.EasyLoginActivityNavigator(easyLoginActivity, supportFragmentManager, R.id.fragment_container, this.this$0.getDispatchersProvider());
    }
}
