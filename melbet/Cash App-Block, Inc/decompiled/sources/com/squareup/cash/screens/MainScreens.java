package com.squareup.cash.screens;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class MainScreens implements Screen {
    public final /* synthetic */ int $r8$classId;

    public boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Intrinsics.areEqual(obj != null ? obj.getClass() : null, getClass());
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.$r8$classId) {
            case 0:
                return getClass().hashCode();
            default:
                return super.hashCode();
        }
    }
}
