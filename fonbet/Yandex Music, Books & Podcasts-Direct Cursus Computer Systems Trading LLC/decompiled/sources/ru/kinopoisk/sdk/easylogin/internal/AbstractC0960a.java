package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.gfu;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/a;", "Lru/kinopoisk/sdk/easylogin/internal/o2;", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0960a extends C1159o2 {
    public gfu a;
    public Context b;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.a$a, reason: collision with other inner class name */
    public static final class C0038a extends uif implements Function1<Context, Unit> {
        public C0038a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            context.getClass();
            AbstractC0960a.this.b = context;
            return Unit.a;
        }
    }

    public AbstractC0960a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((i2 & 1) != 0 ? 0 : i);
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        Context context2 = super.getContext();
        new C0038a();
        return context2;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    @NotNull
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        Context context = getContext();
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        onGetLayoutInflater.getClass();
        onGetLayoutInflater.getClass();
        if (context == null) {
            return onGetLayoutInflater;
        }
        LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(context);
        cloneInContext.getClass();
        return cloneInContext;
    }

    public AbstractC0960a() {
        this(0, 1, null);
    }
}
