package ru.yandex.taxi.favorites.rides.settings_modal.ui;

import defpackage.aar0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z9r0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ aar0 a;

    public a(aar0 aar0Var) {
        this.a = aar0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ThemeType themeType, Continuation continuation) {
        SettingsModalPresenter$attachView$2$1$emit$1 settingsModalPresenter$attachView$2$1$emit$1;
        int i;
        if (continuation instanceof SettingsModalPresenter$attachView$2$1$emit$1) {
            settingsModalPresenter$attachView$2$1$emit$1 = (SettingsModalPresenter$attachView$2$1$emit$1) continuation;
            int i2 = settingsModalPresenter$attachView$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsModalPresenter$attachView$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsModalPresenter$attachView$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsModalPresenter$attachView$2$1$emit$1.label;
                if (i != 0) {
                    b.b(obj);
                    aar0 aar0Var = this.a;
                    ru.yandex.taxi.favorites.rides.settings_modal.domain.a aVar = aar0Var.x;
                    z9r0 z9r0Var = aar0Var.B.b;
                    settingsModalPresenter$attachView$2$1$emit$1.L$0 = null;
                    settingsModalPresenter$attachView$2$1$emit$1.label = 1;
                    if (aVar.f(z9r0Var, themeType, settingsModalPresenter$attachView$2$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        settingsModalPresenter$attachView$2$1$emit$1 = new SettingsModalPresenter$attachView$2$1$emit$1(this, continuation);
        Object obj2 = settingsModalPresenter$attachView$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsModalPresenter$attachView$2$1$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
