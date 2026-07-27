package com.onesignal.core.internal.permissions;

import E7.p;
import I0.j;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import O7.o0;
import R7.k;
import R7.l;
import R7.n;
import T7.o;
import android.app.Activity;
import androidx.lifecycle.C0497e;
import androidx.lifecycle.S;
import kotlin.jvm.internal.i;
import q7.InterfaceC4936e;
import q7.v;
import t0.AbstractC5051n;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class h extends S {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final k _shouldFinish;
    private final k _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final l shouldFinish;
    private final l waiting;
    private final InterfaceC4936e requestPermissionService$delegate = com.bumptech.glide.e.q(e.INSTANCE);
    private final InterfaceC4936e preferenceService$delegate = com.bumptech.glide.e.q(d.INSTANCE);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.initialize(null, null, null, this);
        }
    }

    public static final class c extends x7.h implements p {
        final /* synthetic */ int[] $grantResults;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ boolean $shouldShowRationaleAfter;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, int[] iArr, h hVar, boolean z8, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$permissions = strArr;
            this.$grantResults = iArr;
            this.this$0 = hVar;
            this.$shouldShowRationaleAfter = z8;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new c(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                this.label = 1;
                if (AbstractC0399y.f(500L, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            String[] strArr = this.$permissions;
            boolean z9 = false;
            if (strArr.length == 0) {
                z8 = false;
            } else {
                String str = strArr[0];
                int[] iArr = this.$grantResults;
                boolean z10 = !(iArr.length == 0) && iArr[0] == 0;
                if (z10) {
                    this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, AbstractC5051n.f("USER_RESOLVED_PERMISSION_", str), Boolean.TRUE);
                } else {
                    z9 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
                }
                this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, AbstractC5051n.f("PROMPTED_PERMISSION_", str), Boolean.TRUE);
                z8 = z9;
                z9 = z10;
            }
            this.this$0.executeCallback(z9, z8);
            ((n) this.this$0._shouldFinish).F(Boolean.TRUE);
            return v.f40183a;
        }
    }

    public static final class d extends i implements E7.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // E7.a
        public final F4.b invoke() {
            return (F4.b) l4.g.a().getService(F4.b.class);
        }
    }

    public static final class e extends i implements E7.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.core.internal.permissions.impl.a invoke() {
            return (com.onesignal.core.internal.permissions.impl.a) l4.g.a().getService(com.onesignal.core.internal.permissions.impl.a.class);
        }
    }

    public h() {
        Boolean bool = Boolean.FALSE;
        n nVar = new n(bool);
        this._shouldFinish = nVar;
        this.shouldFinish = new j(12, nVar);
        n nVar2 = new n(bool);
        this._waiting = nVar2;
        this.waiting = new j(12, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean z8, boolean z9) {
        v vVar;
        String str = this.permissionRequestType;
        if (str != null) {
            f callback = getRequestPermissionService().getCallback(str);
            if (callback == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: ".concat(str));
            }
            if (z8) {
                callback.onAccept();
            } else {
                callback.onReject(z9);
            }
            vVar = v.f40183a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            com.onesignal.debug.internal.logging.b.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            ((n) this._shouldFinish).F(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F4.b getPreferenceService() {
        return (F4.b) this.preferenceService$delegate.getValue();
    }

    private final com.onesignal.core.internal.permissions.impl.a getRequestPermissionService() {
        return (com.onesignal.core.internal.permissions.impl.a) this.requestPermissionService$delegate.getValue();
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(h hVar, String[] strArr, int[] iArr, boolean z8, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = false;
        }
        hVar.onRequestPermissionsResult(strArr, iArr, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String str, boolean z8) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        String f6 = AbstractC5051n.f("USER_RESOLVED_PERMISSION_", str);
        boolean shouldShowRequestPermissionRationaleBeforeRequest = getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest();
        if (shouldShowRequestPermissionRationaleBeforeRequest && !z8) {
            getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f6, Boolean.TRUE);
            return false;
        }
        F4.b preferenceService = getPreferenceService();
        String f9 = AbstractC5051n.f("PROMPTED_PERMISSION_", str);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = preferenceService.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f9, bool);
        if ((bool2 != null ? bool2.booleanValue() : false) && !shouldShowRequestPermissionRationaleBeforeRequest && !z8) {
            getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f6, Boolean.TRUE);
            return true;
        }
        Boolean bool3 = getPreferenceService().getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f6, bool);
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return false;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    public final l getShouldFinish() {
        return this.shouldFinish;
    }

    public final l getWaiting() {
        return this.waiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, InterfaceC5133d interfaceC5133d) {
        b bVar;
        Object obj;
        int i;
        h hVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = str;
                    bVar.L$2 = str2;
                    bVar.label = 1;
                    obj = l4.g.b(activity, bVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    hVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) bVar.L$2;
                    str = (String) bVar.L$1;
                    hVar = (h) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((n) hVar._shouldFinish).F(Boolean.TRUE);
                    return Boolean.FALSE;
                }
                if (str != null && str2 != null) {
                    hVar.permissionRequestType = str;
                    hVar.androidPermissionString = str2;
                    return Boolean.TRUE;
                }
                ((n) hVar._shouldFinish).F(Boolean.TRUE);
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC5133d);
        obj = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.S
    public void onCleared() {
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean z8) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        ((n) this._waiting).F(Boolean.FALSE);
        InterfaceC0397w interfaceC0397w = (InterfaceC0397w) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC0397w == null) {
            o0 o0Var = new o0();
            V7.e eVar = F.f2551a;
            Object tagIfAbsent = setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0497e(com.bumptech.glide.e.w(o0Var, o.f3162a.f2693x)));
            kotlin.jvm.internal.h.d(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
            interfaceC0397w = (InterfaceC0397w) tagIfAbsent;
        }
        AbstractC0399y.o(interfaceC0397w, null, new c(permissions, grantResults, this, z8, null), 3);
    }

    public final void recordRationaleState(boolean z8) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(z8);
    }

    public final void resetWaitingState() {
        ((n) this._waiting).F(Boolean.FALSE);
    }

    public final boolean shouldRequestPermission() {
        if (((Boolean) ((n) this._waiting).E()).booleanValue()) {
            return false;
        }
        ((n) this._waiting).F(Boolean.TRUE);
        return true;
    }
}
