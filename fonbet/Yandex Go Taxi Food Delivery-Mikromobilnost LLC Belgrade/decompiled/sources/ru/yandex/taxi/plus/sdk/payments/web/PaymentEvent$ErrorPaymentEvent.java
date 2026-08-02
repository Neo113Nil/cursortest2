package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nk90;
import defpackage.uz90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$ErrorPaymentEvent", "Lru/yandex/taxi/plus/sdk/payments/web/o;", "Companion", "Action", "Type", "ru/yandex/taxi/plus/sdk/payments/web/a", "uz90", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentEvent$ErrorPaymentEvent extends o {
    public static final uz90 Companion = new uz90();
    public static final i3y[] e;
    public final String a;
    public final Action b;
    public final Type c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$ErrorPaymentEvent$Action;", "", "Companion", "ru/yandex/taxi/plus/sdk/payments/web/b", "CLOSE", "RELOAD", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Action CLOSE;
        public static final b Companion;
        public static final Action RELOAD;
        public static final Action UNKNOWN;

        static {
            Action action = new Action("CLOSE", 0);
            CLOSE = action;
            Action action2 = new Action("RELOAD", 1);
            RELOAD = action2;
            Action action3 = new Action("UNKNOWN", 2);
            UNKNOWN = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(14));
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$ErrorPaymentEvent$Type;", "", "Companion", "ru/yandex/taxi/plus/sdk/payments/web/c", "FATAL", "ORDER", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final Type FATAL;
        public static final Type ORDER;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("FATAL", 0);
            FATAL = type;
            Type type2 = new Type("ORDER", 1);
            ORDER = type2;
            Type type3 = new Type("UNKNOWN", 2);
            UNKNOWN = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(15));
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
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new nk90(12)), kotlin.a.b(lazyThreadSafetyMode, new nk90(13)), null};
    }

    public PaymentEvent$ErrorPaymentEvent(int i, String str, Action action, Type type, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = Action.UNKNOWN;
        } else {
            this.b = action;
        }
        if ((i & 4) == 0) {
            this.c = Type.UNKNOWN;
        } else {
            this.c = type;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentEvent$ErrorPaymentEvent)) {
            return false;
        }
        PaymentEvent$ErrorPaymentEvent paymentEvent$ErrorPaymentEvent = (PaymentEvent$ErrorPaymentEvent) obj;
        return jl40.l(this.a, paymentEvent$ErrorPaymentEvent.a) && this.b == paymentEvent$ErrorPaymentEvent.b && this.c == paymentEvent$ErrorPaymentEvent.c && jl40.l(this.d, paymentEvent$ErrorPaymentEvent.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorPaymentEvent(error=" + this.a + ", action=" + this.b + ", type=" + this.c + ", requestId=" + this.d + Extension.C_BRAKE;
    }

    public PaymentEvent$ErrorPaymentEvent() {
        Action action = Action.UNKNOWN;
        Type type = Type.UNKNOWN;
        this.a = null;
        this.b = action;
        this.c = type;
        this.d = null;
    }
}
