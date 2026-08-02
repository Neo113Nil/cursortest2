package ru.yandex.taxi.widget.image;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/widget/image/BitmapRequest$ForceCacheType", "", "Lru/yandex/taxi/widget/image/BitmapRequest$ForceCacheType;", JCP.RAW_PREFIX, "DISK", "MEMORY", "go-client-android.libs.image_loader:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BitmapRequest$ForceCacheType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BitmapRequest$ForceCacheType[] $VALUES;
    public static final BitmapRequest$ForceCacheType DISK;
    public static final BitmapRequest$ForceCacheType MEMORY;
    public static final BitmapRequest$ForceCacheType NONE;

    static {
        BitmapRequest$ForceCacheType bitmapRequest$ForceCacheType = new BitmapRequest$ForceCacheType(JCP.RAW_PREFIX, 0);
        NONE = bitmapRequest$ForceCacheType;
        BitmapRequest$ForceCacheType bitmapRequest$ForceCacheType2 = new BitmapRequest$ForceCacheType("DISK", 1);
        DISK = bitmapRequest$ForceCacheType2;
        BitmapRequest$ForceCacheType bitmapRequest$ForceCacheType3 = new BitmapRequest$ForceCacheType("MEMORY", 2);
        MEMORY = bitmapRequest$ForceCacheType3;
        BitmapRequest$ForceCacheType[] bitmapRequest$ForceCacheTypeArr = {bitmapRequest$ForceCacheType, bitmapRequest$ForceCacheType2, bitmapRequest$ForceCacheType3};
        $VALUES = bitmapRequest$ForceCacheTypeArr;
        $ENTRIES = a.a(bitmapRequest$ForceCacheTypeArr);
    }

    public static BitmapRequest$ForceCacheType valueOf(String str) {
        return (BitmapRequest$ForceCacheType) Enum.valueOf(BitmapRequest$ForceCacheType.class, str);
    }

    public static BitmapRequest$ForceCacheType[] values() {
        return (BitmapRequest$ForceCacheType[]) $VALUES.clone();
    }
}
