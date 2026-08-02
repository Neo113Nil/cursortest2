package ru.yandex.taxi.scooters.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i0o0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.scc;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment;", "Lw96;", "Lc6z;", "Companion", "Camera", "i0o0", "ru/yandex/taxi/scooters/experiments/h0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScootersMultiOrderExperiment extends w96 implements c6z {
    public static final i0o0 Companion = new i0o0();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(10)), null, null};
    public static final ScootersMultiOrderExperiment g = new ScootersMultiOrderExperiment(0);
    public final boolean b;
    public final Map c;
    public final int d;
    public final Camera e;

    public /* synthetic */ ScootersMultiOrderExperiment(int i, boolean z, Map map, int i2, Camera camera) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 1;
        } else {
            this.d = i2;
        }
        if ((i & 8) == 0) {
            this.e = new Camera(0);
        } else {
            this.e = camera;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment$Camera;", "", "Companion", "ScooterPreview", "ru/yandex/taxi/scooters/experiments/i0", "ru/yandex/taxi/scooters/experiments/j0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Camera {
        public static final j0 Companion = new j0();
        public final FormattedText a;
        public final FormattedText b;
        public final ScooterPreview c;

        public /* synthetic */ Camera(int i, FormattedText formattedText, FormattedText formattedText2, ScooterPreview scooterPreview) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = scooterPreview;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment$Camera$ScooterPreview;", "", "Companion", "a", "ButtonType", "b", "ru/yandex/taxi/scooters/experiments/k0", "ru/yandex/taxi/scooters/experiments/o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ScooterPreview {
            public static final o0 Companion = new o0();
            public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(11)), null, null};
            public final boolean a;
            public final List b;
            public final a c;
            public final b d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment$Camera$ScooterPreview$ButtonType;", "", "Companion", "ru/yandex/taxi/scooters/experiments/n0", "ADD", "REPLACE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class ButtonType {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ ButtonType[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final ButtonType ADD;
                public static final n0 Companion;
                public static final ButtonType REPLACE;

                static {
                    ButtonType buttonType = new ButtonType("ADD", 0);
                    ADD = buttonType;
                    ButtonType buttonType2 = new ButtonType("REPLACE", 1);
                    REPLACE = buttonType2;
                    ButtonType[] buttonTypeArr = {buttonType, buttonType2};
                    $VALUES = buttonTypeArr;
                    $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
                    Companion = new n0();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(13));
                }

                public static ButtonType valueOf(String str) {
                    return (ButtonType) Enum.valueOf(ButtonType.class, str);
                }

                public static ButtonType[] values() {
                    return (ButtonType[]) $VALUES.clone();
                }
            }

            public /* synthetic */ ScooterPreview(int i, boolean z, List list, a aVar, b bVar) {
                if ((i & 1) == 0) {
                    this.a = false;
                } else {
                    this.a = z;
                }
                if ((i & 2) == 0) {
                    this.b = scc.g(new a(ButtonType.ADD, 14), new a(ButtonType.REPLACE, 14));
                } else {
                    this.b = list;
                }
                if ((i & 4) == 0) {
                    this.c = new a(null, 15);
                } else {
                    this.c = aVar;
                }
                if ((i & 8) == 0) {
                    this.d = new b(0);
                } else {
                    this.d = bVar;
                }
            }

            @gsq0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment$Camera$ScooterPreview$b;", "", "Companion", "ru/yandex/taxi/scooters/experiments/p0", "ru/yandex/taxi/scooters/experiments/q0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final class b {
                public static final q0 Companion = new q0();
                public final String a;
                public final String b;

                public /* synthetic */ b(int i, String str, String str2) {
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
                }

                public b(int i) {
                    this.a = null;
                    this.b = null;
                }

                public b() {
                    this(0);
                }
            }

            @gsq0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment$Camera$ScooterPreview$a;", "", "Companion", "ru/yandex/taxi/scooters/experiments/l0", "ru/yandex/taxi/scooters/experiments/m0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final class a {
                public static final m0 Companion = new m0();
                public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(12)), null, null, null};
                public final ButtonType a;
                public final String b;
                public final FormattedText c;
                public final boolean d;

                public /* synthetic */ a(int i, ButtonType buttonType, String str, FormattedText formattedText, boolean z) {
                    this.a = (i & 1) == 0 ? ButtonType.ADD : buttonType;
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
                        this.d = true;
                    } else {
                        this.d = z;
                    }
                }

                public a() {
                    this(null, 15);
                }

                public a(ButtonType buttonType, int i) {
                    buttonType = (i & 1) != 0 ? ButtonType.ADD : buttonType;
                    FormattedText formattedText = FormattedText.c;
                    this.a = buttonType;
                    this.b = "";
                    this.c = formattedText;
                    this.d = true;
                }
            }

            public ScooterPreview() {
                List g = scc.g(new a(ButtonType.ADD, 14), new a(ButtonType.REPLACE, 14));
                a aVar = new a(null, 15);
                b bVar = new b(0);
                this.a = false;
                this.b = g;
                this.c = aVar;
                this.d = bVar;
            }
        }

        public Camera() {
            this(0);
        }

        public Camera(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = null;
        }
    }

    public ScootersMultiOrderExperiment() {
        this(0);
    }

    public ScootersMultiOrderExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Camera camera = new Camera(0);
        this.b = false;
        this.c = f2;
        this.d = 1;
        this.e = camera;
    }
}
