package ru.yandex.taxi.scooters.experiments;

import defpackage.c5w;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.h5w;
import defpackage.i3y;
import defpackage.jrl0;
import defpackage.k4o;
import defpackage.l7n0;
import defpackage.s3n0;
import defpackage.w96;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment;", "Lw96;", "Lc6z;", "Companion", "FullInsuranceSuggestion", "a", "l7n0", "ru/yandex/taxi/scooters/experiments/w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScootersClientInsuranceNewExperiment extends w96 implements c6z {
    public static final l7n0 Companion = new l7n0();
    public static final i3y[] j = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(12)), null, null, null, null, null, null};
    public static final ScootersClientInsuranceNewExperiment k = new ScootersClientInsuranceNewExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final FullInsuranceSuggestion f;
    public final c5w g;
    public final h5w h;
    public final a i;

    public /* synthetic */ ScootersClientInsuranceNewExperiment(int i, boolean z, Map map, String str, String str2, FullInsuranceSuggestion fullInsuranceSuggestion, c5w c5wVar, h5w h5wVar, a aVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = fullInsuranceSuggestion;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = c5wVar;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = h5wVar;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = aVar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion;", "", "Companion", "UpsaleWindow", "ru/yandex/taxi/scooters/experiments/z", "ru/yandex/taxi/scooters/experiments/a0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FullInsuranceSuggestion {
        public static final a0 Companion = new a0();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(13)), null};
        public final String a;
        public final List b;
        public final UpsaleWindow c;

        public FullInsuranceSuggestion(int i, String str, List list, UpsaleWindow upsaleWindow) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = Collections.singletonList(0L);
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = upsaleWindow;
            }
        }

        public FullInsuranceSuggestion() {
            List singletonList = Collections.singletonList(0L);
            this.a = "";
            this.b = singletonList;
            this.c = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion$UpsaleWindow;", "", "Companion", "Item", "ru/yandex/taxi/scooters/experiments/b0", "ru/yandex/taxi/scooters/experiments/c0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class UpsaleWindow {
            public static final c0 Companion = new c0();
            public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(7)), null, null, null};
            public final String a;
            public final FormattedText b;
            public final FormattedText c;
            public final List d;
            public final FormattedText e;
            public final FormattedText f;
            public final FormattedText g;

            public /* synthetic */ UpsaleWindow(int i, String str, FormattedText formattedText, FormattedText formattedText2, List list, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText2;
                }
                if ((i & 8) == 0) {
                    this.d = EmptyList.a;
                } else {
                    this.d = list;
                }
                if ((i & 16) == 0) {
                    this.e = FormattedText.c;
                } else {
                    this.e = formattedText3;
                }
                if ((i & 32) == 0) {
                    this.f = FormattedText.c;
                } else {
                    this.f = formattedText4;
                }
                if ((i & 64) == 0) {
                    this.g = FormattedText.c;
                } else {
                    this.g = formattedText5;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion$UpsaleWindow$Item;", "", "Companion", "Action", "ru/yandex/taxi/scooters/experiments/d0", "ru/yandex/taxi/scooters/experiments/f0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes6.dex */
            public static final class Item {
                public static final f0 Companion = new f0();
                public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(8))};
                public final FormattedText a;
                public final FormattedText b;
                public final String c;
                public final Action d;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$FullInsuranceSuggestion$UpsaleWindow$Item$Action;", "", "Companion", "ru/yandex/taxi/scooters/experiments/e0", "UNKNOWN", "DETAILS", "PROVIDER_INFO", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
                @gsq0
                /* loaded from: classes13.dex */
                public static final class Action {
                    private static final /* synthetic */ k4o $ENTRIES;
                    private static final /* synthetic */ Action[] $VALUES;
                    private static final i3y $cachedSerializer$delegate;
                    public static final e0 Companion;
                    public static final Action DETAILS;
                    public static final Action PROVIDER_INFO;
                    public static final Action UNKNOWN;

                    static {
                        Action action = new Action("UNKNOWN", 0);
                        UNKNOWN = action;
                        Action action2 = new Action("DETAILS", 1);
                        DETAILS = action2;
                        Action action3 = new Action("PROVIDER_INFO", 2);
                        PROVIDER_INFO = action3;
                        Action[] actionArr = {action, action2, action3};
                        $VALUES = actionArr;
                        $ENTRIES = kotlin.enums.a.a(actionArr);
                        Companion = new e0();
                        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(9));
                    }

                    public static Action valueOf(String str) {
                        return (Action) Enum.valueOf(Action.class, str);
                    }

                    public static Action[] values() {
                        return (Action[]) $VALUES.clone();
                    }
                }

                public /* synthetic */ Item(int i, FormattedText formattedText, FormattedText formattedText2, String str, Action action) {
                    this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                    if ((i & 2) == 0) {
                        this.b = FormattedText.c;
                    } else {
                        this.b = formattedText2;
                    }
                    if ((i & 4) == 0) {
                        this.c = "";
                    } else {
                        this.c = str;
                    }
                    if ((i & 8) == 0) {
                        this.d = Action.UNKNOWN;
                    } else {
                        this.d = action;
                    }
                }

                public Item() {
                    FormattedText formattedText = FormattedText.c;
                    Action action = Action.UNKNOWN;
                    this.a = formattedText;
                    this.b = formattedText;
                    this.c = "";
                    this.d = action;
                }
            }

            public UpsaleWindow() {
                FormattedText formattedText = FormattedText.c;
                this.a = "";
                this.b = formattedText;
                this.c = formattedText;
                this.d = EmptyList.a;
                this.e = formattedText;
                this.f = formattedText;
                this.g = formattedText;
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersClientInsuranceNewExperiment$a;", "", "Companion", "ru/yandex/taxi/scooters/experiments/x", "ru/yandex/taxi/scooters/experiments/y", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final y Companion = new y();
        public final boolean a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final FormattedText e;

        public /* synthetic */ a(int i, boolean z, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText3;
            }
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            this.a = false;
            this.b = "";
            this.c = formattedText;
            this.d = formattedText;
            this.e = formattedText;
        }
    }

    public ScootersClientInsuranceNewExperiment() {
        this(0);
    }

    public ScootersClientInsuranceNewExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
