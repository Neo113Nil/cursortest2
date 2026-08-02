package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class DeliveryInformationForm {
    public final FormType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/tariffs/model/DeliveryInformationForm$FormType;", "", "SHORT", "MINIMAL", "REDUCED", "FULL", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FormType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FormType[] $VALUES;
        public static final FormType FULL;
        public static final FormType MINIMAL;
        public static final FormType REDUCED;
        public static final FormType SHORT;
        public static final FormType UNKNOWN;

        static {
            FormType formType = new FormType("SHORT", 0);
            SHORT = formType;
            FormType formType2 = new FormType("MINIMAL", 1);
            MINIMAL = formType2;
            FormType formType3 = new FormType("REDUCED", 2);
            REDUCED = formType3;
            FormType formType4 = new FormType("FULL", 3);
            FULL = formType4;
            FormType formType5 = new FormType("UNKNOWN", 4);
            UNKNOWN = formType5;
            FormType[] formTypeArr = {formType, formType2, formType3, formType4, formType5};
            $VALUES = formTypeArr;
            $ENTRIES = kotlin.enums.a.a(formTypeArr);
        }

        public static FormType valueOf(String str) {
            return (FormType) Enum.valueOf(FormType.class, str);
        }

        public static FormType[] values() {
            return (FormType[]) $VALUES.clone();
        }
    }

    public DeliveryInformationForm(FormType formType) {
        this.a = formType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryInformationForm) && this.a == ((DeliveryInformationForm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryInformationForm(formType=" + this.a + Extension.C_BRAKE;
    }

    public DeliveryInformationForm() {
        this(FormType.UNKNOWN);
    }
}
