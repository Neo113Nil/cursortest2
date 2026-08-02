package com.anythink.expressad.video.dynview.c;

/* loaded from: classes.dex */
public enum b implements a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: g, reason: collision with root package name */
    private int f21963g;

    /* renamed from: h, reason: collision with root package name */
    private String f21964h;

    b(int i4, String str) {
        this.f21963g = i4;
        this.f21964h = str;
    }

    private static /* synthetic */ b[] c() {
        return new b[]{NOT_FOUND_VIEWOPTION, NOT_FOUND_CONTEXT, NOT_FOUND_LAYOUTNAME, CAMPAIGNEX_IS_NULL, VIEW_CREATE_ERROR, NOT_FOUND_ROOTVIEW};
    }

    public final int a() {
        return this.f21963g;
    }

    public final String b() {
        return this.f21964h;
    }
}
