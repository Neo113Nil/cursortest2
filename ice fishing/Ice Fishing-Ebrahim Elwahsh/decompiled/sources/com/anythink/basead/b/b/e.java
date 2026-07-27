package com.anythink.basead.b.b;

/* loaded from: classes.dex */
public enum e {
    NO_HANDLE(0),
    HANDLE_SUCCESS(1),
    HANDLE_FAIL(2),
    HANDLE_SUCCESS_WITH_WEB_CLICK(3),
    HANDLE_DEEPLINK_REFUSE(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f5945f;

    e(int i) {
        this.f5945f = i;
    }

    private int a() {
        return this.f5945f;
    }

    private static /* synthetic */ e[] b() {
        return new e[]{NO_HANDLE, HANDLE_SUCCESS, HANDLE_FAIL, HANDLE_SUCCESS_WITH_WEB_CLICK, HANDLE_DEEPLINK_REFUSE};
    }

    private static e a(int i) {
        for (e eVar : values()) {
            if (eVar.f5945f == i) {
                return eVar;
            }
        }
        return NO_HANDLE;
    }
}
