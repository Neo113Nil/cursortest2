package ru.yandex.taxi.themes.experiments;

import defpackage.cue;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pfg;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/themes/experiments/DarkThemeSwitchExperiment;", "Lw96;", "Companion", "a", "ThemeDefaultSetting", "pfg", "ru/yandex/taxi/themes/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DarkThemeSwitchExperiment extends w96 {
    public static final pfg Companion = new pfg();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(15)), null};
    public final boolean b;
    public final a c;
    public final boolean d;
    public final ThemeDefaultSetting e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/themes/experiments/DarkThemeSwitchExperiment$ThemeDefaultSetting;", "", "Companion", "ru/yandex/taxi/themes/experiments/d", "DARK_THEME_ON", "DARK_THEME_OFF", "SYSTEM_THEME", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ThemeDefaultSetting {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ThemeDefaultSetting[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final ThemeDefaultSetting DARK_THEME_OFF;
        public static final ThemeDefaultSetting DARK_THEME_ON;
        public static final ThemeDefaultSetting SYSTEM_THEME;

        static {
            ThemeDefaultSetting themeDefaultSetting = new ThemeDefaultSetting("DARK_THEME_ON", 0);
            DARK_THEME_ON = themeDefaultSetting;
            ThemeDefaultSetting themeDefaultSetting2 = new ThemeDefaultSetting("DARK_THEME_OFF", 1);
            DARK_THEME_OFF = themeDefaultSetting2;
            ThemeDefaultSetting themeDefaultSetting3 = new ThemeDefaultSetting("SYSTEM_THEME", 2);
            SYSTEM_THEME = themeDefaultSetting3;
            ThemeDefaultSetting[] themeDefaultSettingArr = {themeDefaultSetting, themeDefaultSetting2, themeDefaultSetting3};
            $VALUES = themeDefaultSettingArr;
            $ENTRIES = kotlin.enums.a.a(themeDefaultSettingArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(16));
        }

        public static ThemeDefaultSetting valueOf(String str) {
            return (ThemeDefaultSetting) Enum.valueOf(ThemeDefaultSetting.class, str);
        }

        public static ThemeDefaultSetting[] values() {
            return (ThemeDefaultSetting[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DarkThemeSwitchExperiment(int i, boolean z, a aVar, boolean z2, ThemeDefaultSetting themeDefaultSetting, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = ThemeDefaultSetting.DARK_THEME_OFF;
        } else {
            this.e = themeDefaultSetting;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/themes/experiments/DarkThemeSwitchExperiment$a;", "", "Companion", "ru/yandex/taxi/themes/experiments/b", "ru/yandex/taxi/themes/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public a() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    public DarkThemeSwitchExperiment() {
        this(31);
    }

    public DarkThemeSwitchExperiment(int i) {
        boolean z = (i & 1) == 0;
        ThemeDefaultSetting themeDefaultSetting = ThemeDefaultSetting.DARK_THEME_OFF;
        this.b = z;
        this.c = null;
        this.d = false;
        this.e = themeDefaultSetting;
        this.f = false;
    }
}
