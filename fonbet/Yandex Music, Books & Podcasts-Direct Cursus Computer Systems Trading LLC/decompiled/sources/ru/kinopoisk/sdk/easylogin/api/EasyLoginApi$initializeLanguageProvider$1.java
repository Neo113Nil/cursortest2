package ru.kinopoisk.sdk.easylogin.api;

import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;
import ru.kinopoisk.sdk.easylogin.internal.Y8;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Y8;", "invoke", "()Lru/kinopoisk/sdk/easylogin/internal/Y8;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EasyLoginApi$initializeLanguageProvider$1 extends uif implements Function0<Y8> {
    final /* synthetic */ EasyLoginApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyLoginApi$initializeLanguageProvider$1(EasyLoginApi easyLoginApi) {
        super(0);
        this.this$0 = easyLoginApi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Y8 invoke() {
        EasyLoginDependencies easyLoginDependencies;
        String id = EasyLoginApi.Language.RU.getId();
        String[] strArr = {EasyLoginApi.Language.EN.getId(), EasyLoginApi.Language.AR.getId()};
        easyLoginDependencies = this.this$0.dependencies;
        return new Y8(id, strArr, easyLoginDependencies.getForcedLanguage().getId());
    }
}
