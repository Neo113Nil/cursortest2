package com.onesignal.internal;

import B7.h;
import I7.l;
import I7.p;
import Q7.j;
import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C0395m;
import S7.InterfaceC0394l;
import S7.InterfaceC0404w;
import a.AbstractC0422a;
import a5.InterfaceC0437a;
import android.content.Context;
import android.os.Build;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import i5.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import u4.InterfaceC5079a;
import u7.InterfaceC5087e;
import v7.AbstractC5130k;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c implements p4.c, v4.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;
    private final InterfaceC5087e configModel$delegate;
    private final M4.a debug;
    private final InterfaceC5087e featureManager$delegate;
    private final InterfaceC5087e identityModelStore$delegate;
    private final InterfaceC5087e identityVerificationService$delegate;
    private Exception initFailureException;
    private final Object initLock;
    private volatile a initState;
    private final AbstractC0402u ioDispatcher;
    private final InterfaceC5087e jwtTokenStore$delegate;
    private final List<String> listOfModules;
    private final InterfaceC5087e loginHelper$delegate;
    private final Object loginLogoutLock;
    private final InterfaceC5087e logoutHelper$delegate;
    private final InterfaceC5087e operationRepo$delegate;
    private g otelManager;
    private final InterfaceC5087e preferencesService$delegate;
    private final InterfaceC5087e propertiesModelStore$delegate;
    private final String sdkVersion;
    private final v4.d services;
    private final InterfaceC5087e subscriptionModelStore$delegate;
    private volatile InterfaceC0394l suspendCompletion;
    private final InterfaceC5087e userSwitcher$delegate;

    public static final class A extends h implements p {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $jwtBearerToken;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str, String str2, c cVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$externalId = str;
            this.$jwtBearerToken = str2;
            this.this$0 = cVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new A(this.$externalId, this.$jwtBearerToken, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((A) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r7.suspendUntilInit("login", r6) == r0) goto L23;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            u7.v vVar = u7.v.f41353a;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                M4.c cVar = M4.c.DEBUG;
                StringBuilder sb = new StringBuilder("login(externalId: ");
                sb.append(this.$externalId);
                sb.append(", jwtBearerToken: ...");
                String str = this.$jwtBearerToken;
                sb.append(str != null ? j.p0(str) : null);
                sb.append(')');
                com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
                c cVar2 = this.this$0;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                    return vVar;
                }
                com.bumptech.glide.d.k(obj);
            }
            d.a switchUser$com_onesignal_core = this.this$0.getLoginHelper().switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
            if (switchUser$com_onesignal_core != null) {
                com.onesignal.user.internal.d loginHelper = this.this$0.getLoginHelper();
                this.label = 2;
                if (loginHelper.enqueueLogin$com_onesignal_core(switchUser$com_onesignal_core, this) == aVar) {
                    return aVar;
                }
            }
            return vVar;
        }
    }

    public static final class B extends h implements l {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(e.a aVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return c.this.new B(this.$context, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return u7.v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((B) create(interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }
    }

    public static final class C extends h implements p {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(e.a aVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$context = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C(this.$context, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return u7.v.f41353a;
        }
    }

    public static final class D extends i implements I7.a {
        public D() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.e invoke() {
            return new com.onesignal.user.internal.e(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getSubscriptionModelStore(), c.this.getIdentityVerificationService(), c.this.loginLogoutLock);
        }
    }

    public static final class E extends h implements p {
        int label;

        public E(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new E(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((E) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "logoutSuspend()");
                c cVar = c.this;
                this.label = 1;
                if (cVar.suspendUntilInit("logout", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            e.a switchUser$com_onesignal_core = c.this.getLogoutHelper().switchUser$com_onesignal_core();
            u7.v vVar = u7.v.f41353a;
            if (switchUser$com_onesignal_core == null) {
                return vVar;
            }
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
            return vVar;
        }
    }

    public static final class F extends i implements I7.a {
        public F() {
            super(0);
        }

        @Override // I7.a
        public final n invoke() {
            return (n) c.this.services.getService(n.class);
        }
    }

    public static final class G extends i implements I7.a {
        public G() {
            super(0);
        }

        @Override // I7.a
        public final H4.f invoke() {
            return (H4.f) c.this.services.getService(H4.f.class);
        }
    }

    public static final class H extends i implements I7.a {
        public H() {
            super(0);
        }

        @Override // I7.a
        public final J4.b invoke() {
            return (J4.b) c.this.services.getService(J4.b.class);
        }
    }

    public static final class I extends i implements I7.a {
        public I() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.properties.b invoke() {
            return (com.onesignal.user.internal.properties.b) c.this.services.getService(com.onesignal.user.internal.properties.b.class);
        }
    }

    public static final class J extends i implements I7.a {
        public J() {
            super(0);
        }

        @Override // I7.a
        public final J5.a invoke() {
            return (J5.a) c.this.services.getService(J5.a.class);
        }
    }

    public static final class K extends h implements p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(boolean z3, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$value = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new K(this.$value, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((K) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            Boolean bool = c.this._consentGiven;
            c.this._consentGiven = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setConsentGiven(Boolean.valueOf(this.$value));
            if (!kotlin.jvm.internal.h.a(bool, Boolean.valueOf(this.$value)) && this.$value) {
                c.this.getOperationRepo().forceExecuteOperations();
            }
            return u7.v.f41353a;
        }
    }

    public static final class L extends h implements p {
        final /* synthetic */ boolean $required;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(boolean z3, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$required = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new L(this.$required, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((L) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this._consentRequired = Boolean.valueOf(this.$required);
            c.this.getConfigModel().setConsentRequired(Boolean.valueOf(this.$required));
            return u7.v.f41353a;
        }
    }

    public static final class M extends h implements p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(boolean z3, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$value = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new M(this.$value, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((M) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this._disableGMSMissingPrompt = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setDisableGMSMissingPrompt(this.$value);
            return u7.v.f41353a;
        }
    }

    public static final class N extends i implements I7.a {
        public N() {
            super(0);
        }

        @Override // I7.a
        public final Z5.e invoke() {
            return (Z5.e) c.this.services.getService(Z5.e.class);
        }
    }

    public static final class O extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public O(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
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
        public P(String str, String str2, c cVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$externalId = str;
            this.$token = str2;
            this.this$0 = cVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new P(this.$externalId, this.$token, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((P) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + j.p0(this.$token) + ')');
                c cVar = this.this$0;
                this.label = 1;
                if (cVar.suspendUntilInit("updateUserJwt", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            if (!this.this$0.isInitialized()) {
                throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
            }
            this.this$0.getJwtTokenStore().putJwt(this.$externalId, this.$token);
            this.this$0.getOperationRepo().forceExecuteOperations();
            return u7.v.f41353a;
        }
    }

    public static final class Q extends i implements I7.a {
        public Q() {
            super(0);
        }

        @Override // I7.a
        public final P5.a invoke() {
            return (P5.a) c.this.services.getService(P5.a.class);
        }
    }

    public static final class R extends i implements I7.a {

        public static final class a extends i implements I7.a {
            final /* synthetic */ Context $appContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$appContext = context;
            }

            @Override // I7.a
            public final Context invoke() {
                return this.$appContext;
            }
        }

        public R() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.l invoke() {
            Context appContext = ((x4.f) c.this.services.getService(x4.f.class)).getAppContext();
            return new com.onesignal.user.internal.l(c.this.getPreferencesService(), c.this.getOperationRepo(), c.this.services, null, c.this.getIdentityModelStore(), c.this.getPropertiesModelStore(), c.this.getSubscriptionModelStore(), c.this.getConfigModel(), null, com.onesignal.common.c.INSTANCE.getCarrierName(appContext), Build.VERSION.RELEASE, null, new a(appContext), 2312, null);
        }
    }

    public static final class S extends h implements p {
        final /* synthetic */ String $operationName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(String str, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$operationName = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new S(this.$operationName, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((S) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                c cVar = c.this;
                String str = this.$operationName;
                this.label = 1;
                if (cVar.waitUntilInitInternal(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41353a;
        }
    }

    public static final class T extends B7.c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public T(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.waitUntilInitInternal(null, this);
        }
    }

    /* renamed from: com.onesignal.internal.c$a, reason: case insensitive filesystem */
    public static final class C4413a extends h implements p {
        final /* synthetic */ I7.a $getter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4413a(I7.a aVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$getter = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4413a(this.$getter, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4413a) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            I7.a aVar2 = this.$getter;
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$b, reason: case insensitive filesystem */
    public static final class C4414b extends i implements I7.a {
        public C4414b() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.core.internal.config.b invoke() {
            return (com.onesignal.core.internal.config.b) ((com.onesignal.core.internal.config.c) c.this.services.getService(com.onesignal.core.internal.config.c.class)).getModel();
        }
    }

    /* renamed from: com.onesignal.internal.c$c, reason: collision with other inner class name */
    public static final class C0216c extends i implements I7.a {
        public C0216c() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$d, reason: case insensitive filesystem */
    public static final class C4415d extends i implements I7.a {
        public C4415d() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$e, reason: case insensitive filesystem */
    public static final class C4416e extends i implements I7.a {
        public C4416e() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$f, reason: case insensitive filesystem */
    public static final class C4417f extends i implements I7.a {
        public C4417f() {
            super(0);
        }

        @Override // I7.a
        public final D4.e invoke() {
            return (D4.e) c.this.services.getService(D4.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$g, reason: case insensitive filesystem */
    public static final class C4418g extends h implements p {
        int label;

        public C4418g(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4418g(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4418g) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$h, reason: case insensitive filesystem */
    public static final class C4419h extends h implements p {
        int label;

        public C4419h(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4419h(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4419h) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : kotlin.jvm.internal.h.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$i, reason: case insensitive filesystem */
    public static final class C4420i extends h implements p {
        int label;

        public C4420i(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4420i(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4420i) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$j, reason: case insensitive filesystem */
    public static final class C4421j extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$j$a */
        public static final class a extends i implements I7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // I7.a
            public final O4.j invoke() {
                return (O4.j) this.this$0.services.getService(O4.j.class);
            }
        }

        public C4421j(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4421j(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4421j) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$k, reason: case insensitive filesystem */
    public static final class C4422k extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$k$a */
        public static final class a extends i implements I7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // I7.a
            public final InterfaceC0437a invoke() {
                return (InterfaceC0437a) this.this$0.services.getService(InterfaceC0437a.class);
            }
        }

        public C4422k(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4422k(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4422k) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$l, reason: case insensitive filesystem */
    public static final class C4423l extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$l$a */
        public static final class a extends i implements I7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // I7.a
            public final n invoke() {
                return (n) this.this$0.services.getService(n.class);
            }
        }

        public C4423l(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4423l(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4423l) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$m, reason: case insensitive filesystem */
    public static final class C4424m extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$m$a */
        public static final class a extends i implements I7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // I7.a
            public final J5.a invoke() {
                return (J5.a) this.this$0.services.getService(J5.a.class);
            }
        }

        public C4424m(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4424m(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4424m) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$n, reason: case insensitive filesystem */
    public static final class C4425n extends h implements p {
        int label;

        /* renamed from: com.onesignal.internal.c$n$a */
        public static final class a extends i implements I7.a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // I7.a
            public final P5.a invoke() {
                return (P5.a) this.this$0.services.getService(P5.a.class);
            }
        }

        public C4425n(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4425n(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4425n) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$o, reason: case insensitive filesystem */
    public static final class C4426o extends i implements I7.a {
        public C4426o() {
            super(0);
        }

        @Override // I7.a
        public final U5.b invoke() {
            return (U5.b) c.this.services.getService(U5.b.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$p, reason: case insensitive filesystem */
    public static final class C4427p extends i implements I7.a {
        public C4427p() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.core.internal.config.impl.c invoke() {
            return (com.onesignal.core.internal.config.impl.c) c.this.services.getService(com.onesignal.core.internal.config.impl.c.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$q, reason: case insensitive filesystem */
    public static final class C4428q extends i implements I7.a {
        public C4428q() {
            super(0);
        }

        @Override // I7.a
        public final O4.j invoke() {
            return (O4.j) c.this.services.getService(O4.j.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$r, reason: case insensitive filesystem */
    public static final class C4429r extends i implements I7.a {
        public C4429r() {
            super(0);
        }

        @Override // I7.a
        public final D4.e invoke() {
            return (D4.e) c.this.services.getService(D4.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$s, reason: case insensitive filesystem */
    public static final class C4430s extends h implements l {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4430s(Context context, String str, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return c.this.new C4430s(this.$context, this.$appId, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this.internalInit(this.$context, this.$appId);
            return u7.v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((C4430s) create(interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }
    }

    /* renamed from: com.onesignal.internal.c$t, reason: case insensitive filesystem */
    public static final class C4431t extends h implements p {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4431t(Context context, String str, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new C4431t(this.$context, this.$appId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C4431t) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
        }
    }

    public static final class u extends h implements p {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Context context, String str, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new u(this.$context, this.$appId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((u) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0394l interfaceC0394l;
            boolean z3;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                Object obj2 = c.this.initLock;
                c cVar = c.this;
                synchronized (obj2) {
                    try {
                        if (cVar.initState.isSDKAccessible()) {
                            interfaceC0394l = cVar.suspendCompletion;
                            z3 = false;
                        } else {
                            cVar.initState = a.IN_PROGRESS;
                            cVar.suspendCompletion = AbstractC0406y.a();
                            cVar.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                            interfaceC0394l = null;
                            z3 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z3) {
                    return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
                }
                com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
                kotlin.jvm.internal.h.b(interfaceC0394l);
                this.label = 1;
                if (((C0395m) interfaceC0394l).U(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return Boolean.valueOf(c.this.initState == a.SUCCESS);
        }
    }

    public static final class v extends i implements I7.a {
        public v() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.jwt.c invoke() {
            return (com.onesignal.user.internal.jwt.c) c.this.services.getService(com.onesignal.user.internal.jwt.c.class);
        }
    }

    public static final class w extends i implements I7.a {
        public w() {
            super(0);
        }

        @Override // I7.a
        public final InterfaceC0437a invoke() {
            return (InterfaceC0437a) c.this.services.getService(InterfaceC0437a.class);
        }
    }

    public static final class x extends h implements l {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(d.a aVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return c.this.new x(this.$context, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar2 = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((x) create(interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }
    }

    public static final class y extends h implements p {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(d.a aVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$context = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return c.this.new y(this.$context, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((y) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar2 = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return u7.v.f41353a;
        }
    }

    public static final class z extends i implements I7.a {
        public z() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.d invoke() {
            return new com.onesignal.user.internal.d(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getJwtTokenStore(), c.this.loginLogoutLock);
        }
    }

    public c() {
        this(null, 1, null);
    }

    private final <T> T blockingGet(I7.a aVar) {
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                com.onesignal.debug.internal.logging.b.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e9) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not check main thread status (likely in test environment): " + e9.getMessage(), null, 2, null);
        }
        return (T) AbstractC0406y.s(getRuntimeIoDispatcher(), new C4413a(aVar, null));
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
            ((C0395m) this.suspendCompletion).J(u7.v.f41353a);
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
            x4.f fVar = (x4.f) this.services.getService(x4.f.class);
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

    private final D4.e getFeatureManager() {
        return (D4.e) this.featureManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U5.b getIdentityModelStore() {
        return (U5.b) this.identityModelStore$delegate.getValue();
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
    public final H4.f getOperationRepo() {
        return (H4.f) this.operationRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J4.b getPreferencesService() {
        return (J4.b) this.preferencesService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.propertiesModelStore$delegate.getValue();
    }

    private final AbstractC0402u getRuntimeIoDispatcher() {
        return isBackgroundThreadingEnabled() ? com.onesignal.common.threading.b.INSTANCE.getIO() : this.ioDispatcher;
    }

    private final <T> T getServiceWithFeatureGate(I7.a aVar) {
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
    public final Z5.e getSubscriptionModelStore() {
        return (Z5.e) this.subscriptionModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.l getUserSwitcher() {
        return (com.onesignal.user.internal.l) this.userSwitcher$delegate.getValue();
    }

    private final void initEssentials(Context context) {
        g gVar = new g(context, new C4429r(), null, null, null, null, null, 124, null);
        gVar.initializeFromCachedConfig();
        this.otelManager = gVar;
        J4.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
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
                    X2.e.y(exc, illegalStateException);
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
        } catch (Exception e9) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", e9);
            Exception exc2 = this.initFailureException;
            if (exc2 != null) {
                X2.e.y(exc2, e9);
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
            return getFeatureManager().isEnabled(D4.b.SDK_BACKGROUND_THREADING);
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
        AbstractC0406y.s(this$0.getRuntimeIoDispatcher(), this$0.new y(context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$5(c this$0, e.a context) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(context, "$context");
        AbstractC0406y.s(this$0.getRuntimeIoDispatcher(), this$0.new C(context, null));
    }

    private final void requireInitForOperation(String str) {
        int i = b.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(u1.h.b('\'', "Must call 'initWithContext' before '", str));
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
                throw new IllegalStateException(u1.h.b('\'', "Initialization failed before '", str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(I7.a aVar, InterfaceC5267d interfaceC5267d) {
        O o6;
        int i;
        if (interfaceC5267d instanceof O) {
            o6 = (O) interfaceC5267d;
            int i6 = o6.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                o6.label = i6 - Integer.MIN_VALUE;
                Object obj = o6.result;
                A7.a aVar2 = A7.a.f58n;
                i = o6.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    o6.L$0 = aVar;
                    o6.label = 1;
                    if (suspendUntilInit$default(this, null, o6, 1, null) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (I7.a) o6.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return aVar.invoke();
            }
        }
        o6 = new O(interfaceC5267d);
        Object obj2 = o6.result;
        A7.a aVar22 = A7.a.f58n;
        i = o6.label;
        if (i != 0) {
        }
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, InterfaceC5267d interfaceC5267d) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, interfaceC5267d);
        return waitUntilInitInternal == A7.a.f58n ? waitUntilInitInternal : u7.v.f41353a;
    }

    public static /* synthetic */ Object suspendUntilInit$default(c cVar, String str, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cVar.suspendUntilInit(str, interfaceC5267d);
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

    private final <T> T waitAndReturn(I7.a aVar) {
        waitForInit$default(this, null, 1, null);
        return (T) aVar.invoke();
    }

    private final void waitForInit(String str) {
        AbstractC0406y.s(getRuntimeIoDispatcher(), new S(str, null));
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
    public final Object waitUntilInitInternal(String str, InterfaceC5267d interfaceC5267d) {
        T t6;
        int i;
        a aVar;
        InterfaceC0394l interfaceC0394l;
        c cVar;
        long j6;
        String str2;
        if (interfaceC5267d instanceof T) {
            t6 = (T) interfaceC5267d;
            int i6 = t6.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                t6.label = i6 - Integer.MIN_VALUE;
                Object obj = t6.result;
                A7.a aVar2 = A7.a.f58n;
                i = t6.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    synchronized (this.initLock) {
                        aVar = this.initState;
                        interfaceC0394l = aVar == a.IN_PROGRESS ? this.suspendCompletion : null;
                    }
                    int i9 = b.$EnumSwitchMapping$0[aVar.ordinal()];
                    if (i9 == 1) {
                        throw new IllegalStateException(str != null ? u1.h.b('\'', "Must call 'initWithContext' before '", str) : "Must call 'initWithContext' before use");
                    }
                    if (i9 != 2) {
                        if (i9 == 3) {
                            Exception exc = this.initFailureException;
                            if (exc != null) {
                                throw exc;
                            }
                            throw new IllegalStateException("Initialization failed. Cannot proceed.");
                        }
                        return u7.v.f41353a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    kotlin.jvm.internal.h.b(interfaceC0394l);
                    t6.L$0 = this;
                    t6.L$1 = str;
                    t6.J$0 = currentTimeMillis;
                    t6.label = 1;
                    if (((C0395m) interfaceC0394l).U(t6) == aVar2) {
                        return aVar2;
                    }
                    cVar = this;
                    j6 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = t6.J$0;
                    str = (String) t6.L$1;
                    cVar = (c) t6.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j6;
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
                return u7.v.f41353a;
            }
        }
        t6 = new T(interfaceC5267d);
        Object obj2 = t6.result;
        A7.a aVar22 = A7.a.f58n;
        i = t6.label;
        if (i != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j6;
        if (str == null) {
        }
        com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
        if (cVar.initState == a.FAILED) {
        }
        return u7.v.f41353a;
    }

    public static /* synthetic */ Object waitUntilInitInternal$default(c cVar, String str, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cVar.waitUntilInitInternal(str, interfaceC5267d);
    }

    private final void warnIfBlockingOnMainThread(String str) {
        String str2;
        if (isBackgroundThreadingEnabled()) {
            return;
        }
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                if (str == null || (str2 = u1.h.b('\'', "'", str)) == null) {
                    str2 = "this OneSignal API";
                }
                com.onesignal.debug.internal.logging.b.warn$default(D.y.o("Calling ", str2, " on the main thread while OneSignal initialization is still in progress. This will block the UI thread until init completes (ANR risk on slow devices). Prefer calling from a background thread, or use the suspend API (OneSignal.initWithContextSuspend, OneSignal.getUser(), OneSignal.loginSuspend(), etc.) from a coroutine."), null, 2, null);
            }
        } catch (RuntimeException e9) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not determine main-thread status; skipping ANR-risk warning: " + e9.getMessage(), null, 2, null);
        }
    }

    public void addUserJwtInvalidatedListener(p4.d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("addUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'addUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // v4.b
    public <T> List<T> getAllServices(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        return this.services.getAllServices(c9);
    }

    public boolean getConsentGiven() {
        return isInitialized() ? ((Boolean) blockingGet(new C0216c())).booleanValue() : kotlin.jvm.internal.h.a(this._consentGiven, Boolean.TRUE);
    }

    public boolean getConsentRequired() {
        return isInitialized() ? ((Boolean) blockingGet(new C4415d())).booleanValue() : kotlin.jvm.internal.h.a(this._consentRequired, Boolean.TRUE);
    }

    public M4.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        return isInitialized() ? ((Boolean) blockingGet(new C4416e())).booleanValue() : kotlin.jvm.internal.h.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public O4.j getInAppMessages() {
        return (O4.j) getServiceWithFeatureGate(new C4428q());
    }

    public InterfaceC0437a getLocation() {
        return (InterfaceC0437a) getServiceWithFeatureGate(new w());
    }

    @Override // p4.c
    public n getNotifications() {
        return (n) getServiceWithFeatureGate(new F());
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // v4.b
    public <T> T getService(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        return (T) this.services.getService(c9);
    }

    @Override // v4.b
    public <T> T getServiceOrNull(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        return (T) this.services.getServiceOrNull(c9);
    }

    public J5.a getSession() {
        return (J5.a) getServiceWithFeatureGate(new J());
    }

    public P5.a getUser() {
        return (P5.a) getServiceWithFeatureGate(new Q());
    }

    @Override // v4.b
    public <T> boolean hasService(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        return this.services.hasService(c9);
    }

    @Override // p4.c
    public boolean initWithContext(Context context, String appId) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(appId, "appId");
        M4.c cVar = M4.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = a.IN_PROGRESS;
            this.suspendCompletion = AbstractC0406y.a();
            try {
                ensureApplicationServiceStarted(context);
                if (!isBackgroundThreadingEnabled()) {
                    return ((Boolean) AbstractC0406y.s(getRuntimeIoDispatcher(), new C4431t(context, appId, null))).booleanValue();
                }
                com.onesignal.common.threading.c.suspendifyOnIO(new C4430s(context, appId, null));
                return true;
            } catch (Exception e9) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    X2.e.y(exc, e9);
                }
                completeInit(a.FAILED);
                throw e9;
            }
        }
    }

    public Object initWithContextSuspend(Context context, String str, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new u(context, str, null), interfaceC5267d);
    }

    public boolean isInitialized() {
        return this.initState == a.SUCCESS;
    }

    public void login(String externalId) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        login(externalId, null);
    }

    public Object loginSuspend(String str, String str2, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new A(str, str2, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    public void logout() {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "Calling deprecated logout()");
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
            new Thread(new F.n(14, this, switchUser$com_onesignal_core)).start();
        }
    }

    public Object logoutSuspend(InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new E(null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    public void removeUserJwtInvalidatedListener(p4.d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("removeUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'removeUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    public void setConsentGiven(boolean z3) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z3);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z3));
            if (kotlin.jvm.internal.h.a(bool, Boolean.valueOf(z3)) || !z3) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    public void setConsentRequired(boolean z3) {
        this._consentRequired = Boolean.valueOf(z3);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z3));
        }
    }

    public void setDisableGMSMissingPrompt(boolean z3) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z3);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z3);
        }
    }

    public void updateUserJwt(String externalId, String token) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        kotlin.jvm.internal.h.e(token, "token");
        M4.c cVar = M4.c.DEBUG;
        StringBuilder j6 = AbstractC4404f.j("updateUserJwt(externalId: ", externalId, ", token: ...");
        j6.append(j.p0(token));
        j6.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, j6.toString());
        if (isBackgroundThreadingEnabled()) {
            waitForInit("updateUserJwt");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'updateUserJwt'");
        }
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    public Object updateUserJwtSuspend(String str, String str2, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new P(str, str2, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    public c(AbstractC0402u ioDispatcher) {
        kotlin.jvm.internal.h.e(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
        this.suspendCompletion = AbstractC0406y.a();
        this.initState = a.NOT_STARTED;
        this.sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        this.debug = new N4.a();
        this.operationRepo$delegate = AbstractC0422a.q(new G());
        this.identityModelStore$delegate = AbstractC0422a.q(new C4426o());
        this.propertiesModelStore$delegate = AbstractC0422a.q(new I());
        this.subscriptionModelStore$delegate = AbstractC0422a.q(new N());
        this.preferencesService$delegate = AbstractC0422a.q(new H());
        this.jwtTokenStore$delegate = AbstractC0422a.q(new v());
        this.identityVerificationService$delegate = AbstractC0422a.q(new C4427p());
        List<String> v9 = AbstractC5130k.v("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = v9;
        v4.c cVar = new v4.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = v9.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                kotlin.jvm.internal.h.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((InterfaceC5079a) newInstance);
            } catch (ClassNotFoundException e9) {
                e9.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5079a) it2.next()).register(cVar);
        }
        this.services = cVar.build();
        this.featureManager$delegate = AbstractC0422a.q(new C4417f());
        this.configModel$delegate = AbstractC0422a.q(new C4414b());
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher$delegate = AbstractC0422a.q(new R());
        this.loginHelper$delegate = AbstractC0422a.q(new z());
        this.logoutHelper$delegate = AbstractC0422a.q(new D());
    }

    public Object getInAppMessages(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4421j(null), interfaceC5267d);
    }

    public Object getLocation(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4422k(null), interfaceC5267d);
    }

    public Object getNotifications(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4423l(null), interfaceC5267d);
    }

    public Object getSession(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4424m(null), interfaceC5267d);
    }

    public Object getUser(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4425n(null), interfaceC5267d);
    }

    @Override // p4.c
    public void login(String externalId, String str) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        M4.c cVar = M4.c.DEBUG;
        StringBuilder j6 = AbstractC4404f.j("Calling deprecated login(externalId: ", externalId, ", jwtBearerToken: ...");
        j6.append(str != null ? j.p0(str) : null);
        j6.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, j6.toString());
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
            new Thread(new F.n(15, this, switchUser$com_onesignal_core)).start();
        }
    }

    public Object getConsentGiven(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4418g(null), interfaceC5267d);
    }

    public Object getConsentRequired(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4419h(null), interfaceC5267d);
    }

    public Object getDisableGMSMissingPrompt(InterfaceC5267d interfaceC5267d) {
        return AbstractC0406y.y(getRuntimeIoDispatcher(), new C4420i(null), interfaceC5267d);
    }

    public Object setConsentRequired(boolean z3, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new L(z3, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    public Object setDisableGMSMissingPrompt(boolean z3, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new M(z3, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    public Object setConsentGiven(boolean z3, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(getRuntimeIoDispatcher(), new K(z3, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41353a;
    }

    @Override // p4.c
    public Object initWithContext(Context context, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, interfaceC5267d);
    }

    public c(AbstractC0402u abstractC0402u, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? S7.F.f2917c : abstractC0402u);
    }
}
