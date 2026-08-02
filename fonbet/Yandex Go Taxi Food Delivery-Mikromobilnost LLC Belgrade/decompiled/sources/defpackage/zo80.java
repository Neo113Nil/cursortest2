package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewCardButtonTypeDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zo80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrganizationPreviewCardButtonTypeDto.values().length];
        try {
            iArr[OrganizationPreviewCardButtonTypeDto.LEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrganizationPreviewCardButtonTypeDto.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
