package defpackage;

import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class qgv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrganizationGalleryItemState.values().length];
        try {
            iArr[OrganizationGalleryItemState.SHIMMERING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrganizationGalleryItemState.CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrganizationGalleryItemState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
