package defpackage;

import defpackage.qlu0;
import defpackage.rlu0;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.stories.data.repositories.a;
import ru.yandex.taxi.widget.d;

/* loaded from: classes10.dex */
public final class rlu0 {
    public final d a;
    public final a b;

    public rlu0(d dVar, ru.yandex.taxi.stories.data.caching.a aVar) {
        this.a = dVar;
        this.b = new a(aVar, new wls() { // from class: ru.yandex.taxi.stories.data.repositories.anims.a
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return tje.h((tse) obj, null, null, new StoriesAnimRepositoryImpl$downloadRepository$1$1(rlu0.this, (qlu0) obj2, null), 3);
            }
        });
    }
}
