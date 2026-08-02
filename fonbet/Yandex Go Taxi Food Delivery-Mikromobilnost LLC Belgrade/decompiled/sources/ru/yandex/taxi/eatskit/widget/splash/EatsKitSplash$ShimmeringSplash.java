package ru.yandex.taxi.eatskit.widget.splash;

import defpackage.fen;
import defpackage.k4o;
import defpackage.vph0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/eatskit/widget/splash/EatsKitSplash$ShimmeringSplash", "Lfen;", "", "Lru/yandex/taxi/eatskit/widget/splash/EatsKitSplash$ShimmeringSplash;", "", "layoutRes", CA20Status.STATUS_USER_I, "n", "()I", "EatsStyle", "GroceryStyle", "MarketStyle", "WebStyle", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsKitSplash$ShimmeringSplash implements fen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsKitSplash$ShimmeringSplash[] $VALUES;
    public static final EatsKitSplash$ShimmeringSplash EatsStyle;
    public static final EatsKitSplash$ShimmeringSplash GroceryStyle;
    public static final EatsKitSplash$ShimmeringSplash MarketStyle;
    public static final EatsKitSplash$ShimmeringSplash WebStyle;
    private final int layoutRes;

    static {
        EatsKitSplash$ShimmeringSplash eatsKitSplash$ShimmeringSplash = new EatsKitSplash$ShimmeringSplash("EatsStyle", 0, vph0.eats_placeholder_eats);
        EatsStyle = eatsKitSplash$ShimmeringSplash;
        EatsKitSplash$ShimmeringSplash eatsKitSplash$ShimmeringSplash2 = new EatsKitSplash$ShimmeringSplash("GroceryStyle", 1, vph0.eats_placeholder_grocery);
        GroceryStyle = eatsKitSplash$ShimmeringSplash2;
        EatsKitSplash$ShimmeringSplash eatsKitSplash$ShimmeringSplash3 = new EatsKitSplash$ShimmeringSplash("MarketStyle", 2, vph0.eats_placeholder_market);
        MarketStyle = eatsKitSplash$ShimmeringSplash3;
        EatsKitSplash$ShimmeringSplash eatsKitSplash$ShimmeringSplash4 = new EatsKitSplash$ShimmeringSplash("WebStyle", 3, vph0.eats_placeholder_web);
        WebStyle = eatsKitSplash$ShimmeringSplash4;
        EatsKitSplash$ShimmeringSplash[] eatsKitSplash$ShimmeringSplashArr = {eatsKitSplash$ShimmeringSplash, eatsKitSplash$ShimmeringSplash2, eatsKitSplash$ShimmeringSplash3, eatsKitSplash$ShimmeringSplash4};
        $VALUES = eatsKitSplash$ShimmeringSplashArr;
        $ENTRIES = a.a(eatsKitSplash$ShimmeringSplashArr);
    }

    public EatsKitSplash$ShimmeringSplash(String str, int i, int i2) {
        this.layoutRes = i2;
    }

    public static EatsKitSplash$ShimmeringSplash valueOf(String str) {
        return (EatsKitSplash$ShimmeringSplash) Enum.valueOf(EatsKitSplash$ShimmeringSplash.class, str);
    }

    public static EatsKitSplash$ShimmeringSplash[] values() {
        return (EatsKitSplash$ShimmeringSplash[]) $VALUES.clone();
    }

    @Override // defpackage.fen
    /* renamed from: n, reason: from getter */
    public final int getLayoutRes() {
        return this.layoutRes;
    }
}
