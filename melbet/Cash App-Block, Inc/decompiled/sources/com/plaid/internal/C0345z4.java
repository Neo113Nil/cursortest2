package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0345z4 extends ViewModel {
    public final InterfaceC0298u2 a;
    public final C6 b;
    public final InterfaceC0320w6 c;
    public final B6 d;
    public final InterfaceC0347z6 e;
    public final z8 f;
    public final i8 g;
    public final I7 h;
    public final F i;
    public Job j;
    public final C0336y4 k;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$1", f = "OutOfProcessWebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.z4$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0345z4.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0345z4.this.new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                I7 b = C0345z4.this.b();
                this.a = 1;
                if (b.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$3$1", f = "OutOfProcessWebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.z4$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0345z4.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0345z4.this.new b((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0345z4 c0345z4 = C0345z4.this;
                this.a = 1;
                if (C0345z4.a(c0345z4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            F f = C0345z4.this.i;
            if (f != null) {
                f.c = true;
                return Unit.INSTANCE;
            }
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
            throw null;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessOpened$1", f = "OutOfProcessWebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.z4$c */
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0345z4.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0345z4.this.new c((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (com.plaid.internal.C0345z4.a(r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r5.c(r4) == r0) goto L15;
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
                I7 b = C0345z4.this.b();
                this.a = 1;
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
            C0345z4 c0345z4 = C0345z4.this;
            this.a = 2;
        }
    }

    public C0345z4(H1 h1) {
        h1.getClass();
        C0234n0 c0234n0 = (C0234n0) h1;
        this.a = (InterfaceC0298u2) c0234n0.n.get();
        this.b = (C6) c0234n0.o.get();
        this.c = (InterfaceC0320w6) c0234n0.t.get();
        this.d = (B6) c0234n0.q.get();
        this.e = (InterfaceC0347z6) c0234n0.z.get();
        this.f = (z8) c0234n0.A.get();
        C0243o0 c0243o0 = c0234n0.b;
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
        this.g = (i8) create;
        this.h = (I7) c0234n0.s.get();
        this.i = (F) c0234n0.u.get();
        this.k = new C0336y4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0345z4 c0345z4, ContinuationImpl continuationImpl) {
        A4 a4;
        int i;
        A a2;
        c0345z4.getClass();
        if (continuationImpl instanceof A4) {
            a4 = (A4) continuationImpl;
            int i2 = a4.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                a4.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = a4.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a4.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InterfaceC0320w6 interfaceC0320w6 = c0345z4.c;
                    if (interfaceC0320w6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                        throw null;
                    }
                    a4.a = c0345z4;
                    a4.d = 1;
                    obj = interfaceC0320w6.b(a4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0345z4 = a4.a;
                    SafeTrace.throwOnFailure(obj);
                }
                a2 = (A) obj;
                if (a2 != null) {
                    C0095a6.a.e(C0095a6.a, "No Out Of Process Polling Info Available");
                    InterfaceC0298u2 interfaceC0298u2 = c0345z4.a;
                    if (interfaceC0298u2 != null) {
                        interfaceC0298u2.a(new LinkExit(null, null, 3, null));
                        return Unit.INSTANCE;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("linkController");
                    throw null;
                }
                F f = c0345z4.i;
                if (f == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
                    throw null;
                }
                CloseableCoroutineScope viewModelScope = ViewModelKt.getViewModelScope(c0345z4);
                C0336y4 c0336y4 = c0345z4.k;
                c0336y4.getClass();
                c0345z4.j = JobKt.launch$default(viewModelScope, null, null, new D(f, a2, c0336y4, null), 3);
                return Unit.INSTANCE;
            }
        }
        a4 = new A4(c0345z4, continuationImpl);
        Object obj2 = a4.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a4.d;
        if (i != 0) {
        }
        a2 = (A) obj2;
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0345z4 c0345z4, ContinuationImpl continuationImpl) {
        B4 b4;
        int i;
        InterfaceC0347z6 interfaceC0347z6;
        c0345z4.getClass();
        if (continuationImpl instanceof B4) {
            b4 = (B4) continuationImpl;
            int i2 = b4.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                b4.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = b4.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b4.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InterfaceC0347z6 interfaceC0347z62 = c0345z4.e;
                    if (interfaceC0347z62 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                        throw null;
                    }
                    b4.a = c0345z4;
                    b4.d = 1;
                    obj = interfaceC0347z62.a(b4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        LinkResult linkResult = (LinkResult) b4.a;
                        SafeTrace.throwOnFailure(obj);
                        return linkResult;
                    }
                    c0345z4 = (C0345z4) b4.a;
                    SafeTrace.throwOnFailure(obj);
                }
                Channel$Message.SDKResult sDKResult = (Channel$Message.SDKResult) obj;
                LinkResult a2 = sDKResult == null ? T6.a(sDKResult) : null;
                interfaceC0347z6 = c0345z4.e;
                if (interfaceC0347z6 != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                    throw null;
                }
                b4.a = a2;
                b4.d = 2;
                return interfaceC0347z6.b(b4) == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        b4 = new B4(c0345z4, continuationImpl);
        Object obj2 = b4.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b4.d;
        if (i != 0) {
        }
        Channel$Message.SDKResult sDKResult2 = (Channel$Message.SDKResult) obj2;
        if (sDKResult2 == null) {
        }
        interfaceC0347z6 = c0345z4.e;
        if (interfaceC0347z6 != null) {
        }
    }

    public final void c() {
        Job job = this.j;
        if (job != null) {
            job.cancel(null);
        }
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3);
    }

    public final I7 b() {
        I7 i7 = this.h;
        if (i7 != null) {
            return i7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0327x4 c0327x4;
        int i;
        String str;
        if (continuationImpl instanceof C0327x4) {
            c0327x4 = (C0327x4) continuationImpl;
            int i2 = c0327x4.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0327x4.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0327x4.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0327x4.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C6 c6 = this.b;
                    if (c6 != null) {
                        c0327x4.c = 1;
                        obj = c6.a(c0327x4);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return null;
                }
                return str;
            }
        }
        c0327x4 = new C0327x4(this, continuationImpl);
        Object obj2 = c0327x4.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0327x4.c;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return null;
    }

    public static final void a(C0345z4 c0345z4, LinkResult linkResult) {
        c0345z4.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(c0345z4), null, null, new C0318w4(c0345z4, null), 3);
        InterfaceC0298u2 interfaceC0298u2 = c0345z4.a;
        if (interfaceC0298u2 != null) {
            interfaceC0298u2.a(linkResult);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
            throw null;
        }
    }

    public final void a(boolean z) {
        if (z) {
            JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3);
        }
        if (this.j != null) {
            F f = this.i;
            if (f != null) {
                f.c = true;
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
                throw null;
            }
        }
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3);
    }

    public final void a() {
        LinkExit linkExit = new LinkExit(null, null, 3, null);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0318w4(this, null), 3);
        InterfaceC0298u2 interfaceC0298u2 = this.a;
        if (interfaceC0298u2 != null) {
            interfaceC0298u2.a(linkExit);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
            throw null;
        }
    }
}
