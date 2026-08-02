package com.plaid.internal;

import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0256p4;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0217l1 extends u8 {
    public static final /* synthetic */ int k = 0;
    public final MutableSharedFlow f;
    public final InterfaceC0329x6 g;
    public final T3 h;
    public final i8 i;
    public C0247o4 j;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", f = "HeadlessOAuthViewModel.kt", l = {50, 62}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.l1$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ r8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r8 r8Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = r8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0217l1.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0217l1.this.new a(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
        
            if (r11 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0217l1 c0217l1 = C0217l1.this;
                r8 r8Var = this.c;
                this.a = 1;
                obj = c0217l1.a(r8Var, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
            if (!pane$PaneRendering.hasHeadlessOAuth()) {
                String str = "Pane rendering must be headless oauth. was " + pane$PaneRendering.getRenderingCase();
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                throw new D2(str);
            }
            HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering headlessOAuth = pane$PaneRendering.getHeadlessOAuth();
            C0217l1 c0217l12 = C0217l1.this;
            headlessOAuth.getEvents();
            c0217l12.getClass();
            C0217l1 c0217l13 = C0217l1.this;
            i8 c = c0217l13.c();
            C0326x3 a = C0217l1.this.a();
            C0256p4 a2 = C0217l1.a(C0217l1.this, headlessOAuth);
            String oauthStateId = headlessOAuth.getOauthStateId();
            oauthStateId.getClass();
            c0217l13.a(new C0247o4(c, a, a2, oauthStateId, this.c));
            MutableSharedFlow mutableSharedFlow = C0217l1.this.f;
            this.a = 2;
        }
    }

    /* renamed from: com.plaid.internal.l1$b */
    public static abstract class b {

        /* renamed from: com.plaid.internal.l1$b$a */
        public static final class a extends b {
            public final String a;

            public a(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PollOAuthResult(oautStateId=", this.a, ")");
            }
        }

        /* renamed from: com.plaid.internal.l1$b$b, reason: collision with other inner class name */
        public static final class C0054b extends b {
            public final String a;

            public C0054b(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0054b) && Intrinsics.areEqual(this.a, ((C0054b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowLogin(loginUrl=", this.a, ")");
            }
        }

        /* renamed from: com.plaid.internal.l1$b$c */
        public static final class c extends b {
            public final String a;

            public c(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitRedirectUri(redirectUri=", this.a, ")");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217l1(r8 r8Var, J4 j4) {
        super(r8Var, j4);
        r8Var.getClass();
        j4.getClass();
        this.f = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        C0225m0 a2 = j4.a();
        C0243o0 c0243o0 = a2.a;
        C0234n0 c0234n0 = a2.b;
        this.c = (InterfaceC0298u2) c0234n0.n.get();
        this.d = (InterfaceC0338y6) c0234n0.m.get();
        this.e = (C0326x3) c0243o0.d.get();
        this.g = (InterfaceC0329x6) c0234n0.B.get();
        this.h = (T3) c0243o0.j.get();
        E5 e5 = (E5) c0243o0.a.l.get();
        C0230m5 c0230m5 = (C0230m5) c0243o0.a.m.get();
        e5.getClass();
        c0230m5.getClass();
        EnumC0203j5 b2 = c0230m5.b();
        b2.getClass();
        int i = C0212k5.a[b2.ordinal()];
        String str = "https://production.plaid.com/";
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = e5.a(str, new G5(null, 3)).create(i8.class);
        create.getClass();
        this.i = (i8) create;
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(r8Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0217l1 c0217l1, Pane$PaneRendering pane$PaneRendering, ContinuationImpl continuationImpl) {
        C0244o1 c0244o1;
        int i;
        String str;
        Pane$PaneRendering pane$PaneRendering2;
        String str2;
        c0217l1.getClass();
        if (continuationImpl instanceof C0244o1) {
            c0244o1 = (C0244o1) continuationImpl;
            int i2 = c0244o1.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0244o1.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0244o1.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0244o1.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    T3 t3 = c0217l1.h;
                    if (t3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                        throw null;
                    }
                    String str3 = c0217l1.a.b;
                    c0244o1.a = c0217l1;
                    c0244o1.b = pane$PaneRendering;
                    c0244o1.e = 1;
                    obj = t3.a(str3, "login_url", c0244o1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pane$PaneRendering2 = (Pane$PaneRendering) c0244o1.a;
                        SafeTrace.throwOnFailure(obj);
                        str2 = (String) obj;
                        if (str2 == null && str2.length() != 0) {
                            return new b.c(str2);
                        }
                        String oauthStateId = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                        oauthStateId.getClass();
                        return new b.a(oauthStateId);
                    }
                    pane$PaneRendering = c0244o1.b;
                    c0217l1 = (C0217l1) c0244o1.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    String loginUri = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
                    loginUri.getClass();
                    return new b.C0054b(loginUri);
                }
                InterfaceC0329x6 interfaceC0329x6 = c0217l1.g;
                if (interfaceC0329x6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readOAuthRedirectUri");
                    throw null;
                }
                c0244o1.a = pane$PaneRendering;
                c0244o1.b = null;
                c0244o1.e = 2;
                obj = interfaceC0329x6.a(c0244o1);
                if (obj != coroutineSingletons) {
                    pane$PaneRendering2 = pane$PaneRendering;
                    str2 = (String) obj;
                    if (str2 == null) {
                    }
                    String oauthStateId2 = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                    oauthStateId2.getClass();
                    return new b.a(oauthStateId2);
                }
                return coroutineSingletons;
            }
        }
        c0244o1 = new C0244o1(c0217l1, continuationImpl);
        Object obj2 = c0244o1.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0244o1.e;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        String loginUri2 = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
        loginUri2.getClass();
        return new b.C0054b(loginUri2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0217l1 c0217l1, String str, ContinuationImpl continuationImpl) {
        C0262q1 c0262q1;
        int i;
        c0217l1.getClass();
        if (continuationImpl instanceof C0262q1) {
            c0262q1 = (C0262q1) continuationImpl;
            int i2 = c0262q1.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0262q1.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0262q1.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0262q1.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C0095a6.a.getClass();
                    C0095a6.a.a("Poll for oAuth result", true);
                    C0247o4 c0247o4 = c0217l1.j;
                    if (c0247o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("oAuthPolling");
                        throw null;
                    }
                    c0262q1.a = c0217l1;
                    c0262q1.b = str;
                    c0262q1.e = 1;
                    if (c0247o4.a(c0262q1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = c0262q1.b;
                    c0217l1 = c0262q1.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str.getClass();
                HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a2 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(str));
                a2.getClass();
                a(c0217l1, a2);
                return Unit.INSTANCE;
            }
        }
        c0262q1 = new C0262q1(c0217l1, continuationImpl);
        Object obj2 = c0262q1.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0262q1.e;
        if (i != 0) {
        }
        str.getClass();
        HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a22 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(str));
        a22.getClass();
        a(c0217l1, a22);
        return Unit.INSTANCE;
    }

    public final i8 c() {
        i8 i8Var = this.i;
        if (i8Var != null) {
            return i8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0226m1 c0226m1;
        int i;
        if (continuationImpl instanceof C0226m1) {
            c0226m1 = (C0226m1) continuationImpl;
            int i2 = c0226m1.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0226m1.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0226m1.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0226m1.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.f;
                    C0235n1 c0235n1 = new C0235n1(this);
                    c0226m1.c = 1;
                    if (mutableSharedFlow.collect(c0235n1, c0226m1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            }
        }
        c0226m1 = new C0226m1(this, continuationImpl);
        Object obj2 = c0226m1.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0226m1.c;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
        return null;
    }

    public static final C0256p4 a(C0217l1 c0217l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        c0217l1.getClass();
        Common$PollingOptions polling = rendering.getPolling();
        polling.getClass();
        return C0256p4.a.a(polling);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0217l1 c0217l1, String str, ContinuationImpl continuationImpl) {
        C0253p1 c0253p1;
        int i;
        InterfaceC0298u2 interfaceC0298u2;
        c0217l1.getClass();
        if (continuationImpl instanceof C0253p1) {
            c0253p1 = (C0253p1) continuationImpl;
            int i2 = c0253p1.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0253p1.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0253p1.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0253p1.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C0095a6.a.getClass();
                    C0095a6.a.a("Opening login URL", true);
                    T3 t3 = c0217l1.h;
                    if (t3 != null) {
                        String str2 = c0217l1.a.b;
                        c0253p1.a = c0217l1;
                        c0253p1.b = str;
                        c0253p1.e = 1;
                        if (t3.a(str2, "login_url", str, c0253p1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = c0253p1.b;
                    c0217l1 = c0253p1.a;
                    SafeTrace.throwOnFailure(obj);
                }
                interfaceC0298u2 = c0217l1.c;
                if (interfaceC0298u2 == null) {
                    interfaceC0298u2.a(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("linkController");
                throw null;
            }
        }
        c0253p1 = new C0253p1(c0217l1, continuationImpl);
        Object obj2 = c0253p1.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0253p1.e;
        if (i != 0) {
        }
        interfaceC0298u2 = c0217l1.c;
        if (interfaceC0298u2 == null) {
        }
    }

    public static void a(C0217l1 c0217l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b bVar) {
        String str = c0217l1.a.c;
        Pane$PaneOutput.a a2 = Pane$PaneOutput.newBuilder().a(bVar);
        a2.getClass();
        str.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(c0217l1), null, null, new t8(null, c0217l1, a2, str, null), 3);
    }

    public final void a(C0247o4 c0247o4) {
        c0247o4.getClass();
        this.j = c0247o4;
    }
}
