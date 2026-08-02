package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wow0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/surge/models/dto/c0;", "", "Companion", "b", "a", "ru/yandex/taxi/surge/models/dto/z", "wow0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c0 {
    public static final wow0 Companion = new wow0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(7)), null, null};
    public final String a;
    public final List b;
    public final a c;
    public final SurgeInfoItem$ActionButtonsContent d;

    public /* synthetic */ c0(int i, String str, List list, a aVar, SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = new SurgeInfoItem$ActionButtonsContent(0);
        } else {
            this.d = surgeInfoItem$ActionButtonsContent;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/c0$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/a0", "ru/yandex/taxi/surge/models/dto/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final b0 Companion = new b0();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/c0$b;", "", "Companion", "ru/yandex/taxi/surge/models/dto/d0", "ru/yandex/taxi/surge/models/dto/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final e0 Companion = new e0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ b(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public b() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    public c0() {
        this(0);
    }

    public c0(int i) {
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = new SurgeInfoItem$ActionButtonsContent(0);
        this.a = null;
        this.b = EmptyList.a;
        this.c = null;
        this.d = surgeInfoItem$ActionButtonsContent;
    }
}
