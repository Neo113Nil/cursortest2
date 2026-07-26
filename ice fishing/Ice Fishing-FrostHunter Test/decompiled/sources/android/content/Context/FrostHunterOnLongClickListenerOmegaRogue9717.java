package android.content.Context;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnLongClickListenerOmegaRogue9717 extends LinkedHashMap {
    public static final FrostHunterOnLongClickListenerOmegaRogue9717 FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterCameraXPixelTurboCosmos9814 = true;

    static {
        FrostHunterOnLongClickListenerOmegaRogue9717 frostHunterOnLongClickListenerOmegaRogue9717 = new FrostHunterOnLongClickListenerOmegaRogue9717();
        FrostHunterFlowMaxDragonHero5809 = frostHunterOnLongClickListenerOmegaRogue9717;
        frostHunterOnLongClickListenerOmegaRogue9717.FrostHunterCameraXPixelTurboCosmos9814 = false;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        if (!this.FrostHunterCameraXPixelTurboCosmos9814) {
            throw new UnsupportedOperationException();
        }
    }

    public final FrostHunterOnLongClickListenerOmegaRogue9717 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (isEmpty()) {
            return new FrostHunterOnLongClickListenerOmegaRogue9717();
        }
        FrostHunterOnLongClickListenerOmegaRogue9717 frostHunterOnLongClickListenerOmegaRogue9717 = new FrostHunterOnLongClickListenerOmegaRogue9717(this);
        frostHunterOnLongClickListenerOmegaRogue9717.FrostHunterCameraXPixelTurboCosmos9814 = true;
        return frostHunterOnLongClickListenerOmegaRogue9717;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        FrostHunterAlphaAnimationNeoCosmos5761();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
                hashCode = length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
                int i3 = length2;
                for (byte b2 : bArr2) {
                    i3 = (i3 * 31) + b2;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        for (Object obj : map.keySet()) {
            Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        return super.remove(obj);
    }
}
