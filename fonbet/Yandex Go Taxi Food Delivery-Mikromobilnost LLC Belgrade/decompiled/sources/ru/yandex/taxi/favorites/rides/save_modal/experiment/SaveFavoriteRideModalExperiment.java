package ru.yandex.taxi.favorites.rides.save_modal.experiment;

import defpackage.b7l0;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vn11;
import defpackage.vzl0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/favorites/rides/save_modal/experiment/SaveFavoriteRideModalExperiment;", "Lvn11;", "Lc6z;", "Companion", "Modal", "a", "vzl0", "uzl0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SaveFavoriteRideModalExperiment implements vn11, c6z {
    public static final vzl0 Companion = new vzl0();
    public static final i3y[] e;
    public static final SaveFavoriteRideModalExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(24)), kotlin.a.b(lazyThreadSafetyMode, new b7l0(25))};
        f = new SaveFavoriteRideModalExperiment(0);
    }

    public /* synthetic */ SaveFavoriteRideModalExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final Modal a(Modal.ModalType modalType) {
        Object obj;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Modal) obj).getA() == modalType) {
                break;
            }
        }
        return (Modal) obj;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/favorites/rides/save_modal/experiment/SaveFavoriteRideModalExperiment$a;", "", "Companion", "ru/yandex/taxi/favorites/rides/save_modal/experiment/e", "ru/yandex/taxi/favorites/rides/save_modal/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static final e Companion = new e();
        public static final a c = new a(0);
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
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
        }

        public a(int i) {
            this.a = "";
            this.b = "";
        }

        public a() {
            this(0);
        }
    }

    public SaveFavoriteRideModalExperiment() {
        this(0);
    }

    public SaveFavoriteRideModalExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/favorites/rides/save_modal/experiment/SaveFavoriteRideModalExperiment$Modal;", "", "Companion", "ModalType", "ru/yandex/taxi/favorites/rides/save_modal/experiment/b", "ru/yandex/taxi/favorites/rides/save_modal/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class Modal {
        public static final b Companion = new b();
        public static final i3y[] m = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(26)), null, null, null, null, null, null, null, null, null, null, null};
        public final ModalType a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final a l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/favorites/rides/save_modal/experiment/SaveFavoriteRideModalExperiment$Modal$ModalType;", "", "Companion", "ru/yandex/taxi/favorites/rides/save_modal/experiment/c", "SAVE", "EDIT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ModalType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ModalType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final ModalType EDIT;
            public static final ModalType SAVE;

            static {
                ModalType modalType = new ModalType("SAVE", 0);
                SAVE = modalType;
                ModalType modalType2 = new ModalType("EDIT", 1);
                EDIT = modalType2;
                ModalType[] modalTypeArr = {modalType, modalType2};
                $VALUES = modalTypeArr;
                $ENTRIES = kotlin.enums.a.a(modalTypeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(27));
            }

            public static ModalType valueOf(String str) {
                return (ModalType) Enum.valueOf(ModalType.class, str);
            }

            public static ModalType[] values() {
                return (ModalType[]) $VALUES.clone();
            }
        }

        static {
            new Modal(0);
        }

        public Modal(int i, ModalType modalType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, a aVar) {
            this.a = (i & 1) == 0 ? ModalType.SAVE : modalType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str6;
            }
            if ((i & 128) == 0) {
                this.h = "";
            } else {
                this.h = str7;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str8;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str9;
            }
            if ((i & 1024) == 0) {
                this.k = "";
            } else {
                this.k = str10;
            }
            if ((i & 2048) != 0) {
                this.l = aVar;
            } else {
                a.Companion.getClass();
                this.l = a.c;
            }
        }

        /* renamed from: a, reason: from getter */
        public final ModalType getA() {
            return this.a;
        }

        public Modal() {
            this(0);
        }

        public Modal(int i) {
            ModalType modalType = ModalType.SAVE;
            a.Companion.getClass();
            this.a = modalType;
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
            this.i = "";
            this.j = "";
            this.k = "";
            this.l = a.c;
        }
    }
}
