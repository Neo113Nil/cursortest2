package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/TextWithBulletPointType;", "", "BIOMETRY_INFO", "FAILED_VERIFICATION", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TextWithBulletPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextWithBulletPointType[] $VALUES;
    public static final TextWithBulletPointType BIOMETRY_INFO;
    public static final TextWithBulletPointType FAILED_VERIFICATION;

    static {
        TextWithBulletPointType textWithBulletPointType = new TextWithBulletPointType("BIOMETRY_INFO", 0);
        BIOMETRY_INFO = textWithBulletPointType;
        TextWithBulletPointType textWithBulletPointType2 = new TextWithBulletPointType("FAILED_VERIFICATION", 1);
        FAILED_VERIFICATION = textWithBulletPointType2;
        TextWithBulletPointType[] textWithBulletPointTypeArr = {textWithBulletPointType, textWithBulletPointType2};
        $VALUES = textWithBulletPointTypeArr;
        $ENTRIES = kotlin.enums.a.a(textWithBulletPointTypeArr);
    }

    public static TextWithBulletPointType valueOf(String str) {
        return (TextWithBulletPointType) Enum.valueOf(TextWithBulletPointType.class, str);
    }

    public static TextWithBulletPointType[] values() {
        return (TextWithBulletPointType[]) $VALUES.clone();
    }
}
