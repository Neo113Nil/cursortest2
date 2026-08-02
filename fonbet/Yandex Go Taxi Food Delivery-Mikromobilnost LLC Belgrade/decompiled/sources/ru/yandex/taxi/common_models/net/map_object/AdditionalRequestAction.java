package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pn0;
import defpackage.qn0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AdditionalRequestAction;", "Lru/yandex/taxi/common_models/net/map_object/z;", "Companion", "AdditionalRequestParams", "ru/yandex/taxi/common_models/net/map_object/a", "qn0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdditionalRequestAction extends z {
    public static final qn0 Companion = new qn0();
    public final AdditionalRequestParams a;

    public /* synthetic */ AdditionalRequestAction(int i, AdditionalRequestParams additionalRequestParams) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = additionalRequestParams;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.ADDITIONAL_REQUEST;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AdditionalRequestAction$AdditionalRequestParams;", "", "Companion", "AdditionalRequestParamType", "ru/yandex/taxi/common_models/net/map_object/b", "ru/yandex/taxi/common_models/net/map_object/d", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AdditionalRequestParams {
        public static final d Companion = new d();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(0))};
        public final AdditionalRequestParamType a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AdditionalRequestAction$AdditionalRequestParams$AdditionalRequestParamType;", "", "Companion", "ru/yandex/taxi/common_models/net/map_object/c", "POINT_A", "POINT_B", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AdditionalRequestParamType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ AdditionalRequestParamType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final AdditionalRequestParamType POINT_A;
            public static final AdditionalRequestParamType POINT_B;
            public static final AdditionalRequestParamType UNKNOWN;

            static {
                AdditionalRequestParamType additionalRequestParamType = new AdditionalRequestParamType("POINT_A", 0);
                POINT_A = additionalRequestParamType;
                AdditionalRequestParamType additionalRequestParamType2 = new AdditionalRequestParamType("POINT_B", 1);
                POINT_B = additionalRequestParamType2;
                AdditionalRequestParamType additionalRequestParamType3 = new AdditionalRequestParamType("UNKNOWN", 2);
                UNKNOWN = additionalRequestParamType3;
                AdditionalRequestParamType[] additionalRequestParamTypeArr = {additionalRequestParamType, additionalRequestParamType2, additionalRequestParamType3};
                $VALUES = additionalRequestParamTypeArr;
                $ENTRIES = kotlin.enums.a.a(additionalRequestParamTypeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(1));
            }

            public static AdditionalRequestParamType valueOf(String str) {
                return (AdditionalRequestParamType) Enum.valueOf(AdditionalRequestParamType.class, str);
            }

            public static AdditionalRequestParamType[] values() {
                return (AdditionalRequestParamType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AdditionalRequestParams(int i, AdditionalRequestParamType additionalRequestParamType) {
            if ((i & 1) == 0) {
                this.a = AdditionalRequestParamType.UNKNOWN;
            } else {
                this.a = additionalRequestParamType;
            }
        }

        public AdditionalRequestParams() {
            this.a = AdditionalRequestParamType.UNKNOWN;
        }
    }

    public AdditionalRequestAction() {
        this.a = null;
    }
}
