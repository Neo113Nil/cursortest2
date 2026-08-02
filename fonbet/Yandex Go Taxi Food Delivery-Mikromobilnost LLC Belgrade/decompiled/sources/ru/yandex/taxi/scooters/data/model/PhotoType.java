package ru.yandex.taxi.scooters.data.model;

import defpackage.djb0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z4b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/scooters/data/model/PhotoType;", "", "", "photoTypeString", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "djb0", "COMPLETION", "FEEDBACK", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PhotoType COMPLETION;
    public static final djb0 Companion;
    public static final PhotoType FEEDBACK;
    private final String photoTypeString;

    static {
        PhotoType photoType = new PhotoType("COMPLETION", 0, "completion");
        COMPLETION = photoType;
        PhotoType photoType2 = new PhotoType("FEEDBACK", 1, "feedback");
        FEEDBACK = photoType2;
        PhotoType[] photoTypeArr = {photoType, photoType2};
        $VALUES = photoTypeArr;
        $ENTRIES = a.a(photoTypeArr);
        Companion = new djb0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(14));
    }

    public PhotoType(String str, int i, String str2) {
        this.photoTypeString = str2;
    }

    public static PhotoType valueOf(String str) {
        return (PhotoType) Enum.valueOf(PhotoType.class, str);
    }

    public static PhotoType[] values() {
        return (PhotoType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getPhotoTypeString() {
        return this.photoTypeString;
    }
}
