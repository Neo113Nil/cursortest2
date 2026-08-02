package com.google.android.gms.internal.mlkit_vision_common;

import com.caverock.androidsvg.SVG;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzhh {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandCard.deepLinkSpecs;
    }

    public boolean doTextContainer(SVG.TextContainer textContainer) {
        return true;
    }

    public abstract void processText(String str);
}
