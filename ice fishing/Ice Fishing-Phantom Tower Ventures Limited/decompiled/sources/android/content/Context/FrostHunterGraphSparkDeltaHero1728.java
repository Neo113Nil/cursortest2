package android.content.Context;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGraphSparkDeltaHero1728 extends FrostHunterAnimationSetHyperionAurora2108 implements FrostHunterCamera2NovaDeltaDragon3775, RandomAccess, Serializable {
    public final Enum[] FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterGraphSparkDeltaHero1728(Enum[] enumArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = enumArr;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.length;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) FrostHunterContextSolarMegaPhantom7469.FrostHunterViewModelScopeTitanRogue1970(r2.ordinal(), this.FrostHunterCameraXPixelTurboCosmos9814)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) FrostHunterContextSolarMegaPhantom7469.FrostHunterViewModelScopeTitanRogue1970(ordinal, this.FrostHunterCameraXPixelTurboCosmos9814)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) FrostHunterContextSolarMegaPhantom7469.FrostHunterViewModelScopeTitanRogue1970(ordinal, this.FrostHunterCameraXPixelTurboCosmos9814)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
