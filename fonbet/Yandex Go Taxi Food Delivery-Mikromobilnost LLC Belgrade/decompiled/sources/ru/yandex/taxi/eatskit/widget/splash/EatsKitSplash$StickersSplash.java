package ru.yandex.taxi.eatskit.widget.splash;

import defpackage.fen;
import defpackage.k4o;
import defpackage.vph0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/eatskit/widget/splash/EatsKitSplash$StickersSplash", "Lfen;", "", "Lru/yandex/taxi/eatskit/widget/splash/EatsKitSplash$StickersSplash;", "", "layoutRes", CA20Status.STATUS_USER_I, "n", "()I", "EatsStyle", "GroceryStyle", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsKitSplash$StickersSplash implements fen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsKitSplash$StickersSplash[] $VALUES;
    public static final EatsKitSplash$StickersSplash EatsStyle;
    public static final EatsKitSplash$StickersSplash GroceryStyle;
    private final int layoutRes;

    static {
        EatsKitSplash$StickersSplash eatsKitSplash$StickersSplash = new EatsKitSplash$StickersSplash("EatsStyle", 0, vph0.eats_placeholder_eats_sticker);
        EatsStyle = eatsKitSplash$StickersSplash;
        EatsKitSplash$StickersSplash eatsKitSplash$StickersSplash2 = new EatsKitSplash$StickersSplash("GroceryStyle", 1, vph0.eats_placeholder_grocery_sticker);
        GroceryStyle = eatsKitSplash$StickersSplash2;
        EatsKitSplash$StickersSplash[] eatsKitSplash$StickersSplashArr = {eatsKitSplash$StickersSplash, eatsKitSplash$StickersSplash2};
        $VALUES = eatsKitSplash$StickersSplashArr;
        $ENTRIES = a.a(eatsKitSplash$StickersSplashArr);
    }

    public EatsKitSplash$StickersSplash(String str, int i, int i2) {
        this.layoutRes = i2;
    }

    public static EatsKitSplash$StickersSplash valueOf(String str) {
        return (EatsKitSplash$StickersSplash) Enum.valueOf(EatsKitSplash$StickersSplash.class, str);
    }

    public static EatsKitSplash$StickersSplash[] values() {
        return (EatsKitSplash$StickersSplash[]) $VALUES.clone();
    }

    @Override // defpackage.fen
    /* renamed from: n, reason: from getter */
    public final int getLayoutRes() {
        return this.layoutRes;
    }
}
