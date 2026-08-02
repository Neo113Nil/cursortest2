package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import coil3.Extras;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    public Extras.Key drawResult;

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final Extras.Key onDrawWithContent(Function1 function1) {
        Extras.Key key = new Extras.Key();
        key.f61default = function1;
        this.drawResult = key;
        return key;
    }
}
