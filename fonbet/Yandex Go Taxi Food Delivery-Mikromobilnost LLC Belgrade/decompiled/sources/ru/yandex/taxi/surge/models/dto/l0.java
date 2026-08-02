package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gqw0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/surge/models/dto/l0;", "", "Companion", "a", "b", "c", "d", "ru/yandex/taxi/surge/models/dto/i0", "gqw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l0 {
    public static final gqw0 Companion = new gqw0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(13)), null};
    public final a a;
    public final List b;
    public final c c;

    public /* synthetic */ l0(int i, a aVar, List list, c cVar) {
        this.a = (i & 1) == 0 ? new a(0) : aVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/l0$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/j0", "ru/yandex/taxi/surge/models/dto/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final k0 Companion = new k0();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a(int i) {
            this.a = "";
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/l0$d;", "", "Companion", "ru/yandex/taxi/surge/models/dto/q0", "ru/yandex/taxi/surge/models/dto/r0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final r0 Companion = new r0();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ d(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public d() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/l0$b;", "", "Companion", "ru/yandex/taxi/surge/models/dto/m0", "ru/yandex/taxi/surge/models/dto/n0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final n0 Companion = new n0();
        public final String a;
        public final float b;
        public final String c;

        public /* synthetic */ b(float f, int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            this.b = (i & 2) == 0 ? 0.0f : f;
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public b() {
            this.a = "";
            this.b = 0.0f;
            this.c = "";
        }
    }

    public l0() {
        this(0);
    }

    public l0(int i) {
        this.a = new a(0);
        this.b = EmptyList.a;
        this.c = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/l0$c;", "", "Companion", "ru/yandex/taxi/surge/models/dto/o0", "ru/yandex/taxi/surge/models/dto/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final p0 Companion = new p0();
        public final float a;
        public final String b;
        public final int c;
        public final d d;

        public /* synthetic */ c(int i, float f, String str, int i2, d dVar) {
            this.a = (i & 1) == 0 ? 0.0f : f;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = dVar;
            }
        }

        public c() {
            this.a = 0.0f;
            this.b = "";
            this.c = 0;
            this.d = null;
        }
    }
}
