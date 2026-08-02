package defpackage;

import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class tpz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LootBoxContentTypeEntity.values().length];
        try {
            iArr[LootBoxContentTypeEntity.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LootBoxContentTypeEntity.LOOT_BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LootBoxContentTypeEntity.DIRECT_OFFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
