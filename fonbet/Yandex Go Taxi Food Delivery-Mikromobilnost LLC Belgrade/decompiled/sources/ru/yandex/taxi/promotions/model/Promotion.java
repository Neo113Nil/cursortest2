package ru.yandex.taxi.promotions.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.pmf0;
import defpackage.yrf0;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0(with = a.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "", "<init>", "()V", "Companion", "Type", "ru/yandex/taxi/promotions/model/a", "yrf0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class Promotion {
    public static final yrf0 Companion = new yrf0();
    public static final Set a = j73.f0(new Type[]{Type.FULLSCREEN, Type.CARD, Type.STORY, Type.TICKET});

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion$Type;", "", "Companion", "ru/yandex/taxi/promotions/model/b", "FULLSCREEN", "CARD", "NOTIFICATION", "STORY", "TICKET", "MISSED_SEEN", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type CARD;
        public static final b Companion;
        public static final Type FULLSCREEN;
        public static final Type MISSED_SEEN;
        public static final Type NOTIFICATION;
        public static final Type STORY;
        public static final Type TICKET;

        static {
            Type type = new Type("FULLSCREEN", 0);
            FULLSCREEN = type;
            Type type2 = new Type("CARD", 1);
            CARD = type2;
            Type type3 = new Type("NOTIFICATION", 2);
            NOTIFICATION = type3;
            Type type4 = new Type("STORY", 3);
            STORY = type4;
            Type type5 = new Type("TICKET", 4);
            TICKET = type5;
            Type type6 = new Type("MISSED_SEEN", 5);
            MISSED_SEEN = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(4));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public abstract Promotion a();

    public abstract List b();

    public String c() {
        return m().toString().toLowerCase(Locale.US);
    }

    public abstract List d();

    /* renamed from: e */
    public abstract Calendar getG();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(getB(), ((Promotion) obj).getB());
        }
        return false;
    }

    /* renamed from: f */
    public abstract boolean getJ();

    /* renamed from: g */
    public abstract String getB();

    public abstract List h();

    public int hashCode() {
        return getB().hashCode();
    }

    /* renamed from: i */
    public abstract int getE();

    /* renamed from: j */
    public abstract Map getC();

    /* renamed from: k */
    public abstract Set getH();

    /* renamed from: l */
    public abstract Calendar getF();

    public Type m() {
        return Type.CARD;
    }

    /* renamed from: n */
    public abstract List getD();

    public boolean o() {
        return getB().length() > 0;
    }

    public abstract void p();

    public abstract void q(Set set);

    public abstract void r(boolean z);
}
