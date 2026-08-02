package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import com.yandex.go.slot.dto.b2;
import defpackage.har0;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.n9r0;
import defpackage.ny61;
import defpackage.oar0;
import defpackage.p9r0;
import defpackage.t9r0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y9r0;
import defpackage.z9r0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$updateState$2", f = "SettingsModalInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SettingsModalInteractor$updateState$2 extends SuspendLambda implements wls {
    final /* synthetic */ z9r0 $settingsModalParams;
    final /* synthetic */ ThemeType $theme;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$updateState$2$2", f = "SettingsModalInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$updateState$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ z9r0 $settingsModalParams;
        final /* synthetic */ ThemeType $theme;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, z9r0 z9r0Var, ThemeType themeType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$settingsModalParams = z9r0Var;
            this.$theme = themeType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$settingsModalParams, this.$theme, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                n7v n7vVar = this.$settingsModalParams.a;
                ThemeType themeType = this.$theme;
                this.label = 1;
                if (a.b(aVar, n7vVar, themeType, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$updateState$2$3", f = "SettingsModalInteractor.kt", l = {38}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$updateState$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ z9r0 $settingsModalParams;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, z9r0 z9r0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$settingsModalParams = z9r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$settingsModalParams, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                List list = this.$settingsModalParams.d;
                this.label = 1;
                if (a.a(aVar, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsModalInteractor$updateState$2(a aVar, z9r0 z9r0Var, ThemeType themeType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$settingsModalParams = z9r0Var;
        this.$theme = themeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsModalInteractor$updateState$2 settingsModalInteractor$updateState$2 = new SettingsModalInteractor$updateState$2(this.this$0, this.$settingsModalParams, this.$theme, continuation);
        settingsModalInteractor$updateState$2.L$0 = obj;
        return settingsModalInteractor$updateState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsModalInteractor$updateState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r11 == null) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p9r0 p9r0Var;
        Object value;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0.b;
        y9r0 y9r0Var = this.$settingsModalParams.c;
        bVar.getClass();
        b2 b2Var = y9r0Var.b;
        if (b2Var != null) {
            bVar.c.getClass();
            p9r0Var = t9r0.b(b2Var);
        }
        p9r0Var = n9r0.a;
        har0 har0Var = new har0(y9r0Var.a, p9r0Var);
        r0 r0Var = this.this$0.c;
        z9r0 z9r0Var = this.$settingsModalParams;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, oar0.a((oar0) value, null, z9r0Var.b, null, har0Var, 5)));
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$settingsModalParams, this.$theme, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, this.$settingsModalParams, null), 3);
    }
}
