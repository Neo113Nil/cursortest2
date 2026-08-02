package ru.yandex.taxi.layers.experiments;

import com.yandex.go.dto.response.Action$Payload;
import com.yandex.go.layers.api.model.params.Mode;
import defpackage.czo0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.vn11;
import defpackage.zdp0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment;", "Lvn11;", "Companion", "b", "d", "ZoomMode", "c", "a", "zdp0", "ydp0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScreenModeMapProvidersExperiment implements vn11 {
    public static final zdp0 Companion = new zdp0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(17))};
    public static final ScreenModeMapProvidersExperiment d = new ScreenModeMapProvidersExperiment(0);
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment$ZoomMode;", "", "Companion", "ru/yandex/taxi/layers/experiments/m", "ZOOM_IF_NO_OBJECTS", "ALWAYS_ZOOM", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ZoomMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ZoomMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ZoomMode ALWAYS_ZOOM;
        public static final m Companion;
        public static final ZoomMode ZOOM_IF_NO_OBJECTS;

        static {
            ZoomMode zoomMode = new ZoomMode("ZOOM_IF_NO_OBJECTS", 0);
            ZOOM_IF_NO_OBJECTS = zoomMode;
            ZoomMode zoomMode2 = new ZoomMode("ALWAYS_ZOOM", 1);
            ALWAYS_ZOOM = zoomMode2;
            ZoomMode[] zoomModeArr = {zoomMode, zoomMode2};
            $VALUES = zoomModeArr;
            $ENTRIES = kotlin.enums.a.a(zoomModeArr);
            Companion = new m();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(23));
        }

        public static ZoomMode valueOf(String str) {
            return (ZoomMode) Enum.valueOf(ZoomMode.class, str);
        }

        public static ZoomMode[] values() {
            return (ZoomMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ScreenModeMapProvidersExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ScreenModeMapProvidersExperiment(int i) {
        this.b = EmptyList.a;
    }

    public ScreenModeMapProvidersExperiment() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment$a;", "", "Companion", "ru/yandex/taxi/layers/experiments/g", "ru/yandex/taxi/layers/experiments/h", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final h Companion = new h();
        public static final i3y[] c;
        public final Action$Payload.Mode a;
        public final jsq0 b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new czo0(18)), kotlin.a.b(lazyThreadSafetyMode, new czo0(19))};
        }

        public /* synthetic */ a(int i, Action$Payload.Mode mode, jsq0 jsq0Var) {
            this.a = (i & 1) == 0 ? Action$Payload.Mode.ALL_OBJECT_TYPES : mode;
            if ((i & 2) == 0) {
                this.b = ksq0.a;
            } else {
                this.b = jsq0Var;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            Action$Payload.Mode mode = Action$Payload.Mode.ALL_OBJECT_TYPES;
            jsq0 jsq0Var = ksq0.a;
            this.a = mode;
            this.b = jsq0Var;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment$c;", "", "Companion", "ru/yandex/taxi/layers/experiments/k", "ru/yandex/taxi/layers/experiments/l", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final l Companion = new l();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(22)), null};
        public final Mode a;
        public final String b;

        public /* synthetic */ c(int i, Mode mode, String str) {
            this.a = (i & 1) == 0 ? Mode.UNKNOWN : mode;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public c() {
            this.a = Mode.UNKNOWN;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment$b;", "", "Companion", "ru/yandex/taxi/layers/experiments/i", "ru/yandex/taxi/layers/experiments/j", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final j Companion = new j();
        public static final i3y[] e;
        public final String a;
        public final List b;
        public final List c;
        public final boolean d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new czo0(20)), kotlin.a.b(lazyThreadSafetyMode, new czo0(21)), null};
        }

        public /* synthetic */ b(int i, String str, List list, List list2, boolean z) {
            this.a = (i & 1) == 0 ? "" : str;
            int i2 = i & 2;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.b = emptyList;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = emptyList;
            } else {
                this.c = list2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
        }

        public b() {
            this.a = "";
            EmptyList emptyList = EmptyList.a;
            this.b = emptyList;
            this.c = emptyList;
            this.d = false;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment$d;", "", "Companion", "ru/yandex/taxi/layers/experiments/n", "ru/yandex/taxi/layers/experiments/o", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final o Companion = new o();
        public static final i3y[] e;
        public final Mode a;
        public final ZoomMode b;
        public final a c;
        public final Long d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new czo0(24)), kotlin.a.b(lazyThreadSafetyMode, new czo0(25)), null, null};
        }

        public /* synthetic */ d(int i, Mode mode, ZoomMode zoomMode, a aVar, Long l) {
            this.a = (i & 1) == 0 ? Mode.UNKNOWN : mode;
            if ((i & 2) == 0) {
                this.b = ZoomMode.ZOOM_IF_NO_OBJECTS;
            } else {
                this.b = zoomMode;
            }
            if ((i & 4) == 0) {
                this.c = new a(0);
            } else {
                this.c = aVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = l;
            }
        }

        public d() {
            Mode mode = Mode.UNKNOWN;
            ZoomMode zoomMode = ZoomMode.ZOOM_IF_NO_OBJECTS;
            a aVar = new a(0);
            this.a = mode;
            this.b = zoomMode;
            this.c = aVar;
            this.d = null;
        }
    }
}
