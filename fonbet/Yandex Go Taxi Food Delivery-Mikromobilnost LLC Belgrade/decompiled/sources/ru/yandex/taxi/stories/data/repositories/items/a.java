package ru.yandex.taxi.stories.data.repositories.items;

import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ b a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int w;
    public final /* synthetic */ RetryPolicy x;

    public /* synthetic */ a(b bVar, tse tseVar, String str, int i, RetryPolicy retryPolicy) {
        this.a = bVar;
        this.b = tseVar;
        this.c = str;
        this.w = i;
        this.x = retryPolicy;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b bVar = this.a;
        bVar.getClass();
        return tje.h(this.b, null, null, new StoriesItemsRepositoryImpl$getStoryDownload$1(bVar, this.c, this.w, this.x, null), 3);
    }
}
