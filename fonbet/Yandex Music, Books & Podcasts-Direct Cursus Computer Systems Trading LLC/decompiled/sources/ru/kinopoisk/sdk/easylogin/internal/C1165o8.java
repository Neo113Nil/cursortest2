package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.gw0;
import defpackage.we7;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor", f = "SamsungTvInteractor.kt", l = {93, 94, 96}, m = "executeWithResult")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1165o8<T> extends cg6 {
    public C1109k8 a;
    public C1004d1 b;
    public Type c;
    public JSONObject d;
    public gw0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ C1109k8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165o8(C1109k8 c1109k8, cg6 cg6Var) {
        super(cg6Var);
        this.g = c1109k8;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((C1004d1) null, (Type) null, this);
    }
}
