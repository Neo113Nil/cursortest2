package ru.yandex.taxi.surge.models.dto;

import defpackage.fru;
import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/surge/models/dto/u;", "", "Companion", "a", "ru/yandex/taxi/surge/models/dto/r", "fru", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class u {
    public static final fru Companion = new fru();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(1))};
    public final a a;
    public final List b;

    public /* synthetic */ u(int i, a aVar, List list) {
        this.a = (i & 1) == 0 ? null : aVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/u$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/s", "ru/yandex/taxi/surge/models/dto/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final t Companion = new t();
        public final FormattedText a;

        public /* synthetic */ a(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public a() {
            this.a = FormattedText.c;
        }
    }

    public u(int i) {
        this.a = null;
        this.b = EmptyList.a;
    }

    public u() {
        this(0);
    }
}
