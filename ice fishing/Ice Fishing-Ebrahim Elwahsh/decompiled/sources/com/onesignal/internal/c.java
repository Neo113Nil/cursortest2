package com.onesignal.internal;

import E7.l;
import E7.p;
import M7.j;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C0388m;
import O7.InterfaceC0387l;
import O7.InterfaceC0397w;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import e5.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import q4.InterfaceC4928a;
import q7.InterfaceC4936e;
import r7.AbstractC4980k;
import t0.AbstractC5051n;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import x7.h;

/* loaded from: classes2.dex */
public final class c implements l4.c, r4.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;
    private final InterfaceC4936e configModel$delegate;
    private final I4.a debug;
    private final InterfaceC4936e featureManager$delegate;
    private final InterfaceC4936e identityModelStore$delegate;
    private final InterfaceC4936e identityVerificationService$delegate;
    private Exception initFailureException;
    private final Object initLock;
    private volatile a initState;
    private final AbstractC0395u ioDispatcher;
    private final InterfaceC4936e jwtTokenStore$delegate;
    private final List<String> listOfModules;
    private final InterfaceC4936e loginHelper$delegate;
    private final Object loginLogoutLock;
    private final InterfaceC4936e logoutHelper$delegate;
    private final InterfaceC4936e operationRepo$delegate;
    private g otelManager;
    private final InterfaceC4936e preferencesService$delegate;
    private final InterfaceC4936e propertiesModelStore$delegate;
    private final String sdkVersion;
    private final r4.d services;
    private final InterfaceC4936e subscriptionModelStore$delegate;
    private volatile InterfaceC0387l suspendCompletion;
    private final InterfaceC4936e userSwitcher$delegate;

    public static final class A extends h implements p {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $jwtBearerToken;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str, String str2, c cVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$externalId = str;
            this.$jwtBearerToken = str2;
            this.this$0 = cVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new A(this.$externalId, this.$jwtBearerToken, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((A) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r7.suspendUntilInit("login", r6) == r0) goto L23;
         */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            q7.v vVar = q7.v.f40183a;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                I4.c cVar = I4.c.DEBUG;
                StringBuilder sb = new StringBuilder("login(externalId: ");
                sb.append(this.$externalId);
                sb.append(", jwtBearerToken: ...");
                String str = this.$jwtBearerToken;
                sb.append(str != null ? j.g0(str) : null);
                sb.append(')');
                com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
                c cVar2 = this.this$0;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return vVar;
                }
                com.bumptech.glide.f.r(obj);
            }
            d.a switchUser$com_onesignal_core = this.this$0.getLoginHelper().switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
            if (switchUser$com_onesignal_core != null) {
                com.onesignal.user.internal.d loginHelper = this.this$0.getLoginHelper();
                this.label = 2;
                if (loginHelper.enqueueLogin$com_onesignal_core(switchUser$com_onesignal_core, this) == enumC5179a) {
                    return enumC5179a;
                }
            }
            return vVar;
        }
    }

    public static final class B extends h implements l {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(e.a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return c.this.new B(this.$context, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return q7.v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((B) create(interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }
    }

    public static final class C extends h implements p {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(e.a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$context = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C(this.$context, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return q7.v.f40183a;
        }
    }

    public static final class D extends i implements E7.a {
        public D() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.e invoke() {
            return new com.onesignal.user.internal.e(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getSubscriptionModelStore(), c.this.getIdentityVerificationService(), c.this.loginLogoutLock);
        }
    }

    public static final class E extends h implements p {
        int label;

        public E(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new E(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((E) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "logoutSuspend()");
                c cVar = c.this;
                this.label = 1;
                if (cVar.suspendUntilInit("logout", this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            e.a switchUser$com_onesignal_core = c.this.getLogoutHelper().switchUser$com_onesignal_core();
            q7.v vVar = q7.v.f40183a;
            if (switchUser$com_onesignal_core == null) {
                return vVar;
            }
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
            return vVar;
        }
    }

    public static final class F extends i implements E7.a {
        public F() {
            super(0);
        }

        @Override // E7.a
        public final n invoke() {
            return (n) c.this.services.getService(n.class);
        }
    }

    public static final class G extends i implements E7.a {
        public G() {
            super(0);
        }

        @Override // E7.a
        public final D4.f invoke() {
            return (D4.f) c.this.services.getService(D4.f.class);
        }
    }

    public static final class H extends i implements E7.a {
        public H() {
            super(0);
        }

        @Override // E7.a
        public final F4.b invoke() {
            return (F4.b) c.this.services.getService(F4.b.class);
        }
    }

    public static final class I extends i implements E7.a {
        public I() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.properties.b invoke() {
            return (com.onesignal.user.internal.properties.b) c.this.services.getService(com.onesignal.user.internal.properties.b.class);
        }
    }

    public static final class J extends i implements E7.a {
        public J() {
            super(0);
        }

        @Override // E7.a
        public final F5.a invoke() {
            return (F5.a) c.this.services.getService(F5.a.class);
        }
    }

    public static final class K extends h implements p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(boolean z8, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$value = z8;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new K(this.$value, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((K) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            Boolean bool = c.this._consentGiven;
            c.this._consentGiven = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setConsentGiven(Boolean.valueOf(this.$value));
            if (!kotlin.jvm.internal.h.a(bool, Boolean.valueOf(this.$value)) && this.$value) {
                c.this.getOperationRepo().forceExecuteOperations();
            }
            return q7.v.f40183a;
        }
    }

    public static final class L extends h implements p {
        final /* synthetic */ boolean $required;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(boolean z8, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$required = z8;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new L(this.$required, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((L) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            c.this._consentRequired = Boolean.valueOf(this.$required);
            c.this.getConfigModel().setConsentRequired(Boolean.valueOf(this.$required));
            return q7.v.f40183a;
        }
    }

    public static final class M extends h implements p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(boolean z8, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$value = z8;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new M(this.$value, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((M) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            c.this._disableGMSMissingPrompt = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setDisableGMSMissingPrompt(this.$value);
            return q7.v.f40183a;
        }
    }

    public static final class N extends i implements E7.a {
        public N() {
            super(0);
        }

        @Override // E7.a
        public final V5.e invoke() {
            return (V5.e) c.this.services.getService(V5.e.class);
        }
    }

    public static final class O extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public O(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.suspendAndReturn(null, this);
        }
    }

    public static final class P extends h implements p {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(String str, String str2, c cVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$externalId = str;
            this.$token = str2;
            this.this$0 = cVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new P(this.$externalId, this.$token, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((P) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + j.g0(this.$token) + ')');
                c cVar = this.this$0;
                this.label = 1;
                if (cVar.suspendUntilInit("updateUserJwt", this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            if (!this.this$0.isInitialized()) {
                throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
            }
            this.this$0.getJwtTokenStore().putJwt(this.$externalId, this.$token);
            this.this$0.getOperationRepo().forceExecuteOperations();
            return q7.v.f40183a;
        }
    }

    public static final class Q extends i implements E7.a {
        public Q() {
            super(0);
        }

        @Override // E7.a
        public final L5.a invoke() {
            return (L5.a) c.this.services.getService(L5.a.class);
        }
    }

    public static final class R extends i implements E7.a {

        public static final class a extends i implements E7.a {
            final /* synthetic */ Context $appContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$appContext = context;
            }

            @Override // E7.a
            public final Context invoke() {
                return this.$appContext;
            }
        }

        public R() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.l invoke() {
            Context appContext = ((t4.f) c.this.services.getService(t4.f.class)).getAppContext();
            return new com.onesignal.user.internal.l(c.this.getPreferencesService(), c.this.getOperationRepo(), c.this.services, null, c.this.getIdentityModelStore(), c.this.getPropertiesModelStore(), c.this.getSubscriptionModelStore(), c.this.getConfigModel(), null, com.onesignal.common.c.INSTANCE.getCarrierName(appContext), Build.VERSION.RELEASE, null, new a(appContext), 2312, null);
        }
    }

    public static final class S extends h implements p {
        final /* synthetic */ String $operationName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(String str, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$operationName = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new S(this.$operationName, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((S) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                c cVar = c.this;
                String str = this.$operationName;
                this.label = 1;
                if (cVar.waitUntilInitInternal(str, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return q7.v.f40183a;
        }
    }

    public static final class T extends AbstractC5219c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public T(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.waitUntilInitInternal(null, this);
        }
    }

    /* renamed from: com.onesignal.internal.c$a, reason: case insensitive filesystem */
    public static final class C4425a extends h implements p {
        final /* synthetic */ E7.a $getter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4425a(E7.a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$getter = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4425a(this.$getter, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4425a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            E7.a aVar = this.$getter;
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$b, reason: case insensitive filesystem */
    public static final class C4426b extends i implements E7.a {
        public C4426b() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.core.internal.config.b invoke() {
            return (com.onesignal.core.internal.config.b) ((com.onesignal.core.internal.config.c) c.this.services.getService(com.onesignal.core.internal.config.c.class)).getModel();
        }
    }

    /* renamed from: com.onesignal.internal.c$c, reason: collision with other inner class name */
    public static final class C0215c extends i implements E7.a {
        public C0215c() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$d, reason: case insensitive filesystem */
    public static final class C4427d extends i implements E7.a {
        public C4427d() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$e, reason: case insensitive filesystem */
    public static final class C4428e extends i implements E7.a {
        public C4428e() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$f, reason: case insensitive filesystem */
    public static final class C4429f extends i implements E7.a {
        public C4429f() {
            super(0);
        }

        @Override // E7.a
        public final z4.e invoke() {
            return (z4.e) c.this.services.getService(z4.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$g, reason: case insensitive filesystem */
    public static final class C4430g extends h implements p {
        int label;

        public C4430g(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4430g(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4430g) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$h, reason: case insensitive filesystem */
    public static final class C4431h extends h implements p {
        int label;

        public C4431h(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4431h(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4431h) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$i, reason: case insensitive filesystem */
    public static final class C4432i extends h implements p {
        int label;

        public C4432i(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4432i(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4432i) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$j, reason: case insensitive filesystem */
    public static final class C4433j extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$j$a */
        public static final class a extends i implements E7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // E7.a
            public final K4.j invoke() {
                return (K4.j) this.this$0.services.getService(K4.j.class);
            }
        }

        public C4433j(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4433j(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4433j) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$k, reason: case insensitive filesystem */
    public static final class C4434k extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$k$a */
        public static final class a extends i implements E7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // E7.a
            public final W4.a invoke() {
                return (W4.a) this.this$0.services.getService(W4.a.class);
            }
        }

        public C4434k(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4434k(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4434k) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$l, reason: case insensitive filesystem */
    public static final class C4435l extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$l$a */
        public static final class a extends i implements E7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // E7.a
            public final n invoke() {
                return (n) this.this$0.services.getService(n.class);
            }
        }

        public C4435l(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4435l(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4435l) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$m, reason: case insensitive filesystem */
    public static final class C4436m extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$m$a */
        public static final class a extends i implements E7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // E7.a
            public final F5.a invoke() {
                return (F5.a) this.this$0.services.getService(F5.a.class);
            }
        }

        public C4436m(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4436m(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4436m) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$n, reason: case insensitive filesystem */
    public static final class C4437n extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$n$a */
        public static final class a extends i implements E7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // E7.a
            public final L5.a invoke() {
                return (L5.a) this.this$0.services.getService(L5.a.class);
            }
        }

        public C4437n(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4437n(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4437n) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC5179a ? enumC5179a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$o, reason: case insensitive filesystem */
    public static final class C4438o extends i implements E7.a {
        public C4438o() {
            super(0);
        }

        @Override // E7.a
        public final Q5.b invoke() {
            return (Q5.b) c.this.services.getService(Q5.b.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$p, reason: case insensitive filesystem */
    public static final class C4439p extends i implements E7.a {
        public C4439p() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.core.internal.config.impl.c invoke() {
            return (com.onesignal.core.internal.config.impl.c) c.this.services.getService(com.onesignal.core.internal.config.impl.c.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$q, reason: case insensitive filesystem */
    public static final class C4440q extends i implements E7.a {
        public C4440q() {
            super(0);
        }

        @Override // E7.a
        public final K4.j invoke() {
            return (K4.j) c.this.services.getService(K4.j.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$r, reason: case insensitive filesystem */
    public static final class C4441r extends i implements E7.a {
        public C4441r() {
            super(0);
        }

        @Override // E7.a
        public final z4.e invoke() {
            return (z4.e) c.this.services.getService(z4.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$s, reason: case insensitive filesystem */
    public static final class C4442s extends h implements l {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4442s(Context context, String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return c.this.new C4442s(this.$context, this.$appId, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            c.this.internalInit(this.$context, this.$appId);
            return q7.v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C4442s) create(interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }
    }

    /* renamed from: com.onesignal.internal.c$t, reason: case insensitive filesystem */
    public static final class C4443t extends h implements p {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4443t(Context context, String str, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new C4443t(this.$context, this.$appId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C4443t) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
        }
    }

    public static final class u extends h implements p {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Context context, String str, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new u(this.$context, this.$appId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((u) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0387l interfaceC0387l;
            boolean z8;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                Object obj2 = c.this.initLock;
                c cVar = c.this;
                synchronized (obj2) {
                    try {
                        if (cVar.initState.isSDKAccessible()) {
                            interfaceC0387l = cVar.suspendCompletion;
                            z8 = false;
                        } else {
                            cVar.initState = a.IN_PROGRESS;
                            cVar.suspendCompletion = AbstractC0399y.a();
                            cVar.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                            interfaceC0387l = null;
                            z8 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z8) {
                    return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
                }
                com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
                kotlin.jvm.internal.h.b(interfaceC0387l);
                this.label = 1;
                if (((C0388m) interfaceC0387l).U(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return Boolean.valueOf(c.this.initState == a.SUCCESS);
        }
    }

    public static final class v extends i implements E7.a {
        public v() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.jwt.c invoke() {
            return (com.onesignal.user.internal.jwt.c) c.this.services.getService(com.onesignal.user.internal.jwt.c.class);
        }
    }

    public static final class w extends i implements E7.a {
        public w() {
            super(0);
        }

        @Override // E7.a
        public final W4.a invoke() {
            return (W4.a) c.this.services.getService(W4.a.class);
        }
    }

    public static final class x extends h implements l {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(d.a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return c.this.new x(this.$context, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return q7.v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((x) create(interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }
    }

    public static final class y extends h implements p {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(d.a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$context = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return c.this.new y(this.$context, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((y) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return q7.v.f40183a;
        }
    }

    public static final class z extends i implements E7.a {
        public z() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.d invoke() {
            return new com.onesignal.user.internal.d(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getJwtTokenStore(), c.this.loginLogoutLock);
        }
    }

    public c() {
        this(null, 1, null);
    }

    private final <T> T blockingGet(E7.a aVar) {
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                com.onesignal.debug.internal.logging.b.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e6) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not check main thread status (likely in test environment): " + e6.getMessage(), null, 2, null);
        }
        return (T) AbstractC0399y.s(getRuntimeIoDispatcher(), new C4425a(aVar, null));
    }

    private final com.onesignal.core.internal.startup.c bootstrapServices() {
        com.onesignal.core.internal.startup.c cVar = new com.onesignal.core.internal.startup.c(this.services);
        cVar.bootstrap();
        return cVar;
    }

    private final void completeInit(a aVar) {
        if (aVar != a.SUCCESS && aVar != a.FAILED) {
            throw new IllegalArgumentException(("completeInit requires a terminal state, got " + aVar).toString());
        }
        synchronized (this.initLock) {
            this.initState = aVar;
            ((C0388m) this.suspendCompletion).J(q7.v.f40183a);
        }
    }

    private final void ensureApplicationServiceStarted(Context context) {
        if (this.applicationServiceStarted) {
            return;
        }
        synchronized (this.applicationServiceLock) {
            if (this.applicationServiceStarted) {
                return;
            }
            t4.f fVar = (t4.f) this.services.getService(t4.f.class);
            kotlin.jvm.internal.h.c(fVar, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.a) fVar).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar);
            this.applicationServiceStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b getConfigModel() {
        return (com.onesignal.core.internal.config.b) this.configModel$delegate.getValue();
    }

    private final z4.e getFeatureManager() {
        return (z4.e) this.featureManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q5.b getIdentityModelStore() {
        return (Q5.b) this.identityModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.impl.c getIdentityVerificationService() {
        return (com.onesignal.core.internal.config.impl.c) this.identityVerificationService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.jwt.c getJwtTokenStore() {
        return (com.onesignal.user.internal.jwt.c) this.jwtTokenStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.d getLoginHelper() {
        return (com.onesignal.user.internal.d) this.loginHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.e getLogoutHelper() {
        return (com.onesignal.user.internal.e) this.logoutHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D4.f getOperationRepo() {
        return (D4.f) this.operationRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F4.b getPreferencesService() {
        return (F4.b) this.preferencesService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.propertiesModelStore$delegate.getValue();
    }

    private final AbstractC0395u getRuntimeIoDispatcher() {
        return isBackgroundThreadingEnabled() ? com.onesignal.common.threading.b.INSTANCE.getIO() : this.ioDispatcher;
    }

    private final <T> T getServiceWithFeatureGate(E7.a aVar) {
        if (isBackgroundThreadingEnabled()) {
            return (T) waitAndReturn(aVar);
        }
        int i = b.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Must call 'initWithContext' before use");
        }
        if (i == 2) {
            warnIfBlockingOnMainThread(null);
            return (T) waitAndReturn(aVar);
        }
        if (i != 3) {
            if (i == 4) {
                return (T) aVar.invoke();
            }
            throw new B0.c();
        }
        Exception exc = this.initFailureException;
        if (exc != null) {
            throw exc;
        }
        throw new IllegalStateException("Initialization failed. Cannot proceed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V5.e getSubscriptionModelStore() {
        return (V5.e) this.subscriptionModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.l getUserSwitcher() {
        return (com.onesignal.user.internal.l) this.userSwitcher$delegate.getValue();
    }

    private final void initEssentials(Context context) {
        g gVar = new g(context, new C4441r(), null, null, null, null, null, 124, null);
        gVar.initializeFromCachedConfig();
        this.otelManager = gVar;
        F4.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
        ensureApplicationServiceStarted(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalInit(Context context, String str) {
        try {
            if (!AndroidUtils.INSTANCE.isAndroidUserUnlocked(context)) {
                com.onesignal.debug.internal.logging.b.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                completeInit(a.FAILED);
                return false;
            }
            initEssentials(context);
            com.onesignal.core.internal.startup.c bootstrapServices = bootstrapServices();
            g gVar = this.otelManager;
            if (gVar != null) {
                gVar.subscribeToConfigStore((com.onesignal.core.internal.config.c) this.services.getService(com.onesignal.core.internal.config.c.class));
            }
            com.onesignal.user.internal.a resolveAppId = com.onesignal.user.internal.b.resolveAppId(str, getConfigModel(), getPreferencesService());
            if (resolveAppId.getFailed()) {
                IllegalStateException illegalStateException = new IllegalStateException("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().");
                Exception exc = this.initFailureException;
                if (exc != null) {
                    com.bumptech.glide.d.b(exc, illegalStateException);
                }
                com.onesignal.debug.internal.logging.b.warn$default("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().", null, 2, null);
                completeInit(a.FAILED);
                return false;
            }
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            String appId = resolveAppId.getAppId();
            kotlin.jvm.internal.h.b(appId);
            configModel.setAppId(appId);
            boolean forceCreateUser = resolveAppId.getForceCreateUser();
            updateConfig();
            getUserSwitcher().initUser(forceCreateUser);
            bootstrapServices.scheduleStart();
            completeInit(a.SUCCESS);
            return true;
        } catch (Exception e6) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", e6);
            Exception exc2 = this.initFailureException;
            if (exc2 != null) {
                com.bumptech.glide.d.b(exc2, e6);
            }
            completeInit(a.FAILED);
            return false;
        }
    }

    private final boolean isBackgroundThreadingEnabled() {
        if (!this.applicationServiceStarted) {
            return false;
        }
        try {
            return getFeatureManager().isEnabled(z4.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING feature, defaulting to legacy mode.", th);
            return false;
        }
    }

    private static /* synthetic */ void isBackgroundThreadingEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void login$lambda$4(c this$0, d.a context) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(context, "$context");
        AbstractC0399y.s(this$0.getRuntimeIoDispatcher(), this$0.new y(context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$5(c this$0, e.a context) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(context, "$context");
        AbstractC0399y.s(this$0.getRuntimeIoDispatcher(), this$0.new C(context, null));
    }

    private final void requireInitForOperation(String str) {
        int i = b.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(AbstractC5051n.b('\'', "Must call 'initWithContext' before '", str));
        }
        if (i == 2) {
            warnIfBlockingOnMainThread(str);
            waitForInit(str);
        } else {
            if (i != 3) {
                return;
            }
            Exception exc = this.initFailureException;
            if (exc == null) {
                throw new IllegalStateException(AbstractC5051n.b('\'', "Initialization failed before '", str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(E7.a aVar, InterfaceC5133d interfaceC5133d) {
        O o9;
        int i;
        if (interfaceC5133d instanceof O) {
            o9 = (O) interfaceC5133d;
            int i4 = o9.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o9.label = i4 - Integer.MIN_VALUE;
                Object obj = o9.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = o9.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    o9.L$0 = aVar;
                    o9.label = 1;
                    if (suspendUntilInit$default(this, null, o9, 1, null) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (E7.a) o9.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return aVar.invoke();
            }
        }
        o9 = new O(interfaceC5133d);
        Object obj2 = o9.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = o9.label;
        if (i != 0) {
        }
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, InterfaceC5133d interfaceC5133d) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, interfaceC5133d);
        return waitUntilInitInternal == EnumC5179a.f41704n ? waitUntilInitInternal : q7.v.f40183a;
    }

    public static /* synthetic */ Object suspendUntilInit$default(c cVar, String str, InterfaceC5133d interfaceC5133d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cVar.suspendUntilInit(str, interfaceC5133d);
    }

    private final void updateConfig() {
        if (this._consentRequired != null) {
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            Boolean bool = this._consentRequired;
            kotlin.jvm.internal.h.b(bool);
            configModel.setConsentRequired(bool);
        }
        if (this._consentGiven != null) {
            com.onesignal.core.internal.config.b configModel2 = getConfigModel();
            Boolean bool2 = this._consentGiven;
            kotlin.jvm.internal.h.b(bool2);
            configModel2.setConsentGiven(bool2);
        }
        if (this._disableGMSMissingPrompt != null) {
            com.onesignal.core.internal.config.b configModel3 = getConfigModel();
            Boolean bool3 = this._disableGMSMissingPrompt;
            kotlin.jvm.internal.h.b(bool3);
            configModel3.setDisableGMSMissingPrompt(bool3.booleanValue());
        }
    }

    private final <T> T waitAndReturn(E7.a aVar) {
        waitForInit$default(this, null, 1, null);
        return (T) aVar.invoke();
    }

    private final void waitForInit(String str) {
        AbstractC0399y.s(getRuntimeIoDispatcher(), new S(str, null));
    }

    public static /* synthetic */ void waitForInit$default(c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cVar.waitForInit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitUntilInitInternal(String str, InterfaceC5133d interfaceC5133d) {
        T t9;
        int i;
        a aVar;
        InterfaceC0387l interfaceC0387l;
        c cVar;
        long j9;
        String str2;
        if (interfaceC5133d instanceof T) {
            t9 = (T) interfaceC5133d;
            int i4 = t9.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t9.label = i4 - Integer.MIN_VALUE;
                Object obj = t9.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = t9.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    synchronized (this.initLock) {
                        aVar = this.initState;
                        interfaceC0387l = aVar == a.IN_PROGRESS ? this.suspendCompletion : null;
                    }
                    int i9 = b.$EnumSwitchMapping$0[aVar.ordinal()];
                    if (i9 == 1) {
                        throw new IllegalStateException(str != null ? AbstractC5051n.b('\'', "Must call 'initWithContext' before '", str) : "Must call 'initWithContext' before use");
                    }
                    if (i9 != 2) {
                        if (i9 == 3) {
                            Exception exc = this.initFailureException;
                            if (exc != null) {
                                throw exc;
                            }
                            throw new IllegalStateException("Initialization failed. Cannot proceed.");
                        }
                        return q7.v.f40183a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    kotlin.jvm.internal.h.b(interfaceC0387l);
                    t9.L$0 = this;
                    t9.L$1 = str;
                    t9.J$0 = currentTimeMillis;
                    t9.label = 1;
                    if (((C0388m) interfaceC0387l).U(t9) == enumC5179a) {
                        return enumC5179a;
                    }
                    cVar = this;
                    j9 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j9 = t9.J$0;
                    str = (String) t9.L$1;
                    cVar = (c) t9.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j9;
                if (str == null) {
                    str2 = "OneSignalImp initialization completed before '" + str + "' (took " + currentTimeMillis2 + "ms)";
                } else {
                    str2 = "OneSignalImp initialization completed (took " + currentTimeMillis2 + "ms)";
                }
                com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
                if (cVar.initState == a.FAILED) {
                    Exception exc2 = cVar.initFailureException;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    throw new IllegalStateException("Initialization failed. Cannot proceed.");
                }
                return q7.v.f40183a;
            }
        }
        t9 = new T(interfaceC5133d);
        Object obj2 = t9.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = t9.label;
        if (i != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j9;
        if (str == null) {
        }
        com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
        if (cVar.initState == a.FAILED) {
        }
        return q7.v.f40183a;
    }

    public static /* synthetic */ Object waitUntilInitInternal$default(c cVar, String str, InterfaceC5133d interfaceC5133d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cVar.waitUntilInitInternal(str, interfaceC5133d);
    }

    private final void warnIfBlockingOnMainThread(String str) {
        String str2;
        if (isBackgroundThreadingEnabled()) {
            return;
        }
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                if (str == null || (str2 = AbstractC5051n.b('\'', "'", str)) == null) {
                    str2 = "this OneSignal API";
                }
                com.onesignal.debug.internal.logging.b.warn$default(D.y.k("Calling ", str2, " on the main thread while OneSignal initialization is still in progress. This will block the UI thread until init completes (ANR risk on slow devices). Prefer calling from a background thread, or use the suspend API (OneSignal.initWithContextSuspend, OneSignal.getUser(), OneSignal.loginSuspend(), etc.) from a coroutine."), null, 2, null);
            }
        } catch (RuntimeException e6) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not determine main-thread status; skipping ANR-risk warning: " + e6.getMessage(), null, 2, null);
        }
    }

    public void addUserJwtInvalidatedListener(l4.d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("addUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'addUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // r4.b
    public <T> List<T> getAllServices(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        return this.services.getAllServices(c4);
    }

    public boolean getConsentGiven() {
        return isInitialized() ? ((Boolean) blockingGet(new C0215c())).booleanValue() : kotlin.jvm.internal.h.a(this._consentGiven, Boolean.TRUE);
    }

    public boolean getConsentRequired() {
        return isInitialized() ? ((Boolean) blockingGet(new C4427d())).booleanValue() : kotlin.jvm.internal.h.a(this._consentRequired, Boolean.TRUE);
    }

    public I4.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        return isInitialized() ? ((Boolean) blockingGet(new C4428e())).booleanValue() : kotlin.jvm.internal.h.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public K4.j getInAppMessages() {
        return (K4.j) getServiceWithFeatureGate(new C4440q());
    }

    public W4.a getLocation() {
        return (W4.a) getServiceWithFeatureGate(new w());
    }

    @Override // l4.c
    public n getNotifications() {
        return (n) getServiceWithFeatureGate(new F());
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // r4.b
    public <T> T getService(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        return (T) this.services.getService(c4);
    }

    @Override // r4.b
    public <T> T getServiceOrNull(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        return (T) this.services.getServiceOrNull(c4);
    }

    public F5.a getSession() {
        return (F5.a) getServiceWithFeatureGate(new J());
    }

    public L5.a getUser() {
        return (L5.a) getServiceWithFeatureGate(new Q());
    }

    @Override // r4.b
    public <T> boolean hasService(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        return this.services.hasService(c4);
    }

    @Override // l4.c
    public boolean initWithContext(Context context, String appId) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(appId, "appId");
        I4.c cVar = I4.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = a.IN_PROGRESS;
            this.suspendCompletion = AbstractC0399y.a();
            try {
                ensureApplicationServiceStarted(context);
                if (!isBackgroundThreadingEnabled()) {
                    return ((Boolean) AbstractC0399y.s(getRuntimeIoDispatcher(), new C4443t(context, appId, null))).booleanValue();
                }
                com.onesignal.common.threading.c.suspendifyOnIO(new C4442s(context, appId, null));
                return true;
            } catch (Exception e6) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    com.bumptech.glide.d.b(exc, e6);
                }
                completeInit(a.FAILED);
                throw e6;
            }
        }
    }

    public Object initWithContextSuspend(Context context, String str, InterfaceC5133d interfaceC5133d) {
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new u(context, str, null), interfaceC5133d);
    }

    public boolean isInitialized() {
        return this.initState == a.SUCCESS;
    }

    public void login(String externalId) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        login(externalId, null);
    }

    public Object loginSuspend(String str, String str2, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new A(str, str2, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    public void logout() {
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "Calling deprecated logout()");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("logout");
        } else {
            requireInitForOperation("logout");
        }
        e.a switchUser$com_onesignal_core = getLogoutHelper().switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            com.onesignal.common.threading.c.suspendifyOnIO(new B(switchUser$com_onesignal_core, null));
        } else {
            new Thread(new D5.b(15, this, switchUser$com_onesignal_core)).start();
        }
    }

    public Object logoutSuspend(InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new E(null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    public void removeUserJwtInvalidatedListener(l4.d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("removeUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'removeUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    public void setConsentGiven(boolean z8) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z8);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z8));
            if (kotlin.jvm.internal.h.a(bool, Boolean.valueOf(z8)) || !z8) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    public void setConsentRequired(boolean z8) {
        this._consentRequired = Boolean.valueOf(z8);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z8));
        }
    }

    public void setDisableGMSMissingPrompt(boolean z8) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z8);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z8);
        }
    }

    public void updateUserJwt(String externalId, String token) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        kotlin.jvm.internal.h.e(token, "token");
        I4.c cVar = I4.c.DEBUG;
        StringBuilder m8 = CL.m("updateUserJwt(externalId: ", externalId, ", token: ...");
        m8.append(j.g0(token));
        m8.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, m8.toString());
        if (isBackgroundThreadingEnabled()) {
            waitForInit("updateUserJwt");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'updateUserJwt'");
        }
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    public Object updateUserJwtSuspend(String str, String str2, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new P(str, str2, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    public c(AbstractC0395u ioDispatcher) {
        kotlin.jvm.internal.h.e(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
        this.suspendCompletion = AbstractC0399y.a();
        this.initState = a.NOT_STARTED;
        this.sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        this.debug = new J4.a();
        this.operationRepo$delegate = com.bumptech.glide.e.q(new G());
        this.identityModelStore$delegate = com.bumptech.glide.e.q(new C4438o());
        this.propertiesModelStore$delegate = com.bumptech.glide.e.q(new I());
        this.subscriptionModelStore$delegate = com.bumptech.glide.e.q(new N());
        this.preferencesService$delegate = com.bumptech.glide.e.q(new H());
        this.jwtTokenStore$delegate = com.bumptech.glide.e.q(new v());
        this.identityVerificationService$delegate = com.bumptech.glide.e.q(new C4439p());
        List<String> B8 = AbstractC4980k.B("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = B8;
        r4.c cVar = new r4.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = B8.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                kotlin.jvm.internal.h.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((InterfaceC4928a) newInstance);
            } catch (ClassNotFoundException e6) {
                e6.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC4928a) it2.next()).register(cVar);
        }
        this.services = cVar.build();
        this.featureManager$delegate = com.bumptech.glide.e.q(new C4429f());
        this.configModel$delegate = com.bumptech.glide.e.q(new C4426b());
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher$delegate = com.bumptech.glide.e.q(new R());
        this.loginHelper$delegate = com.bumptech.glide.e.q(new z());
        this.logoutHelper$delegate = com.bumptech.glide.e.q(new D());
    }

    public Object getInAppMessages(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4433j(null), interfaceC5133d);
    }

    public Object getLocation(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4434k(null), interfaceC5133d);
    }

    public Object getNotifications(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4435l(null), interfaceC5133d);
    }

    public Object getSession(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4436m(null), interfaceC5133d);
    }

    public Object getUser(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4437n(null), interfaceC5133d);
    }

    @Override // l4.c
    public void login(String externalId, String str) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        I4.c cVar = I4.c.DEBUG;
        StringBuilder m8 = CL.m("Calling deprecated login(externalId: ", externalId, ", jwtBearerToken: ...");
        m8.append(str != null ? j.g0(str) : null);
        m8.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, m8.toString());
        if (isBackgroundThreadingEnabled()) {
            waitForInit("login");
        } else {
            requireInitForOperation("login");
        }
        d.a switchUser$com_onesignal_core = getLoginHelper().switchUser$com_onesignal_core(externalId, str);
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            com.onesignal.common.threading.c.suspendifyOnIO(new x(switchUser$com_onesignal_core, null));
        } else {
            new Thread(new D5.b(16, this, switchUser$com_onesignal_core)).start();
        }
    }

    public Object getConsentGiven(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4430g(null), interfaceC5133d);
    }

    public Object getConsentRequired(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4431h(null), interfaceC5133d);
    }

    public Object getDisableGMSMissingPrompt(InterfaceC5133d interfaceC5133d) {
        return AbstractC0399y.y(getRuntimeIoDispatcher(), new C4432i(null), interfaceC5133d);
    }

    public Object setConsentRequired(boolean z8, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new L(z8, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    public Object setDisableGMSMissingPrompt(boolean z8, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new M(z8, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    public Object setConsentGiven(boolean z8, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(getRuntimeIoDispatcher(), new K(z8, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    @Override // l4.c
    public Object initWithContext(Context context, InterfaceC5133d interfaceC5133d) {
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, interfaceC5133d);
    }

    public c(AbstractC0395u abstractC0395u, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? O7.F.f2553c : abstractC0395u);
    }
}
