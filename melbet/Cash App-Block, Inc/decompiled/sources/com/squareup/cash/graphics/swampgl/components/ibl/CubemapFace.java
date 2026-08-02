package com.squareup.cash.graphics.swampgl.components.ibl;

/* loaded from: classes6.dex */
public enum CubemapFace {
    POSITIVE_X("px"),
    NEGATIVE_X("nx"),
    POSITIVE_Y("py"),
    NEGATIVE_Y("ny"),
    POSITIVE_Z("pz"),
    NEGATIVE_Z("nz");

    public final String suffix;

    CubemapFace(String str) {
        this.suffix = str;
    }
}
