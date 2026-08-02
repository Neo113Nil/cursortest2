package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.vdr;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.Pc;

@ContributesBinding(scope = J.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/CurrentPuidProviderImpl;", "Lru/kinopoisk/sdk/easylogin/internal/t2;", "Lru/kinopoisk/sdk/easylogin/api/CurrentAccountInfoProvider;", "accountProvider", "<init>", "(Lru/kinopoisk/sdk/easylogin/api/CurrentAccountInfoProvider;)V", "", "Lru/kinopoisk/sdk/easylogin/internal/Pc;", "toPassportId", "(J)Lru/kinopoisk/sdk/easylogin/internal/Pc;", "Lpjc;", "getPuidFlow", "()Lpjc;", "Lru/kinopoisk/sdk/easylogin/api/CurrentAccountInfoProvider;", "getPuid", "()Lru/kinopoisk/sdk/easylogin/internal/Pc;", "puid", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class CurrentPuidProviderImpl implements InterfaceC1228t2 {

    @NotNull
    private final CurrentAccountInfoProvider accountProvider;

    public CurrentPuidProviderImpl(@NotNull CurrentAccountInfoProvider currentAccountInfoProvider) {
        currentAccountInfoProvider.getClass();
        this.accountProvider = currentAccountInfoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pc toPassportId(long j) {
        return new Pc(j);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2
    @NotNull
    public Pc getPuid() {
        return toPassportId(((Number) this.accountProvider.getPuid().getValue()).longValue());
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2
    @NotNull
    public pjc getPuidFlow() {
        final vdr puid = this.accountProvider.getPuid();
        return new pjc() { // from class: ru.kinopoisk.sdk.easylogin.internal.impl.CurrentPuidProviderImpl$getPuidFlow$$inlined$map$1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.CurrentPuidProviderImpl$getPuidFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements rjc {
                final /* synthetic */ rjc $this_unsafeFlow;
                final /* synthetic */ CurrentPuidProviderImpl this$0;

                @we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.CurrentPuidProviderImpl$getPuidFlow$$inlined$map$1$2", f = "CurrentPuidProviderImpl.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.CurrentPuidProviderImpl$getPuidFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends cg6 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // defpackage.kq2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(rjc rjcVar, CurrentPuidProviderImpl currentPuidProviderImpl) {
                    this.$this_unsafeFlow = rjcVar;
                    this.this$0 = currentPuidProviderImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.rjc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Pc passportId;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            nm6 nm6Var = nm6.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                qgg.h0(obj2);
                                rjc rjcVar = this.$this_unsafeFlow;
                                passportId = this.this$0.toPassportId(((Number) obj).longValue());
                                anonymousClass1.label = 1;
                                if (rjcVar.emit(passportId, anonymousClass1) == nm6Var) {
                                    return nm6Var;
                                }
                            } else {
                                if (i != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    nm6 nm6Var2 = nm6.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.pjc
            public Object collect(rjc rjcVar, Continuation continuation) {
                Object collect = pjc.this.collect(new AnonymousClass2(rjcVar, this), continuation);
                return collect == nm6.a ? collect : Unit.a;
            }
        };
    }
}
