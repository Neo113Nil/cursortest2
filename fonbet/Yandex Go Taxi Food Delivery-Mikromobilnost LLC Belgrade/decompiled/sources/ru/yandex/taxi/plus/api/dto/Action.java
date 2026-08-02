package ru.yandex.taxi.plus.api.dto;

import defpackage.g8e;
import defpackage.gp;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lq;
import defpackage.oyr;
import defpackage.pd;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/Action;", "", "Companion", "Type", "gp", "ru/yandex/taxi/plus/api/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Action {
    public static final gp Companion = new gp();
    public static final i3y[] l;
    public static final Action m;
    public final Type a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/plus/api/dto/Action$Type;", "", "Companion", "ru/yandex/taxi/plus/api/dto/b", "DEEPLINK", "URL", "SETTING", "PLUS_SDK_HOOK", "OPEN_TYPED_SCREEN", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Type DEEPLINK;
        public static final Type NONE;
        public static final Type OPEN_TYPED_SCREEN;
        public static final Type PLUS_SDK_HOOK;
        public static final Type SETTING;
        public static final Type URL;

        static {
            Type type = new Type("DEEPLINK", 0);
            DEEPLINK = type;
            Type type2 = new Type("URL", 1);
            URL = type2;
            Type type3 = new Type("SETTING", 2);
            SETTING = type3;
            Type type4 = new Type("PLUS_SDK_HOOK", 3);
            PLUS_SDK_HOOK = type4;
            Type type5 = new Type("OPEN_TYPED_SCREEN", 4);
            OPEN_TYPED_SCREEN = type5;
            Type type6 = new Type(JCP.RAW_PREFIX, 5);
            NONE = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(7));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new pd(13)), null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new pd(14)), null};
        m = new Action(Type.NONE, 2046);
    }

    public /* synthetic */ Action(int i, Type type, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, List list, String str8) {
        this.a = (i & 1) == 0 ? Type.NONE : type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = EmptyList.a;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return this.a == action.a && jl40.l(this.b, action.b) && jl40.l(this.c, action.c) && jl40.l(this.d, action.d) && jl40.l(this.e, action.e) && this.f == action.f && jl40.l(this.g, action.g) && jl40.l(this.h, action.h) && jl40.l(this.i, action.i) && jl40.l(this.j, action.j) && jl40.l(this.k, action.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int e = unr0.e((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        int hashCode5 = (e + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int c = unr0.c((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.j);
        String str8 = this.k;
        return c + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action(type=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", deeplink=");
        g8e.D(sb, this.c, ", settingId=", this.d, ", hookId=");
        tse0.y(this.e, ", needAuthorization=", ", typedScreenId=", sb, this.f);
        g8e.D(sb, this.g, ", vertical=", this.h, ", tariff=");
        tse0.x(this.i, ", templateKeys=", ", plusContext=", sb, this.j);
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }

    public Action() {
        this(null, 2047);
    }

    public Action(Type type, int i) {
        this.a = (i & 1) != 0 ? Type.NONE : type;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = EmptyList.a;
        this.k = null;
    }
}
