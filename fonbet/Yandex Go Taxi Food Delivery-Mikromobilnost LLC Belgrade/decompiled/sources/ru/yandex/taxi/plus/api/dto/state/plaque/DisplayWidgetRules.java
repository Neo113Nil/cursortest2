package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.acj;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.s0k;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/DisplayWidgetRules;", "", "Companion", "Type", "s0k", "ru/yandex/taxi/plus/api/dto/state/plaque/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisplayWidgetRules {
    public static final s0k Companion = new s0k();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(13)), null, null, null};
    public final d a;
    public final Type b;
    public final Integer c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/DisplayWidgetRules$Type;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/f", "FIT", "FILL", "FIX", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final Type FILL;
        public static final Type FIT;
        public static final Type FIX;

        static {
            Type type = new Type("FIT", 0);
            FIT = type;
            Type type2 = new Type("FILL", 1);
            FILL = type2;
            Type type3 = new Type("FIX", 2);
            FIX = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(14));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DisplayWidgetRules(int i, d dVar, Type type, Integer num, String str, String str2) {
        this.a = (i & 1) == 0 ? new d(0) : dVar;
        if ((i & 2) == 0) {
            this.b = Type.FIT;
        } else {
            this.b = type;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayWidgetRules)) {
            return false;
        }
        DisplayWidgetRules displayWidgetRules = (DisplayWidgetRules) obj;
        return jl40.l(this.a, displayWidgetRules.a) && this.b == displayWidgetRules.b && jl40.l(this.c, displayWidgetRules.c) && jl40.l(this.d, displayWidgetRules.d) && jl40.l(this.e, displayWidgetRules.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return this.e.hashCode() + unr0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayWidgetRules(displayRules=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", fitWidth=");
        tse0.w(this.c, ", horizontalRule=", this.d, ", verticalRule=", sb);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public DisplayWidgetRules() {
        this(0);
    }

    public DisplayWidgetRules(int i) {
        d dVar = new d(0);
        Type type = Type.FIT;
        this.a = dVar;
        this.b = type;
        this.c = null;
        this.d = "";
        this.e = "";
    }
}
