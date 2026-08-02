package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import android.graphics.drawable.BitmapDrawable;
import defpackage.evu0;
import defpackage.g92;
import defpackage.izg0;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.rol0;
import defpackage.tse;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalUiStateMapper$mapIconFlow$2", f = "SettingsModalUiStateMapper.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SettingsModalUiStateMapper$mapIconFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ n7v $icon;
    final /* synthetic */ ThemeType $theme;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalUiStateMapper$mapIconFlow$2$1", f = "SettingsModalUiStateMapper.kt", l = {112, 114, BuildConfig.API_LEVEL, 120}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalUiStateMapper$mapIconFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ ThemeType $theme;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, ThemeType themeType, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$theme = themeType;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$theme, this.$imageUrl, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r12 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                UiStateDrawableWrapper g = pkf.g(vng.t(izg0.ic_loading_settings_modal_favorite_ride, this.this$0.a), "loading_image_" + this.$theme.name(), null);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 1;
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    return vprVar.emit(null, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                UiStateDrawableWrapper g2 = pkf.g(bitmapDrawable, this.$imageUrl, this.$theme);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                if (vprVar.emit(g2, this) == coroutineSingletons) {
                }
            }
            e eVar = this.this$0.e;
            String str = this.$imageUrl;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 2;
            obj = e.k(eVar, str, null, this, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsModalUiStateMapper$mapIconFlow$2(n7v n7vVar, b bVar, ThemeType themeType, Continuation continuation) {
        super(2, continuation);
        this.$icon = n7vVar;
        this.this$0 = bVar;
        this.$theme = themeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsModalUiStateMapper$mapIconFlow$2(this.$icon, this.this$0, this.$theme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsModalUiStateMapper$mapIconFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n7v n7vVar = this.$icon;
            String str2 = n7vVar != null ? n7vVar.c : null;
            if (str2 == null || evu0.J(str2)) {
                n7v n7vVar2 = this.$icon;
                String str3 = n7vVar2 != null ? n7vVar2.b : null;
                if (str3 == null || evu0.J(str3)) {
                    return new g92(2, null);
                }
            }
            String a = this.this$0.d.a(this.$icon);
            if (a == null) {
                return new g92(2, null);
            }
            e eVar = this.this$0.e;
            this.L$0 = a;
            this.label = 1;
            Object o = e.o(eVar, a, null, this, 14);
            if (o == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = a;
            obj = o;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        return bitmapDrawable != null ? new g92(2, pkf.g(bitmapDrawable, str, this.$theme)) : new rol0(new AnonymousClass1(this.this$0, this.$theme, str, null));
    }
}
