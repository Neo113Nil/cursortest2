package ru.yandex.taxi.location.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8y;
import defpackage.k4o;
import defpackage.wwx;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/location/dto/LbsResponse;", "", "Companion", "a", "b", "Type", "ru/yandex/taxi/location/dto/a", "i8y", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LbsResponse {
    public static final i8y Companion = new i8y();
    public final a a;
    public final b b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/location/dto/LbsResponse$Type;", "", "Companion", "ru/yandex/taxi/location/dto/f", "WIFI", "IP", "GSM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final Type GSM;
        public static final Type IP;
        public static final Type WIFI;

        static {
            Type type = new Type("WIFI", 0);
            WIFI = type;
            Type type2 = new Type("IP", 1);
            IP = type2;
            Type type3 = new Type("GSM", 2);
            GSM = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(10));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LbsResponse(int i, a aVar, b bVar) {
        this.a = (i & 1) == 0 ? new a(0) : aVar;
        if ((i & 2) == 0) {
            this.b = new b(0);
        } else {
            this.b = bVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/location/dto/LbsResponse$a;", "", "Companion", "ru/yandex/taxi/location/dto/b", "ru/yandex/taxi/location/dto/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c Companion = new c();
        public final int a;
        public final String b;

        public /* synthetic */ a(int i, int i2, String str) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public a(int i) {
            this.a = 0;
            this.b = null;
        }

        public a() {
            this(0);
        }
    }

    public LbsResponse() {
        a aVar = new a(0);
        b bVar = new b(0);
        this.a = aVar;
        this.b = bVar;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/location/dto/LbsResponse$b;", "", "Companion", "ru/yandex/taxi/location/dto/d", "ru/yandex/taxi/location/dto/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final e Companion = new e();
        public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(9))};
        public final double a;
        public final float b;
        public final double c;
        public final double d;
        public final double e;
        public final Type f;

        public /* synthetic */ b(int i, double d, float f, double d2, double d3, double d4, Type type) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0f;
            } else {
                this.b = f;
            }
            if ((i & 4) == 0) {
                this.c = 0.0d;
            } else {
                this.c = d2;
            }
            if ((i & 8) == 0) {
                this.d = 0.0d;
            } else {
                this.d = d3;
            }
            if ((i & 16) == 0) {
                this.e = 0.0d;
            } else {
                this.e = d4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = type;
            }
        }

        public b(int i) {
            this.a = 0.0d;
            this.b = 0.0f;
            this.c = 0.0d;
            this.d = 0.0d;
            this.e = 0.0d;
            this.f = null;
        }

        public b() {
            this(0);
        }
    }
}
