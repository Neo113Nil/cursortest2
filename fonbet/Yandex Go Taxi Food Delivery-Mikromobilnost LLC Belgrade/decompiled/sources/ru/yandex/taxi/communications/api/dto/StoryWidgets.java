package ru.yandex.taxi.communications.api.dto;

import defpackage.bmu0;
import defpackage.gsq0;
import defpackage.hqu0;
import defpackage.i3y;
import defpackage.iqx;
import defpackage.k4o;
import defpackage.kqu0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/communications/api/dto/StoryWidgets;", "", "Companion", "gqu0", "c", "b", "kqu0", "ru/yandex/taxi/communications/api/dto/q0", "ActionType", "a", "hqu0", "ru/yandex/taxi/communications/api/dto/o0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StoryWidgets {
    public static final hqu0 Companion = new hqu0();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(10)), null, null, null, null};
    public static final StoryWidgets g = new StoryWidgets(0);
    public List a;
    public final b b;
    public final iqx c;
    public final c d;
    public final kqu0 e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/communications/api/dto/StoryWidgets$ActionType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/t0", "DEEPLINK", "WEB_VIEW", "SHARE", "SCREEN_SHARE", "MOVE", "CLIPBOARD_COPY", "SAVE_BENEFIT", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ActionType CLIPBOARD_COPY;
        public static final t0 Companion;
        public static final ActionType DEEPLINK;
        public static final ActionType MOVE;
        public static final ActionType SAVE_BENEFIT;
        public static final ActionType SCREEN_SHARE;
        public static final ActionType SHARE;
        public static final ActionType WEB_VIEW;

        static {
            ActionType actionType = new ActionType("DEEPLINK", 0);
            DEEPLINK = actionType;
            ActionType actionType2 = new ActionType("WEB_VIEW", 1);
            WEB_VIEW = actionType2;
            ActionType actionType3 = new ActionType("SHARE", 2);
            SHARE = actionType3;
            ActionType actionType4 = new ActionType("SCREEN_SHARE", 3);
            SCREEN_SHARE = actionType4;
            ActionType actionType5 = new ActionType("MOVE", 4);
            MOVE = actionType5;
            ActionType actionType6 = new ActionType("CLIPBOARD_COPY", 5);
            CLIPBOARD_COPY = actionType6;
            ActionType actionType7 = new ActionType("SAVE_BENEFIT", 6);
            SAVE_BENEFIT = actionType7;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
            Companion = new t0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(14));
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ StoryWidgets(int i, List list, b bVar, iqx iqxVar, c cVar, kqu0 kqu0Var) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iqxVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kqu0Var;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/StoryWidgets$b;", "", "Companion", "ru/yandex/taxi/communications/api/dto/u0", "ru/yandex/taxi/communications/api/dto/v0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final v0 Companion = new v0();
        public final String a;

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public b() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/StoryWidgets$c;", "", "Companion", "ru/yandex/taxi/communications/api/dto/w0", "ru/yandex/taxi/communications/api/dto/x0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final x0 Companion = new x0();
        public final String a;
        public final String b;
        public final q0 c;

        public /* synthetic */ c(int i, String str, String str2, q0 q0Var) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = q0Var;
            }
        }

        public c() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public StoryWidgets(int i) {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public StoryWidgets() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/StoryWidgets$a;", "", "Companion", "ru/yandex/taxi/communications/api/dto/r0", "ru/yandex/taxi/communications/api/dto/s0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final s0 Companion = new s0();
        public final String a;
        public final boolean b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public /* synthetic */ a(int i, String str, boolean z, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str5;
            }
            if ((i & 128) == 0) {
                this.h = "";
            } else {
                this.h = str6;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str7;
            }
        }

        public a() {
            this(null, null, null, null, 511, null);
        }

        public a(String str, String str2, String str3, String str4, int i, String str5) {
            str = (i & 1) != 0 ? "" : str;
            str2 = (i & 8) != 0 ? null : str2;
            str3 = (i & 16) != 0 ? null : str3;
            str4 = (i & 128) != 0 ? "" : str4;
            str5 = (i & 256) != 0 ? "" : str5;
            this.a = str;
            this.b = false;
            this.c = 0;
            this.d = str2;
            this.e = str3;
            this.f = null;
            this.g = null;
            this.h = str4;
            this.i = str5;
        }
    }
}
