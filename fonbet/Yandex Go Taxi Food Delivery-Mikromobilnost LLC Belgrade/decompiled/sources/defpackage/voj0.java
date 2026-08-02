package defpackage;

import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import com.yandex.go.zone.dto.objects.TariffViewSectionItemType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class voj0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TariffViewSectionItemType.values().length];
        try {
            iArr[TariffViewSectionItemType.GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffViewSectionItemType.REQUIREMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TariffViewSectionItemType.VIRTUAL_GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TariffViewSectionItemType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[TariffGroupDefinitionType.values().length];
        try {
            iArr2[TariffGroupDefinitionType.ITEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TariffGroupDefinitionType.FLAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TariffGroupDefinitionType.CAROUSEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TariffGroupDefinitionType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
